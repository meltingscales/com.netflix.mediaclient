package o;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class dvG<K, V> {
    public static final b a = new b(null);
    private static final dvG b = new dvG(0, 0, new Object[0]);
    private Object[] c;
    private int d;
    private int e;
    private final C8729dwj h;

    private final boolean a(int i) {
        return (i & this.e) != 0;
    }

    public final boolean c(int i) {
        return (i & this.d) != 0;
    }

    public final Object[] e() {
        return this.c;
    }

    public dvG(int i, int i2, Object[] objArr, C8729dwj c8729dwj) {
        C8632dsu.c((Object) objArr, "");
        this.d = i;
        this.e = i2;
        this.h = c8729dwj;
        this.c = objArr;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dvG(int i, int i2, Object[] objArr) {
        this(i, i2, objArr, null);
        C8632dsu.c((Object) objArr, "");
    }

    public final int b() {
        return Integer.bitCount(this.d);
    }

    public final int b(int i) {
        return Integer.bitCount((i - 1) & this.d) * 2;
    }

    public final int d(int i) {
        return (this.c.length - 1) - Integer.bitCount((i - 1) & this.e);
    }

    private final K j(int i) {
        return (K) this.c[i];
    }

    private final V i(int i) {
        return (V) this.c[i + 1];
    }

    public final dvG<K, V> e(int i) {
        Object obj = this.c[i];
        if (obj != null) {
            return (dvG) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
    }

    private final dvG<K, V> a(int i, K k, V v, C8729dwj c8729dwj) {
        int b2 = b(i);
        if (this.h == c8729dwj) {
            this.c = dvJ.b(this.c, b2, k, v);
            this.d = i | this.d;
            return this;
        }
        return new dvG<>(i | this.d, this.e, dvJ.b(this.c, b2, k, v), c8729dwj);
    }

    private final dvG<K, V> d(int i, V v, C8707dvo<K, V> c8707dvo) {
        if (this.h == c8707dvo.d()) {
            this.c[i + 1] = v;
            return this;
        }
        c8707dvo.b(c8707dvo.a() + 1);
        Object[] objArr = this.c;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        C8632dsu.a(copyOf, "");
        copyOf[i + 1] = v;
        return new dvG<>(this.d, this.e, copyOf, c8707dvo.d());
    }

    private final dvG<K, V> e(int i, dvG<K, V> dvg, C8729dwj c8729dwj) {
        C8725dwf.d(dvg.h == c8729dwj);
        Object[] objArr = this.c;
        if (objArr.length == 1 && dvg.c.length == 2 && dvg.e == 0) {
            dvg.d = this.e;
            return dvg;
        } else if (this.h == c8729dwj) {
            objArr[i] = dvg;
            return this;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            C8632dsu.a(copyOf, "");
            copyOf[i] = dvg;
            return new dvG<>(this.d, this.e, copyOf, c8729dwj);
        }
    }

    private final dvG<K, V> a(int i, int i2, C8729dwj c8729dwj) {
        Object[] objArr = this.c;
        if (objArr.length == 1) {
            return null;
        }
        if (this.h == c8729dwj) {
            this.c = dvJ.d(objArr, i);
            this.e ^= i2;
            return this;
        }
        return new dvG<>(this.d, i2 ^ this.e, dvJ.d(objArr, i), c8729dwj);
    }

    private final Object[] d(int i, int i2, int i3, K k, V v, int i4, C8729dwj c8729dwj) {
        K j = j(i);
        return dvJ.b(this.c, i, d(i2) + 1, e(j == null ? 0 : j.hashCode(), j, i(i), i3, k, v, i4 + 5, c8729dwj));
    }

    private final dvG<K, V> c(int i, int i2, int i3, K k, V v, int i4, C8729dwj c8729dwj) {
        if (this.h == c8729dwj) {
            this.c = d(i, i2, i3, k, v, i4, c8729dwj);
            this.d ^= i2;
            this.e |= i2;
            return this;
        }
        return new dvG<>(this.d ^ i2, i2 | this.e, d(i, i2, i3, k, v, i4, c8729dwj), c8729dwj);
    }

    private final dvG<K, V> e(int i, K k, V v, int i2, K k2, V v2, int i3, C8729dwj c8729dwj) {
        if (i3 > 30) {
            return new dvG<>(0, 0, new Object[]{k, v, k2, v2}, c8729dwj);
        }
        int b2 = dvJ.b(i, i3);
        int b3 = dvJ.b(i2, i3);
        if (b2 != b3) {
            return new dvG<>((1 << b2) | (1 << b3), 0, b2 < b3 ? new Object[]{k, v, k2, v2} : new Object[]{k2, v2, k, v}, c8729dwj);
        }
        return new dvG<>(0, 1 << b2, new Object[]{e(i, k, v, i2, k2, v2, i3 + 5, c8729dwj)}, c8729dwj);
    }

    private final dvG<K, V> b(int i, int i2, C8707dvo<K, V> c8707dvo) {
        c8707dvo.a(c8707dvo.size() - 1);
        c8707dvo.d(i(i));
        if (this.c.length == 2) {
            return null;
        }
        if (this.h == c8707dvo.d()) {
            this.c = dvJ.a(this.c, i);
            this.d ^= i2;
            return this;
        }
        return new dvG<>(i2 ^ this.d, this.e, dvJ.a(this.c, i), c8707dvo.d());
    }

    private final dvG<K, V> e(int i, C8707dvo<K, V> c8707dvo) {
        c8707dvo.a(c8707dvo.size() - 1);
        c8707dvo.d(i(i));
        if (this.c.length == 2) {
            return null;
        }
        if (this.h == c8707dvo.d()) {
            this.c = dvJ.a(this.c, i);
            return this;
        }
        return new dvG<>(0, 0, dvJ.a(this.c, i), c8707dvo.d());
    }

    private final int c(Object obj) {
        C8654dtp g;
        C8646dth d;
        g = C8657dts.g(0, this.c.length);
        d = C8657dts.d(g, 2);
        int d2 = d.d();
        int e = d.e();
        int a2 = d.a();
        if ((a2 <= 0 || d2 > e) && (a2 >= 0 || e > d2)) {
            return -1;
        }
        while (!C8632dsu.c(obj, j(d2))) {
            if (d2 == e) {
                return -1;
            }
            d2 += a2;
        }
        return d2;
    }

    private final boolean d(K k) {
        return c(k) != -1;
    }

    private final V b(K k) {
        int c = c(k);
        if (c != -1) {
            return i(c);
        }
        return null;
    }

    private final dvG<K, V> a(K k, V v, C8707dvo<K, V> c8707dvo) {
        int c = c(k);
        if (c != -1) {
            c8707dvo.d(i(c));
            if (this.h == c8707dvo.d()) {
                this.c[c + 1] = v;
                return this;
            }
            c8707dvo.b(c8707dvo.a() + 1);
            Object[] objArr = this.c;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            C8632dsu.a(copyOf, "");
            copyOf[c + 1] = v;
            return new dvG<>(0, 0, copyOf, c8707dvo.d());
        }
        c8707dvo.a(c8707dvo.size() + 1);
        return new dvG<>(0, 0, dvJ.b(this.c, 0, k, v), c8707dvo.d());
    }

    private final dvG<K, V> c(K k, C8707dvo<K, V> c8707dvo) {
        int c = c(k);
        return c != -1 ? e(c, c8707dvo) : this;
    }

    private final dvG<K, V> b(K k, V v, C8707dvo<K, V> c8707dvo) {
        int c = c(k);
        return (c == -1 || !C8632dsu.c(v, i(c))) ? this : e(c, c8707dvo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final dvG<K, V> b(dvG<K, V> dvg, C8722dwc c8722dwc, C8729dwj c8729dwj) {
        C8654dtp g;
        C8646dth d;
        C8725dwf.d(this.e == 0);
        C8725dwf.d(this.d == 0);
        C8725dwf.d(dvg.e == 0);
        C8725dwf.d(dvg.d == 0);
        Object[] objArr = this.c;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + dvg.c.length);
        C8632dsu.a(copyOf, "");
        int length = this.c.length;
        g = C8657dts.g(0, dvg.c.length);
        d = C8657dts.d(g, 2);
        int d2 = d.d();
        int e = d.e();
        int a2 = d.a();
        if ((a2 > 0 && d2 <= e) || (a2 < 0 && e <= d2)) {
            while (true) {
                if (!d((dvG<K, V>) dvg.c[d2])) {
                    Object[] objArr2 = dvg.c;
                    copyOf[length] = objArr2[d2];
                    copyOf[length + 1] = objArr2[d2 + 1];
                    length += 2;
                } else {
                    c8722dwc.c(c8722dwc.d() + 1);
                }
                if (d2 == e) {
                    break;
                }
                d2 += a2;
            }
        }
        if (length == this.c.length) {
            return this;
        }
        if (length == dvg.c.length) {
            return dvg;
        }
        if (length == copyOf.length) {
            return new dvG<>(0, 0, copyOf, c8729dwj);
        }
        Object[] copyOf2 = Arrays.copyOf(copyOf, length);
        C8632dsu.a(copyOf2, "");
        return new dvG<>(0, 0, copyOf2, c8729dwj);
    }

    private final dvG<K, V> d(dvG<K, V> dvg, int i, int i2, C8722dwc c8722dwc, C8707dvo<K, V> c8707dvo) {
        if (a(i)) {
            dvG<K, V> e = e(d(i));
            if (dvg.a(i)) {
                return e.b(dvg.e(dvg.d(i)), i2 + 5, c8722dwc, c8707dvo);
            }
            if (dvg.c(i)) {
                int b2 = dvg.b(i);
                K j = dvg.j(b2);
                V i3 = dvg.i(b2);
                int size = c8707dvo.size();
                dvG<K, V> b3 = e.b(j != null ? j.hashCode() : 0, j, i3, i2 + 5, c8707dvo);
                if (c8707dvo.size() == size) {
                    c8722dwc.c(c8722dwc.d() + 1);
                    return b3;
                }
                return b3;
            }
            return e;
        } else if (dvg.a(i)) {
            dvG<K, V> e2 = dvg.e(dvg.d(i));
            if (c(i)) {
                int b4 = b(i);
                K j2 = j(b4);
                int i4 = i2 + 5;
                if (!e2.d(j2 == null ? 0 : j2.hashCode(), (int) j2, i4)) {
                    return e2.b(j2 != null ? j2.hashCode() : 0, j2, i(b4), i4, c8707dvo);
                }
                c8722dwc.c(c8722dwc.d() + 1);
            }
            return e2;
        } else {
            int b5 = b(i);
            K j3 = j(b5);
            V i5 = i(b5);
            int b6 = dvg.b(i);
            K j4 = dvg.j(b6);
            return e(j3 == null ? 0 : j3.hashCode(), j3, i5, j4 != null ? j4.hashCode() : 0, j4, dvg.i(b6), i2 + 5, c8707dvo.d());
        }
    }

    private final int a() {
        if (this.e == 0) {
            return this.c.length / 2;
        }
        int bitCount = Integer.bitCount(this.d);
        int length = this.c.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += e(i).a();
        }
        return bitCount;
    }

    private final boolean c(dvG<K, V> dvg) {
        if (this == dvg) {
            return true;
        }
        if (this.e == dvg.e && this.d == dvg.d) {
            int length = this.c.length;
            for (int i = 0; i < length; i++) {
                if (this.c[i] != dvg.c[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, K k, int i2) {
        int b2 = 1 << dvJ.b(i, i2);
        if (c(b2)) {
            return C8632dsu.c(k, j(b(b2)));
        }
        if (a(b2)) {
            dvG<K, V> e = e(d(b2));
            if (i2 == 30) {
                return e.d((dvG<K, V>) k);
            }
            return e.d(i, (int) k, i2 + 5);
        }
        return false;
    }

    public final V e(int i, K k, int i2) {
        int b2 = 1 << dvJ.b(i, i2);
        if (c(b2)) {
            int b3 = b(b2);
            if (C8632dsu.c(k, j(b3))) {
                return i(b3);
            }
            return null;
        } else if (a(b2)) {
            dvG<K, V> e = e(d(b2));
            if (i2 == 30) {
                return e.b((dvG<K, V>) k);
            }
            return e.e(i, (int) k, i2 + 5);
        } else {
            return null;
        }
    }

    public final dvG<K, V> b(dvG<K, V> dvg, int i, C8722dwc c8722dwc, C8707dvo<K, V> c8707dvo) {
        C8632dsu.c((Object) dvg, "");
        C8632dsu.c((Object) c8722dwc, "");
        C8632dsu.c((Object) c8707dvo, "");
        if (this == dvg) {
            c8722dwc.a(a());
            return this;
        } else if (i > 30) {
            return b(dvg, c8722dwc, c8707dvo.d());
        } else {
            int i2 = this.e | dvg.e;
            int i3 = this.d;
            int i4 = dvg.d;
            int i5 = i3 & i4;
            int i6 = (i3 ^ i4) & (~i2);
            while (i5 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i5);
                if (C8632dsu.c(j(b(lowestOneBit)), dvg.j(dvg.b(lowestOneBit)))) {
                    i6 |= lowestOneBit;
                } else {
                    i2 |= lowestOneBit;
                }
                i5 ^= lowestOneBit;
            }
            if ((i2 & i6) != 0) {
                throw new IllegalStateException("Check failed.".toString());
            }
            dvG<K, V> dvg2 = (C8632dsu.c(this.h, c8707dvo.d()) && this.d == i6 && this.e == i2) ? this : new dvG<>(i6, i2, new Object[(Integer.bitCount(i6) * 2) + Integer.bitCount(i2)]);
            int i7 = 0;
            int i8 = i2;
            int i9 = 0;
            while (i8 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i8);
                dvg2.e()[(dvg2.e().length - 1) - i9] = d(dvg, lowestOneBit2, i, c8722dwc, c8707dvo);
                i9++;
                i8 ^= lowestOneBit2;
            }
            while (i6 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i6);
                int i10 = i7 * 2;
                if (!dvg.c(lowestOneBit3)) {
                    int b2 = b(lowestOneBit3);
                    dvg2.e()[i10] = j(b2);
                    dvg2.e()[i10 + 1] = i(b2);
                } else {
                    int b3 = dvg.b(lowestOneBit3);
                    dvg2.e()[i10] = dvg.j(b3);
                    dvg2.e()[i10 + 1] = dvg.i(b3);
                    if (c(lowestOneBit3)) {
                        c8722dwc.c(c8722dwc.d() + 1);
                    }
                }
                i7++;
                i6 ^= lowestOneBit3;
            }
            return c((dvG) dvg2) ? this : dvg.c((dvG) dvg2) ? dvg : dvg2;
        }
    }

    public final dvG<K, V> b(int i, K k, V v, int i2, C8707dvo<K, V> c8707dvo) {
        dvG<K, V> b2;
        C8632dsu.c((Object) c8707dvo, "");
        int b3 = 1 << dvJ.b(i, i2);
        if (c(b3)) {
            int b4 = b(b3);
            if (C8632dsu.c(k, j(b4))) {
                c8707dvo.d(i(b4));
                return i(b4) == v ? this : d(b4, (int) v, (C8707dvo<K, int>) c8707dvo);
            }
            c8707dvo.a(c8707dvo.size() + 1);
            return c(b4, b3, i, k, v, i2, c8707dvo.d());
        } else if (a(b3)) {
            int d = d(b3);
            dvG<K, V> e = e(d);
            if (i2 == 30) {
                b2 = e.a((dvG<K, V>) k, (K) v, (C8707dvo<dvG<K, V>, K>) c8707dvo);
            } else {
                b2 = e.b(i, k, v, i2 + 5, c8707dvo);
            }
            return e == b2 ? this : e(d, b2, c8707dvo.d());
        } else {
            c8707dvo.a(c8707dvo.size() + 1);
            return a(b3, k, v, c8707dvo.d());
        }
    }

    public final dvG<K, V> d(int i, K k, int i2, C8707dvo<K, V> c8707dvo) {
        dvG<K, V> d;
        C8632dsu.c((Object) c8707dvo, "");
        int b2 = 1 << dvJ.b(i, i2);
        if (c(b2)) {
            int b3 = b(b2);
            return C8632dsu.c(k, j(b3)) ? b(b3, b2, c8707dvo) : this;
        } else if (a(b2)) {
            int d2 = d(b2);
            dvG<K, V> e = e(d2);
            if (i2 == 30) {
                d = e.c((dvG<K, V>) k, (C8707dvo<dvG<K, V>, V>) c8707dvo);
            } else {
                d = e.d(i, k, i2 + 5, c8707dvo);
            }
            return d(e, d, d2, b2, c8707dvo.d());
        } else {
            return this;
        }
    }

    private final dvG<K, V> d(dvG<K, V> dvg, dvG<K, V> dvg2, int i, int i2, C8729dwj c8729dwj) {
        if (dvg2 == null) {
            return a(i, i2, c8729dwj);
        }
        return dvg != dvg2 ? e(i, dvg2, c8729dwj) : this;
    }

    public final dvG<K, V> c(int i, K k, V v, int i2, C8707dvo<K, V> c8707dvo) {
        dvG<K, V> c;
        C8632dsu.c((Object) c8707dvo, "");
        int b2 = 1 << dvJ.b(i, i2);
        if (c(b2)) {
            int b3 = b(b2);
            return (C8632dsu.c(k, j(b3)) && C8632dsu.c(v, i(b3))) ? b(b3, b2, c8707dvo) : this;
        } else if (a(b2)) {
            int d = d(b2);
            dvG<K, V> e = e(d);
            if (i2 == 30) {
                c = e.b((dvG<K, V>) k, (K) v, (C8707dvo<dvG<K, V>, K>) c8707dvo);
            } else {
                c = e.c(i, k, v, i2 + 5, c8707dvo);
            }
            return d(e, c, d, b2, c8707dvo.d());
        } else {
            return this;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <K1, V1> boolean c(o.dvG<K1, V1> r9, o.drX<? super V, ? super V1, java.lang.Boolean> r10) {
        /*
            r8 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r9, r0)
            o.C8632dsu.c(r10, r0)
            r0 = 1
            if (r8 != r9) goto Lc
            return r0
        Lc:
            int r1 = r8.d
            int r2 = r9.d
            r3 = 0
            if (r1 != r2) goto Ld4
            int r2 = r8.e
            int r4 = r9.e
            if (r2 == r4) goto L1b
            goto Ld4
        L1b:
            r4 = 2
            if (r1 != 0) goto L72
            if (r2 != 0) goto L72
            java.lang.Object[] r1 = r8.c
            int r2 = r1.length
            java.lang.Object[] r5 = r9.c
            int r5 = r5.length
            if (r2 == r5) goto L29
            return r3
        L29:
            int r1 = r1.length
            o.dtp r1 = o.C8653dto.d(r3, r1)
            o.dth r1 = o.C8653dto.a(r1, r4)
            boolean r2 = r1 instanceof java.util.Collection
            if (r2 == 0) goto L40
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L40
            goto L71
        L40:
            java.util.Iterator r1 = r1.iterator()
        L44:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L71
            r2 = r1
            o.dqB r2 = (o.dqB) r2
            int r2 = r2.nextInt()
            java.lang.Object r4 = r9.j(r2)
            java.lang.Object r2 = r9.i(r2)
            int r4 = r8.c(r4)
            r5 = -1
            if (r4 == r5) goto L70
            java.lang.Object r4 = r8.i(r4)
            java.lang.Object r2 = r10.invoke(r4, r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L44
        L70:
            r0 = r3
        L71:
            return r0
        L72:
            int r1 = java.lang.Integer.bitCount(r1)
            int r1 = r1 * r4
            o.dtp r2 = o.C8653dto.d(r3, r1)
            o.dth r2 = o.C8653dto.a(r2, r4)
            int r4 = r2.d()
            int r5 = r2.e()
            int r2 = r2.a()
            if (r2 <= 0) goto L8f
            if (r4 <= r5) goto L93
        L8f:
            if (r2 >= 0) goto Lbc
            if (r5 > r4) goto Lbc
        L93:
            java.lang.Object r6 = r8.j(r4)
            java.lang.Object r7 = r9.j(r4)
            boolean r6 = o.C8632dsu.c(r6, r7)
            if (r6 != 0) goto La2
            return r3
        La2:
            java.lang.Object r6 = r8.i(r4)
            java.lang.Object r7 = r9.i(r4)
            java.lang.Object r6 = r10.invoke(r6, r7)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto Lb7
            return r3
        Lb7:
            if (r4 != r5) goto Lba
            goto Lbc
        Lba:
            int r4 = r4 + r2
            goto L93
        Lbc:
            java.lang.Object[] r2 = r8.c
            int r2 = r2.length
        Lbf:
            if (r1 >= r2) goto Ld3
            o.dvG r4 = r8.e(r1)
            o.dvG r5 = r9.e(r1)
            boolean r4 = r4.c(r5, r10)
            if (r4 != 0) goto Ld0
            return r3
        Ld0:
            int r1 = r1 + 1
            goto Lbf
        Ld3:
            return r0
        Ld4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dvG.c(o.dvG, o.drX):boolean");
    }

    /* loaded from: classes5.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final dvG b() {
            return dvG.b;
        }
    }
}
