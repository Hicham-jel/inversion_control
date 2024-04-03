package dao;

public class DaoImpl2 implements IDao{

    @Override
    public double getData() {
        System.out.println("Version Capteurs");
        double temp=45;
        return temp;
    }
}
