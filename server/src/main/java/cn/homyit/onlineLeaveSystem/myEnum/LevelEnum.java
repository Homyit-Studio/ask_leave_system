package cn.homyit.onlineLeaveSystem.myEnum;

import com.baomidou.mybatisplus.annotation.IEnum;
import lombok.Getter;

@Getter
public enum LevelEnum implements IEnum<Integer> {
    STUDENT(0,"学生"),
    INSTRUCTOR(1,"班主任"),
    SECRETARY(2,"负责人"),
    DEAN(3,"院长"),
    LOOK(-10,"查看")
    ;


    LevelEnum(int value, String desc){
        this.value = value;
        this.desc = desc;
    }

    public static LevelEnum getEumByCode(int value){
        for(LevelEnum enumItem: LevelEnum.values()) {
            if(enumItem.getValue().intValue() ==value) {
                return enumItem;
            }
        }
        return null;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public String toString(){
        return desc;
    }


    private final Integer value;
//    @JsonValue
    private final String desc;
}
