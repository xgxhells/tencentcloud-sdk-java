package com.tencentcloudapi.es.v20180416.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeInstancesRequest  extends AbstractModel{


    /**
    * 集群实例所属可用区，不传则默认所有可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;
    

    /**
    * 一个或多个集群实例ID
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;
    

    /**
    * 一个或多个集群实例名称
    */
    @SerializedName("InstanceNames")
    @Expose
    private String [] InstanceNames;
    

    /**
    * 分页起始值, 默认值0
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;
    

    /**
    * 分页大小，默认值20
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;
    

    /**
    * 排序字段：1，实例ID；2，实例名称；3，可用区；4，创建时间，若orderKey未传递则按创建时间降序排序
    */
    @SerializedName("OrderByKey")
    @Expose
    private Integer OrderByKey;
    

    /**
    * 排序方式：0，升序；1，降序；若传递了orderByKey未传递orderByType, 则默认升序
    */
    @SerializedName("OrderByType")
    @Expose
    private Integer OrderByType;
    

    /**
     * 获取集群实例所属可用区，不传则默认所有可用区
     * @return Zone 集群实例所属可用区，不传则默认所有可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置集群实例所属可用区，不传则默认所有可用区
     * @param Zone 集群实例所属可用区，不传则默认所有可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取一个或多个集群实例ID
     * @return InstanceIds 一个或多个集群实例ID
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * 设置一个或多个集群实例ID
     * @param InstanceIds 一个或多个集群实例ID
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * 获取一个或多个集群实例名称
     * @return InstanceNames 一个或多个集群实例名称
     */
    public String [] getInstanceNames() {
        return this.InstanceNames;
    }

    /**
     * 设置一个或多个集群实例名称
     * @param InstanceNames 一个或多个集群实例名称
     */
    public void setInstanceNames(String [] InstanceNames) {
        this.InstanceNames = InstanceNames;
    }

    /**
     * 获取分页起始值, 默认值0
     * @return Offset 分页起始值, 默认值0
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置分页起始值, 默认值0
     * @param Offset 分页起始值, 默认值0
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取分页大小，默认值20
     * @return Limit 分页大小，默认值20
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置分页大小，默认值20
     * @param Limit 分页大小，默认值20
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取排序字段：1，实例ID；2，实例名称；3，可用区；4，创建时间，若orderKey未传递则按创建时间降序排序
     * @return OrderByKey 排序字段：1，实例ID；2，实例名称；3，可用区；4，创建时间，若orderKey未传递则按创建时间降序排序
     */
    public Integer getOrderByKey() {
        return this.OrderByKey;
    }

    /**
     * 设置排序字段：1，实例ID；2，实例名称；3，可用区；4，创建时间，若orderKey未传递则按创建时间降序排序
     * @param OrderByKey 排序字段：1，实例ID；2，实例名称；3，可用区；4，创建时间，若orderKey未传递则按创建时间降序排序
     */
    public void setOrderByKey(Integer OrderByKey) {
        this.OrderByKey = OrderByKey;
    }

    /**
     * 获取排序方式：0，升序；1，降序；若传递了orderByKey未传递orderByType, 则默认升序
     * @return OrderByType 排序方式：0，升序；1，降序；若传递了orderByKey未传递orderByType, 则默认升序
     */
    public Integer getOrderByType() {
        return this.OrderByType;
    }

    /**
     * 设置排序方式：0，升序；1，降序；若传递了orderByKey未传递orderByType, 则默认升序
     * @param OrderByType 排序方式：0，升序；1，降序；若传递了orderByKey未传递orderByType, 则默认升序
     */
    public void setOrderByType(Integer OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "InstanceNames.", this.InstanceNames);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderByKey", this.OrderByKey);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

