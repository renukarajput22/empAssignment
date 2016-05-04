(function() {
  var AddEmp;

  window.addEmp = AddEmp = (function() {
    var _this;

    function AddEmp() {}

    _this = AddEmp;

    $(document).on('click', '#addButton', function() {
      var x, y, z;
      x = document.forms["addForm"]["id"].value;
      y = document.forms["addForm"]["name"].value;
      z = document.forms["addForm"]["salary"].value;
      if (x === null || x === "" || y === null || y === "" || z === null || z === "") {
        return alert("Text field is empty,Enter data");
      } else if (!/^[0-9]+$/.test(x) || !/^[0-9]+$/.test(z)) {
        return alert("Values must be numeric for ID and Salary! (Allowed input:0-9)");
      } else if (!/^[a-zA-Z]*$/.test(y)) {
        return alert("Invalid characters for Name field ! (Allowed input:a-z/A-Z)");
      } else {
        return AddEmp.test();
      }
    });

    AddEmp.test = function() {
      return jQuery.ajax({
        type: "POST",
        url: "/done",
        data: AddEmp.createAddRequestData(),
        success: AddEmp.successCallback,
        contentType: "application/json",
        dataType: "json"
      });
    };

    AddEmp.createAddRequestData = function() {
      var data;
      console.log("createAddRequestData");
      data = {};
      data['id'] = document.forms['addForm']['id'].value;
      data['name'] = document.forms['addForm']['name'].value;
      data['salary'] = document.forms['addForm']['salary'].value;
      return JSON.stringify(data);
    };

    AddEmp.successCallback = function() {
      alert("Record successfully added");
      return document.forms['addForm'].reset();
    };

    return AddEmp;

  })();

}).call(this);

//# sourceMappingURL=add.js.map
