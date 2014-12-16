package com.tengniu.p2p;


import org.apache.commons.codec.binary.Base64;

import java.util.Date;

public class Encrypt {
    public static void main(String[] args) {
        encrypt(args[0]);
    }

    private static void encrypt(String arg) {
        String encryptAsBase64 = Base64.encodeBase64String((arg + ":" + new Date().getTime()).getBytes());
        String encodeBase64String = Base64.encodeBase64String((encryptAsBase64 + ":" + new Date().getTime()).getBytes());
        System.out.printf(encodeBase64String);
    }
}
