package com.company.examples.javaio.crypto;

import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Decrypt {

    private static final String KEY_SECRET = "MXN5B/4juS8=";

    private static final String ALGORITHM = "DES";

    public static void main(String[] args) {

        try {
            byte[] keyEncrypt = Base64.getDecoder().decode(KEY_SECRET);
            Key secretKey = new SecretKeySpec(keyEncrypt, ALGORITHM);
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            FileInputStream input = new FileInputStream("demoFiles/contentEncrypt.txt");
            CipherInputStream cipherInputStream = new CipherInputStream(input, cipher);
            InputStreamReader inputStreamReader = new InputStreamReader(cipherInputStream);
            BufferedReader reader = new BufferedReader(inputStreamReader);

            System.out.println(reader.readLine());

        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IOException e) {
            e.printStackTrace();
        }

    }

}
