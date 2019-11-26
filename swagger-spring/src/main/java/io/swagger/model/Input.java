package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Input
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-26T13:44:52.474Z")

public class Input   {
  @JsonProperty("op")
  private String op = null;

  @JsonProperty("a")
  private Double a = null;

  @JsonProperty("b")
  private Double b = null;

  public Input op(String op) {
    this.op = op;
    return this;
  }

  /**
   * Get op
   * @return op
  **/
  @ApiModelProperty(value = "")


  public String getOp() {
    return op;
  }

  public void setOp(String op) {
    this.op = op;
  }

  public Input a(Double a) {
    this.a = a;
    return this;
  }

  /**
   * Get a
   * @return a
  **/
  @ApiModelProperty(value = "")


  public Double getA() {
    return a;
  }

  public void setA(Double a) {
    this.a = a;
  }

  public Input b(Double b) {
    this.b = b;
    return this;
  }

  /**
   * Get b
   * @return b
  **/
  @ApiModelProperty(value = "")


  public Double getB() {
    return b;
  }

  public void setB(Double b) {
    this.b = b;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Input input = (Input) o;
    return Objects.equals(this.op, input.op) &&
        Objects.equals(this.a, input.a) &&
        Objects.equals(this.b, input.b);
  }

  @Override
  public int hashCode() {
    return Objects.hash(op, a, b);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Input {\n");
    
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    a: ").append(toIndentedString(a)).append("\n");
    sb.append("    b: ").append(toIndentedString(b)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

