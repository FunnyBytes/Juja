package ua.com.juja.core;

/**
 * Created by DM on 29.09.2016.
 */
public class ExhangeMoneyTest {
    public static void main(String[] args) {
        int testMoney=5;
        int expectedValue=4;

        int actualValue=ExchangeMoney.exchangeAmountOfCoinsBrutForce(testMoney);

        if (actualValue!=expectedValue)
            throw new AssertionError("Money= "+ testMoney+ "  number of variants=  "+expectedValue + " but found " + actualValue);

        System.out.print("OK");
    }
}
