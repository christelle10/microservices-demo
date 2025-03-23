package com.microservices.enrollment.enrollment.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * EnrollmentRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-23T18:57:13.366899+08:00[Asia/Manila]")
public class EnrollmentRequest {

  private Integer studentId;

  private Integer schoolId;

  public EnrollmentRequest studentId(Integer studentId) {
    this.studentId = studentId;
    return this;
  }

  /**
   * Get studentId
   * @return studentId
  */
  
  @Schema(name = "studentId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("studentId")
  public Integer getStudentId() {
    return studentId;
  }

  public void setStudentId(Integer studentId) {
    this.studentId = studentId;
  }

  public EnrollmentRequest schoolId(Integer schoolId) {
    this.schoolId = schoolId;
    return this;
  }

  /**
   * Get schoolId
   * @return schoolId
  */
  
  @Schema(name = "schoolId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schoolId")
  public Integer getSchoolId() {
    return schoolId;
  }

  public void setSchoolId(Integer schoolId) {
    this.schoolId = schoolId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnrollmentRequest enrollmentRequest = (EnrollmentRequest) o;
    return Objects.equals(this.studentId, enrollmentRequest.studentId) &&
        Objects.equals(this.schoolId, enrollmentRequest.schoolId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(studentId, schoolId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnrollmentRequest {\n");
    sb.append("    studentId: ").append(toIndentedString(studentId)).append("\n");
    sb.append("    schoolId: ").append(toIndentedString(schoolId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

