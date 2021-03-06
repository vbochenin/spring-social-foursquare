package org.springframework.social.foursquare.api.impl.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.social.foursquare.api.FoursquareUser;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class SpecialMixin {
    @JsonCreator
    public SpecialMixin(
            @JsonProperty("id") String id,
            @JsonProperty("type") String type,
            @JsonProperty("message") String message,
            @JsonProperty("description") String description,
            @JsonProperty("unlocked") boolean unlocked,
            @JsonProperty("icon") String icon,
            @JsonProperty("title") String title,
            @JsonProperty("state") String state) {
    }


    @JsonProperty("provider")
    String provider;

    @JsonProperty("redemption")
    String redemption;

    @JsonProperty("progress")
    int progress;

    @JsonProperty("progressDescription")
    String progressDescription;

    @JsonProperty("detail")
    int detail;

    @JsonProperty("target")
    int target;

    @JsonProperty("friendsHere")
    List<FoursquareUser> friendsHere;
}
