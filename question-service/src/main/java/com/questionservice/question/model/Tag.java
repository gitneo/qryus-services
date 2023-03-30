package com.questionservice.question.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Data
@Document
public class Tag {
    @Id
    private String id;
    private String description;
}
