package com.simplediet.app.model.repository;

import com.simplediet.app.model.entity.DataUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataUserRepository extends JpaRepository<DataUser, Long> {

}
