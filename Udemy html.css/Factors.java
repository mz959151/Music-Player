import java.util.Scanner;
public class PerfectNumbers {
Scanner input = new Scanner(System.in);
public static void main(String[] args) {

System.out.print("Enter the number up to which you would like to look for perfect numbers:");
int user = input.nextInt();
for (int num = 1; num <= user; num++) {
if (isPerfect(num)) {
System.out.println("The number " + num + " is a perfect number");
System.out.println("It's factors are:" + isPerfect(num));
}
}

}
public static Boolean isPerfect(int num) {


int sum = 0;

for (int factor = 1; factor < num; factor++) {
if (num % factor == 0) {
sum += factor;
}
}
if (sum == num) {
return true;
} else {
return false;
}

}

}