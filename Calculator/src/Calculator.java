	import java.util.Scanner;
	public class Calculator {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			for (;;) {
				System.out.println("�������  �����:");
				int num1 = scanner.nextInt();
				num1 = ExaminLetter1(num1);{
					System.out.println("������� ���� �������� (+, -, *, /): ");
					char oper = scanner.next().charAt(0);
					System.out.println("�������  �����: ");
					int num2 = scanner.nextInt();
					switch (oper) {
					case '+':
						num1 += num2;
						break;
					case '-':
						num1 -= num2;
						break;
					case '*':
						num1 *= num2;
						break;
					case '/':
						num1 /= num2;
						break;
					default:
						System.out.print("�� ����� ������������ ���� ��������");
					}
					System.out.print("���������  " + num1 + "\n");
				}
			}
		}

		private static int ExaminLetter1(int num1) {
			System.out
					.println("�������  S ��� ����������, C ��� �������, ����� ������ ��� �����������");
			Scanner scanner = new Scanner(System.in);
			char key = scanner.next().charAt(0);
			switch (key) {
			case 's':
				System.exit(0);
				scanner.close();
				break;
			case 'c':
				num1 = 0;
			}
			return num1;
		}
	}



