import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String s = "(((((*)(*)*))))((**)))))";
        System.out.println(checkValidString(s));
    }

    public static boolean checkValidString(String s) {
        Stack<Integer> wildCardStack = new Stack<>();

        Stack<Integer> openParenthesisStack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(c == '('){
                openParenthesisStack.push(i);
            } else if(c == '*') {
                wildCardStack.push(i);
            } else {
                if(!openParenthesisStack.isEmpty()){
                    openParenthesisStack.pop();
                } else if(!wildCardStack.isEmpty()){
                    wildCardStack.pop();
                } else {
                    return false;
                }
            }
        }

        while(!openParenthesisStack.isEmpty() && !wildCardStack.isEmpty()){
            if(openParenthesisStack.peek() < wildCardStack.peek()){
                openParenthesisStack.pop();
                wildCardStack.pop();
            } else {
                return false;
            }
        }

        return openParenthesisStack.isEmpty();
    }
}