package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes5.dex */
final class es {
    private static final com.google.android.play.core.assetpacks.internal.o a = new com.google.android.play.core.assetpacks.internal.o("VerifySliceTaskHandler");
    private final bh b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public es(bh bhVar) {
        this.b = bhVar;
    }

    private final void b(er erVar, File file) {
        try {
            File o2 = this.b.o(erVar.l, erVar.a, erVar.b, erVar.c);
            if (o2.exists()) {
                try {
                    if (!dq.a(eq.a(file, o2)).equals(erVar.d)) {
                        throw new ck(String.format("Verification failed for slice %s.", erVar.c), erVar.k);
                    }
                    a.d("Verification of slice %s of pack %s successful.", erVar.c, erVar.l);
                    return;
                } catch (IOException e) {
                    throw new ck(String.format("Could not digest file during verification for slice %s.", erVar.c), e, erVar.k);
                } catch (NoSuchAlgorithmException e2) {
                    throw new ck("SHA256 algorithm not supported.", e2, erVar.k);
                }
            }
            throw new ck(String.format("Cannot find metadata files for slice %s.", erVar.c), erVar.k);
        } catch (IOException e3) {
            throw new ck(String.format("Could not reconstruct slice archive during verification for slice %s.", erVar.c), e3, erVar.k);
        }
    }

    public final void a(er erVar) {
        File p = this.b.p(erVar.l, erVar.a, erVar.b, erVar.c);
        if (p.exists()) {
            b(erVar, p);
            File q = this.b.q(erVar.l, erVar.a, erVar.b, erVar.c);
            if (!q.exists()) {
                q.mkdirs();
            }
            if (!p.renameTo(q)) {
                throw new ck(String.format("Failed to move slice %s after verification.", erVar.c), erVar.k);
            }
            return;
        }
        throw new ck(String.format("Cannot find unverified files for slice %s.", erVar.c), erVar.k);
    }
}
