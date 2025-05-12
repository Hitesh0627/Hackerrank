
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Solution{
    Stack<Character> st=new Stack<>();
    Queue<Character> q=new LinkedList<>();

    void pushCharacter(char c){
        st.push(c);
    }

    char popCharacter(){
        return st.pop();
    }

    void enqueueCharacter(char c){
        q.add(c);
    }

    char dequeueCharacter(){
        return q.poll();
    }
}
public class StackQueue {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        char[] s = input.toCharArray();

        Solution p = new Solution();

        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}