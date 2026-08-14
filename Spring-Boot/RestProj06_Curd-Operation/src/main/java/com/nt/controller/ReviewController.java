package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Review;
import com.nt.service.ReviewServiceImp;

@RestController
@RequestMapping("/review-api")
public class ReviewController {
    
	@Autowired
	private ReviewServiceImp service;
	
	@PostMapping("/reviews")
	public String addReview(@RequestBody Review review) {
		String message = service.addReview(review);
		return message;
	}

	@GetMapping("/reviews")
	ResponseEntity<List<Review>> getAllReview(){
		List<Review> reviewList = service.getAllReview();
		return new ResponseEntity<List<Review>>(reviewList ,HttpStatus.OK);
	}
	
	@GetMapping("reviews/{id}")
	public ResponseEntity<Review> getById(@PathVariable long id){
		Review r = service.getReviewById(id);
		
		return new ResponseEntity<Review>(r,HttpStatus.OK);
	}
	
	@PutMapping("/reviews/{id}")
	public String updateReview(@PathVariable long id,@RequestBody Review review) {
		
		return service.updateReview(id, review);
	}
	
	@DeleteMapping("/reviews/{id}")
	public String delete(@PathVariable long id) {
		return service.deleteReviewById(id);
	}
	
}
