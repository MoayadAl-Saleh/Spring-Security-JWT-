package com.jwt.repo;

import com.jwt.entity.UserStore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoRole extends JpaRepository<UserStore,Long>
{

}
