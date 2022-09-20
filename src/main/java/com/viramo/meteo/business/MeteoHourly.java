package com.viramo.meteo.business;

import java.util.Arrays;

import com.viramo.meteo.GettingInfo;
import com.viramo.meteo.MeteoUtils;
import com.viramo.meteo.model.GeoResult;
import com.viramo.meteo.model.HourlyParameters;
import com.viramo.meteo.model.HourlyResult;

public class MeteoHourly {

	private GettingInfo info = new GettingInfo();
	private GeoResult geoResult = null;

	public MeteoHourly(GeoResult geoResult) {
		this.geoResult = geoResult;

	}

	public HourlyResult getInfo(String geoCoding) {
		HourlyResult result = null;
		try {

			System.out.println("lati:" + geoResult.getLatitude());
			System.out.println("long:" + geoResult.getLongitude());
			System.out.println("-----");
			String newUrl = MeteoUtils.METEO_HOURLY_URL.replace("LAT_PARAM", geoResult.getLatitude());
			newUrl = newUrl.replaceAll("LONG_PARAM", geoResult.getLongitude());
			newUrl = newUrl.replaceAll("HOURLY_PARAMS", MeteoUtils
					.formatParams(Arrays.asList(HourlyParameters.dewpoint_2m, HourlyParameters.apparent_temperature)));
			result = info.getData(newUrl, HourlyResult.class);

			System.out.println(result);
		} catch (Throwable t) {
			t.printStackTrace();
		}

		return result;
	}

}
