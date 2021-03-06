/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyZoneNameRequest extends AbstractModel{

    /**
    * 大区所属的应用实例ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 待修改名称的大区ID
    */
    @SerializedName("LogicZoneId")
    @Expose
    private String LogicZoneId;

    /**
    * 新的大区名称
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
     * Get 大区所属的应用实例ID 
     * @return ApplicationId 大区所属的应用实例ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 大区所属的应用实例ID
     * @param ApplicationId 大区所属的应用实例ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 待修改名称的大区ID 
     * @return LogicZoneId 待修改名称的大区ID
     */
    public String getLogicZoneId() {
        return this.LogicZoneId;
    }

    /**
     * Set 待修改名称的大区ID
     * @param LogicZoneId 待修改名称的大区ID
     */
    public void setLogicZoneId(String LogicZoneId) {
        this.LogicZoneId = LogicZoneId;
    }

    /**
     * Get 新的大区名称 
     * @return ZoneName 新的大区名称
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 新的大区名称
     * @param ZoneName 新的大区名称
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "LogicZoneId", this.LogicZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);

    }
}

