
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class PetersIOexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path productsPath = Paths.get("./groceries2.txt");
		// System.out.println(productsPath.toAbsolutePath());
		File productsFile = productsPath.toFile();

		ArrayList<Product> productList = new ArrayList<Product>();

		try {
			FileReader r = new FileReader(productsFile);
			BufferedReader in = new BufferedReader(r);
			String line = in.readLine();
			while (line != null) {
				// System.out.println(line);
				String[] details = line.split("\t");

				// System.out.println();
				// take the String, parse it as a double, then store it
				// line below built into second const.
				// double price = Double.parseDouble(details[2]);
				// create a new instance with this info
				Product temp = new Product(details[0], details[1], details[2]);
				// add this instance into the list
				productList.add(temp);

				// read the next line for the next loop
				line = in.readLine();
			}

			in.close();
		} catch (IOException e) {
			System.out.println(e);
		}

		// output everything
		for (Product p : productList) {
			System.out.println(p);// implicit call to toString();
		}

		System.out.println("Produce only:");
		// one category
		for (Product p : productList) {
			if (p.getCategory().equals("Produce"))
				System.out.println(p);// implicit call to toString();
		}

	}
}