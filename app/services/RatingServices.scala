package services

import repository.RatingRepository.RatingRepository

/**
 * Created by joseph on 2014/09/25.
 */
trait RatingServices
{
    def ratingsWithRatingOf(rate : Int) : List[RatingRepository#TableElementType]

    def ratingsbigger(rate : Int) : List[RatingRepository#TableElementType]

    def ratingsLower(rate : Int) : List[RatingRepository#TableElementType]
}
