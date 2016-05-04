window.SearchEmp = class SearchEmp

    _this = this

    $(document).on 'click', '#searchButton', =>
        x = document.forms["searchForm"]["input"].value
        if (x == null || x == "")
            alert("Search field is empty,Enter some data")
        @test()

    @test:=>
        jQuery.ajax({
            type:"POST",
            url:"/searchResult",
            data: @createSearchRequestData()
            success: @successCallback,
            contentType: "application/json",
            dataType: "json"
        })

    @createSearchRequestData: ->
        console.log "createSearchRequestData"
        data = {}
        data['searchBy'] = document.forms['searchForm']['dropdown'].value
        data['searchValue'] = document.forms['searchForm']['input'].value
        JSON.stringify(data)

    @successCallback: (responseData) =>
            console.log ("Specified Record searched")
            $('#searchdiv').html(responseData)
            document.forms['searchForm'].reset()

