package com.amberlib.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.amberlib.redux.Redux;
import com.amberlib.redux.ReduxAction;
import com.amberlib.redux.ReduxComponent;
import com.amberlib.redux.ReduxState;

/**
 * Created by Amberllo on 2016/10/9.
 */
public class ItemView extends LinearLayout implements ReduxComponent {
    public ItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Redux.getStore().subscribe(this);
    }

    @Override
    public void render(ReduxState state) {

    }

}
