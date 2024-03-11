package com.google.android.gms.internal.recaptcha;

import com.google.android.gms.internal.recaptcha.zzds;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzep implements zzfo {
    private static final zzez zzb = new zzeo();
    private final zzez zza;

    public zzep() {
        this(new zzer(zzdq.zza(), zza()));
    }

    private zzep(zzez zzezVar) {
        this.zza = (zzez) zzdv.zza(zzezVar, "messageInfoFactory");
    }

    @Override // com.google.android.gms.internal.recaptcha.zzfo
    public final <T> zzfp<T> zza(Class<T> cls) {
        zzfr.zza((Class<?>) cls);
        zzew zzb2 = this.zza.zzb(cls);
        if (zzb2.zzb()) {
            if (zzds.class.isAssignableFrom(cls)) {
                return zzff.zza(zzfr.zzc(), zzdi.zza(), zzb2.zzc());
            }
            return zzff.zza(zzfr.zza(), zzdi.zzb(), zzb2.zzc());
        } else if (zzds.class.isAssignableFrom(cls)) {
            if (zza(zzb2)) {
                return zzfc.zza(cls, zzb2, zzfj.zzb(), zzei.zzb(), zzfr.zzc(), zzdi.zza(), zzex.zzb());
            }
            return zzfc.zza(cls, zzb2, zzfj.zzb(), zzei.zzb(), zzfr.zzc(), null, zzex.zzb());
        } else if (zza(zzb2)) {
            return zzfc.zza(cls, zzb2, zzfj.zza(), zzei.zza(), zzfr.zza(), zzdi.zzb(), zzex.zza());
        } else {
            return zzfc.zza(cls, zzb2, zzfj.zza(), zzei.zza(), zzfr.zzb(), null, zzex.zza());
        }
    }

    private static boolean zza(zzew zzewVar) {
        return zzewVar.zza() == zzds.zzf.zzh;
    }

    private static zzez zza() {
        try {
            return (zzez) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return zzb;
        }
    }
}
