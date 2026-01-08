package com.example.nasda.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "forbidden_words")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ForbiddenWordEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer wordId;

    @Column(unique = true, nullable = false)
    private String word;
}