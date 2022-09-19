package com.viramo.meteo.model;

import java.util.List;

/**
 * 
 * Daily class
 *
 */
public class Daily {
	private List<String> time;

	private List<String> temperature_2m_max;

	private List<String> temperature_2m_min;
	private List<String> apparent_temperature_max;
	private List<String> apparent_temperature_min;
	private List<String> precipitation_sum;
	private List<String> rain_sum;
	private List<String> showers_sum;
	private List<String> snowfall_sum;
	private List<String> precipitation_hours;
	private List<String> weathercode;
	private List<String> sunrise;
	private List<String> sunset;
	private List<String> windspeed_10m_max;
	private List<String> windgusts_10m_max;
	private List<String> winddirection_10m_dominant;
	private List<String> shortwave_radiation_sum;
	private List<String> et0_fao_evapotranspiration;

	public List<String> getTime() {
		return time;
	}

	public void setTime(List<String> time) {
		this.time = time;
	}

	public List<String> getTemperature_2m_max() {
		return temperature_2m_max;
	}

	public void setTemperature_2m_max(List<String> temperature_2m_max) {
		this.temperature_2m_max = temperature_2m_max;
	}

	public List<String> getTemperature_2m_min() {
		return temperature_2m_min;
	}

	public void setTemperature_2m_min(List<String> temperature_2m_min) {
		this.temperature_2m_min = temperature_2m_min;
	}

	public List<String> getApparent_temperature_max() {
		return apparent_temperature_max;
	}

	public void setApparent_temperature_max(List<String> apparent_temperature_max) {
		this.apparent_temperature_max = apparent_temperature_max;
	}

	public List<String> getApparent_temperature_min() {
		return apparent_temperature_min;
	}

	public void setApparent_temperature_min(List<String> apparent_temperature_min) {
		this.apparent_temperature_min = apparent_temperature_min;
	}

	public List<String> getPrecipitation_sum() {
		return precipitation_sum;
	}

	public void setPrecipitation_sum(List<String> precipitation_sum) {
		this.precipitation_sum = precipitation_sum;
	}

	public List<String> getRain_sum() {
		return rain_sum;
	}

	public void setRain_sum(List<String> rain_sum) {
		this.rain_sum = rain_sum;
	}

	public List<String> getShowers_sum() {
		return showers_sum;
	}

	public void setShowers_sum(List<String> showers_sum) {
		this.showers_sum = showers_sum;
	}

	public List<String> getSnowfall_sum() {
		return snowfall_sum;
	}

	public void setSnowfall_sum(List<String> snowfall_sum) {
		this.snowfall_sum = snowfall_sum;
	}

	public List<String> getPrecipitation_hours() {
		return precipitation_hours;
	}

	public void setPrecipitation_hours(List<String> precipitation_hours) {
		this.precipitation_hours = precipitation_hours;
	}

	public List<String> getWeathercode() {
		return weathercode;
	}

	public void setWeathercode(List<String> weathercode) {
		this.weathercode = weathercode;
	}

	public List<String> getSunrise() {
		return sunrise;
	}

	public void setSunrise(List<String> sunrise) {
		this.sunrise = sunrise;
	}

	public List<String> getSunset() {
		return sunset;
	}

	public void setSunset(List<String> sunset) {
		this.sunset = sunset;
	}

	public List<String> getWindspeed_10m_max() {
		return windspeed_10m_max;
	}

	public void setWindspeed_10m_max(List<String> windspeed_10m_max) {
		this.windspeed_10m_max = windspeed_10m_max;
	}

	public List<String> getWindgusts_10m_max() {
		return windgusts_10m_max;
	}

	public void setWindgusts_10m_max(List<String> windgusts_10m_max) {
		this.windgusts_10m_max = windgusts_10m_max;
	}

	public List<String> getWinddirection_10m_dominant() {
		return winddirection_10m_dominant;
	}

	public void setWinddirection_10m_dominant(List<String> winddirection_10m_dominant) {
		this.winddirection_10m_dominant = winddirection_10m_dominant;
	}

	public List<String> getShortwave_radiation_sum() {
		return shortwave_radiation_sum;
	}

	public void setShortwave_radiation_sum(List<String> shortwave_radiation_sum) {
		this.shortwave_radiation_sum = shortwave_radiation_sum;
	}

	public List<String> getEt0_fao_evapotranspiration() {
		return et0_fao_evapotranspiration;
	}

	public void setEt0_fao_evapotranspiration(List<String> et0_fao_evapotranspiration) {
		this.et0_fao_evapotranspiration = et0_fao_evapotranspiration;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apparent_temperature_max == null) ? 0 : apparent_temperature_max.hashCode());
		result = prime * result + ((apparent_temperature_min == null) ? 0 : apparent_temperature_min.hashCode());
		result = prime * result + ((et0_fao_evapotranspiration == null) ? 0 : et0_fao_evapotranspiration.hashCode());
		result = prime * result + ((precipitation_hours == null) ? 0 : precipitation_hours.hashCode());
		result = prime * result + ((precipitation_sum == null) ? 0 : precipitation_sum.hashCode());
		result = prime * result + ((rain_sum == null) ? 0 : rain_sum.hashCode());
		result = prime * result + ((shortwave_radiation_sum == null) ? 0 : shortwave_radiation_sum.hashCode());
		result = prime * result + ((showers_sum == null) ? 0 : showers_sum.hashCode());
		result = prime * result + ((snowfall_sum == null) ? 0 : snowfall_sum.hashCode());
		result = prime * result + ((sunrise == null) ? 0 : sunrise.hashCode());
		result = prime * result + ((sunset == null) ? 0 : sunset.hashCode());
		result = prime * result + ((temperature_2m_max == null) ? 0 : temperature_2m_max.hashCode());
		result = prime * result + ((temperature_2m_min == null) ? 0 : temperature_2m_min.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		result = prime * result + ((weathercode == null) ? 0 : weathercode.hashCode());
		result = prime * result + ((winddirection_10m_dominant == null) ? 0 : winddirection_10m_dominant.hashCode());
		result = prime * result + ((windgusts_10m_max == null) ? 0 : windgusts_10m_max.hashCode());
		result = prime * result + ((windspeed_10m_max == null) ? 0 : windspeed_10m_max.hashCode());
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
		Daily other = (Daily) obj;
		if (apparent_temperature_max == null) {
			if (other.apparent_temperature_max != null)
				return false;
		} else if (!apparent_temperature_max.equals(other.apparent_temperature_max))
			return false;
		if (apparent_temperature_min == null) {
			if (other.apparent_temperature_min != null)
				return false;
		} else if (!apparent_temperature_min.equals(other.apparent_temperature_min))
			return false;
		if (et0_fao_evapotranspiration == null) {
			if (other.et0_fao_evapotranspiration != null)
				return false;
		} else if (!et0_fao_evapotranspiration.equals(other.et0_fao_evapotranspiration))
			return false;
		if (precipitation_hours == null) {
			if (other.precipitation_hours != null)
				return false;
		} else if (!precipitation_hours.equals(other.precipitation_hours))
			return false;
		if (precipitation_sum == null) {
			if (other.precipitation_sum != null)
				return false;
		} else if (!precipitation_sum.equals(other.precipitation_sum))
			return false;
		if (rain_sum == null) {
			if (other.rain_sum != null)
				return false;
		} else if (!rain_sum.equals(other.rain_sum))
			return false;
		if (shortwave_radiation_sum == null) {
			if (other.shortwave_radiation_sum != null)
				return false;
		} else if (!shortwave_radiation_sum.equals(other.shortwave_radiation_sum))
			return false;
		if (showers_sum == null) {
			if (other.showers_sum != null)
				return false;
		} else if (!showers_sum.equals(other.showers_sum))
			return false;
		if (snowfall_sum == null) {
			if (other.snowfall_sum != null)
				return false;
		} else if (!snowfall_sum.equals(other.snowfall_sum))
			return false;
		if (sunrise == null) {
			if (other.sunrise != null)
				return false;
		} else if (!sunrise.equals(other.sunrise))
			return false;
		if (sunset == null) {
			if (other.sunset != null)
				return false;
		} else if (!sunset.equals(other.sunset))
			return false;
		if (temperature_2m_max == null) {
			if (other.temperature_2m_max != null)
				return false;
		} else if (!temperature_2m_max.equals(other.temperature_2m_max))
			return false;
		if (temperature_2m_min == null) {
			if (other.temperature_2m_min != null)
				return false;
		} else if (!temperature_2m_min.equals(other.temperature_2m_min))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		if (weathercode == null) {
			if (other.weathercode != null)
				return false;
		} else if (!weathercode.equals(other.weathercode))
			return false;
		if (winddirection_10m_dominant == null) {
			if (other.winddirection_10m_dominant != null)
				return false;
		} else if (!winddirection_10m_dominant.equals(other.winddirection_10m_dominant))
			return false;
		if (windgusts_10m_max == null) {
			if (other.windgusts_10m_max != null)
				return false;
		} else if (!windgusts_10m_max.equals(other.windgusts_10m_max))
			return false;
		if (windspeed_10m_max == null) {
			if (other.windspeed_10m_max != null)
				return false;
		} else if (!windspeed_10m_max.equals(other.windspeed_10m_max))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Daily [time=" + time + ", temperature_2m_max=" + temperature_2m_max + ", temperature_2m_min="
				+ temperature_2m_min + ", apparent_temperature_max=" + apparent_temperature_max
				+ ", apparent_temperature_min=" + apparent_temperature_min + ", precipitation_sum=" + precipitation_sum
				+ ", rain_sum=" + rain_sum + ", showers_sum=" + showers_sum + ", snowfall_sum=" + snowfall_sum
				+ ", precipitation_hours=" + precipitation_hours + ", weathercode=" + weathercode + ", sunrise="
				+ sunrise + ", sunset=" + sunset + ", windspeed_10m_max=" + windspeed_10m_max + ", windgusts_10m_max="
				+ windgusts_10m_max + ", winddirection_10m_dominant=" + winddirection_10m_dominant
				+ ", shortwave_radiation_sum=" + shortwave_radiation_sum + ", et0_fao_evapotranspiration="
				+ et0_fao_evapotranspiration + "]";
	}

}
