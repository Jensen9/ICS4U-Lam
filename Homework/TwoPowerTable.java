import java.io.*;

public class TwoPowerTable {
	public static void main(String[] args) {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("twoPowerTable.html"));

			out.write("<html><head>");
			out.newLine();
			out.write("<title>Powers of Two</title>");
			out.newLine();
			out.write("</head>");
			out.newLine();
			out.write("<body>");
			out.newLine();
			out.write("<table border cellpadding=5>");
			out.newLine();
			out.write("<tr><th>Power of 2</th><th>Value</th></tr>");
			out.newLine();

			for(int i = 0; i <= 10; i++) {
				out.write("<tr><td>" + i + "</td><td>" + (int)Math.pow(2,i) + "</td></tr>");
				out.newLine();
			}

			out.write("</table>");
			out.newLine();
			out.write("</body></html>");
			out.close();
		}
		catch (IOException e) {
			
		}
	}
}
