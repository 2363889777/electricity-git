!function () {
    let result = $('#login').validate({
        rules: {
            account: {
                required: true
            },
            password:{
                required:true
            }
        },
        messages: {
            account: {
                required: "账号必填"
            },
            password: {
                required:"密码必填"
            }
        },
        /* 重写错误显示消息方法,以alert方式弹出错误消息 */
        showErrors: function(errorMap, errorList) {
            var msg = "";
            $.each( errorList, function(i,v){
                msg += (v.message+"\r\n");
            });
            if(msg!="") alert(msg);
        },
        /* 失去焦点时不验证 */
        onfocusout: false
    });
    //前台登录验证信息提示
    $('#submit-login').on('click', function () {
        $.ajax({
            url: "logic/loginAjax",
            type: 'post',
            data: $('#login').serialize(),
            success: function (data) {
                let message = JSON.parse(data);
                if (message.flag == false) {
                    alert(message.message);
                } else {
                    console.log("表单提交");
                    $('#login').submit();
                }
            },
            beforeSend: function () {
                return result.form();
            }
        });
    });
    //后台登录验证信息提示
    if ($('#error-message').length != 0) {
        alert($('#error-message').text());
    }
}();