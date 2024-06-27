package com.joshua.resume.Requests;

import com.joshua.resume.Models.Section;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResumeRequest {
    @NotEmpty(message = "Name is required")
    @Size(max = 100, message = "Name must be less than or equal to 100 characters")
    private String name;
    private List<Section> sections;
}
