package 복습문제;

import java.util.Random;

public class Ssn {
	
	public int[][] ssn1(int num) {
		Random r = new Random();
		
		String[] ssnlist = new String[num];
		for (int i = 0; i < ssnlist.length; i++) {
			ssnlist[i] = String .valueOf(r.nextInt(4000000) + 1000000);
			
		}
		int[][] gender = new int[4][2];
		
		for (int i = 0; i < ssnlist.length; i++)  {
			String ssn = ssnlist[i];
		
			if (ssn.charAt(1) == '1') {
				
				if (ssn.charAt(0) == '1' || ssn.charAt(0) == '3' ) {
					gender[0][0]++;
				} else {
					gender[0][1]++;

				}
			} else if (ssn.charAt(1) == '2'){
				if (ssn.charAt(0) == '1' || ssn.charAt(0) == '3' ) {
					gender[1][0]++;
				} else {
					gender[1][1]++;
				}
			
			} else if (ssn.charAt(1) == '3'){
				if (ssn.charAt(0) == '1' || ssn.charAt(0) == '3' ) {
					gender[2][0]++;
				} else {
					gender[2][1]++;
				}
				
			} else {
				if (ssn.charAt(0) == '1' || ssn.charAt(0) == '3' ) {
					gender[3][0]++;
				} else {
					gender[3][1]++;
				
				}
			}
		}
		
		return gender;
		
	}

}
