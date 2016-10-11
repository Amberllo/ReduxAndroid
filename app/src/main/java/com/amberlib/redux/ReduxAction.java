package com.amberlib.redux;

import java.util.Map;

/**
 * Created by Amberllo on 2016/10/9.
 */
public class ReduxAction {
    String key;
    Map<String,Object> value;

    public ReduxAction(String key){
        this.key = key;
    }

    public ReduxAction setValue(Map<String,Object> value){
        this.value = value;
        return this;
    }

    public String getKey(){
        return key;
    }
}
