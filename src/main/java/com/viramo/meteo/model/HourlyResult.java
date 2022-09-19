package com.viramo.meteo.model;

/**
 * 
 * Hourly result
 *
 */
public class HourlyResult {
	private String elevation;
	private HourlyUnits hourly_units;
	private Hourly hourly;
	private String generationtime_ms;
	private String timezone_abbreviation;
	private String timezone;
	private String latitude;
	private String longitude;
	private String utc_offset_seconds;

	public String getElevation() {
		return elevation;
	}

	public void setElevation(String elevation) {
		this.elevation = elevation;
	}

	public HourlyUnits getHourly_units() {
		return hourly_units;
	}

	public void setHourly_units(HourlyUnits hourly_units) {
		this.hourly_units = hourly_units;
	}

	public Hourly getHourly() {
		return hourly;
	}

	public void setHourly(Hourly hourly) {
		this.hourly = hourly;
	}

	public String getGenerationtime_ms() {
		return generationtime_ms;
	}

	public void setGenerationtime_ms(String generationtime_ms) {
		this.generationtime_ms = generationtime_ms;
	}

	public String getTimezone_abbreviation() {
		return timezone_abbreviation;
	}

	public void setTimezone_abbreviation(String timezone_abbreviation) {
		this.timezone_abbreviation = timezone_abbreviation;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

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

	public String getUtc_offset_seconds() {
		return utc_offset_seconds;
	}

	public void setUtc_offset_seconds(String utc_offset_seconds) {
		this.utc_offset_seconds = utc_offset_seconds;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((elevation == null) ? 0 : elevation.hashCode());
		result = prime * result + ((generationtime_ms == null) ? 0 : generationtime_ms.hashCode());
		result = prime * result + ((hourly == null) ? 0 : hourly.hashCode());
		result = prime * result + ((hourly_units == null) ? 0 : hourly_units.hashCode());
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
		HourlyResult other = (HourlyResult) obj;
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
		if (hourly == null) {
			if (other.hourly != null)
				return false;
		} else if (!hourly.equals(other.hourly))
			return false;
		if (hourly_units == null) {
			if (other.hourly_units != null)
				return false;
		} else if (!hourly_units.equals(other.hourly_units))
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
		return "HourlyResult [elevation=" + elevation + ", hourly_units=" + hourly_units + ", hourly=" + hourly
				+ ", generationtime_ms=" + generationtime_ms + ", timezone_abbreviation=" + timezone_abbreviation
				+ ", timezone=" + timezone + ", latitude=" + latitude + ", longitude=" + longitude
				+ ", utc_offset_seconds=" + utc_offset_seconds + "]";
	}

}
