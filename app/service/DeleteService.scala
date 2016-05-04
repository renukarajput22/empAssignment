package service

import java.net.URI

import com.marklogic.xcc.{ResultSequence, Session, ContentSourceFactory}
import play.api.libs.json.JsValue

/**
  * Created by rrn3194 on 4/27/16.
  */
class DeleteService(json: JsValue) {
  def remove() : Unit = {
    val key = json.\("deleteBy").as[String]
    val value = json.\("deleteValue").as[String]
    val uri = new URI("xcc://admin:admin@localhost:8050/employee")
    val contentSource = ContentSourceFactory.newContentSource(uri)
    val session = contentSource.newSession()
    session.setTransactionMode(Session.TransactionMode.UPDATE)
//    session.submitRequest(session.newAdhocQuery("for $doc in doc() let $result := for $record in $doc//node where $record//id = "+value+" return $record let $node := xdmp:node-delete($doc/$result) return $node"))
    session.submitRequest(session.newAdhocQuery(("for $doc in doc()\n\nlet $result := for $re in $doc//record\n where $re//"+key+" = \""+value+"\"\n  return $re\n  \nlet $node := xdmp:node-delete($doc//$result)\n\nreturn $node")))
    session.commit()
    session.close()
  }
}
