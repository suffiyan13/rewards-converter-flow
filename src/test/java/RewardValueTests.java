import main.java.RewardValue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import main.java.RewardValue; // Import the RewardValue class from the correct package
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        RewardValue rewardValue = new RewardValue(milesValue, true);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }



    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100.0;
        RewardValue rewardValue = new RewardValue(cashValue);
        double expectedMilesValue = cashValue / 0.0035;
        double actualMilesValue = rewardValue.getMilesValue();

        assertEquals(expectedMilesValue, actualMilesValue, 0.001);
    }

    public class RewardsConverterTest {

        @Test
        void convert_from_miles_to_cash() {
            int milesValue = 10000;
            double expectedCashValue = milesValue * 0.0035;

            RewardValue rewardValue = new RewardValue(milesValue);
            double actualCashValue = rewardValue.getCashValue();

            assertEquals(expectedCashValue, actualCashValue, 0.001);
        }
    }

}
