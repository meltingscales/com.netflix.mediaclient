package o;

import java.util.List;
import java.util.RandomAccess;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class dIA extends dpT<ByteString> implements RandomAccess {
    public static final c a = new c(null);
    private final int[] c;
    private final ByteString[] e;

    public static final dIA a(ByteString... byteStringArr) {
        return a.e(byteStringArr);
    }

    public final ByteString[] a() {
        return this.e;
    }

    public final int[] b() {
        return this.c;
    }

    public /* synthetic */ dIA(ByteString[] byteStringArr, int[] iArr, C8627dsp c8627dsp) {
        this(byteStringArr, iArr);
    }

    public int a(ByteString byteString) {
        return super.lastIndexOf(byteString);
    }

    public int c(ByteString byteString) {
        return super.indexOf(byteString);
    }

    @Override // o.dpQ, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return d((ByteString) obj);
        }
        return false;
    }

    public boolean d(ByteString byteString) {
        return super.contains(byteString);
    }

    @Override // o.dpT, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return c((ByteString) obj);
        }
        return -1;
    }

    @Override // o.dpT, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return a((ByteString) obj);
        }
        return -1;
    }

    private dIA(ByteString[] byteStringArr, int[] iArr) {
        this.e = byteStringArr;
        this.c = iArr;
    }

    @Override // o.dpQ
    public int getSize() {
        return this.e.length;
    }

    @Override // o.dpT, java.util.List
    /* renamed from: e */
    public ByteString get(int i) {
        return this.e[i];
    }

    /* loaded from: classes5.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:49:0x00db, code lost:
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final o.dIA e(okio.ByteString... r18) {
            /*
                Method dump skipped, instructions count: 306
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.dIA.c.e(okio.ByteString[]):o.dIA");
        }

        static /* synthetic */ void a(c cVar, long j, C7872dIo c7872dIo, int i, List list, int i2, int i3, List list2, int i4, Object obj) {
            cVar.d((i4 & 1) != 0 ? 0L : j, c7872dIo, (i4 & 4) != 0 ? 0 : i, list, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? list.size() : i3, list2);
        }

        private final void d(long j, C7872dIo c7872dIo, int i, List<? extends ByteString> list, int i2, int i3, List<Integer> list2) {
            int i4;
            int i5;
            int i6;
            int i7;
            C7872dIo c7872dIo2;
            int i8 = i;
            if (i2 >= i3) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i9 = i2; i9 < i3; i9++) {
                if (list.get(i9).k() < i8) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            ByteString byteString = list.get(i2);
            ByteString byteString2 = list.get(i3 - 1);
            int i10 = -1;
            if (i8 == byteString.k()) {
                int i11 = i2 + 1;
                i4 = i11;
                i5 = list2.get(i2).intValue();
                byteString = list.get(i11);
            } else {
                i4 = i2;
                i5 = -1;
            }
            if (byteString.a(i8) != byteString2.a(i8)) {
                int i12 = 1;
                for (int i13 = i4 + 1; i13 < i3; i13++) {
                    if (list.get(i13 - 1).a(i8) != list.get(i13).a(i8)) {
                        i12++;
                    }
                }
                long d = j + d(c7872dIo) + 2 + (i12 * 2);
                c7872dIo.h(i12);
                c7872dIo.h(i5);
                for (int i14 = i4; i14 < i3; i14++) {
                    byte a = list.get(i14).a(i8);
                    if (i14 == i4 || a != list.get(i14 - 1).a(i8)) {
                        c7872dIo.h(a & 255);
                    }
                }
                C7872dIo c7872dIo3 = new C7872dIo();
                while (i4 < i3) {
                    byte a2 = list.get(i4).a(i8);
                    int i15 = i4 + 1;
                    int i16 = i15;
                    while (true) {
                        if (i16 >= i3) {
                            i6 = i3;
                            break;
                        } else if (a2 != list.get(i16).a(i8)) {
                            i6 = i16;
                            break;
                        } else {
                            i16++;
                        }
                    }
                    if (i15 == i6 && i8 + 1 == list.get(i4).k()) {
                        c7872dIo.h(list2.get(i4).intValue());
                        i7 = i6;
                        c7872dIo2 = c7872dIo3;
                    } else {
                        c7872dIo.h(((int) (d + d(c7872dIo3))) * i10);
                        i7 = i6;
                        c7872dIo2 = c7872dIo3;
                        d(d, c7872dIo3, i8 + 1, list, i4, i6, list2);
                    }
                    c7872dIo3 = c7872dIo2;
                    i4 = i7;
                    i10 = -1;
                }
                c7872dIo.b(c7872dIo3);
                return;
            }
            int min = Math.min(byteString.k(), byteString2.k());
            int i17 = 0;
            for (int i18 = i8; i18 < min && byteString.a(i18) == byteString2.a(i18); i18++) {
                i17++;
            }
            long d2 = j + d(c7872dIo) + 2 + i17 + 1;
            c7872dIo.h(-i17);
            c7872dIo.h(i5);
            int i19 = i17 + i8;
            while (i8 < i19) {
                c7872dIo.h(byteString.a(i8) & 255);
                i8++;
            }
            if (i4 + 1 == i3) {
                if (i19 != list.get(i4).k()) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                c7872dIo.h(list2.get(i4).intValue());
                return;
            }
            C7872dIo c7872dIo4 = new C7872dIo();
            c7872dIo.h(((int) (d(c7872dIo4) + d2)) * (-1));
            d(d2, c7872dIo4, i19, list, i4, i3, list2);
            c7872dIo.b(c7872dIo4);
        }

        private final long d(C7872dIo c7872dIo) {
            return c7872dIo.D() / 4;
        }
    }
}
