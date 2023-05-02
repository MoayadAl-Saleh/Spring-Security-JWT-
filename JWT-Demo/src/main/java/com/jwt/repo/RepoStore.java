package com.jwt.repo;

import com.jwt.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoStore extends JpaRepository<Store,Long>
{
    Store getStoreById (Long id);
}
