package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.C9586sT;

/* loaded from: classes5.dex */
public final class zzes extends zze {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int c = 0;
    private static int e = 1;
    private static long e$s69$353 = -3179638240234458573L;
    private final zzer zza;
    private boolean zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzes(zzga zzgaVar) {
        super(zzgaVar);
        this.zza = new zzer(this, zzn(), "google_app_measurement_local.db");
    }

    @Override // com.google.android.gms.measurement.internal.zze
    protected final boolean zzz() {
        int i = 2 % 2;
        int i2 = e + 75;
        int i3 = i2 % 128;
        c = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 11;
        e = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 36 / 0;
        }
        return false;
    }

    public final void zzab() {
        int i = 2 % 2;
        int i2 = e + 13;
        c = i2 % 128;
        int i3 = i2 % 2;
        zzb();
        zzd();
        try {
            int delete = zzae().delete(SignupConstants.Field.MESSAGES, null, null);
            if (delete > 0) {
                zzr().zzx().zza("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e2) {
            zzr().zzf().zza("Error resetting local analytics data. error", e2);
            int i4 = e + 89;
            c = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016c  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zza(int r19, byte[] r20) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzes.zza(int, byte[]):boolean");
    }

    public final boolean zza(zzan zzanVar) {
        int i = 2 % 2;
        int i2 = e + 45;
        c = i2 % 128;
        int i3 = i2 % 2;
        Parcel obtain = Parcel.obtain();
        zzanVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            boolean zza = zza(0, marshall);
            int i4 = c + 85;
            e = i4 % 128;
            int i5 = i4 % 2;
            return zza;
        }
        int i6 = e + NetflixImageView.DEFAULT_LAYER_GRAVITY;
        c = i6 % 128;
        if (i6 % 2 != 0) {
            zzr().zzi().zza("Event is too long for local database. Sending event directly to service");
            return true;
        }
        zzr().zzi().zza("Event is too long for local database. Sending event directly to service");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
        return zza(1, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r6.length > 131072) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
        if (r6.length > 131072) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
        r6 = com.google.android.gms.measurement.internal.zzes.e + 79;
        com.google.android.gms.measurement.internal.zzes.c = r6 % 128;
        r6 = r6 % 2;
        zzr().zzi().zza("User property too long for local database. Sending directly to service");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zza(com.google.android.gms.measurement.internal.zzkl r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.measurement.internal.zzes.e
            int r1 = r1 + 11
            int r2 = r1 % 128
            com.google.android.gms.measurement.internal.zzes.c = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 131072(0x20000, float:1.83671E-40)
            r4 = 1
            if (r1 == 0) goto L24
            android.os.Parcel r1 = android.os.Parcel.obtain()
            r6.writeToParcel(r1, r4)
            byte[] r6 = r1.marshall()
            r1.recycle()
            int r1 = r6.length
            if (r1 <= r3) goto L4c
            goto L35
        L24:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            r6.writeToParcel(r1, r2)
            byte[] r6 = r1.marshall()
            r1.recycle()
            int r1 = r6.length
            if (r1 <= r3) goto L4c
        L35:
            int r6 = com.google.android.gms.measurement.internal.zzes.e
            int r6 = r6 + 79
            int r1 = r6 % 128
            com.google.android.gms.measurement.internal.zzes.c = r1
            int r6 = r6 % r0
            java.lang.String r0 = "User property too long for local database. Sending directly to service"
            com.google.android.gms.measurement.internal.zzew r6 = r5.zzr()
            com.google.android.gms.measurement.internal.zzey r6 = r6.zzi()
            r6.zza(r0)
            return r2
        L4c:
            boolean r6 = r5.zza(r4, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzes.zza(com.google.android.gms.measurement.internal.zzkl):boolean");
    }

    public final boolean zza(zzv zzvVar) {
        int i = 2 % 2;
        int i2 = e + 33;
        c = i2 % 128;
        int i3 = i2 % 2;
        zzp();
        byte[] zza = zzkm.zza((Parcelable) zzvVar);
        if (zza.length > 131072) {
            int i4 = e + 53;
            c = i4 % 128;
            if (i4 % 2 != 0) {
                zzr().zzi().zza("Conditional user property too long for local database. Sending directly to service");
                return true;
            }
            zzr().zzi().zza("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return zza(2, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02ca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02ca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02ca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x016b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable>] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable> zza(int r24) {
        /*
            Method dump skipped, instructions count: 755
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzes.zza(int):java.util.List");
    }

    public final boolean zzac() {
        int i = 2 % 2;
        int i2 = c + 101;
        e = i2 % 128;
        int i3 = i2 % 2;
        boolean zza = zza(3, new byte[0]);
        int i4 = c + 77;
        e = i4 % 128;
        if (i4 % 2 != 0) {
            return zza;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzad() {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzes.zzad():boolean");
    }

    private static long zza(SQLiteDatabase sQLiteDatabase) {
        Throwable th;
        Cursor cursor;
        int i = 2 % 2;
        int i2 = c + 65;
        e = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        try {
            Object[] objArr = new Object[1];
            b(1, new char[]{39293, 39244, 61317, 58591, 9684}, objArr);
            cursor = sQLiteDatabase.query(SignupConstants.Field.MESSAGES, new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", ((String) objArr[0]).intern());
            try {
                if (cursor.moveToFirst()) {
                    long j = cursor.getLong(0);
                    cursor.close();
                    int i4 = c + 53;
                    e = i4 % 128;
                    if (i4 % 2 != 0) {
                        return j;
                    }
                    obj.hashCode();
                    throw null;
                }
                cursor.close();
                return -1L;
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    int i5 = c + 33;
                    e = i5 % 128;
                    if (i5 % 2 == 0) {
                        cursor.close();
                        int i6 = 85 / 0;
                    } else {
                        cursor.close();
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    @VisibleForTesting
    private final SQLiteDatabase zzae() {
        int i = 2 % 2;
        int i2 = c + 57;
        e = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        } else if (this.zzb) {
            return null;
        } else {
            SQLiteDatabase writableDatabase = this.zza.getWritableDatabase();
            if (writableDatabase == null) {
                int i3 = c + 113;
                e = i3 % 128;
                int i4 = i3 % 2;
                this.zzb = true;
                return null;
            }
            return writableDatabase;
        }
    }

    @VisibleForTesting
    private final boolean zzaf() {
        int i = 2 % 2;
        int i2 = c + 95;
        e = i2 % 128;
        if (i2 % 2 != 0) {
            boolean exists = zzn().getDatabasePath("google_app_measurement_local.db").exists();
            int i3 = e + 115;
            c = i3 % 128;
            int i4 = i3 % 2;
            return exists;
        }
        zzn().getDatabasePath("google_app_measurement_local.db").exists();
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzgr
    public final /* synthetic */ void zza() {
        int i = 2 % 2;
        int i2 = c + 69;
        e = i2 % 128;
        if (i2 % 2 != 0) {
            super.zza();
            return;
        }
        super.zza();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ void zzb() {
        int i = 2 % 2;
        int i2 = e + 97;
        c = i2 % 128;
        int i3 = i2 % 2;
        super.zzb();
        int i4 = c + 51;
        e = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ void zzc() {
        int i = 2 % 2;
        int i2 = c + 11;
        e = i2 % 128;
        int i3 = i2 % 2;
        super.zzc();
        if (i3 == 0) {
            throw null;
        }
        int i4 = c + 65;
        e = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ void zzd() {
        int i = 2 % 2;
        int i2 = c + 107;
        e = i2 % 128;
        int i3 = i2 % 2;
        super.zzd();
        int i4 = c + 69;
        e = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzb zze() {
        int i = 2 % 2;
        int i2 = e + 55;
        c = i2 % 128;
        int i3 = i2 % 2;
        zzb zze = super.zze();
        int i4 = c + 49;
        e = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 / 0;
        }
        return zze;
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzhb zzf() {
        int i = 2 % 2;
        int i2 = e + 105;
        c = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 97 / 0;
            return super.zzf();
        }
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzep zzg() {
        int i = 2 % 2;
        int i2 = c + 103;
        e = i2 % 128;
        int i3 = i2 % 2;
        zzep zzg = super.zzg();
        int i4 = e + 53;
        c = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
        return zzg;
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzij zzh() {
        int i = 2 % 2;
        int i2 = c + 15;
        e = i2 % 128;
        int i3 = i2 % 2;
        zzij zzh = super.zzh();
        int i4 = c + 109;
        e = i4 % 128;
        int i5 = i4 % 2;
        return zzh;
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzii zzi() {
        int i = 2 % 2;
        int i2 = e + 117;
        c = i2 % 128;
        int i3 = i2 % 2;
        zzii zzi = super.zzi();
        int i4 = e + 11;
        c = i4 % 128;
        int i5 = i4 % 2;
        return zzi;
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzes zzj() {
        int i = 2 % 2;
        int i2 = c + 95;
        e = i2 % 128;
        int i3 = i2 % 2;
        zzes zzj = super.zzj();
        int i4 = e + 79;
        c = i4 % 128;
        int i5 = i4 % 2;
        return zzj;
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzjo zzk() {
        int i = 2 % 2;
        int i2 = c + 97;
        e = i2 % 128;
        int i3 = i2 % 2;
        zzjo zzk = super.zzk();
        int i4 = e + 73;
        c = i4 % 128;
        int i5 = i4 % 2;
        return zzk;
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ zzah zzl() {
        int i = 2 % 2;
        int i2 = e + 109;
        c = i2 % 128;
        int i3 = i2 % 2;
        zzah zzl = super.zzl();
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
        return zzl;
    }

    @Override // com.google.android.gms.measurement.internal.zzgr, com.google.android.gms.measurement.internal.zzgt
    public final /* bridge */ /* synthetic */ Clock zzm() {
        int i = 2 % 2;
        int i2 = e + 105;
        c = i2 % 128;
        if (i2 % 2 != 0) {
            super.zzm();
            throw null;
        }
        Clock zzm = super.zzm();
        int i3 = e + 71;
        c = i3 % 128;
        if (i3 % 2 == 0) {
            return zzm;
        }
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgr, com.google.android.gms.measurement.internal.zzgt
    public final /* bridge */ /* synthetic */ Context zzn() {
        Context zzn;
        int i = 2 % 2;
        int i2 = e + 41;
        c = i2 % 128;
        if (i2 % 2 != 0) {
            zzn = super.zzn();
            int i3 = 30 / 0;
        } else {
            zzn = super.zzn();
        }
        int i4 = e + 87;
        c = i4 % 128;
        if (i4 % 2 == 0) {
            return zzn;
        }
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ zzeu zzo() {
        int i = 2 % 2;
        int i2 = e + 7;
        c = i2 % 128;
        if (i2 % 2 != 0) {
            super.zzo();
            throw null;
        }
        zzeu zzo = super.zzo();
        int i3 = c + 79;
        e = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 71 / 0;
        }
        return zzo;
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final /* bridge */ /* synthetic */ zzkm zzp() {
        int i = 2 % 2;
        int i2 = e + 87;
        c = i2 % 128;
        int i3 = i2 % 2;
        zzkm zzp = super.zzp();
        int i4 = c + 51;
        e = i4 % 128;
        int i5 = i4 % 2;
        return zzp;
    }

    @Override // com.google.android.gms.measurement.internal.zzgr, com.google.android.gms.measurement.internal.zzgt
    public final /* synthetic */ zzft zzq() {
        int i = 2 % 2;
        int i2 = e + 13;
        c = i2 % 128;
        int i3 = i2 % 2;
        zzft zzq = super.zzq();
        int i4 = e + 99;
        c = i4 % 128;
        if (i4 % 2 == 0) {
            return zzq;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgr, com.google.android.gms.measurement.internal.zzgt
    public final /* bridge */ /* synthetic */ zzew zzr() {
        int i = 2 % 2;
        int i2 = e + 27;
        c = i2 % 128;
        if (i2 % 2 != 0) {
            super.zzr();
            throw null;
        }
        zzew zzr = super.zzr();
        int i3 = e + 45;
        c = i3 % 128;
        int i4 = i3 % 2;
        return zzr;
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final /* synthetic */ zzff zzs() {
        int i = 2 % 2;
        int i2 = e + 35;
        c = i2 % 128;
        int i3 = i2 % 2;
        zzff zzs = super.zzs();
        int i4 = e + 79;
        c = i4 % 128;
        if (i4 % 2 == 0) {
            return zzs;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final /* synthetic */ zzx zzt() {
        int i = 2 % 2;
        int i2 = c + 107;
        e = i2 % 128;
        if (i2 % 2 != 0) {
            return super.zzt();
        }
        super.zzt();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgr, com.google.android.gms.measurement.internal.zzgt
    public final /* bridge */ /* synthetic */ zzw zzu() {
        int i = 2 % 2;
        int i2 = c + 109;
        e = i2 % 128;
        int i3 = i2 % 2;
        zzw zzu = super.zzu();
        int i4 = e + 89;
        c = i4 % 128;
        if (i4 % 2 == 0) {
            return zzu;
        }
        throw null;
    }

    private static void b(int i, char[] cArr, Object[] objArr) {
        int i2 = 2 % 2;
        C9586sT c9586sT = new C9586sT();
        char[] b = C9586sT.b(e$s69$353 ^ 7567248728798573470L, cArr, i);
        c9586sT.d = 4;
        int i3 = $10 + NetflixImageView.DEFAULT_LAYER_GRAVITY;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (c9586sT.d < b.length) {
            int i5 = $11 + 55;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            c9586sT.b = c9586sT.d - 4;
            b[c9586sT.d] = (char) ((b[c9586sT.d] ^ b[c9586sT.d % 4]) ^ (c9586sT.b * (e$s69$353 ^ 7567248728798573470L)));
            c9586sT.d++;
        }
        objArr[0] = new String(b, 4, b.length - 4);
    }
}
