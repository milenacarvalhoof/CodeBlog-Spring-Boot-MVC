package com.spring.codeblog.service.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeblogRepository;
import com.spring.codeblog.service.CodeblogService;

@Service
public class CodeblogServiceImpl implements CodeblogService{

	private CodeblogRepository repository;
	
	public CodeblogServiceImpl(CodeblogRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Post> findAll() {
		return repository.findAll();
	}

	@Override
	public Post findById(long id) {
		return repository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return repository.save(post);
	}

}
