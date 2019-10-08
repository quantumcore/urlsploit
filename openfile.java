/**
 * 
 */
package urlsploit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

/**
 * @author QuantumCore
 *
 */
public class openfile {

	JFileChooser fc = new JFileChooser();	
	StringBuilder sb = new StringBuilder();
	
	public void chooseFile() throws FileNotFoundException
	{
		if(fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
		{
			File f = fc.getSelectedFile();
			Scanner in = new Scanner(f);
			while(in.hasNext()) {
				Main.textArea.append("\n>> File : " + in.nextLine());
			}
			in.close();
			
		} else {
			Main.textArea.append("\n>> No File selected.");
		}
	}
}
