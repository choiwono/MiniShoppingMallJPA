function addCart(id, quantity) {

    var JSONObject= {
        "productId" : id,
        "quantity" : quantity
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
    } else if(url == 2){
        document.location.href="/main";
    }
}

function showModal(option){
    if(option == 1) {
        $('#exampleModal').modal('show')
    } else if(option == 2) {
        $('#joinModal').modal('show');
    }
}

function amountModify(option){
    var amount = $("input[name='amount']").val();
    if(option == "plus"){
        if(amount == 10){
            alert("최대개수입니다");
            return;
        }
        $("input[name='amount']").val(parseInt($("input[name='amount']").val())+1);
    } else {
        if(amount == 1){
            alert("1개이상 담아주세요.");
            return;
        }
        $("input[name='amount']").val(parseInt($("input[name='amount']").val())-1);
    }
}

function changeProduct(id){
    var amount = $("input[name='amount']").val();
    var price = $("input[name='price']").val();
    var JSONObject= {
        "productId" : id,
        "quantity" : amount,
        "price" : price
    };
    var jsonData = JSON.stringify( JSONObject );
    $.ajax({
        url : '/api/order/change',
        method : 'post',
        data : jsonData,
        dataType: "text",
        contentType: "application/json",
        success : function (data) {
            var str = JSON.parse(data);
            //var productId = str.productId;
            var amount = "수량 : ";
            amount += str.quantity+"개";
            var totalPrice = str.totalPrice;
            $("#amount").html(amount);
            $("#totalPrice").html(totalPrice);
        },
        error : function (data) {
            alert("통신실패. 다시 시도해주시길 바랍니다.");
        }
    });
}