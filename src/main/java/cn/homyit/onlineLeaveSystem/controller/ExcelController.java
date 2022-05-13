package cn.homyit.onlineLeaveSystem.controller;

import cn.homyit.onlineLeaveSystem.eneity.DTO.DownloadNoteDTO;
import cn.homyit.onlineLeaveSystem.eneity.VO.Result;
import cn.homyit.onlineLeaveSystem.service.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

/**
 * @author 州牧
 * @description
 * @since 2022-05-05 20:05
 */
@RestController
@RequestMapping("/excel")
public class ExcelController {

    @Autowired
    private ExcelService excelService;

    @PostMapping("/upload")
    public Result upload(@RequestPart("file") MultipartFile file){
        excelService.upload(file);
        return Result.success();
    }

    @PostMapping("/uploadTeacher")
    public Result uploadTeacher(@RequestPart("file") MultipartFile file){
        excelService.uploadTeacher(file);
        return Result.success();
    }
/*不可返回值？很奇怪*/
    @PostMapping("/downloadNote")
    public void download(@RequestBody DownloadNoteDTO downloadNoteDTO,HttpServletResponse response){
        excelService.download(downloadNoteDTO,response);

    }



}