/**** 添加商品分类页面的js代码
 *******************************************/
!function () {
    //选择父级菜单的下拉条
    $('#add-good-classify-list-page-sn #sel1').on('focus',function () {
        //如果已经被选中

        //先清空，在加载
        $('#add-good-classify-list-page-sn #sel1').html("");
            $.ajax({
                url:address+"/pageContent/good/GoodClassifyList/add/function",
                data:{type:'select'},
                type: 'post',
                success:function (content) {
                    console.log(content);
                    let contentVel = JSON.parse(content);
                    let $parentOption = $('<option value="0">顶级菜单</option>');
                    $('#add-good-classify-list-page-sn #sel1').append($parentOption);
                    for (let i = 0;i < contentVel.length;i++){
                        let $option = $('<option>111</option>');
                        $option.text(contentVel[i].name);
                        $option.attr("value",contentVel[i].id);
                        console.log(contentVel[i]);
                        $('#add-good-classify-list-page-sn #sel1').append($option);
                    }
                }
            })

    })

    //表单提交按钮
    $('#add-good-classify-list-page-sn [name="submit"]').on('click',function () {
        let value = $('#add-good-classify-list-page-sn form').serialize();
        $.ajax({
            url:address+"/pageContent/good/GoodClassifyList/add/function?type=form",
            data:value,
            type: 'post',
            success:function (content) {
                alert(content);
            }
        })
    })
}();





