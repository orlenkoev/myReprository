# JUnit_TestNG-Maven

1. Add JUnit or TestNg dependency in POM file
2. Add maven-surefire plugin in POM file

3. Go to src/main/java/application and open Calculator class
4. Implement all methods with TODO comments

5. Go to the test/java/simpleTask and open SimpleTestClass
6. Create test for all simple methods from Calculator class


7. Go to the test/java/mediumTask and open MediumTestClass
8. Create test for all medium methods from Calculator class

9. Go to the test/java/hardTask and open HardTestClass
10. Create test for all medium methods from Calculator class

************************************************************

11. Run all tests from maven
13. Run only tests from HardTestClass
14. Run tests from HardTestClass and SimpleTestClass

************************************************************

15. If you pick JUnit:<br />
Add category "Regression" for all tests in SimpleTestClass<br />
Add category "Smoke" for all tests in MediumTestClass<br />
Add category "Regular" for all tests in HardTestClass<br />
run only Smoke and Regression tests using runner class<br />

16. If you pick TestNG:<br />
Add group "Regression" for 1 test in SimpleTestClass<br />
Add group "Smoke" for 1 test in MediumTestClass<br />
Create testng.xml file<br />
Configure testng.xml file as:<br />
all tests from HardTestClass should be run<br />
test with Regression group should be run<br />
test with Smoke group should be run<br />

