/*
 * WSO2 API Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.publisher.api.v1.dto;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WSDL binding related information 
 */
@ApiModel(description = "WSDL binding related information ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-18T19:19:21.534+05:30")
public class APIDefinitionValidationResponseWsdlInfoBindingInfoDTO {
  @SerializedName("hasHttpBinding")
  private Boolean hasHttpBinding = null;

  @SerializedName("hasSoapBinding")
  private Boolean hasSoapBinding = null;

  public APIDefinitionValidationResponseWsdlInfoBindingInfoDTO hasHttpBinding(Boolean hasHttpBinding) {
    this.hasHttpBinding = hasHttpBinding;
    return this;
  }

   /**
   * Indicates whether the WSDL contains HTTP Bindings
   * @return hasHttpBinding
  **/
  @ApiModelProperty(value = "Indicates whether the WSDL contains HTTP Bindings")
  public Boolean isHasHttpBinding() {
    return hasHttpBinding;
  }

  public void setHasHttpBinding(Boolean hasHttpBinding) {
    this.hasHttpBinding = hasHttpBinding;
  }

  public APIDefinitionValidationResponseWsdlInfoBindingInfoDTO hasSoapBinding(Boolean hasSoapBinding) {
    this.hasSoapBinding = hasSoapBinding;
    return this;
  }

   /**
   * Indicates whether the WSDL contains SOAP Bindings
   * @return hasSoapBinding
  **/
  @ApiModelProperty(value = "Indicates whether the WSDL contains SOAP Bindings")
  public Boolean isHasSoapBinding() {
    return hasSoapBinding;
  }

  public void setHasSoapBinding(Boolean hasSoapBinding) {
    this.hasSoapBinding = hasSoapBinding;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIDefinitionValidationResponseWsdlInfoBindingInfoDTO apIDefinitionValidationResponseWsdlInfoBindingInfo = (APIDefinitionValidationResponseWsdlInfoBindingInfoDTO) o;
    return Objects.equals(this.hasHttpBinding, apIDefinitionValidationResponseWsdlInfoBindingInfo.hasHttpBinding) &&
        Objects.equals(this.hasSoapBinding, apIDefinitionValidationResponseWsdlInfoBindingInfo.hasSoapBinding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasHttpBinding, hasSoapBinding);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIDefinitionValidationResponseWsdlInfoBindingInfoDTO {\n");
    
    sb.append("    hasHttpBinding: ").append(toIndentedString(hasHttpBinding)).append("\n");
    sb.append("    hasSoapBinding: ").append(toIndentedString(hasSoapBinding)).append("\n");
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

