package ex26;

public class PaymentCalculator {
    double balance;
    double payment;
    double apr;
    int months;

    public PaymentCalculator(double balance, double payment, double apr) {
        this.balance = balance;
        this.payment = payment;
        this.apr = apr/100;
        this.months = (calculateMonthsUntilPaidOff());
    }

    public int getMonths() {
        return months;
    }

    public int calculateMonthsUntilPaidOff(){
        double dailyRate = apr/365;
        double months = Math.ceil(Math.log10(1 + balance/payment * (1 - Math.pow((1 + dailyRate),30))) / Math.log10(1 + dailyRate) * ((double)-1/30));
        return (int) months;
    }
}
