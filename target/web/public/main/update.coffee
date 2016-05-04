window.UpdateEmp = class UpdateEmp

    _this = this

    $(document).on 'click', '#updateButton', =>
        x = document.forms["updateForm"]["oldInput"].value
        y = document.forms["updateForm"]["newInput"].value
        if (x == null || x == "" || y == null || y == "")
            alert("Update field is empty,Enter some data")
        @test()

    @test:=>
        jQuery.ajax({
            type:"POST",
            url:"/updateResult",
            data: @createUpdateRequestData()
            success: @successCallback,
            contentType: "application/json",
            dataType: "json"
        })

    @createUpdateRequestData: ->
        console.log "createUpdateRequestData"
        data = {}
        data['updateBy'] = document.forms['updateForm']['dropdown'].value
        data['oldValue'] = document.forms['updateForm']['oldInput'].value
        data['newValue'] = document.forms['updateForm']['newInput'].value
        JSON.stringify(data)

    @successCallback: (data) =>
            console.log ("Specified Record is updated")
            document.forms['updateForm'].reset()

