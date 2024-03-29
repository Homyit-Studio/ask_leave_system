package cn.homyit.onlineLeaveSystem.log;

import cn.homyit.onlineLeaveSystem.myEnum.ModuleEnum;
import cn.homyit.onlineLeaveSystem.myEnum.OperationEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用户操作日志注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface UserLog {
	/**
	 * 所属模块名
	 */
	ModuleEnum module();

	/**
	 * 操作标题
	 */
	String title();

	/**
	 * 操作类型
	 */
	OperationEnum type();
}