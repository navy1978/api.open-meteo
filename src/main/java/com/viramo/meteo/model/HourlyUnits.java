package com.viramo.meteo.model;

/**
 * 
 * HourlyUnits
 *
 */
public class HourlyUnits {
	private String apparent_temperature;
	private String relativehumidity_2m;
	private String time;

	public HourlyUnits() {
	}

	public String getApparent_temperature() {
		return apparent_temperature;
	}

	public void setApparent_temperature(String apparent_temperature) {
		this.apparent_temperature = apparent_temperature;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getRelativehumidity_2m() {
		return relativehumidity_2m;
	}

	public void setRelativehumidity_2m(String relativehumidity_2m) {
		this.relativehumidity_2m = relativehumidity_2m;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apparent_temperature == null) ? 0 : apparent_temperature.hashCode());
		result = prime * result + ((relativehumidity_2m == null) ? 0 : relativehumidity_2m.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
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
		HourlyUnits other = (HourlyUnits) obj;
		if (apparent_temperature == null) {
			if (other.apparent_temperature != null)
				return false;
		} else if (!apparent_temperature.equals(other.apparent_temperature))
			return false;
		if (relativehumidity_2m == null) {
			if (other.relativehumidity_2m != null)
				return false;
		} else if (!relativehumidity_2m.equals(other.relativehumidity_2m))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HourlyUnits [apparent_temperature=" + apparent_temperature + ", relativehumidity_2m="
				+ relativehumidity_2m + ", time=" + time + "]";
	}

}
