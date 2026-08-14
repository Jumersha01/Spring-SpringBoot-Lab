package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Review;
import com.nt.exception.ReviewNotFoundException;
import com.nt.repository.ReviewRepository;

@Service
public class ReviewServiceImp implements ReviewService {

	@Autowired
	private ReviewRepository repo;

	@Override
	public String addReview(Review review) {
		long id = repo.save(review).getId();
		return "Review inserted with id: " + id;
	}

	@Override
	public List<Review> getAllReview() {
		List<Review> reviewList = repo.findAll();
		return reviewList;
	}

	@Override
	public Review getReviewById(long id) {
		Optional<Review> review = repo.findById(id);
		Review  r = null;
		
		try {
			if (review.isPresent())
				r= review.get();
			else
				throw new IllegalArgumentException("Invalid id:");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return r;

	}

	@Override
	public String updateReview(long id, Review review) {
		Optional<Review> rw = repo.findById(id);
		Review r = null;
		try {
			if (rw.isPresent()) {
				r=rw.get();
			    r.setMovieName(review.getMovieName());
			    r.setRating(review.getRating());
			    r.setRewieverName(review.getRewieverName());
			    r.setReviewComment(review.getRewieverName());
			    repo.save(r);
			    return  r.getId()+" Review is updated";
			}
			else
				throw new ReviewNotFoundException("Invalid id");
			
		}
		catch(Exception e) {
			return e.getMessage();
		}
	}

	@Override
	public String deleteReviewById(long id) {
		repo.deleteById(id);
		return  id+" Review is deleted";
		
	}

}
