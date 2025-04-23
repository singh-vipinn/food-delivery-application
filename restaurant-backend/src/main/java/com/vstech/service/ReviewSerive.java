package com.vstech.service;

import java.util.List;

import com.vstech.Exception.ReviewException;
import com.vstech.model.Review;
import com.vstech.model.User;
import com.vstech.request.ReviewRequest;

public interface ReviewSerive {
	
    public Review submitReview(ReviewRequest review,User user);
    public void deleteReview(Long reviewId) throws ReviewException;
    public double calculateAverageRating(List<Review> reviews);
}
