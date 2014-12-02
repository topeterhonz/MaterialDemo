package com.example.peterho.materialdemo;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;


public class DemoActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        Hsm1 hsm = Hsm1.makeHsm1();

        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.fragment_container, new DemoFragment(), DemoFragment.TAG)
                    .commit();
            hsm.sendMessage(hsm.obtainMessage(hsm.CMD_1));
        } else {
            hsm.sendMessage(hsm.obtainMessage(hsm.CMD_2));
        }



//        synchronized (hsm) {

//            try {
//                // wait for the messages to be handled
//                hsm.wait();
//            } catch (InterruptedException e) {
//                hsm.loge("exception while waiting " + e.getMessage());
//            }
//        }

    }


}
