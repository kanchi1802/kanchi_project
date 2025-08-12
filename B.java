public class test1{
	public static void main(String[] args){
		if(args.length!=2){
			System.out.println("please provide only two numbers");
			return;
		}
		try{
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int sum = num1+num2;
			System.out.println("the sum of the provided two numbers is: "+sum);
		}catch(NumberFormatException e){
			System.out.println("invalid input");
		}
	}
}