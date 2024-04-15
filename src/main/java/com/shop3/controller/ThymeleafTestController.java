package com.shop3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop3.dto.ItemDto;

import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.List;



@Controller
@RequestMapping(value="/thymeleaf")
public class ThymeleafTestController {

    @GetMapping(value = "/ex01")
    public String thymeleafExample01(Model model){
        model.addAttribute("data", "예제1");
        return "thymeleafEx/ex01";
    }

    @GetMapping(value = "/ex04")
    public String thymeleafExample04(Model model){

        List<ItemDto> itemDtoList = new ArrayList<>();

        for(int i=1;i<=10;i++){

            ItemDto itemDto = new ItemDto();
            itemDto.setItemDetail("상품 상세 설명"+i);
            itemDto.setItemNm("테스트 상품" + i);
            itemDto.setPrice(1000*i);
            itemDto.setRegTime(LocalDateTime.now());

            itemDtoList.add(itemDto);
        }

        model.addAttribute("itemDtoList", itemDtoList);
        return "thymeleafEx/ex04";
    }
    @GetMapping(value = "/ex07")
    public String thymeleafExample07(){
        return "thymeleafEx/ex07";
    }






}