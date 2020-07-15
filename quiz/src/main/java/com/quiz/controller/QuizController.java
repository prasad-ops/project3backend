package com.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.model.Quiz;
import com.quiz.service.QuizService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class QuizController  {
	
	@Autowired
	private QuizService service;

	@PostMapping("/takequiz")
	public Quiz createQuiz(@RequestBody Quiz quiz) {
		
		return service.createQuiz(quiz);
	}

	@GetMapping("/takequiz/result/{username}")
	public List<Quiz> getByUsername(@PathVariable("username") String username) {
		return service.getByUsername(username);
	}

	@GetMapping("/takequiz/results")
	public List<Quiz> getAllQuiz() {
		return service.getAllQuiz();
	}

}
