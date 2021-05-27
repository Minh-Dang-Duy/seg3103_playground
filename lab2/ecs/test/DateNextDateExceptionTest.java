import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;




@RunWith(Parameterized.class)
public class DateNextDateExceptionTest
{
    
 private int year;
 private int month;
 private int day;
 private String emess;
 
 public DateNextDateExceptionTest(int year,int month,int day,String mess){
    super();
    this.year=year;
    this.month=month;
    this.day=day;
    emess= mess;
 }

 
 @Parameterized.Parameters
 public static Collection input() {
     return Arrays.asList(new Object[][]{{1500,02,31,"day must less than 28 for month February on a non leap year."},{1500,02,29,"day must less than 28 for month February on a non leap year."}
     ,{-1,10,20,"year must be greater or equal to 0."},{1458,15,12,"month must be between 1 and 12."},{1975,6,-50,"day must greater or equal to 1."}});
 }

 @Test
 public void Parameter_Exception_Test(){
    Throwable exception = assertThrows(
        IllegalArgumentException.class, () -> {
            Date idate = new Date(year,month,day);
        }
);

assertEquals(emess, exception.getMessage());
 }

}

