package com.designpattern.ssl;

/**
 * Created by wei on 2017/6/8 0008.
 */

import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.PrivateKey;

import sun.misc.BASE64Encoder;

public class SslKey {

    public static KeyStore getKeyStore(String keyStorePath, String password) throws Exception {
        FileInputStream is = new FileInputStream(keyStorePath);
        KeyStore ks = KeyStore.getInstance("JKS");
        ks.load(is, password.toCharArray());
        is.close();
        return ks;
    }

    public static PrivateKey getPrivateKey() {
        try {
            BASE64Encoder encoder = new BASE64Encoder();
            KeyStore ks = getKeyStore("E:\\Work\\证书\\生成无密码证书\\kserver.keystore", "123456");
            PrivateKey key = (PrivateKey) ks.getKey("kserver", "123456".toCharArray());
            String encoded = encoder.encode(key.getEncoded());
            System.out.println("-----BEGIN RSA PRIVATE KEY-----");
            System.out.println(encoded);
            System.out.println("-----END RSA PRIVATE KEY-----");
            return key;
        } catch (Exception e) {
            return null;
        }
    }

    public static void main(String[] args) {
        getPrivateKey();
    }
}