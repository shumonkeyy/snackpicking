package org.example.demo;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class HelloController {
    private int set = 0;
    private int nextSet = 0;
    private String role = "";
    private int score = 0;
    private final Random r = new Random();
    private int time = 60;
    Player player = new Player();
    MediaPlayer bgm;

    //main screen
    @FXML private Label snackPicking;
    @FXML private Button startButton;
    @FXML private ImageView bg1;
    @FXML private ImageView bg2;
    @FXML private ImageView lola;
    @FXML private Label lolades;
    @FXML private Label gameRules;
    @FXML private Label pickChar;
    @FXML private ImageView elisa;
    @FXML private Label elisades;
    @FXML private ImageView milo;
    @FXML private Label milodes;
    @FXML private ImageView roco;
    @FXML private Label rocodes;
    @FXML private Button lolaButton;
    @FXML private Button elisaButton;
    @FXML private Button miloButton;
    @FXML private Button rocoButton;
    @FXML private Label scoreText;
    @FXML private Label timerText;
    @FXML private Label completed;
    @FXML private ImageView starBanner;
    @FXML private Label scoreText2;
    @FXML private ImageView presentClosed;
    @FXML private Label openPresent;
    @FXML private ImageView presentOpened;
    @FXML private ImageView timeLogo;
    @FXML private Label plusTimeText;
    @FXML private Button playAgain;
    //food images
    @FXML private ImageView carrot1;
    @FXML private ImageView carrot2;
    @FXML private ImageView carrot3;
    @FXML private ImageView carrot4;
    @FXML private ImageView carrot5;
    @FXML private ImageView fish1;
    @FXML private ImageView fish2;
    @FXML private ImageView fish3;
    @FXML private ImageView fish4;
    @FXML private ImageView fish5;
    @FXML private ImageView bone1;
    @FXML private ImageView bone2;
    @FXML private ImageView bone3;
    @FXML private ImageView bone4;
    @FXML private ImageView bone5;
    @FXML private ImageView nut1;
    @FXML private ImageView nut2;
    @FXML private ImageView nut3;
    @FXML private ImageView nut4;
    @FXML private ImageView nut5;
    //methods
    public void initialize() {
        try {
            Media mainSong = new Media(getClass().getResource("res/NewJeansCookieInstrumental.mp3").toString());
            bgm = new MediaPlayer(mainSong);
            bgm.setCycleCount(MediaPlayer.INDEFINITE);
            bgm.play();
        } catch (NullPointerException e) {
            throw new RuntimeException(e);
        }
    }
    @FXML protected void onStartButtonClick() {
        snackPicking.setVisible(false);
        startButton.setVisible(false);
        bg1.setVisible(false);
        bg2.setVisible(true);
        gameRules.setVisible(true);
        pickChar.setVisible(true);
        lola.setVisible(true);
        lolades.setVisible(true);
        elisa.setVisible(true);
        elisades.setVisible(true);
        milo.setVisible(true);
        milodes.setVisible(true);
        roco.setVisible(true);
        rocodes.setVisible(true);
        lolaButton.setVisible(true);
        elisaButton.setVisible(true);
        miloButton.setVisible(true);
        rocoButton.setVisible(true);
        System.out.println("pick character");
    }
    @FXML protected void onPickLolaButtonClick() {
        role = "lola";
        setTwoToThree();
        randomSet();
        if(player.getFiveSec()==1) {
            time += 5;
        } else if (player.getTenSec()==1) {
            time += 10;
        } else if (player.getFifteenSec()==1) {
            time += 15;
        }
        scoreText.setVisible(true);
        timerText.setVisible(true);
        scoreText.setText("score: " + score);
        timerText.setText("time left: " + time);
        System.out.println("timer start!");
        updateTime();
    }
    @FXML protected void onPickElisaButtonClick() {
        role = "elisa";
        setTwoToThree();
        randomSet();
        if(player.getFiveSec()==1) {
            time += 5;
        } else if (player.getTenSec()==1) {
            time += 10;
        } else if (player.getFifteenSec()==1) {
            time += 15;
        }
        scoreText.setVisible(true);
        timerText.setVisible(true);
        scoreText.setText("score: " + score);
        timerText.setText("time left: " + time);
        System.out.println("timer start!");
        updateTime();
    }
    @FXML protected void onPickMiloButtonClick() {
        role = "milo";
        setTwoToThree();
        randomSet();
        if(player.getFiveSec()==1) {
            time += 5;
        } else if (player.getTenSec()==1) {
            time += 10;
        } else if (player.getFifteenSec()==1) {
            time += 15;
        }
        scoreText.setVisible(true);
        timerText.setVisible(true);
        scoreText.setText("score: " + score);
        timerText.setText("time left: " + time);
        System.out.println("timer start!");
        updateTime();
    }
    @FXML protected void onPickRocoButtonClick() {
        role = "roco";
        setTwoToThree();
        randomSet();
        if(player.getFiveSec()==1) {
            time += 5;
        } else if (player.getTenSec()==1) {
            time += 10;
        } else if (player.getFifteenSec()==1) {
            time += 15;
        }
        scoreText.setVisible(true);
        timerText.setVisible(true);
        scoreText.setText("score: " + score);
        timerText.setText("time left: " + time);
        System.out.println("timer start!");
        updateTime();
    }
    private void randomSet() {
        nextSet = r.nextInt(5);
        while (set == nextSet) {
            nextSet = r.nextInt(5);
        }
        switch (set) {
            //set 1
            case 0:
                carrot1.setVisible(true);
                fish1.setVisible(true);
                bone1.setVisible(true);
                nut1.setVisible(true);
                carrot2.setVisible(false);
                fish2.setVisible(false);
                bone2.setVisible(false);
                nut2.setVisible(false);
                carrot3.setVisible(false);
                fish3.setVisible(false);
                bone3.setVisible(false);
                nut3.setVisible(false);
                carrot4.setVisible(false);
                fish4.setVisible(false);
                bone4.setVisible(false);
                nut4.setVisible(false);
                carrot5.setVisible(false);
                fish5.setVisible(false);
                bone5.setVisible(false);
                nut5.setVisible(false);
                break;
            //set 2
            case 1:
                carrot2.setVisible(true);
                fish2.setVisible(true);
                bone2.setVisible(true);
                nut2.setVisible(true);
                carrot1.setVisible(false);
                fish1.setVisible(false);
                bone1.setVisible(false);
                nut1.setVisible(false);
                carrot3.setVisible(false);
                fish3.setVisible(false);
                bone3.setVisible(false);
                nut3.setVisible(false);
                carrot4.setVisible(false);
                fish4.setVisible(false);
                bone4.setVisible(false);
                nut4.setVisible(false);
                carrot5.setVisible(false);
                fish5.setVisible(false);
                bone5.setVisible(false);
                nut5.setVisible(false);
                break;
            //set 3
            case 2:
                carrot3.setVisible(true);
                fish3.setVisible(true);
                bone3.setVisible(true);
                nut3.setVisible(true);
                carrot2.setVisible(false);
                fish2.setVisible(false);
                bone2.setVisible(false);
                nut2.setVisible(false);
                carrot1.setVisible(false);
                fish1.setVisible(false);
                bone1.setVisible(false);
                nut1.setVisible(false);
                carrot4.setVisible(false);
                fish4.setVisible(false);
                bone4.setVisible(false);
                nut4.setVisible(false);
                carrot5.setVisible(false);
                fish5.setVisible(false);
                bone5.setVisible(false);
                nut5.setVisible(false);
                break;
            //set 4
            case 3:
                carrot4.setVisible(true);
                fish4.setVisible(true);
                bone4.setVisible(true);
                nut4.setVisible(true);
                carrot2.setVisible(false);
                fish2.setVisible(false);
                bone2.setVisible(false);
                nut2.setVisible(false);
                carrot3.setVisible(false);
                fish3.setVisible(false);
                bone3.setVisible(false);
                nut3.setVisible(false);
                carrot1.setVisible(false);
                fish1.setVisible(false);
                bone1.setVisible(false);
                nut1.setVisible(false);
                carrot5.setVisible(false);
                fish5.setVisible(false);
                bone5.setVisible(false);
                nut5.setVisible(false);
                break;
            //set 5
            case 4:
                carrot5.setVisible(true);
                fish5.setVisible(true);
                bone5.setVisible(true);
                nut5.setVisible(true);
                carrot2.setVisible(false);
                fish2.setVisible(false);
                bone2.setVisible(false);
                nut2.setVisible(false);
                carrot3.setVisible(false);
                fish3.setVisible(false);
                bone3.setVisible(false);
                nut3.setVisible(false);
                carrot4.setVisible(false);
                fish4.setVisible(false);
                bone4.setVisible(false);
                nut4.setVisible(false);
                carrot1.setVisible(false);
                fish1.setVisible(false);
                bone1.setVisible(false);
                nut1.setVisible(false);
                break;
        }
        set = nextSet;
    }
    private void updateTime() {
            Timer timer = new Timer();
            TimerTask task = new TimerTask() {
                public void run() {
                    Platform.runLater(() -> {
                        time--;
                        timerText.setText("time left: " + time);
                        if(time==0) {
                            timer.cancel();
                            setThreeToFour();
                            if(score>=70) {
                                System.out.println("eligible for reward");
                                openPresent.setVisible(true);
                                presentClosed.setVisible(true);
                            }
                        }
                        if (score<0) {
                            timer.cancel();
                            setThreeToFour();
                        }
                    });
                }
            };
                timer.scheduleAtFixedRate(task, 1000, 1000);
        }
    @FXML protected void carrotClick() {
        System.out.println("carrot: true");
        if(role.equals("lola")) {
            score++;
        } else {
            score-=3;
        }
        scoreText.setText("score: " + score);
        randomSet();
    }
    @FXML protected void fishClick() {
        System.out.println("fish: true");
        if(role.equals("elisa")) {
            score++;
        } else {
            score-=3;
        }
        scoreText.setText("score: " + score);
        randomSet();
    }
    @FXML protected void boneClick() {
        System.out.println("bone: true");
        if(role.equals("milo")) {
            score++;
        } else {
            score-=3;
        }
        scoreText.setText("score: " + score);
        randomSet();
    }
    @FXML protected void nutClick() {
        System.out.println("nut: true");
        if(role.equals("roco")) {
            score++;
        } else {
            score-=3;
        }
        scoreText.setText("score: " + score);
        randomSet();
    }
    @FXML protected void openingPresent() {
        presentClosed.setVisible(false);
        presentOpened.setVisible(true);
        timeLogo.setVisible(true);
        set = r.nextInt(3);
        switch (set) {
            case 0:
                plusTimeText.setText("+ 5 seconds");
                player.addFiveSec();
                break;
            case 1:
                plusTimeText.setText("+ 10 seconds");
                player.addTenSec();
                break;
            case 2:
                plusTimeText.setText("+ 15 seconds");
                player.addFifteenSec();
                break;
        }
    }
    @FXML protected void onPlayAgainClick() {
        completed.setVisible(false);
        starBanner.setVisible(false);
        scoreText2.setVisible(false);
        playAgain.setVisible(false);
        openPresent.setVisible(false);
        presentOpened.setVisible(false);
        plusTimeText.setVisible(false);
        timeLogo.setVisible(false);
        openPresent.setVisible(false);
        startButton.setVisible(true);
        bg2.setVisible(false);
        bg1.setVisible(true);
        snackPicking.setVisible(true);
        score = 0;
        time = 60;
    }
    private void setTwoToThree() {
        gameRules.setVisible(false);
        pickChar.setVisible(false);
        lola.setVisible(false);
        lolades.setVisible(false);
        elisa.setVisible(false);
        elisades.setVisible(false);
        milo.setVisible(false);
        milodes.setVisible(false);
        roco.setVisible(false);
        rocodes.setVisible(false);
        lolaButton.setVisible(false);
        elisaButton.setVisible(false);
        miloButton.setVisible(false);
        rocoButton.setVisible(false);
    }
    private void setThreeToFour() {
        carrot1.setVisible(false);
        fish1.setVisible(false);
        bone1.setVisible(false);
        nut1.setVisible(false);
        carrot2.setVisible(false);
        fish2.setVisible(false);
        bone2.setVisible(false);
        nut2.setVisible(false);
        carrot3.setVisible(false);
        fish3.setVisible(false);
        bone3.setVisible(false);
        nut3.setVisible(false);
        carrot4.setVisible(false);
        fish4.setVisible(false);
        bone4.setVisible(false);
        nut4.setVisible(false);
        carrot5.setVisible(false);
        fish5.setVisible(false);
        bone5.setVisible(false);
        nut5.setVisible(false);
        timerText.setVisible(false);
        scoreText2.setVisible(true);
        scoreText.setVisible(false);
        completed.setVisible(true);
        starBanner.setVisible(true);
        if (score<0) {
            scoreText2.setText("score: 0");
            completed.setText("your pet died from food poisoning :(");
        } else {
            scoreText2.setText("score: " + score);
        }
        playAgain.setVisible(true);
    }
}