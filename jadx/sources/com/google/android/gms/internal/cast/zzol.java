package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.zzok;
import com.google.android.gms.internal.cast.zzol;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class zzol<MessageType extends zzol<MessageType, BuilderType>, BuilderType extends zzok<MessageType, BuilderType>> implements zzrb {
    protected int zza = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public int zzn() {
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.zzrb
    public final zzoy zzo() {
        try {
            int zzq = zzq();
            zzoy zzoyVar = zzoy.zzb;
            byte[] bArr = new byte[zzq];
            zzpg zzC = zzpg.zzC(bArr);
            zzB(zzC);
            zzC.zzD();
            return new zzov(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void zzp(int i) {
        throw null;
    }
}
