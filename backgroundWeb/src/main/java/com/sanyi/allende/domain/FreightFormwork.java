package com.sanyi.allende.domain;

import com.xuetang9.jdbc.frame.annotation.ColName;

import java.sql.Date;

public class FreightFormwork {
    // 数据库 fieight_delivery_template
    // 模板ID
    @ColName("pk_freight_delivery_template_id")
    private Integer pkFreightDeliveryTemplateId;
    // 模板名称         freight_template
    @ColName("freight_template_name")
    private String FreightTemplateName;
    // 计费方式 freight_type
//    @ColName("pk_freight_type_id")
//    private Integer PkFreightTypeId;
    // 计费方式名称       freight_type
    @ColName("freight_type_name")
    private String FreightTypeName;
    // 排序           freight_template
    @ColName("freight_template_sort_number")
    private Integer freightTemplateSortNumber;
    // 添加时间             freight_template
    private Date createTime;
    // 更新时间             freight_template
    private Date updateTime;

    public Integer getPkFreightDeliveryTemplateId() {
        return pkFreightDeliveryTemplateId;
    }

    public void setPkFreightDeliveryTemplateId(Integer pkFreightDeliveryTemplateId) {
        this.pkFreightDeliveryTemplateId = pkFreightDeliveryTemplateId;
    }

    public String getFreightTemplateName() {
        return FreightTemplateName;
    }

    public void setFreightTemplateName(String freightTemplateName) {
        FreightTemplateName = freightTemplateName;
    }

    public String getFreightTypeName() {
        return FreightTypeName;
    }

    public void setFreightTypeName(String freightTypeName) {
        FreightTypeName = freightTypeName;
    }

    public Integer getFreightTemplateSortNumber() {
        return freightTemplateSortNumber;
    }

    public void setFreightTemplateSortNumber(Integer freightTemplateSortNumber) {
        this.freightTemplateSortNumber = freightTemplateSortNumber;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}










































