package cn.licoy.wdog.common.controller;

import cn.licoy.wdog.common.controller.result.ResponseResult;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author Licoy
 * @version 2018/5/25/13:27
 */
public interface QueryController<E,P> {

    <S extends IService<E>> S getService();

    @PostMapping("/list")
    @ApiOperation(value = "分页获取所有列表")
    @ApiImplicitParam(paramType = "header",name = "Authorization",value = "身份认证Token",required = true)
    default ResponseResult list(@RequestBody P findDTO){
        return ResponseResult.ok();
    }

}
