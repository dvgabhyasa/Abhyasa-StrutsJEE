/**
 * This action class is responsible to handle FormOps 
 * simpleform.html & simpleform.jsp file 
 *
 * @author Praveen Dewangan <dvg.abhyasa@gmail.com>
 * 
 * 
 */
package edu.abhyasa.strutsops.actions;

import com.opensymphony.xwork2.ActionSupport;

import edu.abhyasa.strutsops.models.SimpleFormOpsModel;

/**
 * 
 */
public class SimpleFormOpsAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;

	/**
	 * Model reference variable
	 */
	private SimpleFormOpsModel simpleFormBean;
	

	/**
	 * 
	 * When user submits the submit button on a form
	 * - Struts2 transfers the user's input from form fields to Model class bean instance fields
	 * Then struts2 automatically executes the validation method 
	 * If any of the if statements are true, Struts2 will call its addFieldError method from ActionAware class method
	 * If any error has been added then struts2 will not proceed to call the execute method.
	 * Rather the Struts2 framework will return input as the result of calling the action.
	 * 
	 * <h2>Handle Input being returned</h2>
	 * When Struts 2 framework returns input 
	 * - indicating the user's input in the form is not valid
	 * - need to add result tag containing name attribute valued input in struts.xml
	 * In most cases we will want to 
	 * - Display the webpage containing the form
	 * - Error messages - to inform the users what is wrong and its reasons
	 *
	 * To validate criateria 
	 * - Firstname(Alphabets only) 
	 * - Email(Format Validation) 
	 * - Age(min 18yrs)
	 * 
	 * To validate user's input in Struts2 form
	 * Need to define an override validate() method in action class
	 * 
 	 * What is ActionAware class in Struts ?
	 * - Action aware class in struts accepts class or field level error messages.
	 * - Action class level error messages are kept inside 
	 * 
	 * User's input is placed by Struts2 into the Java Model class
	 * - So, users's input for field firstName field would end up as the value for SimpleFormOpsModel class txtFirstname instance field 
	 * [ via the SimpleFormOpsModel.setTxtFirstname() method ]
	 *
	 *  
	 */
	@Override
	public void validate() {
		System.out.println("Inside Validation method");
		// Get the value of firstName from Model instance field using appropriate get method
		// Once we have value we can apply logic to enforce business validation logics
		if(simpleFormBean.getTxtFirstname().length() == 0) {
			addFieldError("simpleFormBean.txtFirstname", "First Name is required.");
		}
		
		if(simpleFormBean.getTxtEmail().length() == 0) {
			addFieldError("simpleFormBean.txtEmail", "Email is required.");
		}
		
		if(simpleFormBean.getTxtAge() < 18) {
			addFieldError("simpleFormBean.txtAge", "Age must be 18 or older.");
		}
	}
	
	/**
	 * After validate without error then only execute() executes
	 * @return SUCCESS ERROR 
	 */
	@Override
	public String execute() throws Exception {
		System.out.println("In Action execute method");
		System.out.println(getSimpleFormBean().toString());
		return SUCCESS;
	}
	
	// ------------------------ Getters & Setters ------------------------ //

	/**
	 * @return the simpleFormBean
	 */
	public SimpleFormOpsModel getSimpleFormBean() {
		return simpleFormBean;
	}

	/**
	 * @param simpleFormBean the simpleFormBean to set
	 */
	public void setSimpleFormBean(SimpleFormOpsModel simpleFormBean) {
		this.simpleFormBean = simpleFormBean;
	}
	
}