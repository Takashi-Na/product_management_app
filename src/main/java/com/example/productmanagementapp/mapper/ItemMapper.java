package com.example.productmanagementapp.mapper;

import java.util.List;

import com.example.productmanagementapp.domain.Item;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ItemMapper {
  List<Item> findAll();

  Item findOne(Long id);

  void save(Item item);

  void update(Item item);

  void delete(Long id);
}