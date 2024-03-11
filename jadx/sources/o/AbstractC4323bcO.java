package o;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: o.bcO  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC4323bcO implements InterfaceC4326bcR {
    private final SortedMap<Integer, Integer> a = new TreeMap();
    private int e = 1000;

    protected abstract boolean c();

    protected abstract RandomAccessFile e();

    @Override // o.InterfaceC4326bcR
    public ByteBuffer b(int i) {
        if (c()) {
            int i2 = this.e;
            int i3 = ((i + i2) - 1) / i2;
            SortedMap<Integer, Integer> headMap = this.a.headMap(Integer.valueOf(i3));
            SortedMap<Integer, Integer> tailMap = this.a.tailMap(Integer.valueOf(i3));
            if (!headMap.isEmpty() && !tailMap.isEmpty()) {
                int intValue = headMap.get(headMap.lastKey()).intValue();
                int intValue2 = tailMap.get(tailMap.firstKey()).intValue() - intValue;
                byte[] bArr = new byte[intValue2];
                try {
                    RandomAccessFile e = e();
                    e.seek(intValue);
                    e.read(bArr, 0, intValue2);
                    ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, intValue2);
                    wrap.position(0);
                    wrap.limit(intValue2);
                    return wrap;
                } catch (Exception e2) {
                    C1044Mm.b("BasicBifManager", e2, "Failed reading bif ", new Object[0]);
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean d(InputStream inputStream) {
        BufferedInputStream bufferedInputStream;
        byte[] bArr;
        int read;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            bArr = new byte[64];
            read = bufferedInputStream.read(bArr, 0, 64);
            C1044Mm.a("BasicBifManager", "read %d bytes", Integer.valueOf(read));
        } catch (IOException unused) {
        }
        if (read < 64) {
            bufferedInputStream.close();
            return false;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.nativeOrder());
        wrap.order(ByteOrder.nativeOrder());
        int i = wrap.getInt(8);
        int i2 = wrap.getInt(12);
        this.e = wrap.getInt(16);
        C1044Mm.a("BasicBifManager", "version= %d, bifCount= %d, mInterval= %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.e));
        if (i2 <= 0 || i2 > 28800) {
            C1044Mm.a("BasicBifManager", "bif count may not be correct %d", Integer.valueOf(i2));
            bufferedInputStream.close();
            return false;
        }
        int i3 = (i2 + 1) * 8;
        byte[] bArr2 = new byte[i3];
        C1044Mm.a("BasicBifManager", "try to read index %d", Integer.valueOf(i3));
        int i4 = 0;
        while (i4 < i3) {
            int i5 = i3 - i4;
            if (i5 >= 1024) {
                i5 = 1024;
            }
            int read2 = bufferedInputStream.read(bArr2, i4, i5);
            if (read2 != i5) {
                C1044Mm.a("BasicBifManager", "attempt to read %d, actual %d bytes", Integer.valueOf(i5), Integer.valueOf(read2));
            }
            if (read2 <= 0) {
                bufferedInputStream.close();
                return false;
            }
            i4 += read2;
        }
        ByteBuffer wrap2 = ByteBuffer.wrap(bArr2);
        wrap2.order(ByteOrder.nativeOrder());
        for (int i6 = 0; i6 < i4; i6 += 8) {
            int i7 = wrap2.getInt();
            int i8 = wrap2.getInt();
            if (i7 == -1) {
                i7 = Integer.MAX_VALUE;
            }
            this.a.put(Integer.valueOf(i7), Integer.valueOf(i8));
        }
        bufferedInputStream.close();
        return true;
    }
}
