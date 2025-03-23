package com.microservices.enrollment.enrollment.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Enrollment
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-23T18:57:13.366899+08:00[Asia/Manila]")
public class Enrollment {

  private Integer id;

  private Integer studentId;

  private Integer schoolId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate enrollmentDate;

  public Enrollment id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Enrollment studentId(Integer studentId) {
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

  public Enrollment schoolId(Integer schoolId) {
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

  public Enrollment enrollmentDate(LocalDate enrollmentDate) {
    this.enrollmentDate = enrollmentDate;
    return this;
  }

  /**
   * Get enrollmentDate
   * @return enrollmentDate
  */
  @Valid 
  @Schema(name = "enrollmentDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enrollmentDate")
  public LocalDate getEnrollmentDate() {
    return enrollmentDate;
  }

  public void setEnrollmentDate(LocalDate enrollmentDate) {
    this.enrollmentDate = enrollmentDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Enrollment enrollment = (Enrollment) o;
    return Objects.equals(this.id, enrollment.id) &&
        Objects.equals(this.studentId, enrollment.studentId) &&
        Objects.equals(this.schoolId, enrollment.schoolId) &&
        Objects.equals(this.enrollmentDate, enrollment.enrollmentDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, studentId, schoolId, enrollmentDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Enrollment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    studentId: ").append(toIndentedString(studentId)).append("\n");
    sb.append("    schoolId: ").append(toIndentedString(schoolId)).append("\n");
    sb.append("    enrollmentDate: ").append(toIndentedString(enrollmentDate)).append("\n");
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

