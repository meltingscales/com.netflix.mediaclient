package o;

import com.fasterxml.jackson.core.JsonToken;
import com.netflix.msl.io.MslEncoderException;
import java.io.InputStream;

/* renamed from: o.dkj  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC8405dkj extends AutoCloseable {
    void b();

    JsonToken c();

    @Override // java.lang.AutoCloseable
    void close();

    int d();

    String f();

    int g();

    void h();

    String i();

    void j();

    JsonToken k();

    Object o();

    static InterfaceC8405dkj e(InputStream inputStream, C8404dki c8404dki) {
        if (C8404dki.b.equals(c8404dki)) {
            return new djW(inputStream);
        }
        if (C8404dki.d.equals(c8404dki)) {
            return new djQ(inputStream);
        }
        throw new MslEncoderException("Unsupported encoder format: " + c8404dki + ".");
    }

    static InterfaceC8405dkj c(byte[] bArr, C8404dki c8404dki) {
        if (C8404dki.b.equals(c8404dki)) {
            return new djW(bArr);
        }
        if (C8404dki.d.equals(c8404dki)) {
            return new djQ(bArr);
        }
        throw new MslEncoderException("Unsupported encoder format: " + c8404dki + ".");
    }
}
