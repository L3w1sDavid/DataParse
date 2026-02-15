package com.lewis.metadatacontroller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.util.Map;

@RestController

public class Controller {
    @PostMapping("/api/fileanalyse")
    public Map<String, Object> getFileMetadata(@RequestParam("upfile") MultipartFile file) {
        // FCC specifically requires: name, type, and size
        return Map.of(
                "name", file.getOriginalFilename(),
                "type", file.getContentType(),
                "size", file.getSize()
        );
    }
}
