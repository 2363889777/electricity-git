!function () {
    $('#button-order-add-sn').on('click',function () {
        console.log("开始加载网页");
        $('#web-page-main-body').load('/logic/pageContent',function () {
            console.log("网页加载完成");
            $.getScript("/static/js/sn/demo/pageContentDemo2.js");
        });
    })
}();