package ru.erik182.utils;

import java.util.ArrayList;
import java.util.Base64;
import java.util.Enumeration;
import java.util.List;

public class AppUtils {

    public static List<?> getListFromEnum(Enumeration<?> enumeration) {
        List<Object> list = new ArrayList<>();
        while (enumeration.hasMoreElements()) {
            list.add(enumeration.nextElement());
        }
        return list;
    }

    public static String encodeBase64(String s) {
        return Base64.getEncoder().encodeToString(s.getBytes());
    }

    public static byte[] encodeBase64(byte[] bytes) {
        return Base64.getEncoder().encodeToString(bytes).getBytes();
    }

    public static String decodeBase64(String s) {
        return new String(Base64.getDecoder().decode(s.getBytes()));
    }
}
