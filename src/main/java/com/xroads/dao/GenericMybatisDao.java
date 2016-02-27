package com.xroads.dao;

import org.springframework.dao.DataAccessException;

public interface GenericMybatisDao<EntityType> {
	
	/**
     * Create a simple Entity in the database.
     */
    void create(EntityType entity) throws DataAccessException;

    /**
     * Load an entity given its Id.
     */
    EntityType readById(int id);

    /**
     * Delete a simple Entity from the database.
     */
    void delete(int id);

    /**
     * Provide a method to delete all records from the table.
     */
    void deleteAll();

}
