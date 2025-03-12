package com.zhq.dao;

import com.zhq.domain.po.PayOrder;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhq123
 * @date 2025/3/2 16:08
 */
@Mapper
public interface IOrderDao {

    void insert(PayOrder payOrder);

    PayOrder queryUnPayOrder(PayOrder payOrder);

    void updateOrderPayInfo(PayOrder payOrder);
}
