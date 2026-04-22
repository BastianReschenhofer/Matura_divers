package Code.Testen.ListTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ListTest {

    private LinkedList<Integer> l;

    @Before
    public void initList(){
        l = new LinkedList<>();
        l.append(10);
    }

    @BeforeClass
    public static void initBeforeClass() {
        System.out.println("Before Class");
    }


    @Test
    public void getTest00() {
        Assert.assertEquals(10, (int)l.get(0));
    }


    @Test(expected = NoSuchValueException.class)
    public void getTest01() {
        Assert.assertEquals(42, (int)l.get(1));
    }

    @Test
    public void appendTest00(){
        l.append(3);
        l.append(2);
        Assert.assertEquals(3, l.count());
        Assert.assertEquals(10, (int)l.get(0));
        Assert.assertEquals(3, (int)l.get(1));
        Assert.assertEquals(2, (int)l.get(2));
    }

    @Test
    public void appendTest01(){
        l.delete(0);
        l.append(1);
        Assert.assertEquals(1, (int)l.get(0));
    }

    @Test
    public void prependTest00(){
        l.prepend(1);
        Assert.assertEquals(2, l.count());
        Assert.assertEquals(1, (int)l.get(0));
    }

    @Test
    public void deletTest00(){
        l.delete(0);
        Assert.assertEquals(0, l.count());
    }

    @Test(expected = NoSuchValueException.class)
    public void deletTest01() {
        l.delete(3);
    }

    @Test
    public void deletTest02(){
        l.append(1);
        l.append(2);
        l.delete(0);
        Assert.assertEquals(2, l.count());
        Assert.assertEquals(2, (int)l.get(1));
        Assert.assertEquals(1, (int)l.get(0));
    }

    @Test
    public void deletTest03(){
        l.append(1);
        l.append(2);
        l.delete(1);
        Assert.assertEquals(2, l.count());
        Assert.assertEquals(2, (int)l.get(1));
        Assert.assertEquals(10, (int)l.get(0));
    }




}
