package com.questionservice.question.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Set;

@Builder
@Data
@Document
public class Question {

    @Id
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
