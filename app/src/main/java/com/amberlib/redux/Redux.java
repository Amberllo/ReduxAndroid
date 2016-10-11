package com.amberlib.redux;

/**
 * Created by Amberllo on 2016/10/9.
 */
public class Redux {
    private static ReduxStore store;
    private static ReduxState defaultStatue = ReduxState.Normal;
    public static ReduxStore getStore(){
        if(store==null){
            store = new ReduxStore(defaultStatue);
        }
        return store;
    }
}
