## Problem

The date of Easter in a given year is March (22 + A + B), where A and B
are determined as follows:

* A = the remainder of (19C + 24) / 30
* B = the remainder of (2D + 4E + 6A + 5) / 7
* C = the remainder of (year / 19)
* D = the remainder of (year / 4)
* E = the remainder of (year / 7)

This approach works for any year between 1854 and 4098 (inclusive). It computes an integer
date value which is the day in March for Easter. However, if the result is one
of the years 1954, 1981, 2049, or 2076, then the computed date value must be
reduced by 7. And, if the date value is > 31, then the result is a day in April,
so the date is calculated as date-31.

The easter program uses the class `EasterCalculator` method `easterDate`
to calculate the easter date given a year.
The header of the method is as follow:

```java
public static MyDate easterDate(int year)
// returns a date corresponding to the easter day of
// the year given if  1583 <= year <= 4099
// returns null if not
```

### Easter Q1:

Using the Equivalence Class Partitioning and the Boundary Value Analysis approaches,
design black box tests for the method easterDate. Show:

* your equivalence classes with a short descriptive note
* the boundary values that should be checked.

| EC | Input Condiiton | Valid EC | Invalid EC | Boundary Values | Description |
| --- | --- | --- | --- | --- | --- |

| 1 | year | all>=1584 & <=4099 | --- | 1980 | year is between 1583 and 4099 |
| 2 | year | (1954, 1981, 2049, or 2076) | outside(1954, 1981, 2049, or 2076) | within set | year value such that computed date value must be reduced by 7  |
| 3 | year | DateOfMonth>31 | --- | 2048 | year value such that computed date value must be April |
| 4 | year | --- | year<1584 | 1583 | year value cannot < 1854 |
| 5 | year | --- | year>4099 | 4123 | year value cannot > 4099 |

| &nbsp; | &nbsp; | &nbsp; | &nbsp; | &nbsp; | &nbsp; |


### Easter Q2

Write enough test cases to cover all the equivalence classes, and boundary values identified
in question Easter Q1

Provide a table showing the link between your test data and the equivalence classes.
This table should have the following format:

| Test Case Number | Test Data | Expected Results | Cover Equivalence | Boundary Values |
| --- | ---| --- | --- | --- |
| 1 | year=1583 | null | 4 | year<=1583 |
| 2 | year=1731 | 25 March  | 1 | 1584-1953 |
| 3 | year=1953 | 5 April   | 1,3 | 1584-1953 |
| 4 | year=1954 | 18 April  | 1,2,3 | 1954 |
| 5 | year=1959 | 29 March  | 1, | 1955-1980 |
| 6 | year=1980 | 6 April   | 1,3 | 1955-1980 |
| 7 | year=1981 | 19 April  | 1,2,3 | 1981 |
| 8 | year=1986 | 30 March  | 1, | 1982-2048 |
| 9 | year=2048 | 5 April   | 1,3 | 1982-2048 |
| 10 | year=2049 | 18 April | 1,2,3 | 2049 |
| 11 | year=2054 | 29 March | 1, | 2050-2075 |
| 12 | year=2075 | 7 April  | 1,3 | 2050-2075 |
| 13 | year=2076 | 19 April | 1,2,3 | 2076 |
| 14 | year=2077 | 11 April | 1,3 | 2077-4099 |
| 15 | year=4123 | null | 5 | year>4099 |



| &nbsp; | &nbsp; | &nbsp; | &nbsp; |

You can find the dates of Easter at
https://tlarsen2.tripod.com/anthonypolumbo/apeasterdates.html

### Easter Q3

Implement your test suite using JUnit and the provided `EasterCalculatorTest`.
You are required to hand the source code of your test suite.

THE TEST FILE IS LOCATED IN SRC FOLDER INCLUDING A CAPTURE FOR TESTING TERMINAL

### Easter Q4

Report your test results by providing a table with the following format
(the test case numbers correspond to the ones in Easter Q2).

| Test Case Number | Expected Results | Actual Results | Verdict (pass/fail) |
| --- | --- | --- | --- |

| 1 | null | null | pass |
| 2 | March 25 | March 27 | fail |
| 3 | April 5 | April 5 | pass |
| 4 | April 18 | April 25 | pass |
| 5 | March 29 | March 29 | pass |
| 6 | April 6 | April 6 | pass |
| 7 | April 19 | April 19 | pass |
| 8 | March 30 | March 30 | pass |
| 9 | April 5 | April 5 | pass |
| 10 | April 18 | April 25 | fail |
| 11 | March 29 | March 29 | pass |
| 12 | April 7 | April 7 | pass |
| 13 | April 19 | April 19 | pass |
| 14 | April 11 | April 11 | pass |
| 15 | null | null | pass |

| &nbsp; | &nbsp; | &nbsp; | &nbsp; |

Consider outputting this table as part of your JUnit code in Q3 above using Markdown.


### Q2.1:Identify the causes and the effects for this problem.

ANS:
Causes :
c1:elevator traveling up
c2:elevator traveling down
c3:floor up button press
c4:floor down button press
c5: the corresponding elevator button for the floor has been pressed
c6: the corresponding elevator button for the floor has not been pressed
c7: the charge carried by the elevator is less than the threshold value
c8: the charge carried by the elevator is superior or equal to the threshold value
c9: reach top floor 
c10: reach first floor

Causes :
e1:the elevator stops at the floor and turn off that floor button
e2: the elevator won’t stop at a floor and button still on
e3: elevator to stop at top floor
e4: elevator to stop at first floor

### Question 2.2 (20%)Draw a cause-effect graphfor this problem.

ANS: 

c1 \ 
c3__^ ---------> E1
c7 /              |
   \              |
c4__^-------------|
c2 _|             |
                  |
c5----------------

    c8\
  c3   \
    v---^------->E2
  c4   /
    c6/

c1 \ 
    ^ ---------> E3
c9 /


c2 \ 
    ^ ---------> E4
c10 / 

### Question 2.3 (10%)Provide a Boolean formula corresponding to each of the possible effects.

ANS:
(c1^c3^c7)V(c5)V(c2^c4^c7) =E1
(c3 V c4) ^ c6 ^ c8 = E2
c1^c9 = E3
c2^c10 = E4

### Question 2.4 (10%)Provide a decision table obtained by applying Each-Condition/All-Conditions approach.Question 

ANS:
c1  c3  c2  c4  c7  c5  E1
F   F   F   F   F   F   F
F   F   F   F   F   T   T
F   F   F   F   T   F   F
F   F   F   F   T   T   T
F   F   F   T   F   F   F
F   F   F   T   F   T   T
F   F   F   T   T   F   F
F   F   F   T   T   T   T
F   F   T   F   F   F   F
F   F   T   F   F   T   T
F   F   T   F   T   F   F
F   F   T   F   T   T   T
F   F   T   T   F   F   F
F   F   T   T   F   T   T
F   F   T   T   T   F   T
F   F   T   T   T   T   T
F   T   F   F   F   F   F
F   T   F   F   F   T   T
F   T   F   F   T   F   F
....
T   T   T   T   T   T   T


C3  C4  C6  C8  E2
T   F   F   F   F
F   T   F   F   F
F   F   T   F   F
F   F   F   T   F
T   T   T   T   T
T   F   T   T   T
F   T   T   T   T

C1  C9  E3
T   F   F
F   T   F
T   T   T

C2  C10 E4
T   F   F
F   T   F
T   T   T





### Question 2.5 (5%)Give five (5) test cases derived from the decision table in question 2.4

ANS:

1. elevator traveling down and elevator  reach first floor ->elevator to stop at first floor
2. floor down button press,the charge carried by the elevator is less than the threshold value,the corresponding elevator button for the floor has been pressed ->the elevator stops at the floor and turn off that floor button
3. floor up button press,the corresponding elevator button for the floor has been pressed,the charge carried by the elevator is superior or equal to the threshold value ->the elevator won’t stop at a floor and button still on
4. elevator traveling up and reach top floor ->elevator to stop at top floor
5. floor up button press,the corresponding elevator button for the floor has been pressed-->the elevator stops at the floor and turn off that floor button