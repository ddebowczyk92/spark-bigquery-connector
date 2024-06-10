package com.google.cloud.spark.bigquery.v2;

import io.openlineage.spark.extension.v1.LineageExtensionProvider;

public class SparkLineageProvider implements LineageExtensionProvider {
  @Override
  public String shadedPackage() {
    return "com.google.cloud.spark.bigquery.repackaged.io.openlineage";
  }
}
