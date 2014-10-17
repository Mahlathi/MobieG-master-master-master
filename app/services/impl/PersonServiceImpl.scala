package services.impl

import people.Person
import repository.PersonRepository.PersonRepository
import services.PersonServices
import scala.slick.driver.MySQLDriver.simple._

/**
 * Created by joseph on 2014/09/26.
 */
class PersonServiceImpl extends PersonServices
{
  val personRepo = TableQuery[PersonRepository]

  override def getAllPeople(): List[PersonRepository#TableElementType] =
  {
    Database.forURL("jdbc:mysql://localhost:3306/mysql", driver = "com.mysql.jdbc.Driver", user = "root", password = "admin").withSession
    {
      implicit session =>
        val personObj = personRepo.list
        personObj
    }
  }
//
  override def getPersonWithId(id: Long) : Person=
  {
    Database.forURL("jdbc:mysql://localhost:3306/mysql", driver = "com.mysql.jdbc.Driver", user = "root", password = "admin").withSession {
      implicit session =>
        val personObj = personRepo.list.filter(_.id == id )
        val person = personObj.head
        person
    }
  }
}
