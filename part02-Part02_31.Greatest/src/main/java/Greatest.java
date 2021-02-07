
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int great = 0;
        if ((number1>number2 && number1>number3)||(number1==number2 && number1>number3)) {
            great = number1;
        }else if ((number2>number1 && number2>number3)||(number2==number1 && number2>number3)){
            great = number2;
        }else if ((number3>number1 && number3>number2)||(number3==number1 && number3>number2)){
            great = number3;
        }else if (number2==number3 && number2>number1){
            great = number2;
        }else{
            great = number1;
        }
        return great;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
