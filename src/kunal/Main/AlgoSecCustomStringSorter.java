package kunal.Main;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class AlgoSecCustomStringSorter {

    public static void main(String[] args) {
        List<String> list = asList("B", "G", "G", "B", "R", "G", "B", "L", "B", "G", "L");
        List<String> abc1 = asList("B", "G", "G", "B", "R", "G", "B", "L", "B", "G", "L");
        List<String> abc2 = asList("B", "L", "G", "G", "R", "G", "L", "L", "G", "G", "L");
        List<String> abc3 = asList("B", "L", "R", "R", "R", "G", "G", "L", "G", "L", "L");
        List<String> abc4 = asList("L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L");
        List<String> customOrderDefined = asList("R", "G", "L", "B");

        Map<String, Long> collect = abc3.stream().collect(groupingBy(identity(), counting()));
        String finalOutput = customOrderDefined.stream().map(it -> getValue(collect.get(it), it)).collect(Collectors.joining());

        System.out.println(finalOutput);
    }

    private static String getValue(Long aLong, String it) {
        if (Objects.isNull(aLong)) {
            return "";
        }
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < aLong; i++) {
            output.append(it);
        }
        return output.toString();
    }
}
