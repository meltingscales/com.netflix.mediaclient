package com.google.firebase.iid;

import android.os.Bundle;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;

/* loaded from: classes2.dex */
final class zzaj extends zzah<Bundle> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaj(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.iid.zzah
    public final boolean zza() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.iid.zzah
    public final void zza(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(NotificationFactory.DATA);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        zza((zzaj) bundle2);
    }
}
