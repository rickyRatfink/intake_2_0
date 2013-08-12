import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.faithfarm.service.data.IntakeDao;
import org.faithfarm.util.Validator;


public class UnitTest {

	public static void main(String[] args) {
		
		Validator v = new Validator();
		IntakeDao dao = new IntakeDao();
		//dao.insertIntakeApplication(new Intake(), "",null);
		/*Donor d1 = new Donor();
		Donation d2 = new Donation();
		d2.setCreationDate(v.getEpoch());
		d2.setAc("5");
		d1.setFirstname("Test");
		d1.setLastname("User");
		d1.setCreationDate(v.getEpoch()+"");
		
		int retCode = dao.insertDonation(d1, d2, null);
		
		SystemUser user= new SystemUser();
		user.setUsername("rrratliff");
		user.setPassword("a999919");
		user.setUserRole("ADMIN");
		user.setFarmBase("BOYNTON BEACH");
		Long retCode = dao.insertSystemUser(user,  null);
		*/
		//Donor donor = dao.getDonor(new Long(2));
		//Address addy = dao.getAddress(new Long(1));
		//Donation d = dao.getDonation(new Long(1));
		
		//System.out.println (d.getFarmBase());
		
		
		//Date ddate = new java.util.Date();
		//DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		//System.out.println (df.format(ddate));
		
		//Display the date now:
		
		//Date today = new java.util.Date();
		//Date tomorrow = calendar.getTime();
		//tomorrow.setTime(today.getTime() + 48*60*60*1000);
		//System.out.println("tomorrow="+tomorrow);
		//System.out.println(v.validateDate("date", "02/02/1900"));

	     //String sPhoneNumber = "6055-888-9999";
	      //String sPhoneNumber = "605-88899991";
	      //String sPhoneNumber = "605-888999A";
	 
	     /* Pattern pattern = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
	      Matcher matcher = pattern.matcher(sPhoneNumber);
	 
	      if (matcher.matches()) {
	    	  System.out.println("Phone Number Valid");
	      }
	      else
	      {
	    	  System.out.println("Phone Number must be in the form XXX-XXX-XXXX");
	      }
		*/
	      
	      Map<String, String> m = new HashMap<String, String>();
	      
	       m.put("1", "Kitchen");
	       m.put("2","nf");
	        
	        
	        for (String key:m.keySet()) {
	        	System.out.println(key+" "+m.get(key));
	        }
	        /* Initialize frequency table from command line
	        for (String a : args) {
	            Integer freq = m.get(a);
	            m.put(a, (freq == null) ? 1 : freq + 1);
	        }*/

	     
	}

}
