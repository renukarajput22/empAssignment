xquery version "1.0-ml";

import module namespace admin = "http://marklogic.com/xdmp/admin" at "/MarkLogic/admin.xqy";

let $config := admin:get-configuration()
let $dbid := xdmp:database("employee")

let $rangespec :=
      admin:database-range-element-index(
          "string", "http://www.w3.org/1999/xhtml",
          "ID", "http://marklogic.com/collation",
          fn:true()
      )
let $config := admin:database-add-range-element-index($config, $dbid, $rangespec)

return admin:save-configuration($config)