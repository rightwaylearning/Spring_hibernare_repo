package dessign.pattern.examples;

public class User {

	public static void main(String[] args) {
		
		SessionFactoryInstance s1= SessionFactoryInstance. getInstance();
		
		SessionFactoryInstance s2= SessionFactoryInstance.getInstance();
		
		SessionFactoryInstance s3= SessionFactoryInstance.getInstance();
		
		SessionFactoryInstance s4= SessionFactoryInstance.getInstance();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}
}
