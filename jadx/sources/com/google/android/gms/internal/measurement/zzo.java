package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzo extends zza implements zzm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void initialize(IObjectWrapper iObjectWrapper, zzv zzvVar, long j) {
        Parcel a_ = a_();
        zzb.zza(a_, iObjectWrapper);
        zzb.zza(a_, zzvVar);
        a_.writeLong(j);
        zzb(1, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzb.zza(a_, bundle);
        zzb.zza(a_, z);
        zzb.zza(a_, z2);
        a_.writeLong(j);
        zzb(2, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void logEventAndBundle(String str, String str2, Bundle bundle, zzn zznVar, long j) {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzb.zza(a_, bundle);
        zzb.zza(a_, zznVar);
        a_.writeLong(j);
        zzb(3, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j) {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzb.zza(a_, iObjectWrapper);
        zzb.zza(a_, z);
        a_.writeLong(j);
        zzb(4, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void getUserProperties(String str, String str2, boolean z, zzn zznVar) {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzb.zza(a_, z);
        zzb.zza(a_, zznVar);
        zzb(5, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void getMaxUserProperties(String str, zzn zznVar) {
        Parcel a_ = a_();
        a_.writeString(str);
        zzb.zza(a_, zznVar);
        zzb(6, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void setUserId(String str, long j) {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeLong(j);
        zzb(7, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel a_ = a_();
        zzb.zza(a_, bundle);
        a_.writeLong(j);
        zzb(8, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzb.zza(a_, bundle);
        zzb(9, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void getConditionalUserProperties(String str, String str2, zzn zznVar) {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzb.zza(a_, zznVar);
        zzb(10, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void setMeasurementEnabled(boolean z, long j) {
        Parcel a_ = a_();
        zzb.zza(a_, z);
        a_.writeLong(j);
        zzb(11, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void resetAnalyticsData(long j) {
        Parcel a_ = a_();
        a_.writeLong(j);
        zzb(12, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void setMinimumSessionDuration(long j) {
        Parcel a_ = a_();
        a_.writeLong(j);
        zzb(13, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void setSessionTimeoutDuration(long j) {
        Parcel a_ = a_();
        a_.writeLong(j);
        zzb(14, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j) {
        Parcel a_ = a_();
        zzb.zza(a_, iObjectWrapper);
        a_.writeString(str);
        a_.writeString(str2);
        a_.writeLong(j);
        zzb(15, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void getCurrentScreenName(zzn zznVar) {
        Parcel a_ = a_();
        zzb.zza(a_, zznVar);
        zzb(16, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void getCurrentScreenClass(zzn zznVar) {
        Parcel a_ = a_();
        zzb.zza(a_, zznVar);
        zzb(17, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void setInstanceIdProvider(zzt zztVar) {
        Parcel a_ = a_();
        zzb.zza(a_, zztVar);
        zzb(18, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void getCachedAppInstanceId(zzn zznVar) {
        Parcel a_ = a_();
        zzb.zza(a_, zznVar);
        zzb(19, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void getAppInstanceId(zzn zznVar) {
        Parcel a_ = a_();
        zzb.zza(a_, zznVar);
        zzb(20, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void getGmpAppId(zzn zznVar) {
        Parcel a_ = a_();
        zzb.zza(a_, zznVar);
        zzb(21, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void generateEventId(zzn zznVar) {
        Parcel a_ = a_();
        zzb.zza(a_, zznVar);
        zzb(22, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void beginAdUnitExposure(String str, long j) {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeLong(j);
        zzb(23, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void endAdUnitExposure(String str, long j) {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeLong(j);
        zzb(24, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void onActivityStarted(IObjectWrapper iObjectWrapper, long j) {
        Parcel a_ = a_();
        zzb.zza(a_, iObjectWrapper);
        a_.writeLong(j);
        zzb(25, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void onActivityStopped(IObjectWrapper iObjectWrapper, long j) {
        Parcel a_ = a_();
        zzb.zza(a_, iObjectWrapper);
        a_.writeLong(j);
        zzb(26, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j) {
        Parcel a_ = a_();
        zzb.zza(a_, iObjectWrapper);
        zzb.zza(a_, bundle);
        a_.writeLong(j);
        zzb(27, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j) {
        Parcel a_ = a_();
        zzb.zza(a_, iObjectWrapper);
        a_.writeLong(j);
        zzb(28, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void onActivityPaused(IObjectWrapper iObjectWrapper, long j) {
        Parcel a_ = a_();
        zzb.zza(a_, iObjectWrapper);
        a_.writeLong(j);
        zzb(29, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void onActivityResumed(IObjectWrapper iObjectWrapper, long j) {
        Parcel a_ = a_();
        zzb.zza(a_, iObjectWrapper);
        a_.writeLong(j);
        zzb(30, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzn zznVar, long j) {
        Parcel a_ = a_();
        zzb.zza(a_, iObjectWrapper);
        zzb.zza(a_, zznVar);
        a_.writeLong(j);
        zzb(31, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void performAction(Bundle bundle, zzn zznVar, long j) {
        Parcel a_ = a_();
        zzb.zza(a_, bundle);
        zzb.zza(a_, zznVar);
        a_.writeLong(j);
        zzb(32, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void logHealthData(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel a_ = a_();
        a_.writeInt(i);
        a_.writeString(str);
        zzb.zza(a_, iObjectWrapper);
        zzb.zza(a_, iObjectWrapper2);
        zzb.zza(a_, iObjectWrapper3);
        zzb(33, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void setEventInterceptor(zzs zzsVar) {
        Parcel a_ = a_();
        zzb.zza(a_, zzsVar);
        zzb(34, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void registerOnMeasurementEventListener(zzs zzsVar) {
        Parcel a_ = a_();
        zzb.zza(a_, zzsVar);
        zzb(35, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void unregisterOnMeasurementEventListener(zzs zzsVar) {
        Parcel a_ = a_();
        zzb.zza(a_, zzsVar);
        zzb(36, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void initForTests(Map map) {
        Parcel a_ = a_();
        a_.writeMap(map);
        zzb(37, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void getTestFlag(zzn zznVar, int i) {
        Parcel a_ = a_();
        zzb.zza(a_, zznVar);
        a_.writeInt(i);
        zzb(38, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void setDataCollectionEnabled(boolean z) {
        Parcel a_ = a_();
        zzb.zza(a_, z);
        zzb(39, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void isDataCollectionEnabled(zzn zznVar) {
        Parcel a_ = a_();
        zzb.zza(a_, zznVar);
        zzb(40, a_);
    }
}
