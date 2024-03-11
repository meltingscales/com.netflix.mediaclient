package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzbo;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import o.C9587sU;

/* loaded from: classes5.dex */
public final class zzfu extends zzkb implements zzz {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int b = 1;
    private static int b$s55$399 = 0;
    private static int e = 0;
    @VisibleForTesting
    private static int zzb = 65535;
    @VisibleForTesting
    private static int zzc = 2;
    private final Map<String, Map<String, String>> zzd;
    private final Map<String, Map<String, Boolean>> zze;
    private final Map<String, Map<String, Boolean>> zzf;
    private final Map<String, zzbo.zzb> zzg;
    private final Map<String, Map<String, Integer>> zzh;
    private final Map<String, String> zzi;

    static {
        c();
        int i = b + 15;
        e = i % 128;
        int i2 = i % 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfu(zzke zzkeVar) {
        super(zzkeVar);
        this.zzd = new ArrayMap();
        this.zze = new ArrayMap();
        this.zzf = new ArrayMap();
        this.zzg = new ArrayMap();
        this.zzi = new ArrayMap();
        this.zzh = new ArrayMap();
    }

    static void c() {
        b$s55$399 = -1407015320;
    }

    @Override // com.google.android.gms.measurement.internal.zzkb
    protected final boolean zze() {
        int i = 2 % 2;
        int i2 = b + 103;
        e = i2 % 128;
        return i2 % 2 != 0;
    }

    private final void zzi(String str) {
        int i = 2 % 2;
        int i2 = b + 47;
        e = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            zzak();
            zzd();
            Preconditions.checkNotEmpty(str);
            this.zzg.get(str);
            obj.hashCode();
            throw null;
        }
        zzak();
        zzd();
        Preconditions.checkNotEmpty(str);
        if (this.zzg.get(str) == null) {
            byte[] zzd = zzi().zzd(str);
            if (zzd == null) {
                this.zzd.put(str, null);
                this.zze.put(str, null);
                this.zzf.put(str, null);
                this.zzg.put(str, null);
                this.zzi.put(str, null);
                this.zzh.put(str, null);
                return;
            }
            zzbo.zzb.zza zzbm = zza(str, zzd).zzbm();
            zza(str, zzbm);
            this.zzd.put(str, zza((zzbo.zzb) ((com.google.android.gms.internal.measurement.zzfd) zzbm.zzu())));
            this.zzg.put(str, (zzbo.zzb) ((com.google.android.gms.internal.measurement.zzfd) zzbm.zzu()));
            this.zzi.put(str, null);
        }
        int i3 = b + 105;
        e = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzbo.zzb zza(String str) {
        int i = 2 % 2;
        int i2 = e + 97;
        b = i2 % 128;
        int i3 = i2 % 2;
        zzak();
        zzd();
        Preconditions.checkNotEmpty(str);
        zzi(str);
        zzbo.zzb zzbVar = this.zzg.get(str);
        int i4 = e + 51;
        b = i4 % 128;
        int i5 = i4 % 2;
        return zzbVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zzb(String str) {
        int i = 2 % 2;
        int i2 = e + 41;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            zzd();
            int i3 = 45 / 0;
            return this.zzi.get(str);
        }
        zzd();
        return this.zzi.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzc(String str) {
        int i = 2 % 2;
        int i2 = b + 75;
        e = i2 % 128;
        int i3 = i2 % 2;
        zzd();
        this.zzi.put(str, null);
        int i4 = e + 95;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(String str) {
        int i = 2 % 2;
        int i2 = e + 35;
        b = i2 % 128;
        int i3 = i2 % 2;
        zzd();
        this.zzg.remove(str);
        int i4 = b + 57;
        e = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zze(String str) {
        int i = 2 % 2;
        int i2 = e + 77;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            zzd();
            zzbo.zzb zza = zza(str);
            if (zza == null) {
                int i3 = b + 31;
                e = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            return zza.zzh();
        }
        zzd();
        zza(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzz
    public final String zza(String str, String str2) {
        int i = 2 % 2;
        int i2 = b + 105;
        e = i2 % 128;
        int i3 = i2 % 2;
        zzd();
        zzi(str);
        Map<String, String> map = this.zzd.get(str);
        if (map != null) {
            int i4 = e + 57;
            b = i4 % 128;
            int i5 = i4 % 2;
            String str3 = map.get(str2);
            int i6 = e + 117;
            b = i6 % 128;
            int i7 = i6 % 2;
            return str3;
        }
        return null;
    }

    private static Map<String, String> zza(zzbo.zzb zzbVar) {
        int i = 2 % 2;
        ArrayMap arrayMap = new ArrayMap();
        if (zzbVar != null) {
            int i2 = b + 75;
            e = i2 % 128;
            if (i2 % 2 == 0) {
                Iterator<zzbo.zzc> it = zzbVar.zze().iterator();
                while (it.hasNext()) {
                    int i3 = e + 19;
                    b = i3 % 128;
                    if (i3 % 2 == 0) {
                        zzbo.zzc next = it.next();
                        arrayMap.put(next.zza(), next.zzb());
                        int i4 = 57 / 0;
                    } else {
                        zzbo.zzc next2 = it.next();
                        arrayMap.put(next2.zza(), next2.zzb());
                    }
                }
            } else {
                zzbVar.zze().iterator();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return arrayMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x009f, code lost:
        if (r6.zze() >= com.google.android.gms.measurement.internal.zzfu.zzc) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a8, code lost:
        if (r6.zze() >= com.google.android.gms.measurement.internal.zzfu.zzc) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b0, code lost:
        if (r6.zze() <= com.google.android.gms.measurement.internal.zzfu.zzb) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b3, code lost:
        r3.put(r6.zza(), java.lang.Integer.valueOf(r6.zze()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c3, code lost:
        zzr().zzi().zza("Invalid sampling rate. Event name, sample rate", r6.zza(), java.lang.Integer.valueOf(r6.zze()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zza(java.lang.String r11, com.google.android.gms.internal.measurement.zzbo.zzb.zza r12) {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            androidx.collection.ArrayMap r3 = new androidx.collection.ArrayMap
            r3.<init>()
            if (r12 == 0) goto Lf3
            int r4 = com.google.android.gms.measurement.internal.zzfu.e
            int r4 = r4 + 15
            int r5 = r4 % 128
            com.google.android.gms.measurement.internal.zzfu.b = r5
            int r4 = r4 % r0
            r4 = 0
            r5 = r4
        L1f:
            int r6 = r12.zza()
            if (r5 >= r6) goto Lf3
            int r6 = com.google.android.gms.measurement.internal.zzfu.b
            int r6 = r6 + 71
            int r7 = r6 % 128
            com.google.android.gms.measurement.internal.zzfu.e = r7
            int r6 = r6 % r0
            if (r6 != 0) goto Le0
            com.google.android.gms.internal.measurement.zzbo$zza r6 = r12.zza(r5)
            com.google.android.gms.internal.measurement.zzfd$zzb r6 = r6.zzbm()
            com.google.android.gms.internal.measurement.zzbo$zza$zza r6 = (com.google.android.gms.internal.measurement.zzbo.zza.C0040zza) r6
            java.lang.String r7 = r6.zza()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L53
            com.google.android.gms.measurement.internal.zzew r6 = r10.zzr()
            com.google.android.gms.measurement.internal.zzey r6 = r6.zzi()
            java.lang.String r7 = "EventConfig contained null event name"
            r6.zza(r7)
            goto Ldc
        L53:
            java.lang.String r7 = r6.zza()
            java.lang.String r7 = com.google.android.gms.measurement.internal.zzgv.zzb(r7)
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto L68
            com.google.android.gms.internal.measurement.zzbo$zza$zza r6 = r6.zza(r7)
            r12.zza(r5, r6)
        L68:
            java.lang.String r7 = r6.zza()
            boolean r8 = r6.zzb()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r1.put(r7, r8)
            java.lang.String r7 = r6.zza()
            boolean r8 = r6.zzc()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r2.put(r7, r8)
            boolean r7 = r6.zzd()
            if (r7 == 0) goto Ldc
            int r7 = com.google.android.gms.measurement.internal.zzfu.b
            int r7 = r7 + 49
            int r8 = r7 % 128
            com.google.android.gms.measurement.internal.zzfu.e = r8
            int r7 = r7 % r0
            if (r7 == 0) goto La2
            int r7 = r6.zze()
            int r8 = com.google.android.gms.measurement.internal.zzfu.zzc
            r9 = 1
            int r9 = r9 / r4
            if (r7 < r8) goto Lc3
            goto Laa
        La2:
            int r7 = r6.zze()
            int r8 = com.google.android.gms.measurement.internal.zzfu.zzc
            if (r7 < r8) goto Lc3
        Laa:
            int r7 = r6.zze()
            int r8 = com.google.android.gms.measurement.internal.zzfu.zzb
            if (r7 <= r8) goto Lb3
            goto Lc3
        Lb3:
            java.lang.String r7 = r6.zza()
            int r6 = r6.zze()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3.put(r7, r6)
            goto Ldc
        Lc3:
            com.google.android.gms.measurement.internal.zzew r7 = r10.zzr()
            com.google.android.gms.measurement.internal.zzey r7 = r7.zzi()
            java.lang.String r8 = r6.zza()
            int r6 = r6.zze()
            java.lang.String r9 = "Invalid sampling rate. Event name, sample rate"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.zza(r9, r8, r6)
        Ldc:
            int r5 = r5 + 1
            goto L1f
        Le0:
            com.google.android.gms.internal.measurement.zzbo$zza r11 = r12.zza(r5)
            com.google.android.gms.internal.measurement.zzfd$zzb r11 = r11.zzbm()
            com.google.android.gms.internal.measurement.zzbo$zza$zza r11 = (com.google.android.gms.internal.measurement.zzbo.zza.C0040zza) r11
            java.lang.String r11 = r11.zza()
            android.text.TextUtils.isEmpty(r11)
            r11 = 0
            throw r11
        Lf3:
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> r12 = r10.zze
            r12.put(r11, r1)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> r12 = r10.zzf
            r12.put(r11, r2)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> r12 = r10.zzh
            r12.put(r11, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfu.zza(java.lang.String, com.google.android.gms.internal.measurement.zzbo$zzb$zza):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zza(String str, byte[] bArr, String str2) {
        int i = 2 % 2;
        int i2 = e + 39;
        b = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            zzak();
            zzd();
            Preconditions.checkNotEmpty(str);
            zzbo.zzb.zza zzbm = zza(str, bArr).zzbm();
            if (zzbm == null) {
                return false;
            }
            zza(str, zzbm);
            this.zzg.put(str, (zzbo.zzb) ((com.google.android.gms.internal.measurement.zzfd) zzbm.zzu()));
            this.zzi.put(str, str2);
            this.zzd.put(str, zza((zzbo.zzb) ((com.google.android.gms.internal.measurement.zzfd) zzbm.zzu())));
            zzi().zzb(str, new ArrayList(zzbm.zzb()));
            try {
                zzbm.zzc();
                bArr = ((zzbo.zzb) ((com.google.android.gms.internal.measurement.zzfd) zzbm.zzu())).zzbi();
            } catch (RuntimeException e2) {
                zzr().zzi().zza("Unable to serialize reduced-size config. Storing full config instead. appId", zzew.zza(str), e2);
            } catch (Exception e3) {
                throw e3;
            }
            zzac zzi = zzi();
            Preconditions.checkNotEmpty(str);
            zzi.zzd();
            zzi.zzak();
            ContentValues contentValues = new ContentValues();
            contentValues.put("remote_config", bArr);
            try {
                if (zzi.c_().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                    int i3 = e + 9;
                    b = i3 % 128;
                    if (i3 % 2 != 0) {
                        zzi.zzr().zzf().zza("Failed to update remote config (got 0). appId", zzew.zza(str));
                    } else {
                        zzi.zzr().zzf().zza("Failed to update remote config (got 0). appId", zzew.zza(str));
                        throw null;
                    }
                }
            } catch (SQLiteException e4) {
                zzi.zzr().zzf().zza("Error storing remote config. appId", zzew.zza(str), e4);
            }
            this.zzg.put(str, (zzbo.zzb) ((com.google.android.gms.internal.measurement.zzfd) zzbm.zzu()));
            int i4 = e + 3;
            b = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 51 / 0;
            }
            return true;
        }
        zzak();
        zzd();
        Preconditions.checkNotEmpty(str);
        zza(str, bArr).zzbm();
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzb(String str, String str2) {
        int i = 2 % 2;
        zzd();
        zzi(str);
        if (zzg(str) && zzkm.zze(str2)) {
            return true;
        }
        Object obj = null;
        if (zzh(str)) {
            int i2 = e + 33;
            b = i2 % 128;
            if (i2 % 2 == 0) {
                zzkm.zza(str2);
                throw null;
            } else if (zzkm.zza(str2)) {
                int i3 = b + 77;
                e = i3 % 128;
                int i4 = i3 % 2;
                return true;
            }
        }
        Map<String, Boolean> map = this.zze.get(str);
        if (map != null) {
            int i5 = e + 47;
            b = i5 % 128;
            if (i5 % 2 == 0) {
                map.get(str2);
                obj.hashCode();
                throw null;
            }
            Boolean bool = map.get(str2);
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzc(String str, String str2) {
        int i = 2 % 2;
        int i2 = e + 13;
        b = i2 % 128;
        int i3 = i2 % 2;
        zzd();
        zzi(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.zzf.get(str);
        if (map != null) {
            int i4 = e + 47;
            b = i4 % 128;
            int i5 = i4 % 2;
            Boolean bool = map.get(str2);
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzd(String str, String str2) {
        int i = 2 % 2;
        int i2 = e + 115;
        b = i2 % 128;
        int i3 = i2 % 2;
        zzd();
        zzi(str);
        Map<String, Integer> map = this.zzh.get(str);
        if (map != null) {
            Integer num = map.get(str2);
            if (num == null) {
                int i4 = b + 3;
                e = i4 % 128;
                int i5 = i4 % 2;
                return 1;
            }
            return num.intValue();
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zzf(String str) {
        int i = 2 % 2;
        String zza = zza(str, "measurement.account.time_zone_offset_minutes");
        if (!(!TextUtils.isEmpty(zza))) {
            return 0L;
        }
        int i2 = e + 67;
        b = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                Long.parseLong(zza);
                throw null;
            }
            long parseLong = Long.parseLong(zza);
            int i3 = b + 63;
            e = i3 % 128;
            if (i3 % 2 == 0) {
                return parseLong;
            }
            throw null;
        } catch (NumberFormatException e2) {
            zzr().zzi().zza("Unable to parse timezone offset. appId", zzew.zza(str), e2);
            return 0L;
        }
    }

    private final zzbo.zzb zza(String str, byte[] bArr) {
        Long l;
        int i = 2 % 2;
        if (bArr == null) {
            return zzbo.zzb.zzj();
        }
        try {
            zzbo.zzb zzbVar = (zzbo.zzb) ((com.google.android.gms.internal.measurement.zzfd) ((zzbo.zzb.zza) zzki.zza(zzbo.zzb.zzi(), bArr)).zzu());
            zzey zzx = zzr().zzx();
            String str2 = null;
            if (!(!zzbVar.zza())) {
                int i2 = e + 125;
                b = i2 % 128;
                if (i2 % 2 != 0) {
                    l = Long.valueOf(zzbVar.zzb());
                } else {
                    l = Long.valueOf(zzbVar.zzb());
                    int i3 = 78 / 0;
                }
            } else {
                int i4 = b + 97;
                e = i4 % 128;
                int i5 = i4 % 2;
                l = null;
            }
            if (!(!zzbVar.zzc())) {
                str2 = zzbVar.zzd();
            }
            zzx.zza("Parsed config. version, gmp_app_id", l, str2);
            return zzbVar;
        } catch (com.google.android.gms.internal.measurement.zzfo e2) {
            zzr().zzi().zza("Unable to merge remote config. appId", zzew.zza(str), e2);
            return zzbo.zzb.zzj();
        } catch (RuntimeException e3) {
            zzr().zzi().zza("Unable to merge remote config. appId", zzew.zza(str), e3);
            return zzbo.zzb.zzj();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzg(String str) {
        Object obj;
        int i = 2 % 2;
        int i2 = e + 37;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[1];
            d(30970, true, 1, 0, new char[]{0}, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            d(167, false, 1, 1, new char[]{0}, objArr2);
            obj = objArr2[0];
        }
        boolean equals = ((String) obj).intern().equals(zza(str, "measurement.upload.blacklist_internal"));
        int i3 = e + 31;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return equals;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzh(String str) {
        int i = 2 % 2;
        int i2 = e + 31;
        b = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        d(167, false, 1, 1, new char[]{0}, objArr);
        boolean equals = ((String) objArr[0]).intern().equals(zza(str, "measurement.upload.blacklist_public"));
        int i4 = b + 117;
        e = i4 % 128;
        int i5 = i4 % 2;
        return equals;
    }

    @Override // com.google.android.gms.measurement.internal.zzkc
    public final /* bridge */ /* synthetic */ zzki zzg() {
        zzki zzg;
        int i = 2 % 2;
        int i2 = e + 91;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            zzg = super.zzg();
            int i3 = 5 / 0;
        } else {
            zzg = super.zzg();
        }
        int i4 = e + 121;
        b = i4 % 128;
        int i5 = i4 % 2;
        return zzg;
    }

    @Override // com.google.android.gms.measurement.internal.zzkc
    public final /* bridge */ /* synthetic */ zzn e_() {
        int i = 2 % 2;
        int i2 = b + 57;
        e = i2 % 128;
        int i3 = i2 % 2;
        zzn e_ = super.e_();
        int i4 = b + 29;
        e = i4 % 128;
        int i5 = i4 % 2;
        return e_;
    }

    @Override // com.google.android.gms.measurement.internal.zzkc
    public final /* bridge */ /* synthetic */ zzac zzi() {
        int i = 2 % 2;
        int i2 = e + 11;
        b = i2 % 128;
        int i3 = i2 % 2;
        zzac zzi = super.zzi();
        int i4 = e + 69;
        b = i4 % 128;
        int i5 = i4 % 2;
        return zzi;
    }

    @Override // com.google.android.gms.measurement.internal.zzkc
    public final /* bridge */ /* synthetic */ zzfu zzj() {
        int i = 2 % 2;
        int i2 = e + 19;
        b = i2 % 128;
        int i3 = i2 % 2;
        zzfu zzj = super.zzj();
        int i4 = b + 15;
        e = i4 % 128;
        int i5 = i4 % 2;
        return zzj;
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final /* synthetic */ void zza() {
        int i = 2 % 2;
        int i2 = b + 35;
        e = i2 % 128;
        int i3 = i2 % 2;
        super.zza();
        int i4 = e + NetflixImageView.DEFAULT_LAYER_GRAVITY;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ void zzb() {
        int i = 2 % 2;
        int i2 = e + 113;
        b = i2 % 128;
        int i3 = i2 % 2;
        super.zzb();
        int i4 = e + 11;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ void zzc() {
        int i = 2 % 2;
        int i2 = b + 55;
        e = i2 % 128;
        int i3 = i2 % 2;
        super.zzc();
        if (i3 != 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ void zzd() {
        int i = 2 % 2;
        int i2 = b + 27;
        e = i2 % 128;
        int i3 = i2 % 2;
        super.zzd();
        if (i3 != 0) {
            int i4 = 77 / 0;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ zzah zzl() {
        int i = 2 % 2;
        int i2 = e + 97;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return super.zzl();
        }
        super.zzl();
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgr, com.google.android.gms.measurement.internal.zzgt
    public final /* bridge */ /* synthetic */ Clock zzm() {
        int i = 2 % 2;
        int i2 = e + 41;
        b = i2 % 128;
        int i3 = i2 % 2;
        Clock zzm = super.zzm();
        int i4 = e + 21;
        b = i4 % 128;
        int i5 = i4 % 2;
        return zzm;
    }

    @Override // com.google.android.gms.measurement.internal.zzgr, com.google.android.gms.measurement.internal.zzgt
    public final /* bridge */ /* synthetic */ Context zzn() {
        int i = 2 % 2;
        int i2 = e + 3;
        b = i2 % 128;
        int i3 = i2 % 2;
        Context zzn = super.zzn();
        int i4 = e + 3;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return zzn;
        }
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ zzeu zzo() {
        int i = 2 % 2;
        int i2 = b + 27;
        e = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 78 / 0;
            return super.zzo();
        }
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ zzkm zzp() {
        zzkm zzp;
        int i = 2 % 2;
        int i2 = e + 5;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            zzp = super.zzp();
            int i3 = 69 / 0;
        } else {
            zzp = super.zzp();
        }
        int i4 = e + 95;
        b = i4 % 128;
        int i5 = i4 % 2;
        return zzp;
    }

    @Override // com.google.android.gms.measurement.internal.zzgr, com.google.android.gms.measurement.internal.zzgt
    public final /* bridge */ /* synthetic */ zzft zzq() {
        int i = 2 % 2;
        int i2 = b + 9;
        e = i2 % 128;
        int i3 = i2 % 2;
        zzft zzq = super.zzq();
        int i4 = b + 115;
        e = i4 % 128;
        int i5 = i4 % 2;
        return zzq;
    }

    @Override // com.google.android.gms.measurement.internal.zzgr, com.google.android.gms.measurement.internal.zzgt
    public final /* bridge */ /* synthetic */ zzew zzr() {
        int i = 2 % 2;
        int i2 = e + 27;
        b = i2 % 128;
        int i3 = i2 % 2;
        zzew zzr = super.zzr();
        int i4 = e + 17;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
        return zzr;
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ zzff zzs() {
        int i = 2 % 2;
        int i2 = b + 65;
        e = i2 % 128;
        int i3 = i2 % 2;
        zzff zzs = super.zzs();
        int i4 = b + 109;
        e = i4 % 128;
        int i5 = i4 % 2;
        return zzs;
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ zzx zzt() {
        int i = 2 % 2;
        int i2 = b + 101;
        e = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 38 / 0;
            return super.zzt();
        }
        return super.zzt();
    }

    @Override // com.google.android.gms.measurement.internal.zzgr, com.google.android.gms.measurement.internal.zzgt
    public final /* synthetic */ zzw zzu() {
        int i = 2 % 2;
        int i2 = b + 9;
        e = i2 % 128;
        int i3 = i2 % 2;
        zzw zzu = super.zzu();
        int i4 = b + 43;
        e = i4 % 128;
        if (i4 % 2 == 0) {
            return zzu;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void d(int i, boolean z, int i2, int i3, char[] cArr, Object[] objArr) {
        int i4 = 2 % 2;
        C9587sU c9587sU = new C9587sU();
        char[] cArr2 = new char[i3];
        c9587sU.e = 0;
        int i5 = $11 + 35;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (c9587sU.e < i3) {
            c9587sU.b = cArr[c9587sU.e];
            cArr2[c9587sU.e] = (char) (c9587sU.b + i);
            int i7 = c9587sU.e;
            cArr2[i7] = (char) (cArr2[i7] - ((int) (b$s55$399 ^ 4056316384523757086L)));
            c9587sU.e++;
        }
        if (i2 > 0) {
            c9587sU.a = i2;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            System.arraycopy(cArr3, 0, cArr2, i3 - c9587sU.a, c9587sU.a);
            System.arraycopy(cArr3, c9587sU.a, cArr2, 0, i3 - c9587sU.a);
        }
        if (z) {
            int i8 = $10 + 109;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i3];
            c9587sU.e = 0;
            while (c9587sU.e < i3) {
                int i10 = $10 + 115;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                cArr4[c9587sU.e] = cArr2[(i3 - c9587sU.e) - 1];
                c9587sU.e++;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }
}
