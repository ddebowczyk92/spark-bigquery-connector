package com.google.cloud.spark.bigquery;

import io.openlineage.spark.extension.OpenLineageExtensionProvider;

public class TestSparkLineageProvider implements OpenLineageExtensionProvider {
  @Override
  public String shadedPackage() {
    return "com.google.cloud.spark.bigquery.repackaged.io.openlineage.spark.extension";
  }

  @Override
  public String getVisitorClassName() {
    return "io.openlineage.spark.shade.extension.v1.lifecycle.plan.SparkOpenLineageExtensionVisitor";
  }
}
