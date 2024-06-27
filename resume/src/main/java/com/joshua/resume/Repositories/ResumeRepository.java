package com.joshua.resume.Repositories;

import com.joshua.resume.Models.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumeRepository extends JpaRepository<Resume, Long> {
}
