package com.jwt.repo;

import com.jwt.entity.Book;
import com.jwt.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepoStore extends JpaRepository<Store,Long>
{

    Store getStoreById (Long id);
}
