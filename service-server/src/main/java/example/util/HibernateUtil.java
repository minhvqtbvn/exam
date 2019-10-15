package example.util;

import example.entity.Employee;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory ourSessionFactory;

    static {
        try {
            ourSessionFactory = new Configuration().
                    configure("hibernate.cfg.xml").
                    buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public static void main(final String[] args) throws Exception {
        final Session session = getSession();
        Transaction transaction = null;
        try {

            transaction = session.beginTransaction();
            Employee employee = new Employee();
            employee.setName("minh");
            employee.setSalary(500);
            session.save(employee);
            System.out.println("save thanh cong!!!!");
            transaction.commit();
        }
        catch (Exception ex){
            if(transaction!=null){
                transaction.rollback();
            }
        } finally {
            session.close();
        }
    }
}
