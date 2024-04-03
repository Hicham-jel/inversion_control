package Presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main (String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));
        String daOClassName=scanner.nextLine();
        //instanciation dynamique
        Class cDao=Class.forName(daOClassName);//ClassNotFoundException
        IDao dao= (IDao) cDao.newInstance();//InstantiationException, IllegalAccessException
        System.out.println(dao.getData());
        String metierClassName=scanner.nextLine();

        //instanciation dynamique//metier
        Class cMetier=Class.forName(metierClassName);//ClassNotFoundException
        IMetier metier= (IMetier) cMetier.newInstance();//InstantiationException, IllegalAccessException
        Method method=cMetier.getMethod("setDao",IDao.class);
        method.invoke(metier,dao);
        System.out.println(metier.calcul());
    }
}
