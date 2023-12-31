package top.chen.coupon.template.converter;


import top.chen.coupon.template.api.beans.CouponTemplateInfo;
import top.chen.coupon.template.dao.entity.CouponTemplate;

/**
 * @author mqxu
 * @date 2023/9/8
 * @description CouponTemplateConverter
 **/
public class CouponTemplateConverter {

    public static CouponTemplateInfo convertToTemplateInfo(CouponTemplate template) {

        return CouponTemplateInfo.builder()
                .id(template.getId())
                .name(template.getName())
                .desc(template.getDescription())
                .type(template.getCategory().getCode())
                .shopId(template.getShopId())
                .available(template.getAvailable())
                .rule(template.getRule())
                .build();
    }
}