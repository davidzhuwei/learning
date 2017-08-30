package com.security;

import com.snowballtech.samsung.gateway.config.SamsungGatewayProperties;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zhuwei on 2017/7/3 0003.
 */
public class SecurityConfig {


    // 字符编码格式 目前支持 utf-8
    public static String input_charset = "utf-8";

    // 签名方式 不需修改
    public static String sign_type_refund = "MD5";

    //密钥
    public static String key="fdsdfdfgdfgdfg12124fsdswd";
}
