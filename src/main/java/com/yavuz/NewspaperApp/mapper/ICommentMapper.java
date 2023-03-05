package com.yavuz.NewspaperApp.mapper;

import com.yavuz.NewspaperApp.dto.request.CommentSaveRequestDto;
import com.yavuz.NewspaperApp.dto.response.CommentFindAllResponseDto;
import com.yavuz.NewspaperApp.repository.entity.Comment;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ICommentMapper {
    ICommentMapper INSTANCE = Mappers.getMapper(ICommentMapper.class);

    Comment fromCommentSaveRequestDto(final CommentSaveRequestDto dto);
    CommentFindAllResponseDto fromComment(final Comment comment);
}
