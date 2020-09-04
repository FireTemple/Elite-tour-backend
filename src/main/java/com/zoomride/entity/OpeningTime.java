package com.zoomride.entity;

import java.io.Serializable;

public class OpeningTime implements Serializable {
    private String id;

    private String resId;

    private String title;

    private String mo;

    private String tu;

    private String we;

    private String th;

    private String fri;

    private String sa;

    private String su;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getResId() {
        return resId;
    }

    public void setResId(String resId) {
        this.resId = resId == null ? null : resId.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
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

    public String getFri() {
        return fri;
    }

    public void setFri(String fri) {
        this.fri = fri == null ? null : fri.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", resId=").append(resId);
        sb.append(", title=").append(title);
        sb.append(", mo=").append(mo);
        sb.append(", tu=").append(tu);
        sb.append(", we=").append(we);
        sb.append(", th=").append(th);
        sb.append(", fri=").append(fri);
        sb.append(", sa=").append(sa);
        sb.append(", su=").append(su);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}