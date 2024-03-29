package cn.homyit.onlineLeaveSystem.entity.DO;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysStudentClassInfo implements Serializable {
  @TableId(type = IdType.AUTO)
  private Long id;
  private String majorAndClass;
  private Long gradeId;
  private Integer capacity;
  private String highUser;

  private Long deleted;

}
