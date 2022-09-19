package com.viramo.meteo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;

public class GettingInfo {

	Gson gson = new Gson();

	public <T> T getData(String url, Class<T> clazz) throws Exception {
		Constructor<?> cons = clazz.getDeclaredConstructor();
		@SuppressWarnings("unchecked")
		T t = (T) cons.newInstance();
		try {
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("User-Agent", "user");
			con.setRequestProperty("Accept-Charset", "UTF-8");
			int responseCode = con.getResponseCode();

			if (responseCode == 2006) {
				throw new Exception("Http error 2006");
			}

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));

			StringBuffer response = new StringBuffer();
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			JSONParser parser = new JSONParser();
			System.out.println(parser);
			try {
				JSONObject jsonObject = (JSONObject) parser.parse(response.toString());
				JSONObject jObj = (JSONObject) jsonObject;
				t = ((T) this.gson.fromJson(jObj.toString(), clazz));

			} catch (ParseException e) {
				e.printStackTrace();
			}
			return t;
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

}
