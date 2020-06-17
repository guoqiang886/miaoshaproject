package com.miaoshaproject.error;

/**
 * @author guoqiang
 * @create 2020/5/26 - 15:20
 */
public interface CommonError {

    public int getErrCode();

    public String getErrMsg();

    public CommonError setErrMsg(String errMsg);

}
