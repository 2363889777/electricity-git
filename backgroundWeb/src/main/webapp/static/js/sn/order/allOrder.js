// 全部订单页面的js代码
!function () {
    $('#all-order-button').on('click',function () {
        alert("点击了所有订单的按钮");
    })
    $('#batch-send-goods-button').on('click',function () {
        $('#web-page-main-body').load(address+'/pageContent/order/allOrder/batch #pageContent-sn',function () {
            $.getScript("/static/js/sn/order/batchSendGoods-allOrder.js");
        });
    });
}();