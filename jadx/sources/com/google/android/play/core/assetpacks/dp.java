package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.io.File;

/* loaded from: classes5.dex */
public final class dp implements com.google.android.play.core.assetpacks.internal.as {
    private final com.google.android.play.core.assetpacks.internal.as a;
    private final com.google.android.play.core.assetpacks.internal.as b;
    private final com.google.android.play.core.assetpacks.internal.as c;
    private final com.google.android.play.core.assetpacks.internal.as d;
    private final com.google.android.play.core.assetpacks.internal.as e;
    private final com.google.android.play.core.assetpacks.internal.as f;
    private final com.google.android.play.core.assetpacks.internal.as g;

    public dp(com.google.android.play.core.assetpacks.internal.as asVar, com.google.android.play.core.assetpacks.internal.as asVar2, com.google.android.play.core.assetpacks.internal.as asVar3, com.google.android.play.core.assetpacks.internal.as asVar4, com.google.android.play.core.assetpacks.internal.as asVar5, com.google.android.play.core.assetpacks.internal.as asVar6, com.google.android.play.core.assetpacks.internal.as asVar7) {
        this.a = asVar;
        this.b = asVar2;
        this.c = asVar3;
        this.d = asVar4;
        this.e = asVar5;
        this.f = asVar6;
        this.g = asVar7;
    }

    @Override // com.google.android.play.core.assetpacks.internal.as
    public final /* synthetic */ Object a() {
        File externalFilesDir;
        String str = (String) this.a.a();
        Object a = this.b.a();
        Object a2 = this.c.a();
        Context b = ((u) this.d).b();
        Object a3 = this.e.a();
        com.google.android.play.core.assetpacks.internal.aq c = com.google.android.play.core.assetpacks.internal.aq.c(this.f);
        bb bbVar = (bb) a;
        co coVar = (co) a2;
        ed edVar = (ed) a3;
        eb ebVar = (eb) this.g.a();
        if (str != null) {
            externalFilesDir = new File(b.getExternalFilesDir(null), str);
        } else {
            externalFilesDir = b.getExternalFilesDir(null);
        }
        return new Cdo(externalFilesDir, bbVar, coVar, b, edVar, c, ebVar);
    }
}
