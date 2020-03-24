/**** 商品列表页面 js
 *******************************************/

!function(){
    // 添加按钮
    $('#good-classify-list-add-button-sn').on("click",function () {
        $('#web-page-main-body').load(address+'/pageContent/good/GoodClassifyList/add #pageContent-sn',function () {
            //待完善
            $.getScript("/static/js/sn/good/addGoodClassify.js");
        });
    });

}();
