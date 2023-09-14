package top.chen.coupon.calculation.template;

import top.chen.coupon.calculation.api.beans.ShoppingCart;

public interface RuleTemplate {
    ShoppingCart calculate(ShoppingCart settlement);
}
