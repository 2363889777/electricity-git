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
    /****时间组件相关设置
     *******************************************/
    $('#start-date').datetimepicker({
        format: 'YYYY-MM-DD dddd',
        locale: 'zh-CN'    });
    $('#end-date').datetimepicker({
        format: 'YYYY-MM-DD dddd',
        locale: 'zh-CN'    });
    /**** 表单提交
     *******************************************/
    $('#order-filter-search-button-sn').on('click',function () {
        let form_value = $('#order-filter-form-sn').serialize();
        let way_of_distribution = $('#order-filter-form-sn [name="way-of-distribution-sn"]').val();
        console.log("配送方式：" + way_of_distribution);
        console.log("表单的所有数据：" + form_value);
    })
}();