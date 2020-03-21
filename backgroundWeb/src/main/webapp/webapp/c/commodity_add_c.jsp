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
    <%@include file="/webapp/c/layout_c/styles.jsp"%>
</head>
<body>


                    <div class="container">
                        <form>
                            <div class="headline">
                                <div class="input-group">
                                    <span class="mess"></span>基本信息
                                </div>
                            </div>
                            <div class="am-form-group">
                                <label class="des">商品名称 <span class="spa">*</span></label>
                                <div class=""><input type="text" class="tpl-form-input "></div>
                            </div>

                            <div class="am-form-group">
                                <label class="des">商品分类 <span class="spa">*</span></label>
                                <div class="form-group">
                                    <label for="sel1"></label>
                                    <select class="form-control" id="sel1">
                                        <option>请选择商品分类:</option>
                                        <option>手机数码</option>
                                        <option>加油电器</option>
                                        <option>电脑办公</option>
                                        <option>汽车用品</option>
                                    </select>
                                </div>

                                <div class="am-form-group">
                                    <label class="des">商品图片 <span class="spa">*</span></label>
                                    <input type="file" name="files" class="file-loading" id="import_file" multiple/>
                                </div>
                                <div class="custom-control custom-switch">
                                    <input type="checkbox" class="custom-control-input" id="customSwitch1">
                                    <label class="custom-control-label" for="customSwitch1">热销</label>
                                </div>

                                <div class="custom-control custom-switch">
                                    <input type="checkbox" class="custom-control-input" id="customSwitch2">
                                    <label class="custom-control-label" for="customSwitch2">推荐</label>
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
                                            <label class="des">商品编码 <span class="spa">*</span></label>
                                            <div class=""><input type="text" class="tpl-form-input "></div>
                                        </div>

                                        <div class="am-form-group">
                                            <label class="des">商品价格 <span class="spa">*</span></label>
                                            <div class=""><input type="text" class="tpl-form-input "></div>
                                        </div>

                                        <div class="am-form-group">
                                            <label class="des">商品划线价 <span class="spa">*</span></label>
                                            <div class=""><input type="text" class="tpl-form-input "></div>
                                        </div>

                                        <div class="am-form-group">
                                            <label class="des">当前库存数量<span class="spa">*</span></label>
                                            <div class=""><input type="text" class="tpl-form-input "></div>
                                        </div>

                                        <div class="am-form-group">
                                            <label class="des">商品重量(Kg)<span class="spa">*</span></label>
                                            <div class=""><input type="text" class="tpl-form-input "></div>
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

                            <div class="input-group">
                                <form>
                                    <textarea name="editor1" id="editor1" rows="10" cols="80">
                                    </textarea>
                                </form>
                            </div>

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


                            <div>
                                <label class="des">商品状态 </label>
                                <div class="container" style="margin-left: 120px;margin-top: -23px">
                                    <label style="margin-right: 30px;padding-top: 0px;">
                                        <input type="radio" name="specification">
                                        <span>上架</span>
                                    </label>
                                    <label>
                                        <input type="radio" name="specification">
                                        <span>下架</span>
                                    </label>
                                </div>
                            </div>


                            <div class="am-form-group">
                                <label class="des">初始销量 <span class="spa">*</span></label>
                                <div class=""><input type="text" class="tpl-form-input" placeholder="0"></div>
                            </div>
                            <div class="am-form-group">
                                <label class="des">商品排序 <span class="spa">*</span></label>
                                <div class=""><input type="text" class="tpl-form-input" placeholder="10"></div>
                            </div>

                            <div class="am-form-group" style="text-align: center">
                                <button type="submit" class="am-btn-secondary">提交</button>
                            </div>
                        </form>

                    </div>

<%@include file="/webapp/c/layout_c/scripts.jsp" %>

                    <script>
                        CKEDITOR.replace('editor1');
                    </script>
</body>
</html>
