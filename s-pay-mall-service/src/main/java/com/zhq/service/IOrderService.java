package com.zhq.service;

import com.zhq.domain.req.ShopCartReq;
import com.zhq.domain.res.PayOrderRes;

/**
 * @author zhq123
 * @date 2025/3/2 16:09
 */
public interface IOrderService {
    PayOrderRes createOrder(ShopCartReq shopCartReq) throws Exception;
}
