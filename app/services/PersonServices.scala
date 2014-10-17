package services

import people.Person
import repository.PersonRepository
import repository.PersonRepository.PersonRepository
import repository.PersonRepository.PersonRepository

/**
 * Created by joseph on 2014/09/26.
 */
trait PersonServices
{
    def getAllPeople() : List[PersonRepository#TableElementType]

    def getPersonWithId(id : Long) : Person
}
