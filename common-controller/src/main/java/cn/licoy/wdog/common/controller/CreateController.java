package cn.licoy.wdog.common.controller;

import cn.licoy.wdog.common.controller.result.ResponseResult;
import com.baomidou.mybatisplus.service.IService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.swing.text.html.parser.Entity;

/**
 * @author Licoy
 * @version 2018/5/25/12:54
 * @param <E> 实体类
 * @param <M> 数据模型
 * @param <P> 实体类主键类型
 */
public interface CreateController<E extends Entity,M,P> {

    <S extends IService<E>> S getService();

    @PostMapping
    @ApiOperation(value = "新增")
    @ApiImplicitParam(paramType = "header",name = "Authorization",required = true)
    ResponseResult add();
}
