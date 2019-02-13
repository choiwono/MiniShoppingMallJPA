package my.examples.shoppingmall.service;

import lombok.RequiredArgsConstructor;
import my.examples.shoppingmall.domain.FileImage;
import my.examples.shoppingmall.repository.FileImageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FileImageService {
    private final FileImageRepository fileImageRepository;

    public List<FileImage> getFilesByProductId(Long id){
        return fileImageRepository.findByProductId(id);
    }
}
