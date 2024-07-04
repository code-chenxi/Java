/*
编写 Java 代码，输入一个半径值，计算圆的面积和周长，并输出结果。注意：圆的面积公式为 π * r * r，周长公式为 2 * π * r，其中 π 取 3.14
*/
import java.util.Scanner;

public class OperHomework01{
	public static void main(String[] args){
		// 1.接收用户的输入，可以让用户输入一个double数据
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入圆的半径：");
		double r = scanner.nextDouble();

		// 2.计算圆的面积
		// 2.1 定义1个变量：π
		double π = 3.14;

		// 2.2 带入公式计算圆的面积
		double area = π * r * r;

		// 3.计算圆的周长
		// 3.1 带入公式计算圆的周长
		double perimeter = 2 * π * r;

		System.out.println("半径值是" + r + "的圆面积是" + area);
		System.out.println("半径值是" + r + "的圆周长是" + perimeter);
	}
}