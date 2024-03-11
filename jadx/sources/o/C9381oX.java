package o;

import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.oX  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9381oX {
    protected boolean a;
    protected int b;
    protected final int c;
    protected e[] d;
    protected boolean e;
    protected BitSet f;
    protected int g;
    protected final C9381oX h;
    protected int i;
    protected final int j;
    protected int m;
    protected String[] n;

    /* renamed from: o  reason: collision with root package name */
    protected final AtomicReference<c> f13889o;

    private static int d(int i) {
        return i - (i >> 2);
    }

    public int a(int i) {
        int i2 = i + (i >>> 15);
        int i3 = i2 ^ (i2 << 7);
        return (i3 + (i3 >>> 3)) & this.b;
    }

    public int c() {
        return this.j;
    }

    public boolean d() {
        return !this.a;
    }

    private C9381oX(int i) {
        this.h = null;
        this.j = i;
        this.e = true;
        this.c = -1;
        this.a = false;
        this.g = 0;
        this.f13889o = new AtomicReference<>(c.d(64));
    }

    private C9381oX(C9381oX c9381oX, int i, int i2, c cVar) {
        this.h = c9381oX;
        this.j = i2;
        this.f13889o = null;
        this.c = i;
        this.e = JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.a(i);
        String[] strArr = cVar.b;
        this.n = strArr;
        this.d = cVar.e;
        this.i = cVar.a;
        this.g = cVar.d;
        int length = strArr.length;
        this.m = d(length);
        this.b = length - 1;
        this.a = true;
    }

    public static C9381oX a() {
        long currentTimeMillis = System.currentTimeMillis();
        return c((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    protected static C9381oX c(int i) {
        return new C9381oX(i);
    }

    public C9381oX e(int i) {
        return new C9381oX(this, i, this.j, this.f13889o.get());
    }

    public void e() {
        C9381oX c9381oX;
        if (d() && (c9381oX = this.h) != null && this.e) {
            c9381oX.e(new c(this));
            this.a = true;
        }
    }

    private void e(c cVar) {
        int i = cVar.a;
        c cVar2 = this.f13889o.get();
        if (i == cVar2.a) {
            return;
        }
        if (i > 12000) {
            cVar = c.d(64);
        }
        MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.f13889o, cVar2, cVar);
    }

    public String e(char[] cArr, int i, int i2, int i3) {
        if (i2 < 1) {
            return "";
        }
        if (!this.e) {
            return new String(cArr, i, i2);
        }
        int a = a(i3);
        String str = this.n[a];
        if (str != null) {
            if (str.length() == i2) {
                int i4 = 0;
                while (str.charAt(i4) == cArr[i + i4]) {
                    i4++;
                    if (i4 == i2) {
                        return str;
                    }
                }
            }
            e eVar = this.d[a >> 1];
            if (eVar != null) {
                String c2 = eVar.c(cArr, i, i2);
                if (c2 != null) {
                    return c2;
                }
                String c3 = c(cArr, i, i2, eVar.e);
                if (c3 != null) {
                    return c3;
                }
            }
        }
        return b(cArr, i, i2, i3, a);
    }

    private String c(char[] cArr, int i, int i2, e eVar) {
        while (eVar != null) {
            String c2 = eVar.c(cArr, i, i2);
            if (c2 != null) {
                return c2;
            }
            eVar = eVar.e;
        }
        return null;
    }

    private String b(char[] cArr, int i, int i2, int i3, int i4) {
        if (this.a) {
            b();
            this.a = false;
        } else if (this.i >= this.m) {
            g();
            i4 = a(a(cArr, i, i2));
        }
        String str = new String(cArr, i, i2);
        if (JsonFactory.Feature.INTERN_FIELD_NAMES.a(this.c)) {
            str = InternCache.e.b(str);
        }
        this.i++;
        String[] strArr = this.n;
        if (strArr[i4] == null) {
            strArr[i4] = str;
        } else {
            int i5 = i4 >> 1;
            e eVar = new e(str, this.d[i5]);
            int i6 = eVar.c;
            if (i6 > 150) {
                a(i5, eVar, i4);
            } else {
                this.d[i5] = eVar;
                this.g = Math.max(i6, this.g);
            }
        }
        return str;
    }

    private void a(int i, e eVar, int i2) {
        BitSet bitSet = this.f;
        if (bitSet == null) {
            BitSet bitSet2 = new BitSet();
            this.f = bitSet2;
            bitSet2.set(i);
        } else if (bitSet.get(i)) {
            if (JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.a(this.c)) {
                b(150);
            }
            this.e = false;
        } else {
            this.f.set(i);
        }
        this.n[i2] = eVar.d;
        this.d[i] = null;
        this.i -= eVar.c;
        this.g = -1;
    }

    public int a(char[] cArr, int i, int i2) {
        int i3 = this.j;
        for (int i4 = i; i4 < i2 + i; i4++) {
            i3 = (i3 * 33) + cArr[i4];
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    public int e(String str) {
        int length = str.length();
        int i = this.j;
        for (int i2 = 0; i2 < length; i2++) {
            i = (i * 33) + str.charAt(i2);
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    private void b() {
        String[] strArr = this.n;
        this.n = (String[]) Arrays.copyOf(strArr, strArr.length);
        e[] eVarArr = this.d;
        this.d = (e[]) Arrays.copyOf(eVarArr, eVarArr.length);
    }

    private void g() {
        String[] strArr = this.n;
        int length = strArr.length;
        int i = length + length;
        if (i > 65536) {
            this.i = 0;
            this.e = false;
            this.n = new String[64];
            this.d = new e[32];
            this.b = 63;
            this.a = false;
            return;
        }
        e[] eVarArr = this.d;
        this.n = new String[i];
        this.d = new e[i >> 1];
        this.b = i - 1;
        this.m = d(i);
        int i2 = 0;
        int i3 = 0;
        for (String str : strArr) {
            if (str != null) {
                i3++;
                int a = a(e(str));
                String[] strArr2 = this.n;
                if (strArr2[a] == null) {
                    strArr2[a] = str;
                } else {
                    int i4 = a >> 1;
                    e eVar = new e(str, this.d[i4]);
                    this.d[i4] = eVar;
                    i2 = Math.max(i2, eVar.c);
                }
            }
        }
        for (int i5 = 0; i5 < (length >> 1); i5++) {
            for (e eVar2 = eVarArr[i5]; eVar2 != null; eVar2 = eVar2.e) {
                i3++;
                String str2 = eVar2.d;
                int a2 = a(e(str2));
                String[] strArr3 = this.n;
                if (strArr3[a2] == null) {
                    strArr3[a2] = str2;
                } else {
                    int i6 = a2 >> 1;
                    e eVar3 = new e(str2, this.d[i6]);
                    this.d[i6] = eVar3;
                    i2 = Math.max(i2, eVar3.c);
                }
            }
        }
        this.g = i2;
        this.f = null;
        int i7 = this.i;
        if (i3 != i7) {
            throw new IllegalStateException(String.format("Internal error on SymbolTable.rehash(): had %d entries; now have %d", Integer.valueOf(i7), Integer.valueOf(i3)));
        }
    }

    protected void b(int i) {
        throw new IllegalStateException("Longest collision chain in symbol table (of size " + this.i + ") now exceeds maximum, " + i + " -- suspect a DoS attack based on hash collisions");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.oX$e */
    /* loaded from: classes2.dex */
    public static final class e {
        public final int c;
        public final String d;
        public final e e;

        public e(String str, e eVar) {
            this.d = str;
            this.e = eVar;
            this.c = eVar != null ? 1 + eVar.c : 1;
        }

        public String c(char[] cArr, int i, int i2) {
            if (this.d.length() != i2) {
                return null;
            }
            int i3 = 0;
            while (this.d.charAt(i3) == cArr[i + i3]) {
                i3++;
                if (i3 >= i2) {
                    return this.d;
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.oX$c */
    /* loaded from: classes2.dex */
    public static final class c {
        final int a;
        final String[] b;
        final int d;
        final e[] e;

        public c(int i, int i2, String[] strArr, e[] eVarArr) {
            this.a = i;
            this.d = i2;
            this.b = strArr;
            this.e = eVarArr;
        }

        public c(C9381oX c9381oX) {
            this.a = c9381oX.i;
            this.d = c9381oX.g;
            this.b = c9381oX.n;
            this.e = c9381oX.d;
        }

        public static c d(int i) {
            return new c(0, 0, new String[i], new e[i >> 1]);
        }
    }
}
