package com.google.android.gms.auth.api.phone;

import android.app.Activity;
import com.google.android.gms.internal.p000authapiphone.zzj;

/* loaded from: classes2.dex */
public final class SmsRetriever {
    public static SmsRetrieverClient getClient(Activity activity) {
        return new zzj(activity);
    }
}
