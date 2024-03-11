package com.netflix.mediaclient.acquisition.screens.signupContainer;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

/* loaded from: classes6.dex */
public final class SignupNativeDeepLinkActivity extends AppCompatActivity {
    public static final int $stable = 0;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent createStartIntent = SignupNativeActivity.Companion.createStartIntent(this);
        Intent intent = getIntent();
        startActivity(createStartIntent.setData(intent != null ? intent.getData() : null));
        finish();
    }
}
