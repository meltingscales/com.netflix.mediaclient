package com.google.firebase.iid;

import android.os.Bundle;

/* loaded from: classes5.dex */
final class zzae extends zzah<Void> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzae(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.iid.zzah
    public final boolean zza() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.iid.zzah
    public final void zza(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            zza((zzae) null);
        } else {
            zza(new zzag(4, "Invalid response to one way request"));
        }
    }
}
