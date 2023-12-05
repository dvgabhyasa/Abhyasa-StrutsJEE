package edu.abhyasa.strutsops;

import org.apache.struts2.StrutsTestCase;
import org.junit.Test;

import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.ActionSupport;

import edu.abhyasa.strutsops.actions.SimpleFormOpsAction;

/**
 * Test class for respective Action class
 * 
 * Reference : 
 */
public class SimpleFormOpsActionTest extends StrutsTestCase {
	
	/**
	 * [Scenario] For validation with No Data Test
	 * Scenario : If no data is provided
	 *  
	 */
	@Test
	public void testValidationNoData() throws Exception {
		// use the request object to set the values of any request parameters
		// These simulate the values the user would enter into the form fields
		// Note: how the first argument to setParameter is the same as the value of the name attribute in the Struts textfield tag in jsp page
		request.setParameter("simpleFormBean.txtFirstname", "");
		request.setParameter("simpleFormBean.txtLastname", "");
		request.setParameter("simpleFormBean.txtEmail", "");
		request.setParameter("simpleFormBean.txtAge", "");
		
		// Step 1 : Create an ActionProxy for register action that is being called, 
		ActionProxy actionProxy = getActionProxy("/simpleformops.action");
		// Step 2 : To get a reference of Struts action class, an instance by calling the action proxy getAction() 
		// This enables Struts 2 JUnit Plugin will know which action class should be used the class associated with action class in struts.xml
		SimpleFormOpsAction action = (SimpleFormOpsAction)actionProxy.getAction();
		// Step 3 : Assert that a reference of action class is identified in struts.xml & not a null or empty 
		// A way to check, correctly setup struts.xml for action
		assertNotNull("The action is Null, but should not be.", action);
		// Step 4 : Execute the Action Proxy, this cause Struts 2 framework to go through normal process of servlet & interceptors for the action identified by actionProxy
		// Validate method called, if it does not create any error, execute method will called
		//to get the appropriate result back result as a normal action class execution function return string value [SUCCESS, ERROR]
		String result = actionProxy.execute();
		// Step 5 : Check nothing is set for any of properties, should be a request for more input
		// If no few fields are initialized in the model object, it should ask for more input
		// if not, it is an error
		// that is the idea of assert here
		// Checks that Struts 2 framework returned input as that is what the Struts 2 framework will return if the validation adds a field or action error
		assertEquals("The execute method did not return" + ActionSupport.INPUT + "but should have." , ActionSupport.INPUT, result);
	}

	/**
	 * [Scenario] For validation With test data
	 * When some body tries to come to this site
	 * @throws Exception
	 */
	@Test
	public void testValidationPassData() throws Exception{
		
		// Providing programmatically initialized all different parameters required for form input fields
		// When user fills out those fields, Struts takes those values & provide to he appropriate set method in Model Bean class
		// The StrutsTestCase provides a request object (of type MockHttpServletRequest) that use to set these values in request scope.
		request.setParameter("simpleFormBean.txtFirstname", "Praveen");
		request.setParameter("simpleFormBean.txtLastname", "Dewangan");
		request.setParameter("simpleFormBean.txtEmail", "pdvg.cdac@gmail.com");
		request.setParameter("simpleFormBean.txtAge", "20");
		
		// Rest steps from above no data scenario
		ActionProxy actionProxy = getActionProxy("/simpleformops.action");
		SimpleFormOpsAction action = (SimpleFormOpsAction)actionProxy.getAction();
		assertNotNull("The action is Null, but should not be.", action);
		String result = actionProxy.execute();
		assertEquals("The execute method did not return" + ActionSupport.SUCCESS + "but should have" , ActionSupport.SUCCESS, result);
	}

}
