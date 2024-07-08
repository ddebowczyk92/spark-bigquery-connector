package com.google.cloud.spark.bigquery;

import io.openlineage.spark.extension.OpenLineageExtensionProvider;

public class SparkBQLineageProvider implements OpenLineageExtensionProvider {
  @Override
  public String shadedPackage() {
    return "com.google.cloud.spark.bigquery.repackaged.io.openlineage.spark.shade";
  }
}
