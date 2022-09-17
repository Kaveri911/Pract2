package ru.mirea.kvbo01.senkov;
import org.w3c.dom.ls.LSOutput;

import java.lang.*;
public class Main
{
    public static void main(String[] args)
    {
Author me=new Author();
        System.out.println("Имя: "+me.getName());
        System.out.println("E-mail: "+me.getEmail());
        System.out.println("Пол: "+me.getGender());
        System.out.println(me);

        Ball n1=new Ball();
        System.out.println(n1);
        n1.setXY(2.5,6.4);
        System.out.println("Новые координаты "+ n1.getX()+" "+n1.getY());
        n1.move(10,5);

    }

}
