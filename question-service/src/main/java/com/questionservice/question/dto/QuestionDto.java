package com.questionservice.question.dto;

import com.questionservice.question.model.Comment;
import com.questionservice.question.model.Tag;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@AllArgsConstructor
public class QuestionDto {
    private String id;
    private String title;
    private String body;
    private String askedById;
    private Set<Comment> comment;
    private Set<Tag> tags;
    private LocalDateTime dateAsked;
    private int noOfModifications;
    private int noOfViews;
}
