package top.chen.coupon.customer.api.beans;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RequestCoupon {
    /**
     * 用户Id
     */
    @NotNull
    private Long userId;

    /**
     * 券模板Id
     */
    @NotNull
    private Long couponTemplateId;
}
