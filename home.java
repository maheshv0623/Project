package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class AppTest
{
private App app;
@Before
public void setUp() throws Exception {
app = new App();
}
@After
public void tearDown() throws Exception {
}
@Test
// unit test case that will check whether the method returns the 
// anticipated output or not
public void testMultiplication() {
int result = app.multiply(10, 5);
assertEquals(result,40);
}
}
