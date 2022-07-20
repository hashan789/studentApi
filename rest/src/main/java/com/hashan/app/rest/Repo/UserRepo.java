package com.hashan.app.rest.Repo;

import com.hashan.app.rest.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
