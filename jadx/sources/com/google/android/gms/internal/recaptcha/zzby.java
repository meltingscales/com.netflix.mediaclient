package com.google.android.gms.internal.recaptcha;

import com.google.android.gms.internal.recaptcha.zzby;
import com.google.android.gms.internal.recaptcha.zzbz;

/* loaded from: classes2.dex */
public abstract class zzby<MessageType extends zzbz<MessageType, BuilderType>, BuilderType extends zzby<MessageType, BuilderType>> implements zzfb {
    @Override // 
    /* renamed from: zza */
    public abstract BuilderType clone();

    protected abstract BuilderType zza(MessageType messagetype);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.recaptcha.zzfb
    public final /* synthetic */ zzfb zza(zzey zzeyVar) {
        if (!zzh().getClass().isInstance(zzeyVar)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        return zza((zzby<MessageType, BuilderType>) ((zzbz) zzeyVar));
    }
}
