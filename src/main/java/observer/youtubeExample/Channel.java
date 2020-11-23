package observer.youtubeExample;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    List<Subscriber> subscribers = new ArrayList<Subscriber>();
    private String name;
    private String LatestVideoTitle;

    public Channel(String name) {
        this.name = name;
    }

    public void addSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void notifySubs(){
        for(Subscriber subscriber : subscribers){
            subscriber.update();
        }
    }

    public void uploadVideo(String title){
        this.LatestVideoTitle = title;
        System.out.println("Successfully uploaded a new video: " + title);
        notifySubs();
    }

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }

    public String getName() {
        return name;
    }

    public String getLatestVideoTitle() {
        return LatestVideoTitle;
    }
}
