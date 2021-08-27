package com.codingdojo.authentication.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.authentication.models.Show;
import com.codingdojo.authentication.repositories.ShowRepository;

@Service
public class ShowService {
	
	@Autowired
	private final ShowRepository showrepository;
	
	public ShowService(ShowRepository showrepository) {
		this.showrepository = showrepository;
	}
	
	//crear show
	public Show createShow(Show show) {
		return showrepository.save(show);
	}
	

}
