package com.yavuz.NewspaperApp.mapper;

import com.yavuz.NewspaperApp.dto.request.NewsSaveRequestDto;
import com.yavuz.NewspaperApp.dto.response.NewsFindAllResponseDto;
import com.yavuz.NewspaperApp.repository.entity.News;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface INewsMapper {
    INewsMapper INSTANCE = Mappers.getMapper(INewsMapper.class);

    News fromNewsSaveRequestDto(final NewsSaveRequestDto dto);
    NewsFindAllResponseDto fromNews(final News news);
}
