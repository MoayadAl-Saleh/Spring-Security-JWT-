package com.jwt.repo;

import com.jwt.entity.UserStore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoUser extends JpaRepository<UserStore,String>
{
    UserStore findByUsername (String username);
}
