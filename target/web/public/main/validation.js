(function() {
  var Coffeecup;

  Coffeecup = (function() {
    var cup;

    function Coffeecup() {}

    Coffeecup.prototype.validateForm = function() {
      return alert('Text Field must be filled out');
    };

    cup = new Coffeecup;

    cup.validateForm();

    return Coffeecup;

  })();

}).call(this);

//# sourceMappingURL=validation.js.map
