package com.amberlib.redux;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Amberllo on 2016/10/9.
 */
public class ReduxStore {

    private ReduxState defaultStatue;
    private ReduxState mCurrentStatue;
    private List<ReduxComponent> componentList = new ArrayList<>();

    ReduxStore(ReduxState defaultStatue){
        this.defaultStatue = defaultStatue;
        this.mCurrentStatue = defaultStatue;
    }

    public ReduxState getState(){
        return mCurrentStatue;
    }

    public void dispatch(ReduxAction action){
        for(ReduxComponent component:componentList){

        }
    }

    public void subscribe(ReduxComponent component){

    }

}
