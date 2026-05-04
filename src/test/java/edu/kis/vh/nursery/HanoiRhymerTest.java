package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class HanoiRhymerTest {

    @Test
    public void testHanoiRejectionLogic() {
        HanoiRhymer rhymer = new HanoiRhymer();

        rhymer.countIn(10); // Pierwsza liczba wchodzi zawsze
        rhymer.countIn(15); // Ta powinna zostać odrzucona (15 > 10)
        rhymer.countIn(5);  // Ta powinna wejść (5 < 10)
        rhymer.countIn(8);  // Ta powinna zostać odrzucona (8 > 5)

        // Sprawdzamy, czy licznik odrzuconych to 2
        Assert.assertEquals(2, rhymer.reportRejected());
    }
}