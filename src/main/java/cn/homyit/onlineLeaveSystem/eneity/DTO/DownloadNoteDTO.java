package cn.homyit.onlineLeaveSystem.eneity.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;

import java.util.Date;

/**
 * @author 州牧
 * @description
 * @since 2022-05-13 10:33
 */
@Data
@Getter
public class DownloadNoteDTO {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date startTime;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date endTime;

    private  Long studentNumber;
    private  Long grade;
    private  Long classId;
}
