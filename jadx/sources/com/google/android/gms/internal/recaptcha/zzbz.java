package com.google.android.gms.internal.recaptcha;

import com.google.android.gms.internal.recaptcha.zzby;
import com.google.android.gms.internal.recaptcha.zzbz;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class zzbz<MessageType extends zzbz<MessageType, BuilderType>, BuilderType extends zzby<MessageType, BuilderType>> implements zzey {
    protected int zza = 0;

    @Override // com.google.android.gms.internal.recaptcha.zzey
    public final zzch zzb() {
        try {
            zzcp zzc = zzch.zzc(zzk());
            zza(zzc.zzb());
            return zzc.zza();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int zzd() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void zza(int i) {
        throw new UnsupportedOperationException();
    }
}
