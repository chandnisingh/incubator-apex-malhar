/*
 * Copyright (c) 2015 DataTorrent, Inc. ALL Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.datatorrent.lib.appdata.dimensions;

import com.datatorrent.api.Context.OperatorContext;
import com.datatorrent.lib.appdata.dimensions.AggregateEvent.InputAggregateEvent;
import javax.validation.constraints.NotNull;

public class GenericDimensionsComputationSingleSchema extends com.datatorrent.lib.statistics.DimensionsComputation<InputAggregateEvent, AggregateEvent>
{
  @NotNull
  private AggregatorInfo aggregatorInfo;

  private GenericDimensionsComputationSingleSchema()
  {
    //For Kryo
  }

  @Override
  public void setup(OperatorContext context)
  {
    super.setup(context);


  }

  @Override
  public void setAggregators(Aggregator<InputAggregateEvent, com.datatorrent.lib.appdata.dimensions.AggregateEvent>[] aggregators)
  {
    throw new UnsupportedOperationException("This method is not supported.");
  }

  @Override
  public Aggregator<InputAggregateEvent, com.datatorrent.lib.appdata.dimensions.AggregateEvent>[] getAggregators()
  {
    throw new UnsupportedOperationException("This method is not supported.");
  }

  /**
   * @return the aggregatorInfo
   */
  public AggregatorInfo getAggregatorInfo()
  {
    return aggregatorInfo;
  }

  /**
   * @param aggregatorInfo the aggregatorInfo to set
   */
  public void setAggregatorInfo(@NotNull AggregatorInfo aggregatorInfo)
  {
    this.aggregatorInfo = aggregatorInfo;
  }
}