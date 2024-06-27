package com.joshua.resume.Responses;

import com.joshua.resume.Models.Section;
import com.joshua.resume.Models.Text;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemResponse {
    private Long id;
    private String header;
    private int itemOrder;
    private Section section;
    private List<Text> texts;
}
