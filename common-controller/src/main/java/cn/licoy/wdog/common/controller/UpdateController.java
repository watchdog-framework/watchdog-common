package cn.licoy.wdog.common.controller;

import cn.licoy.wdog.common.controller.result.ResponseResult;
import com.baomidou.mybatisplus.service.IService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author Licoy
 * @version 2018/5/25/13:27
 */
public interface UpdateController<E,P,D> {

    <S extends IService<E>> S getService();

    @PostMapping("/update/{id}")
    @ApiOperation(value = "更新指定ID对象的信息")
    @ApiImplicitParam(paramType = "header",name = "Authorization",value = "身份认证Token",required = true)
    default ResponseResult update(@PathVariable("id") P id, @RequestBody @Validated D updateDTO){

        return ResponseResult.ok();
    }

}
