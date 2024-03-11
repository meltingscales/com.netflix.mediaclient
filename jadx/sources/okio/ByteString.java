package okio;

import java.io.EOFException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import o.C7867dIh;
import o.C7868dIi;
import o.C7872dIo;
import o.C8561dqd;
import o.C8627dsp;
import o.C8632dsu;
import o.C8691duz;
import o.dIN;
import o.dIl;

/* loaded from: classes5.dex */
public class ByteString implements Serializable, Comparable<ByteString> {
    public static final b c = new b(null);
    public static final ByteString e = new ByteString(new byte[0]);
    private static final long serialVersionUID = 1;
    private final byte[] a;
    private transient int b;
    private transient String d;

    public static final ByteString e(String str) {
        return c.e(str);
    }

    public final int a() {
        return this.b;
    }

    public final void c(int i) {
        this.b = i;
    }

    public final byte[] c() {
        return this.a;
    }

    public final void d(String str) {
        this.d = str;
    }

    public final String e() {
        return this.d;
    }

    public ByteString(byte[] bArr) {
        C8632dsu.c((Object) bArr, "");
        this.a = bArr;
    }

    public ByteString h() {
        return a("MD5");
    }

    public ByteString i() {
        return a("SHA-1");
    }

    public ByteString g() {
        return a("SHA-256");
    }

    public ByteString a(String str) {
        C8632dsu.c((Object) str, "");
        byte[] digest = MessageDigest.getInstance(str).digest(this.a);
        C8632dsu.a(digest, "");
        return new ByteString(digest);
    }

    public final byte a(int i) {
        return b(i);
    }

    public final int k() {
        return b();
    }

    public void b(C7872dIo c7872dIo, int i, int i2) {
        C8632dsu.c((Object) c7872dIo, "");
        dIN.d(this, c7872dIo, i, i2);
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        ByteString a = c.a(objectInputStream, objectInputStream.readInt());
        Field declaredField = ByteString.class.getDeclaredField("a");
        C8632dsu.a(declaredField, "");
        declaredField.setAccessible(true);
        declaredField.set(this, a.a);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.a.length);
        objectOutputStream.write(this.a);
    }

    /* loaded from: classes5.dex */
    public static final class b {
        public static /* synthetic */ ByteString c(b bVar, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = bArr.length;
            }
            return bVar.e(bArr, i, i2);
        }

        private b() {
        }

        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        public final ByteString e(String str, Charset charset) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) charset, "");
            byte[] bytes = str.getBytes(charset);
            C8632dsu.a(bytes, "");
            return new ByteString(bytes);
        }

        public final ByteString a(InputStream inputStream, int i) {
            C8632dsu.c((Object) inputStream, "");
            if (i < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + i).toString());
            }
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    throw new EOFException();
                }
                i2 += read;
            }
            return new ByteString(bArr);
        }

        public final ByteString e(byte[] bArr, int i, int i2) {
            C8632dsu.c((Object) bArr, "");
            C7868dIi.a(bArr.length, i, i2);
            return new ByteString(C8561dqd.b(bArr, i, i2 + i));
        }

        public final ByteString e(String str) {
            C8632dsu.c((Object) str, "");
            ByteString byteString = new ByteString(dIl.a(str));
            byteString.d(str);
            return byteString;
        }

        public final ByteString b(String str) {
            C8632dsu.c((Object) str, "");
            byte[] e = C7867dIh.e(str);
            if (e != null) {
                return new ByteString(e);
            }
            return null;
        }

        public final ByteString c(String str) {
            C8632dsu.c((Object) str, "");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((dIN.b(str.charAt(i2)) << 4) + dIN.b(str.charAt(i2 + 1)));
            }
            return new ByteString(bArr);
        }
    }

    public String m() {
        String e2 = e();
        if (e2 == null) {
            String a = dIl.a(f());
            d(a);
            return a;
        }
        return e2;
    }

    public String d() {
        return C7867dIh.e(c(), null, 1, null);
    }

    public String j() {
        char[] cArr = new char[c().length * 2];
        byte[] c2 = c();
        int length = c2.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = c2[i2];
            cArr[i] = dIN.b()[(b2 >> 4) & 15];
            cArr[i + 1] = dIN.b()[b2 & 15];
            i2++;
            i += 2;
        }
        return new String(cArr);
    }

    public ByteString o() {
        byte b2;
        for (int i = 0; i < c().length; i++) {
            byte b3 = c()[i];
            byte b4 = (byte) 65;
            if (b3 >= b4 && b3 <= (b2 = (byte) 90)) {
                byte[] c2 = c();
                byte[] copyOf = Arrays.copyOf(c2, c2.length);
                C8632dsu.a(copyOf, "");
                copyOf[i] = (byte) (b3 + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b5 = copyOf[i2];
                    if (b5 >= b4 && b5 <= b2) {
                        copyOf[i2] = (byte) (b5 + 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return this;
    }

    public byte b(int i) {
        return c()[i];
    }

    public int b() {
        return c().length;
    }

    public byte[] n() {
        byte[] c2 = c();
        byte[] copyOf = Arrays.copyOf(c2, c2.length);
        C8632dsu.a(copyOf, "");
        return copyOf;
    }

    public byte[] f() {
        return c();
    }

    public boolean e(int i, ByteString byteString, int i2, int i3) {
        C8632dsu.c((Object) byteString, "");
        return byteString.e(i2, c(), i, i3);
    }

    public boolean e(int i, byte[] bArr, int i2, int i3) {
        C8632dsu.c((Object) bArr, "");
        return i >= 0 && i <= c().length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C7868dIi.e(c(), i, bArr, i2, i3);
    }

    public final boolean d(ByteString byteString) {
        C8632dsu.c((Object) byteString, "");
        return e(0, byteString, 0, byteString.k());
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof ByteString)) {
                return false;
            }
            ByteString byteString = (ByteString) obj;
            if (byteString.k() != c().length || !byteString.e(0, c(), 0, c().length)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int a = a();
        if (a != 0) {
            return a;
        }
        int hashCode = Arrays.hashCode(c());
        c(hashCode);
        return hashCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030 A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(okio.ByteString r8) {
        /*
            r7 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r8, r0)
            int r0 = r7.k()
            int r1 = r8.k()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            if (r4 >= r2) goto L29
            byte r5 = r7.a(r4)
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r6 = r8.a(r4)
            r6 = r6 & 255(0xff, float:3.57E-43)
            if (r5 != r6) goto L26
            int r4 = r4 + 1
            goto L13
        L26:
            if (r5 >= r6) goto L30
            goto L2e
        L29:
            if (r0 != r1) goto L2c
            goto L31
        L2c:
            if (r0 >= r1) goto L30
        L2e:
            r3 = -1
            goto L31
        L30:
            r3 = 1
        L31:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.compareTo(okio.ByteString):int");
    }

    public String toString() {
        String b2;
        String b3;
        String b4;
        if (c().length == 0) {
            return "[size=0]";
        }
        int b5 = dIN.b(c(), 64);
        if (b5 == -1) {
            if (c().length <= 64) {
                return "[hex=" + j() + ']';
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[size=");
            sb.append(c().length);
            sb.append(" hex=");
            if (64 <= c().length) {
                sb.append((64 == c().length ? this : new ByteString(C8561dqd.b(c(), 0, 64))).j());
                sb.append("…]");
                return sb.toString();
            }
            throw new IllegalArgumentException(("endIndex > length(" + c().length + ')').toString());
        }
        String m = m();
        if (m != null) {
            String substring = m.substring(0, b5);
            C8632dsu.a(substring, "");
            b2 = C8691duz.b(substring, "\\", "\\\\", false, 4, (Object) null);
            b3 = C8691duz.b(b2, "\n", "\\n", false, 4, (Object) null);
            b4 = C8691duz.b(b3, "\r", "\\r", false, 4, (Object) null);
            if (b5 < m.length()) {
                return "[size=" + c().length + " text=" + b4 + "…]";
            }
            return "[text=" + b4 + ']';
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }
}
