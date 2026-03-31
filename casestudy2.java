abstract class Media {
    private String title;
    private int duration;
    protected boolean isPremium;

    public Media(String title, int duration, boolean isPremium) {
        this.title = title;
        this.duration = duration;
        this.isPremium = isPremium;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public String getDetails() {
        return "Title: " + title + ", Duration: " + duration + " mins";
    }

    public abstract void playContent();
}

class Movie extends Media {
    public Movie(String title, int duration, boolean isPremium) {
        super(title, duration, isPremium);
    }

    public void playContent() {
        if (isPremium) {
            System.out.println("Verifying Subscription... Streaming Movie: " + getTitle());
        } else {
            System.out.println("Streaming Movie: " + getTitle());
        }
    }
}

class Podcast extends Media {
    public Podcast(String title, int duration) {
        super(title, duration, false);
    }

    public void playContent() {
        System.out.println("Loading Advertisement... Playing Podcast: " + getTitle());
    }
}

public class casestudy2 {
    public static void main(String[] args) {
        Media[] mediaList = new Media[3];

        mediaList[0] = new Movie("Inception", 148, true);
        mediaList[1] = new Podcast("Tech Talk", 30);
        mediaList[2] = new Movie("Free Guy", 115, false);

        for (Media m : mediaList) {
            System.out.println(m.getDetails());
            m.playContent();
            System.out.println("----------------------------");
        }
    }
}