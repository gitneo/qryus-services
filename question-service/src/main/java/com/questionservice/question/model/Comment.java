package com.questionservice.question.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Builder
@Data
@Document
public class Comment {

    @Id
    private String id;
    private String commentatorId;
    private String body;
    private int votes;
    private LocalDateTime date;

}
