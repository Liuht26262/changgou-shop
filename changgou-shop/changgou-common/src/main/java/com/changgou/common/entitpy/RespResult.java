package com.changgou.common.entitpy;

import java.io.Serializable;

import com.changgou.common.Enum.ErrorEnum;

import lombok.Data;

/**
 * TODO
 *
 * @author liuht26262@yunrong.cn
 * @version V3.0
 * @description 通用的结果返回类
 * @since 2022/5/20 14:55
 */
@Data
public class RespResult<T> implements Serializable {
    private static final long serialVersionUID = 1363977021939754826L;

    private boolean status;
    private Integer code;
    private String message;
    private T data;

    public RespResult(){};

    public RespResult(Integer code,T data){
        this.data = data;
        this.code = code;
    }

    public RespResult(boolean status,Integer code,String message){
        this.status = status;
        this.code = code;
        this.message = message;
    }

    public RespResult(boolean status, Integer code, String message, T data) {
        this.status = status;
        this.code = code;
        this.message = message;
        this.data = data;
    }


    public RespResult<T> success(T data){
        this.code = 20000;
        this.status = true;
        this.message = "操作成功";
        this.data = data;
        return this;
    }

    public RespResult error(ErrorEnum errorEnum){
        this.message = errorEnum.getMessage();
        this.code = errorEnum.getCode();
        this.status = false;
        this.data = null;
        return this;
    }

    public RespResult err(ErrorEnum errorEnum,boolean status){
        RespResult result = error(errorEnum);
        result.data = null;
        result.status = status;
        return result;
    }

}
