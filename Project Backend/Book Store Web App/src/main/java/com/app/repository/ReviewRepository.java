package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.entities.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {
	@Query(value = "SELECT COUNT(*) FROM review", nativeQuery = true)
	 int totalReviews();
}
