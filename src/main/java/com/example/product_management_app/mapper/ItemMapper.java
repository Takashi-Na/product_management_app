package com.example.product_management_app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.product_management_app.domain.Item;

@Mapper
public interface ItemMapper {
  List<Item> findAll();

  Item findOne(Long id);

  void save(Item item);

  void update(Item item);

  void delete(Long id);
}