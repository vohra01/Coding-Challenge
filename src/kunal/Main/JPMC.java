package kunal.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class JPMC {

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);

        List<Integer> inputs = new ArrayList<>();
        String line = in.readLine(); // to read multiple integers line
        String[] strs = line.trim().split("\\s+");
        for (int i = 0; i < 2; i++) {
            inputs.add(Integer.parseInt(strs[i]));
        }

        int fileSize = inputs.get(0);
        int transferTime = inputs.get(1);


        Double speed = (fileSize * 1000) / (transferTime * 1.04858);
        System.out.println(speed);

        float bytesPerSec = fileSize / transferTime;
        System.out.println(bytesPerSec + " Bps");
        float kbPerSec = bytesPerSec / (1024);
        System.out.println(kbPerSec + " KBps ");
        float mbPerSec = kbPerSec / (1024);
        System.out.println(mbPerSec + " MBps ");
        System.out.println((int) (mbPerSec) + "Bla Bla");


    }
}
