package exercise_due_2023_06_24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class filereader {
	public static void main(String[] args) {
			plot[] newStreet = new plot[100];
			try{
				System.setProperty("File.encoding","UTF-8");
				BufferedReader br = new BufferedReader(new FileReader("kerites2.txt"));
				String line="";
				//br.readLine(); This is required only if we need to discard the first line.
				int index=0;
				while(line!=null){
					line=br.readLine();
					if(line != null){
						String[] newPlot = line.split(" ");
						newStreet[index]=new plot(Integer.parseInt(newPlot[0]),Integer.parseInt(newPlot[1]),newPlot[2]);
						//newStreet[index].setPlotNumber(Integer.parseInt(newPlot[0]));
						//newStreet[index].setPlotWidth(Integer.parseInt(newPlot[1]));
						//newStreet[index].setFenceColor(newPlot[2]);
					}
					index++;
				}
				br.close();
				System.out.println(newStreet.length);
			}
			catch (IOException e) {System.out.println("hiba");}
			/**/
			
	}
}
