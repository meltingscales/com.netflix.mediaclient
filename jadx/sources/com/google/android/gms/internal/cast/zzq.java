package com.google.android.gms.internal.cast;

import android.os.IInterface;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.zzaa;
import com.google.android.gms.cast.framework.zzad;
import com.google.android.gms.cast.framework.zzx;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* loaded from: classes2.dex */
public interface zzq extends IInterface {
    zzaa zze(IObjectWrapper iObjectWrapper, CastOptions castOptions, zzs zzsVar, Map map);

    zzad zzf(CastOptions castOptions, IObjectWrapper iObjectWrapper, zzx zzxVar);

    com.google.android.gms.cast.framework.zzak zzg(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3);

    com.google.android.gms.cast.framework.zzan zzh(String str, String str2, com.google.android.gms.cast.framework.zzav zzavVar);

    com.google.android.gms.cast.framework.media.internal.zzi zzi(IObjectWrapper iObjectWrapper, com.google.android.gms.cast.framework.media.internal.zzk zzkVar, int i, int i2, boolean z, long j, int i3, int i4, int i5);
}
