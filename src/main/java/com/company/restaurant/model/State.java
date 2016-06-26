package com.company.restaurant.model;

/**
 * Created by Yevhen on 25.06.2016.
 */
public class State extends SimpleTypeDic {
    String getStateType() {
        return getType();
    }

    void setStateType(String stateType) {
        setType(stateType);
    }
}
