import java.util.Scanner;
public class Calcule {
	
	public static boolean isNumeric(String str) { 
		  try {  
		    Double.parseDouble(str);  
		    return true;
		  } catch(NumberFormatException e){  
		    return false;  
		  }  
		}
	
	public static void calculer() {
		    String a;
		    char op[]= {'+','-','*','/'} ;
			double num1 , num2 ;
			boolean check=true;
			char operation;
		
			Scanner input = new Scanner(System.in);
			System.out.println("Entrer A");
			a = input.nextLine();
			while(!isNumeric(a)) {
	    		System.out.println("Erreur de saisie !!! \n Entrer A");
	 	    	a=input.nextLine();	    		
	    	}
			num1 = Double.parseDouble(a);
			
			
			System.out.println("Entrer B");
			a = input.nextLine();
			while(!isNumeric(a)) {
	    		System.out.println("Erreur de saisie !!! \\n Entrer B");
	 	    	a=input.nextLine();	    		
	    	}
			num2 = Double.parseDouble(a);
			
			do {
		
				System.out.println("Entrer operation a executer");
				operation = input.next().charAt(0);
				switch (operation) {
				case '+':
					System.out.flush();
					System.out.printf("%.2f + %.2f = %.2f", num1,num2,(num1+num2));
					check=true;
					break;
				case '-':
					System.out.printf("%.2f - %.2f = %.2f", num1,num2,(num1-num2));
					break;
				case '*':
				
					System.out.printf("%.2f * %.2f = %.2f", num1,num2,(num1*num2));
					check=true;
					break;
				case '/':
					if(num2 != 0)
					{
					
					System.out.printf("%.2f / %.2f = %.2f", num1,num2,(num1/num2));
					}
					else
					{
						
						System.out.println("Impossible de divisioner sur 0");
					    check=true;
					}
					break;
			
				default:	
				
					System.out.printf("Operation invalide \n",operation);
					check=false;
					break;
				}
			}while(!check);
			
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         char again;
         boolean a = true;
		 Scanner scan = new Scanner(System.in);
		  do {
		  calculer();
		  System.out.println("\n Cliquez sur\n 0:quitter \n 1:Nouvelle calcule ");
		  again=scan.next().charAt(0);
		  System.out.println(again);
		  }while(again != '0');
		  System.out.println("vous avez quitez le calcule ");
	}

}
