package androidx.room;

import androidx.sqlite.db.SupportSQLiteProgram;
import java.util.ArrayList;
import java.util.List;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class QueryInterceptorProgram implements SupportSQLiteProgram {
    private final List<Object> bindArgsCache = new ArrayList();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final List<Object> getBindArgsCache$room_runtime_release() {
        return this.bindArgsCache;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int i) {
        saveArgsToCache(i, null);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int i, long j) {
        saveArgsToCache(i, Long.valueOf(j));
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int i, double d) {
        saveArgsToCache(i, Double.valueOf(d));
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int i, String str) {
        C8632dsu.c((Object) str, "");
        saveArgsToCache(i, str);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int i, byte[] bArr) {
        C8632dsu.c((Object) bArr, "");
        saveArgsToCache(i, bArr);
    }

    private final void saveArgsToCache(int i, Object obj) {
        int size;
        int i2 = i - 1;
        if (i2 >= this.bindArgsCache.size() && (size = this.bindArgsCache.size()) <= i2) {
            while (true) {
                this.bindArgsCache.add(null);
                if (size == i2) {
                    break;
                }
                size++;
            }
        }
        this.bindArgsCache.set(i2, obj);
    }
}
