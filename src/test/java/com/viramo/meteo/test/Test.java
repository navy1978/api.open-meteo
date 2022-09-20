package com.viramo.meteo.test;

import java.util.Arrays;

import com.viramo.meteo.GettingInfo;
import com.viramo.meteo.MeteoUtils;
import com.viramo.meteo.model.DailyParameters;
import com.viramo.meteo.model.DailyResult;
import com.viramo.meteo.model.GeoCoding;
import com.viramo.meteo.model.GeoResult;
import com.viramo.meteo.model.HourlyParameters;
import com.viramo.meteo.model.HourlyResult;

public class Test {

	/**
	 * Testing Hourly service
	 */
	@org.junit.Test
	public void testHourly() {
		GettingInfo info = new GettingInfo();

		try {

			GeoCoding o = info.getData(MeteoUtils.GEOCODING_URL + "Catanzaro", GeoCoding.class);
			for (GeoResult g : o.getResult()) {
				System.out.println(g.getName() + " (" + g.getCountry_code() + ")");

			}

			GeoResult catanzaro = o.getResult().get(0);

			System.out.println("lat:" + catanzaro.getLatitude());
			System.out.println("lon:" + catanzaro.getLongitude());
			System.out.println("-----");
			String newUrl = MeteoUtils.METEO_HOURLY_URL.replace("LAT_PARAM", catanzaro.getLatitude());
			newUrl = newUrl.replaceAll("LONG_PARAM", catanzaro.getLongitude());
			newUrl = newUrl.replaceAll("HOURLY_PARAMS", MeteoUtils
					.formatParams(Arrays.asList(HourlyParameters.dewpoint_2m, HourlyParameters.apparent_temperature)));
			HourlyResult o2 = info.getData(newUrl, HourlyResult.class);

			System.out.println(o2);
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	/**
	 * Testing Daily service
	 */
	@org.junit.Test
	public void testDaily() {

		GettingInfo info = new GettingInfo();

		try {

			GeoCoding o = info.getData(MeteoUtils.GEOCODING_URL + "Catanzaro", GeoCoding.class);
			for (GeoResult g : o.getResult()) {
				System.out.println(g.getName() + " (" + g.getCountry_code() + ")");

			}

			GeoResult catanzaro = o.getResult().get(0);
			String newUrl = MeteoUtils.METEO_DAILY_URL.replace("LAT_PARAM", catanzaro.getLatitude());
			newUrl = newUrl.replaceAll("LONG_PARAM", catanzaro.getLongitude());
			newUrl = newUrl.replaceAll("TIMEZONE_PARAM", catanzaro.getTimezone());
			newUrl = newUrl.replaceAll("DAILY_PARAMS", MeteoUtils.formatParams(
					Arrays.asList(DailyParameters.apparent_temperature_max, DailyParameters.apparent_temperature_min)));
			DailyResult o3 = info.getData(newUrl, DailyResult.class);

			System.out.println(o3);
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

}
