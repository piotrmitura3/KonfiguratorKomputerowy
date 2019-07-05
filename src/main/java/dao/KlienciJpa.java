//package dao;
//
//import model.Klient;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//import java.util.List;
//
//public class KlienciJpa {
//    private static KlienciJpa klienciJpa;
//    protected EntityManager entityManager;
//
//    private static KlienciJpa getInstance() {
//        if (klienciJpa == null) {
//            klienciJpa = new KlienciJpa();
//        }
//        return klienciJpa;
//    }
//
//    private EntityManager getEntityManager() {
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("konfigurator");
//
//        if (entityManager == null) {
//            entityManager = entityManagerFactory.createEntityManager();
//
//        }
//        return entityManager;
//    }
//
//    public KlienciJpa() {
//        entityManager = getEntityManager();
//    }
//
//    public void dodajKlienta(Klient klient) {
//
//        try {
//            entityManager.getTransaction().begin();
//            entityManager.persist(klient);
//            entityManager.getTransaction().commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//            entityManager.getTransaction().rollback();
//        }
//
//    }
//
//    public Klient getById(Integer id) {
//        return entityManager.find(Klient.class, id);
//
//    }
//
//    public List<Klient> getListaKlientow() {
//
//        return entityManager.createQuery("FROM " + Klient.class.getName()).getResultList();
//
//    }
//}
