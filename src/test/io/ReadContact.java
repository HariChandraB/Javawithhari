package test.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ReadContact {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader CSVFile = new BufferedReader(new FileReader("C:/Users/harih/Documents/Contacts.csv"));
		int i = 0;
		String line = " ";
		Contacts contact = new Contacts();
		while ((line = CSVFile.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(line, ",");

			String contactId = st.nextToken();
			String contactName = st.nextToken();
			String phoneNumber = st.nextToken();

			contact.contactId = contactId;
			contact.contactName = contactName;
			contact.phoneNumber = phoneNumber;
			System.out.println("Contacts[" + i + "]: = " + " " + contact.contactId + " " + contact.contactName + " "
					+ contact.phoneNumber);
			i++;
		}
	}
}
