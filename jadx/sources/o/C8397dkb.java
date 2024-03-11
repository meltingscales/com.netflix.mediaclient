package o;

import com.netflix.android.org.json.zip.JSONzip;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.dkb  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8397dkb extends InputStream {
    private static final Map<Integer, byte[]> e = new HashMap((int) JSONzip.end);
    private final InputStream j;
    private final Map<Integer, byte[]> g = new HashMap(e);
    private final LinkedList<Byte> i = new LinkedList<>();
    private int a = 0;
    private int b = 8;
    private final LinkedList<Byte> d = new LinkedList<>();
    private final ByteArrayOutputStream h = new ByteArrayOutputStream();
    private boolean c = false;

    static {
        for (int i = 0; i < 256; i++) {
            e.put(Integer.valueOf(i), new byte[]{(byte) i});
        }
    }

    public C8397dkb(InputStream inputStream) {
        this.j = inputStream;
    }

    protected void finalize() {
        close();
        super.finalize();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.j.close();
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.c) {
            throw new IOException("Input stream is closed.");
        }
        if (this.d.size() == 0) {
            byte[] bArr = new byte[1];
            if (a(bArr, 0, 1) == -1) {
                return -1;
            }
            return bArr[0];
        }
        return this.d.remove().byteValue();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (this.c) {
            throw new IOException("Input stream is closed.");
        }
        if (i <= 0) {
            if (i2 < 0) {
                throw new IndexOutOfBoundsException("Specified length cannot be negative.");
            }
            if (i2 > bArr.length - i) {
                throw new IndexOutOfBoundsException("Requested length exceeds buffer size at offset.");
            }
            int i3 = i2;
            while (i3 > 0 && this.d.size() > 0) {
                bArr[i] = this.d.remove().byteValue();
                i3--;
                i++;
            }
            if (i3 == 0) {
                return i2;
            }
            int a = a(bArr, i, i3);
            if (a == -1) {
                if (i3 == i2) {
                    return -1;
                }
                return i2 - i3;
            }
            return i2 - (i3 - a);
        }
        throw new IndexOutOfBoundsException("Specified offset cannot be negative.");
    }

    private int a(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int size = this.b - ((this.i.size() * 8) - this.a);
            int i4 = (size / 8) + (size % 8 != 0 ? 1 : 0);
            byte[] bArr2 = new byte[i4];
            int i5 = 0;
            while (i5 < i4) {
                int read = this.j.read(bArr2, i5, i4 - i5);
                if (read == -1) {
                    if (i3 == 0) {
                        return -1;
                    }
                    return i3;
                }
                i5 += read;
            }
            for (int i6 = 0; i6 < i4; i6++) {
                this.i.add(Byte.valueOf(bArr2[i6]));
            }
            int i7 = 0;
            int i8 = 0;
            while (true) {
                int i9 = this.b;
                if (i7 >= i9) {
                    break;
                }
                int min = Math.min(i9 - i7, 8 - this.a);
                byte byteValue = this.i.peek().byteValue();
                int i10 = this.a;
                i7 += min;
                int i11 = i10 + min;
                this.a = i11;
                if (i11 == 8) {
                    this.a = 0;
                    this.i.remove();
                }
                i8 |= ((((byteValue << i10) & PrivateKeyType.INVALID) >>> (8 - min)) & PrivateKeyType.INVALID) << (this.b - i7);
            }
            byte[] bArr3 = this.g.get(Integer.valueOf(i8));
            if (this.h.size() == 0) {
                this.b++;
            } else {
                if (bArr3 == null) {
                    this.h.write(this.h.toByteArray()[0]);
                } else {
                    this.h.write(bArr3[0]);
                }
                Map<Integer, byte[]> map = this.g;
                map.put(Integer.valueOf(map.size()), this.h.toByteArray());
                this.h.reset();
                int size2 = this.g.size();
                int i12 = this.b;
                if (size2 == (1 << i12)) {
                    this.b = i12 + 1;
                }
                if (bArr3 == null) {
                    bArr3 = this.g.get(Integer.valueOf(i8));
                }
            }
            for (byte b : bArr3) {
                if (i3 < i2) {
                    bArr[i3 + i] = b;
                    i3++;
                } else {
                    this.d.add(Byte.valueOf(b));
                }
            }
            this.h.write(bArr3);
        }
        return i3;
    }
}
