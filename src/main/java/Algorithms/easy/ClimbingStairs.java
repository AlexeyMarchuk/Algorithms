package Algorithms.easy;

public class ClimbingStairs {

    public static int climbStairs(int n) {
        if(n == 1) {
            return 1;
        }
int r = 0;
        int n1 = 1;
        int n2 = 2;

        for(int i =3; i < n+1; i++){
            r = climbStairs(i) +r;
            return r;
        }

        return r;
    }
}
