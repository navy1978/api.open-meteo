package com.viramo.meteo.business;

import java.util.Arrays;

import com.viramo.meteo.GettingInfo;
import com.viramo.meteo.MeteoUtils;
import com.viramo.meteo.model.DailyParameters;
import com.viramo.meteo.model.DailyResult;
import com.viramo.meteo.model.GeoResult;

public class MeteoDaily {

	private GettingInfo info = new GettingInfo();
	private GeoResult geoResult = null;

	public MeteoDaily(GeoResult geoResult) {
		this.geoResult = geoResult;

	}

	public DailyResult getInfo(String geoCoding) {
		DailyResult result = null;
		try {

			System.out.println("lati:" + geoResult.getLatitude());
			System.out.println("long:" + geoResult.getLongitude());
			System.out.println("-----");
			String newUrl = MeteoUtils.METEO_DAILY_URL.replace("LAT_PARAM", geoResult.getLatitude());
			newUrl = newUrl.replaceAll("LONG_PARAM", geoResult.getLongitude());
			newUrl = newUrl.replaceAll("TIMEZONE_PARAM", geoResult.getTimezone());
			newUrl = newUrl.replaceAll("DAILY_PARAMS", MeteoUtils.formatParams(
					Arrays.asList(DailyParameters.apparent_temperature_max, DailyParameters.apparent_temperature_min)));
			result = info.getData(newUrl, DailyResult.class);

			System.out.println(result);
		} catch (Throwable t) {
			t.printStackTrace();
		}

		return result;
	}

}
