package InstaConcepts.FactoryProduct;

public class FactroyProduct {
	
	//	This is main Methods Of creating The Factory Method Pattern here
	//	So we create a function methods based on every condition
	//	So we Store the Objects in if else condition
	//	and then we get that condition Class based on String value;
	
	public Os getInstance(String str){
		if(str.equalsIgnoreCase("Every")) {
			return new Android();
		}
		else if(str.equalsIgnoreCase("Some")){
			return new Ios();
		}
		else if(str.equalsIgnoreCase("Students")){
			return new Windows();
		}
		else return new Nothingspec();
			
	
		
		
	}

}
