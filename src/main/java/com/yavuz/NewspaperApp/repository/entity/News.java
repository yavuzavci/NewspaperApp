package com.yavuz.NewspaperApp.repository.entity;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "tblnews")
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long authorId;
    @ElementCollection
    private List<Long> categoryIds; // news can have multiple categories
    @NotNull
    private String title;
    @Column(length = 2048)
    private String content;
    @Enumerated(EnumType.STRING)
    @Builder.Default
    private Status status = Status.ACTIVE;
    @Builder.Default
    private final LocalDateTime publishDate = LocalDateTime.now();
    @Builder.Default
    private LocalDateTime lastUpdateDate = LocalDateTime.now();
    @Builder.Default
    private Double score = 0D;

}
