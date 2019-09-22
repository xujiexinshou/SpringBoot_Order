package com.imooc.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
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
    private Integer productStatus;

    /* 类目编号 */
    private Integer categoryType;
}
