
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class TestPerson {

Person person = new Person();


    //test to check appraisal
    @Test
    public void personAge() {
       person.setAge(50);
       person.setFullname("Maxwell");

       Integer age = person.displayAge();
       assertEquals(50, age, 0.0);
    }


    @Test
    public void personName() {
        person.setAge(50);
        person.setFullname("Maxwell");

        String name = person.displayName();
        assertEquals("Maxwell", name);
    }


}

