package com.jiuge.util;

import org.apache.commons.codec.digest.DigestUtils;

public class MD5Util {
    public static String md5(String password){
        return DigestUtils.md5Hex(password);
    }
    private static final String salt="1a2b3c4d";
    public static String inputPassToFormPass(String inputPass){
        String str=""+salt.charAt(0)+salt.charAt(2) + inputPass +salt.charAt(5) + salt.charAt(4);
        return md5(str);
    }
    public static String formPassToDBPass(String formPass,String salt){
        String str=""+salt.charAt(0)+salt.charAt(2) + formPass +salt.charAt(5) + salt.charAt(4);
        return md5(str);
    }
    public static String inputPassToDBPass(String inputPass,String dbSalt){
        String formPass=inputPassToFormPass(inputPass);
        String dbPass=formPassToDBPass(formPass,dbSalt);
        return dbPass;
    }

    public static void main(String[] args) {
        String password="123456";
        String dbPass = inputPassToDBPass(password, "1a2b3c4d");
        System.out.println(dbPass);
    }
}
