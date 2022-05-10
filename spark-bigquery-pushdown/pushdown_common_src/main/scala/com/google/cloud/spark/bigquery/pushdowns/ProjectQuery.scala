/*
 * Copyright 2022 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.spark.bigquery.pushdowns

import org.apache.spark.sql.catalyst.expressions.NamedExpression

/** Query for projection operations.
 *
 * @constructor
 * @param projectionColumns The projection columns.
 * @param child   The child node.
 * @param alias   Query alias.
 */
case class ProjectQuery(
     expressionConverter: SparkExpressionConverter,
     projectionColumns: Seq[NamedExpression],
     child: BigQuerySQLQuery,
     alias: String)
  extends BigQuerySQLQuery(
    expressionConverter,
    alias, children = Seq(child),
    projections = Some(projectionColumns)) {}
