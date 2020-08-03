package com.zoomride.entity;

import java.io.Serializable;
import java.util.Date;

public class Schedule implements Serializable {
    private String id;

    private String itemId;

    private String duration;

    private String mo;

    private String tu;

    private String we;

    private String th;

    private String fr;

    private String sa;

    private String su;

    private Date createTime;

    private Date updateTime;

    private String createId;

    private String updateId;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration == null ? null : duration.trim();
    }

    public String getMo() {
        return mo;
    }

    public void setMo(String mo) {
        this.mo = mo == null ? null : mo.trim();
    }

    public String getTu() {
        return tu;
    }

    public void setTu(String tu) {
        this.tu = tu == null ? null : tu.trim();
    }

    public String getWe() {
        return we;
    }

    public void setWe(String we) {
        this.we = we == null ? null : we.trim();
    }

    public String getTh() {
        return th;
    }

    public void setTh(String th) {
        this.th = th == null ? null : th.trim();
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr == null ? null : fr.trim();
    }

    public String getSa() {
        return sa;
    }

    public void setSa(String sa) {
        this.sa = sa == null ? null : sa.trim();
    }

    public String getSu() {
        return su;
    }

    public void setSu(String su) {
        this.su = su == null ? null : su.trim();
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

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId == null ? null : createId.trim();
    }

    public String getUpdateId() {
        return updateId;
    }

    public void setUpdateId(String updateId) {
        this.updateId = updateId == null ? null : updateId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", itemId=").append(itemId);
        sb.append(", duration=").append(duration);
        sb.append(", mo=").append(mo);
        sb.append(", tu=").append(tu);
        sb.append(", we=").append(we);
        sb.append(", th=").append(th);
        sb.append(", fr=").append(fr);
        sb.append(", sa=").append(sa);
        sb.append(", su=").append(su);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createId=").append(createId);
        sb.append(", updateId=").append(updateId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}