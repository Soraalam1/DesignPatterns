package observer;

public abstract class Observer {
    //all protected means is it is accessible anywhere within this package
    protected Subject subject;
    abstract void update();
}
