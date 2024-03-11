package o;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: o.pg  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9443pg {
    static final char[] a = new char[0];
    private int b;
    private final C9382oY c;
    private char[] d;
    private boolean e;
    private char[] f;
    private char[] g;
    private int h;
    private int i;
    private String j;
    private ArrayList<char[]> k;

    /* renamed from: o  reason: collision with root package name */
    private int f13895o;

    public void b(int i) {
        this.b = i;
    }

    public int g() {
        return this.b;
    }

    public int i() {
        int i = this.h;
        if (i >= 0) {
            return i;
        }
        return 0;
    }

    public char[] j() {
        return this.d;
    }

    public boolean o() {
        return this.h >= 0 || this.f != null || this.j == null;
    }

    public C9443pg(C9382oY c9382oY) {
        this.c = c9382oY;
    }

    protected C9443pg(C9382oY c9382oY, char[] cArr) {
        this.c = c9382oY;
        this.d = cArr;
        this.b = cArr.length;
        this.h = -1;
    }

    public static C9443pg b(char[] cArr) {
        return new C9443pg(null, cArr);
    }

    public void m() {
        char[] cArr;
        this.h = -1;
        this.b = 0;
        this.i = 0;
        this.g = null;
        this.f = null;
        if (this.e) {
            n();
        }
        C9382oY c9382oY = this.c;
        if (c9382oY == null || (cArr = this.d) == null) {
            return;
        }
        this.d = null;
        c9382oY.d(2, cArr);
    }

    public void k() {
        this.h = -1;
        this.b = 0;
        this.i = 0;
        this.g = null;
        this.j = null;
        this.f = null;
        if (this.e) {
            n();
        }
    }

    public void b(char[] cArr, int i, int i2) {
        this.j = null;
        this.f = null;
        this.g = cArr;
        this.h = i;
        this.i = i2;
        if (this.e) {
            n();
        }
    }

    public void a(char[] cArr, int i, int i2) {
        this.g = null;
        this.h = -1;
        this.i = 0;
        this.j = null;
        this.f = null;
        if (this.e) {
            n();
        } else if (this.d == null) {
            this.d = a(i2);
        }
        this.f13895o = 0;
        this.b = 0;
        c(cArr, i, i2);
    }

    public void b(String str, int i, int i2) {
        this.g = null;
        this.h = -1;
        this.i = 0;
        this.j = null;
        this.f = null;
        if (this.e) {
            n();
        } else if (this.d == null) {
            this.d = a(i2);
        }
        this.f13895o = 0;
        this.b = 0;
        c(str, i, i2);
    }

    public void b(String str) {
        this.g = null;
        this.h = -1;
        this.i = 0;
        this.j = str;
        this.f = null;
        if (this.e) {
            n();
        }
        this.b = 0;
    }

    private char[] a(int i) {
        C9382oY c9382oY = this.c;
        if (c9382oY != null) {
            return c9382oY.a(2, i);
        }
        return new char[Math.max(i, 500)];
    }

    private void n() {
        this.e = false;
        this.k.clear();
        this.f13895o = 0;
        this.b = 0;
    }

    public int l() {
        if (this.h >= 0) {
            return this.i;
        }
        char[] cArr = this.f;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.j;
        return str != null ? str.length() : this.f13895o + this.b;
    }

    public char[] h() {
        if (this.h >= 0) {
            return this.g;
        }
        char[] cArr = this.f;
        if (cArr != null) {
            return cArr;
        }
        String str = this.j;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this.f = charArray;
            return charArray;
        } else if (this.e) {
            return b();
        } else {
            char[] cArr2 = this.d;
            return cArr2 == null ? a : cArr2;
        }
    }

    public String a() {
        if (this.j == null) {
            char[] cArr = this.f;
            if (cArr != null) {
                this.j = new String(cArr);
            } else {
                int i = this.h;
                if (i >= 0) {
                    int i2 = this.i;
                    if (i2 < 1) {
                        this.j = "";
                        return "";
                    }
                    this.j = new String(this.g, i, i2);
                } else {
                    int i3 = this.f13895o;
                    int i4 = this.b;
                    if (i3 == 0) {
                        this.j = i4 != 0 ? new String(this.d, 0, i4) : "";
                    } else {
                        StringBuilder sb = new StringBuilder(i3 + i4);
                        ArrayList<char[]> arrayList = this.k;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                char[] cArr2 = this.k.get(i5);
                                sb.append(cArr2, 0, cArr2.length);
                            }
                        }
                        sb.append(this.d, 0, this.b);
                        this.j = sb.toString();
                    }
                }
            }
        }
        return this.j;
    }

    public char[] b() {
        char[] cArr = this.f;
        if (cArr == null) {
            char[] p = p();
            this.f = p;
            return p;
        }
        return cArr;
    }

    public double b(boolean z) {
        return C9398oo.c(a(), z);
    }

    public float c(boolean z) {
        return C9398oo.e(a(), z);
    }

    public int d(boolean z) {
        char[] cArr;
        int i = this.h;
        if (i < 0 || (cArr = this.g) == null) {
            if (z) {
                return -C9398oo.e(this.d, 1, this.b - 1);
            }
            return C9398oo.e(this.d, 0, this.b);
        } else if (z) {
            return -C9398oo.e(cArr, i + 1, this.i - 1);
        } else {
            return C9398oo.e(cArr, i, this.i);
        }
    }

    public long e(boolean z) {
        char[] cArr;
        int i = this.h;
        if (i < 0 || (cArr = this.g) == null) {
            if (z) {
                return -C9398oo.a(this.d, 1, this.b - 1);
            }
            return C9398oo.a(this.d, 0, this.b);
        } else if (z) {
            return -C9398oo.a(cArr, i + 1, this.i - 1);
        } else {
            return C9398oo.a(cArr, i, this.i);
        }
    }

    public void e(char c) {
        if (this.h >= 0) {
            g(16);
        }
        this.j = null;
        this.f = null;
        char[] cArr = this.d;
        if (this.b >= cArr.length) {
            h(1);
            cArr = this.d;
        }
        int i = this.b;
        this.b = i + 1;
        cArr[i] = c;
    }

    public void c(char[] cArr, int i, int i2) {
        if (this.h >= 0) {
            g(i2);
        }
        this.j = null;
        this.f = null;
        char[] cArr2 = this.d;
        int length = cArr2.length;
        int i3 = this.b;
        int i4 = length - i3;
        if (i4 >= i2) {
            System.arraycopy(cArr, i, cArr2, i3, i2);
            this.b += i2;
            return;
        }
        if (i4 > 0) {
            System.arraycopy(cArr, i, cArr2, i3, i4);
            i += i4;
            i2 -= i4;
        }
        do {
            h(i2);
            int min = Math.min(this.d.length, i2);
            System.arraycopy(cArr, i, this.d, 0, min);
            this.b += min;
            i += min;
            i2 -= min;
        } while (i2 > 0);
    }

    public void c(String str, int i, int i2) {
        if (this.h >= 0) {
            g(i2);
        }
        this.j = null;
        this.f = null;
        char[] cArr = this.d;
        int length = cArr.length;
        int i3 = this.b;
        int i4 = length - i3;
        if (i4 >= i2) {
            str.getChars(i, i + i2, cArr, i3);
            this.b += i2;
            return;
        }
        if (i4 > 0) {
            int i5 = i + i4;
            str.getChars(i, i5, cArr, i3);
            i2 -= i4;
            i = i5;
        }
        while (true) {
            h(i2);
            int min = Math.min(this.d.length, i2);
            int i6 = i + min;
            str.getChars(i, i6, this.d, 0);
            this.b += min;
            i2 -= min;
            if (i2 <= 0) {
                return;
            }
            i = i6;
        }
    }

    public char[] f() {
        if (this.h >= 0) {
            g(1);
        } else {
            char[] cArr = this.d;
            if (cArr == null) {
                this.d = a(0);
            } else if (this.b >= cArr.length) {
                h(1);
            }
        }
        return this.d;
    }

    public char[] e() {
        this.h = -1;
        this.b = 0;
        this.i = 0;
        this.g = null;
        this.j = null;
        this.f = null;
        if (this.e) {
            n();
        }
        char[] cArr = this.d;
        if (cArr == null) {
            char[] a2 = a(0);
            this.d = a2;
            return a2;
        }
        return cArr;
    }

    public String d(int i) {
        this.b = i;
        if (this.f13895o > 0) {
            return a();
        }
        String str = i == 0 ? "" : new String(this.d, 0, i);
        this.j = str;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
        if (r0 > 65536) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public char[] d() {
        /*
            r2 = this;
            java.util.ArrayList<char[]> r0 = r2.k
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.k = r0
        Lb:
            r0 = 1
            r2.e = r0
            java.util.ArrayList<char[]> r0 = r2.k
            char[] r1 = r2.d
            r0.add(r1)
            char[] r0 = r2.d
            int r0 = r0.length
            int r1 = r2.f13895o
            int r1 = r1 + r0
            r2.f13895o = r1
            r1 = 0
            r2.b = r1
            int r1 = r0 >> 1
            int r0 = r0 + r1
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r1) goto L29
        L27:
            r0 = r1
            goto L2e
        L29:
            r1 = 65536(0x10000, float:9.18355E-41)
            if (r0 <= r1) goto L2e
            goto L27
        L2e:
            char[] r0 = r2.c(r0)
            r2.d = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9443pg.d():char[]");
    }

    public char[] c() {
        char[] cArr = this.d;
        int length = cArr.length;
        int i = (length >> 1) + length;
        if (i > 65536) {
            i = (length >> 2) + length;
        }
        char[] copyOf = Arrays.copyOf(cArr, i);
        this.d = copyOf;
        return copyOf;
    }

    public char[] e(int i) {
        char[] cArr = this.d;
        if (cArr.length >= i) {
            return cArr;
        }
        char[] copyOf = Arrays.copyOf(cArr, i);
        this.d = copyOf;
        return copyOf;
    }

    public String toString() {
        return a();
    }

    private void g(int i) {
        int i2 = this.i;
        this.i = 0;
        char[] cArr = this.g;
        this.g = null;
        int i3 = this.h;
        this.h = -1;
        int i4 = i + i2;
        char[] cArr2 = this.d;
        if (cArr2 == null || i4 > cArr2.length) {
            this.d = a(i4);
        }
        if (i2 > 0) {
            System.arraycopy(cArr, i3, this.d, 0, i2);
        }
        this.f13895o = 0;
        this.b = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
        if (r3 > 65536) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void h(int r3) {
        /*
            r2 = this;
            java.util.ArrayList<char[]> r3 = r2.k
            if (r3 != 0) goto Lb
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.k = r3
        Lb:
            char[] r3 = r2.d
            r0 = 1
            r2.e = r0
            java.util.ArrayList<char[]> r0 = r2.k
            r0.add(r3)
            int r0 = r2.f13895o
            int r1 = r3.length
            int r0 = r0 + r1
            r2.f13895o = r0
            r0 = 0
            r2.b = r0
            int r3 = r3.length
            int r0 = r3 >> 1
            int r3 = r3 + r0
            r0 = 500(0x1f4, float:7.0E-43)
            if (r3 >= r0) goto L28
        L26:
            r3 = r0
            goto L2d
        L28:
            r0 = 65536(0x10000, float:9.18355E-41)
            if (r3 <= r0) goto L2d
            goto L26
        L2d:
            char[] r3 = r2.c(r3)
            r2.d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9443pg.h(int):void");
    }

    private char[] p() {
        int i;
        String str = this.j;
        if (str != null) {
            return str.toCharArray();
        }
        int i2 = this.h;
        if (i2 >= 0) {
            int i3 = this.i;
            if (i3 < 1) {
                return a;
            }
            if (i2 == 0) {
                return Arrays.copyOf(this.g, i3);
            }
            return Arrays.copyOfRange(this.g, i2, i3 + i2);
        }
        int l = l();
        if (l < 1) {
            return a;
        }
        char[] c = c(l);
        ArrayList<char[]> arrayList = this.k;
        if (arrayList != null) {
            int size = arrayList.size();
            i = 0;
            for (int i4 = 0; i4 < size; i4++) {
                char[] cArr = this.k.get(i4);
                int length = cArr.length;
                System.arraycopy(cArr, 0, c, i, length);
                i += length;
            }
        } else {
            i = 0;
        }
        System.arraycopy(this.d, 0, c, i, this.b);
        return c;
    }

    private char[] c(int i) {
        return new char[i];
    }
}
