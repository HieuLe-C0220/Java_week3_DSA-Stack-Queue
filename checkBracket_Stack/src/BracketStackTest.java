public class BracketStackTest {
    public static void main(String[] args) {
        BracketStack bracketStack1 = new BracketStack(15);
        BracketStack bracketStack2 = new BracketStack(15);
        BracketStack bracketStack3 = new BracketStack(15);
        String expression1 = "s * (s – a) * (s – b) * (s – c)";
        String expression2 = "s * (s – a) * (s – b * (s – c)";
        String expression3 = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";
        char[] array1 = expression1.toCharArray();
        char[] array2 = expression2.toCharArray();
        char[] array3 = expression3.toCharArray();
        for (int i=0;i<30;i++) {
            bracketStack1.push(array1[i]);
            bracketStack2.push(array2[i]);
            bracketStack3.push(array3[i]);
        }
        System.out.println(bracketStack1.checkSymbol());
        System.out.println(bracketStack2.checkSymbol());
        System.out.println(bracketStack3.checkSymbol());
    }
}
