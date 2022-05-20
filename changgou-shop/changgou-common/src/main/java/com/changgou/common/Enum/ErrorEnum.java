package com.changgou.Enum;


import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * TODO
 *
 * @author liuht26262@yunrong.cn
 * @version V3.0
 * @description
 * @since 2022/5/20 15:02
 */
@Getter
@AllArgsConstructor
public enum ErrorEnum {
    /** 描述 */
    ERROR(20001,"失败"),
    LOGIN_ERROR(20002,"账号或密码错误"),
    ACCESS_ERROR(20003,"权限不足"),
    REMOT_ERROR(20004,"远程调用失败"),
    REP_ERROR(20005,"重复操作"),
    NOTFOUND_ERROR(20006,"没有对应的抢购数据"),
    ;

    /** 状态码 */
    private Integer code;

    /** 状态描述 */
    private String message;

    /**
     * 根据编码查找枚举
     *
     * @param code 编码
     * @return {@link ErrorEnum } 实例
     **/
    public static ErrorEnum find(String code) {
        for (ErrorEnum instance : ErrorEnum.values()) {
            if (instance.getCode()
                .equals(code)) {
                return instance;
            }
        }
        return null;
    }
}
