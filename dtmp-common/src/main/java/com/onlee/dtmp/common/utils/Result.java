package com.onlee.dtmp.common.utils;

import lombok.Data;

/**
 * 统一返回数据格式
 */
@Data
public class Result<T> {

    private int Code;

    private String message;

    private T data;

    private Result(int code, String message, T data) {
        this.Code = code;
        this.message = message;
        this.data = data;
    }

    public static<T> Result<T> success() {
        return new Result<>(200, "success", null);
    }

    public static<T> Result<T> success(T data) {
        return new Result<>(200, "success", data);
    }

    public static<T> Result<T> error(int code) {
        return new Result<>(code, "error", null);
    }

    public static<T> Result<T> error(int code, T data) {
        return new Result<>(code, "error", data);
    }

}
