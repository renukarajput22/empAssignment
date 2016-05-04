(function() {
  var DeleteEmp;

  window.DeleteEmp = DeleteEmp = (function() {
    var _this;

    function DeleteEmp() {}

    _this = DeleteEmp;

    $(document).on('click', '#deleteButton', function() {
      var x;
      x = document.forms["deleteForm"]["input"].value;
      if (x === null || x === "") {
        alert("Delete field is empty,Enter data");
      }
      return DeleteEmp.test();
    });

    DeleteEmp.test = function() {
      return jQuery.ajax({
        type: "POST",
        url: "/deleteResult",
        data: DeleteEmp.createDelRequestData(),
        success: DeleteEmp.successCallback,
        contentType: "application/json",
        dataType: "json"
      });
    };

    DeleteEmp.createDelRequestData = function() {
      var data;
      console.log("createDelRequestData");
      data = {};
      data['deleteBy'] = document.forms['deleteForm']['dropdown'].value;
      data['deleteValue'] = document.forms['deleteForm']['input'].value;
      return JSON.stringify(data);
    };

    DeleteEmp.successCallback = function() {
      alert("Record deleted");
      return document.forms['deleteForm'].reset();
    };

    return DeleteEmp;

  })();

}).call(this);

//# sourceMappingURL=delete.js.map
