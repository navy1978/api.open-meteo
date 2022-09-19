package com.viramo.meteo.model;

import java.util.List;

/**
 * 
 * GeoResult
 *
 */
public class GeoResult {

	private String elevation;
	private String country;
	private String admin1_id;
	private String timezone;
	private String latitude;
	private String admin3_id;
	private String admin4_id;
	private String population;
	private String country_code;
	private String name;
	private String admin1;
	private String ranking;
	private String id;
	private String feature_code;
	private List<String> postcodes;
	private String country_id;
	private String admin3;
	private String longitude;
	private String admin4;

	public GeoResult() {
	}

	public String getElevation() {
		return elevation;
	}

	public void setElevation(String elevation) {
		this.elevation = elevation;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAdmin1_id() {
		return admin1_id;
	}

	public void setAdmin1_id(String admin1_id) {
		this.admin1_id = admin1_id;
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

	public String getAdmin3_id() {
		return admin3_id;
	}

	public void setAdmin3_id(String admin3_id) {
		this.admin3_id = admin3_id;
	}

	public String getAdmin4_id() {
		return admin4_id;
	}

	public void setAdmin4_id(String admin4_id) {
		this.admin4_id = admin4_id;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdmin1() {
		return admin1;
	}

	public void setAdmin1(String admin1) {
		this.admin1 = admin1;
	}

	public String getRanking() {
		return ranking;
	}

	public void setRanking(String ranking) {
		this.ranking = ranking;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFeature_code() {
		return feature_code;
	}

	public void setFeature_code(String feature_code) {
		this.feature_code = feature_code;
	}

	public List<String> getPostcodes() {
		return postcodes;
	}

	public void setPostcodes(List<String> postcodes) {
		this.postcodes = postcodes;
	}

	public String getCountry_id() {
		return country_id;
	}

	public void setCountry_id(String country_id) {
		this.country_id = country_id;
	}

	public String getAdmin3() {
		return admin3;
	}

	public void setAdmin3(String admin3) {
		this.admin3 = admin3;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getAdmin4() {
		return admin4;
	}

	public void setAdmin4(String admin4) {
		this.admin4 = admin4;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((admin1 == null) ? 0 : admin1.hashCode());
		result = prime * result + ((admin1_id == null) ? 0 : admin1_id.hashCode());
		result = prime * result + ((admin3 == null) ? 0 : admin3.hashCode());
		result = prime * result + ((admin3_id == null) ? 0 : admin3_id.hashCode());
		result = prime * result + ((admin4 == null) ? 0 : admin4.hashCode());
		result = prime * result + ((admin4_id == null) ? 0 : admin4_id.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((country_code == null) ? 0 : country_code.hashCode());
		result = prime * result + ((country_id == null) ? 0 : country_id.hashCode());
		result = prime * result + ((elevation == null) ? 0 : elevation.hashCode());
		result = prime * result + ((feature_code == null) ? 0 : feature_code.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((latitude == null) ? 0 : latitude.hashCode());
		result = prime * result + ((longitude == null) ? 0 : longitude.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((population == null) ? 0 : population.hashCode());
		result = prime * result + ((postcodes == null) ? 0 : postcodes.hashCode());
		result = prime * result + ((ranking == null) ? 0 : ranking.hashCode());
		result = prime * result + ((timezone == null) ? 0 : timezone.hashCode());
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
		GeoResult other = (GeoResult) obj;
		if (admin1 == null) {
			if (other.admin1 != null)
				return false;
		} else if (!admin1.equals(other.admin1))
			return false;
		if (admin1_id == null) {
			if (other.admin1_id != null)
				return false;
		} else if (!admin1_id.equals(other.admin1_id))
			return false;
		if (admin3 == null) {
			if (other.admin3 != null)
				return false;
		} else if (!admin3.equals(other.admin3))
			return false;
		if (admin3_id == null) {
			if (other.admin3_id != null)
				return false;
		} else if (!admin3_id.equals(other.admin3_id))
			return false;
		if (admin4 == null) {
			if (other.admin4 != null)
				return false;
		} else if (!admin4.equals(other.admin4))
			return false;
		if (admin4_id == null) {
			if (other.admin4_id != null)
				return false;
		} else if (!admin4_id.equals(other.admin4_id))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (country_code == null) {
			if (other.country_code != null)
				return false;
		} else if (!country_code.equals(other.country_code))
			return false;
		if (country_id == null) {
			if (other.country_id != null)
				return false;
		} else if (!country_id.equals(other.country_id))
			return false;
		if (elevation == null) {
			if (other.elevation != null)
				return false;
		} else if (!elevation.equals(other.elevation))
			return false;
		if (feature_code == null) {
			if (other.feature_code != null)
				return false;
		} else if (!feature_code.equals(other.feature_code))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (population == null) {
			if (other.population != null)
				return false;
		} else if (!population.equals(other.population))
			return false;
		if (postcodes == null) {
			if (other.postcodes != null)
				return false;
		} else if (!postcodes.equals(other.postcodes))
			return false;
		if (ranking == null) {
			if (other.ranking != null)
				return false;
		} else if (!ranking.equals(other.ranking))
			return false;
		if (timezone == null) {
			if (other.timezone != null)
				return false;
		} else if (!timezone.equals(other.timezone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GeoResult [elevation=" + elevation + ", country=" + country + ", admin1_id=" + admin1_id + ", timezone="
				+ timezone + ", latitude=" + latitude + ", admin3_id=" + admin3_id + ", admin4_id=" + admin4_id
				+ ", population=" + population + ", country_code=" + country_code + ", name=" + name + ", admin1="
				+ admin1 + ", ranking=" + ranking + ", id=" + id + ", feature_code=" + feature_code + ", postcodes="
				+ postcodes + ", country_id=" + country_id + ", admin3=" + admin3 + ", longitude=" + longitude
				+ ", admin4=" + admin4 + "]";
	}

}
