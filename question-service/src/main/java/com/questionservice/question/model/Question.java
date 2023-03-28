package com.questionservice.question.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Builder
@Data
@Document
public class Question {

    @Id
    private String id;
    private String title;
    private String body;
    private String askedById;
    private String comment; // TODO: 29/03/2023 change to array of comments
    private String tags; // TODO: 28/03/2023 Change to an array of tags
    private LocalDateTime dateAsked;
    private int noOfModifications;
    private int noOfViews;
}
