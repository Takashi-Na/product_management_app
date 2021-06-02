package com.example.product_management_app.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Item {
  private Long id;
  
  @NotBlank(message = "商品名を入力してください")
  private String name;

  @Min(value = 10, message = "10以上の数値を入力してください")
  @Max(value = 10000, message = "10000以下の数字を入力してください")
  private float price;

  @Size(max = 50, message = "ベーダー名は50文字を超えないでください")
  private String vendor;

  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
}
