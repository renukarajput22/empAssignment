(function() {
  var SearchEmp;

  window.SearchEmp = SearchEmp = (function() {
    var _this;

    function SearchEmp() {}

    _this = SearchEmp;

    $(document).on('click', '#searchButton', function() {
      var x;
      x = document.forms["searchForm"]["input"].value;
      if (x === null || x === "") {
        alert("Search field is empty,Enter some data");
      }
      return SearchEmp.test();
    });

    SearchEmp.test = function() {
      return jQuery.ajax({
        type: "POST",
        url: "/searchResult",
        data: SearchEmp.createSearchRequestData(),
        success: SearchEmp.successCallback,
        contentType: "application/json",
        dataType: "json"
      });
    };

    SearchEmp.createSearchRequestData = function() {
      var data;
      console.log("createSearchRequestData");
      data = {};
      data['searchBy'] = document.forms['searchForm']['dropdown'].value;
      data['searchValue'] = document.forms['searchForm']['input'].value;
      return JSON.stringify(data);
    };

    SearchEmp.successCallback = function(responseData) {
      console.log("Specified Record searched");
      $('#searchdiv').html(responseData);
      return document.forms['searchForm'].reset();
    };

    return SearchEmp;

  })();

}).call(this);

//# sourceMappingURL=search.js.map
