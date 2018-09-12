package cn.licoy.wdog.common.controller.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author licoy.cn
 * @version 2018/9/12
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel(value = "请求结果响应体")
public class ResponseResult<T> {


    @ApiModelProperty(value = "业务状态码")
    private Integer code;

    @ApiModelProperty(value = "数据体")
    private T data;

    @ApiModelProperty(value = "回执消息")
    private String msg;

    @ApiModelProperty(value = "响应时间戳")
    private final long timestamps = System.currentTimeMillis();


    public synchronized static <T> ResponseResult<T> ok() {
        return ResponseResult.<T>builder().code(0).msg("success").build();
    }

    public synchronized static <T> ResponseResult<T> ok(T data) {
        return ResponseResult.<T>builder().code(0).msg("success").data(data).build();
    }


    private static final long serialVersionUID = 8992436576262574064L;

}
