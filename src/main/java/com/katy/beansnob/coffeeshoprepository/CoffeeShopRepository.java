/**
 * 
 */
package com.katy.beansnob.coffeeshoprepository;
import org.springframework.data.repository.CrudRepository;

import com.katy.beansnob.model.CoffeeShop;

/**
 * @author katyd
 *
 */
public interface CoffeeShopRepository extends CrudRepository<CoffeeShop, String> {
	
	

}
