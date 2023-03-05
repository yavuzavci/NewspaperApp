package com.yavuz.NewspaperApp.dto.response;

import com.yavuz.NewspaperApp.repository.entity.Gender;
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
public class AuthorFindAllResponseDto {
    private String name;
    private String surname;
    private String username;
    private Gender gender;
    private Status status;
    private LocalDateTime registerDate;
}
