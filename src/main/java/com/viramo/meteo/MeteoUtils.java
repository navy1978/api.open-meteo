package com.viramo.meteo;

import java.util.List;

public class MeteoUtils {

	public final static String GEOCODING_URL = "https://geocoding-api.open-meteo.com/v1/search?name=";

	public final static String METEO_HOURLY_URL = "https://api.open-meteo.com/v1/forecast?latitude=LAT_PARAM&longitude=LONG_PARAM&hourly=HOURLY_PARAMS";
	public final static String METEO_DAILY_URL = "https://api.open-meteo.com/v1/forecast?latitude=LAT_PARAM&longitude=LONG_PARAM&timezone=TIMEZONE_PARAM&daily=DAILY_PARAMS";

	public static String formatParams(List<String> params) {
		String result = "";
		for (String s : params) {
			result += s + ",";
		}
		if (result.endsWith(",")) {
			result = result.substring(0, result.length() - 1);

		}
		return result;
	}
}
