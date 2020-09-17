package kunal.Main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import static java.util.stream.Collectors.toMap;

public class Strings {
    public static void main(String[] args) throws Exception {
//        String input = "a=\"0PN5J17HBGZHT7JJ3X82\", b=\"frJIUN8DYpKDtOLCwo/yzg=\"";
        String s = "00:01:07,400-234-090\n" +
                "00:05:01,701-080-080\n" +
                "00:05:00,400-234-090";


        String[] arr = s.split("\n");
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date reference = dateFormat.parse("00:00:00");

        Map<String, String> map1 = Arrays.asList(arr)
                .stream()
                .map(str -> str.split(","))
                .collect(toMap(str -> str[1], str -> str[0], (s1, s2) -> s1+","+s2));

        System.out.println("Map1 ::" + map1);

        Integer finalAmount = 0;
        Date date1 = new Date();

        for (String it : map1.values()) {
            long seconds1=0l;
            List<Long> overAllSeconds = new ArrayList<>();
            if (it.contains(",")){
                for (String it1 : it.split(",")) {
                    date1 = dateFormat.parse(it1);
                    seconds1 = seconds1+(date1.getTime() - reference.getTime()) / 1000L;
                }
                System.out.println("seconds1::"+seconds1);
            }

            Date date = dateFormat.parse(it);
            long seconds = (date.getTime() - reference.getTime()) / 1000L;

            if (seconds <= 300) {
                finalAmount = Math.toIntExact(seconds * 3);

            }

            System.out.println(seconds);
        }
    }
}
