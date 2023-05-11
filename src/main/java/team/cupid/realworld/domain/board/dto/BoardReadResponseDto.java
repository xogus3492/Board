package team.cupid.realworld.domain.board.dto;

import lombok.*;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class BoardReadResponseDto {
    private Long boardId;
    private String title;
    private String content;
    private List<String> tags;
    private String writer;
    private LocalDateTime createdDate;
    private Boolean isGood;
    private Long goodCount;

    @Builder
    public BoardReadResponseDto(Long boardId, String title, String content, String writer, LocalDateTime createdDate, Boolean isGood, Long goodCount) {
        this.boardId = boardId;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.createdDate = createdDate;
        this.isGood = isGood == null ? false : isGood;
        this.goodCount = goodCount;
    }
}
