package com.example.onlinebookshop_spring_boot.service;

import com.example.onlinebookshop_spring_boot.models.OnlineBookShop;
import java.util.List;
import java.util.Optional;

public interface WebService {
    List<OnlineBookShop> findAll();
    Optional<OnlineBookShop> findById(Long id);
    OnlineBookShop save(OnlineBookShop book);
    void deleteById(Long id);
}
