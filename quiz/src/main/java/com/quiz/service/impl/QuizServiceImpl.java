package com.quiz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.dao.QuizDAO;
import com.quiz.model.Quiz;
import com.quiz.service.QuizService;

@Service
public class QuizServiceImpl implements QuizService{
	
	@Autowired
	private QuizDAO dao;

	@Override
	public Quiz createQuiz(Quiz quiz) {
		
		return dao.save(quiz);
	}

	



	@Override
	public List<Quiz> getByUsername(String username) {
		return dao.findByUsername(username);
	}





	@Override
	public List<Quiz> getAllQuiz() {
		return dao.findAll();
	}

}
