package com.viramo.meteo.business;

import java.util.ArrayList;
import java.util.List;

import com.viramo.meteo.GettingInfo;
import com.viramo.meteo.MeteoUtils;
import com.viramo.meteo.model.GeoCoding;
import com.viramo.meteo.model.GeoResult;

public class MeteoSearch {

	private GettingInfo info = new GettingInfo();
	private GeoCoding geoCoding = null;
	private String geoString = null;

	public MeteoSearch(String geoString) {
		this.geoString = geoString;
	}

	public List<GeoResult> search() {
		List<GeoResult> result = new ArrayList<>();
		try {
			geoCoding = info.getData(MeteoUtils.GEOCODING_URL + this.geoString, GeoCoding.class);
			result = geoCoding.getResult();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

}
