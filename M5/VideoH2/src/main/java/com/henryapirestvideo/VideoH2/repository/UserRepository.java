package com.henryapirestvideo.VideoH2.repository;

import com.henryapirestvideo.VideoH2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
