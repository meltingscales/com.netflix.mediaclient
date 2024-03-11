package com.google.android.play.core.assetpacks;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.play.core.assetpacks.internal.af;

/* loaded from: classes5.dex */
public final class s implements com.google.android.play.core.assetpacks.internal.as {
    private final com.google.android.play.core.assetpacks.internal.as a;
    private final com.google.android.play.core.assetpacks.internal.as b;

    public s(com.google.android.play.core.assetpacks.internal.as asVar, com.google.android.play.core.assetpacks.internal.as asVar2) {
        this.a = asVar;
        this.b = asVar2;
    }

    @Override // com.google.android.play.core.assetpacks.internal.as
    public final /* synthetic */ Object a() {
        Object a = this.a.a();
        Context b = ((u) this.b).b();
        l lVar = (l) a;
        af.a(b.getPackageManager(), new ComponentName(b.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
        af.a(b.getPackageManager(), new ComponentName(b.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"), 4);
        com.google.android.play.core.assetpacks.internal.ar.a(lVar);
        return lVar;
    }
}
