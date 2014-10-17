package controllerTest

/**
 * Created by akhona on 2014/10/17.
 */
import com.google.gson.Gson
import models.crudmodels.{SpecialityModel, SponsorModel}
import models.{ChannelModel, FacilitatorModel, UserHistoryModel, AdminModel}
import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner
import play.api.Logger
import play.api.libs.json.{JsString, JsObject, JsValue, Json}
import play.api.test.Helpers._
import play.api.test.{FakeRequest, WithApplication}


@RunWith(classOf[JUnitRunner])
class SponsorControllerTest extends Specification
{
  val gson = new Gson()

  "Controllers" should
    {
      "Should create Channel Object" in new WithApplication()
      {
        val facilitators = FacilitatorModel(4)
        val jsonstringfs = gson.toJson(facilitators).stripMargin

        val roled = SpecialityModel(99871114,"Zubenathi","Well versed in all",4)
        val jsonstringd = gson.toJson(roled).stripMargin

        val facilitator = ChannelModel(8,"Real","Hello kitty",4)
        val jsonstringf = gson.toJson(facilitator).stripMargin


        val role = SponsorModel(12,"Joshua","url goes here","good job","uuuu",8)
        val jsonstring = gson.toJson(role).stripMargin



        val json: JsValue = JsObject(Seq
          (
              "object" -> JsString(jsonstring),
              "facobject" -> JsString(jsonstringf),
              "Fobject" -> JsString(jsonstringfs),
               "Sobject" -> JsString(jsonstringd)

            )
        )

        val Some(result) = route(FakeRequest(
          POST, "/createSponsor/:Sponsor").withJsonBody(json)
        )
        status(result) must equalTo(OK)
        Logger.debug(" The Result is " + result)
        contentType(result) must beSome("application/json")

      }
    }
}
