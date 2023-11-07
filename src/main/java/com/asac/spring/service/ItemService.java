package com.asac.spring.service;

import com.asac.spring.domain.Item;
import com.asac.spring.dto.ItemDto;
import com.asac.spring.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class ItemService {

    private ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    //item 객체 생성 후 itemDto의 내용을 item에 저장
    public void saveItem(ItemDto itemDto){
       Item item = Item.builder()
               .name(itemDto.getName())
               .count(itemDto.getCount())
               .build();
       itemRepository.save(item); //itemRepository를 통해 item 저장
    }

    //itemRepository를 통해 id에 해당하는 item을 찾아서 반환
    public ItemDto findItemById(Long id){
        Item item = itemRepository.findById(id);

        return ItemDto.builder()
                .id(item.getId())
                .name(item.getName())
                .count(item.getCount())
                .build(); // itemDto 반환
    }

    //itmeRepository를 통해 모든 item을 찾아서 반환
    public List<ItemDto> findAllItem(){
       return itemRepository.findAll()
               .stream()
               .map(item ->
                 ItemDto.builder()
                         .id(item.getId())
                         .name(item.getName())
                         .count(item.getCount())
                         .build()
               ).toList();
    }

    public void updateItemById(Long id, ItemDto itemDto){

        Item findItem = itemRepository.findById(id); // itemRepository를 통해 id에 해당하는 item을 찾아서 반환
        findItem.updateItem(itemDto.getName(), itemDto.getCount()); // item의 내용을 수정

        itemRepository.updateById(id, findItem); // itemRepository를 통해 id에 해당하는 item을 찾아서 내용 수정


    }

    public void deleteItemById(Long id){
        itemRepository.deleteById(id); //itemRepository를 통해 id에 해당하는 item을 찾아서 삭제
    }

}
