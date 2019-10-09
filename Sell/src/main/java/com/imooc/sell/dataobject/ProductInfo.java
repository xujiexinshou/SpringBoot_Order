package com.imooc.sell.dataobject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.imooc.sell.enums.ProductStatusEnum;
import com.imooc.sell.utils.serializer.EnumUtil;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@DynamicUpdate
public class ProductInfo {

    /**商品Id */
    @Id
    private String productId;

    /** 商品名字 */
    private String productName;

    /* 商品价格 */
    private BigDecimal productPrice;

    /* 商品库存 */
    private Integer productStock;

    /* 商品描述 */
    private String productDescription;

    /* 小图 */
    private String productIcon;

    /* 状态 0正常 1下架 */
    private Integer productStatus =ProductStatusEnum.UP.getCode();

    /* 类目编号 */
    private Integer categoryType;

    /*创建时间*/
    private Date createTime;

    /*修改时间*/
    private Date updateTime;

    @JsonIgnore
    public ProductStatusEnum getProductStatusEnum() {
        return EnumUtil.getByCode(productStatus, ProductStatusEnum.class);
    }
}
