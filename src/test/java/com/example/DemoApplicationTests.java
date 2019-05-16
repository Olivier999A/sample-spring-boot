package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertTrue;
import org.junit.Ignore;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Ignore	
	@Test
	public void contextLoads() {
	}
	@Test	
	public void shouldAnswerWithTrue()
   	{
        assertTrue( true );
    	}
	@Ignore		
	@Test	
	public void failed()
   	{
        assertTrue( false );
    	}
}
