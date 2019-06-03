package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration   //对一些第三方库类，使用 @Configuration 来组件声明和显式装配
public class CDPlayerConfig2 {

    @Bean
    public CompactDisc sgtPeppers(){  //申明了一个bean，beanId为方法名
        return new SgtPeppers();
    }

    @Bean
    public CDPlayer cdPlayer(){    //申明了一个bean，beanId为方法名
        return new CDPlayer(sgtPeppers());   //在java配置类中对bean进行注入的一种方式
    }
}
