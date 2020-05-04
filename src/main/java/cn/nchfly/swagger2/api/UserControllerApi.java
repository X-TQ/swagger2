package cn.nchfly.swagger2.api;

import cn.nchfly.swagger2.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * @Author xtq
 * @Date 2020/5/4 21:31
 * @Description
 */
@Api(tags = "用户相关接口", description = "提供用户的CRUD操作")
public interface UserControllerApi {

    @ApiOperation("新增用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name="user",value = "用户",required=true,dataType="User")
    })
    public User add(User user);

    @ApiOperation("通过用户id查询用户")
    @ApiImplicitParam(name= "userId",value = "用户id",paramType="path",required = true,dataType = "String")
    public User findByUserId(String userId);

    @ApiOperation("通过用户id删除用户")
    @ApiImplicitParam(name= "userId",value = "用户id",paramType="path",required = true,dataType = "String")
    public void deleteByUserId(String userId);

    @ApiOperation("通过用户id更新用户")
    @ApiImplicitParam(name= "userId",value = "用户id",paramType="path",required = true,dataType = "String")
    public void updateByUserId(String userId);
}
