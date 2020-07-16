package com.kiki.crm.pojo;

public class LayResult<T> {

    private Integer code;//返回码
    private String msg;//返回消息
    private Integer count;//
    private T data;//返回数据

    public LayResult(Integer code, Object data) {
        this.code = code;
        this.data = (T)data;
    }

    public LayResult(Integer code, String msg, Integer count, Object data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = (T)data;
    }

    public LayResult() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public T getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = (T)data;
    }
}
