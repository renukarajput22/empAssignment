package service

import java.net.URI
import com.marklogic.xcc.{ResultSequence, Session, ContentSourceFactory}
import play.api.libs.json.JsValue

/**
  * Created by rrn3194 on 4/27/16.
  */
//class SearchService(selected : Seq[String], field : Seq[String]) {

class SearchService (json : JsValue){
    val uri = new URI("xcc://admin:admin@localhost:8050/employee")
    val contentSource = ContentSourceFactory.newContentSource(uri)
    val session = contentSource.newSession()
    val selected = json.\("searchBy").as[String]
    val field = json.\("searchValue").as[String]

    def search : String = {
        session.setTransactionMode(Session.TransactionMode.UPDATE)
//      val res = session.submitRequest(session.newAdhocQuery("cts:search(//record, cts:element-value-query(xs:QName(\"" + selected.toList.head + "\"), \"" + field.toList.head + "\"))"))
        val res: ResultSequence = session.submitRequest((session.newAdhocQuery("cts:search(//record, cts:element-value-query(xs:QName(\""+selected+"\"),\""+field+"\"))")))
        println("result==== "+ res.asString())
        session.commit()
        session.close()
        return res.asString()
  }
}
