package Code.Hashen;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HashMapTest {

    private HashMapStudent map;

    @Before
    public void initMap(){
        map = new HashMapStudent(5);
    }

    @Test
    public void putTest00(){
        Student a = new Student(1,"Hubert", 1);
        map.put(a);
        Assert.assertEquals(1, map.getSize());
    }

    @Test
    public void putTest01(){
        Student a = new Student(1,"Hubert", 1);
        map.put(a);
        map.delete(a.matrNr);
        Assert.assertEquals(0, map.getSize());
        Assert.assertEquals(true, map.getDeleted()[a.matrNr%map.cap]);
    }

    @Test
    public void putTest02(){
        Student a = new Student(1,"Hubert", 1);
        map.put(a);
        Student b = new Student(2,"Hildegard", 3);
        map.put(b);
        Assert.assertEquals(2, map.getSize());
    }


}
