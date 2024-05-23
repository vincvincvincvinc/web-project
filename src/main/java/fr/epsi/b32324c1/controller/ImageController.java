package fr.epsi.b32324c1.controller;

import fr.epsi.b32324c1.entity.ImageEntity;
import fr.epsi.b32324c1.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/images")
public class ImageController {

    @Autowired
    private ImageService imageService;

    @GetMapping
    public List<ImageEntity> getAllImages() {
        return imageService.getAllImages();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ImageEntity> getImageById(@PathVariable Long id) {
        ImageEntity image = imageService.getImageById(id);
        return ResponseEntity.ok().body(image);
    }

    @PostMapping
    public ResponseEntity<ImageEntity> createImage(@RequestBody ImageEntity image) {
        ImageEntity createdImage = imageService.createImage(image);
        return ResponseEntity.created(URI.create("/api/images/" + createdImage.getId())).body(createdImage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ImageEntity> updateImage(@PathVariable Long id, @RequestBody ImageEntity image) {
        ImageEntity updatedImage = imageService.updateImage(id, image);
        return ResponseEntity.ok().body(updatedImage);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteImage(@PathVariable Long id) {
        imageService.deleteImage(id);
        return ResponseEntity.noContent().build();
    }
}

