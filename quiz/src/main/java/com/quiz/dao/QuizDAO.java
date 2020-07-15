package com.quiz.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.model.Quiz;

@Repository
public interface QuizDAO extends JpaRepository<Quiz, Integer>{
	
	public List<Quiz> findByUsername(String username);

}
