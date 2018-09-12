package cn.licoy.wdog.common.database.mybatis.plus;

import com.baomidou.mybatisplus.enums.DBType;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;

/**
 * @author licoy.cn
 * @version 2018/9/12
 * <p>MybatisPlus 配置写入</p>
 */
@Configuration
@ConfigurationProperties(prefix = "wdog.mybatis.plus")
@Data
public class MybatisPlusPropertiesConfiguration implements Serializable {

    private DBType dbType = DBType.MYSQL;

    private String mapperPath = "classpath:mapper/*.xml";

    private IdType idType = IdType.ID_WORKER_STR;

}
