package com.yavuz.NewspaperApp.dto.response;

import com.yavuz.NewspaperApp.repository.entity.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewsFindAllResponseDto {
    private Long authorId;
    private String title;
    private String content;
    private Status status;
    private LocalDateTime publishDate;
    private LocalDateTime lastUpdateDate;
    private Double score;
    
}
