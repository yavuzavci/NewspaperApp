package com.yavuz.NewspaperApp.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewsSaveRequestDto {
    private Long authorId;
    private List<Long> categoryIds;
    private String title;
    private String content;
}
