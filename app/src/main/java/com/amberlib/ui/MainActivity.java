package com.amberlib.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.amberlib.redux.R;
import com.amberlib.redux.Redux;
import com.amberlib.redux.ReduxAction;
import com.amberlib.redux.ReduxComponent;
import com.amberlib.redux.ReduxState;

public class MainActivity extends AppCompatActivity implements ReduxComponent {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Redux.getStore().subscribe(this);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Redux.getStore().dispatch(new ReduxAction("clickButton"));
            }
        });
    }

    @Override
    public void render(ReduxState state) {

    }

}