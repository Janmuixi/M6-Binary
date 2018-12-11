import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Binary2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
		
		File fichero = new File ("data.dat");
		DataOutputStream dataOS = new DataOutputStream(new FileOutputStream (fichero, true));
				
		String nombres[] = {"Daddy", "NickyJam", "Maluma"};
		int edad[] = {102,10,30};
		
		for(int i=0; i<nombres.length; i++) {
			try {
				dataOS.writeUTF(nombres[i]);
				dataOS.writeInt(edad[i]);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
