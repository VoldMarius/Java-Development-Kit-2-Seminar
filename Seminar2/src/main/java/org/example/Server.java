package org.example;


//Задание: На предыдущем семинаре было описано окно сервера приложения, содержащее две кнопки (старт и стоп) и текстовое поле журнала. Необходимо вынести логику работы сервера
//        в класс ChatServer, а в обработчиках кнопок оставить только логику нажатия кнопки и
//        журналирования сообщений от сервера.
//        Для достижения цели необходимо описать интерфейс «слушатель сервера», с методом
//        «получить сообщение», вызывать его с одной стороны, и реализовать с другой.
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Server extends JFrame implements Listener{
    private static final int WINDOW_POSX = 200;
    private static final int WINDOW_POSY = 250;
    private static final int WINDOW_WIDTH = 300;
    private static final int WINDOW_HEIGHT = 100;
    JButton btnStart = new JButton("Start Server");
    JButton btnStop  = new JButton("Stop Server");

    ServerListener serverRun = new ServerRun(this);
    Listener listener = new Listener() {
        @Override
        public void massageRes(String st) {

        }
    };

    public Server(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Server");
        setVisible(false);

        setLayout(new GridLayout(1,2));
        add(btnStart);
        add(btnStop);
        setVisible(true);
        btnStart.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

                serverRun.serverListener(true);
            }
        });
        btnStop.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                serverRun.serverListener(false);
            }
        });
    }

    @Override
    public void massageRes(String st) {
        System.out.println(st);
    }
}
