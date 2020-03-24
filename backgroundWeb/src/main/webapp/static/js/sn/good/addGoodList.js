/**** 添加商品js代码
 *******************************************/
!function(){
    CKEDITOR.replace('editor1');

    $('#add-good-list-page-sn [name="add-good-commit-button"]').on('click',function () {
        let parentForm = $('#add-good-list-page-sn .parent-form-add-good').serialize();
        console.log(parentForm);
        // $.ajax({
        //     url:address+"/pageContent/good/addGood/function",
        //     data:parentForm,
        //     type:"post",
        //     success:function (content) {
        //         alert(content);
        //     }
        // })
    })

    //所有的数据测试
    $('#add-good-list-page-sn [name="add-good-commit-button"]').on("click",function () {
        // 获取所有的文件上传 可以循环遍历(不需要)
        let file = $("#import_file")[0].files[0];
        // 创建form对象（通过该方式 直接获取 表单内容 包括文件上传）
        let form1=document.querySelector("#all-message-form");
        let form = new FormData(form1);
        // form.append('myfile', file);
        $.ajax({
            type: 'POST',
            url: address+"/pageContent/good/addGood/function/test?type=test",
            data: form,
            processData: false,  // 告诉jquery不转换数据
            contentType: false,  // 告诉jquery不设置内容格式
            success: function (arg) {
                alert(arg);
                //重置表单
                form1.reset();
            }
        })
    })


    //单个图片
    $('#add-good-list-page-sn [name="add-good-commit-button"]').on("click",function () {
        let content = $('#add-good-list-page-sn #title-img-form').serialize();
        // 获取所有的文件上传 可以循环遍历
        let titleFile = $("#import_file")[0].files[0];
        // 创建form对象
        let form = new FormData();
        form.append('good-title-img', titleFile);
        // $.ajax({
        //     type: 'POST',
        //     url: address+"/pageContent/good/addGood/function?type=img",
        //     data: form,
        //     processData: false,  // 告诉jquery不转换数据
        //     contentType: false,  // 告诉jquery不设置内容格式
        //
        //     success: function (arg) {
        //         console.log(arg);
        //
        //     }
        // })
        // $.ajax({
        //     url:address+"/pageContent/good/GoodClassifyList/add/goodImg?type=parentForm",
        //     data:content,
        //     type: 'post',
        //     success:function (content) {
        //         console.log(content)
        //     }
        // })
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


