package com.google.android.gms.internal.recaptcha;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzfv extends zzgb {
    private final /* synthetic */ zzfq zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzfv(zzfq zzfqVar) {
        super(zzfqVar, null);
        this.zza = zzfqVar;
    }

    @Override // com.google.android.gms.internal.recaptcha.zzgb, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<Object, Object>> iterator() {
        return new zzfs(this.zza, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfv(zzfq zzfqVar, zzft zzftVar) {
        this(zzfqVar);
    }
}
