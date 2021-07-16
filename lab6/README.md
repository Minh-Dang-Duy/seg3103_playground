Lab6 TA zkaka044@uottawa.ca ;
Prof aforward@uottawa.ca <aforward@uottawa.ca>;
class csi 3103

First I tried to installed binary zip achive of maven and added to ivironment variable. then I checked with command mvn -v 
on shell and it indicated that maven 3.8.1 is in my system

![javaversion](assets/mavenver.JPG)

next I extectacted the project and tried to build using vscode using command mvn compile
it downloaded alot more dependencies (not just the achive zip) and later on i was succeded


![javaversion](assets/compilesuccess.JPG)

next I used command mvn package -DskipTests to package all the project file on 1 java file

![javaversion](assets/skiptest.JPG)

next i used java -jar ./target/BookstoreApp-0.1.0.jar to create a local server

![javaversion](assets/localhost8080.JPG)

access admin page by /admin
![javaversion](assets/adminpage.JPG)

next I wrote my first test into exapleSeleniumTest.java of login by admin

![javaversion](assets/adminlogin.JPG)

and run mvn test and it sccussed


![javaversion](assets/runsucess.JPG)

next I worte one more test which admin have the correct password but wrong username for login error test

![javaversion](assets/errortest.JPG)



