//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int cx = x;
        int reversed = 0;
        while(cx != 0){
            reversed = reversed * 10 + cx % 10;
            cx = cx / 10;
        }
        if(reversed == x){
            return true;
        }
        return false;
    }

}