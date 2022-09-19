package com.viramo.meteo;

public class MeteoCostants {

	public final static String GEOCODING_URL = "https://geocoding-api.open-meteo.com/v1/search?name=";

	public final static String METEO_HOURLY_URL = "https://api.open-meteo.com/v1/forecast?latitude=LAT_PARAM&longitude=LONG_PARAM&hourly=HOURLY_PARAMS";
	public final static String METEO_DAILY_URL = "https://api.open-meteo.com/v1/forecast?latitude=LAT_PARAM&longitude=LONG_PARAM&timezone=TIMEZONE_PARAM&daily=DAILY_PARAMS";

}
