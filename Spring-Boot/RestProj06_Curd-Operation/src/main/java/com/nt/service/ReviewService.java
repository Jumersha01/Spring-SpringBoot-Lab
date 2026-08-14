package com.nt.service;

import java.util.List;

import com.nt.entity.Review;

public interface ReviewService {
	String addReview(Review review);

	List<Review> getAllReview();

	Review getReviewById(long id);

	String updateReview(long id, Review review);

	String deleteReviewById(long id);
}
