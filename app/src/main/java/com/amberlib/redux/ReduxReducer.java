package com.amberlib.redux;

/**
 * Created by Amberllo on 2016/10/9.
 */
public class ReduxReducer {
    String actionKey;
    public ReduxReducer(String actionKey){
        this.actionKey = actionKey;
    }
    public String getActionKey(){
        return actionKey;
    }
}
