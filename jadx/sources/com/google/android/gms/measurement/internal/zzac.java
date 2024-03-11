package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzbj;
import com.google.android.gms.internal.measurement.zzbr;
import com.google.android.gms.internal.measurement.zzfd;
import com.google.android.gms.internal.measurement.zzle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import com.netflix.model.leafs.originals.interactive.Prefetch;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzac extends zzkb {
    private static final String[] zzb = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] zzc = {AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzd = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", SignupConstants.Field.DEMO_COLLECT_BIRTH_DAY, "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;"};
    private static final String[] zze = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] zzf = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzg = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzh = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzi = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final zzad zzj;
    private final zzjx zzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzac(zzke zzkeVar) {
        super(zzkeVar);
        this.zzk = new zzjx(zzm());
        this.zzj = new zzad(this, zzn(), "google_app_measurement.db");
    }

    @Override // com.google.android.gms.measurement.internal.zzkb
    protected final boolean zze() {
        return false;
    }

    public final void zzf() {
        zzak();
        c_().beginTransaction();
    }

    public final void b_() {
        zzak();
        c_().setTransactionSuccessful();
    }

    public final void zzh() {
        zzak();
        c_().endTransaction();
    }

    private final long zzb(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = c_().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j = rawQuery.getLong(0);
                    rawQuery.close();
                    return j;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e) {
                zzr().zzf().zza("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long zza(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            try {
                cursor = c_().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    long j2 = cursor.getLong(0);
                    cursor.close();
                    return j2;
                }
                cursor.close();
                return j;
            } catch (SQLiteException e) {
                zzr().zzf().zza("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final SQLiteDatabase c_() {
        zzd();
        try {
            return this.zzj.getWritableDatabase();
        } catch (SQLiteException e) {
            zzr().zzi().zza("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzaj zza(java.lang.String r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzac.zza(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzaj");
    }

    public final void zza(zzaj zzajVar) {
        Preconditions.checkNotNull(zzajVar);
        zzd();
        zzak();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzajVar.zza);
        contentValues.put("name", zzajVar.zzb);
        contentValues.put("lifetime_count", Long.valueOf(zzajVar.zzc));
        contentValues.put("current_bundle_count", Long.valueOf(zzajVar.zzd));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzajVar.zzf));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzajVar.zzg));
        contentValues.put("last_bundled_day", zzajVar.zzh);
        contentValues.put("last_sampled_complex_event_id", zzajVar.zzi);
        contentValues.put("last_sampling_rate", zzajVar.zzj);
        if (zzt().zze(zzajVar.zza, zzap.zzbm)) {
            contentValues.put("current_session_count", Long.valueOf(zzajVar.zze));
        }
        Boolean bool = zzajVar.zzk;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (c_().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                zzr().zzf().zza("Failed to insert/update event aggregates (got -1). appId", zzew.zza(zzajVar.zza));
            }
        } catch (SQLiteException e) {
            zzr().zzf().zza("Error storing event aggregates. appId", zzew.zza(zzajVar.zza), e);
        }
    }

    public final void zzb(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzd();
        zzak();
        try {
            zzr().zzx().zza("Deleted user attribute rows", Integer.valueOf(c_().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2})));
        } catch (SQLiteException e) {
            zzr().zzf().zza("Error deleting user attribute. appId", zzew.zza(str), zzo().zzc(str2), e);
        }
    }

    public final boolean zza(zzkn zzknVar) {
        Preconditions.checkNotNull(zzknVar);
        zzd();
        zzak();
        if (zzc(zzknVar.zza, zzknVar.zzc) == null) {
            if (zzkm.zza(zzknVar.zzc)) {
                if (zzb("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{zzknVar.zza}) >= 25) {
                    return false;
                }
            } else if (zzt().zze(zzknVar.zza, zzap.zzba)) {
                if (!"_npa".equals(zzknVar.zzc) && zzb("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zzknVar.zza, zzknVar.zzb}) >= 25) {
                    return false;
                }
            } else if (zzb("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zzknVar.zza, zzknVar.zzb}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzknVar.zza);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, zzknVar.zzb);
        contentValues.put("name", zzknVar.zzc);
        contentValues.put("set_timestamp", Long.valueOf(zzknVar.zzd));
        zza(contentValues, "value", zzknVar.zze);
        try {
            if (c_().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                zzr().zzf().zza("Failed to insert/update user property (got -1). appId", zzew.zza(zzknVar.zza));
                return true;
            }
            return true;
        } catch (SQLiteException e) {
            zzr().zzf().zza("Error storing user property. appId", zzew.zza(zzknVar.zza), e);
            return true;
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0091: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:24:0x0091 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzkn zzc(java.lang.String r14, java.lang.String r15) {
        /*
            r13 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r14)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r15)
            r13.zzd()
            r13.zzak()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r13.c_()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r0 = 3
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r0 = "set_timestamp"
            r10 = 0
            r4[r10] = r0     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r0 = "value"
            r11 = 1
            r4[r11] = r0     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r0 = "origin"
            r12 = 2
            r4[r12] = r0     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String[] r6 = new java.lang.String[]{r14, r15}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r3 = "user_attributes"
            java.lang.String r5 = "app_id=? and name=?"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            boolean r0 = r2.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L90
            if (r0 != 0) goto L3c
            r2.close()
            return r1
        L3c:
            long r7 = r2.getLong(r10)     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L90
            java.lang.Object r9 = r13.zza(r2, r11)     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L90
            java.lang.String r5 = r2.getString(r12)     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L90
            com.google.android.gms.measurement.internal.zzkn r0 = new com.google.android.gms.measurement.internal.zzkn     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L90
            r3 = r0
            r4 = r14
            r6 = r15
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L90
            boolean r3 = r2.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L90
            if (r3 == 0) goto L67
            com.google.android.gms.measurement.internal.zzew r3 = r13.zzr()     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L90
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzf()     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L90
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzew.zza(r14)     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L90
            java.lang.String r5 = "Got multiple records for user property, expected one. appId"
            r3.zza(r5, r4)     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L90
        L67:
            r2.close()
            return r0
        L6b:
            r0 = move-exception
            goto L71
        L6d:
            r0 = move-exception
            goto L92
        L6f:
            r0 = move-exception
            r2 = r1
        L71:
            com.google.android.gms.measurement.internal.zzew r3 = r13.zzr()     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzf()     // Catch: java.lang.Throwable -> L90
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzew.zza(r14)     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.measurement.internal.zzeu r5 = r13.zzo()     // Catch: java.lang.Throwable -> L90
            java.lang.String r5 = r5.zzc(r15)     // Catch: java.lang.Throwable -> L90
            java.lang.String r6 = "Error querying user property. appId"
            r3.zza(r6, r4, r5, r0)     // Catch: java.lang.Throwable -> L90
            if (r2 == 0) goto L8f
            r2.close()
        L8f:
            return r1
        L90:
            r0 = move-exception
            r1 = r2
        L92:
            if (r1 == 0) goto L97
            r1.close()
        L97:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzac.zzc(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzkn");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzkn> zza(java.lang.String r17) {
        /*
            r16 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r17)
            r16.zzd()
            r16.zzak()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r16.c_()     // Catch: java.lang.Throwable -> L90 android.database.sqlite.SQLiteException -> L94
            r3 = 4
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L90 android.database.sqlite.SQLiteException -> L94
            java.lang.String r3 = "name"
            r11 = 0
            r4[r11] = r3     // Catch: java.lang.Throwable -> L90 android.database.sqlite.SQLiteException -> L94
            java.lang.String r3 = "origin"
            r12 = 1
            r4[r12] = r3     // Catch: java.lang.Throwable -> L90 android.database.sqlite.SQLiteException -> L94
            java.lang.String r3 = "set_timestamp"
            r13 = 2
            r4[r13] = r3     // Catch: java.lang.Throwable -> L90 android.database.sqlite.SQLiteException -> L94
            java.lang.String r3 = "value"
            r14 = 3
            r4[r14] = r3     // Catch: java.lang.Throwable -> L90 android.database.sqlite.SQLiteException -> L94
            java.lang.String[] r6 = new java.lang.String[]{r17}     // Catch: java.lang.Throwable -> L90 android.database.sqlite.SQLiteException -> L94
            java.lang.String r3 = "user_attributes"
            java.lang.String r5 = "app_id=?"
            r7 = 0
            r8 = 0
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L90 android.database.sqlite.SQLiteException -> L94
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L88 android.database.sqlite.SQLiteException -> L8c
            if (r3 != 0) goto L46
            r2.close()
            return r0
        L46:
            java.lang.String r7 = r2.getString(r11)     // Catch: java.lang.Throwable -> L88 android.database.sqlite.SQLiteException -> L8c
            java.lang.String r3 = r2.getString(r12)     // Catch: java.lang.Throwable -> L88 android.database.sqlite.SQLiteException -> L8c
            if (r3 != 0) goto L52
            java.lang.String r3 = ""
        L52:
            r6 = r3
            long r8 = r2.getLong(r13)     // Catch: java.lang.Throwable -> L88 android.database.sqlite.SQLiteException -> L8c
            r3 = r16
            java.lang.Object r10 = r3.zza(r2, r14)     // Catch: android.database.sqlite.SQLiteException -> L86 java.lang.Throwable -> Laf
            if (r10 != 0) goto L71
            com.google.android.gms.measurement.internal.zzew r4 = r16.zzr()     // Catch: android.database.sqlite.SQLiteException -> L86 java.lang.Throwable -> Laf
            com.google.android.gms.measurement.internal.zzey r4 = r4.zzf()     // Catch: android.database.sqlite.SQLiteException -> L86 java.lang.Throwable -> Laf
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzew.zza(r17)     // Catch: android.database.sqlite.SQLiteException -> L86 java.lang.Throwable -> Laf
            java.lang.String r6 = "Read invalid user property value, ignoring it. appId"
            r4.zza(r6, r5)     // Catch: android.database.sqlite.SQLiteException -> L86 java.lang.Throwable -> Laf
            goto L7c
        L71:
            com.google.android.gms.measurement.internal.zzkn r15 = new com.google.android.gms.measurement.internal.zzkn     // Catch: android.database.sqlite.SQLiteException -> L86 java.lang.Throwable -> Laf
            r4 = r15
            r5 = r17
            r4.<init>(r5, r6, r7, r8, r10)     // Catch: android.database.sqlite.SQLiteException -> L86 java.lang.Throwable -> Laf
            r0.add(r15)     // Catch: android.database.sqlite.SQLiteException -> L86 java.lang.Throwable -> Laf
        L7c:
            boolean r4 = r2.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L86 java.lang.Throwable -> Laf
            if (r4 != 0) goto L46
            r2.close()
            return r0
        L86:
            r0 = move-exception
            goto L98
        L88:
            r0 = move-exception
            r3 = r16
            goto Lb0
        L8c:
            r0 = move-exception
            r3 = r16
            goto L98
        L90:
            r0 = move-exception
            r3 = r16
            goto Lb1
        L94:
            r0 = move-exception
            r3 = r16
            r2 = r1
        L98:
            com.google.android.gms.measurement.internal.zzew r4 = r16.zzr()     // Catch: java.lang.Throwable -> Laf
            com.google.android.gms.measurement.internal.zzey r4 = r4.zzf()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r5 = "Error querying user properties. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzew.zza(r17)     // Catch: java.lang.Throwable -> Laf
            r4.zza(r5, r6, r0)     // Catch: java.lang.Throwable -> Laf
            if (r2 == 0) goto Lae
            r2.close()
        Lae:
            return r1
        Laf:
            r0 = move-exception
        Lb0:
            r1 = r2
        Lb1:
            if (r1 == 0) goto Lb6
            r1.close()
        Lb6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzac.zza(java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009d, code lost:
        zzr().zzf().zza("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzkn> zza(java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzac.zza(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final boolean zza(zzv zzvVar) {
        Preconditions.checkNotNull(zzvVar);
        zzd();
        zzak();
        if (zzc(zzvVar.zza, zzvVar.zzc.zza) != null || zzb("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{zzvVar.zza}) < 1000) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzvVar.zza);
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, zzvVar.zzb);
            contentValues.put("name", zzvVar.zzc.zza);
            zza(contentValues, "value", zzvVar.zzc.zza());
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(zzvVar.zze));
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzvVar.zzf);
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzvVar.zzh));
            zzp();
            contentValues.put("timed_out_event", zzkm.zza((Parcelable) zzvVar.zzg));
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzvVar.zzd));
            zzp();
            contentValues.put("triggered_event", zzkm.zza((Parcelable) zzvVar.zzi));
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzvVar.zzc.zzb));
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzvVar.zzj));
            zzp();
            contentValues.put("expired_event", zzkm.zza((Parcelable) zzvVar.zzk));
            try {
                if (c_().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                    zzr().zzf().zza("Failed to insert/update conditional user property (got -1)", zzew.zza(zzvVar.zza));
                    return true;
                }
                return true;
            } catch (SQLiteException e) {
                zzr().zzf().zza("Error storing conditional user property", zzew.zza(zzvVar.zza), e);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzv zzd(java.lang.String r37, java.lang.String r38) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzac.zzd(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzv");
    }

    public final int zze(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzd();
        zzak();
        try {
            return c_().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            zzr().zzf().zza("Error deleting conditional property", zzew.zza(str), zzo().zzc(str2), e);
            return 0;
        }
    }

    public final List<zzv> zzb(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzd();
        zzak();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return zza(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008b, code lost:
        zzr().zzf().zza("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzv> zza(java.lang.String r42, java.lang.String[] r43) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzac.zza(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0197 A[Catch: SQLiteException -> 0x026a, all -> 0x0293, TryCatch #1 {SQLiteException -> 0x026a, blocks: (B:10:0x00eb, B:12:0x0148, B:17:0x0152, B:21:0x019c, B:25:0x01d2, B:27:0x01dd, B:32:0x01e7, B:34:0x01f2, B:37:0x01f9, B:41:0x0214, B:43:0x021f, B:44:0x0231, B:46:0x0237, B:48:0x0243, B:49:0x024c, B:51:0x0255, B:40:0x0210, B:24:0x01ce, B:20:0x0197), top: B:73:0x00eb }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01ce A[Catch: SQLiteException -> 0x026a, all -> 0x0293, TryCatch #1 {SQLiteException -> 0x026a, blocks: (B:10:0x00eb, B:12:0x0148, B:17:0x0152, B:21:0x019c, B:25:0x01d2, B:27:0x01dd, B:32:0x01e7, B:34:0x01f2, B:37:0x01f9, B:41:0x0214, B:43:0x021f, B:44:0x0231, B:46:0x0237, B:48:0x0243, B:49:0x024c, B:51:0x0255, B:40:0x0210, B:24:0x01ce, B:20:0x0197), top: B:73:0x00eb }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01f2 A[Catch: SQLiteException -> 0x026a, all -> 0x0293, TryCatch #1 {SQLiteException -> 0x026a, blocks: (B:10:0x00eb, B:12:0x0148, B:17:0x0152, B:21:0x019c, B:25:0x01d2, B:27:0x01dd, B:32:0x01e7, B:34:0x01f2, B:37:0x01f9, B:41:0x0214, B:43:0x021f, B:44:0x0231, B:46:0x0237, B:48:0x0243, B:49:0x024c, B:51:0x0255, B:40:0x0210, B:24:0x01ce, B:20:0x0197), top: B:73:0x00eb }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0210 A[Catch: SQLiteException -> 0x026a, all -> 0x0293, TryCatch #1 {SQLiteException -> 0x026a, blocks: (B:10:0x00eb, B:12:0x0148, B:17:0x0152, B:21:0x019c, B:25:0x01d2, B:27:0x01dd, B:32:0x01e7, B:34:0x01f2, B:37:0x01f9, B:41:0x0214, B:43:0x021f, B:44:0x0231, B:46:0x0237, B:48:0x0243, B:49:0x024c, B:51:0x0255, B:40:0x0210, B:24:0x01ce, B:20:0x0197), top: B:73:0x00eb }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x021f A[Catch: SQLiteException -> 0x026a, all -> 0x0293, TryCatch #1 {SQLiteException -> 0x026a, blocks: (B:10:0x00eb, B:12:0x0148, B:17:0x0152, B:21:0x019c, B:25:0x01d2, B:27:0x01dd, B:32:0x01e7, B:34:0x01f2, B:37:0x01f9, B:41:0x0214, B:43:0x021f, B:44:0x0231, B:46:0x0237, B:48:0x0243, B:49:0x024c, B:51:0x0255, B:40:0x0210, B:24:0x01ce, B:20:0x0197), top: B:73:0x00eb }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0237 A[Catch: SQLiteException -> 0x026a, all -> 0x0293, TryCatch #1 {SQLiteException -> 0x026a, blocks: (B:10:0x00eb, B:12:0x0148, B:17:0x0152, B:21:0x019c, B:25:0x01d2, B:27:0x01dd, B:32:0x01e7, B:34:0x01f2, B:37:0x01f9, B:41:0x0214, B:43:0x021f, B:44:0x0231, B:46:0x0237, B:48:0x0243, B:49:0x024c, B:51:0x0255, B:40:0x0210, B:24:0x01ce, B:20:0x0197), top: B:73:0x00eb }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0255 A[Catch: SQLiteException -> 0x026a, all -> 0x0293, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x026a, blocks: (B:10:0x00eb, B:12:0x0148, B:17:0x0152, B:21:0x019c, B:25:0x01d2, B:27:0x01dd, B:32:0x01e7, B:34:0x01f2, B:37:0x01f9, B:41:0x0214, B:43:0x021f, B:44:0x0231, B:46:0x0237, B:48:0x0243, B:49:0x024c, B:51:0x0255, B:40:0x0210, B:24:0x01ce, B:20:0x0197), top: B:73:0x00eb }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0297  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzg zzb(java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 667
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzac.zzb(java.lang.String):com.google.android.gms.measurement.internal.zzg");
    }

    public final void zza(zzg zzgVar) {
        Preconditions.checkNotNull(zzgVar);
        zzd();
        zzak();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzgVar.zzc());
        contentValues.put("app_instance_id", zzgVar.zzd());
        contentValues.put("gmp_app_id", zzgVar.zze());
        contentValues.put("resettable_device_id_hash", zzgVar.zzh());
        contentValues.put("last_bundle_index", Long.valueOf(zzgVar.zzs()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzgVar.zzj()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzgVar.zzk()));
        contentValues.put("app_version", zzgVar.zzl());
        contentValues.put("app_store", zzgVar.zzn());
        contentValues.put("gmp_version", Long.valueOf(zzgVar.zzo()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzgVar.zzp()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzgVar.zzr()));
        contentValues.put(SignupConstants.Field.DEMO_COLLECT_BIRTH_DAY, Long.valueOf(zzgVar.zzw()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzgVar.zzx()));
        contentValues.put("daily_events_count", Long.valueOf(zzgVar.zzy()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzgVar.zzz()));
        contentValues.put("config_fetched_time", Long.valueOf(zzgVar.zzt()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzgVar.zzu()));
        contentValues.put("app_version_int", Long.valueOf(zzgVar.zzm()));
        contentValues.put("firebase_instance_id", zzgVar.zzi());
        contentValues.put("daily_error_events_count", Long.valueOf(zzgVar.zzab()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzgVar.zzaa()));
        contentValues.put("health_monitor_sample", zzgVar.zzac());
        contentValues.put("android_id", Long.valueOf(zzgVar.zzae()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzgVar.zzaf()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(zzgVar.zzag()));
        contentValues.put("admob_app_id", zzgVar.zzf());
        contentValues.put("dynamite_version", Long.valueOf(zzgVar.zzq()));
        if (zzgVar.zzai() != null) {
            if (zzgVar.zzai().size() == 0) {
                zzr().zzi().zza("Safelisted events should not be an empty list. appId", zzgVar.zzc());
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", zzgVar.zzai()));
            }
        }
        if (zzle.zzb() && zzt().zze(zzgVar.zzc(), zzap.zzcc)) {
            contentValues.put("ga_app_id", zzgVar.zzg());
        }
        try {
            SQLiteDatabase c_ = c_();
            if (c_.update("apps", contentValues, "app_id = ?", new String[]{zzgVar.zzc()}) == 0 && c_.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                zzr().zzf().zza("Failed to insert/update app (got -1). appId", zzew.zza(zzgVar.zzc()));
            }
        } catch (SQLiteException e) {
            zzr().zzf().zza("Error storing app. appId", zzew.zza(zzgVar.zzc()), e);
        }
    }

    public final long zzc(String str) {
        Preconditions.checkNotEmpty(str);
        zzd();
        zzak();
        try {
            return c_().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min((int) Prefetch.NANOSECONDS_PER_MILLISECOND, zzt().zzb(str, zzap.zzp))))});
        } catch (SQLiteException e) {
            zzr().zzf().zza("Error deleting over the limit events. appId", zzew.zza(str), e);
            return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzab zza(long r24, java.lang.String r26, boolean r27, boolean r28, boolean r29, boolean r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzac.zza(long, java.lang.String, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.measurement.internal.zzab");
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x006d: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:24:0x006d */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] zzd(java.lang.String r11) {
        /*
            r10 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r11)
            r10.zzd()
            r10.zzak()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.c_()     // Catch: java.lang.Throwable -> L50 android.database.sqlite.SQLiteException -> L52
            r2 = 1
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L50 android.database.sqlite.SQLiteException -> L52
            java.lang.String r2 = "remote_config"
            r9 = 0
            r3[r9] = r2     // Catch: java.lang.Throwable -> L50 android.database.sqlite.SQLiteException -> L52
            java.lang.String[] r5 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> L50 android.database.sqlite.SQLiteException -> L52
            java.lang.String r2 = "apps"
            java.lang.String r4 = "app_id=?"
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L50 android.database.sqlite.SQLiteException -> L52
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L4e java.lang.Throwable -> L6c
            if (r2 != 0) goto L2f
            r1.close()
            return r0
        L2f:
            byte[] r2 = r1.getBlob(r9)     // Catch: android.database.sqlite.SQLiteException -> L4e java.lang.Throwable -> L6c
            boolean r3 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L4e java.lang.Throwable -> L6c
            if (r3 == 0) goto L4a
            com.google.android.gms.measurement.internal.zzew r3 = r10.zzr()     // Catch: android.database.sqlite.SQLiteException -> L4e java.lang.Throwable -> L6c
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzf()     // Catch: android.database.sqlite.SQLiteException -> L4e java.lang.Throwable -> L6c
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzew.zza(r11)     // Catch: android.database.sqlite.SQLiteException -> L4e java.lang.Throwable -> L6c
            java.lang.String r5 = "Got multiple records for app config, expected one. appId"
            r3.zza(r5, r4)     // Catch: android.database.sqlite.SQLiteException -> L4e java.lang.Throwable -> L6c
        L4a:
            r1.close()
            return r2
        L4e:
            r2 = move-exception
            goto L55
        L50:
            r11 = move-exception
            goto L6e
        L52:
            r1 = move-exception
            r2 = r1
            r1 = r0
        L55:
            com.google.android.gms.measurement.internal.zzew r3 = r10.zzr()     // Catch: java.lang.Throwable -> L6c
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzf()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzew.zza(r11)     // Catch: java.lang.Throwable -> L6c
            r3.zza(r4, r11, r2)     // Catch: java.lang.Throwable -> L6c
            if (r1 == 0) goto L6b
            r1.close()
        L6b:
            return r0
        L6c:
            r11 = move-exception
            r0 = r1
        L6e:
            if (r0 == 0) goto L73
            r0.close()
        L73:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzac.zzd(java.lang.String):byte[]");
    }

    public final boolean zza(zzbr.zzg zzgVar, boolean z) {
        zzd();
        zzak();
        Preconditions.checkNotNull(zzgVar);
        Preconditions.checkNotEmpty(zzgVar.zzx());
        Preconditions.checkState(zzgVar.zzk());
        zzv();
        long currentTimeMillis = zzm().currentTimeMillis();
        if (zzgVar.zzl() < currentTimeMillis - zzx.zzj() || zzgVar.zzl() > zzx.zzj() + currentTimeMillis) {
            zzr().zzi().zza("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzew.zza(zzgVar.zzx()), Long.valueOf(currentTimeMillis), Long.valueOf(zzgVar.zzl()));
        }
        try {
            byte[] zzc2 = zzg().zzc(zzgVar.zzbi());
            zzr().zzx().zza("Saving bundle, size", Integer.valueOf(zzc2.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzgVar.zzx());
            contentValues.put("bundle_end_timestamp", Long.valueOf(zzgVar.zzl()));
            contentValues.put(NotificationFactory.DATA, zzc2);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (zzgVar.zzaz()) {
                contentValues.put("retry_count", Integer.valueOf(zzgVar.zzba()));
            }
            try {
                if (c_().insert("queue", null, contentValues) == -1) {
                    zzr().zzf().zza("Failed to insert bundle (got -1). appId", zzew.zza(zzgVar.zzx()));
                    return false;
                }
                return true;
            } catch (SQLiteException e) {
                zzr().zzf().zza("Error storing bundle. appId", zzew.zza(zzgVar.zzx()), e);
                return false;
            }
        } catch (IOException e2) {
            zzr().zzf().zza("Data loss. Failed to serialize bundle. appId", zzew.zza(zzgVar.zzx()), e2);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String d_() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.c_()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L24
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1e android.database.sqlite.SQLiteException -> L20
            if (r2 == 0) goto L1a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1e android.database.sqlite.SQLiteException -> L20
            r0.close()
            return r1
        L1a:
            r0.close()
            return r1
        L1e:
            r1 = move-exception
            goto L3a
        L20:
            r2 = move-exception
            goto L27
        L22:
            r0 = move-exception
            goto L3d
        L24:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L27:
            com.google.android.gms.measurement.internal.zzew r3 = r6.zzr()     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzf()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.zza(r4, r2)     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L39
            r0.close()
        L39:
            return r1
        L3a:
            r5 = r1
            r1 = r0
            r0 = r5
        L3d:
            if (r1 == 0) goto L42
            r1.close()
        L42:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzac.d_():java.lang.String");
    }

    public final boolean zzk() {
        return zzb("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    public final List<Pair<zzbr.zzg, Long>> zza(String str, int i, int i2) {
        byte[] zzb2;
        zzd();
        zzak();
        Preconditions.checkArgument(i > 0);
        Preconditions.checkArgument(i2 > 0);
        Preconditions.checkNotEmpty(str);
        Cursor cursor = null;
        try {
            try {
                Cursor query = c_().query("queue", new String[]{"rowid", NotificationFactory.DATA, "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i));
                if (!query.moveToFirst()) {
                    List<Pair<zzbr.zzg, Long>> emptyList = Collections.emptyList();
                    query.close();
                    return emptyList;
                }
                ArrayList arrayList = new ArrayList();
                int i3 = 0;
                do {
                    long j = query.getLong(0);
                    try {
                        zzb2 = zzg().zzb(query.getBlob(1));
                    } catch (IOException e) {
                        zzr().zzf().zza("Failed to unzip queued bundle. appId", zzew.zza(str), e);
                    }
                    if (!arrayList.isEmpty() && zzb2.length + i3 > i2) {
                        break;
                    }
                    try {
                        zzbr.zzg.zza zzaVar = (zzbr.zzg.zza) zzki.zza(zzbr.zzg.zzbf(), zzb2);
                        if (!query.isNull(2)) {
                            zzaVar.zzi(query.getInt(2));
                        }
                        i3 += zzb2.length;
                        arrayList.add(Pair.create((zzbr.zzg) ((com.google.android.gms.internal.measurement.zzfd) zzaVar.zzu()), Long.valueOf(j)));
                    } catch (IOException e2) {
                        zzr().zzf().zza("Failed to merge queued bundle. appId", zzew.zza(str), e2);
                    }
                    if (!query.moveToNext()) {
                        break;
                    }
                } while (i3 <= i2);
                query.close();
                return arrayList;
            } catch (SQLiteException e3) {
                zzr().zzf().zza("Error querying bundles. appId", zzew.zza(str), e3);
                List<Pair<zzbr.zzg, Long>> emptyList2 = Collections.emptyList();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyList2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzv() {
        zzd();
        zzak();
        if (zzam()) {
            long zza = zzs().zzf.zza();
            long elapsedRealtime = zzm().elapsedRealtime();
            if (Math.abs(elapsedRealtime - zza) > zzap.zzy.zza(null).longValue()) {
                zzs().zzf.zza(elapsedRealtime);
                zzd();
                zzak();
                if (zzam()) {
                    int delete = c_().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(zzm().currentTimeMillis()), String.valueOf(zzx.zzj())});
                    if (delete > 0) {
                        zzr().zzx().zza("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final void zza(List<Long> list) {
        zzd();
        zzak();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzam()) {
            String join = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 80);
            sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb3.append(sb2);
            sb3.append(" AND retry_count =  2147483647 LIMIT 1");
            if (zzb(sb3.toString(), (String[]) null) > 0) {
                zzr().zzi().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase c_ = c_();
                StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 127);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(sb2);
                sb4.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                c_.execSQL(sb4.toString());
            } catch (SQLiteException e) {
                zzr().zzf().zza("Error incrementing retry count. error", e);
            }
        }
    }

    private final boolean zza(String str, int i, zzbj.zzb zzbVar) {
        zzak();
        zzd();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzbVar);
        if (TextUtils.isEmpty(zzbVar.zzc())) {
            zzr().zzi().zza("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", zzew.zza(str), Integer.valueOf(i), String.valueOf(zzbVar.zza() ? Integer.valueOf(zzbVar.zzb()) : null));
            return false;
        }
        byte[] zzbi = zzbVar.zzbi();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", zzbVar.zza() ? Integer.valueOf(zzbVar.zzb()) : null);
        contentValues.put("event_name", zzbVar.zzc());
        if (zzt().zze(str, zzap.zzbl)) {
            contentValues.put("session_scoped", zzbVar.zzj() ? Boolean.valueOf(zzbVar.zzk()) : null);
        }
        contentValues.put(NotificationFactory.DATA, zzbi);
        try {
            if (c_().insertWithOnConflict("event_filters", null, contentValues, 5) == -1) {
                zzr().zzf().zza("Failed to insert event filter (got -1). appId", zzew.zza(str));
                return true;
            }
            return true;
        } catch (SQLiteException e) {
            zzr().zzf().zza("Error storing event filter. appId", zzew.zza(str), e);
            return false;
        }
    }

    private final boolean zza(String str, int i, zzbj.zze zzeVar) {
        zzak();
        zzd();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzeVar);
        if (TextUtils.isEmpty(zzeVar.zzc())) {
            zzr().zzi().zza("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", zzew.zza(str), Integer.valueOf(i), String.valueOf(zzeVar.zza() ? Integer.valueOf(zzeVar.zzb()) : null));
            return false;
        }
        byte[] zzbi = zzeVar.zzbi();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", zzeVar.zza() ? Integer.valueOf(zzeVar.zzb()) : null);
        contentValues.put("property_name", zzeVar.zzc());
        if (zzt().zze(str, zzap.zzbl)) {
            contentValues.put("session_scoped", zzeVar.zzg() ? Boolean.valueOf(zzeVar.zzh()) : null);
        }
        contentValues.put(NotificationFactory.DATA, zzbi);
        try {
            if (c_().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                zzr().zzf().zza("Failed to insert property filter (got -1). appId", zzew.zza(str));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            zzr().zzf().zza("Error storing property filter. appId", zzew.zza(str), e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.zzbj.zzb>> zzf(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.zzak()
            r12.zzd()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r13)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r14)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.c_()
            r2 = 2
            r9 = 0
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            java.lang.String r2 = "audience_id"
            r10 = 0
            r3[r10] = r2     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            java.lang.String r2 = "data"
            r11 = 1
            r3[r11] = r2     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            java.lang.String[] r5 = new java.lang.String[]{r13, r14}     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            java.lang.String r2 = "event_filters"
            java.lang.String r4 = "app_id=? AND event_name=?"
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            boolean r1 = r14.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            if (r1 != 0) goto L40
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            r14.close()
            return r13
        L40:
            byte[] r1 = r14.getBlob(r11)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            com.google.android.gms.internal.measurement.zzbj$zzb$zza r2 = com.google.android.gms.internal.measurement.zzbj.zzb.zzl()     // Catch: java.io.IOException -> L76 android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            com.google.android.gms.internal.measurement.zzgn r1 = com.google.android.gms.measurement.internal.zzki.zza(r2, r1)     // Catch: java.io.IOException -> L76 android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            com.google.android.gms.internal.measurement.zzbj$zzb$zza r1 = (com.google.android.gms.internal.measurement.zzbj.zzb.zza) r1     // Catch: java.io.IOException -> L76 android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            com.google.android.gms.internal.measurement.zzgo r1 = r1.zzu()     // Catch: java.io.IOException -> L76 android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            com.google.android.gms.internal.measurement.zzfd r1 = (com.google.android.gms.internal.measurement.zzfd) r1     // Catch: java.io.IOException -> L76 android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            com.google.android.gms.internal.measurement.zzbj$zzb r1 = (com.google.android.gms.internal.measurement.zzbj.zzb) r1     // Catch: java.io.IOException -> L76 android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            int r2 = r14.getInt(r10)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            java.lang.Object r3 = r0.get(r3)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            java.util.List r3 = (java.util.List) r3     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            if (r3 != 0) goto L72
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            r3.<init>()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            r0.put(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
        L72:
            r3.add(r1)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            goto L88
        L76:
            r1 = move-exception
            com.google.android.gms.measurement.internal.zzew r2 = r12.zzr()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzf()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            java.lang.String r3 = "Failed to merge filter. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzew.zza(r13)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            r2.zza(r3, r4, r1)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
        L88:
            boolean r1 = r14.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            if (r1 != 0) goto L40
            r14.close()
            return r0
        L92:
            r0 = move-exception
            goto L99
        L94:
            r13 = move-exception
            goto Lb2
        L96:
            r14 = move-exception
            r0 = r14
            r14 = r9
        L99:
            com.google.android.gms.measurement.internal.zzew r1 = r12.zzr()     // Catch: java.lang.Throwable -> Lb0
            com.google.android.gms.measurement.internal.zzey r1 = r1.zzf()     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzew.zza(r13)     // Catch: java.lang.Throwable -> Lb0
            r1.zza(r2, r13, r0)     // Catch: java.lang.Throwable -> Lb0
            if (r14 == 0) goto Laf
            r14.close()
        Laf:
            return r9
        Lb0:
            r13 = move-exception
            r9 = r14
        Lb2:
            if (r9 == 0) goto Lb7
            r9.close()
        Lb7:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzac.zzf(java.lang.String, java.lang.String):java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.zzbj.zze>> zzg(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.zzak()
            r12.zzd()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r13)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r14)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.c_()
            r2 = 2
            r9 = 0
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            java.lang.String r2 = "audience_id"
            r10 = 0
            r3[r10] = r2     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            java.lang.String r2 = "data"
            r11 = 1
            r3[r11] = r2     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            java.lang.String[] r5 = new java.lang.String[]{r13, r14}     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            java.lang.String r2 = "property_filters"
            java.lang.String r4 = "app_id=? AND property_name=?"
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            boolean r1 = r14.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            if (r1 != 0) goto L40
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            r14.close()
            return r13
        L40:
            byte[] r1 = r14.getBlob(r11)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            com.google.android.gms.internal.measurement.zzbj$zze$zza r2 = com.google.android.gms.internal.measurement.zzbj.zze.zzi()     // Catch: java.io.IOException -> L76 android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            com.google.android.gms.internal.measurement.zzgn r1 = com.google.android.gms.measurement.internal.zzki.zza(r2, r1)     // Catch: java.io.IOException -> L76 android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            com.google.android.gms.internal.measurement.zzbj$zze$zza r1 = (com.google.android.gms.internal.measurement.zzbj.zze.zza) r1     // Catch: java.io.IOException -> L76 android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            com.google.android.gms.internal.measurement.zzgo r1 = r1.zzu()     // Catch: java.io.IOException -> L76 android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            com.google.android.gms.internal.measurement.zzfd r1 = (com.google.android.gms.internal.measurement.zzfd) r1     // Catch: java.io.IOException -> L76 android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            com.google.android.gms.internal.measurement.zzbj$zze r1 = (com.google.android.gms.internal.measurement.zzbj.zze) r1     // Catch: java.io.IOException -> L76 android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            int r2 = r14.getInt(r10)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            java.lang.Object r3 = r0.get(r3)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            java.util.List r3 = (java.util.List) r3     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            if (r3 != 0) goto L72
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            r3.<init>()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            r0.put(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
        L72:
            r3.add(r1)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            goto L88
        L76:
            r1 = move-exception
            com.google.android.gms.measurement.internal.zzew r2 = r12.zzr()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzf()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            java.lang.String r3 = "Failed to merge filter"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzew.zza(r13)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            r2.zza(r3, r4, r1)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
        L88:
            boolean r1 = r14.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Lb0
            if (r1 != 0) goto L40
            r14.close()
            return r0
        L92:
            r0 = move-exception
            goto L99
        L94:
            r13 = move-exception
            goto Lb2
        L96:
            r14 = move-exception
            r0 = r14
            r14 = r9
        L99:
            com.google.android.gms.measurement.internal.zzew r1 = r12.zzr()     // Catch: java.lang.Throwable -> Lb0
            com.google.android.gms.measurement.internal.zzey r1 = r1.zzf()     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzew.zza(r13)     // Catch: java.lang.Throwable -> Lb0
            r1.zza(r2, r13, r0)     // Catch: java.lang.Throwable -> Lb0
            if (r14 == 0) goto Laf
            r14.close()
        Laf:
            return r9
        Lb0:
            r13 = move-exception
            r9 = r14
        Lb2:
            if (r9 == 0) goto Lb7
            r9.close()
        Lb7:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzac.zzg(java.lang.String, java.lang.String):java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> zza(java.lang.String r16, java.util.List<java.lang.String> r17) {
        /*
            r15 = this;
            r15.zzak()
            r15.zzd()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r16)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r17)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            boolean r1 = r17.isEmpty()
            if (r1 == 0) goto L18
            return r0
        L18:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "app_id=? AND property_name in ("
            r1.append(r2)
            r2 = 0
            r3 = r2
        L24:
            int r4 = r17.size()
            if (r3 >= r4) goto L39
            if (r3 <= 0) goto L31
            java.lang.String r4 = ","
            r1.append(r4)
        L31:
            java.lang.String r4 = "?"
            r1.append(r4)
            int r3 = r3 + 1
            goto L24
        L39:
            java.lang.String r3 = ")"
            r1.append(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = r17
            r3.<init>(r4)
            r4 = r16
            r3.add(r2, r4)
            android.database.sqlite.SQLiteDatabase r5 = r15.c_()
            r6 = 2
            r13 = 0
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> Lae android.database.sqlite.SQLiteException -> Lb0
            java.lang.String r6 = "audience_id"
            r7[r2] = r6     // Catch: java.lang.Throwable -> Lae android.database.sqlite.SQLiteException -> Lb0
            java.lang.String r6 = "filter_id"
            r14 = 1
            r7[r14] = r6     // Catch: java.lang.Throwable -> Lae android.database.sqlite.SQLiteException -> Lb0
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> Lae android.database.sqlite.SQLiteException -> Lb0
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> Lae android.database.sqlite.SQLiteException -> Lb0
            java.lang.Object[] r1 = r3.toArray(r1)     // Catch: java.lang.Throwable -> Lae android.database.sqlite.SQLiteException -> Lb0
            r9 = r1
            java.lang.String[] r9 = (java.lang.String[]) r9     // Catch: java.lang.Throwable -> Lae android.database.sqlite.SQLiteException -> Lb0
            java.lang.String r6 = "property_filters"
            r10 = 0
            r11 = 0
            r12 = 0
            android.database.Cursor r1 = r5.query(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Lae android.database.sqlite.SQLiteException -> Lb0
            boolean r3 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
            if (r3 != 0) goto L7b
            r1.close()
            return r0
        L7b:
            int r3 = r1.getInt(r2)     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
            java.lang.Object r5 = r0.get(r5)     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
            java.util.List r5 = (java.util.List) r5     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
            if (r5 != 0) goto L97
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
            r5.<init>()     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
            r0.put(r3, r5)     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
        L97:
            int r3 = r1.getInt(r14)     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
            r5.add(r3)     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
            boolean r3 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
            if (r3 != 0) goto L7b
            r1.close()
            return r0
        Lac:
            r0 = move-exception
            goto Lb2
        Lae:
            r0 = move-exception
            goto Lcb
        Lb0:
            r0 = move-exception
            r1 = r13
        Lb2:
            com.google.android.gms.measurement.internal.zzew r2 = r15.zzr()     // Catch: java.lang.Throwable -> Lc9
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzf()     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r3 = "Database error querying filters. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzew.zza(r16)     // Catch: java.lang.Throwable -> Lc9
            r2.zza(r3, r4, r0)     // Catch: java.lang.Throwable -> Lc9
            if (r1 == 0) goto Lc8
            r1.close()
        Lc8:
            return r13
        Lc9:
            r0 = move-exception
            r13 = r1
        Lcb:
            if (r13 == 0) goto Ld0
            r13.close()
        Ld0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzac.zza(java.lang.String, java.util.List):java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> zze(java.lang.String r6) {
        /*
            r5 = this;
            r5.zzak()
            r5.zzd()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r6)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r5.c_()
            r2 = 0
            java.lang.String[] r3 = new java.lang.String[]{r6, r6}     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L62
            java.lang.String r4 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            android.database.Cursor r1 = r1.rawQuery(r4, r3)     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L62
            boolean r3 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L5e java.lang.Throwable -> L7b
            if (r3 != 0) goto L2b
            java.util.Map r6 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L5e java.lang.Throwable -> L7b
            r1.close()
            return r6
        L2b:
            r3 = 0
            int r3 = r1.getInt(r3)     // Catch: android.database.sqlite.SQLiteException -> L5e java.lang.Throwable -> L7b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L5e java.lang.Throwable -> L7b
            java.lang.Object r4 = r0.get(r4)     // Catch: android.database.sqlite.SQLiteException -> L5e java.lang.Throwable -> L7b
            java.util.List r4 = (java.util.List) r4     // Catch: android.database.sqlite.SQLiteException -> L5e java.lang.Throwable -> L7b
            if (r4 != 0) goto L48
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L5e java.lang.Throwable -> L7b
            r4.<init>()     // Catch: android.database.sqlite.SQLiteException -> L5e java.lang.Throwable -> L7b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L5e java.lang.Throwable -> L7b
            r0.put(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L5e java.lang.Throwable -> L7b
        L48:
            r3 = 1
            int r3 = r1.getInt(r3)     // Catch: android.database.sqlite.SQLiteException -> L5e java.lang.Throwable -> L7b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L5e java.lang.Throwable -> L7b
            r4.add(r3)     // Catch: android.database.sqlite.SQLiteException -> L5e java.lang.Throwable -> L7b
            boolean r3 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L5e java.lang.Throwable -> L7b
            if (r3 != 0) goto L2b
            r1.close()
            return r0
        L5e:
            r0 = move-exception
            goto L64
        L60:
            r6 = move-exception
            goto L7d
        L62:
            r0 = move-exception
            r1 = r2
        L64:
            com.google.android.gms.measurement.internal.zzew r3 = r5.zzr()     // Catch: java.lang.Throwable -> L7b
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzf()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r4 = "Database error querying scoped filters. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzew.zza(r6)     // Catch: java.lang.Throwable -> L7b
            r3.zza(r4, r6, r0)     // Catch: java.lang.Throwable -> L7b
            if (r1 == 0) goto L7a
            r1.close()
        L7a:
            return r2
        L7b:
            r6 = move-exception
            r2 = r1
        L7d:
            if (r2 == 0) goto L82
            r2.close()
        L82:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzac.zze(java.lang.String):java.util.Map");
    }

    private final boolean zzc(String str, List<Integer> list) {
        Preconditions.checkNotEmpty(str);
        zzak();
        zzd();
        SQLiteDatabase c_ = c_();
        try {
            long zzb2 = zzb("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, zzt().zzb(str, zzap.zzaf)));
            if (zzb2 <= max) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Integer num = list.get(i);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String join = TextUtils.join(",", arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 140);
            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb3.append(sb2);
            sb3.append(" order by rowid desc limit -1 offset ?)");
            return c_.delete("audience_filter_values", sb3.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e) {
            zzr().zzf().zza("Database error querying filters. appId", zzew.zza(str), e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.Integer, com.google.android.gms.internal.measurement.zzbr.zzi> zzf(java.lang.String r12) {
        /*
            r11 = this;
            r11.zzak()
            r11.zzd()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r12)
            android.database.sqlite.SQLiteDatabase r0 = r11.c_()
            r1 = 2
            r8 = 0
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L7d android.database.sqlite.SQLiteException -> L7f
            java.lang.String r1 = "audience_id"
            r9 = 0
            r2[r9] = r1     // Catch: java.lang.Throwable -> L7d android.database.sqlite.SQLiteException -> L7f
            java.lang.String r1 = "current_results"
            r10 = 1
            r2[r10] = r1     // Catch: java.lang.Throwable -> L7d android.database.sqlite.SQLiteException -> L7f
            java.lang.String[] r4 = new java.lang.String[]{r12}     // Catch: java.lang.Throwable -> L7d android.database.sqlite.SQLiteException -> L7f
            java.lang.String r1 = "audience_filter_values"
            java.lang.String r3 = "app_id=?"
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L7d android.database.sqlite.SQLiteException -> L7f
            boolean r1 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L99
            if (r1 != 0) goto L34
            r0.close()
            return r8
        L34:
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L99
            r1.<init>()     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L99
        L39:
            int r2 = r0.getInt(r9)     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L99
            byte[] r3 = r0.getBlob(r10)     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L99
            com.google.android.gms.internal.measurement.zzbr$zzi$zza r4 = com.google.android.gms.internal.measurement.zzbr.zzi.zzi()     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L99
            com.google.android.gms.internal.measurement.zzgn r3 = com.google.android.gms.measurement.internal.zzki.zza(r4, r3)     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L99
            com.google.android.gms.internal.measurement.zzbr$zzi$zza r3 = (com.google.android.gms.internal.measurement.zzbr.zzi.zza) r3     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L99
            com.google.android.gms.internal.measurement.zzgo r3 = r3.zzu()     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L99
            com.google.android.gms.internal.measurement.zzfd r3 = (com.google.android.gms.internal.measurement.zzfd) r3     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L99
            com.google.android.gms.internal.measurement.zzbr$zzi r3 = (com.google.android.gms.internal.measurement.zzbr.zzi) r3     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L99
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L99
            r1.put(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L99
            goto L71
        L5b:
            r3 = move-exception
            com.google.android.gms.measurement.internal.zzew r4 = r11.zzr()     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L99
            com.google.android.gms.measurement.internal.zzey r4 = r4.zzf()     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L99
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzew.zza(r12)     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L99
            java.lang.String r6 = "Failed to merge filter results. appId, audienceId, error"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L99
            r4.zza(r6, r5, r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L99
        L71:
            boolean r2 = r0.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L99
            if (r2 != 0) goto L39
            r0.close()
            return r1
        L7b:
            r1 = move-exception
            goto L82
        L7d:
            r12 = move-exception
            goto L9b
        L7f:
            r0 = move-exception
            r1 = r0
            r0 = r8
        L82:
            com.google.android.gms.measurement.internal.zzew r2 = r11.zzr()     // Catch: java.lang.Throwable -> L99
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzf()     // Catch: java.lang.Throwable -> L99
            java.lang.String r3 = "Database error querying filter results. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzew.zza(r12)     // Catch: java.lang.Throwable -> L99
            r2.zza(r3, r12, r1)     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto L98
            r0.close()
        L98:
            return r8
        L99:
            r12 = move-exception
            r8 = r0
        L9b:
            if (r8 == 0) goto La0
            r8.close()
        La0:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzac.zzf(java.lang.String):java.util.Map");
    }

    private static void zza(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    @VisibleForTesting
    private final Object zza(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            zzr().zzf().zza("Loaded invalid null value from database");
            return null;
        } else if (type != 1) {
            if (type != 2) {
                if (type != 3) {
                    if (type == 4) {
                        zzr().zzf().zza("Loaded invalid blob type value, ignoring it");
                        return null;
                    }
                    zzr().zzf().zza("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                    return null;
                }
                return cursor.getString(i);
            }
            return Double.valueOf(cursor.getDouble(i));
        } else {
            return Long.valueOf(cursor.getLong(i));
        }
    }

    public final long zzw() {
        return zza("select max(bundle_end_timestamp) from queue", (String[]) null, 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @VisibleForTesting
    public final long zzh(String str, String str2) {
        SQLiteException e;
        long j;
        ContentValues contentValues;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzd();
        zzak();
        SQLiteDatabase c_ = c_();
        c_.beginTransaction();
        try {
            try {
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 32);
                sb.append("select ");
                sb.append(str2);
                sb.append(" from app2 where app_id=?");
                j = zza(sb.toString(), new String[]{str}, -1L);
                if (j == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (c_.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        zzr().zzf().zza("Failed to insert column (got -1). appId", zzew.zza(str), str2);
                        return -1L;
                    }
                    j = 0;
                }
                try {
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put(str2, Long.valueOf(1 + j));
                } catch (SQLiteException e2) {
                    e = e2;
                    zzr().zzf().zza("Error inserting column. appId", zzew.zza(str), str2, e);
                    return j;
                }
            } catch (SQLiteException e3) {
                e = e3;
                j = 0;
            }
            if (c_.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                zzr().zzf().zza("Failed to update column (got 0). appId", zzew.zza(str), str2);
                return -1L;
            }
            c_.setTransactionSuccessful();
            return j;
        } finally {
            c_.endTransaction();
        }
    }

    public final long zzx() {
        return zza("select max(timestamp) from raw_events", (String[]) null, 0L);
    }

    public final long zza(zzbr.zzg zzgVar) {
        zzd();
        zzak();
        Preconditions.checkNotNull(zzgVar);
        Preconditions.checkNotEmpty(zzgVar.zzx());
        byte[] zzbi = zzgVar.zzbi();
        long zza = zzg().zza(zzbi);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzgVar.zzx());
        contentValues.put("metadata_fingerprint", Long.valueOf(zza));
        contentValues.put("metadata", zzbi);
        try {
            c_().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return zza;
        } catch (SQLiteException e) {
            zzr().zzf().zza("Error storing raw event metadata. appId", zzew.zza(zzgVar.zzx()), e);
            throw e;
        }
    }

    public final boolean zzy() {
        return zzb("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    public final boolean zzz() {
        return zzb("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    public final long zzg(String str) {
        Preconditions.checkNotEmpty(str);
        return zza("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String zza(long r4) {
        /*
            r3 = this;
            r3.zzd()
            r3.zzak()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r3.c_()     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            r5 = 0
            r2[r5] = r4     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String r4 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            android.database.Cursor r4 = r1.rawQuery(r4, r2)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            boolean r1 = r4.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L54
            if (r1 != 0) goto L32
            com.google.android.gms.measurement.internal.zzew r5 = r3.zzr()     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L54
            com.google.android.gms.measurement.internal.zzey r5 = r5.zzx()     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L54
            java.lang.String r1 = "No expired configs for apps with pending events"
            r5.zza(r1)     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L54
            r4.close()
            return r0
        L32:
            java.lang.String r5 = r4.getString(r5)     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L54
            r4.close()
            return r5
        L3a:
            r5 = move-exception
            goto L41
        L3c:
            r4 = move-exception
            goto L57
        L3e:
            r4 = move-exception
            r5 = r4
            r4 = r0
        L41:
            com.google.android.gms.measurement.internal.zzew r1 = r3.zzr()     // Catch: java.lang.Throwable -> L54
            com.google.android.gms.measurement.internal.zzey r1 = r1.zzf()     // Catch: java.lang.Throwable -> L54
            java.lang.String r2 = "Error selecting expired configs"
            r1.zza(r2, r5)     // Catch: java.lang.Throwable -> L54
            if (r4 == 0) goto L53
            r4.close()
        L53:
            return r0
        L54:
            r5 = move-exception
            r0 = r4
            r4 = r5
        L57:
            if (r0 == 0) goto L5c
            r0.close()
        L5c:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzac.zza(long):java.lang.String");
    }

    public final long zzaa() {
        Cursor cursor = null;
        try {
            try {
                cursor = c_().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return -1L;
                }
                long j = cursor.getLong(0);
                cursor.close();
                return j;
            } catch (SQLiteException e) {
                zzr().zzf().zza("Error querying raw events", e);
                if (cursor != null) {
                    cursor.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x008b: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:29:0x008b */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair<com.google.android.gms.internal.measurement.zzbr.zzc, java.lang.Long> zza(java.lang.String r7, java.lang.Long r8) {
        /*
            r6 = this;
            r6.zzd()
            r6.zzak()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r6.c_()     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            r3 = 0
            r2[r3] = r7     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String r4 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            r5 = 1
            r2[r5] = r4     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String r4 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            android.database.Cursor r1 = r1.rawQuery(r4, r2)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            if (r2 != 0) goto L35
            com.google.android.gms.measurement.internal.zzew r7 = r6.zzr()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.measurement.internal.zzey r7 = r7.zzx()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            java.lang.String r8 = "Main event not found"
            r7.zza(r8)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            r1.close()
            return r0
        L35:
            byte[] r2 = r1.getBlob(r3)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            long r3 = r1.getLong(r5)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.zzbr$zzc$zza r5 = com.google.android.gms.internal.measurement.zzbr.zzc.zzj()     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.zzgn r2 = com.google.android.gms.measurement.internal.zzki.zza(r5, r2)     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.zzbr$zzc$zza r2 = (com.google.android.gms.internal.measurement.zzbr.zzc.zza) r2     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.zzgo r2 = r2.zzu()     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.zzfd r2 = (com.google.android.gms.internal.measurement.zzfd) r2     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.zzbr$zzc r2 = (com.google.android.gms.internal.measurement.zzbr.zzc) r2     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            java.lang.Long r7 = java.lang.Long.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            android.util.Pair r7 = android.util.Pair.create(r2, r7)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            r1.close()
            return r7
        L5b:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzew r3 = r6.zzr()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzf()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzew.zza(r7)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            r3.zza(r4, r7, r8, r2)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            r1.close()
            return r0
        L71:
            r7 = move-exception
            goto L77
        L73:
            r7 = move-exception
            goto L8c
        L75:
            r7 = move-exception
            r1 = r0
        L77:
            com.google.android.gms.measurement.internal.zzew r8 = r6.zzr()     // Catch: java.lang.Throwable -> L8a
            com.google.android.gms.measurement.internal.zzey r8 = r8.zzf()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = "Error selecting main event"
            r8.zza(r2, r7)     // Catch: java.lang.Throwable -> L8a
            if (r1 == 0) goto L89
            r1.close()
        L89:
            return r0
        L8a:
            r7 = move-exception
            r0 = r1
        L8c:
            if (r0 == 0) goto L91
            r0.close()
        L91:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzac.zza(java.lang.String, java.lang.Long):android.util.Pair");
    }

    public final boolean zza(String str, Long l, long j, zzbr.zzc zzcVar) {
        zzd();
        zzak();
        Preconditions.checkNotNull(zzcVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l);
        byte[] zzbi = zzcVar.zzbi();
        zzr().zzx().zza("Saving complex main event, appId, data size", zzo().zza(str), Integer.valueOf(zzbi.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", zzbi);
        try {
            if (c_().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                zzr().zzf().zza("Failed to insert complex main event (got -1). appId", zzew.zza(str));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            zzr().zzf().zza("Error storing complex main event. appId", zzew.zza(str), e);
            return false;
        }
    }

    public final boolean zza(zzak zzakVar, long j, boolean z) {
        zzd();
        zzak();
        Preconditions.checkNotNull(zzakVar);
        Preconditions.checkNotEmpty(zzakVar.zza);
        zzbr.zzc.zza zzb2 = zzbr.zzc.zzj().zzb(zzakVar.zzd);
        Iterator<String> it = zzakVar.zze.iterator();
        while (it.hasNext()) {
            String next = it.next();
            zzbr.zze.zza zza = zzbr.zze.zzh().zza(next);
            zzg().zza(zza, zzakVar.zze.zza(next));
            zzb2.zza(zza);
        }
        byte[] zzbi = ((zzbr.zzc) ((com.google.android.gms.internal.measurement.zzfd) zzb2.zzu())).zzbi();
        zzr().zzx().zza("Saving event, name, data size", zzo().zza(zzakVar.zzb), Integer.valueOf(zzbi.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzakVar.zza);
        contentValues.put("name", zzakVar.zzb);
        contentValues.put("timestamp", Long.valueOf(zzakVar.zzc));
        contentValues.put("metadata_fingerprint", Long.valueOf(j));
        contentValues.put(NotificationFactory.DATA, zzbi);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (c_().insert("raw_events", null, contentValues) == -1) {
                zzr().zzf().zza("Failed to insert raw event (got -1). appId", zzew.zza(zzakVar.zza));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            zzr().zzf().zza("Error storing raw event. appId", zzew.zza(zzakVar.zza), e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(String str, List<zzbj.zza> list) {
        boolean z;
        boolean z2;
        Preconditions.checkNotNull(list);
        for (int i = 0; i < list.size(); i++) {
            zzbj.zza.C0039zza zzbm = list.get(i).zzbm();
            if (zzbm.zzb() != 0) {
                for (int i2 = 0; i2 < zzbm.zzb(); i2++) {
                    zzbj.zzb.zza zzbm2 = zzbm.zzb(i2).zzbm();
                    zzbj.zzb.zza zzaVar = (zzbj.zzb.zza) ((zzfd.zzb) zzbm2.clone());
                    String zzb2 = zzgv.zzb(zzbm2.zza());
                    if (zzb2 != null) {
                        zzaVar.zza(zzb2);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    for (int i3 = 0; i3 < zzbm2.zzb(); i3++) {
                        zzbj.zzc zza = zzbm2.zza(i3);
                        String zza2 = zzgy.zza(zza.zzg());
                        if (zza2 != null) {
                            zzaVar.zza(i3, (zzbj.zzc) ((com.google.android.gms.internal.measurement.zzfd) zza.zzbm().zza(zza2).zzu()));
                            z2 = true;
                        }
                    }
                    if (z2) {
                        zzbm = zzbm.zza(i2, zzaVar);
                        list.set(i, (zzbj.zza) ((com.google.android.gms.internal.measurement.zzfd) zzbm.zzu()));
                    }
                }
            }
            if (zzbm.zza() != 0) {
                for (int i4 = 0; i4 < zzbm.zza(); i4++) {
                    zzbj.zze zza3 = zzbm.zza(i4);
                    String zza4 = zzgx.zza(zza3.zzc());
                    if (zza4 != null) {
                        zzbm = zzbm.zza(i4, zza3.zzbm().zza(zza4));
                        list.set(i, (zzbj.zza) ((com.google.android.gms.internal.measurement.zzfd) zzbm.zzu()));
                    }
                }
            }
        }
        zzak();
        zzd();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        SQLiteDatabase c_ = c_();
        c_.beginTransaction();
        try {
            zzak();
            zzd();
            Preconditions.checkNotEmpty(str);
            SQLiteDatabase c_2 = c_();
            c_2.delete("property_filters", "app_id=?", new String[]{str});
            c_2.delete("event_filters", "app_id=?", new String[]{str});
            for (zzbj.zza zzaVar2 : list) {
                zzak();
                zzd();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(zzaVar2);
                if (!zzaVar2.zza()) {
                    zzr().zzi().zza("Audience with no ID. appId", zzew.zza(str));
                } else {
                    int zzb3 = zzaVar2.zzb();
                    Iterator<zzbj.zzb> it = zzaVar2.zze().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().zza()) {
                                zzr().zzi().zza("Event filter with no ID. Audience definition ignored. appId, audienceId", zzew.zza(str), Integer.valueOf(zzb3));
                                break;
                            }
                        } else {
                            Iterator<zzbj.zze> it2 = zzaVar2.zzc().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!it2.next().zza()) {
                                        zzr().zzi().zza("Property filter with no ID. Audience definition ignored. appId, audienceId", zzew.zza(str), Integer.valueOf(zzb3));
                                        break;
                                    }
                                } else {
                                    Iterator<zzbj.zzb> it3 = zzaVar2.zze().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!zza(str, zzb3, it3.next())) {
                                                z = false;
                                                break;
                                            }
                                        } else {
                                            z = true;
                                            break;
                                        }
                                    }
                                    if (z) {
                                        for (zzbj.zze zzeVar : zzaVar2.zzc()) {
                                            if (!zza(str, zzb3, zzeVar)) {
                                                break;
                                            }
                                        }
                                    }
                                    if (!z) {
                                        zzak();
                                        zzd();
                                        Preconditions.checkNotEmpty(str);
                                        SQLiteDatabase c_3 = c_();
                                        c_3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(zzb3)});
                                        c_3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(zzb3)});
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (zzbj.zza zzaVar3 : list) {
                arrayList.add(zzaVar3.zza() ? Integer.valueOf(zzaVar3.zzb()) : null);
            }
            zzc(str, arrayList);
            c_.setTransactionSuccessful();
        } finally {
            c_.endTransaction();
        }
    }

    private final boolean zzam() {
        return zzn().getDatabasePath("google_app_measurement.db").exists();
    }
}
