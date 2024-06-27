package com.joshua.resume.Responses;

import com.joshua.resume.Models.Item;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TextResponse {
    private Long id;
    private String content;
    private boolean isBold;
    private boolean isItalic;
    private int fontSize;
    private Item item;
}
