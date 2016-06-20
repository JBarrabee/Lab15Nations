import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		// Path nationPath = null;
		// File nationList;

		System.out.println(" Welcome to the Countries Maintenence Application!");
		System.out.println("Choices:");
		System.out.println("\t 1 - See the list of Countries");
		System.out.println("\t 2 - Add a country to List");
		System.out.println("\t 3 - Exit");

		CountriesTextFile.checkExistance();
		// Path p = Paths.get("countries.txt");
		//
		// if (Files.notExists(p)) {
		// Files.createFile(p);
		// }

		boolean repeat = true;
		while (repeat) {
			int choice = Validator.getInt(scan, "Enter menu Number: ", 0, 4);
			// I am proud of my Validator class

			if (choice == 1) {
				CountriesTextFile.getList();
			}
			//
			//
			// try {
			// FileReader r = new FileReader("countries.txt");
			// // required importation of FileReader
			// // creating an object
			// BufferedReader in = new BufferedReader(r);
			// // required importation of Buffered Reader
			// // The buffered reader saves space differently than
			// // the file reader.
			// // Creates object in
			// String line = in.readLine(); // method readLine on object in
			//
			// while (line != null) {
			// System.out.println(line); // why this?
			// line = in.readLine(); // is this the same as above?
			// }
			// } catch (IOException e) {
			// // required importation of IOException Class
			// System.out.println(e);
			// }
			// continue;
			// }
			if (choice == 2) { // add a country to new list

				CountriesTextFile.addCountry();
				// try {
				//
				// // String fileName = ("countries.txt");
				//
				// PrintWriter out = new PrintWriter(new BufferedWriter(new
				// FileWriter("countries.txt", true)));
				//
				// System.out.print("Enter Country:");
				// String addition = scan.nextLine();
				// out.println(addition);
				//
				// System.out.println("you added " + addition);
				// out.close();
				// } catch (IOException e) {
				// // required importation of IOException Class
				// System.out.println(e);
				// }
				// System.out.println("This country has been saved.");
				continue;

			}

			if (choice == 3) { // exit

				System.out.println("Thank you for playing!");
				repeat = false;
			}

		}
	}

}
