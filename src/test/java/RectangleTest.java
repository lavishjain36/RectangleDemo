import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {


    @Test
    public  void  testAreaForPositiveValuedSide(){
        int length=2,breadth=3;
        Rectangle obj=new Rectangle(length,breadth);
        int expectedArea=6;
        assertEquals(expectedArea,obj.areaofRectangle());
    }

    @Test
    public  void  testAreaForLengthNegativeValuedSide(){
        int length=-2,breadth=3;
        Rectangle obj=new Rectangle(length,breadth);
        int expectedArea=-6;
        assertEquals(expectedArea,obj.areaofRectangle());
    }

    @Test
    public  void  testAreaForBreadthNegativeValuedSide(){
        int length=2,breadth=-3;
        Rectangle obj=new Rectangle(length,breadth);
        int expectedArea=-6;
        assertEquals(expectedArea,obj.areaofRectangle());
    }
    @Test
    public  void  testAreaForBothNegativeValuedSide(){
        int length=-2,breadth=-3;
        Rectangle obj=new Rectangle(length,breadth);
        int expectedArea=6;
        assertEquals(expectedArea,obj.areaofRectangle());
    }

    @Test
    public  void  testAreaForBothSidesValuedZero(){
        int length=0,breadth=0;
        Rectangle obj=new Rectangle(length,breadth);
        int expectedArea=0;
        assertEquals(expectedArea,obj.areaofRectangle());
    }
    @Test
    public  void  testAreaForLengthValuedZero(){
        int length=0,breadth=3;
        Rectangle obj=new Rectangle(length,breadth);
        int expectedArea=0;
        assertEquals(expectedArea,obj.areaofRectangle());
    }


}
