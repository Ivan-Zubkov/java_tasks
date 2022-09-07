package lab_1;

public class MyMath {
    private int a = 0;
    public  int fact(){
        int f = a;
        for (int i = a - 1; i >= 1; i--) {
            f *= i;
        }
        return f;
    }

    public MyMath(){}
    public MyMath(int a){
        this.a = a;
    }

    public void setA(int a){
        this.a = a;
    }
    public int getA(){
        return a;
    }
}
