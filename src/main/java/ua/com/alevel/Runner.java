package ua.com.alevel;

public class Runner {
    public static void main(String[] args) {
        Showboard showboard = new Showboard(true);

        showboard.addVideoClip(new VideoClip("Темный рыцарь",9));
        showboard.addVideoClip(new VideoClip("Побег из Шоушенка",9.2));
        showboard.addVideoClip(new VideoClip("Бойцовский клуб",8.8));
        showboard.addVideoClip(new VideoClip("Криминальное чтиво",8.9));

        showboard.print();

    }
}
