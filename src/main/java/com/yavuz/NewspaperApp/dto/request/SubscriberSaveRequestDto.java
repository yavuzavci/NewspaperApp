package com.yavuz.NewspaperApp.dto.request;

import com.yavuz.NewspaperApp.repository.entity.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubscriberSaveRequestDto {
    private String name;
    private String surname;
    private String email;
    private String username;
    private String password;
    private Gender gender;
}
