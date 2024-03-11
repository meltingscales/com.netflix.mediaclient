package com.google.android.play.core.assetpacks;

import android.content.Context;

/* loaded from: classes5.dex */
public final class t implements com.google.android.play.core.assetpacks.internal.as {
    private final com.google.android.play.core.assetpacks.internal.as a;
    private final com.google.android.play.core.assetpacks.internal.as b;
    private final com.google.android.play.core.assetpacks.internal.as c;

    public t(com.google.android.play.core.assetpacks.internal.as asVar, com.google.android.play.core.assetpacks.internal.as asVar2, com.google.android.play.core.assetpacks.internal.as asVar3) {
        this.a = asVar;
        this.b = asVar2;
        this.c = asVar3;
    }

    @Override // com.google.android.play.core.assetpacks.internal.as
    public final /* synthetic */ Object a() {
        y yVar;
        Context b = ((u) this.a).b();
        com.google.android.play.core.assetpacks.internal.aq c = com.google.android.play.core.assetpacks.internal.aq.c(this.b);
        com.google.android.play.core.assetpacks.internal.aq c2 = com.google.android.play.core.assetpacks.internal.aq.c(this.c);
        if (p.b(b) == null) {
            yVar = (y) c.a();
        } else {
            yVar = (y) c2.a();
        }
        com.google.android.play.core.assetpacks.internal.ar.a(yVar);
        return yVar;
    }
}
