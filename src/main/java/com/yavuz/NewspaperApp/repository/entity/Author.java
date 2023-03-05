package com.yavuz.NewspaperApp.repository.entity;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "tblauthor")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String email;
    @Column(length = 20,unique = true)
    private String username;
    @Column(length = 32)
    private String password;
    @Enumerated(EnumType.STRING)
    @Builder.Default
    private Status status = Status.ACTIVE;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Builder.Default
    private final LocalDateTime registerDate = LocalDateTime.now();
    @ElementCollection
    private List<Long> newsIds;
    @ElementCollection
    private List<Long> categoryIds; // authors are assumed to be able to publish news in multiple categories
}
