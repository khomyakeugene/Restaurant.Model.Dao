package com.company.restaurant.model;

import java.io.Serializable;

/**
 * Created by Yevhen on 21.05.2016.
 */
public class LinkObject extends JoinObject implements Serializable  {
    protected String linkData;

    public String getLinkData() {
        return linkData;
    }

    public void setLinkData(String linkData) {
        this.linkData = linkData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LinkObject)) return false;

        LinkObject that = (LinkObject) o;

        return getFirstId() == that.getFirstId() && getSecondId() == that.getSecondId() &&
                (getLinkData() != null ? getLinkData().equals(that.getLinkData()) :
                        that.getLinkData() == null);

    }

    @Override
    public int hashCode() {
        int result = getFirstId();
        result = 31 * result + getSecondId();
        result = 31 * result + (getLinkData() != null ? getLinkData().hashCode() : 0);
        return result;
    }
}
