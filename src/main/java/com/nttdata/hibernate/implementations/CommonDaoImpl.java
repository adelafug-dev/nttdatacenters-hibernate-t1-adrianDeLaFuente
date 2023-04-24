package com.nttdata.hibernate.implementations;

import com.nttdata.hibernate.interfaces.CommonDaoI;
import org.hibernate.Session;


/**
 * Formación - Hibernate - Ejemplo
 *
 * DAO genérico
 *
 * @author NTT Data Sevilla
 *
 */
public abstract class CommonDaoImpl<T> implements CommonDaoI<T> {

    /** Tipo de clase */
    private Class entityClass;

    /** Crear sesión de conexión a BD */
    private Session session;


    /**
     * @return the entityClass
     */
    public Class<T> getEntityClass() {
        return entityClass;
    }

    /**
     * @param entityClass
     *            the entityClass to set
     */
    public void setEntityClass(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

     @Override
    public void insert(final T paramT) {

         if (!session.getTransaction().isActive()){
            session.getTransaction().begin();
         }
         session.save(paramT);

         session.getTransaction().commit();
     }

}
