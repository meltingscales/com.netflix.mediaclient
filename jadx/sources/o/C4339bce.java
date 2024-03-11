package o;

import java.io.File;

/* renamed from: o.bce  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C4339bce {
    C4339bce() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(File file, String str) {
        File file2 = new File(file.getAbsolutePath() + ".new");
        boolean c = C8106deC.c(file2.getAbsolutePath(), str.getBytes());
        if (c) {
            boolean delete = file.delete();
            C1044Mm.c("nf_offline_registry", "deleteOldResult=%b moving %s to %s", Boolean.valueOf(delete), file2.getAbsolutePath(), file.getAbsolutePath());
            c = C8106deC.b(file2.getAbsolutePath(), file.getAbsolutePath());
        }
        C1044Mm.c("nf_offline_registry", "writeRegistryFileRecoverable isSuccess=%b", Boolean.valueOf(c));
        return c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(File file) {
        File file2 = new File(file.getAbsolutePath() + ".new");
        if (!file2.exists() || file2.length() <= 0) {
            return;
        }
        C1044Mm.c("nf_offline_registry", "recovering result=%b newSize=%d oldSize=%d", Boolean.valueOf(file.delete()), Long.valueOf(file2.length()), Long.valueOf(file.length()));
        C8106deC.b(file2.getAbsolutePath(), file.getAbsolutePath());
    }
}
