package com.questionservice.question.mapper;

import com.questionservice.question.dto.QuestionDto;
import com.questionservice.question.model.Question;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface QuestionMapper {

    QuestionMapper INSTANCE = Mappers.getMapper(QuestionMapper.class);

    Question toDocument(QuestionDto questionDto);
    QuestionDto toDto(Question question);

}
