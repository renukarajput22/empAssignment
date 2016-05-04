window.addEmp = class AddEmp

    _this = this

    $(document).on 'click', '#addButton', =>
        x = document.forms["addForm"]["id"].value
        y = document.forms["addForm"]["name"].value
        z = document.forms["addForm"]["salary"].value
        if (x == null || x == "" || y == null || y == "" || z == null || z == "")
            alert("Text field is empty,Enter data")
        else if(!/^[0-9]+$/.test(x) || !/^[0-9]+$/.test(z))
            alert("Values must be numeric for ID and Salary! (Allowed input:0-9)")
        else if (!/^[a-zA-Z]*$/.test(y))
            alert("Invalid characters for Name field ! (Allowed input:a-z/A-Z)")
        else
            @test()

    @test:=>
        jQuery.ajax({
            type:"POST",
            url:"/done",
            data: @createAddRequestData()
            success: @successCallback,
            contentType: "application/json",
            dataType: "json"
        })

    @createAddRequestData: ->
        console.log "createAddRequestData"
        data = {}
        data['id'] = document.forms['addForm']['id'].value
        data['name'] = document.forms['addForm']['name'].value
        data['salary'] = document.forms['addForm']['salary'].value
        JSON.stringify(data)

    @successCallback: () =>
            alert("Record successfully added")
            document.forms['addForm'].reset()
