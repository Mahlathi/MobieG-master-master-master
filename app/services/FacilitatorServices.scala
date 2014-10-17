package services

import people.Members
import repository.MembersRepository.MembersRepository

/**
 * Created by joseph on 2014/09/24.
 */
trait FacilitatorServices
{
  //def getAllMembersServed(facilitatorID :String) : List[MembersRepository#TableElementType]


  def hasMemberBeenServedByFacilitator(memberID :Long, facilitatorID : Long) : Boolean
}
