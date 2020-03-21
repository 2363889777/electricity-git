/**** 商品列表页面 js
 *******************************************/
// 添加按钮
$('#good-list-add-button-sn').on("click",function () {
    $('#web-page-main-body').load(address+'/pageContent/good/addGood #pageContent-sn',function () {
        //待完善
        $.getScript("/static/js/sn/order/batchSendGoods-allOrder.js");
    });
})