package fr.epita;

public class TestString {

    public static void main(String[] args) {
        String firstString = "Sample String";
        String secondString = "Second String";
        System.out.println("Testing concatenation");

        String concatResult = firstString + " " + secondString;
        System.out.println(concatResult);

        System.out.println("Testing replacement");
        concatResult = concatResult.replaceAll("St" , "**" );
        System.out.println(concatResult);
    }


}
