package com.asac.spring.domain;

import lombok.Builder;
import lombok.Data;
@Data
//private을 관리하는 메서드입니다.
//getter : 내부의 멤버변수에 저장된 값을 외부로 리턴
//setter : 외부로부터 데이터를 전달바아 멤버변수에 저장
public class Item {

    private Long id;
    private String name;
    private Long count;

    @Builder
    public Item(Long id,String name, Long count) {
        this.id = id;
        this.name = name;
        this.count = count;
    }

    public void updateItem(String name, Long count){
        this.name = name;
        this.count =count;
    }

}
