package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class dy {
    private final bh a;
    private final de b;
    private final co c;
    private final eb d;
    private final com.google.android.play.core.assetpacks.internal.aq e;
    private final com.google.android.play.core.assetpacks.internal.aq f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public dy(bh bhVar, com.google.android.play.core.assetpacks.internal.aq aqVar, de deVar, com.google.android.play.core.assetpacks.internal.aq aqVar2, co coVar, eb ebVar) {
        this.a = bhVar;
        this.e = aqVar;
        this.b = deVar;
        this.f = aqVar2;
        this.c = coVar;
        this.d = ebVar;
    }

    public final void a(final dw dwVar) {
        File j = this.a.j(dwVar.l, dwVar.a, dwVar.b);
        File l = this.a.l(dwVar.l, dwVar.a, dwVar.b);
        if (!j.exists() || !l.exists()) {
            throw new ck(String.format("Cannot find pack files to move for pack %s.", dwVar.l), dwVar.k);
        }
        File h = this.a.h(dwVar.l, dwVar.a, dwVar.b);
        h.mkdirs();
        if (!j.renameTo(h)) {
            throw new ck("Cannot move merged pack files to final location.", dwVar.k);
        }
        new File(this.a.h(dwVar.l, dwVar.a, dwVar.b), "merge.tmp").delete();
        File i = this.a.i(dwVar.l, dwVar.a, dwVar.b);
        i.mkdirs();
        if (l.renameTo(i)) {
            try {
                this.d.b(dwVar.l, dwVar.a, dwVar.b, dwVar.c);
                ((Executor) this.f.a()).execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.dx
                    @Override // java.lang.Runnable
                    public final void run() {
                        dy.this.b(dwVar);
                    }
                });
                this.b.k(dwVar.l, dwVar.a, dwVar.b);
                this.c.c(dwVar.l);
                ((y) this.e.a()).h(dwVar.k, dwVar.l);
                return;
            } catch (IOException e) {
                throw new ck(String.format("Could not write asset pack version tag for pack %s: %s", dwVar.l, e.getMessage()), dwVar.k);
            }
        }
        throw new ck("Cannot move metadata files to final location.", dwVar.k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void b(dw dwVar) {
        this.a.B(dwVar.l, dwVar.a, dwVar.b);
    }
}
