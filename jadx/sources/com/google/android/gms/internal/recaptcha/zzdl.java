package com.google.android.gms.internal.recaptcha;

import com.google.android.gms.internal.recaptcha.zzdn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdl<T extends zzdn<T>> {
    private static final zzdl zzd = new zzdl(true);
    final zzfq<T, Object> zza;
    private boolean zzb;
    private boolean zzc;

    private zzdl() {
        this.zza = zzfq.zza(16);
    }

    public static <T extends zzdn<T>> zzdl<T> zza() {
        return zzd;
    }

    public final boolean zzc() {
        return this.zzb;
    }

    private zzdl(boolean z) {
        this(zzfq.zza(0));
        zzb();
    }

    private zzdl(zzfq<T, Object> zzfqVar) {
        this.zza = zzfqVar;
        zzb();
    }

    public final void zzb() {
        if (this.zzb) {
            return;
        }
        this.zza.zza();
        this.zzb = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzdl) {
            return this.zza.equals(((zzdl) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        if (this.zzc) {
            return new zzee(this.zza.entrySet().iterator());
        }
        return this.zza.entrySet().iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Iterator<Map.Entry<T, Object>> zze() {
        if (this.zzc) {
            return new zzee(this.zza.zze().iterator());
        }
        return this.zza.zze().iterator();
    }

    private final Object zza(T t) {
        Object obj = this.zza.get(t);
        if (obj instanceof zzed) {
            zzed zzedVar = (zzed) obj;
            return zzed.zza();
        }
        return obj;
    }

    private final void zzb(T t, Object obj) {
        if (t.zzd()) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                zza(t.zzb(), obj2);
            }
            obj = arrayList;
        } else {
            zza(t.zzb(), obj);
        }
        if (obj instanceof zzed) {
            this.zzc = true;
        }
        this.zza.zza((zzfq<T, Object>) t, (T) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zza(com.google.android.gms.internal.recaptcha.zzgy r1, java.lang.Object r2) {
        /*
            com.google.android.gms.internal.recaptcha.zzdv.zza(r2)
            int[] r0 = com.google.android.gms.internal.recaptcha.zzdk.zza
            com.google.android.gms.internal.recaptcha.zzhb r1 = r1.zza()
            int r1 = r1.ordinal()
            r1 = r0[r1]
            switch(r1) {
                case 1: goto L3d;
                case 2: goto L3a;
                case 3: goto L37;
                case 4: goto L34;
                case 5: goto L31;
                case 6: goto L2e;
                case 7: goto L25;
                case 8: goto L1c;
                case 9: goto L13;
                default: goto L12;
            }
        L12:
            goto L42
        L13:
            boolean r1 = r2 instanceof com.google.android.gms.internal.recaptcha.zzey
            if (r1 != 0) goto L41
            boolean r1 = r2 instanceof com.google.android.gms.internal.recaptcha.zzed
            if (r1 == 0) goto L42
            goto L41
        L1c:
            boolean r1 = r2 instanceof java.lang.Integer
            if (r1 != 0) goto L41
            boolean r1 = r2 instanceof com.google.android.gms.internal.recaptcha.zzdu
            if (r1 == 0) goto L42
            goto L41
        L25:
            boolean r1 = r2 instanceof com.google.android.gms.internal.recaptcha.zzch
            if (r1 != 0) goto L41
            boolean r1 = r2 instanceof byte[]
            if (r1 == 0) goto L42
            goto L41
        L2e:
            boolean r1 = r2 instanceof java.lang.String
            goto L3f
        L31:
            boolean r1 = r2 instanceof java.lang.Boolean
            goto L3f
        L34:
            boolean r1 = r2 instanceof java.lang.Double
            goto L3f
        L37:
            boolean r1 = r2 instanceof java.lang.Float
            goto L3f
        L3a:
            boolean r1 = r2 instanceof java.lang.Long
            goto L3f
        L3d:
            boolean r1 = r2 instanceof java.lang.Integer
        L3f:
            if (r1 == 0) goto L42
        L41:
            return
        L42:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Wrong object type used with protocol message reflection."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.recaptcha.zzdl.zza(com.google.android.gms.internal.recaptcha.zzgy, java.lang.Object):void");
    }

    public final boolean zzf() {
        for (int i = 0; i < this.zza.zzc(); i++) {
            if (!zza((Map.Entry) this.zza.zzb(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> entry : this.zza.zzd()) {
            if (!zza((Map.Entry) entry)) {
                return false;
            }
        }
        return true;
    }

    private static <T extends zzdn<T>> boolean zza(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzc() == zzhb.MESSAGE) {
            if (key.zzd()) {
                for (zzey zzeyVar : (List) entry.getValue()) {
                    if (!zzeyVar.zzc()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof zzey) {
                    if (!((zzey) value).zzc()) {
                        return false;
                    }
                } else if (value instanceof zzed) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public final void zza(zzdl<T> zzdlVar) {
        for (int i = 0; i < zzdlVar.zza.zzc(); i++) {
            zzb(zzdlVar.zza.zzb(i));
        }
        for (Map.Entry<T, Object> entry : zzdlVar.zza.zzd()) {
            zzb(entry);
        }
    }

    private static Object zza(Object obj) {
        if (obj instanceof zzfe) {
            return ((zzfe) obj).zza();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    private final void zzb(Map.Entry<T, Object> entry) {
        zzey zzg;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzed) {
            zzed zzedVar = (zzed) value;
            value = zzed.zza();
        }
        if (key.zzd()) {
            Object zza = zza((zzdl<T>) key);
            if (zza == null) {
                zza = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) zza).add(zza(obj));
            }
            this.zza.zza((zzfq<T, Object>) key, (T) zza);
        } else if (key.zzc() == zzhb.MESSAGE) {
            Object zza2 = zza((zzdl<T>) key);
            if (zza2 == null) {
                this.zza.zza((zzfq<T, Object>) key, (T) zza(value));
                return;
            }
            if (zza2 instanceof zzfe) {
                zzg = key.zza((zzfe) zza2, (zzfe) value);
            } else {
                zzg = key.zza(((zzey) zza2).zzl(), (zzey) value).zzg();
            }
            this.zza.zza((zzfq<T, Object>) key, (T) zzg);
        } else {
            this.zza.zza((zzfq<T, Object>) key, (T) zza(value));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(zzcy zzcyVar, zzgy zzgyVar, int i, Object obj) {
        if (zzgyVar == zzgy.zzj) {
            zzey zzeyVar = (zzey) obj;
            zzdv.zza(zzeyVar);
            zzcyVar.zza(i, 3);
            zzeyVar.zza(zzcyVar);
            zzcyVar.zza(i, 4);
            return;
        }
        zzcyVar.zza(i, zzgyVar.zzb());
        switch (zzdk.zzb[zzgyVar.ordinal()]) {
            case 1:
                zzcyVar.zza(((Double) obj).doubleValue());
                return;
            case 2:
                zzcyVar.zza(((Float) obj).floatValue());
                return;
            case 3:
                zzcyVar.zza(((Long) obj).longValue());
                return;
            case 4:
                zzcyVar.zza(((Long) obj).longValue());
                return;
            case 5:
                zzcyVar.zza(((Integer) obj).intValue());
                return;
            case 6:
                zzcyVar.zzc(((Long) obj).longValue());
                return;
            case 7:
                zzcyVar.zzd(((Integer) obj).intValue());
                return;
            case 8:
                zzcyVar.zza(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzey) obj).zza(zzcyVar);
                return;
            case 10:
                zzcyVar.zza((zzey) obj);
                return;
            case 11:
                if (obj instanceof zzch) {
                    zzcyVar.zza((zzch) obj);
                    return;
                } else {
                    zzcyVar.zza((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzch) {
                    zzcyVar.zza((zzch) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzcyVar.zzb(bArr, 0, bArr.length);
                return;
            case 13:
                zzcyVar.zzb(((Integer) obj).intValue());
                return;
            case 14:
                zzcyVar.zzd(((Integer) obj).intValue());
                return;
            case 15:
                zzcyVar.zzc(((Long) obj).longValue());
                return;
            case 16:
                zzcyVar.zzc(((Integer) obj).intValue());
                return;
            case 17:
                zzcyVar.zzb(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzdu) {
                    zzcyVar.zza(((zzdu) obj).zza());
                    return;
                } else {
                    zzcyVar.zza(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public final int zzg() {
        int i = 0;
        for (int i2 = 0; i2 < this.zza.zzc(); i2++) {
            i += zzc(this.zza.zzb(i2));
        }
        for (Map.Entry<T, Object> entry : this.zza.zzd()) {
            i += zzc(entry);
        }
        return i;
    }

    private static int zzc(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzc() == zzhb.MESSAGE && !key.zzd() && !key.zze()) {
            if (value instanceof zzed) {
                return zzcy.zzb(entry.getKey().zza(), (zzed) value);
            }
            return zzcy.zzb(entry.getKey().zza(), (zzey) value);
        }
        return zza((zzdn<?>) key, value);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzgy zzgyVar, int i, Object obj) {
        int zze = zzcy.zze(i);
        if (zzgyVar == zzgy.zzj) {
            zzdv.zza((zzey) obj);
            zze <<= 1;
        }
        return zze + zzb(zzgyVar, obj);
    }

    private static int zzb(zzgy zzgyVar, Object obj) {
        switch (zzdk.zzb[zzgyVar.ordinal()]) {
            case 1:
                return zzcy.zzb(((Double) obj).doubleValue());
            case 2:
                return zzcy.zzb(((Float) obj).floatValue());
            case 3:
                return zzcy.zzd(((Long) obj).longValue());
            case 4:
                return zzcy.zze(((Long) obj).longValue());
            case 5:
                return zzcy.zzf(((Integer) obj).intValue());
            case 6:
                return zzcy.zzg(((Long) obj).longValue());
            case 7:
                return zzcy.zzi(((Integer) obj).intValue());
            case 8:
                return zzcy.zzb(((Boolean) obj).booleanValue());
            case 9:
                return zzcy.zzc((zzey) obj);
            case 10:
                if (obj instanceof zzed) {
                    return zzcy.zza((zzed) obj);
                }
                return zzcy.zzb((zzey) obj);
            case 11:
                if (obj instanceof zzch) {
                    return zzcy.zzb((zzch) obj);
                }
                return zzcy.zzb((String) obj);
            case 12:
                if (obj instanceof zzch) {
                    return zzcy.zzb((zzch) obj);
                }
                return zzcy.zzb((byte[]) obj);
            case 13:
                return zzcy.zzg(((Integer) obj).intValue());
            case 14:
                return zzcy.zzj(((Integer) obj).intValue());
            case 15:
                return zzcy.zzh(((Long) obj).longValue());
            case 16:
                return zzcy.zzh(((Integer) obj).intValue());
            case 17:
                return zzcy.zzf(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzdu) {
                    return zzcy.zzk(((zzdu) obj).zza());
                }
                return zzcy.zzk(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int zza(zzdn<?> zzdnVar, Object obj) {
        zzgy zzb = zzdnVar.zzb();
        int zza = zzdnVar.zza();
        if (zzdnVar.zzd()) {
            int i = 0;
            if (zzdnVar.zze()) {
                for (Object obj2 : (List) obj) {
                    i += zzb(zzb, obj2);
                }
                return zzcy.zze(zza) + i + zzcy.zzl(i);
            }
            for (Object obj3 : (List) obj) {
                i += zza(zzb, zza, obj3);
            }
            return i;
        }
        return zza(zzb, zza, obj);
    }

    public final /* synthetic */ Object clone() {
        zzdl zzdlVar = new zzdl();
        for (int i = 0; i < this.zza.zzc(); i++) {
            Map.Entry<T, Object> zzb = this.zza.zzb(i);
            zzdlVar.zzb((zzdl) zzb.getKey(), zzb.getValue());
        }
        for (Map.Entry<T, Object> entry : this.zza.zzd()) {
            zzdlVar.zzb((zzdl) entry.getKey(), entry.getValue());
        }
        zzdlVar.zzc = this.zzc;
        return zzdlVar;
    }
}
