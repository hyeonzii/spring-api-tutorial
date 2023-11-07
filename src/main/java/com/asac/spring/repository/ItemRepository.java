package com.asac.spring.repository;

import com.asac.spring.domain.Item;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ItemRepository {

    void save(Item item);
    Item findById(Long id);
    List<Item> findAll();
    void updateById(Long id , Item item);
    void deleteById(Long id);

}
