package com.asac.spring.controller;

import com.asac.spring.dto.ItemDto;
import com.asac.spring.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService){
        this.itemService = itemService;
    }

    @PostMapping("items")
    public void save(@RequestBody ItemDto itemDto){
        itemService.saveItem(itemDto);
    }

    @GetMapping("items/{id}")
    public ItemDto findItemById(@PathVariable Long id){
        return itemService.findItemById(id);
    }

    @GetMapping("items")
    public List<ItemDto> findAllItem(){
        return itemService.findAllItem();
    }

    @PatchMapping("items/{id}")
    public void updateItemById(@PathVariable Long id, @RequestBody ItemDto itemDto){
        itemService.updateItemById(id,itemDto);
    }

    @DeleteMapping("items/{id}")
    public void deleteItemById(@PathVariable Long id){
        itemService.deleteItemById(id);
    }

}
