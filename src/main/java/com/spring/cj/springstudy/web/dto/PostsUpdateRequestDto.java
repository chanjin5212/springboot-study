package com.spring.cj.springstudy.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto {
    private String title;
    private String content;
    private LocalDate date;

    @Builder
    public PostsUpdateRequestDto(String title, String content, LocalDate date) {
        this.title = title;
        this.content = content;
        this.date = date;
    }
}
