package com.joshua.resume.Controllers;

import com.joshua.resume.Requests.ResumeRequest;
import com.joshua.resume.Responses.ResumeResponse;
import com.joshua.resume.Services.ResumeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/resume")
public class ResumeController {

    ResumeService resumeService;

    public ResumeController(ResumeService resumeService) {
        this.resumeService = resumeService;
    }

    @PostMapping("/")
    public ResponseEntity<ResumeResponse> createResume(@RequestBody ResumeRequest resumeRequest) {
        return new ResponseEntity<>(resumeService.createResume(resumeRequest), HttpStatus.CREATED);
    }
}

