package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import com.google.android.play.core.splitinstall.internal.zzbk;
import java.io.File;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class zza {
    private final zze zza;

    public zza(zze zzeVar) {
        this.zza = zzeVar;
    }

    public static final int zzc(AssetManager assetManager, File file) {
        int intValue = ((Integer) zzbk.zzd(assetManager, "addAssetPath", Integer.class, String.class, file.getPath())).intValue();
        Log.d("SplitCompat", "addAssetPath completed with " + intValue);
        return intValue;
    }

    public final void zza(Context context, Set set) {
        synchronized (this) {
            AssetManager assets = context.getAssets();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                zzc(assets, (File) it.next());
            }
        }
    }
}
