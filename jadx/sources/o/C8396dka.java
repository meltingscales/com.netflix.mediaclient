package o;

import com.netflix.android.org.json.zip.JSONzip;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.dka  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8396dka extends OutputStream {
    private static final Map<b, Integer> c = new HashMap((int) JSONzip.end);
    private final OutputStream g;
    private final Map<b, Integer> d = new HashMap(c);
    private final ByteArrayOutputStream j = new ByteArrayOutputStream();
    private int a = 8;
    private final LinkedList<e> b = new LinkedList<>();
    private boolean f = false;
    private boolean e = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.dka$b */
    /* loaded from: classes5.dex */
    public static class b {
        private final int a;
        private final byte[] d;

        public int hashCode() {
            return this.a;
        }

        public b(byte[] bArr) {
            this.d = bArr;
            this.a = Arrays.hashCode(bArr);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof b) {
                return Arrays.equals(this.d, ((b) obj).d);
            }
            return false;
        }

        public String toString() {
            return Arrays.toString(this.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.dka$e */
    /* loaded from: classes5.dex */
    public static class e {
        public final int a;
        public final int b;

        public e(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public String toString() {
            return Integer.toHexString(this.a) + " (" + this.b + "b)";
        }
    }

    static {
        for (int i = 0; i < 256; i++) {
            c.put(new b(new byte[]{(byte) i}), Integer.valueOf(i));
        }
    }

    public C8396dka(OutputStream outputStream) {
        this.g = outputStream;
    }

    protected void finalize() {
        close();
        super.finalize();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.e) {
            return;
        }
        b();
        this.g.close();
        this.e = true;
    }

    public void b() {
        if (this.f) {
            return;
        }
        this.f = true;
        if (this.j.size() > 0) {
            this.b.add(new e(this.d.get(new b(this.j.toByteArray())).intValue(), this.a));
            flush();
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        write(new byte[]{(byte) (i & PrivateKeyType.INVALID)}, 0, 1);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        if (this.e) {
            throw new IOException("Output stream is closed.");
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Offset cannot be negative.");
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("Length cannot be negative.");
        }
        int i3 = i2 + i;
        if (i3 > bArr.length) {
            throw new IndexOutOfBoundsException("Offset plus length cannot be greater than the array length.");
        }
        while (i < i3) {
            byte b2 = bArr[i];
            this.j.write(b2);
            byte[] byteArray = this.j.toByteArray();
            b bVar = new b(byteArray);
            if (this.d.get(bVar) == null) {
                this.b.add(new e(this.d.get(new b(Arrays.copyOf(byteArray, byteArray.length - 1))).intValue(), this.a));
                int size = this.d.size();
                int i4 = this.a;
                if ((size >> i4) != 0) {
                    this.a = i4 + 1;
                }
                this.d.put(bVar, Integer.valueOf(size));
                this.j.reset();
                this.j.write(b2);
                if (this.b.size() > 100) {
                    flush();
                }
            }
            i++;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        if (this.b.isEmpty()) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        loop0: while (true) {
            int i = 0;
            while (this.b.size() > 0) {
                e remove = this.b.remove();
                linkedList.add(remove);
                i += remove.b;
                if (i % 8 == 0) {
                    break;
                }
            }
            this.g.write(c(linkedList));
            linkedList.clear();
        }
        if (this.f) {
            this.g.write(c(linkedList));
        } else {
            this.b.addAll(linkedList);
        }
    }

    private static byte[] c(LinkedList<e> linkedList) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte b2 = 0;
        int i = 8;
        while (linkedList.size() > 0) {
            e remove = linkedList.remove();
            int i2 = remove.b;
            while (i2 > 0) {
                if (i2 > i) {
                    i2 -= i;
                    byteArrayOutputStream.write((byte) (((remove.a >>> i2) & PrivateKeyType.INVALID) | b2));
                    b2 = 0;
                    i = 8;
                } else if (i2 <= i) {
                    int i3 = i - i2;
                    byte b3 = (byte) (((((remove.a << i3) & PrivateKeyType.INVALID) >>> (8 - i)) & PrivateKeyType.INVALID) | b2);
                    if (i3 == 0) {
                        byteArrayOutputStream.write(b3);
                        b2 = 0;
                        i = 8;
                    } else {
                        b2 = b3;
                        i = i3;
                    }
                    i2 = 0;
                }
            }
        }
        if (i < 8) {
            byteArrayOutputStream.write(b2);
        }
        return byteArrayOutputStream.toByteArray();
    }
}
