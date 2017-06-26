package org.launchcode.models.data;

import org.launchcode.models.Menu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by candice on 6/26/17.
 */
@Repository
@Transactional
public interface MenuDao extends CrudRepository<Menu, Integer> {
}
