package com.company.examples.javaio.crypto;

import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.io.*;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

public class Encrypt {

    private static final String ALGORITHM = "DES";
    public static final int KEY_SIZE = 56;

    public static void main(String[] args) {

        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(ALGORITHM);
            keyGenerator.init(KEY_SIZE, new SecureRandom());
            Key secretKey = keyGenerator.generateKey();
            System.out.println(Base64.getEncoder().encodeToString(secretKey.getEncoded()));

            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            FileOutputStream outputStream = new FileOutputStream("demoFiles/contentEncrypt.txt");
            CipherOutputStream cipherOutputStream = new CipherOutputStream(outputStream, cipher);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(cipherOutputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            String content = "Hello! I am a Java Developer";
            bufferedWriter.write(content);
            bufferedWriter.close();

        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IOException e) {
            e.printStackTrace();
        }

    }

}
