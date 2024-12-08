package org.example.lab1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
public class HealthCheckController {

    @GetMapping("/healthcheck")
    public Map<String, Object> healthCheck() {
        return Map.of(
                "status", "OK",
                "timestamp", LocalDateTime.now().toString()
        );
    }
}
