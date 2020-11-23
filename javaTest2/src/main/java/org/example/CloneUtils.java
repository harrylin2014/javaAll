package org.example;

import java.io.*;
import java.util.HashMap;

/**
 * @author lxl
 * @date 2020/11/13 17:50
 */
public class CloneUtils {

    public static HashMap<String, CustomerMessage> sendData = new HashMap<String, CustomerMessage>();

    public static void main(String[] args) {
        HashMap<String, CustomerMessage> cdata = CloneUtils.clone(sendData);

        System.out.println("....");
    }

    public static <T extends Serializable> T clone(T obj) {
        T clonedObj = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(obj);
            oos.close();
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            clonedObj = (T) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return clonedObj;
    }
}
