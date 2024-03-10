package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class MyHooks 
{
@Before(order = 1)
public void beforeHook1()
{
	System.out.println("Before hook1 is executing");
}

@After(order = 1)
public void afterHook1()
{
	System.out.println("After hook1 is executing");
	
}

@After(order = 2)
public void afterHook2()
{
	System.out.println("After hook2 is executing");
}

@Before(order = 2)
public void beforeHook2()
{
	System.out.println("Before hook2 is executing");
}

@BeforeStep
public void beforestep()
{
	System.out.println("Before Steps");
}

@AfterStep
public void aftersteps()
{
	System.out.println("After Steps");
}

@BeforeAll
public static void beforeAll()
{
	System.out.println("Before all is executing");
}

@AfterAll
public static void afterAll()
{
	System.out.println("After all is executing");
}
}

