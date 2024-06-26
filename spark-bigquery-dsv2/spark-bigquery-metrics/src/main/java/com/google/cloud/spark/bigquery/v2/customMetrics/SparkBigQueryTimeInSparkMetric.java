package com.google.cloud.spark.bigquery.v2.customMetrics;

import static com.google.cloud.spark.bigquery.v2.customMetrics.SparkBigQueryCustomMetricConstants.*;

import org.apache.spark.sql.connector.metric.CustomMetric;

public class SparkBigQueryTimeInSparkMetric implements CustomMetric {

  @Override
  public String name() {
    return BIG_QUERY_TIME_IN_SPARK_METRIC_NAME;
  }

  @Override
  public String description() {
    return BIG_QUERY_TIME_IN_SPARK_METRIC_DESCRIPTION;
  }

  @Override
  public String aggregateTaskMetrics(long[] taskMetrics) {
    return MetricUtils.formatTimeMetrics(taskMetrics);
  }
}
