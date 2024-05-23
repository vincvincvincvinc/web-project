package fr.epsi.b32324c1.service;

import fr.epsi.b32324c1.entity.ImageEntity;
import fr.epsi.b32324c1.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageService {

    @Autowired
    private ImageRepository imageRepository;

    public List<ImageEntity> getAllImages() {
        return imageRepository.findAll();
    }

    public ImageEntity getImageById(Long id) {
        return imageRepository.findById(id).orElse(null);
    }

    public ImageEntity createImage(ImageEntity image) {
        return imageRepository.save(image);
    }

    public ImageEntity updateImage(Long id, ImageEntity image) {
        image.setId(id);
        return imageRepository.save(image);
    }

    public void deleteImage(Long id) {
        imageRepository.deleteById(id);
    }
}

