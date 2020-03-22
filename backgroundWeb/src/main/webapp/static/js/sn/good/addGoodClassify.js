/**** 添加商品分类页面的js代码
 *******************************************/
!function () {
    //选择父级菜单的下拉条
    $('#add-good-classify-list-page-sn #sel1').on('click',function () {
        $.ajax({
            url:address+"/pageContent/good/GoodClassifyList/add/function",
            success:function (content) {
                console.log(content);
                for (let i = 0;i < content.length;i++){
                    let option = $('<option></option>');
                    option.html(content[i].name);
                    option.attr("value",content[i].id);
                    console.log(option);
                    $('#add-good-classify-list-page-sn #sel1').append(option);
                }
            }
        })
    })
}();





