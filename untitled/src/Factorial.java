public class Factorial {
    private int n;

    public Factorial(int n_t){
        this.n = n_t;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public long Factorial1(){
        int res = 1;
        for (int i = 2; i <= this.n; i++)
            res *= i;
        return res;
    }

    public int[] Factorial2(){
        int[] array = new int[n + 1];
        array[0] = 1;
        array[1] = 1;
        int res = 1;
        for (int i = 2; i <= this.n; i++) {
            res *= i;
            array[i] = res;
        }
        return array;
    }
}
