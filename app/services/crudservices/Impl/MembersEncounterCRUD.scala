package services.crudservices.Impl

import domain.stuff.MemberEncounter
import repository.MemberEncountersRepository.MemberEncountersRepository

import scala.slick.lifted.TableQuery

/**
 * Created by akhona on 2014/10/02.
 */
import scala.slick.driver.MySQLDriver.simple._

class MembersEncounterCRUD {
  val memEncounterrepo = TableQuery[MemberEncountersRepository]

  Database.forURL("jdbc:mysql://localhost:3306/mysql", driver = "com.mysql.jdbc.Driver", user = "root", password = "admin").withSession { implicit session =>

    //Creating tables
    //memEncounterrepo.ddl.create


    def create( insertMemEncounter: MemberEncounter ) = {
        val valo = memEncounterrepo.insert(insertMemEncounter)
    }

    /*Testing for extraction
    def Read(others: String, id: String) =
      memEncounterrepo foreach { case (count: MemberEncounter) =>
        if (count.id.contentEquals(id)){
          assert(count.facilitatorId.contentEquals(others))
        }
      }
    Read("83", "61")*/
  }
}
