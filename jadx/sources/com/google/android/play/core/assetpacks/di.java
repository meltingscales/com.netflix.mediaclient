package com.google.android.play.core.assetpacks;

/* loaded from: classes5.dex */
public final class di implements com.google.android.play.core.assetpacks.internal.as {
    private final com.google.android.play.core.assetpacks.internal.as a;
    private final com.google.android.play.core.assetpacks.internal.as b;
    private final com.google.android.play.core.assetpacks.internal.as c;

    public di(com.google.android.play.core.assetpacks.internal.as asVar, com.google.android.play.core.assetpacks.internal.as asVar2, com.google.android.play.core.assetpacks.internal.as asVar3) {
        this.a = asVar;
        this.b = asVar2;
        this.c = asVar3;
    }

    @Override // com.google.android.play.core.assetpacks.internal.as
    public final /* synthetic */ Object a() {
        return new dh((de) this.a.a(), (bh) this.b.a(), (bu) this.c.a());
    }
}
