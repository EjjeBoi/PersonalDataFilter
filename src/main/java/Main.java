import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // Создаем список объектов Person, считанных из файла "data"
        String separator = File.separator;
        List<Person> persons = PersonReader.read("C:\\Users\\RedmiBook\\IdeaProjects\\PersonalDataFilter\\src\\info");
        // Фильтруем список, оставляя только объекты с waterCount > 100
        List<Person> filteredPersons = PersonDataFilter.filterByWaterCount(persons, 100);
        // Выводим отфильтрованный список на экран
        filteredPersons.forEach(System.out::println);
    }
}