package org.springframework.social.foursquare.api.impl.json;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import org.springframework.social.foursquare.api.ExploreResponse;

public class ExploreResponseContainerDeserializer extends AbstractFoursquareDeserializer<ExploreResponseContainer> {
    @Override 
    public ExploreResponseContainer deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException, JsonProcessingException {
        return deserializeResponseObject(jp, ExploreResponseContainer.class, ExploreResponse.class);
    }
}
