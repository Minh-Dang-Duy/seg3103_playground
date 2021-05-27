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

  @Test
  public void test1583(){
    assertEasterDate(null, EasterCalculator.easterDate(1583));
  }

  @Test
  public void test1731(){
    assertEasterDate("March 25", EasterCalculator.easterDate(1731));
  }

  @Test
  public void test1953(){
    assertEasterDate("April 5", EasterCalculator.easterDate(1953));
  }

  @Test
  public void test1954(){
    assertEasterDate("April 18", EasterCalculator.easterDate(1954));
  }

  @Test
  public void test1959(){
    assertEasterDate("March 29", EasterCalculator.easterDate(1959));
  }

  @Test
  public void test1980(){
    assertEasterDate("April 6", EasterCalculator.easterDate(1980));}

  @Test
  public void test1981(){
    assertEasterDate("April 19", EasterCalculator.easterDate(1981));}

  @Test
  public void test1986(){assertEasterDate("March 30", EasterCalculator.easterDate(1986));}

  @Test
  public void test2048(){ assertEasterDate("April 5", EasterCalculator.easterDate(2048));}

  @Test
  public void test2049(){ assertEasterDate("April 18", EasterCalculator.easterDate(2049));}

  @Test
  public void test2054(){    assertEasterDate("March 29", EasterCalculator.easterDate(2054));}

  @Test
  public void test2075(){assertEasterDate("April 7", EasterCalculator.easterDate(2075));}

  @Test
  public void test2076(){ assertEasterDate("April 19", EasterCalculator.easterDate(2076));}

  @Test
  public void test2077(){  assertEasterDate("April 11", EasterCalculator.easterDate(2077));}

  @Test
  public void test4123(){ assertEasterDate(null, EasterCalculator.easterDate(4123));}
  








}