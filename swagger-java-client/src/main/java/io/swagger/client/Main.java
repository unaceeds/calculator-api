package io.swagger.client;

import java.util.Scanner;

import io.swagger.client.api.DefaultApi;
import io.swagger.client.model.Result;

public class Main {

	public static void main(String[] args) {
		final DefaultApi api = new DefaultApi();
		final Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
		try {
			String a = in.nextLine();
			String b = in.nextLine();
			Result response = api.addABGet(a, b);
			System.out.println(response.getOutput().getC());
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
