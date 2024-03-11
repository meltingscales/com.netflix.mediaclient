package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes5.dex */
final class ed {
    private static final com.google.android.play.core.assetpacks.internal.o a = new com.google.android.play.core.assetpacks.internal.o("PackageStateCache");
    private final Context b;
    private int c = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ed(Context context) {
        this.b = context;
    }

    public final int a() {
        int i;
        synchronized (this) {
            if (this.c == -1) {
                try {
                    this.c = this.b.getPackageManager().getPackageInfo(this.b.getPackageName(), 0).versionCode;
                } catch (PackageManager.NameNotFoundException unused) {
                    a.b("The current version of the app could not be retrieved", new Object[0]);
                }
            }
            i = this.c;
        }
        return i;
    }
}
