package com.yavuz.NewspaperApp.repository.entity;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "tblcomment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long subscriberId;
    private Long newsId;
    @Column(length = 2048)
    private String comment;
    @Enumerated(EnumType.STRING)
    @Builder.Default
    private Status status = Status.ACTIVE;
    @Builder.Default
    private final LocalDateTime date = LocalDateTime.now();
    /*
        included for possible future use,
        will be used to check if a comment is edited.
     */
    @Builder.Default
    private LocalDateTime lastUpdateDate = LocalDateTime.now();
    @Builder.Default
    private Double score = 0D; // included for possible future use
}
