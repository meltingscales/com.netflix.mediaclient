package o;

import java.nio.channels.WritableByteChannel;
import okio.ByteString;

/* loaded from: classes5.dex */
public interface dIq extends dIH, WritableByteChannel {
    dIq b(String str);

    dIq b(ByteString byteString);

    dIq c(int i);

    dIq c(String str, int i, int i2);

    dIq d(byte[] bArr);

    dIq e(byte[] bArr, int i, int i2);

    dIq f(int i);

    @Override // o.dIH, java.io.Flushable
    void flush();

    dIq h(int i);

    dIq i();

    dIq j();

    dIq k(long j);

    dIq l(long j);

    C7872dIo o();
}
