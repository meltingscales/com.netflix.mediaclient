package com.google.android.gms.internal.cast;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzqt implements zzrn {
    private static final zzqz zza = new zzqr();
    private final zzqz zzb;

    public zzqt() {
        zzqz zzqzVar;
        zzqz[] zzqzVarArr = new zzqz[2];
        zzqzVarArr[0] = zzpp.zza();
        try {
            zzqzVar = (zzqz) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzqzVar = zza;
        }
        zzqzVarArr[1] = zzqzVar;
        zzqs zzqsVar = new zzqs(zzqzVarArr);
        zzqc.zzf(zzqsVar, "messageInfoFactory");
        this.zzb = zzqsVar;
    }

    private static boolean zzb(zzqy zzqyVar) {
        return zzqyVar.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.cast.zzrn
    public final zzrm zza(Class cls) {
        zzro.zzE(cls);
        zzqy zzb = this.zzb.zzb(cls);
        if (!zzb.zzb()) {
            if (zzpt.class.isAssignableFrom(cls)) {
                if (zzb(zzb)) {
                    return zzre.zzg(cls, zzb, zzrh.zzb(), zzqp.zzd(), zzro.zzB(), zzpl.zzb(), zzqx.zzb());
                }
                return zzre.zzg(cls, zzb, zzrh.zzb(), zzqp.zzd(), zzro.zzB(), null, zzqx.zzb());
            } else if (zzb(zzb)) {
                return zzre.zzg(cls, zzb, zzrh.zza(), zzqp.zzc(), zzro.zzz(), zzpl.zza(), zzqx.zza());
            } else {
                return zzre.zzg(cls, zzb, zzrh.zza(), zzqp.zzc(), zzro.zzA(), null, zzqx.zza());
            }
        } else if (zzpt.class.isAssignableFrom(cls)) {
            return zzrf.zzg(zzro.zzB(), zzpl.zzb(), zzb.zza());
        } else {
            return zzrf.zzg(zzro.zzz(), zzpl.zza(), zzb.zza());
        }
    }
}
