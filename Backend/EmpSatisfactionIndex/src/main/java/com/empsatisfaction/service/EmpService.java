package com.empsatisfaction.service;

import org.springframework.stereotype.Service;

@Service
public class EmpService {
	
	public int calculateIndex(String ques1,String ques2,String ques3,int ques4) {
		
		if(ques1.equals("yes") && ques2.equals("yes") && ques3.equals("yes") && ques4 <= 2) {
			return 5;
		}
		else if(ques1.equals("yes") && ques2.equals("yes") && ques3.equals("yes") && ques4 > 2) {
			return 4;
		}
		else if(ques1.equals("yes") && ques2.equals("yes") && ques3.equals("no") && ques4 <= 2) {
			return 4;
		}
		else if(ques1.equals("yes") && ques2.equals("yes") && ques3.equals("yes") && ques4 <= 2) {
			return 4;
		}
		else if(ques1.equals("yes") && ques2.equals("yes") && ques3.equals("yes") && ques4 <= 2) {
			return 4;
		}
		else {
			return 3;
		}
	}

}
