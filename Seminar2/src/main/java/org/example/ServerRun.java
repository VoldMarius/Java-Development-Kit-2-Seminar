package org.example;


public class ServerRun implements ServerListener {

    boolean isServicesWorking;
    private final Listener listener;

    public ServerRun(Listener listener) {
        this.listener = listener;
        this.isServicesWorking = false;
    }
    public void start (){
        if(!isServicesWorking){
            isServicesWorking = true;
           listener.massageRes("Сервер запущен");
        }
        else listener.massageRes("Сервер уже работает");
    }

    public void stop() {
        if(isServicesWorking){
            isServicesWorking = false;
            listener.massageRes("Сервер выключен");
        }
        else listener.massageRes("Сервер уже был выключен");
    }
    @Override
    public void serverListener(boolean status){
        if (status) {
            start();
        }
        else stop();
        }
    }
