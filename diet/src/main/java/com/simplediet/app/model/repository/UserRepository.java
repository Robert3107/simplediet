package com.simplediet.app.model.repository;

import com.simplediet.app.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

    User findByNameAndSurname(String name, String surname);

}
