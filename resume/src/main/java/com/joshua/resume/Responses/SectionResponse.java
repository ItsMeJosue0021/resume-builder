package com.joshua.resume.Responses;

import com.joshua.resume.Models.Item;
import com.joshua.resume.Models.Resume;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SectionResponse {
    private Long id;
    private String title;
    private int sectionOrder;
    private Resume resume;
    private List<Item> items;
}
