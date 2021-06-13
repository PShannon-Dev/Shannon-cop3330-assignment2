package ex28;

public class Calculator {
    private int[] numbers;

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int calctotal(){
        int total = 0;
        for(int i = 0; i < 5; i++){
            total += numbers[i];
        }
        return total;
    }
}
