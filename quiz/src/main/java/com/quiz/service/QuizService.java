package com.quiz.service;

import java.util.List;

import com.quiz.model.Quiz;

public interface QuizService {
	
	public Quiz createQuiz(Quiz quiz);
	public List<Quiz> getByUsername(String username);
	public List<Quiz> getAllQuiz();

}
