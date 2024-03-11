package com.google.android.gms.tflite.dynamite.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.moduleinstall.ModuleInstall;
import com.google.android.gms.common.moduleinstall.ModuleInstallClient;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.internal.tflite.zzad;
import com.google.android.gms.internal.tflite.zzl;
import com.google.android.gms.internal.tflite.zzm;
import com.google.android.gms.internal.tflite.zzs;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.tflite.client.TfLiteClient;
import com.google.android.gms.tflite.client.TfLiteInitializationOptions;
import com.google.android.gms.tflite.dynamite.NativeInitializationHandle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class zzi implements TfLiteClient {
    private final Context zzb;
    private final Executor zzc;
    private final zzad zzd;
    private final ModuleInstallClient zze;

    public zzi(Context context, Executor executor, zzad zzadVar) {
        ModuleInstallClient client = ModuleInstall.getClient(context);
        this.zzb = context;
        this.zzc = executor;
        this.zzd = zzadVar;
        this.zze = client;
        zzs.zza(context);
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    public final Feature[] getOptionalFeatures() {
        return new Feature[]{zzl.zza};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Task zza(TfLiteInitializationOptions tfLiteInitializationOptions, Void r5) {
        Context context = this.zzb;
        zzad zzadVar = this.zzd;
        String packageName = context.getPackageName();
        PackageInfo packageInfo = ClientLibraryUtils.getPackageInfo(context, packageName);
        CustomerInfo customerInfo = new CustomerInfo(packageName, packageInfo == null ? null : packageInfo.versionName, zzadVar != null ? Integer.valueOf(zzadVar.zza()) : null);
        Context context2 = this.zzb;
        boolean enableGpuDelegateSupport = tfLiteInitializationOptions.enableGpuDelegateSupport();
        tfLiteInitializationOptions.zza();
        return Tasks.forResult(new NativeInitializationHandle(zzk.zzb(context2, customerInfo, enableGpuDelegateSupport, false).zzc()));
    }

    public final void zzb() {
        String packageName = this.zzb.getPackageName();
        Preconditions.checkArgument(UidVerifier.uidHasPackageName(this.zzb, Process.myUid(), packageName), "Invalid package name \"%s\" for context", packageName);
    }

    @Override // com.google.android.gms.tflite.client.TfLiteClient
    public final Task<NativeInitializationHandle> getTfLiteNativeInitializationHandle(final TfLiteInitializationOptions tfLiteInitializationOptions) {
        Task continueWith;
        if (tfLiteInitializationOptions.enableAutomaticDownload()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzl.zza);
            if (tfLiteInitializationOptions.enableGpuDelegateSupport()) {
                arrayList.add(zzm.zza);
            }
            final Feature[] featureArr = (Feature[]) arrayList.toArray(new Feature[0]);
            continueWith = com.google.android.gms.internal.tflite.zzk.zza(this.zze, featureArr, this.zzc).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.tflite.dynamite.internal.zzg
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    Log.w("TfLiteGMS", String.format(Locale.US, "Module installation for features %s failed", Arrays.toString(featureArr)), exc);
                }
            }).continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.tflite.dynamite.internal.zzh
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return null;
                }
            });
        } else {
            continueWith = Tasks.forResult(null);
        }
        return continueWith.onSuccessTask(this.zzc, new SuccessContinuation() { // from class: com.google.android.gms.tflite.dynamite.internal.zzf
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return zzi.this.zza(tfLiteInitializationOptions, (Void) obj);
            }
        });
    }
}
