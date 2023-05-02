package com.jwt.service;

import com.jwt.entity.Book;
import com.jwt.entity.Store;
import com.jwt.repo.RepoBook;
import com.jwt.repo.RepoStore;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookstoresService
{
    private final RepoStore repoStore;
    private final RepoBook repoBook;


    public BookstoresService (RepoStore repoStore, RepoBook repoBook)
    {
        this.repoStore = repoStore;
        this.repoBook = repoBook;
    }

    public List<Store> getAllStore ()
    {
        return repoStore.findAll();
    }

    public Store getStoreById (Long id)
    {
        return repoStore.getStoreById(id);
    }

    public List<Book> getAllBook ()
    {
        return repoBook.findAll();
    }

    public List<Book> getBookById (Long id)
    {
        return repoStore.getStoreById(id).getBooks();
    }

}
