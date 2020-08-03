package com.zoomride.entity;

import java.io.Serializable;

public class DesIncludeItem implements Serializable {
    private String id;

    private String desId;

    private String includeItemId;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDesId() {
        return desId;
    }

    public void setDesId(String desId) {
        this.desId = desId == null ? null : desId.trim();
    }

    public String getIncludeItemId() {
        return includeItemId;
    }

    public void setIncludeItemId(String includeItemId) {
        this.includeItemId = includeItemId == null ? null : includeItemId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", desId=").append(desId);
        sb.append(", includeItemId=").append(includeItemId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}