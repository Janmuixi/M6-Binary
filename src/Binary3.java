import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class Binary3 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fileStream= new FileInputStream ("data.dat");
		DataInputStream file = new DataInputStream (fileStream);
		
			try {
				while(true) {
					System.out.println("Name: " + file.readUTF() + " Age: " + file.readInt());
				}
			} catch(EOFException e) {
				System.out.println("End");
			} finally {
				file.close();
			}
		}
	}
