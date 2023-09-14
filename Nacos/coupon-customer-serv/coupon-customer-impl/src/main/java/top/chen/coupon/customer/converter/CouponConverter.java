package top.chen.coupon.customer.converter;

import top.chen.coupon.customer.dao.entity.Coupon;
import top.chen.coupon.template.api.beans.CouponInfo;

public class CouponConverter {
    public static CouponInfo convertToCoupon(Coupon coupon){
        return CouponInfo.builder()
                .id(coupon.getId())
                .status(coupon.getStatus().getCode())
                .templateId(coupon.getTemplateId())
                .shopId(coupon.getShopId())
                .userId(coupon.getUserId())
                .template(coupon.getTemplateInfo())
                .build();
    }
}
