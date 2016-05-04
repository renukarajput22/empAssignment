window.DeleteEmp = class DeleteEmp

    _this = this

    $(document).on 'click', '#deleteButton', =>
        x = document.forms["deleteForm"]["input"].value
        if (x == null || x == "")
            alert("Delete field is empty,Enter data")
        @test()

    @test:=>
        jQuery.ajax({
            type:"POST",
            url:"/deleteResult",
            data: @createDelRequestData()
            success: @successCallback,
            contentType: "application/json",
            dataType: "json"
        })

    @createDelRequestData: ->
        console.log "createDelRequestData"
        data = {}
        data['deleteBy'] = document.forms['deleteForm']['dropdown'].value
        data['deleteValue'] = document.forms['deleteForm']['input'].value
        JSON.stringify(data)

    @successCallback: () =>
            alert("Record deleted")
            document.forms['deleteForm'].reset()
