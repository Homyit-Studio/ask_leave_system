<template>
	<view class="uni-data-menu">
		<uni-nav-menu :active="value" activeKey="value" :activeTextColor="activeTextColor" :uniqueOpened="uniqueOpened"
		 @select="onSelect">
			<uni-menu-sidebar :data="mixinDatacomResData"></uni-menu-sidebar>
			<slot></slot>
		</uni-nav-menu>
	</view>
</template>

<script>
	export default {
		data() {
			return {

			};
		},
		mixins: [uniCloud.mixinDatacom],
		props: {
			// 当前激活菜单的 url
			value: {
				type: String,
				default: 'PROCESSING'
			},
			// 当前激活菜单的文字颜色
			activeTextColor: {
				type: String,
				default: '#42B983'
			},
			// 是否只保持一个子菜单的展开
			uniqueOpened: {
				type: Boolean,
				default: false
			}
		},
		watch: {
			localdata: {
				handler(newval) {
					if (this.hasLocalData(newval)) {
						this.mixinDatacomResData = newval
					}
				},
				immediate: true
			}
		},
		created() {
			if (this.hasLocalData(this.localdata)) return
			this.load()
		},
		methods: {
			onSelect(menu) {
				this.$emit('select', menu)
				this.$emit('input', menu.value)
			},
			hasLocalData(value) {
				return Array.isArray(value) && value.length > 0
			},
			load() {
				if (this.mixinDatacomLoading == true) {
					return
				}
				this.mixinDatacomLoading = true

				this.mixinDatacomGet().then((res) => {
					this.mixinDatacomLoading = false
					const {
						data,
						count
					} = res.result
					this.mixinDatacomResData = data
				}).catch((err) => {
					this.mixinDatacomLoading = false
					this.mixinDatacomErrorMessage = err
				})
			}
		},
	}
</script>

<style>
.uni-data-menu{
	position: sticky;
	top: 10px;
}

</style>
