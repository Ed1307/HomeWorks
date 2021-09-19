package HomeWork4.Task3;

public class Player implements Playable, Recordable {

    @Override
    public void record() {
        System.out.println("Recording..");
    }

    @Override
    public void pause() {
        System.out.println("Recording paused");
    }

    @Override
    public void stop() {
        System.out.println("Recording stopped");
    }

    @Override
    public void play() {
        System.out.println("\nPlay");
    }

    public static void main(String[] args) {
        Player player = new Player();

        player.play();
        player.record();
        player.pause();
        player.stop();
    }
}
