package com.aiyundong.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ConfigService {

    //短信验证码
    /*------------start-----------*/
    @Value("${lequlai.msgclient.serviceurl1}")
    private String msgclient_serviceurl1;

    @Value("${lequlai.msgclient.serviceurl2}")
    private String msgclient_serviceurl2;

    @Value("${lequlai.msgclient.sn}")
    private String msgclient_sn;

    @Value("${lequlai.msgclient.password}")
    private String msgclient_password;

     /*------------end-----------*/

    public String getMsgclient_serviceurl1() {
        return msgclient_serviceurl1;
    }

    public void setMsgclient_serviceurl1(String msgclient_serviceurl1) {
        this.msgclient_serviceurl1 = msgclient_serviceurl1;
    }

    public String getMsgclient_serviceurl2() {
        return msgclient_serviceurl2;
    }

    public void setMsgclient_serviceurl2(String msgclient_serviceurl2) {
        this.msgclient_serviceurl2 = msgclient_serviceurl2;
    }

    public String getMsgclient_sn() {
        return msgclient_sn;
    }

    public void setMsgclient_sn(String msgclient_sn) {
        this.msgclient_sn = msgclient_sn;
    }

    public String getMsgclient_password() {
        return msgclient_password;
    }

    public void setMsgclient_password(String msgclient_password) {
        this.msgclient_password = msgclient_password;
    }
}
