package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* loaded from: classes5.dex */
final class eg {
    private static final com.google.android.play.core.assetpacks.internal.o a = new com.google.android.play.core.assetpacks.internal.o("PatchSliceTaskHandler");
    private final bh b;
    private final com.google.android.play.core.assetpacks.internal.aq c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public eg(bh bhVar, com.google.android.play.core.assetpacks.internal.aq aqVar) {
        this.b = bhVar;
        this.c = aqVar;
    }

    public final void a(ef efVar) {
        File h = this.b.h(efVar.l, efVar.a, efVar.b);
        bh bhVar = this.b;
        String str = efVar.l;
        int i = efVar.a;
        long j = efVar.b;
        File file = new File(bhVar.i(str, i, j), efVar.f);
        try {
            InputStream inputStream = efVar.h;
            if (efVar.e == 2) {
                inputStream = new GZIPInputStream(inputStream, 8192);
            }
            bk bkVar = new bk(h, file);
            File p = this.b.p(efVar.l, efVar.c, efVar.d, efVar.f);
            if (!p.exists()) {
                p.mkdirs();
            }
            eo eoVar = new eo(this.b, efVar.l, efVar.c, efVar.d, efVar.f);
            com.google.android.play.core.assetpacks.internal.am.a(bkVar, inputStream, new cn(p, eoVar), efVar.g);
            eoVar.i(0);
            inputStream.close();
            a.d("Patching and extraction finished for slice %s of pack %s.", efVar.f, efVar.l);
            ((y) this.c.a()).g(efVar.k, efVar.l, efVar.f, 0);
            try {
                efVar.h.close();
            } catch (IOException unused) {
                a.e("Could not close file for slice %s of pack %s.", efVar.f, efVar.l);
            }
        } catch (IOException e) {
            a.b("IOException during patching %s.", e.getMessage());
            throw new ck(String.format("Error patching slice %s of pack %s.", efVar.f, efVar.l), e, efVar.k);
        }
    }
}
