package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lxl
 * @date 2020/9/14 17:29
 */
public class TestFormate {

    public static void main(String args[]) throws ParseException {

        String param = "9-18";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm");
        Date newDate = simpleDateFormat.parse(param);

    }
}
