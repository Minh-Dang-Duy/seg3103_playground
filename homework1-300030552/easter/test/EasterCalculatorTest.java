import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class EasterCalculatorTest {

  @Test
  void div_show_usage() {
    assertEasterDate("April 4", EasterCalculator.easterDate(2021));
    assertEasterDate(null, EasterCalculator.easterDate(500000));
  }

  private void assertEasterDate(String expected, MyDate actual) {
    if (actual == null) {
      assertEquals(expected, actual);
    } else {
      assertEquals(expected, actual.toString());
    }
  }

}