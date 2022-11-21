import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new ArrayDeque<>();
        List<Person> people = generateClients();
        for (Person person : people) {
            queue.offer(person);
        }

        while (!queue.isEmpty()) {
            Person person = queue.poll();
            System.out.println("Посетитель " + person.getName() + " " + person.getSurname() + " прокатился");
            person.spendTicket();
            if (person.hasMoreTicket()) {
                queue.offer(person);
            }
        }
    }

    public static List<Person> generateClients() {
        List<Person> ans = new ArrayList<>();
        ans.add(new Person("Алексей", "Иванов", 1));
        ans.add(new Person("Александр", "Петров", 5));
        ans.add(new Person("Андрей", "Сидоров", 1));
        return ans;
    }
}