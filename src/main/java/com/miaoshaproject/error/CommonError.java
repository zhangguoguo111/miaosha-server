package com.miaoshaproject.error;

public interface CommonError {
    public int getErrCode();
    public String getRrrMsg();

    public CommonError setErrMsg(String errMsg);


}
