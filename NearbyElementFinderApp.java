import java.util.Scanner;

public class NearbyElementFinderApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ElementFinder finder = new ElementFinder();
		
		System.out.println("Give me the first coordinate:");
		int firstCoordinate = scanner.nextInt();
		System.out.println("Give me the second coordinate:");
		int secondCoordinate = scanner.nextInt();
		System.out.println("Give me the search range:");
		int range = scanner.nextInt();
		finder.nearby(firstCoordinate,secondCoordinate,range);
	}
}