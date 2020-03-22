package com.sanyi.sn.vo.good;

import com.xuetang9.jdbc.frame.annotation.ColName;

import java.util.Date;

/**
 * @author 十年
 * @function 商品分类
 * @date 2020/3/22 0022
 * @place 公司
 * @ver 1.0.0
 * @copy 老九学堂
 */
public class GoodClassifyVo {

//    gc.pk_good_classify_id,gc.good_classify_name,gc.create_time,
    /**
     *分类编号
     */
    @ColName("gc.pk_good_classify_id")
    private int id;
    /**
     * 分类名称
     */
    @ColName("gc.good_classify_name")
    private String name;
    /**
     * 父级分类名称
     */
    @ColName("pgc.good_classify_name")
    private String parentName;
    /**
     * 分类创建时间
     */
    @ColName("gc.create_time")
    private Date create_time;
//    pgc.good_classify_name


    @Override
    public String toString() {
        return "GoodClassifyVo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parentName='" + parentName + '\'' +
                ", create_time=" + create_time +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}
