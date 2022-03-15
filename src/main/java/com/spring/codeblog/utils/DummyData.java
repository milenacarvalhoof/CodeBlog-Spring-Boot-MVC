package com.spring.codeblog.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeblogRepository;

@Component
public class DummyData {
	
	private CodeblogRepository repository;

	public DummyData(CodeblogRepository repository) {
		this.repository = repository;
	}
	
	//@PostConstruct
	public void savePosts() {
		
		List<Post> postList = new ArrayList<>();
		
		Post post1 = new Post();
		post1.setAutor("Milena Carvalho");
		post1.setData(LocalDate.now());
		post1.setTitulo("Docker");
		post1.setTexto("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
		
		Post post2 = new Post();
		post2.setAutor("Milena Carvalho");
		post2.setData(LocalDate.now());
		post2.setTitulo("API REST");
		post2.setTexto("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
	
		postList.add(post1);
		postList.add(post2);
		
		for (Post post : postList) {
			Post postSaved = repository.save(post);
			System.out.println(postSaved.getId());
		}
	}

}
