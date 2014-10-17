package services.crudservices

import people.Admin
import repository.AdminRepository.AdminRepository

/**
 * Created by akhona on 2014/10/07.
 */
trait AdminTestCRUDInterface {

  def create( admin: Admin ): Admin
  def update(id: Long): Long
  def read(id: Long): List[AdminRepository#TableElementType]
  def delete(id: Long): Long


}
