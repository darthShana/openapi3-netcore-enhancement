package com.darthShana.openapi;

import org.junit.Test;
import org.openapitools.codegen.OpenAPIGenerator;

import java.util.Arrays;

public class SampleTest {
  @Test
  public void runGenerator() {
    String location = getClass().getResource("/sample2.yaml").getFile();
    OpenAPIGenerator.main(Arrays.asList("generate",
      "--input-spec", location,
      "--generator-name", "csharp-netcore-enhanced",
      "--additional-properties", "useEnhancedSerializer=true",
      "--output", "target/" + getClass().getSimpleName())
      .toArray(new String[0]));
  }
}
