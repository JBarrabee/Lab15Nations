import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CountriesTextFile {

	public static void getList() throws IOException {
		// TODO Auto-generated method stub

		try {
			FileReader r = new FileReader("countries.txt");
			// required importation of FileReader
			// creating an object
			BufferedReader in = new BufferedReader(r);
			// required importation of Buffered Reader
			// The buffered reader saves space differently than
			// the file reader.
			// Creates object in
			String line = in.readLine(); // method readLine on object in

			while (line != null) {
				System.out.println(line); // why this?
				line = in.readLine(); // is this the same as above?
			}
		} catch (IOException e) {
			// required importation of IOException Class
			System.out.println(e);
		}
	}

	public static void checkExistance() throws IOException {
		// TODO Auto-generated method stub
		try {
			Path p = Paths.get("countries.txt");
			File file = new File("workspace/Lab16Nations.countries.txt");

			if (file.delete()) {
				System.out.println(file.getName() + " is deleted!");
			} else {
				System.out.println("Delete operation is failed.");
			}

		} catch (Exception e) {

			e.printStackTrace();

			Path p = Paths.get("countries.txt");

			if (Files.notExists(p)) {
				Files.createFile(p);
			}
		}
	}

	public static void addCountry() {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		try {

			// String fileName = ("countries.txt");

			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("countries.txt", true)));

			System.out.print("Enter Country:");
			String addition = scan.nextLine();
			out.println(addition);

			System.out.println("you added " + addition);
			out.close();
		} catch (IOException e) {
			// required importation of IOException Class
			System.out.println(e);
		}
		System.out.println("This country has been saved.");
	}

}
