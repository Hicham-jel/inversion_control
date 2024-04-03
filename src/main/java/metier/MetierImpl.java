package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier{
    //le couplage faible c'est déclarer une variable de type une interface dans une classe sans utiliser new (couplage fort)
    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double temp= dao.getData();
        double resultat=temp*510/1000;
        return resultat;
    }
    //Setter
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
