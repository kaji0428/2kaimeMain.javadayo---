import java.util.Scanner;
public class Main{
public static void main(String[] args) {
	for(int i=1; i<3; i++){
	Scanner sc = new Scanner(System.in);
	System.out.println(i + "の"+"身長(m)");
	double height = sc.nextDouble();
	System.out.println(i + "の"+"体重(kg)");
	double weight = sc.nextDouble();
	double bmi = 0.0;
	bmi = weight / (height * height);
	System.out.printi + "の"+("BMIの値は");
	System.out.println((Math.floor(bmi * 10))/10);
	}
}

}
