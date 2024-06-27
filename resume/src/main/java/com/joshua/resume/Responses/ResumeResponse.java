package com.joshua.resume.Responses;

import com.joshua.resume.Models.Section;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResumeResponse {
    private long id;
    private String name;
    private Date createdAt;
    private List<Section> sections;
}
