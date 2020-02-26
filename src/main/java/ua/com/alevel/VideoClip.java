package ua.com.alevel;

public class VideoClip implements Comparable<VideoClip>{
    private String name;
    private double rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public VideoClip(String name, double rating){
        this.name = name;
        this.rating = rating;
    }



    @Override
    public int compareTo(VideoClip videoClip) {
        if(this.rating-videoClip.rating>0){
            return 1;
        }else if(this.rating-videoClip.rating<0){
            return -1;
        }else{
            return 0;
        }
    }
}
