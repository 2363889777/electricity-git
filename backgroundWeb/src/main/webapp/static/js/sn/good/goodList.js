/**** 商品列表页面 js
 *******************************************/
!function(){
    // 添加按钮
    $('#good-list-add-button-sn').on("click",function () {
        $('#web-page-main-body').load(address+'/pageContent/good/addGood #pageContent-sn',function () {
            $.getScript("/static/js/sn/good/addGoodList.js");
        });
    });

    //修改状态按钮
    $('#good-list-page-sn [type="checkbox"]').on("click",function () {
        let type = $(this).next().text();
        let goodId = $(this).attr("data-good");
        let afterChecked = $(this).prop("checked");
        let beforeChecked = !afterChecked;
        // 用来取消相关动作 将动作后的值 取反赋值回去
        // let after = $(this).prop("checked",!isChecked);
        alert(type+goodId);
        $.ajax({
            url:address+"/pageContent/good/goodList/function",
            data:{type:type,goodId:goodId,checkedState:beforeChecked},
            success:function (content) {
                alert(content);
            }
        })
    })

    // 分页按钮
    $('#good-list-page-sn .page-link').on("click",function () {
        //发送页面请求
        let page = $(this).attr("data-pageIndex");
        alert(page);
        //发送请求
        $('#web-page-main-body').load(address+'/pageContent/good/goodList #pageContent-sn',{pageIndex:page-1},function () {
            $.getScript("/static/js/sn/good/goodList.js");
        });

    })

}();
