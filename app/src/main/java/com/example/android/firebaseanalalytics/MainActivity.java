package com.example.android.firebaseanalalytics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends AppCompatActivity {
    private FirebaseAnalytics mFirebaseAnalytics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
      Bundle bundle = new Bundle();
//        bundle.putString(FirebaseAnalytics.Param.ITEM_ID,"Radom");
//        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME,"String");
//        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE,"Image");
            mFirebaseAnalytics.logEvent("Accessed",bundle);
//        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
    }
}
