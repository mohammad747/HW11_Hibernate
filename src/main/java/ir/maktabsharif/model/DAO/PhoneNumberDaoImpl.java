package ir.maktabsharif.model.DAO;


import ir.maktabsharif.BaseDao.BaseDAOImpl;
import ir.maktabsharif.model.PhoneNumber.PhoneNumber;
import org.hibernate.SessionFactory;

public class PhoneNumberDaoImpl  extends BaseDAOImpl<PhoneNumber> implements PhoneNumberDao   {

    public PhoneNumberDaoImpl(SessionFactory factory) {
        super(factory);
    }

    @Override
    protected String getEntityName() {
        return null;
    }
}
