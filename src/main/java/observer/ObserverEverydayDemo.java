package observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverEverydayDemo {
    public static void main(String[] args) {
        TwitterStream messageStream = new TwitterStream();

        Client client1 = new Client("Dean");

        Client client2 = new Client("Mark");

        messageStream.addObserver(client1);
        messageStream.addObserver(client2);

        messageStream.someoneTweeted();
    }
}

    //concrete subject
    class TwitterStream extends Observable {
        public void someoneTweeted(){
            //We have to do setChanged first to signify that our state has changed
            setChanged();
            //The notify observers calls the update method and then our println below fires
            notifyObservers();
        }
    }


    //concrete observer
    class Client implements Observer {
        private String name;

        Client(String name){
            this.name = name;
        }

        public void update(Observable o, Object arg) {
            System.out.println("Update " + name + "'s stream, someone tweets something.");
        }
    }
