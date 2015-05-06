import java.util.Stack;

public class Brackets {

    /* This class have method which checks brackets within text are correctly nested.
       Method return true or false
    */

    public boolean check(String text){

        Stack<Character> stack = new Stack<Character>();

        String openBrackets = "({[";
        String closeBrackets =")}]";

        for (char chr : text.toCharArray()) {

            // if char in string equals one of the open bracket char --> add this char to stack and checking next char in string
            if (openBrackets.indexOf(chr) != -1) {
                stack.add(chr);
                continue;
            }

            // if char not equals anyone of the close brackets chars --> checking next char in string
            if (closeBrackets.indexOf(chr) == -1) continue;

            char bracket;

            // take char from a not empty stack, if stack empty return false
            if (!stack.empty()) {
                bracket = stack.pop();
            } else return false;

            // if next bracket does not close bracket from stack --> return false
            if (openBrackets.indexOf(bracket) != closeBrackets.indexOf(chr)){
                return false;
            }
        }
        return stack.empty();
    }



}
