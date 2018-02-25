package cn.com.component.searchDto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by hzfang on 2018/1/30.
 * 搜索请求实体封装类
 */
@ApiModel(value = "SearchRequestVO",subTypes = {SearchRequestVO.class})
public class SearchRequestVO {


    @ApiModelProperty(name = "from",value = "分页开始标识",required = false,example = "0",dataType = "Integer")
    private Integer from;//开始条数

    @ApiModelProperty(name = "size",value = "查询跨度",required = false,example = "10",dataType = "Integer")
    private Integer size;//查询跨度

    @ApiModelProperty(name = "type",value = "索引所在的type",required = true,example = "AdEntity",dataType = "String")
    private String type;//索引所在的type

    @ApiModelProperty(name = "field",value = "查询的字段",required = true,example = "keyWords",dataType = "String")
    private String field;//查询的域

    @ApiModelProperty(name = "value",value = "查询的值",required = true,example = "游戏",dataType = "String")
    private String value;//查询的值

    @ApiModelProperty(name = "sortField",value = "排序的字段",required = false,example = "",dataType = "String")
    private String sortField;//排序的域值

    @ApiModelProperty(name = "sort",value = "降序还是升序",required = false,dataType = "Boolean")
    private Boolean sort;//升序还是降序

    @ApiModelProperty(name = "responseClazz",value = "返回的实体类",required = false,dataType = "Clazz")
    private Class responseClazz;//返回的实体类类

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Class getResponseClazz() {
        return responseClazz;
    }

    public void setResponseClazz(Class responseClazz) {
        this.responseClazz = responseClazz;
    }

    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public Boolean getSort() {
        return sort;
    }

    public void setSort(Boolean sort) {
        this.sort = sort;
    }
}
