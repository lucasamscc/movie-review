package com.project.moviereview.repository;

import com.project.moviereview.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
