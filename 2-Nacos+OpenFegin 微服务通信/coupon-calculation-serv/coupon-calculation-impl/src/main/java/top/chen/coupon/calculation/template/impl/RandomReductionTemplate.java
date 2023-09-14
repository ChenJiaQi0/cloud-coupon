package top.chen.coupon.calculation.template.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import top.chen.coupon.calculation.template.AbstractRuleTemplate;
import top.chen.coupon.calculation.template.RuleTemplate;

import java.util.Random;

@Component
@Slf4j
public class RandomReductionTemplate extends AbstractRuleTemplate implements RuleTemplate {
    @Override
    protected Long calculateNewPrice(Long totalAmount, Long shopAmount, Long quota) {
        //计算使用优惠卷之后的价格
        long maxBenefit = Math.min(shopAmount, quota);
        int reductionAmount = new Random().nextInt((int) maxBenefit);
        Long newCost = totalAmount - reductionAmount;
        log.debug("original price={}, new price={}", totalAmount, newCost);
        return newCost;
    }
}
