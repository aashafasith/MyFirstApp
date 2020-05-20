package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloWorldController {
	//"@RequestMapping" methods should specify HTTP method (squid:S3752
    @RequestMapping("/hello")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        
        String message="You just create Spring Boot Example successfully";
        model.addAttribute("name", name);
        model.addAttribute("message", message);
        return "hello";
    }
    
    //Methods should not be empty (squid:S1186)
    @RequestMapping("/test")
    public void doSomething() {
    }

    //Collapsible "if" statements should be merged (squid:S1066)
    public void ifConditionExample() {
    	if (5>4) {                  // Compliant - depth = 1
    		  /* ... */
    		  if (4>3) {                // Compliant - depth = 2
    		    /* ... */
    		    for(int i = 0; i < 10; i++) {  // Compliant - depth = 3, not exceeding the limit
    		      /* ... */
    		      if (i==5) {            // Noncompliant - depth = 4
    		        if (i==1) {          // Depth = 5, exceeding the limit, but issues are only reported on depth = 4
    		          /* ... */
    		        }
    		        return;
    		      }
    		    }
    		  
    }
  }}
    
    //Local variables should not be declared and then immediately returned or thrown (squid:S1488)
    public String computeDurationInMilliseconds() {
    	  String var = "Java" ;
    	  return var;
    	}

    //Declaring a variable only to immediately return or throw it is a bad practice.
    	public void doSomething1() {
    	  RuntimeException myException = new RuntimeException();
    	  throw myException;
    	}
    	
    	//Unused "private" fields should be removed
    	private int foo = 42;
    	
    	//"@RequestMapping" methods should be "public" (squid:S3751)
    	@RequestMapping("/greet")
    	private String greet(String greetee) { 
    		
    		return null;
    	}
    	
    	//The Object.finalize() method should not be called (squid:ObjectFinalizeCheck)
    	public void dispose() throws Throwable {
    		  this.finalize();                       // Noncompliant
        }
    	
    	//Standard outputs should not be used directly to log anything (squid:S106)
    	public void printSomething() {
    		System.out.println("My Message");
    	}
    	
    	//public final int THRESHOLD = 3;
    	
    	
}
