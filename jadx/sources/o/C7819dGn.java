package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Pair;
import kotlin.TypeCastException;

/* renamed from: o.dGn  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7819dGn implements Iterable<Pair<? extends String, ? extends String>>, dsK {
    public static final b a = new b(null);
    private final String[] d;

    private C7819dGn(String[] strArr) {
        this.d = strArr;
    }

    public /* synthetic */ C7819dGn(String[] strArr, C8627dsp c8627dsp) {
        this(strArr);
    }

    public final String a(String str) {
        C8632dsu.d((Object) str, "");
        return a.e(this.d, str);
    }

    public final int c() {
        return this.d.length / 2;
    }

    public final String c(int i) {
        return this.d[i * 2];
    }

    public final String a(int i) {
        return this.d[(i * 2) + 1];
    }

    public final Set<String> d() {
        Comparator d2;
        d2 = C8691duz.d(dsE.b);
        TreeSet treeSet = new TreeSet(d2);
        int c = c();
        for (int i = 0; i < c; i++) {
            treeSet.add(c(i));
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(treeSet);
        C8632dsu.b(unmodifiableSet, "");
        return unmodifiableSet;
    }

    public final List<String> b(String str) {
        List<String> i;
        boolean a2;
        C8632dsu.d((Object) str, "");
        int c = c();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < c; i2++) {
            a2 = C8691duz.a(str, c(i2), true);
            if (a2) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(a(i2));
            }
        }
        if (arrayList != null) {
            List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
            C8632dsu.b(unmodifiableList, "");
            return unmodifiableList;
        }
        i = C8569dql.i();
        return i;
    }

    @Override // java.lang.Iterable
    public Iterator<Pair<? extends String, ? extends String>> iterator() {
        int c = c();
        Pair[] pairArr = new Pair[c];
        for (int i = 0; i < c; i++) {
            pairArr[i] = dpD.a(c(i), a(i));
        }
        return C8621dsj.b(pairArr);
    }

    public final d e() {
        d dVar = new d();
        C8571dqn.e(dVar.a(), this.d);
        return dVar;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C7819dGn) && Arrays.equals(this.d, ((C7819dGn) obj).d);
    }

    public int hashCode() {
        return Arrays.hashCode(this.d);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int c = c();
        for (int i = 0; i < c; i++) {
            sb.append(c(i));
            sb.append(": ");
            sb.append(a(i));
            sb.append("\n");
        }
        String sb2 = sb.toString();
        C8632dsu.b(sb2, "");
        return sb2;
    }

    /* renamed from: o.dGn$d */
    /* loaded from: classes5.dex */
    public static final class d {
        private final List<String> e = new ArrayList(20);

        public final List<String> a() {
            return this.e;
        }

        public final d c(String str) {
            int b;
            C8632dsu.d((Object) str, "");
            b = duD.b((CharSequence) str, ':', 1, false, 4, (Object) null);
            if (b != -1) {
                String substring = str.substring(0, b);
                C8632dsu.b(substring, "");
                String substring2 = str.substring(b + 1);
                C8632dsu.b(substring2, "");
                e(substring, substring2);
            } else if (str.charAt(0) == ':') {
                String substring3 = str.substring(1);
                C8632dsu.b(substring3, "");
                e("", substring3);
            } else {
                e("", str);
            }
            return this;
        }

        public final d d(String str, String str2) {
            C8632dsu.d((Object) str, "");
            C8632dsu.d((Object) str2, "");
            b bVar = C7819dGn.a;
            bVar.d(str);
            bVar.c(str2, str);
            e(str, str2);
            return this;
        }

        public final d e(String str, String str2) {
            CharSequence n;
            C8632dsu.d((Object) str, "");
            C8632dsu.d((Object) str2, "");
            this.e.add(str);
            List<String> list = this.e;
            n = duD.n((CharSequence) str2);
            list.add(n.toString());
            return this;
        }

        public final d d(String str) {
            boolean a;
            C8632dsu.d((Object) str, "");
            int i = 0;
            while (i < this.e.size()) {
                a = C8691duz.a(str, this.e.get(i), true);
                if (a) {
                    this.e.remove(i);
                    this.e.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public final d b(String str, String str2) {
            C8632dsu.d((Object) str, "");
            C8632dsu.d((Object) str2, "");
            b bVar = C7819dGn.a;
            bVar.d(str);
            bVar.c(str2, str);
            d(str);
            e(str, str2);
            return this;
        }

        /* JADX WARN: Incorrect condition in loop: B:8:0x0036 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String e(java.lang.String r6) {
            /*
                r5 = this;
                java.lang.String r0 = ""
                o.C8632dsu.d(r6, r0)
                java.util.List<java.lang.String> r0 = r5.e
                int r0 = r0.size()
                r1 = 2
                int r0 = r0 - r1
                r2 = 0
                o.dth r0 = o.C8653dto.a(r0, r2)
                o.dth r0 = o.C8653dto.a(r0, r1)
                int r1 = r0.d()
                int r2 = r0.e()
                int r0 = r0.a()
                if (r0 < 0) goto L27
                if (r1 > r2) goto L46
                goto L29
            L27:
                if (r1 < r2) goto L46
            L29:
                java.util.List<java.lang.String> r3 = r5.e
                java.lang.Object r3 = r3.get(r1)
                java.lang.String r3 = (java.lang.String) r3
                r4 = 1
                boolean r3 = o.C8684dus.e(r6, r3, r4)
                if (r3 == 0) goto L42
                java.util.List<java.lang.String> r6 = r5.e
                int r1 = r1 + r4
                java.lang.Object r6 = r6.get(r1)
                java.lang.String r6 = (java.lang.String) r6
                return r6
            L42:
                if (r1 == r2) goto L46
                int r1 = r1 + r0
                goto L29
            L46:
                r6 = 0
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C7819dGn.d.e(java.lang.String):java.lang.String");
        }

        public final C7819dGn b() {
            Object[] array = this.e.toArray(new String[0]);
            if (array != null) {
                return new C7819dGn((String[]) array, null);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    /* renamed from: o.dGn$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Incorrect condition in loop: B:8:0x0026 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String e(java.lang.String[] r6, java.lang.String r7) {
            /*
                r5 = this;
                int r0 = r6.length
                r1 = 2
                int r0 = r0 - r1
                r2 = 0
                o.dth r0 = o.C8653dto.a(r0, r2)
                o.dth r0 = o.C8653dto.a(r0, r1)
                int r1 = r0.d()
                int r2 = r0.e()
                int r0 = r0.a()
                if (r0 < 0) goto L1d
                if (r1 > r2) goto L30
                goto L1f
            L1d:
                if (r1 < r2) goto L30
            L1f:
                r3 = r6[r1]
                r4 = 1
                boolean r3 = o.C8684dus.e(r7, r3, r4)
                if (r3 == 0) goto L2c
                int r1 = r1 + r4
                r6 = r6[r1]
                return r6
            L2c:
                if (r1 == r2) goto L30
                int r1 = r1 + r0
                goto L1f
            L30:
                r6 = 0
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C7819dGn.b.e(java.lang.String[], java.lang.String):java.lang.String");
        }

        public final C7819dGn c(String... strArr) {
            C8654dtp g;
            C8646dth d;
            CharSequence n;
            C8632dsu.d(strArr, "");
            if (strArr.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            Object clone = strArr.clone();
            if (clone == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            String[] strArr2 = (String[]) clone;
            int length = strArr2.length;
            for (int i = 0; i < length; i++) {
                String str = strArr2[i];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                if (str == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                n = duD.n((CharSequence) str);
                strArr2[i] = n.toString();
            }
            g = C8657dts.g(0, strArr2.length);
            d = C8657dts.d(g, 2);
            int d2 = d.d();
            int e = d.e();
            int a = d.a();
            if (a < 0 ? d2 >= e : d2 <= e) {
                while (true) {
                    String str2 = strArr2[d2];
                    String str3 = strArr2[d2 + 1];
                    d(str2);
                    c(str3, str2);
                    if (d2 == e) {
                        break;
                    }
                    d2 += a;
                }
            }
            return new C7819dGn(strArr2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if ('!' > charAt || '~' < charAt) {
                    throw new IllegalArgumentException(dGB.a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c(String str, String str2) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt != '\t' && (' ' > charAt || '~' < charAt)) {
                    throw new IllegalArgumentException(dGB.a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str).toString());
                }
            }
        }
    }
}
