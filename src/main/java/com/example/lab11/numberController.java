package com.example.lab11;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class numberController {
    @GetMapping("/double")
    public int multiplyByTwo(@RequestParam("number") int n)
    {
        int answer= n*2;
        return answer;
    }
}
