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
    <title>商品添加</title>
    <%@include file="/webapp/c/layout_c/styles.jsp" %>
</head>
<body>
<div id="pageContent-sn">
    <div class="container-fluid bg-white">
        <div class="container">
            <form>
                <div class="input-group">
                    <h5 class="col-md-12">基本信息</h5>
                    <div class="form-group col-md-12">
                        <label>商品名称</label>
                        <input class="text" class="form-control">
                    </div>

                    <div class="form-group col-md-12">
                        <label>商品分类</label>
                        <select class="form-control" id="role">
                            <option>请选择商品分类</option>
                            <option>手机数码</option>
                            <option>家用电器</option>
                        </select>
                    </div>

                    <div class="form-group col-md-12">
                        <label for="import_file" class="control-label">商品图片</label>
                        <input type="file" name="files" class="file-loading" id="import_file" multiple/>
                    </div>

                    <div class="form-group col-md-12">
                        <label>商品卖点</label>
                        <input class="text" class="form-control">
                    </div>
                </div>

                <div class="input-group">
                    <h5 class="col-md-12">规格/库存</h5><br>
                    <div class="form-group col-md-12">
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <div>
                                    <label>商品规格</label>
                                    <input type="radio" name="specification">单规格
                                    <input type="radio" name="specification">多规格
                                </div>
                            </div>

                            <div class="form-group col-md-12">
                                <label>商品编码</label>
                                <input class="text" class="form-control">
                            </div>

                            <div class="form-group col-md-12">
                                <label>商品价格</label>
                                <input class="text" class="form-control">
                            </div>

                            <div class="form-group col-md-12">
                                <label>商品划线价</label>
                                <input class="text" class="form-control">
                            </div>

                            <div class="form-group col-md-12">
                                <label>当前库存数量</label>
                                <input class="text" class="form-control">
                            </div>

                            <div class="form-group col-md-12">
                                <label>商品重量(Kg)</label>
                                <input class="text" class="form-control">
                            </div>

                            <div class="input-group-prepend">
                                <div>
                                    <label>库存计算方式</label>
                                    <input type="radio" name="inventory">下单减库存
                                    <input type="radio" name="inventory">付款减库存
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="input-group">
                    <h5 class="col-md-12">商品详情</h5><br>
                    <div class="form-group col-md-12">
                        <label>商品详情</label>
                        <textarea cols="20"></textarea>
                    </div>
                </div>

                <div class="input-group">
                    <h5 class="col-md-12">其他设置</h5><br>
                    <div class="form-group col-md-12">
                        <label>运费模板</label>
                        <select class="form-control" id="kind">
                            <option>请选择运费模板</option>
                            <option>全国统一邮费（按件数）</option>
                            <option>全国包邮（按件数）</option>
                        </select>
                    </div>

                    <div class="form-group col-md-12">
                        <label>商品状态 </label>
                        <input type="radio" name="state">上架
                        <input type="radio" name="state">下架
                    </div>

                    <div class="form-group col-md-12">
                        <label>初始销量</label>
                        <input type="text" class="form-control">
                    </div>

                    <div class="form-group col-md-12">
                        <label>商品排序</label>
                        <input type="text" class="form-control">
                    </div>
                </div>

                <div class="input-group">
                    <h5 class="col-md-12">积分设置</h5><br>
                    <div class="form-group col-md-12">
                        <label>是否开启积分赠送 </label>
                        <input type="radio" name="state">开启
                        <input type="radio" name="state">关闭
                    </div>
                    <div class="form-group col-md-12">
                        <label>是否允许使用积分抵扣 </label>
                        <input type="radio" name="state">允许
                        <input type="radio" name="state">不允许
                    </div>
                </div>

                <div class="input-group">
                    <h5 class="col-md-12">积分设置</h5><br>
                    <div class="form-group col-md-12">
                        <label>是否开启会员折扣 </label>
                        <input type="radio" name="state">开启
                        <input type="radio" name="state">关闭
                    </div>
                    <div class="form-group col-md-12">
                        <label>会员折扣设置 </label>
                        <input type="radio" name="state">默认折扣
                        <input type="radio" name="state">单独设置折扣
                    </div>
                </div>

                <div class="input-group">
                    <h5 class="col-md-12">分销设置</h5><br>
                    <div class="form-group col-md-12">
                        <label>是否开启单独分销 </label>
                        <input type="radio" name="state">开启
                        <input type="radio" name="state">关闭
                    </div>
                </div>

                <button type="submit">提交</button>
            </form>
        </div>
    </div>
</div>
<%@include file="/webapp/c/layout_c/scripts.jsp" %>
</body>
</html>
