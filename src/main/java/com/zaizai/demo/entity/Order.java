package com.zaizai.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @description
 * @author luojiyuan
 * @date 2021-06-03 11:32
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private long orderId;
    private String orderNum;
    private LocalDateTime createTime;
}
