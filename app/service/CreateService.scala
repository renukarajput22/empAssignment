package service

import java.net.URI

import com.marklogic.xcc.{Session, ContentSourceFactory}
import play.api.libs.json.JsValue

/**
  * Created by rrn3194 on 4/27/16.
  */
class CreateService {

//  def input(eID : Seq[String], eName :  Seq[String], eSalary :  Seq[String]) : Unit = {
   def input(json : JsValue){
      val uri = new URI("xcc://admin:admin@localhost:8050/employee")
      val contentSource = ContentSourceFactory.newContentSource(uri)
      val session = contentSource.newSession()
      val id = json.\("id").as[String]
      val name = json.\("name").as[String]
      val salary = json.\("salary").as[String]
      session.setTransactionMode(Session.TransactionMode.UPDATE)
    //  session.submitRequest(session.newAdhocQuery("xdmp:document-insert('emp.xml', <Employee><ID>"+eID.toList.head+"</ID><Name>"+eName.toList.head+"</Name><Salary>"+eSalary.toList.head+"</Salary></Employee>, xdmp:default-permissions(), /collections/doc1)"))
//      session.submitRequest(session.newAdhocQuery("xdmp:node-insert-child(doc('emp2.xml')/emp,<record><id>"+eID.toList.head+"</id><name>"+eName.toList.head+"</name><salary>"+eSalary.toList.head+"</salary></record>)\n"))
      session.submitRequest(session.newAdhocQuery("xdmp:node-insert-child(doc('emp.xml')/emp,<record><id>"+id+"</id><name>"+name+"</name><salary>"+salary+"</salary></record>)\n"))
      session.commit()
      session.close()
    }
}
