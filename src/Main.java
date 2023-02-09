public class Main {
    public static void main(String[] args) {
   double[] num = {1.34,1.44,1.52,-1.88,1.36,-4.54,7.48,2.41,3.78,-2.74,8.45,6.14,-5.75,8.45,-9.68};
    int numCount = 0;
    double allNum = 0.0;
    boolean check = false;

    for (double cast:num){
        if (cast<0){
            check = true;
        } else if (cast>0) {
            numCount++;
            allNum +=cast;
            System.out.println(cast);
        }
    }
        System.out.println("среднее арифметическое число" + allNum /numCount);

    }
}