package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void stringInBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void bracketsInStringReturnsTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void onlyLeftBracketsReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]]"));
    }

    @Test
    public void opposingBracketsReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

}
