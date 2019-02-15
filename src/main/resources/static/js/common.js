function addCart(id) {

    var JSONObject= {
        "productId" : id,
        "quantity" : 1
    };
    var jsonData = JSON.stringify( JSONObject );
    $.ajax({
        url : '/api/cart',
        method : 'post',
        data : jsonData,
        dataType: "text",
        contentType: "application/json",
        success : function (data) {
            if(data == "success"){
                alert("장바구니에 추가되었습니다.");
                $('#layerPopup').modal('show')
            } else if(data == "duplicate"){
                alert("이미 중복된 상품이 있습니다.");
            } else if(data == "fail"){
                alert("오류가 발생했습니다.");
            }
        },
        error : function (data) {
            alert("통신실패. 다시 시도해주시길 바랍니다.");
        }
    });
}

function moveUrl(url){
    if(url == 1) {
        document.location.href = "/cart/list";
    }
}