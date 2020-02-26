package ua.com.alevel;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class Showboard  {
    private LinkedList<VideoClip> list;
    private boolean popularInTop;

    public Showboard(boolean popularInTop){
        this.popularInTop =popularInTop;
        list = new LinkedList<>();
    }

    public void print(){
        if(popularInTop){
            ListIterator<VideoClip> iterator = list.listIterator(list.size());
            while(iterator.hasPrevious()){
                VideoClip clip = iterator.previous();
                System.out.println(clip.getName()+":"+clip.getRating());
            }
        }else{
            ListIterator<VideoClip> iterator = list.listIterator();
            while(iterator.hasNext()){
                VideoClip clip = iterator.next();
                System.out.println(clip.getName()+":"+clip.getRating());
            }
        }

    }

    public void addVideoClip(VideoClip vc) {
        int index = Math.abs(Collections.binarySearch(list, vc)+1);
        list.add(index,vc);
    }
}
