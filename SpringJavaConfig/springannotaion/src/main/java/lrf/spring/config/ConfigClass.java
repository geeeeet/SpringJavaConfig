package lrf.spring.config;

import lrf.spring.duty.Duty;
import lrf.spring.duty.DutyInter;
import lrf.spring.handle.Handleclass;
import lrf.spring.handle.Handleinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * java配置类
 *
 * @author lirufeng
 * @date 2019/2/15 10:26
 */

@Configuration()
public class ConfigClass {

    /**
     * 第一种方式直接调用iconfig()方法
     * @return
     */
//    @Bean
//    public Handleinter hconfig() {
//        return new handleclass(iconfig());
//    }

    /**
     * 第二种方法 参数为Interface1 当Spring调用hconfig()创建Handleinter bean的时候
     * 会自动装配一个Interface1到配置方法中
     * 建议使用这种方法
     * @param dutyInter
     * @return
     */
    @Bean
    public Handleinter hconfig(DutyInter dutyInter) {
        return new Handleclass(dutyInter);
    }

    @Bean
    public DutyInter iconfig() {
        return new Duty();
    }
}
