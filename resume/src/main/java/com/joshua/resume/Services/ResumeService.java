package com.joshua.resume.Services;

import com.joshua.resume.Models.Resume;
import com.joshua.resume.Requests.ResumeRequest;
import com.joshua.resume.Responses.ResumeResponse;
import org.springframework.stereotype.Service;


public interface ResumeService {
    public ResumeResponse createResume(ResumeRequest resumeRequest);
}
