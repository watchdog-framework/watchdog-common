package cn.licoy.wdog.common.controller;

import cn.licoy.wdog.common.controller.result.ResponseResult;
import com.baomidou.mybatisplus.service.IService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author Licoy
 * @version 2018/5/25/13:27
 */
public interface DeleteController<E,P> {

    <S extends IService<E>> S getService();

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除指定ID的对象")
    @ApiImplicitParam(paramType = "header",name = "Authorization",value = "身份认证Token",required = true)
    default ResponseResult remove(@PathVariable P id){
        //TODO
        return ResponseResult.ok();
    }

}
