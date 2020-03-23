<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2020/3/18
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加商品</title>
    <%@include file="/webapp/c/layout_c/styles.jsp" %>
</head>
<body>

<div id="pageContent-sn">
    <div class="container-fluid bg-white order-sn">
        <div class="row pl-4 pr-4 pt-4" id="add-good-list-page-sn">
            <div class="container">
                <form class="parent-form-add-good">
                    <div class="headline">
                        <div class="input-group">
                            <span class="mess"></span>基本信息
                        </div>
                    </div>
                    <div class="am-form-group">
                        <label class="des">商品名称 <span class="spa">*</span></label>
                        <div class=""><input type="text" class="tpl-form-input " name="goodName"></div>
                    </div>

                    <div class="am-form-group">
                        <label class="des">商品分类 <span class="spa">*</span></label>
                        <div class="form-group">
                            <label for="sel1"></label>
                            <select class="form-control" id="sel1" name="goodClassify">
                                <option>请选择商品分类:</option>
                            </select>
                        </div>
                        <form enctype="multipart/form-data" method="post" id="title-img-form">
                            <div class="am-form-group">
                                <label class="des">商品链接图片 <span class="spa">*</span></label><br>
                                <input type="file" name="good-title-img" id="import_file" multiple enctype="multipart/form-data"/>
                            </div>
                            <button type="button" id="title-img-button">提交</button>
                        </form>
                        <form>
                            <div class="am-form-group">
                                <label class="des">商品展示图片 <span class="spa">*</span></label><br>
                                <input type="file" name="good-show-imgs"  multiple/>
                            </div>
                        </form>
                        <div>
                            <label class="des">商品状态 </label>
                            <div class="custom-control custom-switch">
                                <input type="checkbox" class="custom-control-input" id="customSwitch3"
                                       name="goodPutAway" value="1">
                                <input type="hidden" name="goodPutAway" value="0">
                                <label class="custom-control-label" for="customSwitch3">上架</label>
                            </div>
                            <div class="custom-control custom-switch">
                                <input type="checkbox" class="custom-control-input" id="customSwitch1" name="goodHot"
                                       value="1">
                                <input type="hidden" name="goodHot" value="0">
                                <label class="custom-control-label" for="customSwitch1">热销</label>
                            </div>

                            <div class="custom-control custom-switch">
                                <input type="checkbox" class="custom-control-input" id="customSwitch2"
                                       name="goodRecommend" value="1">
                                <input type="hidden" name="goodRecommend" value="0">
                                <label class="custom-control-label" for="customSwitch2">推荐</label>
                            </div>
                        </div>


                        <div class="am-form-group">
                            <label class="des">商品卖点</label>
                            <div class=""><input type="text" class="tpl-form-input "></div>
                        </div>


                        <div class="headline">
                            <div class="input-group">
                                <span class="mess"></span>规格/库存
                            </div>
                        </div>

                        <div class="am-form-group">
                            <label class="des">商品规格 <span class="spa">*</span></label>
                            <div class="container" style="margin-left: 120px;margin-top: -23px">
                                <label style="margin-right: 30px;padding-top: 0px;">
                                    <input type="radio" name="specification">
                                    <span>单规格</span>
                                </label>
                                <label>
                                    <input type="radio" name="specification">
                                    <span>多规格</span>
                                </label>
                            </div>
                            <div>

                                <div class="am-form-group">
                                    <label class="des">商品颜色<span class="spa">*</span></label>
                                    <div class=""><input type="text" class="tpl-form-input" name="goodColor"></div>
                                </div>

                                <div class="am-form-group">
                                    <label class="des">商品尺码 <span class="spa">*</span></label>

                                    <div class="form-group">
                                        <label for="goodSize-sel"></label>
                                        <select class="form-control" id="goodSize-sel" name="goodSize">
                                            <option>请选择商品尺码</option>
                                        </select>
                                    </div>
                                </div>

                                <div class="am-form-group">
                                    <label class="des">商品价格 <span class="spa">*</span></label>
                                    <div class=""><input type="text" class="tpl-form-input " name="goodPrice"></div>
                                </div>

                                <div class="am-form-group">
                                    <label class="des">当前库存数量<span class="spa">*</span></label>
                                    <div class=""><input type="text" class="tpl-form-input " name="goodCount"></div>
                                </div>

                                <div class="am-form-group">
                                    <label class="des">商品重量(Kg)<span class="spa">*</span></label>
                                    <div class=""><input type="text" class="tpl-form-input " name="good"></div>
                                </div>
                            </div>
                        </div>
                        <div>
                            <label class="des">库存计算方式</label>
                            <div class="container" style="margin-left: 120px;margin-top: -23px">
                                <label style="margin-right: 30px;padding-top: 0px;">
                                    <input type="radio" name="specification">
                                    <span>下单减库存</span>
                                </label>
                                <label>
                                    <input type="radio" name="specification">
                                    <span>付款减库存</span>
                                </label>
                            </div>
                        </div>
                    </div>

                    <div class="headline">
                        <div class="input-group">
                            <span class="mess"></span>商品详情
                        </div>
                    </div>

                    <form>
                        <div class="input-group">
                            <textarea name="goodDetailedPicture" id="editor1" rows="10" cols="80">
                            </textarea>
                        </div>
                    </form>

                    <div class="headline">
                        <div class="input-group">
                            <span class="mess"></span>其他设置
                        </div>
                    </div>

                    <label class="des">商品分类 <span class="spa">*</span></label>
                    <div class="form-group">
                        <label for="sel2"></label>
                        <select class="form-control" id="sel2">
                            <option>请选择运费模板:</option>
                            <option>全国统一运费（按件数）</option>
                            <option>全国包邮（按件数）</option>
                        </select>
                    </div>


                    <div class="am-form-group" style="text-align: center">
                        <button type="button" class="am-btn-secondary" name="add-good-commit-button">提交</button>
                    </div>
                </form>

            </div>
        </div>
    </div>
</div>
<%@include file="/webapp/c/layout_c/scripts.jsp" %>

<script>
    CKEDITOR.replace('editor1');
</script>
</body>
</html>
