package com.security;

import sun.plugin.liveconnect.SecurityContextHelper;

import java.util.Map;

/**
 * Created by zhuwei on 2017/7/3 0003.
 */
public class SingnUtils {

    /**
     * 签名
     * @param sParms
     * @return
     */
    public static String autograph(Map<String,String> sParms){
        String prestr= SecurityCore.createLinkString(sParms);
        String mySign=MD5.sign(prestr,SecurityConfig.key,SecurityConfig.input_charset);
        System.out.println("mySign:"+mySign);
        return mySign;
    }

    /**
     * 验证签名
     * @param param
     * @param sign
     * @return
     */
    public static boolean checkSign(Map<String,String> param,String sign){
        //过滤空值、sign与sign_type参数
        Map<String,String> sParamNew= SecurityCore.paraFilter(param);
        //获取待签名字符串
        String preSignStr= SecurityCore.createLinkString(sParamNew);
        boolean isSign=MD5.verify(preSignStr,sign,SecurityConfig.key, SecurityConfig.input_charset);
        return isSign;
    }


    public static void main(String[] args){
        Map param=new HashMap();
        param.put("tn_data","513746687623388781805");

        String sign=autograph(param);
        System.out.println("sign:"+sign);

       boolean isSign = checkSign(param,sign);
        System.out.println("isSign:"+isSign);
    }
}
