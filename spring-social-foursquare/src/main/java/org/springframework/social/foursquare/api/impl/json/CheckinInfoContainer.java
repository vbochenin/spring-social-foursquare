package org.springframework.social.foursquare.api.impl.json;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.springframework.social.foursquare.api.CheckinInfo;

@JsonDeserialize(using=CheckinInfoContainerDeserializer.class)
public class CheckinInfoContainer {
	
	private final CheckinInfo checkinInfo;
	
	public CheckinInfoContainer(CheckinInfo checkinInfo) {
		this.checkinInfo = checkinInfo;
	}
	
	public CheckinInfo getCheckinInfo() {
		return checkinInfo;
	}
}
