import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static final String LEFT_BRACKET = "(";
    public static final String RIGHT_BRACKET = ")";
    public static final String EMPTY = "";
    private Stack<String> bStack = new Stack<>();
    String[] strAfterSplit;
    String str="";

    public void inputString (){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao bieu thuc de kiem tra : ");
        str = input.nextLine();
        String[] strAfterSplit;
    }

    public void splitString() {
        strAfterSplit = str.split("");
    }
    public boolean bStackIsEmpty() {
        if (bStack.size() == 0)
            return true;
        return false;
    }

    public boolean isWell() {
        splitString();
        boolean conclude = false;

        for (String character : strAfterSplit) {
            boolean isLeftBracket = character.equals(LEFT_BRACKET);
            boolean isRightBracket = character.equals(RIGHT_BRACKET);

            if (isLeftBracket) {
                bStack.push(character);
            } else if (isRightBracket) {
                if (bStackIsEmpty()) {
                    return false;
                }
                String existLeftBracket = bStack.pop();
                if (existLeftBracket.equals(EMPTY)) {
                    return false;
                }
            }
        }
        if (bStackIsEmpty()){
            conclude = true;
        }
      return conclude;
    }

    public void displayCheckResult() {
        if (isWell()) {
            System.out.println("Well");
        } else {
            System.out.println("Fail");
        }
    }
}
