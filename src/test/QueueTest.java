package test;

import classes.Person;
import interfaces.IQueuse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import queues.Queue;

public class QueueTest {

    private IQueuse<Person> queue ;

    @Before
    public void ini() {
        queue = new Queue<Person>();
    }

    @Test
    public void addTest() {
        queue.add(new Person());
        queue.add(new Person());
        queue.add(new Person());
        int actualResult = queue.getSize();
        int expectResult = 3;
        Assert.assertEquals(actualResult, expectResult);
    }

    @Test
    public void peekTest() {
        Person person = new Person();
        person.setFirstName("Marco");

        queue.add(person);
        queue.add(new Person());
        queue.add(new Person());
        Person actualResult = queue.peek();
        String expectResult = "Marco";
        Assert.assertEquals(actualResult.getFirstName(), expectResult);
    }

    @Test
    public void removeTest() {
        Person person = new Person();
        person.setFirstName("Marco");

        queue.add(new Person());
        queue.add(person);
        queue.add(new Person());
        queue.add(new Person());
        queue.remove();

        int actualResult = queue.getSize();
        int expectResult = 3 ;
        Assert.assertEquals(actualResult, expectResult);
        Assert.assertEquals(queue.peek().getFirstName(), "Marco");
    }
}
