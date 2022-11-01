/**
 * Copyright 2017 (C) Mediastep Software Inc.
 * 
 * Created on : Mar 12, 2019
 * Author     : logan
 * -----------------------------------------------------------------------------
 * Revision History (Release 1.0.0.0)
 * -----------------------------------------------------------------------------
 * VERSION     AUTHOR/      DESCRIPTION OF CHANGE
 * OLD/NEW     DATE             RFC NO
 * -----------------------------------------------------------------------------
 *  --/1.0  | logan           | Initial Create.
 *          | Mar 12, 2019     |
 * ---------|-----------------|------------------------------------------------- 
 */
package com.mediastep.beehive.shared.service.deserialize;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * @author logan
 *
 */
public class ArrayToStringConvert extends JsonDeserializer<String> {
	
	@Override
	public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		ObjectMapper mapper = (ObjectMapper) p.getCodec();
		  JsonNode node = p.readValueAsTree();
		  String str = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(node);
		return str;
	}

}
