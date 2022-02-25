package Coffee_Machine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Garbage_collector {

	public static void main(String[] args) {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int can=3;//kg
		float weight;
		float time,totalweight;
		try {
			System.out.println("    ..Welcome To Garbage Collector..\n");
			System.out.println("How many cans are present");
			int cans=Integer.parseInt(br.readLine());
			System.out.println("How much weight in every can");
			weight=Float.parseFloat(br.readLine());
				totalweight=weight*cans;
				System.out.println("Total Weight is "+totalweight+" kg\n");
				System.out.println("...Please wait....");
				 time=totalweight/can;
				 System.out.println("Collector will be get "+time+" minutes for collecting the garbage");
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
