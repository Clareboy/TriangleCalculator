import java.util.Scanner;

public class tricalc {	
	public static void main (String[] args) {
		Scanner aInput = new Scanner(System.in);
		System.out.println("-- Triangle Calculator --");
		System.out.print("Please enter the lengths of Sides a and b: ");
		double aNum = aInput.nextDouble();
		double bNum = aInput.nextDouble();
		System.out.print("Please enter the size of Angle C in degrees: ");
		double cDegree = aInput.nextFloat();
		double cNum = (Math.sqrt(Math.pow(aNum, 2.0) + Math.pow(bNum, 2.0) - (2.0 * aNum * bNum * Math.cos(Math.toRadians(cDegree)))));
		System.out.printf("        /\\ \n");
		System.out.printf("       /  \\ \n");
		System.out.printf("      /    \\ \n");	
		System.out.printf("%4.1f", aNum);
		System.out.println(" /      \\ " + bNum);
		System.out.printf("    /        \\ \n");
		System.out.printf("   /          \\ \n");
		System.out.printf("  /____________\\ \n");
		System.out.printf("%11.1f \n\n", cNum);
		System.out.printf("%7.3f", aNum);
		System.out.printf(" = Side a \n");
		System.out.printf("%7.3f", bNum);
		System.out.print(" = Side b \n");
		System.out.printf("%7.3f", cNum);
		System.out.print(" = Side c \n");
		double sinA = (Math.toDegrees(Math.asin(((Math.sin(Math.toRadians(cDegree)))/cNum)*aNum)));
		System.out.printf("%7.3f", sinA);
		System.out.print(" = Angle A in degrees \n");
		double sinB = (Math.toDegrees(Math.asin(((Math.sin(Math.toRadians(cDegree)))/cNum)*bNum)));
		System.out.printf("%7.3f", sinB);
		System.out.print(" = Angle B in degrees \n");
		System.out.printf("%7.3f", cDegree);
		System.out.print(" = Angle C in degrees \n");
		double perimeter = aNum + bNum + cNum;
		System.out.printf("%7.3f", perimeter);
		System.out.print(" = Perimeter \n");
		double aHalf = (aNum + bNum + cNum)/2;
		double area = Math.sqrt(aHalf * ((aHalf-aNum)*(aHalf-bNum)*(aHalf-cNum)));
		System.out.printf("%7.3f", area);
		System.out.printf(" = Area \n");
		cNum = Math.round(cNum);
		if ((aNum == bNum) && (bNum == cNum)) {
			System.out.println("This is an equilateral triangle");
		} else {
			System.out.println("This is not an equilateral triangle.");
		}
		if ((aNum == bNum || aNum == cNum || bNum == cNum) && (!((aNum == bNum) && (bNum == cNum)))) {
			System.out.println("This is an isosceles triangle.");
		} else {
			System.out.println("This is not an isosceles triangle.");
		aInput.close();
		}
	}
}
  