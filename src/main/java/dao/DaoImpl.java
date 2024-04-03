package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao{
    @Override
    public double getData() {
        //se connecter à la BDD
        System.out.println("version BDD");
        double temp=Math.random()*40;
        return temp;
    }
}
