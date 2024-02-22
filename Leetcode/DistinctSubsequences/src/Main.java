import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "rabbbit";
        String t = "rabbit";
        System.out.println(subsequenceCount(s, t));
    }

    static int subsequenceCount(String s, String t){
        // Your code here
        int sN = s.length();
        int tN = t.length();

        int MEMO[][] = new int[sN][tN];
        for(int row[] : MEMO){
            Arrays.fill(row, -1);
        }
        return f(sN - 1, tN - 1, s, t, MEMO);
    }

    static int f(int sN, int tN, String s, String t, int MEMO[][]){
        if(tN < 0){
            return 1;
        }

        if(sN - tN < 0){
            return 0;
        }

        if(MEMO[sN][tN] != -1){
            return MEMO[sN][tN];
        }

        int leave = f(sN - 1, tN, s, t, MEMO);

        int take = 0;
        if(s.charAt(sN) == t.charAt(tN)){
            take = f(sN - 1, tN - 1, s, t, MEMO);
        }

        return MEMO[sN][tN] = take + leave;
    }
}