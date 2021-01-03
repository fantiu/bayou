package com.bayou.service.vango.data.model;

import java.io.Serializable;

/**
 * @author 
 * 钱包流水
 */
public class WalletLog implements Serializable {
    private Integer id;

    /**
     * 用户id
     */
    private Long uid;

    /**
     * 流水号
     */
    private String no;

    /**
     * 业务类型，1：收入，2：支出
     */
    private Short btype;

    /**
     * 变动数，正负数。
     */
    private Integer count;

    private String oldWalletJson;

    private String newWalletJson;

    /**
     * 处理状态1处理完成，0未完成
     */
    private Short status;

    /**
     * 更新时间
     */
    private Integer mtime;

    /**
     * 创建时间
     */
    private Integer ctime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Short getBtype() {
        return btype;
    }

    public void setBtype(Short btype) {
        this.btype = btype;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getOldWalletJson() {
        return oldWalletJson;
    }

    public void setOldWalletJson(String oldWalletJson) {
        this.oldWalletJson = oldWalletJson;
    }

    public String getNewWalletJson() {
        return newWalletJson;
    }

    public void setNewWalletJson(String newWalletJson) {
        this.newWalletJson = newWalletJson;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
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
        WalletLog other = (WalletLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getNo() == null ? other.getNo() == null : this.getNo().equals(other.getNo()))
            && (this.getBtype() == null ? other.getBtype() == null : this.getBtype().equals(other.getBtype()))
            && (this.getCount() == null ? other.getCount() == null : this.getCount().equals(other.getCount()))
            && (this.getOldWalletJson() == null ? other.getOldWalletJson() == null : this.getOldWalletJson().equals(other.getOldWalletJson()))
            && (this.getNewWalletJson() == null ? other.getNewWalletJson() == null : this.getNewWalletJson().equals(other.getNewWalletJson()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getMtime() == null ? other.getMtime() == null : this.getMtime().equals(other.getMtime()))
            && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getNo() == null) ? 0 : getNo().hashCode());
        result = prime * result + ((getBtype() == null) ? 0 : getBtype().hashCode());
        result = prime * result + ((getCount() == null) ? 0 : getCount().hashCode());
        result = prime * result + ((getOldWalletJson() == null) ? 0 : getOldWalletJson().hashCode());
        result = prime * result + ((getNewWalletJson() == null) ? 0 : getNewWalletJson().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getMtime() == null) ? 0 : getMtime().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uid=").append(uid);
        sb.append(", no=").append(no);
        sb.append(", btype=").append(btype);
        sb.append(", count=").append(count);
        sb.append(", oldWalletJson=").append(oldWalletJson);
        sb.append(", newWalletJson=").append(newWalletJson);
        sb.append(", status=").append(status);
        sb.append(", mtime=").append(mtime);
        sb.append(", ctime=").append(ctime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}