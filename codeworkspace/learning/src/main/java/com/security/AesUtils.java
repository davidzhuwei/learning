package com.security;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
/**
 * Created by wei on 2017/7/3 0003.
 */
public class AesUtils {

    /** 待加密字符串 */
    private static String src="imooc security aes";


    /** 通过JDK实现AES对称加密 */
    public static void jdkAES(){
        try {
            // 生成KEY
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128);
            SecretKey secretKey = keyGenerator.generateKey();
            byte[] keyBytes = secretKey.getEncoded();

            // KEY 转换
            Key key = new SecretKeySpec(keyBytes,"AES");
            System.out.println("jdk aes key:"+ keyBytes.toString());

            // 加密
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE,key);
            byte[] result = cipher.doFinal(src.getBytes());
            System.out.println("jdk aes encrypt:"+ Base64.encodeBase64String(result));

            // 解密
            cipher.init(Cipher.DECRYPT_MODE,key);
            result=cipher.doFinal(result);
            System.out.println("jdk aes decrypt:"+ new String(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
