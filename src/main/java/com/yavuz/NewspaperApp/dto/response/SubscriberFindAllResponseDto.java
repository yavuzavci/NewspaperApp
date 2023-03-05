package com.yavuz.NewspaperApp.dto.response;

import com.yavuz.NewspaperApp.repository.entity.Gender;
import com.yavuz.NewspaperApp.repository.entity.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubscriberFindAllResponseDto {
    private String name;
    private String surname;
    private String username;
    private Gender gender;
    private Status status;
}
