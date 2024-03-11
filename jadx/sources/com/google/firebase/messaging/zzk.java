package com.google.firebase.messaging;

import com.google.android.datatransport.Transformer;

/* loaded from: classes5.dex */
final /* synthetic */ class zzk implements Transformer {
    static final Transformer zza = new zzk();

    private zzk() {
    }

    @Override // com.google.android.datatransport.Transformer
    public final Object apply(Object obj) {
        return ((String) obj).getBytes();
    }
}
