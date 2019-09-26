package com.imooc.sell.VO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/*
*  http 请求返回的最外层对象
* */
@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultVO<T> {

    /*错误码 */
    private Integer code;

    /* 提示信息 */
    private String msg = new String();

    /* 数据 */
    private T data;
}
