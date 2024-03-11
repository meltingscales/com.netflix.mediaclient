package com.google.android.play.core.assetpacks;

import java.io.File;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class ek {
    private final bh a;
    private final de b;
    private final co c;
    private final com.google.android.play.core.assetpacks.internal.aq d;
    private final com.google.android.play.core.assetpacks.internal.aq e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ek(bh bhVar, com.google.android.play.core.assetpacks.internal.aq aqVar, de deVar, com.google.android.play.core.assetpacks.internal.aq aqVar2, co coVar) {
        this.a = bhVar;
        this.d = aqVar;
        this.b = deVar;
        this.e = aqVar2;
        this.c = coVar;
    }

    public final void a(final ei eiVar) {
        File h = this.a.h(eiVar.l, eiVar.a, eiVar.c);
        if (!h.exists()) {
            throw new ck(String.format("Cannot find pack files to promote for pack %s at %s", eiVar.l, h.getAbsolutePath()), eiVar.k);
        }
        File h2 = this.a.h(eiVar.l, eiVar.b, eiVar.c);
        h2.mkdirs();
        if (!h.renameTo(h2)) {
            throw new ck(String.format("Cannot promote pack %s from %s to %s", eiVar.l, h.getAbsolutePath(), h2.getAbsolutePath()), eiVar.k);
        }
        ((Executor) this.e.a()).execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.ej
            @Override // java.lang.Runnable
            public final void run() {
                ek.this.b(eiVar);
            }
        });
        this.b.k(eiVar.l, eiVar.b, eiVar.c);
        this.c.c(eiVar.l);
        ((y) this.d.a()).h(eiVar.k, eiVar.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void b(ei eiVar) {
        this.a.B(eiVar.l, eiVar.b, eiVar.c);
    }
}
