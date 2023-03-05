package com.yavuz.NewspaperApp.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentFindAllResponseDto {
    private Long subscriberId;
    private Long newsId;
    private String comment;
    private LocalDateTime date;
    private Double score;
}
