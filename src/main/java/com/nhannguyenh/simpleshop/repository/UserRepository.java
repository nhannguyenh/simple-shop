package com.nhannguyenh.simpleshop.repository;

import com.nhannguyenh.simpleshop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
