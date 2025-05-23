package sample;

public class SwitchSample {

    public static void main(String[] args) {
        var score = 72; //成績
        
        switch(score/10) {
        case 10 -> System.out.println("満点です！");
        case 9,8 -> System.out.println("よくできました！");
        case 7,6 -> System.out.println("合格です！");
        default -> System.out.println("赤点です。。。");
        }

    }

}
