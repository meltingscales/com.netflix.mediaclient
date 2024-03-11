package o;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;

/* renamed from: o.bah  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4236bah extends AbstractC4233bae {
    private final Socket e = new Socket();

    @Override // o.AbstractC4233bae
    public void c() {
    }

    @Override // o.AbstractC4233bae
    public void e(InetAddress inetAddress, int i, long j) {
        C8632dsu.c((Object) inetAddress, "");
        Socket socket = this.e;
        InetSocketAddress inetSocketAddress = new InetSocketAddress(inetAddress, i);
        int i2 = (int) j;
        socket.connect(inetSocketAddress, i2);
        this.e.setSoTimeout(i2);
    }

    @Override // o.AbstractC4233bae
    public ByteBuffer c(int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = this.e.getInputStream().read(bArr, i2, i - i2);
            if (read < 0) {
                throw new IllegalStateException("could not read required bytes");
            }
            i2 += read;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i);
        C8632dsu.a(wrap, "");
        return wrap;
    }

    @Override // o.AbstractC4233bae
    public void a() {
        this.e.close();
    }
}
