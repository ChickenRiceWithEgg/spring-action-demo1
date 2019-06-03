package soundsystem;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {

    CompactDisc cd;

    @Autowired   //利用  @Autowired  进行  自动装配
    public CDPlayer(CompactDisc cd){    //通过构造方法进行依赖注入
        this.cd = cd;
    }
}
