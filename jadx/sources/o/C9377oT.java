package o;

import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.oT  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9377oT {
    protected int[] a;
    protected int b;
    protected int c;
    protected boolean d;
    protected final boolean e;
    protected final C9377oT f;
    protected final boolean g;
    protected int h;
    protected int i;
    protected String[] j;
    protected int k;
    protected final int l;
    protected int m;
    protected final AtomicReference<c> n;

    /* renamed from: o  reason: collision with root package name */
    protected int f13888o;

    static int e(int i) {
        int i2 = i >> 2;
        if (i2 < 64) {
            return 4;
        }
        if (i2 <= 256) {
            return 5;
        }
        return i2 <= 1024 ? 6 : 7;
    }

    private final int h(int i) {
        return (i & (this.c - 1)) << 2;
    }

    private final int m() {
        int i = this.c;
        return (i << 3) - i;
    }

    public int a(int i, int i2) {
        int i3 = i + (i >>> 15);
        int i4 = ((i3 ^ (i3 >>> 9)) + (i2 * 33)) ^ this.l;
        int i5 = i4 + (i4 >>> 16);
        int i6 = i5 ^ (i5 >>> 4);
        return i6 + (i6 << 3);
    }

    public int b(int i) {
        int i2 = i ^ this.l;
        int i3 = i2 + (i2 >>> 16);
        int i4 = i3 ^ (i3 << 3);
        return i4 + (i4 >>> 12);
    }

    public int c(int i, int i2, int i3) {
        int i4 = i ^ this.l;
        int i5 = (((i4 + (i4 >>> 9)) * 31) + i2) * 33;
        int i6 = (i5 + (i5 >>> 15)) ^ i3;
        int i7 = i6 + (i6 >>> 4);
        int i8 = i7 + (i7 >>> 15);
        return i8 ^ (i8 << 9);
    }

    public boolean e() {
        return !this.d;
    }

    private C9377oT(int i, int i2) {
        this.f = null;
        this.b = 0;
        this.d = true;
        this.l = i2;
        this.g = false;
        this.e = true;
        int i3 = 16;
        if (i >= 16) {
            if (((i - 1) & i) != 0) {
                while (i3 < i) {
                    i3 += i3;
                }
            }
            this.n = new AtomicReference<>(c.e(i));
        }
        i = i3;
        this.n = new AtomicReference<>(c.e(i));
    }

    private C9377oT(C9377oT c9377oT, int i, c cVar, boolean z, boolean z2) {
        this.f = c9377oT;
        this.l = i;
        this.g = z;
        this.e = z2;
        this.n = null;
        this.b = cVar.b;
        int i2 = cVar.a;
        this.c = i2;
        int i3 = i2 << 2;
        this.i = i3;
        this.k = i3 + (i3 >> 1);
        this.f13888o = cVar.g;
        this.a = cVar.c;
        this.j = cVar.e;
        this.m = cVar.h;
        this.h = cVar.d;
        this.d = true;
    }

    public static C9377oT b() {
        long currentTimeMillis = System.currentTimeMillis();
        return a((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    protected static C9377oT a(int i) {
        return new C9377oT(64, i);
    }

    public C9377oT d(int i) {
        return new C9377oT(this, this.l, this.n.get(), JsonFactory.Feature.INTERN_FIELD_NAMES.a(i), JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.a(i));
    }

    public void a() {
        if (this.f == null || !e()) {
            return;
        }
        this.f.d(new c(this));
        this.d = true;
    }

    private void d(c cVar) {
        int i = cVar.b;
        c cVar2 = this.n.get();
        if (i == cVar2.b) {
            return;
        }
        if (i > 6000) {
            cVar = c.e(64);
        }
        MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.n, cVar2, cVar);
    }

    public int d() {
        int i = this.i;
        int i2 = 0;
        for (int i3 = 3; i3 < i; i3 += 4) {
            if (this.a[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    public int j() {
        int i = this.k;
        int i2 = 0;
        for (int i3 = this.i + 3; i3 < i; i3 += 4) {
            if (this.a[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    public int h() {
        int i = this.k + 3;
        int i2 = this.c;
        int i3 = 0;
        for (int i4 = i; i4 < i2 + i; i4 += 4) {
            if (this.a[i4] != 0) {
                i3++;
            }
        }
        return i3;
    }

    public int g() {
        return (this.m - m()) >> 2;
    }

    public int i() {
        int i = this.c;
        int i2 = 0;
        for (int i3 = 3; i3 < (i << 3); i3 += 4) {
            if (this.a[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    public String toString() {
        int d = d();
        int j = j();
        int h = h();
        int g = g();
        int i = i();
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", C9377oT.class.getName(), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(d), Integer.valueOf(j), Integer.valueOf(h), Integer.valueOf(g), Integer.valueOf(d + j + h + g), Integer.valueOf(i));
    }

    public String c(int i) {
        int h = h(b(i));
        int[] iArr = this.a;
        int i2 = iArr[h + 3];
        if (i2 == 1) {
            if (iArr[h] == i) {
                return this.j[h >> 2];
            }
        } else if (i2 == 0) {
            return null;
        }
        int i3 = this.i + ((h >> 3) << 2);
        int i4 = iArr[i3 + 3];
        if (i4 == 1) {
            if (iArr[i3] == i) {
                return this.j[i3 >> 2];
            }
        } else if (i4 == 0) {
            return null;
        }
        return c(h, i);
    }

    public String e(int i, int i2) {
        int h = h(a(i, i2));
        int[] iArr = this.a;
        int i3 = iArr[h + 3];
        if (i3 == 2) {
            if (i == iArr[h] && i2 == iArr[h + 1]) {
                return this.j[h >> 2];
            }
        } else if (i3 == 0) {
            return null;
        }
        int i4 = this.i + ((h >> 3) << 2);
        int i5 = iArr[i4 + 3];
        if (i5 == 2) {
            if (i == iArr[i4] && i2 == iArr[i4 + 1]) {
                return this.j[i4 >> 2];
            }
        } else if (i5 == 0) {
            return null;
        }
        return b(h, i, i2);
    }

    public String e(int i, int i2, int i3) {
        int h = h(c(i, i2, i3));
        int[] iArr = this.a;
        int i4 = iArr[h + 3];
        if (i4 == 3) {
            if (i == iArr[h] && iArr[h + 1] == i2 && iArr[h + 2] == i3) {
                return this.j[h >> 2];
            }
        } else if (i4 == 0) {
            return null;
        }
        int i5 = this.i + ((h >> 3) << 2);
        int i6 = iArr[i5 + 3];
        if (i6 == 3) {
            if (i == iArr[i5] && iArr[i5 + 1] == i2 && iArr[i5 + 2] == i3) {
                return this.j[i5 >> 2];
            }
        } else if (i6 == 0) {
            return null;
        }
        return d(h, i, i2, i3);
    }

    public String d(int[] iArr, int i) {
        if (i < 4) {
            if (i != 1) {
                if (i != 2) {
                    return i != 3 ? "" : e(iArr[0], iArr[1], iArr[2]);
                }
                return e(iArr[0], iArr[1]);
            }
            return c(iArr[0]);
        }
        int a = a(iArr, i);
        int h = h(a);
        int[] iArr2 = this.a;
        int i2 = iArr2[h + 3];
        if (a == iArr2[h] && i2 == i && c(iArr, i, iArr2[h + 1])) {
            return this.j[h >> 2];
        }
        if (i2 == 0) {
            return null;
        }
        int i3 = this.i + ((h >> 3) << 2);
        int i4 = iArr2[i3 + 3];
        if (a == iArr2[i3] && i4 == i && c(iArr, i, iArr2[i3 + 1])) {
            return this.j[i3 >> 2];
        }
        return a(h, a, iArr, i);
    }

    private String c(int i, int i2) {
        int i3 = this.k;
        int i4 = this.f13888o;
        int i5 = i3 + ((i >> (i4 + 2)) << i4);
        int[] iArr = this.a;
        for (int i6 = i5; i6 < (1 << i4) + i5; i6 += 4) {
            int i7 = iArr[i6 + 3];
            if (i2 == iArr[i6] && 1 == i7) {
                return this.j[i6 >> 2];
            }
            if (i7 == 0) {
                return null;
            }
        }
        for (int m = m(); m < this.m; m += 4) {
            if (i2 == iArr[m] && 1 == iArr[m + 3]) {
                return this.j[m >> 2];
            }
        }
        return null;
    }

    private String b(int i, int i2, int i3) {
        int i4 = this.k;
        int i5 = this.f13888o;
        int i6 = i4 + ((i >> (i5 + 2)) << i5);
        int[] iArr = this.a;
        for (int i7 = i6; i7 < (1 << i5) + i6; i7 += 4) {
            int i8 = iArr[i7 + 3];
            if (i2 == iArr[i7] && i3 == iArr[i7 + 1] && 2 == i8) {
                return this.j[i7 >> 2];
            }
            if (i8 == 0) {
                return null;
            }
        }
        for (int m = m(); m < this.m; m += 4) {
            if (i2 == iArr[m] && i3 == iArr[m + 1] && 2 == iArr[m + 3]) {
                return this.j[m >> 2];
            }
        }
        return null;
    }

    private String d(int i, int i2, int i3, int i4) {
        int i5 = this.k;
        int i6 = this.f13888o;
        int i7 = i5 + ((i >> (i6 + 2)) << i6);
        int[] iArr = this.a;
        for (int i8 = i7; i8 < (1 << i6) + i7; i8 += 4) {
            int i9 = iArr[i8 + 3];
            if (i2 == iArr[i8] && i3 == iArr[i8 + 1] && i4 == iArr[i8 + 2] && 3 == i9) {
                return this.j[i8 >> 2];
            }
            if (i9 == 0) {
                return null;
            }
        }
        for (int m = m(); m < this.m; m += 4) {
            if (i2 == iArr[m] && i3 == iArr[m + 1] && i4 == iArr[m + 2] && 3 == iArr[m + 3]) {
                return this.j[m >> 2];
            }
        }
        return null;
    }

    private String a(int i, int i2, int[] iArr, int i3) {
        int i4 = this.k;
        int i5 = this.f13888o;
        int i6 = i4 + ((i >> (i5 + 2)) << i5);
        int[] iArr2 = this.a;
        for (int i7 = i6; i7 < (1 << i5) + i6; i7 += 4) {
            int i8 = iArr2[i7 + 3];
            if (i2 == iArr2[i7] && i3 == i8 && c(iArr, i3, iArr2[i7 + 1])) {
                return this.j[i7 >> 2];
            }
            if (i8 == 0) {
                return null;
            }
        }
        for (int m = m(); m < this.m; m += 4) {
            if (i2 == iArr2[m] && i3 == iArr2[m + 3] && c(iArr, i3, iArr2[m + 1])) {
                return this.j[m >> 2];
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean c(int[] r6, int r7, int r8) {
        /*
            r5 = this;
            int[] r0 = r5.a
            r1 = 1
            r2 = 0
            switch(r7) {
                case 4: goto L3b;
                case 5: goto L2f;
                case 6: goto L23;
                case 7: goto L17;
                case 8: goto Lc;
                default: goto L7;
            }
        L7:
            boolean r6 = r5.a(r6, r7, r8)
            return r6
        Lc:
            r7 = r6[r2]
            r3 = r0[r8]
            if (r7 == r3) goto L13
            return r2
        L13:
            int r8 = r8 + 1
            r7 = r1
            goto L18
        L17:
            r7 = r2
        L18:
            int r3 = r7 + 1
            r7 = r6[r7]
            r4 = r0[r8]
            if (r7 == r4) goto L21
            return r2
        L21:
            int r8 = r8 + r1
            goto L24
        L23:
            r3 = r2
        L24:
            int r7 = r3 + 1
            r3 = r6[r3]
            r4 = r0[r8]
            if (r3 == r4) goto L2d
            return r2
        L2d:
            int r8 = r8 + r1
            goto L30
        L2f:
            r7 = r2
        L30:
            int r3 = r7 + 1
            r7 = r6[r7]
            r4 = r0[r8]
            if (r7 == r4) goto L39
            return r2
        L39:
            int r8 = r8 + r1
            goto L3c
        L3b:
            r3 = r2
        L3c:
            r7 = r6[r3]
            r4 = r0[r8]
            if (r7 == r4) goto L43
            return r2
        L43:
            int r7 = r3 + 1
            r7 = r6[r7]
            int r4 = r8 + 1
            r4 = r0[r4]
            if (r7 == r4) goto L4e
            return r2
        L4e:
            int r7 = r3 + 2
            r7 = r6[r7]
            int r4 = r8 + 2
            r4 = r0[r4]
            if (r7 == r4) goto L59
            return r2
        L59:
            int r3 = r3 + 3
            r6 = r6[r3]
            int r8 = r8 + 3
            r7 = r0[r8]
            if (r6 == r7) goto L64
            return r2
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9377oT.c(int[], int, int):boolean");
    }

    private boolean a(int[] iArr, int i, int i2) {
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (iArr[i3] != this.a[i2]) {
                return false;
            }
            if (i4 >= i) {
                return true;
            }
            i2++;
            i3 = i4;
        }
    }

    public String d(String str, int i) {
        o();
        if (this.g) {
            str = InternCache.e.b(str);
        }
        int i2 = i(b(i));
        int[] iArr = this.a;
        iArr[i2] = i;
        iArr[i2 + 3] = 1;
        this.j[i2 >> 2] = str;
        this.b++;
        return str;
    }

    public String a(String str, int i, int i2) {
        o();
        if (this.g) {
            str = InternCache.e.b(str);
        }
        int i3 = i(a(i, i2));
        int[] iArr = this.a;
        iArr[i3] = i;
        iArr[i3 + 1] = i2;
        iArr[i3 + 3] = 2;
        this.j[i3 >> 2] = str;
        this.b++;
        return str;
    }

    public String e(String str, int i, int i2, int i3) {
        o();
        if (this.g) {
            str = InternCache.e.b(str);
        }
        int i4 = i(c(i, i2, i3));
        int[] iArr = this.a;
        iArr[i4] = i;
        iArr[i4 + 1] = i2;
        iArr[i4 + 2] = i3;
        iArr[i4 + 3] = 3;
        this.j[i4 >> 2] = str;
        this.b++;
        return str;
    }

    public String c(String str, int[] iArr, int i) {
        int i2;
        o();
        if (this.g) {
            str = InternCache.e.b(str);
        }
        if (i == 1) {
            i2 = i(b(iArr[0]));
            int[] iArr2 = this.a;
            iArr2[i2] = iArr[0];
            iArr2[i2 + 3] = 1;
        } else if (i == 2) {
            i2 = i(a(iArr[0], iArr[1]));
            int[] iArr3 = this.a;
            iArr3[i2] = iArr[0];
            iArr3[i2 + 1] = iArr[1];
            iArr3[i2 + 3] = 2;
        } else if (i == 3) {
            int i3 = i(c(iArr[0], iArr[1], iArr[2]));
            int[] iArr4 = this.a;
            iArr4[i3] = iArr[0];
            iArr4[i3 + 1] = iArr[1];
            iArr4[i3 + 2] = iArr[2];
            iArr4[i3 + 3] = 3;
            i2 = i3;
        } else {
            int a = a(iArr, i);
            i2 = i(a);
            this.a[i2] = a;
            int e = e(iArr, i);
            int[] iArr5 = this.a;
            iArr5[i2 + 1] = e;
            iArr5[i2 + 3] = i;
        }
        this.j[i2 >> 2] = str;
        this.b++;
        return str;
    }

    private void o() {
        if (this.d) {
            if (this.f == null) {
                if (this.b == 0) {
                    throw new IllegalStateException("Cannot add names to Root symbol table");
                }
                throw new IllegalStateException("Cannot add names to Placeholder symbol table");
            }
            int[] iArr = this.a;
            this.a = Arrays.copyOf(iArr, iArr.length);
            String[] strArr = this.j;
            this.j = (String[]) Arrays.copyOf(strArr, strArr.length);
            this.d = false;
        }
    }

    private int i(int i) {
        int h = h(i);
        int[] iArr = this.a;
        if (iArr[h + 3] == 0) {
            return h;
        }
        if (f()) {
            return f(i);
        }
        int i2 = this.i + ((h >> 3) << 2);
        if (iArr[i2 + 3] == 0) {
            return i2;
        }
        int i3 = this.k;
        int i4 = this.f13888o;
        int i5 = i3 + ((h >> (i4 + 2)) << i4);
        for (int i6 = i5; i6 < (1 << i4) + i5; i6 += 4) {
            if (iArr[i6 + 3] == 0) {
                return i6;
            }
        }
        int i7 = this.m;
        int i8 = i7 + 4;
        this.m = i8;
        if (i8 >= (this.c << 3)) {
            if (this.e) {
                c();
            }
            return f(i);
        }
        return i7;
    }

    private int f(int i) {
        l();
        int h = h(i);
        int[] iArr = this.a;
        if (iArr[h + 3] == 0) {
            return h;
        }
        int i2 = this.i + ((h >> 3) << 2);
        if (iArr[i2 + 3] == 0) {
            return i2;
        }
        int i3 = this.k;
        int i4 = this.f13888o;
        int i5 = i3 + ((h >> (i4 + 2)) << i4);
        for (int i6 = i5; i6 < (1 << i4) + i5; i6 += 4) {
            if (iArr[i6 + 3] == 0) {
                return i6;
            }
        }
        int i7 = this.m;
        this.m = i7 + 4;
        return i7;
    }

    private boolean f() {
        if (this.b > (this.c >> 1)) {
            int i = this.m;
            int m = m();
            int i2 = this.b;
            return ((i - m) >> 2) > ((i2 + 1) >> 7) || ((double) i2) > ((double) this.c) * 0.8d;
        }
        return false;
    }

    private int e(int[] iArr, int i) {
        int i2 = this.h;
        int i3 = i2 + i;
        int[] iArr2 = this.a;
        if (i3 > iArr2.length) {
            int length = iArr2.length;
            this.a = Arrays.copyOf(this.a, this.a.length + Math.max(i3 - length, Math.min(4096, this.c)));
        }
        System.arraycopy(iArr, 0, this.a, i2, i);
        this.h += i;
        return i2;
    }

    public int a(int[] iArr, int i) {
        if (i < 4) {
            throw new IllegalArgumentException();
        }
        int i2 = iArr[0] ^ this.l;
        int i3 = i2 + (i2 >>> 9) + iArr[1];
        int i4 = ((i3 + (i3 >>> 15)) * 33) ^ iArr[2];
        int i5 = i4 + (i4 >>> 4);
        for (int i6 = 3; i6 < i; i6++) {
            int i7 = iArr[i6];
            i5 += i7 ^ (i7 >> 21);
        }
        int i8 = i5 * 65599;
        int i9 = i8 + (i8 >>> 19);
        return (i9 << 5) ^ i9;
    }

    private void l() {
        this.d = false;
        int[] iArr = this.a;
        String[] strArr = this.j;
        int i = this.c;
        int i2 = this.b;
        int i3 = i + i;
        int i4 = this.m;
        if (i3 > 65536) {
            e(true);
            return;
        }
        this.a = new int[iArr.length + (i << 3)];
        this.c = i3;
        int i5 = i3 << 2;
        this.i = i5;
        this.k = i5 + (i5 >> 1);
        this.f13888o = e(i3);
        this.j = new String[strArr.length << 1];
        e(false);
        int[] iArr2 = new int[16];
        int i6 = 0;
        for (int i7 = 0; i7 < i4; i7 += 4) {
            int i8 = iArr[i7 + 3];
            if (i8 != 0) {
                i6++;
                String str = strArr[i7 >> 2];
                if (i8 == 1) {
                    iArr2[0] = iArr[i7];
                    c(str, iArr2, 1);
                } else if (i8 == 2) {
                    iArr2[0] = iArr[i7];
                    iArr2[1] = iArr[i7 + 1];
                    c(str, iArr2, 2);
                } else if (i8 == 3) {
                    iArr2[0] = iArr[i7];
                    iArr2[1] = iArr[i7 + 1];
                    iArr2[2] = iArr[i7 + 2];
                    c(str, iArr2, 3);
                } else {
                    if (i8 > iArr2.length) {
                        iArr2 = new int[i8];
                    }
                    System.arraycopy(iArr, iArr[i7 + 1], iArr2, 0, i8);
                    c(str, iArr2, i8);
                }
            }
        }
        if (i6 == i2) {
            return;
        }
        throw new IllegalStateException("Failed rehash(): old count=" + i2 + ", copyCount=" + i6);
    }

    private void e(boolean z) {
        this.b = 0;
        this.m = m();
        this.h = this.c << 3;
        if (z) {
            Arrays.fill(this.a, 0);
            Arrays.fill(this.j, (Object) null);
        }
    }

    protected void c() {
        if (this.c <= 1024) {
            return;
        }
        throw new IllegalStateException("Spill-over slots in symbol table with " + this.b + " entries, hash area of " + this.c + " slots is now full (all " + (this.c >> 3) + " slots -- suspect a DoS attack based on hash collisions. You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.oT$c */
    /* loaded from: classes2.dex */
    public static final class c {
        public final int a;
        public final int b;
        public final int[] c;
        public final int d;
        public final String[] e;
        public final int g;
        public final int h;

        public c(int i, int i2, int i3, int[] iArr, String[] strArr, int i4, int i5) {
            this.a = i;
            this.b = i2;
            this.g = i3;
            this.c = iArr;
            this.e = strArr;
            this.h = i4;
            this.d = i5;
        }

        public c(C9377oT c9377oT) {
            this.a = c9377oT.c;
            this.b = c9377oT.b;
            this.g = c9377oT.f13888o;
            this.c = c9377oT.a;
            this.e = c9377oT.j;
            this.h = c9377oT.m;
            this.d = c9377oT.h;
        }

        public static c e(int i) {
            int i2 = i << 3;
            return new c(i, 0, C9377oT.e(i), new int[i2], new String[i << 1], i2 - i, i2);
        }
    }
}
