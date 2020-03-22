/**** 添加商品js代码
 *******************************************/
!function(){
    CKEDITOR.replace('editor1');

    $('#add-good-list-page-sn [name="add-good-commit-button"]').on('click',function () {
        let parentForm = $('#add-good-list-page-sn .parent-form-add-good').serialize();
        console.log(parentForm);
        $.ajax({
            url:address+"/pageContent/good/addGood/function",
            data:parentForm,
            type:"post",
            success:function (content) {
                alert(content);
            }
        })
    })

    //选择商品尺码的下拉条
    $('#add-good-list-page-sn #goodSize-sel').on('focus',function () {
        //如果已经被选中
        //先清空，在加载
        $('#add-good-list-page-sn #goodSize-sel').html("");
        $.ajax({
            url:address+"/pageContent/good/addGood/function",
            data:{type:'select'},
            type: 'post',
            success:function (content) {
                console.log(content);
                let contentVel = JSON.parse(content);
                for (let i = 0;i < contentVel.length;i++){
                    let $option = $('<option>111</option>');
                    $option.text(contentVel[i].name);
                    $option.attr("value",contentVel[i].id);
                    $('#add-good-list-page-sn #goodSize-sel').append($option);
                }
            }
        })

    })

    //选择父级菜单的下拉条
    $('#add-good-list-page-sn #sel1').on('focus',function () {
        //如果已经被选中
        //先清空，在加载
        $('#add-good-list-page-sn #sel1').html("");
        $.ajax({
            url:address+"/pageContent/good/GoodClassifyList/add/function",
            data:{type:'select'},
            type: 'post',
            success:function (content) {
                console.log(content);
                let contentVel = JSON.parse(content);
                for (let i = 0;i < contentVel.length;i++){
                    let $option = $('<option>111</option>');
                    $option.text(contentVel[i].name);
                    $option.attr("value",contentVel[i].id);
                    $('#add-good-list-page-sn #sel1').append($option);
                }
            }
        })

    })

}();


