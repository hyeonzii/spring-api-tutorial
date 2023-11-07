package com.asac.spring.dto;

import lombok.Builder;
import lombok.Data;

//데이터를 주고받을 때 사용
@Data
public class ItemDto {

    private Long id;
    private String name;
    private Long count;

    @Builder
    public ItemDto(Long id,String name, Long count){
        this.id = id;
        this.name = name;
        this.count = count;
    }

}
