package com.google.android.gms.internal.p000authapiphone;

import android.app.Activity;
import com.google.android.gms.auth.api.phone.SmsRetrieverClient;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzj  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzj extends SmsRetrieverClient {
    public zzj(Activity activity) {
        super(activity);
    }

    @Override // com.google.android.gms.auth.api.phone.SmsRetrieverClient
    public final Task<Void> startSmsRetriever() {
        return doWrite(new zzk(this));
    }
}
