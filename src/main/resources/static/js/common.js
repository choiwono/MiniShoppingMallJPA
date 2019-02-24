function addCart(id) {
    var amount = $('#'+id).val();
    if(amount == null || 0){
        amount = 1;
    }
    var JSONObject= {
        "productId" : id,
        "quantity" : amount
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
        },
        timeout: 3000
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
    } else if(option == 3){
        $('#recordModal').modal('show');
    }
}

function amountModify(id, option){
    var amount = $('#'+id).val();
    var int = parseInt($('#'+id).val());

    if(option == "plus"){
        if(amount == 10){
            alert("최대개수입니다");
            return;
        }
        $('#'+id).val(int+1);
    } else {
        if(amount == 1){
            alert("1개이상 담아주세요.");
            return;
        }
        $('#'+id).val(int-1);
    }
}

function changeProduct(id){
    var amount = $('#'+id).val();
    var totalPrice = 0;
    var size = $("input[name='price']").length;
    for(i=0; i<size; i++){
        totalPrice += $("input[name='amount']").eq(i).prop("value") * $("input[name='price']").eq(i).prop("value");
    }
    $('#span-'+id).html("수량 : "+amount+"개");
    $("#totalPrice").html(totalPrice);
}

function changeProductCart(id){
    var amount = $('#'+id).val();
    var JSONObject= {
        "productId" : id,
        "quantity" : amount
    };
    var jsonData = JSON.stringify( JSONObject );
    $.ajax({
        url : '/api/cart/change',
        method : 'POST',
        data : jsonData,
        dataType: "text",
        contentType: "application/json",
        success : function (data) {
            if(data == "success"){
                alert("수량값이 변경되었습니다.");
                changeProduct(id);
            }
        },
        error : function (data) {
            alert("통신실패. 다시 시도해주시길 바랍니다.");
        },
        timeout: 3000
    });
}

function addWishItem(id){
    var JSONObject= {
        "productId" : id,
        "quantity" : 1
    };
    var jsonData = JSON.stringify( JSONObject );
    $.ajax({
        url : '/api/account/addWishItem',
        method : 'post',
        data : jsonData,
        dataType: "text",
        contentType: "application/json",
        success : function (data) {
            if(data == "ok"){
                alert("테스트중입니다.");
            }
        },
        error : function (data) {
            alert("통신실패. 다시 시도해주시길 바랍니다.");
        },
        timeout: 3000
    });
}

function openZipCode() {
    new daum.Postcode({
        oncomplete: function(data) {
            // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

            // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
            // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
            var roadAddr = data.roadAddress; // 도로명 주소 변수
            var extraRoadAddr = ''; // 참고 항목 변수

            // 법정동명이 있을 경우 추가한다. (법정리는 제외)
            // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
            if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                extraRoadAddr += data.bname;
            }
            // 건물명이 있고, 공동주택일 경우 추가한다.
            if(data.buildingName !== '' && data.apartment === 'Y'){
                extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
            }
            // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
            if(extraRoadAddr !== ''){
                extraRoadAddr = ' (' + extraRoadAddr + ')';
            }

            if(data.jibunAddress !== ''){
                roadAddr = data.jibunAddress;
            }

            // 우편번호와 주소 정보를 해당 필드에 넣는다.
            document.getElementById('sample4_postcode').value = data.zonecode;
            document.getElementById("sample4_roadAddress").value = roadAddr;
        }
    }).open();
}