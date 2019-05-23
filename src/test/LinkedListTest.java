package test;

import classes.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import linkedlistsimple.CustomList;

public class LinkedListTest {

    private CustomList<Person> customList;

    @Before
    public void ini() {
        customList = new CustomList();
    }

    @Test
    public void addTest() {
        customList.add(new Person());
        customList.add(new Person());
        customList.add(new Person());
        int actualResult = customList.getSize();
        int expectResult = 3;
        Assert.assertEquals(actualResult, expectResult);
    }

    @Test
    public void addInPositionTest() {
        customList.add(new Person());
        customList.add(new Person());
        customList.add(new Person());
        customList.add(2, new Person());
        int actualResult = customList.getSize();
        int expectResult = 4;
        Assert.assertEquals(actualResult, expectResult);
    }

    @Test
    public void addFistTest() {
        customList.add(new Person());
        customList.add(new Person());
        customList.add(new Person());
        customList.addFirst(new Person());
        int actualResult = customList.getSize();
        int expectResult = 4;
        Assert.assertEquals(actualResult, expectResult);
    }

    @Test
    public void removeTest() {
        customList.add(new Person());
        customList.add(new Person());
        customList.add(new Person());
        customList.remove(1);
        int actualResult = customList.getSize();
        int expectResult = 2;
        Assert.assertEquals(actualResult, expectResult);
    }

    @Test
    public void removeFirstTest() {
        customList.add(new Person());
        customList.add(new Person());
        customList.add(new Person());
        customList.removeFirst();
        int actualResult = customList.getSize();
        int expectResult = 2;
        Assert.assertEquals(actualResult, expectResult);
    }

    @Test
    public void removeLastTest() {
        customList.add(new Person());
        customList.add(new Person());
        customList.add(new Person());
        customList.removeLast();
        int actualResult = customList.getSize();
        int expectResult = 2;
        Assert.assertEquals(actualResult, expectResult);
    }

    @Test
    public void getValueTest() {

        customList.add(new Person());
        Person person = new Person();
        person.setFirstName("Marco");
        customList.add(person);
        customList.add(new Person());
        customList.removeLast();
        Person actualResult = (Person) customList.getValue(2);
        Person expectResult = new Person();
        expectResult.setFirstName("Marco");
        Assert.assertEquals(actualResult.getFirstName(), expectResult.getFirstName());
    }
}
