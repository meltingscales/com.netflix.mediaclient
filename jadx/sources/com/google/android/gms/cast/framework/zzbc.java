package com.google.android.gms.cast.framework;

import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
final class zzbc extends zzas {
    final /* synthetic */ SessionProvider zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbc(SessionProvider sessionProvider, zzbb zzbbVar) {
        this.zza = sessionProvider;
    }

    @Override // com.google.android.gms.cast.framework.zzat
    public final IObjectWrapper zzb(String str) {
        Session createSession = this.zza.createSession(str);
        if (createSession == null) {
            return null;
        }
        return createSession.zzo();
    }

    @Override // com.google.android.gms.cast.framework.zzat
    public final String zzc() {
        return this.zza.getCategory();
    }

    @Override // com.google.android.gms.cast.framework.zzat
    public final boolean zzd() {
        return this.zza.isSessionRecoverable();
    }
}
