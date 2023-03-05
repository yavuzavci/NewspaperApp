package com.yavuz.NewspaperApp.mapper;

import com.yavuz.NewspaperApp.dto.request.AuthorSaveRequestDto;
import com.yavuz.NewspaperApp.dto.response.AuthorFindAllResponseDto;
import com.yavuz.NewspaperApp.repository.entity.Author;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IAuthorMapper {
    IAuthorMapper INSTANCE = Mappers.getMapper(IAuthorMapper.class);

    Author fromAuthorSaveRequestDto(final AuthorSaveRequestDto dto);
    AuthorFindAllResponseDto fromAuthor(final Author author);
}
