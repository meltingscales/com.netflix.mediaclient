package com.google.android.gms.tflite.client;

import com.google.android.gms.tflite.client.TfLiteInitializationOptions;

/* loaded from: classes5.dex */
final class zza extends TfLiteInitializationOptions.Builder {
    private boolean zza;
    private boolean zzb;
    private byte zzc;

    @Override // com.google.android.gms.tflite.client.TfLiteInitializationOptions.Builder
    public final TfLiteInitializationOptions build() {
        if (this.zzc != 7) {
            StringBuilder sb = new StringBuilder();
            if ((this.zzc & 1) == 0) {
                sb.append(" enableGpuDelegateSupport");
            }
            if ((this.zzc & 2) == 0) {
                sb.append(" enableTpuDelegateSupport");
            }
            if ((this.zzc & 4) == 0) {
                sb.append(" enableAutomaticDownload");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new zzc(this.zza, false, this.zzb, null);
    }

    @Override // com.google.android.gms.tflite.client.TfLiteInitializationOptions.Builder
    public final TfLiteInitializationOptions.Builder setEnableAutomaticDownload(boolean z) {
        this.zzb = z;
        this.zzc = (byte) (this.zzc | 4);
        return this;
    }

    @Override // com.google.android.gms.tflite.client.TfLiteInitializationOptions.Builder
    public final TfLiteInitializationOptions.Builder setEnableGpuDelegateSupport(boolean z) {
        this.zza = z;
        this.zzc = (byte) (this.zzc | 1);
        return this;
    }

    @Override // com.google.android.gms.tflite.client.TfLiteInitializationOptions.Builder
    public final TfLiteInitializationOptions.Builder zza(boolean z) {
        this.zzc = (byte) (this.zzc | 2);
        return this;
    }
}
