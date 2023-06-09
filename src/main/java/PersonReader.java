import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonReader {

    public static List<Person> read(String data) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("C:\\Users\\RedmiBook\\IdeaProjects\\PersonalDataFilter\\src\\info"));
        List<Person> persons = new ArrayList<>();
        scanner.nextLine();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] fields = line.split("\\|");
            int id = Integer.parseInt(fields[0]);
            String name = fields[1];
            int waterCount = Integer.parseInt(fields[2]);
            int gasCount1 = Integer.parseInt(fields[3]);
            int gasCount2 = Integer.parseInt(fields[4]);
            int electroCount1 = Integer.parseInt(fields[5]);
            int electroCount2 = Integer.parseInt(fields[6]);
            // Создаем новый объект Person и добавляем его в список persons
            persons.add(new Person(id, name, waterCount, gasCount1, gasCount2, electroCount1, electroCount2));
        }
        scanner.close();
        return persons;
    }
}
