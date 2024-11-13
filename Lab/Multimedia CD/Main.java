package cdplayer;

import java.util.Scanner;

class Audio {
    private String title;
    private String format;

    public Audio(String title, String format) {
        this.title = title;
        this.format = format;
    }

    public String getTitle() {
        return this.title;
    }

    public String getFormat() {
        return this.format;
    }

    public boolean checkFormat() {
        return format.equals("mp4") || format.equals("mp3") || format.equals("wav");
    }
}

class Video {
    private String title;
    private String format;

    public Video(String title, String format) {
        this.title = title;
        this.format = format;
    }

    public String getTitle() {
        return this.title;
    }

    public String getFormat() {
        return this.format;
    }

    public boolean checkFormat() {
        return format.equals("hevc") || format.equals("mov") || format.equals("mkv");
    }
}

class Controller {
    public void checkFormat(Audio audio, Application app) {
        if (audio.checkFormat()) {
            app.playAudio(audio);
        } else {
            System.out.println("Invalid format : " + audio.getFormat());
        }
    }

    public void checkFormat(Video video, Application app) {
        if (video.checkFormat()) {
            app.playVideo(video);
        } else {
            System.out.println("Invalid format : " + video.getFormat());
        }
    }
}

class Application {
    private Player player;

    public Application(Player player) {
        this.player = player;
    }

    public void playAudio(Audio audio) {
        player.play(audio.getTitle(), audio.getFormat());
    }

    public void playVideo(Video video) {
        player.play(video.getTitle(), video.getFormat());
    }
}

class Player {
    public void play(String title, String format) {
        System.out.println("Playing " + title + "." + format);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Controller controller = new Controller();
        Player player = new Player();
        Application app = new Application(player);

        Audio[] audios = {
                new Audio("Song1", "mp3"),
                new Audio("Song2", "mp4"),
                new Audio("Song3", "wav")
        };

        Video[] videos = {
                new Video("Vid1", "mov"),
                new Video("Vid2", "mkv"),
                new Video("Vid3", "hevc")
        };

        System.out.println("Which file you want to play?");
        System.out.println("For 'Audio' enter 1\nFor 'Video' enter 2");

        int n = sc.nextInt();
        sc.nextLine();

        if (n == 1) {

            System.out.println("Available audios are:");

            for (int i = 0; i < audios.length; i++) {
                System.out.println((i + 1) + ". " + audios[i].getTitle() + "." + audios[i].getFormat());
            }

            System.out.println("Select 1/2/3");

            int x = sc.nextInt();

            if (x >= 1 && x <= audios.length) {
                controller.checkFormat(audios[x - 1], app);
            } else {
                System.out.println("Invalid");
            }
        }

        else if (n == 2) {

            System.out.println("Available videos are:");
            for (int i = 0; i < videos.length; i++) {
                System.out.println((i + 1) + ". " + videos[i].getTitle() + "." + videos[i].getFormat());
            }

            System.out.println("Select 1/2/3");

            int x = sc.nextInt();

            if (x >= 1 && x <= videos.length) {
                controller.checkFormat(videos[x - 1], app);
            } else {
                System.out.println("Invalid");
            }
            
        }
        sc.close();
    }
}
