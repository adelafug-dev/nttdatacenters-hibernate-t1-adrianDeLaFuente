package com.nttdata.hibernate.interfaces;


/**
 *
 * Interfaz DAO general para métodos que se pueden reiterar en BBDD
 *
 * @author Adrián de la Fuente
 *
 */
public interface CommonDaoI <T>{

    /**
     * Insertar un registro en BBDD
     * @param paramT
     */
    public void insert(final T paramT);

    /**
     * Actualiza un registro en BBDD
     * @param paramT
     */
    public void update(final T paramT);

    /**
     * Elimina un registro en BBDD
     * @param paramT
     */
    public void delete(final T paramT);

    /**
     * Busca un registro en BBDD
     * @param paramT
     */
    public void getByID(final T paramT);

    /**
     * Busca todos registros en BBDD
     * @param paramT
     */
    public void getAll(final T paramT);


}
