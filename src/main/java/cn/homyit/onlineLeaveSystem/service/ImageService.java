package cn.homyit.onlineLeaveSystem.service;

import cn.homyit.onlineLeaveSystem.eneity.DO.ImagesNote;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ImageService {
    void upload(MultipartFile file,Long id);

    void upload(MultipartFile[] files, Long id);

    List<ImagesNote> getImagesForNote(Long id);
}
