package com.agent.respparam;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * 接口响应类
 */
public class RespData {

    private RespHead head;

    @JSONField(serialzeFeatures= {SerializerFeature.WriteMapNullValue})
    private Object data;

    public RespData(){}
    
    public RespData(Object data, String msg, int code){
    	this.head = new RespHead();
    	this.head.setCode(code);
    	this.head.setMsg(msg);
    	this.data = data;
    }
    
    public RespHead getHead() {
        if (head == null) {
            head = new RespHead();
        }
        return head;
    }

    public void setHead(RespHead head) {
        this.head = head;
    }

    public Object getData() {
//        if (data == null) {
//            data = new Object();
//        }
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setMsg(String msg) {
        this.getHead().setMsg(msg);
    }

    public void setCode(int code) {
        this.getHead().setCode(code);
    }

    public static RespData success(String msg){
    	return new RespData(null,msg, ReturnCode.NORMAL_SUCC);
    }
    
    public static RespData success(Object data, String msg){
    	return new RespData(data,msg, ReturnCode.NORMAL_SUCC);
    }
    
    public static RespData fail(Object data, String msg, int code){
    	return new RespData(data,msg,code);
    }
    
   public static RespData fail(String msg, int code){
	   return new RespData(null,msg,code);
    }
}
