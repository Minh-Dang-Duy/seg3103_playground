

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;


class DateTest {


  @Test
  void nextDate_sample() {
    Date d = new Date(2020,5,3);
    assertEquals(new Date(2020,5,4), d.nextDate());
  }

  @Test
  void nextDate_TC1() {
    Date d = new Date(1700,06,20);
    assertEquals(new Date(1700,06,21), d.nextDate());
  }

  @Test
  void nextDate_TC2() {
    Date d = new Date(2005,04,15);
    assertEquals(new Date(2005,04,16), d.nextDate());
  }

  @Test
  void nextDate_TC3() {
    Date d = new Date(1901,07,20);
    assertEquals(new Date(1901,07,21), d.nextDate());
  }

  @Test
  void nextDate_TC4() {
    Date d = new Date(3456,03,27);
    assertEquals(new Date(3456,03,28), d.nextDate());
  }

  @Test
  void nextDate_TC5() {
    Date d = new Date(1500,02,17);
    assertEquals(new Date(1500,02,18), d.nextDate());
  }

  @Test
  void nextDate_TC6() {
    Date d = new Date(1700,06,29);
    assertEquals(new Date(1700,06,30), d.nextDate());
  }

  @Test
  void nextDate_TC7() {
    Date d = new Date(1800,11,29);
    assertEquals(new Date(1800,11,30), d.nextDate());
  }

  @Test
  void nextDate_TC8() {
    Date d = new Date(3453,01,29);
    assertEquals(new Date(3453,01,30), d.nextDate());
  }

  @Test
  void nextDate_TC9() {
    Date d = new Date(444,02,29);
    assertEquals(new Date(444,03,01), d.nextDate());
  }

  @Test
  void nextDate_TC10() {
    Date d = new Date(2005,04,30);
    assertEquals(new Date(2005,05,01), d.nextDate());
  }

  @Test
  void nextDate_TC11() {
    Date d = new Date(3453,01,30);
    assertEquals(new Date(3453,01,31), d.nextDate());
  }

  @Test
  void nextDate_TC12() {
    Date d = new Date(3456,03,30);
    assertEquals(new Date(3456,03,31), d.nextDate());
  }

  @Test
  void nextDate_TC13() {
    Date d = new Date(1901,07,31);
    assertEquals(new Date(1901,8,01), d.nextDate());
  }

  @Test
  void nextDate_TC14() {
    Date d = new Date(3453,01,31);
    assertEquals(new Date(3453,02,01), d.nextDate());
  }

  @Test
  void nextDate_TC15() {
    Date d = new Date(3456,12,31);
    assertEquals(new Date(3457,01,01), d.nextDate());
  }

 
  @Test
public void nextDate_TC16() {
 
    Throwable exception = assertThrows(
            IllegalArgumentException.class, () -> {
              Date d = new Date(1500,02,31);
            }
    );
 
    assertEquals("day must less than 28 for month February on a non leap year.", exception.getMessage());
}

  @Test
  public void nextDate_TC17() {
 
    Throwable exception = assertThrows(
            IllegalArgumentException.class, () -> {
              Date d = new Date(1500,02,29);
            }
    );
 
    assertEquals("day must less than 28 for month February on a non leap year.", exception.getMessage());
}


  @Test
  void nextDate_TC18() {
    
    Throwable exception = assertThrows(
            IllegalArgumentException.class, () -> {
              Date d = new Date(-1,10,20);
            }
    );
 
    assertEquals("year must be greater or equal to 0.", exception.getMessage());
  }

  @Test
  void nextDate_TC19() {
    
    Throwable exception = assertThrows(
            IllegalArgumentException.class, () -> {
              Date d = new Date(1458,15,12);
            }
    );
 
    assertEquals("month must be between 1 and 12.", exception.getMessage());
  }

  @Test
  void nextDate_TC20() {
    
    Throwable exception = assertThrows(
            IllegalArgumentException.class, () -> {
              Date d = new Date(1975,6,-50);
            }
    );
 
    assertEquals("day must greater or equal to 1.", exception.getMessage());
  }


}