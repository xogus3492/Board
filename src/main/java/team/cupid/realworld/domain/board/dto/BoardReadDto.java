package team.cupid.realworld.domain.board.dto;

import lombok.*;


import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class BoardReadDto {
    private Long id;
    private String title;
    private String content;
    private String name;
    private String createdDate;

    @Builder
    public BoardReadDto(Long id, String title, String content, String name, String createdDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.name = name;
        this.createdDate = createdDate;
    }
}