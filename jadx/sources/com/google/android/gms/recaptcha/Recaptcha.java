package com.google.android.gms.recaptcha;

import android.app.Activity;

/* loaded from: classes2.dex */
public final class Recaptcha {
    public static RecaptchaClient getClient(Activity activity) {
        return new RecaptchaClient(activity);
    }
}
