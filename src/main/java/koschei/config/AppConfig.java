package koschei.config;

import koschei.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }

    @Bean
    public static Needle7 getNeedle (Deth8 deth) {
        return new Needle7(deth);
    }

    @Bean
    public static Deth8 getDeth(){
        return new Deth8();
    };
}
