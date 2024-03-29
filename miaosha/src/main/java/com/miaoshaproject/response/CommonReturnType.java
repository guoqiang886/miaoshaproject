package com.miaoshaproject.response;

/**
 * @author guoqiang
 * @create 2020/5/26 - 15:04
 * 传给前端使用的通用的返回对象
 */
public class CommonReturnType {

    // 表明对应请求的返回处理结果"success"或"fail"
    private String status;
    // 若status为success，则data类返回前端需要的json数据
    // 若status为fail，则data内类用通用的错误码格式
    private Object data;

    // 定义一个通用的创建方法
    public static CommonReturnType create(Object result) {
        return CommonReturnType.create(result, "success");
    }

    public static CommonReturnType create(Object result, String status) {
        CommonReturnType type = new CommonReturnType();
        type.setStatus(status);
        type.setData(result);
        return type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
