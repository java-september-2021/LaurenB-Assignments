package com.dojo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dojo.models.Tag;

@Repository
public interface TagRepository extends CrudRepository <Tag, Long>{
	boolean existsBySubject(String subject);
	Tag findBySubject(String subject);
}
