package top.chen.coupon.calculation.service;

import org.springframework.web.bind.annotation.RequestBody;
import top.chen.coupon.calculation.api.beans.ShoppingCart;
import top.chen.coupon.calculation.api.beans.SimulationOrder;
import top.chen.coupon.calculation.api.beans.SimulationResponse;

public interface CouponCalculationService {
    /**
     * 订单价格计算
     * @param cart
     * @return
     */
    ShoppingCart calculateOrderPrice(@RequestBody ShoppingCart cart);

    /**
     * 订单价格试算
     * @param cart
     * @return
     */
    SimulationResponse simulateOrder(@RequestBody SimulationOrder cart);
}
