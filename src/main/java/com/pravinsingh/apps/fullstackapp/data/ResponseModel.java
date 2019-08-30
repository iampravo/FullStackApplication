package com.pravinsingh.apps.fullstackapp.data;

import java.util.List;

public class ResponseModel<T> {
    private List<T> list;

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
