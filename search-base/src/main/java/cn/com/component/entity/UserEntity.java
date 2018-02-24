package cn.com.component.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by woni on 18/2/24.
 */
@ApiModel(value = "UserEntity",subTypes = {UserEntity.class})
public class UserEntity {
    @ApiModelProperty(value = "主键id",name = "id",required = true,example = "1",dataType = "String")
    private String id;

    @ApiModelProperty(value = "用户姓名",name = "name",required = false)
    private String name;

    @ApiModelProperty(value = "用户年龄",name = "age",required = false)
    private Integer age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
