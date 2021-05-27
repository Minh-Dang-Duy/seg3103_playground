import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



@RunWith(Parameterized.class)
public class DateNextDateOkTest
{
 private int year;
 private int month;
 private int day;
 private Date cdate;
 private Date edate;

 public DateNextDateOkTest(int year,int month,int day,Date hedate){
    super();
    this.year=year;
    this.month=month;
    this.day=day;
    edate=hedate;
 }

 @Before
   public void initialize() {
    cdate = new Date(year,month,day);
   }
 

 @Parameterized.Parameters
 public static Collection input(){
     return Arrays.asList(new Object[][]{{1700,06,20,new Date(1700,06,21)},{2005,04,15,new Date(2005,04,16)},{1901,07,20,new Date(1901,07,21)},{3456,03,27,new Date(3456,03,28)},{1500,02,17,new Date(1500,02,18)},{1700,06,29,new Date(1700,06,30)},{1800,11,29,new Date(1800,11,30)},{3453,01,29,new Date(3453,01,30)},{444,02,29,new Date(444,03,01)},{2005,04,30,new Date(2005,05,01)},{3453,01,30,new Date(3453,01,31)},{3456,03,30,new Date(3456,03,31)},{1901,07,31,new Date(1901,8,01)},{3453,01,31,new Date(3453,02,01)},{3456,12,31,new Date(3457,01,01)}});
 }

 @Test
 public void Parameter_OK_Test(){
     assertEquals(edate,cdate.nextDate());
 }

}