package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Phone phone = new Phone("nokia");
           System.out.println(phone.getModel());
           phone.features();
           
           Phone phone2 = new Samsung("samsung");
           System.out.println(phone2.getModel());
           phone2.features();
           
           Phone phone3 = new Nokia("nokoooo");
           System.out.println(phone3.getModel());
           phone3.features();
           
           List<Phone> phones = new ArrayList<>();
           phones.add(phone2);
           phones.add(phone3);
           System.out.println();
           for (int i =0; i<phones.size(); i++)
           {
        	   phones.get(i).features();
           }
	}

}
