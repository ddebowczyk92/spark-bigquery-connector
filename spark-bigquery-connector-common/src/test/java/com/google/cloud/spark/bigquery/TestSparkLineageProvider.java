package com.google.cloud.spark.bigquery;

import io.openlineage.unshaded.spark.extension.v1.LineageExtensionProvider;

public class TestSparkLineageProvider implements LineageExtensionProvider {
  @Override
  public String shadedPackage() {
    return "com.google.cloud.spark.bigquery.repackaged.io.openlineage";
  }

  @Override
  public String getVisitorClassName() {
    return "io.openlineage.spark.extension.v1.lifecycle.plan.SparkExtensionVisitor";
  }
}
