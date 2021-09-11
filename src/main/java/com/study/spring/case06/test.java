package com.study.spring.case06;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;


public class test {

	public static void main(String[] args) {
		String inputString = "adfadgabjnhgfjdyseradnfgdzaetrmgfs";
		String[] check =  inputString.split("");
		Integer ansInteger = 0;
		Set<String> subStrings = new LinkedHashSet<String>();

		System.out.println(Arrays.toString(check));
		
        if (inputString.equals("")){
            System.out.println("Answer :"+ 0);
        	return;
        }
        
		for (int i = 0; i < check.length; i++) {
			subStrings.clear();
			subStrings.add(check[i]);
			for(int j= i+1; j<check.length ; j++ ) {
				if (!subStrings.contains(check[j])) {
					subStrings.add(check[j]);
				}else {
					break;
				}
			}
			System.out.println(subStrings.toString());
			System.out.println("substring :"+subStrings.size());
			System.out.println("answer:"+ansInteger);
			if (subStrings.size()>ansInteger) {
				ansInteger = subStrings.size();
				System.out.println("Update:"+ansInteger);
			}
			
		}
		
		
	}

}
