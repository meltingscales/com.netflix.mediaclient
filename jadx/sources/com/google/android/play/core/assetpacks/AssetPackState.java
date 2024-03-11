package com.google.android.play.core.assetpacks;

import android.os.Bundle;

/* loaded from: classes5.dex */
public abstract class AssetPackState {
    public static AssetPackState a(String str, int i, int i2, long j, long j2, double d, int i3, String str2, String str3) {
        return new bn(str, i, i2, j, j2, (int) Math.rint(100.0d * d), i3, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AssetPackState b(Bundle bundle, String str, co coVar, eb ebVar, be beVar) {
        int a = beVar.a(bundle.getInt(com.google.android.play.core.assetpacks.model.b.a("status", str)), str);
        int i = bundle.getInt(com.google.android.play.core.assetpacks.model.b.a("error_code", str));
        long j = bundle.getLong(com.google.android.play.core.assetpacks.model.b.a("bytes_downloaded", str));
        long j2 = bundle.getLong(com.google.android.play.core.assetpacks.model.b.a("total_bytes_to_download", str));
        double a2 = coVar.a(str);
        long j3 = bundle.getLong(com.google.android.play.core.assetpacks.model.b.a("pack_version", str));
        long j4 = bundle.getLong(com.google.android.play.core.assetpacks.model.b.a("pack_base_version", str));
        int i2 = 1;
        int i3 = 4;
        if (a != 4) {
            i3 = a;
        } else if (j4 != 0 && j4 != j3) {
            i2 = 2;
        }
        return a(str, i3, i, j, j2, a2, i2, bundle.getString(com.google.android.play.core.assetpacks.model.b.a("pack_version_tag", str), String.valueOf(bundle.getInt("app_version_code"))), ebVar.a(str));
    }

    public abstract String availableVersionTag();

    public abstract long bytesDownloaded();

    public abstract int errorCode();

    public abstract String installedVersionTag();

    public abstract String name();

    public abstract int status();

    public abstract long totalBytesToDownload();

    public abstract int transferProgressPercentage();

    public abstract int updateAvailability();
}
