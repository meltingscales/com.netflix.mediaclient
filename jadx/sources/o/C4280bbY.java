package o;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.os.storage.StorageManager;
import java.io.File;

/* renamed from: o.bbY  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C4280bbY {
    private boolean a;
    private boolean b;
    private final File c;
    private long d;
    private long e;
    private long j;

    public long a() {
        return this.e;
    }

    public boolean b() {
        return this.b;
    }

    public long c() {
        return this.j;
    }

    public File d() {
        return this.c;
    }

    public long e() {
        return this.d;
    }

    public C4280bbY(Context context, StorageManager storageManager, File file, StatFs statFs, boolean z) {
        this.c = file;
        c(statFs);
        this.b = !z;
        this.b = Environment.isExternalStorageRemovable(file);
        this.a = Environment.isExternalStorageEmulated(file);
        g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(StatFs statFs) {
        this.j = statFs.getTotalBytes();
        this.d = statFs.getFreeBytes();
        this.e = C8106deC.a(this.c.getParentFile());
    }

    private void g() {
        C1044Mm.c("offlineStorageVolInfo", "\nmDownloadDirPath=%s mTotalSpace=%d mFreeSpace=%d mNetflixUsedSpace=%d mIsRemovable=%b mIsEmulated=%b", this.c.getAbsolutePath(), Long.valueOf(this.j), Long.valueOf(this.d), Long.valueOf(this.e), Boolean.valueOf(this.b), Boolean.valueOf(this.a));
    }
}
