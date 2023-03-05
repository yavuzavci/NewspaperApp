package com.yavuz.NewspaperApp.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentSaveRequestDto {
    private Long subscriberId;
    private Long newsId;
    private String comment;
}
