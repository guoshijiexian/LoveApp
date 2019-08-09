package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.util.concurrent.ThreadLocalRandom;


public class Controller {

    @FXML
    public Button agreeBtn;//好呀按钮

    @FXML
    public Button disagreeBtn;//不好按钮

    @FXML
    public Label msg;//小姐姐,下班一起走呗？：)
    @FXML
    public ImageView msg2;//

    //初始化不好坐标
     public int x = 138;
     public int y = 98;

    /**
     * 展示：小姐姐,下班一起走呗？：)
     */
    @FXML
    protected void agree(){
        msg.setOpacity(1);
        msg2.setOpacity(1);
    }

    /**
     * 按钮悬停在随机位置
     */
    @FXML
    protected void disagree(){
        if (this.x==138 && y==98){
            x = ThreadLocalRandom.current().nextInt(600);
            y = ThreadLocalRandom.current().nextInt(400);
        }else if(this.x!=138 && y!=98) {//判断是否为初始化，是的话进行随机
            x = ThreadLocalRandom.current().nextInt(600);
            y = ThreadLocalRandom.current().nextInt(400);
            disagreeBtn.setLayoutX(x);
            disagreeBtn.setLayoutY(y);
        }
    }
/*
    /**
    *标记为透明
    *
    * /
    @FXML
    protected void disagree(){
        msg.setOpacity(0);
    }
*/
}
