package _java.Woche_03.Interface_02;

import javax.print.attribute.standard.Media;

public class Main {
    public static void main(String[] args) {

    MediaController start = new MediaController();

    MusicPlayer music = new MusicPlayer();

    VideoPlayer video = new VideoPlayer();

    start.playMedia(music);

    start.playMedia(video);

    }
}
