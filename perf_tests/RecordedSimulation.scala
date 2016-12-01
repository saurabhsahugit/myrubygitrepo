
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseURL("http://www.which.co.uk")
		.inferHtmlResources()
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:45.0) Gecko/20100101 Firefox/45.0")

	val headers_0 = Map("Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")

/*
    val uri01 = "http://d2oh4tlt9mrke9.cloudfront.net/Record/js/sessioncam.recorder.js"
    val uri02 = "http://wca-assets-which-prod-euwest1.s3.amazonaws.com/fragment/prod/application-f2fa9f333ebc607008255f21e7dc58b6.css"
    val uri03 = "http://ajax.googleapis.com/ajax/libs"
    val uri04 = "http://ocsp.usertrust.com"
    val uri05 = "http://dam.which.co.uk.s3-website-eu-west-1.amazonaws.com"
    val uri06 = "http://cdnjs.cloudflare.com/ajax/libs/underscore.js/1.5.2/underscore-min.js"
    val uri07 = "http://gn.symcd.com"
    val uri08 = "http://fonts-which-co-uk.s3.amazonaws.com/open-sans/opensans_regular/OpenSans-Regular-webfont.woff"
    val uri09 = "http://t.co/i/adsct"
    val uri10 = "http://cdn.optimizely.com/js/3586502935.js"
    val uri11 = "http://pagead2.googlesyndication.com/pagead/gen_204"
    val uri12 = "http://www.googletagservices.com/tag/js/gpt.js"
    val uri13 = "http://www.staticwhich.co.uk/media/images"
*/
	val scn = scenario("RecordedSimulation")
		.exec(http("request_0")
			.get("/cars")
			.headers(headers_0)
/*			.resources(http("request_1")
			.get(uri06 + ""),
            http("request_2")
			.get(uri01 + ""),
            http("request_3")
			.get("/reviews/assets-rad/debut_light-a8d8a980c340a45af427b231d35c20ca.png")
			.headers(headers_3),
            http("request_4")
			.get(uri08 + "")
			.headers(headers_4),
            http("request_5")
			.get(uri09 + "?p_id=Twitter&p_user_id=0&txn_id=nveth&events=%5B%5B%22pageview%22%2Cnull%5D%5D&tw_sale_amount=0&tw_order_quantity=0&tw_iframe_status=0")
			.headers(headers_3),
            http("request_6")
			.get("/reviews/assets-rad/application-b5b2bcc8a9af3b8e92d1dbc670c175cf.js"),
            http("request_7")
			.post(uri04 + "/")
			.headers(headers_7)
			.body(RawFileBody("RecordedSimulation_0007_request.txt")),
            http("request_8")
			.get(uri03 + "/swfobject/2.2/swfobject.js?_=1480627500441"),
            http("request_9")
			.get(uri03 + "/swfobject/2.2/swfobject.js?_=1480627500438"),
            http("request_10")
			.get(uri03 + "/swfobject/2.2/swfobject.js?_=1480627500439"),
            http("request_11")
			.get(uri03 + "/swfobject/2.2/swfobject.js?_=1480627500440"),
            http("request_12")
			.get(uri03 + "/swfobject/2.2/swfobject.js?_=1480627500442")))
		.pause(1)
		.exec(http("request_13")
			.post(uri07 + "/")
			.headers(headers_7)
			.body(RawFileBody("RecordedSimulation_0013_request.txt"))
			.resources(http("request_14")
			.get(uri11 + "?id=lidar2&v=518&&r=n&url=http%3A%2F%2Fwww.which.co.uk%2Fl%2Fcars&tt=2754&pt=2750&deb=1-1-0-0-0--1&tvt=0&nd=0")
			.headers(headers_3)))
*/
)
	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
