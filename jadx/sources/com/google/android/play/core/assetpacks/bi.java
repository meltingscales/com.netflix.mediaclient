package com.google.android.play.core.assetpacks;

/* loaded from: classes5.dex */
public final class bi implements com.google.android.play.core.assetpacks.internal.as {
    private final com.google.android.play.core.assetpacks.internal.as a;
    private final com.google.android.play.core.assetpacks.internal.as b;

    public bi(com.google.android.play.core.assetpacks.internal.as asVar, com.google.android.play.core.assetpacks.internal.as asVar2) {
        this.a = asVar;
        this.b = asVar2;
    }

    @Override // com.google.android.play.core.assetpacks.internal.as
    public final /* synthetic */ Object a() {
        return new bh(((u) this.a).b(), (ed) this.b.a());
    }
}
