package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TemperatureServiceTest {

    @Test
    public void shouldFindBetweenEnds() {
        TemperatureService service = new TemperatureService();

        int[] temps = {15, 20, 18, 34, 30};

        int expectedDay = 3;
        int actualDay = service.getMinDay(temps);

        Assertions.assertEquals(expectedDay, actualDay);
    }
}
