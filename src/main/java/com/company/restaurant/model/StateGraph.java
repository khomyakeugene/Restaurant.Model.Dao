package com.company.restaurant.model;

import java.io.Serializable;

/**
 * Created by Yevhen on 22.05.2016.
 */
public class StateGraph implements Serializable {
    private String initStateType;
    private String finiteStateType;
    private String actionType;
    private String entityName;
    private String comment;

    public String getInitStateType() {
        return initStateType;
    }

    public void setInitStateType(String initStateType) {
        this.initStateType = initStateType;
    }

    public String getFiniteStateType() {
        return finiteStateType;
    }

    public void setFiniteStateType(String finiteStateType) {
        this.finiteStateType = finiteStateType;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
