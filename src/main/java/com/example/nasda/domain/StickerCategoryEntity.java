package com.example.nasda.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "sticker_categories")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class StickerCategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer stickerCategoryId;

    @Column(length = 50, nullable = false)
    private String name;

    @Builder.Default
    private Boolean isActive = true;
}