package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.Status;

/* loaded from: classes5.dex */
final class zbj extends zba {
    final /* synthetic */ zbk zba;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zbj(zbk zbkVar) {
        this.zba = zbkVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zba, com.google.android.gms.auth.api.signin.internal.zbr
    public final void zbb(Status status) {
        this.zba.setResult((zbk) status);
    }
}
