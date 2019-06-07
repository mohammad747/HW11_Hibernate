package ir.maktabsharif.model.DAO;


import ir.maktabsharif.BaseDao.BaseDAOImpl;
import ir.maktabsharif.model.Address.Address;
import org.hibernate.SessionFactory;

public class AddressDaoImpl  extends BaseDAOImpl<Address> implements AddressDao  {


    public AddressDaoImpl(SessionFactory factory) {
        super(factory);
    }

    @Override
    protected String getEntityName() {
        return "Address";
    }
}
