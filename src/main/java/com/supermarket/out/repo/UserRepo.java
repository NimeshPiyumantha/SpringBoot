package com.supermarket.out.repo;

import com.supermarket.out.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Nimesh Piyumantha
 * @since : 0.1.0
 **/
public interface UserRepo extends JpaRepository<User, Integer> {
}
