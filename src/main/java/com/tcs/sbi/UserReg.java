package com.tcs.sbi;

import com.pwd_util.PwdSecurityService;

public class UserReg {
	
	public static void main(String[] args) {
		
		PwdSecurityService pwd = new PwdSecurityService();
		
		String encode = pwd.encode("manish");
		
		System.out.println(encode);
	}

}
