package dessign.pattern.examples;

public class User {

	public static void main(String[] args) throws Throwable{
		
		SessionFactoryInstance s1= SessionFactoryInstance. getInstance();
		
		SessionFactoryInstance s2= SessionFactoryInstance. getInstance();
		
		
		//SessionFactoryInstance s3 =(SessionFactoryInstance) s2.clone();
		
		//System.out.println(s2 ==s3);
	}
}
