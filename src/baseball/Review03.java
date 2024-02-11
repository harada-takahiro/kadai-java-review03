package baseball;

public class Review03 {
    
    public static void main(String[] args) {
        // 各チームの成績を生成
        BaseBallTeam Swallows = new BaseBallTeam("東京ヤクルトスワローズ",80,59,4);
        Swallows.getRate();
        Swallows.report();
        
        BaseBallTeam BayStars = new BaseBallTeam("横浜DeNAベイスターズ",73,68,2);
        BayStars.getRate();
        BayStars.report();
        
        BaseBallTeam Tigers = new BaseBallTeam("阪神タイガース",68,71,4);
        Tigers.getRate();
        Tigers.report();
        
        BaseBallTeam Giants = new BaseBallTeam("読売ジャイアンツ",68,72,3);
        Giants.getRate();
        Giants.report();
        
        BaseBallTeam Carp = new BaseBallTeam("広島東洋カープ",66,74,3);
        Carp.getRate();
        Carp.report();
        
        BaseBallTeam Dragons = new BaseBallTeam("中日ドラゴンズ",66,75,2);
        Dragons.getRate();
        Dragons.report();
    }

}
