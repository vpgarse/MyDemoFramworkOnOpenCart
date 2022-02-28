/**
 * 
 */
package com.PageFactory;

import java.util.HashMap;

/**
 * @author Vaibhav Garse
 *
 */
public class HashMapcredentialClass {

	/**
	 * @param args
	 * @param Name 
	 */
	

	
	public static  HashMap<String, String> getCredentialMaP()
	{
		HashMap<String ,String> userMap=new HashMap<String,String>();
		userMap.put("Vaibhav", "VaibhavGarse:@12345");
		userMap.put("Rahul", "Rahul:00000");
		userMap.put("Sachin", "Sachin:88888");
		userMap.put("Ram", "Ram:Ram@123");
		userMap.put("Rajat", "Rajat:22222");
		return userMap;
	}
	private static String getUserName(String Name) {
		String Credential = getCredentialMaP().get(Name);
		return Credential.split(":")[0];
	}
	private static String getPassword(String Name) {
		String Credential = getCredentialMaP().get(Name);
		return Credential.split(":")[1];
	}
}
