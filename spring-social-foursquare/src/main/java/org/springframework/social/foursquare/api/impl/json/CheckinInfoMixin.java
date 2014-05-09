package org.springframework.social.foursquare.api.impl.json;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.social.foursquare.api.Venue;

@JsonIgnoreProperties(ignoreUnknown=true)
abstract class CheckinInfoMixin {
	@JsonCreator
	CheckinInfoMixin(
			@JsonProperty("count") int total,
			@JsonProperty("items") List<Venue> venues){}
}
