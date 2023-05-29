package in.sagnikchakraborty.examples;

import in.sagnikchakraborty.beans.Person;
import in.sagnikchakraborty.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class GettingStarted {

    @Test
    public void imperativeApproach() throws IOException {
        // 1. Find people aged less or equal 18
        // 2. Then change implementation to find first 10 people
        List<Person> people = MockData.getPeople();
        List<Person> children = new ArrayList<>();
        int limit = 10;
        int counter = 0;

        for (Person person : people) {
            if (person.getAge() <= 18) {
                children.add(person);
                counter++;
                if (counter == limit) {
                    break;
                }
            }
        }

        children.forEach(System.out::println);
    }

    @Test
    public void declarativeApproachUsingStreams() throws Exception {
        List<Person> people = MockData.getPeople();
        List<Person> children = people
                .stream()
                .filter(person -> person.getAge() <= 18)
                .limit(10)
                .toList();
        children.forEach(System.out::println);
    }
}
