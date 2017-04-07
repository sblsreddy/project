/**
 * 
 */
package hub.site.api.contracts;
/**
 * @author Sridhar
 *
 */
public class Address {
private String street;
private String type;
private String city;
private String state;
private Integer zip;
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public Integer getZip() {
	return zip;
}
public void setZip(Integer zip) {
	this.zip = zip;
}
@Override
public String toString() {
	return "Address [street=" + street + ", type=" + type + ", city=" + city + ", state=" + state + ", zip=" + zip
			+ "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((city == null) ? 0 : city.hashCode());
	result = prime * result + ((state == null) ? 0 : state.hashCode());
	result = prime * result + ((street == null) ? 0 : street.hashCode());
	result = prime * result + ((type == null) ? 0 : type.hashCode());
	result = prime * result + ((zip == null) ? 0 : zip.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj) {
		return true;
	}
	if (obj == null) {
		return false;
	}
	if (getClass() != obj.getClass()) {
		return false;
	}
	Address other = (Address) obj;
	if (city == null) {
		if (other.city != null) {
			return false;
		}
	} else if (!city.equals(other.city)) {
		return false;
	}
	if (state == null) {
		if (other.state != null) {
			return false;
		}
	} else if (!state.equals(other.state)) {
		return false;
	}
	if (street == null) {
		if (other.street != null) {
			return false;
		}
	} else if (!street.equals(other.street)) {
		return false;
	}
	if (type == null) {
		if (other.type != null) {
			return false;
		}
	} else if (!type.equals(other.type)) {
		return false;
	}
	if (zip == null) {
		if (other.zip != null) {
			return false;
		}
	} else if (!zip.equals(other.zip)) {
		return false;
	}
	return true;
}

}
