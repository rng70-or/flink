/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.flink.table.functions.python;

import org.apache.flink.annotation.Internal;

/**
 * PythonAggregateFunctionInfo contains the execution information of a Python aggregate function,
 * such as: the actual Python aggregation function, the input arguments, the filter arg, the
 * distinct flag, etc.
 */
@Internal
public class PythonAggregateFunctionInfo extends PythonFunctionInfo {

    private static final long serialVersionUID = 1L;

    private final int filterArg;
    private final boolean distinct;

    public PythonAggregateFunctionInfo(
            PythonFunction pythonFunction, Object[] inputs, int filterArg, boolean isDistinct) {
        super(pythonFunction, inputs);
        this.filterArg = filterArg;
        this.distinct = isDistinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public int getFilterArg() {
        return filterArg;
    }
}
