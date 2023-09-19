import java.awt.*;
import java.util.ArrayList;

public class BigRectLister
{
    public static void main(String[] args)
    {
        BigRectangleFilter bigRectangleFilter = new BigRectangleFilter();

        ArrayList<Rectangle> rectangleArrayList = new ArrayList<Rectangle>();
        rectangleArrayList.add(new Rectangle(5, 3));
        rectangleArrayList.add(new Rectangle(1,2));
        rectangleArrayList.add(new Rectangle(5,10));
        rectangleArrayList.add(new Rectangle(2,1));
        rectangleArrayList.add(new Rectangle(4,4));
        rectangleArrayList.add(new Rectangle(3,1));
        rectangleArrayList.add(new Rectangle(5,4));
        rectangleArrayList.add(new Rectangle(1,1));
        rectangleArrayList.add(new Rectangle(3,3));
        rectangleArrayList.add(new Rectangle(2,3));

        System.out.println("List of all rectangles:");
        for (Rectangle r: rectangleArrayList)
        {
            System.out.println(r);
        }
        System.out.println();

        System.out.println("List of the Rectangles with a Perimeter greater than 10:");
        for (Rectangle r : rectangleArrayList)
        {
            if(bigRectangleFilter.accept(r))
            {
                System.out.println(r);
            }
        }

    }
}
