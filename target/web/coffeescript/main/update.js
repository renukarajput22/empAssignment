(function() {
  var UpdateEmp;

  window.UpdateEmp = UpdateEmp = (function() {
    var _this;

    function UpdateEmp() {}

    _this = UpdateEmp;

    $(document).on('click', '#updateButton', function() {
      var x, y;
      x = document.forms["updateForm"]["oldInput"].value;
      y = document.forms["updateForm"]["newInput"].value;
      if (x === null || x === "" || y === null || y === "") {
        alert("Update field is empty,Enter some data");
      }
      return UpdateEmp.test();
    });

    UpdateEmp.test = function() {
      return jQuery.ajax({
        type: "POST",
        url: "/updateResult",
        data: UpdateEmp.createUpdateRequestData(),
        success: UpdateEmp.successCallback,
        contentType: "application/json",
        dataType: "json"
      });
    };

    UpdateEmp.createUpdateRequestData = function() {
      var data;
      console.log("createUpdateRequestData");
      data = {};
      data['updateBy'] = document.forms['updateForm']['dropdown'].value;
      data['oldValue'] = document.forms['updateForm']['oldInput'].value;
      data['newValue'] = document.forms['updateForm']['newInput'].value;
      return JSON.stringify(data);
    };

    UpdateEmp.successCallback = function(data) {
      console.log("Specified Record is updated");
      return document.forms['updateForm'].reset();
    };

    return UpdateEmp;

  })();

}).call(this);

//# sourceMappingURL=update.js.map
