package com.yavuz.NewspaperApp.mapper;

import com.yavuz.NewspaperApp.dto.request.SubscriberSaveRequestDto;
import com.yavuz.NewspaperApp.dto.response.SubscriberFindAllResponseDto;
import com.yavuz.NewspaperApp.repository.entity.Subscriber;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ISubscriberMapper {
    ISubscriberMapper INSTANCE = Mappers.getMapper(ISubscriberMapper.class);

    Subscriber fromSubscriberSaveRequestDto(final SubscriberSaveRequestDto dto);
    SubscriberFindAllResponseDto fromSubscriber(final Subscriber subscriber);
}
