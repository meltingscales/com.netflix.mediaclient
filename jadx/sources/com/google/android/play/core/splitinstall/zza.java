package com.google.android.play.core.splitinstall;

import android.app.PendingIntent;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zza extends SplitInstallSessionState {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;
    private final long zze;
    private final List zzf;
    private final List zzg;
    private final PendingIntent zzh;
    private final List zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zza(int i, int i2, int i3, long j, long j2, List list, List list2, PendingIntent pendingIntent, List list3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = j;
        this.zze = j2;
        this.zzf = list;
        this.zzg = list2;
        this.zzh = pendingIntent;
        this.zzi = list3;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final long bytesDownloaded() {
        return this.zzd;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SplitInstallSessionState) {
            SplitInstallSessionState splitInstallSessionState = (SplitInstallSessionState) obj;
            if (this.zza == splitInstallSessionState.sessionId() && this.zzb == splitInstallSessionState.status() && this.zzc == splitInstallSessionState.errorCode() && this.zzd == splitInstallSessionState.bytesDownloaded() && this.zze == splitInstallSessionState.totalBytesToDownload()) {
                List list = this.zzf;
                if (list == null) {
                    if (splitInstallSessionState.zzb() != null) {
                        return false;
                    }
                } else if (!list.equals(splitInstallSessionState.zzb())) {
                    return false;
                }
                List list2 = this.zzg;
                if (list2 == null) {
                    if (splitInstallSessionState.zza() != null) {
                        return false;
                    }
                } else if (!list2.equals(splitInstallSessionState.zza())) {
                    return false;
                }
                PendingIntent pendingIntent = this.zzh;
                if (pendingIntent == null) {
                    if (splitInstallSessionState.resolutionIntent() != null) {
                        return false;
                    }
                } else if (!pendingIntent.equals(splitInstallSessionState.resolutionIntent())) {
                    return false;
                }
                List list3 = this.zzi;
                if (list3 == null) {
                    if (splitInstallSessionState.zzc() != null) {
                        return false;
                    }
                } else if (!list3.equals(splitInstallSessionState.zzc())) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final int errorCode() {
        return this.zzc;
    }

    public final int hashCode() {
        int i = this.zza;
        int i2 = this.zzb;
        int i3 = this.zzc;
        long j = this.zzd;
        long j2 = this.zze;
        List list = this.zzf;
        int hashCode = list == null ? 0 : list.hashCode();
        int i4 = (int) (j ^ (j >>> 32));
        int i5 = (int) ((j2 >>> 32) ^ j2);
        List list2 = this.zzg;
        int hashCode2 = list2 == null ? 0 : list2.hashCode();
        PendingIntent pendingIntent = this.zzh;
        int hashCode3 = pendingIntent == null ? 0 : pendingIntent.hashCode();
        List list3 = this.zzi;
        return ((((((((((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ i5) * 1000003) ^ hashCode) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ (list3 != null ? list3.hashCode() : 0);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    @Deprecated
    public final PendingIntent resolutionIntent() {
        return this.zzh;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final int sessionId() {
        return this.zza;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final int status() {
        return this.zzb;
    }

    public final String toString() {
        int i = this.zza;
        int i2 = this.zzb;
        int i3 = this.zzc;
        long j = this.zzd;
        long j2 = this.zze;
        String valueOf = String.valueOf(this.zzf);
        String valueOf2 = String.valueOf(this.zzg);
        String valueOf3 = String.valueOf(this.zzh);
        String valueOf4 = String.valueOf(this.zzi);
        return "SplitInstallSessionState{sessionId=" + i + ", status=" + i2 + ", errorCode=" + i3 + ", bytesDownloaded=" + j + ", totalBytesToDownload=" + j2 + ", moduleNamesNullable=" + valueOf + ", languagesNullable=" + valueOf2 + ", resolutionIntent=" + valueOf3 + ", splitFileIntents=" + valueOf4 + "}";
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final long totalBytesToDownload() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final List zza() {
        return this.zzg;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final List zzb() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final List zzc() {
        return this.zzi;
    }
}
