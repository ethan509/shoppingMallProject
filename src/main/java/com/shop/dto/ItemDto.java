package com.shop.dto;

import com.shop.constant.ItemSellStatus;
import com.shop.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
public class ItemDto extends BaseEntity {
    private Long id;
    private String itemNm;
    private int price;
    private String itemDetail;
    private ItemSellStatus itemSellStatCd;
}
