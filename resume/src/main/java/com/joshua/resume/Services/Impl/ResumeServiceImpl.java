package com.joshua.resume.Services.Impl;

import com.joshua.resume.Models.Resume;
import com.joshua.resume.Models.Section;
import com.joshua.resume.Repositories.ResumeRepository;
import com.joshua.resume.Requests.ResumeRequest;
import com.joshua.resume.Responses.ItemResponse;
import com.joshua.resume.Responses.ResumeResponse;
import com.joshua.resume.Responses.SectionResponse;
import com.joshua.resume.Services.ResumeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ResumeServiceImpl implements ResumeService {

    ResumeRepository resumeRepository;

    public ResumeServiceImpl(ResumeRepository resumeRepository) {
        this.resumeRepository = resumeRepository;
    }

    @Override
    public ResumeResponse createResume(ResumeRequest resumeRequest) {
        return this.mapToResumeResponse(resumeRepository.save(this.mapToResume(resumeRequest)));
    }

    private Resume mapToResume(ResumeRequest resumeRequest) {
        Resume resume = new Resume();
        resume.setName(resumeRequest.getName());
        resume.setSections(resumeRequest.getSections());
        return resume;
    }

    private ResumeResponse mapToResumeResponse(Resume resume) {
        ResumeResponse resumeResponse = new ResumeResponse();
        resumeResponse.setId(resume.getId());
        resumeResponse.setName(resume.getName());
        resumeResponse.setSections(resume.getSections());
        resumeResponse.setCreatedAt(resume.getCreatedAt());
        return resumeResponse;
    }


}
