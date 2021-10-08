package com.dojo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dojo.models.Answer;

@Repository
public interface AnswerRepository extends CrudRepository <Answer, Long> {

}
