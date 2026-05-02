package Code.Datenstrukturen.Baum;

import org.junit.*;

public class TreeTest {

    Baum baum;

    @Before
    public void initTest(){
        baum = new Baum();
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("BeforeClass");
    }



    @Test
    public void insertTest00(){
        baum.insert(1);
        Assert.assertEquals(1,baum.root.getData());
    }
    @Test
    public void insertTest01(){
        baum.insert(5);
        baum.insert(2);
        Assert.assertEquals(2, baum.root.getLeft().getData());
        Assert.assertNull(baum.root.getRight());
    }
    @Test
    public void insertTest02(){
        baum.insert(5);
        baum.insert(10);
        Assert.assertEquals(10, baum.root.getRight().getData());
        Assert.assertNull(baum.root.getLeft());
    }
    @Test
    public void insertTest03(){
        baum.insert(5);
        baum.insert(5);
        Assert.assertEquals(5, baum.root.getData());
        Assert.assertEquals(5, baum.root.getRight().getData());
        Assert.assertNull(baum.root.getLeft());
    }
    @Test
    public void insertTest04(){
        baum.insert(5);
        baum.insert(4);
        baum.insert(3);
        Assert.assertEquals(3, baum.root.getLeft().getLeft().getData());
    }
    @Test
    public void insertTest05(){
        baum.insert(5);
        baum.insert(6);
        baum.insert(7);
        Assert.assertEquals(7, baum.root.getRight().getRight().getData());
    }

    @Test
    public void searchTest00(){
        baum.insert(5);
        Assert.assertEquals(5, baum.search(5).getData());
    }
    @Test
    public void searchTest01(){
        baum.insert(5);
        baum.insert(4);
        baum.insert(3);
        Assert.assertEquals(3, baum.search(3).getData());
    }
    @Test
    public void searchTest02(){
        baum.insert(5);
        baum.insert(6);
        baum.insert(7);
        Assert.assertEquals(7,baum.search(7).getData());
    }
    @Test
    public void searchTest03(){
        Assert.assertNull(baum.search(1));
    }
    @Test
    public void searchTest04(){
        baum.insert(3);
        Assert.assertNull(baum.search(4));
    }

    @Test
    public void countTest00(){
        Assert.assertEquals(0, baum.count());
    }
    @Test
    public void countTest01(){
        baum.insert(3);
        baum.insert(5);
        baum.insert(1);
        Assert.assertEquals(3, baum.count());
    }
}
