package com.tg.perser;

import com.google.gson.Gson;
import com.tg.perser.model.JsonModel;

public class MyJsonPerser {

	public static void main(String[] ar) {
		String jsonObject = "{"
				+ "\"id\" : \"001\","
				+ "\"name\" : \"Tanmoy\""
				+ "}";

		Gson gson = new Gson();
		JsonModel model = gson.fromJson(jsonObject, JsonModel.class);
		System.out.println(model);

	}
}
