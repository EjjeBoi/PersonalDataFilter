import java.util.List;
import java.util.stream.Collectors;

public class PersonDataFilter {

    public static List<Person> filterByWaterCount(List<Person> persons, int waterCount) {
        return persons.stream()
                .filter(person -> person.getWaterCount() > waterCount)
                .collect(Collectors.toList());
    }

    public static List<Person> filterByGasCount1(List<Person> persons, int gasCount1) {
        return persons.stream()
                .filter(person -> person.getGasCount1() > gasCount1)
                .collect(Collectors.toList());
    }

    public static List<Person> filterByGasCount2(List<Person> persons, int gasCount2) {
        return persons.stream()
                .filter(person -> person.getGasCount2() > gasCount2)
                .collect(Collectors.toList());
    }

    public static List<Person> filterByElectroCount1(List<Person> persons, int electroCount1) {
        return persons.stream()
                .filter(person -> person.getElectroCount1() > electroCount1)
                .collect(Collectors.toList());
    }

    public static List<Person> filterByElectroCount2(List<Person> persons, int electroCount2) {
        return persons.stream()
                .filter(person -> person.getElectroCount2() > electroCount2)
                .collect(Collectors.toList());
    }
}