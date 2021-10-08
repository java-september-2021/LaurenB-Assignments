package com.dojo.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.dojo.models.Question;



@Component
public class TagValidator {
	
	public boolean supports(Class<?> clazz) {
		return Question.class.equals(clazz);
	}
	
	public void validate(Object target, Errors errors) {
		Question question = (Question) target;
		
		String[] tags = question.getTagsFromFront().split(", ");
		if(tags.length > 3) {
			errors.rejectValue("tagsFromFront", "too many", "Must have 3 tags or less");
		}
	}
}
