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
		
		request.setParameter("simpleFormBean.txtFirstname", "");
		request.setParameter("simpleFormBean.txtLastname", "");
		request.setParameter("simpleFormBean.txtEmail", "");
		request.setParameter("simpleFormBean.txtAge", "");
		
		// Step 1 : Create an ActionProxy for register action that is being called
		ActionProxy actionProxy = getActionProxy("/simpleformops.action");
		// Step 2 : An instance of action class by calling the action proxy getAction() 
		SimpleFormOpsAction action = (SimpleFormOpsAction)actionProxy.getAction();
		// Step 3 : Assert that it is not null. So, a little test here, this action object is not null
		assertNotNull("The action is Null, but should not be.", action);
		// Step 4 : Execute the Action Proxy, to get the result back result
		String result = actionProxy.execute();
		// Step 5 : Check nothing is set for any of properties, should be a request for more input
		// If no few fields are initialized in the model object, it should ask for more input
		// if not, it is an error
		// that is the idea of assert here
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
		// 
		request.setParameter("simpleFormBean.txtFirstname", "Praveen");
		request.setParameter("simpleFormBean.txtLastname", "Dewangan");
		request.setParameter("simpleFormBean.txtEmail", "pdvg.cdac@gmail.com");
		request.setParameter("simpleFormBean.txtAge", "20");
		
		// Rest steps from above function
		ActionProxy actionProxy = getActionProxy("/simpleformops.action");
		SimpleFormOpsAction action = (SimpleFormOpsAction)actionProxy.getAction();
		assertNotNull("The action is Null, but should not be.", action);
		String result = actionProxy.execute();
		assertEquals("The execute method did not return" + ActionSupport.SUCCESS + "but should have" , ActionSupport.SUCCESS, result);
	}

}
