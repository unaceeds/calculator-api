package io.swagger.api;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiParam;
import io.swagger.model.Result;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-26T13:30:28.240Z")

@Controller
public class AddApiController implements AddApi {

	private static final Logger log = LoggerFactory
			.getLogger(AddApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@org.springframework.beans.factory.annotation.Autowired
	public AddApiController(ObjectMapper objectMapper,
			HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	@Override
	public ResponseEntity<Result> addABGet(
			@ApiParam(value = "", required = true) @PathVariable("a") String a,
			@ApiParam(value = "", required = true) @PathVariable("b") String b) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<Result>(objectMapper.readValue(
						"{  \"output\" : {    \"c\" : "
								+ (Double.parseDouble(a)
										+ Double.parseDouble(b))
								+ "  },  \"input\" : {    \"op\" : \"add\",    \"a\" : "
								+ a + ",    \"b\" : " + b + "  }}",
						Result.class), HttpStatus.OK);
			} catch (IOException e) {
				log.error(
						"Couldn't serialize response for content type application/json",
						e);
				return new ResponseEntity<Result>(
						HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<Result>(HttpStatus.NOT_IMPLEMENTED);
	}

}
