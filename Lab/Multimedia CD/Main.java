package cdplayer;
import java.util.Scanner;

class Audio{
    private String title;
    private String format;

    public Audio(String title, String format){
        this.title = title;
        this.format = format;
    }

    public String getTitle(){
        return this.title;
    }

    public String getFormat(){
        return this.format;
    }

    public boolean checkFormat(){
        return format.equals("mp4") || format.equals("mp3") || format.equals("wav");
    }
}

class Video{
    private String title;
    private String format;

    public Video(String title, String format){
        this.title = title;
        this.format = format;
    }

    public String getTitle(){
        return this.title;
    }

    public String getFormat(){
        return this.format;
    }

    public boolean checkFormat(){
        return format.equals("hevc") || format.equals("mov") || format.equals("mkv");
    }
}

class Controller{
    public void checkFormat(Audio audio, Application app){
        if(audio.checkFormat()){
            app.playAudio(audio);
        }
        else{
            System.out.println("Invalid format : " + audio.getFormat());
        }
    }

    public void checkFormat(Video video, Application app){
        if(video.checkFormat()){
            app.playVideo(video);
        }
        else{
            System.out.println("Invalid format : " + video.getFormat());
        }
    }
}

class Application{
    private Player player;

    public Application(Player player){
        this.player = player;
    }
    public void playAudio(Audio audio){
        player.play(audio.getTitle(), audio.getFormat());
    }

    public void playVideo(Video video){
        player.play(video.getTitle(), video.getFormat());
    }
}


class Player{
    public void play(String title, String format){
        System.out.println("Playing " + title + "." + format);
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Controller controller = new Controller();
        Player player = new Player();
        Application app = new Application(player);

        Audio a1 = new Audio("Song1", "mp3");
        Audio a2 = new Audio("Song2", "mp4");
        Audio a3 = new Audio("Song3", "wav");

        Video v1 = new Video("Vid1", "mov");
        Video v2 = new Video("Vid2", "mkv");
        Video v3 = new Video("Vid3", "hevc");

        System.out.println("Which file you want to play?");
        System.out.println("For 'Audio' enter 1\nFor 'Video' enter 2");

        int n = sc.nextInt();
        sc.nextLine();

        if(n==1){

            System.out.println("Available audios are:");
            System.out.println("1. " + a1.getTitle() + "." + a1.getFormat());
            System.out.println("2. " + a2.getTitle() + "." + a2.getFormat());
            System.out.println("3. " + a3.getTitle() + "." + a3.getFormat());

            System.out.println("Select 1/2/3");

            int x = sc.nextInt();

            if(x==1){
                controller.checkFormat(a1, app);
            }
            else if(x==2){
                controller.checkFormat(a2, app);
            }
            else if(x==3){
                controller.checkFormat(a3, app);
            }
            else{
                System.out.println("Invalid");
            }
        }

        else if (n == 2) {

            System.out.println("Available videos are:");
            System.out.println("1. " + v1.getTitle() + "." + v1.getFormat());
            System.out.println("2. " + v2.getTitle() + "." + v2.getFormat());
            System.out.println("3. " + v3.getTitle() + "." + v3.getFormat());

            System.out.print("Select 1/2/3");
            int x = sc.nextInt();
            
            if(x==1){
                controller.checkFormat(v1, app);
            }
            else if(x==2){
                controller.checkFormat(v2, app);
            }
            else if(x==3){
                controller.checkFormat(v3, app);
            }
            else{
                System.out.println("Invalid");
            }

        }
        else {
            System.out.println("Invalid choice.");
        }
        sc.close();

    }
}
