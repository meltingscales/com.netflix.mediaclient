package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
final class zzgu<T> implements zzhd<T> {
    private final zzgo zza;
    private final zzhv<?, ?> zzb;
    private final boolean zzc;
    private final zzes<?> zzd;

    private zzgu(zzhv<?, ?> zzhvVar, zzes<?> zzesVar, zzgo zzgoVar) {
        this.zzb = zzhvVar;
        this.zzc = zzesVar.zza(zzgoVar);
        this.zzd = zzesVar;
        this.zza = zzgoVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> zzgu<T> zza(zzhv<?, ?> zzhvVar, zzes<?> zzesVar, zzgo zzgoVar) {
        return new zzgu<>(zzhvVar, zzesVar, zzgoVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzhd
    public final T zza() {
        return (T) this.zza.zzbs().zzt();
    }

    @Override // com.google.android.gms.internal.measurement.zzhd
    public final boolean zza(T t, T t2) {
        if (this.zzb.zzb(t).equals(this.zzb.zzb(t2))) {
            if (this.zzc) {
                return this.zzd.zza(t).equals(this.zzd.zza(t2));
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzhd
    public final int zza(T t) {
        int hashCode = this.zzb.zzb(t).hashCode();
        return this.zzc ? (hashCode * 53) + this.zzd.zza(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.measurement.zzhd
    public final void zzb(T t, T t2) {
        zzhf.zza(this.zzb, t, t2);
        if (this.zzc) {
            zzhf.zza(this.zzd, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhd
    public final void zza(T t, zzis zzisVar) {
        Iterator<Map.Entry<?, Object>> zzd = this.zzd.zza(t).zzd();
        while (zzd.hasNext()) {
            Map.Entry<?, Object> next = zzd.next();
            zzey zzeyVar = (zzey) next.getKey();
            if (zzeyVar.zzc() != zzip.MESSAGE || zzeyVar.zzd() || zzeyVar.zze()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof zzfr) {
                zzisVar.zza(zzeyVar.zza(), (Object) ((zzfr) next).zza().zzc());
            } else {
                zzisVar.zza(zzeyVar.zza(), next.getValue());
            }
        }
        zzhv<?, ?> zzhvVar = this.zzb;
        zzhvVar.zzb((zzhv<?, ?>) zzhvVar.zzb(t), zzisVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099 A[EDGE_INSN: B:57:0x0099->B:34:0x0099 ?: BREAK  , SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzhd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.measurement.zzdt r14) {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.measurement.zzfd r0 = (com.google.android.gms.internal.measurement.zzfd) r0
            com.google.android.gms.internal.measurement.zzhy r1 = r0.zzb
            com.google.android.gms.internal.measurement.zzhy r2 = com.google.android.gms.internal.measurement.zzhy.zza()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.measurement.zzhy r1 = com.google.android.gms.internal.measurement.zzhy.zzb()
            r0.zzb = r1
        L11:
            com.google.android.gms.internal.measurement.zzfd$zzd r10 = (com.google.android.gms.internal.measurement.zzfd.zzd) r10
            r10.zza()
            r10 = 0
            r0 = r10
        L18:
            if (r12 >= r13) goto La4
            int r4 = com.google.android.gms.internal.measurement.zzdq.zza(r11, r12, r14)
            int r2 = r14.zza
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L51
            r12 = r2 & 7
            if (r12 != r3) goto L4c
            com.google.android.gms.internal.measurement.zzes<?> r12 = r9.zzd
            com.google.android.gms.internal.measurement.zzeq r0 = r14.zzd
            com.google.android.gms.internal.measurement.zzgo r3 = r9.zza
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.zza(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.measurement.zzfd$zzf r0 = (com.google.android.gms.internal.measurement.zzfd.zzf) r0
            if (r0 != 0) goto L43
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.measurement.zzdq.zza(r2, r3, r4, r5, r6, r7)
            goto L18
        L43:
            com.google.android.gms.internal.measurement.zzgz.zza()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L4c:
            int r12 = com.google.android.gms.internal.measurement.zzdq.zza(r2, r11, r4, r13, r14)
            goto L18
        L51:
            r12 = 0
            r2 = r10
        L53:
            if (r4 >= r13) goto L99
            int r4 = com.google.android.gms.internal.measurement.zzdq.zza(r11, r4, r14)
            int r5 = r14.zza
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L7b
            r8 = 3
            if (r6 == r8) goto L65
            goto L90
        L65:
            if (r0 != 0) goto L72
            if (r7 != r3) goto L90
            int r4 = com.google.android.gms.internal.measurement.zzdq.zze(r11, r4, r14)
            java.lang.Object r2 = r14.zzc
            com.google.android.gms.internal.measurement.zzdu r2 = (com.google.android.gms.internal.measurement.zzdu) r2
            goto L53
        L72:
            com.google.android.gms.internal.measurement.zzgz.zza()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L7b:
            if (r7 != 0) goto L90
            int r4 = com.google.android.gms.internal.measurement.zzdq.zza(r11, r4, r14)
            int r12 = r14.zza
            com.google.android.gms.internal.measurement.zzes<?> r0 = r9.zzd
            com.google.android.gms.internal.measurement.zzeq r5 = r14.zzd
            com.google.android.gms.internal.measurement.zzgo r6 = r9.zza
            java.lang.Object r0 = r0.zza(r5, r6, r12)
            com.google.android.gms.internal.measurement.zzfd$zzf r0 = (com.google.android.gms.internal.measurement.zzfd.zzf) r0
            goto L53
        L90:
            r6 = 12
            if (r5 == r6) goto L99
            int r4 = com.google.android.gms.internal.measurement.zzdq.zza(r5, r11, r4, r13, r14)
            goto L53
        L99:
            if (r2 == 0) goto La1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.zza(r12, r2)
        La1:
            r12 = r4
            goto L18
        La4:
            if (r12 != r13) goto La7
            return
        La7:
            com.google.android.gms.internal.measurement.zzfo r10 = com.google.android.gms.internal.measurement.zzfo.zzg()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgu.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzdt):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzhd
    public final void zza(T t, zzhe zzheVar, zzeq zzeqVar) {
        boolean zzc;
        zzhv<?, ?> zzhvVar = this.zzb;
        zzes<?> zzesVar = this.zzd;
        Object zzc2 = zzhvVar.zzc(t);
        zzew<?> zzb = zzesVar.zzb(t);
        while (zzheVar.zza() != Integer.MAX_VALUE) {
            try {
                int zzb2 = zzheVar.zzb();
                if (zzb2 != 11) {
                    if ((zzb2 & 7) == 2) {
                        Object zza = zzesVar.zza(zzeqVar, this.zza, zzb2 >>> 3);
                        if (zza != null) {
                            zzesVar.zza(zzheVar, zza, zzeqVar, zzb);
                        } else {
                            zzc = zzhvVar.zza((zzhv<?, ?>) zzc2, zzheVar);
                        }
                    } else {
                        zzc = zzheVar.zzc();
                    }
                    if (!zzc) {
                        return;
                    }
                } else {
                    Object obj = null;
                    int i = 0;
                    zzdu zzduVar = null;
                    while (zzheVar.zza() != Integer.MAX_VALUE) {
                        int zzb3 = zzheVar.zzb();
                        if (zzb3 == 16) {
                            i = zzheVar.zzo();
                            obj = zzesVar.zza(zzeqVar, this.zza, i);
                        } else if (zzb3 == 26) {
                            if (obj != null) {
                                zzesVar.zza(zzheVar, obj, zzeqVar, zzb);
                            } else {
                                zzduVar = zzheVar.zzn();
                            }
                        } else if (!zzheVar.zzc()) {
                            break;
                        }
                    }
                    if (zzheVar.zzb() != 12) {
                        throw zzfo.zze();
                    } else if (zzduVar != null) {
                        if (obj != null) {
                            zzesVar.zza(zzduVar, obj, zzeqVar, zzb);
                        } else {
                            zzhvVar.zza((zzhv<?, ?>) zzc2, i, zzduVar);
                        }
                    }
                }
            } finally {
                zzhvVar.zzb((Object) t, (T) zzc2);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhd
    public final void zzc(T t) {
        this.zzb.zzd(t);
        this.zzd.zzc(t);
    }

    @Override // com.google.android.gms.internal.measurement.zzhd
    public final boolean zzd(T t) {
        return this.zzd.zza(t).zzf();
    }

    @Override // com.google.android.gms.internal.measurement.zzhd
    public final int zzb(T t) {
        zzhv<?, ?> zzhvVar = this.zzb;
        int zze = zzhvVar.zze(zzhvVar.zzb(t));
        return this.zzc ? zze + this.zzd.zza(t).zzg() : zze;
    }
}
