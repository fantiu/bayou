package com.bayou.service.vango.data.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 * 支付列表
 */
public class PayList implements Serializable {
    /**
     * auto id
     */
    private Integer id;

    /**
     * 用户uuid
     */
    private Long userUid;

    /**
     * 支付号
     */
    private Long payNo;

    /**
     * 第三方付款成功交易号
     */
    private String tradeNo;

    /**
     * 订单类型 1充值 
     */
    private Short orderType;

    /**
     * 充值订单表uid
     */
    private Long orderUid;

    /**
     * 付款方式 1微信 2支付宝 
     */
    private Byte payWay;

    /**
     * 支付状态 1 支付成功，2 支付失败 
     */
    private Short payStatus;

    /**
     * 步骤 1 创建支付，2 支付回调通知
     */
    private Short step;

    /**
     * 请求支付状态，1：成功，2：失败
     */
    private Short postStatus;

    /**
     * 回调状态，1：成功，2：失败
     */
    private Short returnStatus;

    /**
     * 支付价格
     */
    private BigDecimal totalFee;

    /**
     * 第三方返回错误码
     */
    private String resultCode;

    /**
     * 第三方返回的错误记录
     */
    private String errCodeStr;

    /**
     * 货币类型
     */
    private String currency;

    /**
     * ip2long
     */
    private Integer ip2long;

    /**
     * 提交post json 数据
     */
    private String postJson;

    /**
     * 回调post return data json
     */
    private String returnJson;

    private Integer mtime;

    private Integer ctime;

    /**
     * 支付成功时间
     */
    private Integer successAt;

    /**
     * 手续费比例，千位比。6/1000
     */
    private Integer procedureKb;

    /**
     * 支付渠道收取手续费金额
     */
    private BigDecimal procedureFee;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getUserUid() {
        return userUid;
    }

    public void setUserUid(Long userUid) {
        this.userUid = userUid;
    }

    public Long getPayNo() {
        return payNo;
    }

    public void setPayNo(Long payNo) {
        this.payNo = payNo;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public Short getOrderType() {
        return orderType;
    }

    public void setOrderType(Short orderType) {
        this.orderType = orderType;
    }

    public Long getOrderUid() {
        return orderUid;
    }

    public void setOrderUid(Long orderUid) {
        this.orderUid = orderUid;
    }

    public Byte getPayWay() {
        return payWay;
    }

    public void setPayWay(Byte payWay) {
        this.payWay = payWay;
    }

    public Short getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Short payStatus) {
        this.payStatus = payStatus;
    }

    public Short getStep() {
        return step;
    }

    public void setStep(Short step) {
        this.step = step;
    }

    public Short getPostStatus() {
        return postStatus;
    }

    public void setPostStatus(Short postStatus) {
        this.postStatus = postStatus;
    }

    public Short getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(Short returnStatus) {
        this.returnStatus = returnStatus;
    }

    public BigDecimal getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getErrCodeStr() {
        return errCodeStr;
    }

    public void setErrCodeStr(String errCodeStr) {
        this.errCodeStr = errCodeStr;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getIp2long() {
        return ip2long;
    }

    public void setIp2long(Integer ip2long) {
        this.ip2long = ip2long;
    }

    public String getPostJson() {
        return postJson;
    }

    public void setPostJson(String postJson) {
        this.postJson = postJson;
    }

    public String getReturnJson() {
        return returnJson;
    }

    public void setReturnJson(String returnJson) {
        this.returnJson = returnJson;
    }

    public Integer getMtime() {
        return mtime;
    }

    public void setMtime(Integer mtime) {
        this.mtime = mtime;
    }

    public Integer getCtime() {
        return ctime;
    }

    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }

    public Integer getSuccessAt() {
        return successAt;
    }

    public void setSuccessAt(Integer successAt) {
        this.successAt = successAt;
    }

    public Integer getProcedureKb() {
        return procedureKb;
    }

    public void setProcedureKb(Integer procedureKb) {
        this.procedureKb = procedureKb;
    }

    public BigDecimal getProcedureFee() {
        return procedureFee;
    }

    public void setProcedureFee(BigDecimal procedureFee) {
        this.procedureFee = procedureFee;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        PayList other = (PayList) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserUid() == null ? other.getUserUid() == null : this.getUserUid().equals(other.getUserUid()))
            && (this.getPayNo() == null ? other.getPayNo() == null : this.getPayNo().equals(other.getPayNo()))
            && (this.getTradeNo() == null ? other.getTradeNo() == null : this.getTradeNo().equals(other.getTradeNo()))
            && (this.getOrderType() == null ? other.getOrderType() == null : this.getOrderType().equals(other.getOrderType()))
            && (this.getOrderUid() == null ? other.getOrderUid() == null : this.getOrderUid().equals(other.getOrderUid()))
            && (this.getPayWay() == null ? other.getPayWay() == null : this.getPayWay().equals(other.getPayWay()))
            && (this.getPayStatus() == null ? other.getPayStatus() == null : this.getPayStatus().equals(other.getPayStatus()))
            && (this.getStep() == null ? other.getStep() == null : this.getStep().equals(other.getStep()))
            && (this.getPostStatus() == null ? other.getPostStatus() == null : this.getPostStatus().equals(other.getPostStatus()))
            && (this.getReturnStatus() == null ? other.getReturnStatus() == null : this.getReturnStatus().equals(other.getReturnStatus()))
            && (this.getTotalFee() == null ? other.getTotalFee() == null : this.getTotalFee().equals(other.getTotalFee()))
            && (this.getResultCode() == null ? other.getResultCode() == null : this.getResultCode().equals(other.getResultCode()))
            && (this.getErrCodeStr() == null ? other.getErrCodeStr() == null : this.getErrCodeStr().equals(other.getErrCodeStr()))
            && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
            && (this.getIp2long() == null ? other.getIp2long() == null : this.getIp2long().equals(other.getIp2long()))
            && (this.getPostJson() == null ? other.getPostJson() == null : this.getPostJson().equals(other.getPostJson()))
            && (this.getReturnJson() == null ? other.getReturnJson() == null : this.getReturnJson().equals(other.getReturnJson()))
            && (this.getMtime() == null ? other.getMtime() == null : this.getMtime().equals(other.getMtime()))
            && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime()))
            && (this.getSuccessAt() == null ? other.getSuccessAt() == null : this.getSuccessAt().equals(other.getSuccessAt()))
            && (this.getProcedureKb() == null ? other.getProcedureKb() == null : this.getProcedureKb().equals(other.getProcedureKb()))
            && (this.getProcedureFee() == null ? other.getProcedureFee() == null : this.getProcedureFee().equals(other.getProcedureFee()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserUid() == null) ? 0 : getUserUid().hashCode());
        result = prime * result + ((getPayNo() == null) ? 0 : getPayNo().hashCode());
        result = prime * result + ((getTradeNo() == null) ? 0 : getTradeNo().hashCode());
        result = prime * result + ((getOrderType() == null) ? 0 : getOrderType().hashCode());
        result = prime * result + ((getOrderUid() == null) ? 0 : getOrderUid().hashCode());
        result = prime * result + ((getPayWay() == null) ? 0 : getPayWay().hashCode());
        result = prime * result + ((getPayStatus() == null) ? 0 : getPayStatus().hashCode());
        result = prime * result + ((getStep() == null) ? 0 : getStep().hashCode());
        result = prime * result + ((getPostStatus() == null) ? 0 : getPostStatus().hashCode());
        result = prime * result + ((getReturnStatus() == null) ? 0 : getReturnStatus().hashCode());
        result = prime * result + ((getTotalFee() == null) ? 0 : getTotalFee().hashCode());
        result = prime * result + ((getResultCode() == null) ? 0 : getResultCode().hashCode());
        result = prime * result + ((getErrCodeStr() == null) ? 0 : getErrCodeStr().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        result = prime * result + ((getIp2long() == null) ? 0 : getIp2long().hashCode());
        result = prime * result + ((getPostJson() == null) ? 0 : getPostJson().hashCode());
        result = prime * result + ((getReturnJson() == null) ? 0 : getReturnJson().hashCode());
        result = prime * result + ((getMtime() == null) ? 0 : getMtime().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        result = prime * result + ((getSuccessAt() == null) ? 0 : getSuccessAt().hashCode());
        result = prime * result + ((getProcedureKb() == null) ? 0 : getProcedureKb().hashCode());
        result = prime * result + ((getProcedureFee() == null) ? 0 : getProcedureFee().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userUid=").append(userUid);
        sb.append(", payNo=").append(payNo);
        sb.append(", tradeNo=").append(tradeNo);
        sb.append(", orderType=").append(orderType);
        sb.append(", orderUid=").append(orderUid);
        sb.append(", payWay=").append(payWay);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", step=").append(step);
        sb.append(", postStatus=").append(postStatus);
        sb.append(", returnStatus=").append(returnStatus);
        sb.append(", totalFee=").append(totalFee);
        sb.append(", resultCode=").append(resultCode);
        sb.append(", errCodeStr=").append(errCodeStr);
        sb.append(", currency=").append(currency);
        sb.append(", ip2long=").append(ip2long);
        sb.append(", postJson=").append(postJson);
        sb.append(", returnJson=").append(returnJson);
        sb.append(", mtime=").append(mtime);
        sb.append(", ctime=").append(ctime);
        sb.append(", successAt=").append(successAt);
        sb.append(", procedureKb=").append(procedureKb);
        sb.append(", procedureFee=").append(procedureFee);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}