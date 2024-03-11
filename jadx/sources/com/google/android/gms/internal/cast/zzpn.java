package com.google.android.gms.internal.cast;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzpn {
    private static final zzpn zzb = new zzpn(true);
    final zzrz zza = new zzrp(16);
    private boolean zzc;
    private boolean zzd;

    private zzpn() {
    }

    public static zzpn zza() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void zzd(com.google.android.gms.internal.cast.zzpm r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.cast.zzss r0 = r2.zzb()
            com.google.android.gms.internal.cast.zzqc.zze(r3)
            com.google.android.gms.internal.cast.zzss r1 = com.google.android.gms.internal.cast.zzss.zza
            com.google.android.gms.internal.cast.zzst r1 = com.google.android.gms.internal.cast.zzst.INT
            com.google.android.gms.internal.cast.zzst r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L41;
                case 1: goto L3e;
                case 2: goto L3b;
                case 3: goto L38;
                case 4: goto L35;
                case 5: goto L32;
                case 6: goto L29;
                case 7: goto L20;
                case 8: goto L17;
                default: goto L16;
            }
        L16:
            goto L46
        L17:
            boolean r0 = r3 instanceof com.google.android.gms.internal.cast.zzrb
            if (r0 != 0) goto L45
            boolean r0 = r3 instanceof com.google.android.gms.internal.cast.zzqg
            if (r0 == 0) goto L46
            goto L45
        L20:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L45
            boolean r0 = r3 instanceof com.google.android.gms.internal.cast.zzpv
            if (r0 == 0) goto L46
            goto L45
        L29:
            boolean r0 = r3 instanceof com.google.android.gms.internal.cast.zzoy
            if (r0 != 0) goto L45
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L46
            goto L45
        L32:
            boolean r0 = r3 instanceof java.lang.String
            goto L43
        L35:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L43
        L38:
            boolean r0 = r3 instanceof java.lang.Double
            goto L43
        L3b:
            boolean r0 = r3 instanceof java.lang.Float
            goto L43
        L3e:
            boolean r0 = r3 instanceof java.lang.Long
            goto L43
        L41:
            boolean r0 = r3 instanceof java.lang.Integer
        L43:
            if (r0 == 0) goto L46
        L45:
            return
        L46:
            int r0 = r2.zza()
            com.google.android.gms.internal.cast.zzss r2 = r2.zzb()
            com.google.android.gms.internal.cast.zzst r2 = r2.zza()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r2, r3}
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r2 = java.lang.String.format(r0, r2)
            r3.<init>(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.zzpn.zzd(com.google.android.gms.internal.cast.zzpm, java.lang.Object):void");
    }

    public final /* synthetic */ Object clone() {
        zzpn zzpnVar = new zzpn();
        for (int i = 0; i < this.zza.zzb(); i++) {
            Map.Entry zzg = this.zza.zzg(i);
            zzpnVar.zzc((zzpm) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzpnVar.zzc((zzpm) entry.getKey(), entry.getValue());
        }
        zzpnVar.zzd = this.zzd;
        return zzpnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzpn) {
            return this.zza.equals(((zzpn) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzc) {
            return;
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzc(zzpm zzpmVar, Object obj) {
        if (zzpmVar.zzc()) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zzd(zzpmVar, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            zzd(zzpmVar, obj);
        }
        if (obj instanceof zzqg) {
            this.zzd = true;
        }
        this.zza.put(zzpmVar, obj);
    }

    private zzpn(boolean z) {
        zzb();
        zzb();
    }
}
