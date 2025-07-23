package com.gui.springsecurity.repository;

import com.gui.springsecurity.entities.Role;
import com.gui.springsecurity.entities.Tweet;
import org.hibernate.query.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long> {
}
