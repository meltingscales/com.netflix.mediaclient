package o;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import kotlin.random.Random;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.baf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4234baf extends AbstractC4233bae {
    private final long a;
    private final ByteBuffer c;
    private final DatagramSocket e = new DatagramSocket();

    public C4234baf(long j) {
        this.a = j;
        ByteBuffer allocate = ByteBuffer.allocate(65535);
        allocate.limit(0);
        this.c = allocate;
    }

    @Override // o.AbstractC4233bae
    public void e(InetAddress inetAddress, int i, long j) {
        C8632dsu.c((Object) inetAddress, "");
        this.e.setSoTimeout((int) j);
        this.e.connect(inetAddress, i);
    }

    @Override // o.AbstractC4233bae
    public void c() {
        ArrayList<Number> arrayList = new ArrayList((int) PrivateKeyType.INVALID);
        for (int i = 0; i < 255; i++) {
            arrayList.add(Integer.valueOf(Random.a.b()));
        }
        int i2 = (int) (this.a / 1000);
        for (Number number : arrayList) {
            i2 ^= number.intValue();
        }
        ByteBuffer allocate = ByteBuffer.allocate(1024);
        allocate.order(ByteOrder.BIG_ENDIAN);
        for (Number number2 : arrayList) {
            allocate.putInt(number2.intValue());
        }
        allocate.putInt(i2);
        this.e.send(new DatagramPacket(allocate.array(), 1024));
    }

    @Override // o.AbstractC4233bae
    public ByteBuffer c(int i) {
        int i2;
        byte[] bArr = new byte[i];
        int i3 = 0;
        while (i3 < i) {
            if (this.c.remaining() == 0) {
                DatagramPacket datagramPacket = new DatagramPacket(this.c.array(), this.c.capacity());
                this.e.receive(datagramPacket);
                this.c.rewind();
                this.c.limit(datagramPacket.getLength());
            }
            i2 = C8657dts.i(this.c.remaining(), i);
            this.c.get(bArr, i3, i2);
            i3 += i2;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i);
        C8632dsu.a(wrap, "");
        return wrap;
    }

    @Override // o.AbstractC4233bae
    public void a() {
        this.e.disconnect();
    }
}
