package com.viramo.meteo.model;

/**
 * 
 * Daily result
 *
 */

public class DailyResult {

	private String latitude;
	private String longitude;
	private String generationtime_ms;
	private String utc_offset_seconds;
	private String timezone;
	private String timezone_abbreviation;
	private String elevation;
	private DailyUnits daily_units;
	private Daily daily;

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getGenerationtime_ms() {
		return generationtime_ms;
	}

	public void setGenerationtime_ms(String generationtime_ms) {
		this.generationtime_ms = generationtime_ms;
	}

	public String getUtc_offset_seconds() {
		return utc_offset_seconds;
	}

	public void setUtc_offset_seconds(String utc_offset_seconds) {
		this.utc_offset_seconds = utc_offset_seconds;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public String getTimezone_abbreviation() {
		return timezone_abbreviation;
	}

	public void setTimezone_abbreviation(String timezone_abbreviation) {
		this.timezone_abbreviation = timezone_abbreviation;
	}

	public String getElevation() {
		return elevation;
	}

	public void setElevation(String elevation) {
		this.elevation = elevation;
	}

	public DailyUnits getDaily_units() {
		return daily_units;
	}

	public void setDaily_units(DailyUnits daily_units) {
		this.daily_units = daily_units;
	}

	public Daily getDaily() {
		return daily;
	}

	public void setDaily(Daily daily) {
		this.daily = daily;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((daily == null) ? 0 : daily.hashCode());
		result = prime * result + ((daily_units == null) ? 0 : daily_units.hashCode());
		result = prime * result + ((elevation == null) ? 0 : elevation.hashCode());
		result = prime * result + ((generationtime_ms == null) ? 0 : generationtime_ms.hashCode());
		result = prime * result + ((latitude == null) ? 0 : latitude.hashCode());
		result = prime * result + ((longitude == null) ? 0 : longitude.hashCode());
		result = prime * result + ((timezone == null) ? 0 : timezone.hashCode());
		result = prime * result + ((timezone_abbreviation == null) ? 0 : timezone_abbreviation.hashCode());
		result = prime * result + ((utc_offset_seconds == null) ? 0 : utc_offset_seconds.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DailyResult other = (DailyResult) obj;
		if (daily == null) {
			if (other.daily != null)
				return false;
		} else if (!daily.equals(other.daily))
			return false;
		if (daily_units == null) {
			if (other.daily_units != null)
				return false;
		} else if (!daily_units.equals(other.daily_units))
			return false;
		if (elevation == null) {
			if (other.elevation != null)
				return false;
		} else if (!elevation.equals(other.elevation))
			return false;
		if (generationtime_ms == null) {
			if (other.generationtime_ms != null)
				return false;
		} else if (!generationtime_ms.equals(other.generationtime_ms))
			return false;
		if (latitude == null) {
			if (other.latitude != null)
				return false;
		} else if (!latitude.equals(other.latitude))
			return false;
		if (longitude == null) {
			if (other.longitude != null)
				return false;
		} else if (!longitude.equals(other.longitude))
			return false;
		if (timezone == null) {
			if (other.timezone != null)
				return false;
		} else if (!timezone.equals(other.timezone))
			return false;
		if (timezone_abbreviation == null) {
			if (other.timezone_abbreviation != null)
				return false;
		} else if (!timezone_abbreviation.equals(other.timezone_abbreviation))
			return false;
		if (utc_offset_seconds == null) {
			if (other.utc_offset_seconds != null)
				return false;
		} else if (!utc_offset_seconds.equals(other.utc_offset_seconds))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DailyResult [latitude=" + latitude + ", longitude=" + longitude + ", generationtime_ms="
				+ generationtime_ms + ", utc_offset_seconds=" + utc_offset_seconds + ", timezone=" + timezone
				+ ", timezone_abbreviation=" + timezone_abbreviation + ", elevation=" + elevation + ", daily_units="
				+ daily_units + ", daily=" + daily + "]";
	}

}
