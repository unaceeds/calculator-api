package io.swagger.api;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiParam;
import io.swagger.model.Input;
import io.swagger.model.Result;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-26T13:30:28.240Z")

@Controller
public class DefaultApiController implements DefaultApi {

	private static final Logger log = LoggerFactory
			.getLogger(DefaultApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@org.springframework.beans.factory.annotation.Autowired
	public DefaultApiController(ObjectMapper objectMapper,
			HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	@Override
	public ResponseEntity<Result> rootGet(
			@ApiParam(value = "") @Valid @RequestParam(value = "op", required = false) String op,
			@ApiParam(value = "") @Valid @RequestParam(value = "a", required = false) String a,
			@ApiParam(value = "") @Valid @RequestParam(value = "b", required = false) String b) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				double res = 0.0;
				switch (op) {
				case "add":
					res = (Double.parseDouble(a) + Double.parseDouble(b));
					break;
				case "sub":
					res = (Double.parseDouble(a) - Double.parseDouble(b));
					break;
				case "mul":
					res = (Double.parseDouble(a) * Double.parseDouble(b));
					break;
				case "div":
					res = (Double.parseDouble(a) / Double.parseDouble(b));
					break;
				}
				return new ResponseEntity<Result>(
						objectMapper.readValue(
								"{  \"output\" : {    \"c\" : " + res
										+ "  },  \"input\" : {    \"op\" : \""
										+ op + "\",    \"a\" : " + a
										+ ",    \"b\" : " + b + "  }}",
								Result.class),
						HttpStatus.OK);
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

	@Override
	public ResponseEntity<Result> rootPost(
			@ApiParam(value = "", required = true) @Valid @RequestBody Input input) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				double res = 0.0;
				switch (input.getOp()) {
				case "add":
					res = input.getA() + input.getB();
					break;
				case "sub":
					res = input.getA() - input.getB();
					break;
				case "mul":
					res = input.getA() * input.getB();
					break;
				case "div":
					res = input.getA() / input.getB();
					break;
				}
				return new ResponseEntity<Result>(objectMapper.readValue(
						"{  \"output\" : {    \"c\" : " + res
								+ "  },  \"input\" : {    \"op\" : \""
								+ input.getOp() + "\",    \"a\" : "
								+ input.getA().toString() + ",    \"b\" : "
								+ input.getB().toString() + "  }}",
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
