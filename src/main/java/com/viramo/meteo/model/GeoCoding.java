package com.viramo.meteo.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * GeoCoding
 *
 */
public class GeoCoding {

	private String generationtime_ms;
	private List<GeoResult> results = new ArrayList<GeoResult>();

	public GeoCoding() {
	}

	public String getGenerationtime_ms() {
		return generationtime_ms;
	}

	public void setGenerationtime_ms(String generationtime_ms) {
		this.generationtime_ms = generationtime_ms;
	}

	public List<GeoResult> getResult() {
		return results;
	}

	public void setResult(List<GeoResult> result) {
		this.results = result;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((generationtime_ms == null) ? 0 : generationtime_ms.hashCode());
		result = prime * result + ((this.results == null) ? 0 : this.results.hashCode());
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
		GeoCoding other = (GeoCoding) obj;
		if (generationtime_ms == null) {
			if (other.generationtime_ms != null)
				return false;
		} else if (!generationtime_ms.equals(other.generationtime_ms))
			return false;
		if (results == null) {
			if (other.results != null)
				return false;
		} else if (!results.equals(other.results))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GeoCoding [generationtime_ms=" + generationtime_ms + ", result=" + results + "]";
	}

}
