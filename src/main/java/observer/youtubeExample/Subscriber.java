package observer.youtubeExample;


public class Subscriber {

    private String name;
    private Channel subscribedTo;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(){
        System.out.println("Hey " + name + ", " + subscribedTo.getName() + " just uploaded" +
                " a new video: " + subscribedTo.getLatestVideoTitle());
    }

    public void subscribeChannel(Channel channel){
        channel.addSubscriber(this);
        subscribedTo = channel;
        System.out.println(this.name + " just subscribed to " + subscribedTo.getName());
    }

    public void unsubscribeChannel(Channel channel){
        String channelName = channel.getName();
        channel.removeSubscriber(this);
        this.subscribedTo = null;
        System.out.println(name + " unsubscribed from " + channelName);
    }

}
