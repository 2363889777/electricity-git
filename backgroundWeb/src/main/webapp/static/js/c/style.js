$(function(){
    var fileInput = new FileInput();
    fileInput.Init("import_file", '上传的url');
});

//初始化fileinput
var FileInput = function () {
    var oFile = new Object();

    //初始化fileinput控件（第一次初始化）
    oFile.Init = function (ctrlName, uploadUrl) {
        var control = $('#' + ctrlName);

        //初始化上传控件的样式
        control.fileinput({
            language: 'zh', //设置语言
            uploadUrl: uploadUrl, //上传的地址
            uploadAsync: false,
            allowedFileExtensions: null,//接收的文件后缀
            showUpload: false, //是否显示上传按钮
            showCaption: false,//是否显示标题
            browseClass: "btn btn-primary", //按钮样式
            dropZoneEnabled: false,//是否显示拖拽区域
            maxFileSize: 0,//单位为kb，如果为0表示不限制文件大小
            // maxFileCount: 10, //表示允许同时上传的最大文件个数
            enctype: 'multipart/form-data',
            validateInitialCount: true,
            previewFileIcon: "<i class='glyphicon glyphicon-king'></i>",
            msgFilesTooMany: "选择上传的文件数量({n}) 超过允许的最大数值{m}！",
            showPreview: true,//是否显示预览区域
            previewSettings: {
                image: {width: "100px", height: "100px"},
            },//预览区域图片统一大小
            allowedPreviewTypes: ['image'],//
            layoutTemplates: {
                actionUpload: '',//清除预览区域上传按钮
                actionZoom: '',//清除预览区域预览按钮
                // actionDelete: ''//清除预览区域删除按钮
            },
            showClose: false,//是否显示关闭按钮
            uploadExtraData: function () {   //额外参数的关键点
                var obj = {};
                obj.id = $('#odiId').val();
                obj.fileType = "";
                obj.tableName = "T_ONLINE_DEVICE_INFO";
                obj.fileDesprition = "监控档案-在线监测设备备案";
                return obj;
            }
        }).on("filebatchuploadsuccess", function () {
            $('#import_file').fileinput('refresh');
            $('#import_file').fileinput('disable').fileinput('enable');
            Feng.success("上传成功");
        }).on('filebatchuploaderror', function() {
            $('#import_file').fileinput('refresh');
            $('#import_file').fileinput('disable').fileinput('enable');
            Feng.error("上传失败");
            online.refreshTable();
            online.close();
        });

        $("#import_file").on("filebatchselected", function(event, files) {
            $("#textTitle").val();
            if (files != null && files.length > 0 && $("#textTitle").val()=="") {
                var file = files[0];
                $("#textTitle").val(file.name);
            }
        });
    };
    return oFile;
};
