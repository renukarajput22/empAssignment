package service

import java.net.URI

import com.marklogic.xcc.{ContentSourceFactory, Session}
import play.api.libs.json.JsValue

/**
  * Created by rrn3194 on 5/4/16.
  */
class UpdateService(json : JsValue) {

    val uri = new URI("xcc://admin:admin@localhost:8050/employee")
    val contentSource = ContentSourceFactory.newContentSource(uri)
    val session = contentSource.newSession()
    val updateBy = json.\("updateBy").as[String]
    val oldValue = json.\("oldValue").as[String]
    val newValue = json.\("newValue").as[String]

  def updateRecord : Unit = {
    session.setTransactionMode(Session.TransactionMode.UPDATE)
    session.submitRequest(session.newAdhocQuery("for $doc in doc()\nlet $result := for $re in $doc//record \nwhere $re//"+updateBy+" = \""+oldValue+"\" \n  return $re//"+updateBy+" \nlet $node := xdmp:node-replace($doc/$result, <"+updateBy+">"+newValue+"</"+updateBy+">)\nreturn $node"))
    session.commit()
    session.close()
  }
}
