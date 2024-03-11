package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;

/* loaded from: classes5.dex */
final class du {
    private static final com.google.android.play.core.assetpacks.internal.o a = new com.google.android.play.core.assetpacks.internal.o("MergeSliceTaskHandler");
    private final bh b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public du(bh bhVar) {
        this.b = bhVar;
    }

    private static void b(File file, File file2) {
        File[] listFiles;
        if (file.isDirectory()) {
            file2.mkdirs();
            for (File file3 : file.listFiles()) {
                b(file3, new File(file2, file3.getName()));
            }
            if (!file.delete()) {
                throw new ck("Unable to delete directory: ".concat(String.valueOf(file)));
            }
        } else if (file2.exists()) {
            throw new ck("File clashing with existing file from other slice: ".concat(file2.toString()));
        } else {
            if (!file.renameTo(file2)) {
                throw new ck("Unable to move file: ".concat(String.valueOf(file)));
            }
        }
    }

    public final void a(dt dtVar) {
        File q = this.b.q(dtVar.l, dtVar.a, dtVar.b, dtVar.c);
        if (!q.exists()) {
            throw new ck(String.format("Cannot find verified files for slice %s.", dtVar.c), dtVar.k);
        }
        File j = this.b.j(dtVar.l, dtVar.a, dtVar.b);
        if (!j.exists()) {
            j.mkdirs();
        }
        b(q, j);
        try {
            this.b.A(dtVar.l, dtVar.a, dtVar.b, this.b.b(dtVar.l, dtVar.a, dtVar.b) + 1);
        } catch (IOException e) {
            a.b("Writing merge checkpoint failed with %s.", e.getMessage());
            throw new ck("Writing merge checkpoint failed.", e, dtVar.k);
        }
    }
}
