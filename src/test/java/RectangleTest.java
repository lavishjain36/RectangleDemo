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

    @Test
    public void testPerimeterForLengthAsValuedSides(){
        int length = -2;
        int breadth = 3;
        Rectangle obj = new Rectangle(length,breadth);
        int expectedPerimeter = 2;

        assertEquals(expectedPerimeter,obj.perimeterofRectangle());
    }

    @Test
    public void testPerimeterForBreadthAsValuedSides(){
        int length = 2;
        int breadth = -3;
        Rectangle obj = new Rectangle(length,breadth);
        int expectedPerimeter = -2;

        assertEquals(expectedPerimeter,obj.perimeterofRectangle());
    }
    @Test
    public void testPerimeterForBothSidesAsValuedSides(){
        int length = -2;
        int breadth = -3;
        Rectangle obj = new Rectangle(length,breadth);
        int expectedPerimeter = -10;

        assertEquals(expectedPerimeter,obj.perimeterofRectangle());
    }

    @Test
    public void testPerimeterForLengthValuedZero(){
        int length = 0;
        int breadth = 4;
        Rectangle obj = new Rectangle(length,breadth);
        int expectedPerimeter = 8;

        assertEquals(expectedPerimeter,obj.perimeterofRectangle());
    }
    @Test
    public void testPerimeterForBreadthValuedZero(){
        int length = 4;
        int breadth = 0;
        Rectangle obj = new Rectangle(length,breadth);
        int expectedPerimeter = 8;

        assertEquals(expectedPerimeter,obj.perimeterofRectangle());
    }
    @Test
    public void testPerimeterForBothSidesValuedZero(){
        int length = 0;
        int breadth = 0;
        Rectangle obj = new Rectangle(length,breadth);
        int expectedPerimeter = 0;

        assertEquals(expectedPerimeter,obj.perimeterofRectangle());
    }
}
