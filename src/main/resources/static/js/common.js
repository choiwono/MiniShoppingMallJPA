function addCart(productId) {
    var JSONObject= {
        "productId" : productId,
        "quantity" : 10
    };
    var jsonData = JSON.stringify( JSONObject );
    $.ajax({
        url : '/api/cart',
        method : 'post',
        data : jsonData,
        dataType: "text",
        contentType: "application/json",
        success : function (data) {
            if(data == "ok"){
                alert("장바구니에 추가되었습니다.");
            }
        }
    });
}
