import java.util.Scanner;
class Quizer{

	public static void main(String[] args){
		Scanner stringScanner = new Scanner(System.in);
		//Scanner input=new Scanner(System.in);
		System.out.println("Enter Your Question ");
		String que= stringScanner.nextLine();
		String[] option=new String[4];
		System.out.println("Enter option 1 :");
		option[0]=stringScanner.nextLine();
		System.out.println("Enter option 2 :");
		option[1]=stringScanner.nextLine();
		System.out.println("Enter option 3 :");		
    		option[2]=stringScanner.nextLine();
		System.out.println("Enter option 4 :");
		option[3]=stringScanner.nextLine();
		System.out.println("Enter correct answer");
		String result=stringScanner.nextLine();
		System.out.println("Are you ready to play the Quiz(Yes/no)");
		String choice=stringScanner.nextLine();
		if(choice.equals("yes")){
			System.out.println("Your Question is: "+que);
			System.out.println("1: "+option[0]);
			System.out.println("2: "+option[1]);
			System.out.println("3: "+option[2]);
			System.out.println("4: "+option[3]);
			System.out.println("Please enter your answer");
			String answer=stringScanner.next();
			int point=0;
				if(result.equals(answer)){
					//int point=0;
					System.out.println("Your answer is corret you got "+(point+1)+ " Point");
					System.out.println("Feedback: Nice start");	
				}else{
					//int point=0;
					System.out.println("Your answer is Wrong "+point);
					System.out.println("Feedback: You work hard");
					}
				
		}else{

			System.out.println("Ok no Problem");
			}
		
		

  }
}