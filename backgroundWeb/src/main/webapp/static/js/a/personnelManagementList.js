$('#PersonnelManagement-a #button-add-a').on("click",function () {
  $('#web-page-main-body').load(address+'/add_button',function () {
    $.getScript("/static/js/a/add-personnel-management.js");
  });
});