package hybridInheritance;

public class ExecutionClassElements {

	public static void main(String[] args) {
		//Obj for button clas
		Button bn = new Button();
		bn.submit();
		
		//obj for ChecKButton class
		CheckBoxButton ch = new CheckBoxButton();
		ch.clickCheckButton();
		//Calling BaseClasswebElement method
		ch.click();
		
		RadioButton rb = new RadioButton();
		rb.selectRadioButton();
		//Calling BaseClasswebElement method
		rb.setText("***This is for BaseClass WebElement");
		
		TextField tf = new TextField();
		tf.getText();
		
		
		
		
		
		
	}

}
