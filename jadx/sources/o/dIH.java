package o;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes5.dex */
public interface dIH extends Closeable, Flushable {
    void a(C7872dIo c7872dIo, long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    dIK e();

    void flush();
}
