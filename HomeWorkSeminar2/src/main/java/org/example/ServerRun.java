package org.example;


public class ServerRun  {

    boolean isServicesWorking;
    private final Listener listener;

    public ServerRun(Listener listener) {
        this.listener = listener;
        this.isServicesWorking = false;
    }
    public void start (){
        if(!isServicesWorking){
            isServicesWorking = true;
           listener.massageRes("Статус сервера: "+ true);
        }
    }

    public void stop() {
        if(isServicesWorking){
            isServicesWorking = false;
            listener.massageRes("Статус сервера: "+ false);
        }
    }
}
