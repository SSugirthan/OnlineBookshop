package com.example.onlinebookshop_spring_boot.service.impl;

import com.example.onlinebookshop_spring_boot.models.OnlineBookShop;
import com.example.onlinebookshop_spring_boot.repository.OnlineBookShopRepository;
import com.example.onlinebookshop_spring_boot.service.WebService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WebServiceimpl implements WebService {

    private final OnlineBookShopRepository repository;

    public WebServiceimpl(OnlineBookShopRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<OnlineBookShop> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<OnlineBookShop> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public OnlineBookShop save(OnlineBookShop book) {
        return repository.save(book);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
