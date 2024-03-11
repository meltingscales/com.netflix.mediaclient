package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.zzok;
import com.google.android.gms.internal.cast.zzol;

/* loaded from: classes2.dex */
public abstract class zzok<MessageType extends zzol<MessageType, BuilderType>, BuilderType extends zzok<MessageType, BuilderType>> implements zzra {
    @Override // 
    /* renamed from: zzk */
    public abstract zzok clone();

    protected abstract zzok zzl(zzol zzolVar);

    @Override // com.google.android.gms.internal.cast.zzra
    public final /* synthetic */ zzra zzm(zzrb zzrbVar) {
        if (!zzs().getClass().isInstance(zzrbVar)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        return zzl((zzol) zzrbVar);
    }
}
