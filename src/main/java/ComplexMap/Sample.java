package ComplexMap;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Sample {
    public static void main(String[] args) {
        List<MyObject> objects = Arrays.asList(
                new MyObject(BigInteger.valueOf(1), LocalDate.of(2023, 1, 1), "A"),
                new MyObject(BigInteger.valueOf(1), LocalDate.of(2023, 1, 1), "B"),
                new MyObject(BigInteger.valueOf(2), LocalDate.of(2023, 2, 1), "C"),
                new MyObject(BigInteger.valueOf(2), LocalDate.of(2023, 2, 1), "D"),
                new MyObject(BigInteger.valueOf(3), LocalDate.of(2023, 3, 1), "E")
        );


        Map<BigInteger, Map<LocalDate, List<MyObject>>> result = objects.stream()
                .collect(Collectors.groupingBy(MyObject::getBigInteger,
                        Collectors.groupingBy(MyObject::getLocalDate, Collectors.toList())));

        Map<BigInteger, Map<LocalDate, List<MyObject>>> result2 = objects.stream()
                .collect(Collectors.groupingBy(
                        MyObject::getBigInteger,
                        Collectors.toMap(
                                MyObject::getLocalDate,
                                date -> new ArrayList<>(Collections.singletonList(date)),
                                (list1, list2) -> (list2)
                        )
                ));

        result.forEach((bigInteger, dateListMap) -> {
            System.out.println("BigInteger: " + bigInteger);
            dateListMap.forEach((localDate, objectsList) -> {
                System.out.println("LocalDate: " + localDate);
                System.out.println("Objects: " + objectsList);
            });
        });

        result2.forEach((bigInteger, dateListMap) -> {
            System.out.println("BigInteger: " + bigInteger);
            dateListMap.forEach((localDate, objectsList) -> {
                System.out.println("LocalDate: " + localDate);
                System.out.println("Objects: " + objectsList);
            });
        });
    }
}

class MyObject {
    private final BigInteger bigInteger;
    private final LocalDate localDate;
    private final String data;


    public MyObject(BigInteger bigInteger, LocalDate localDate, String data) {
        this.bigInteger = bigInteger;
        this.localDate = localDate;
        this.data = data;
    }

    public BigInteger getBigInteger() {
        return bigInteger;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    @Override
    public String toString() {
        return "MyObject{" +
                "bigInteger=" + bigInteger +
                ", localDate=" + localDate +
                ", data='" + data + '\'' +
                '}';
    }
}
