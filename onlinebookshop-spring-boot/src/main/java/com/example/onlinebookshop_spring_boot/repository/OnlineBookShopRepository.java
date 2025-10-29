package com.example.onlinebookshop_spring_boot.repository;

import com.example.onlinebookshop_spring_boot.models.OnlineBookShop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineBookShopRepository extends JpaRepository<OnlineBookShop, Long> {
}
