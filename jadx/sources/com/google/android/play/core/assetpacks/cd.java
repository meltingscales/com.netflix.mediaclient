package com.google.android.play.core.assetpacks;

/* loaded from: classes5.dex */
public final class cd {
    private p a;

    private cd() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ cd(cc ccVar) {
    }

    public final a a() {
        p pVar = this.a;
        if (pVar != null) {
            return new cb(pVar, null);
        }
        throw new IllegalStateException(String.valueOf(p.class.getCanonicalName()).concat(" must be set"));
    }

    public final cd b(p pVar) {
        this.a = pVar;
        return this;
    }
}
