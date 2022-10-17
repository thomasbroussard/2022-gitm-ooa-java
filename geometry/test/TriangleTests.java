import fr.epita.geometry.datamodel.Triangle;

public class TriangleTests {

    public static void main(String[] args) {
        //given
        Triangle triangle = new Triangle(10, 15, 10,5);

        //when
        double area = triangle.getArea();

        //then
        if (area != 25){
            throw new AssertionError("expected result mismatch (got " + area + ", expected 25)");
        }else{
            System.out.println("TriangleTests.main : ok");
        }
    }
}
