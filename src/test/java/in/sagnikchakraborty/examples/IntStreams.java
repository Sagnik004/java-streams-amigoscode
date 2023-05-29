package in.sagnikchakraborty.examples;


import in.sagnikchakraborty.beans.Person;
import in.sagnikchakraborty.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.util.List;

public class IntStreams {

    @Test
    public void range() throws Exception {
    }

    // Loop through people using IntStream
    @Test
    public void rangeIteratingLists() throws Exception {
        List<Person> people = MockData.getPeople();
    }

    @Test
    public void intStreamIterate()  {
    }
}
