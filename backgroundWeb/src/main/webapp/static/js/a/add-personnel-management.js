!function () {
  $('#PersonnelManagement-a #a  ').on('click',function () {
    let parentForm = $('#PersonnelManagement-a form ').serialize();
    console.log(parentForm);
    $.ajax({
      url:address+"/addUser",
      data:parentForm,
      type:"post",
      success:function (content) {
        alert(content);
        alert("提交成功");
      }
    })
  })
}();