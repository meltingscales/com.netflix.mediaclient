package o;

import com.netflix.model.leafs.SearchCollectionEntityImpl;

@Deprecated
/* renamed from: o.diS  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8334diS implements InterfaceC0943Io {
    private IF b;
    private SearchCollectionEntityImpl c;
    private IF d;
    private boolean e;

    @Override // o.InterfaceC0943Io
    public InterfaceC8322diG b(String str) {
        char c;
        if (this.e) {
            return IJ.b();
        }
        str.hashCode();
        int hashCode = str.hashCode();
        if (hashCode == -1857640538) {
            if (str.equals("summary")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 3242771) {
            if (hashCode == 407115928 && str.equals("preQueryItem")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("item")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c == 2) {
                    return this.b;
                }
                throw new IllegalStateException("Can't get node for key: " + str);
            }
            return this.d;
        }
        return this.c;
    }

    @Override // o.InterfaceC0943Io
    public InterfaceC8322diG e(String str) {
        char c;
        InterfaceC8322diG b = b(str);
        if (b != null) {
            return b;
        }
        str.hashCode();
        int hashCode = str.hashCode();
        if (hashCode == -1857640538) {
            if (str.equals("summary")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 3242771) {
            if (hashCode == 407115928 && str.equals("preQueryItem")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("item")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            SearchCollectionEntityImpl searchCollectionEntityImpl = new SearchCollectionEntityImpl();
            this.c = searchCollectionEntityImpl;
            return searchCollectionEntityImpl;
        } else if (c == 1) {
            IF r5 = new IF();
            this.d = r5;
            return r5;
        } else if (c == 2) {
            IF r52 = new IF();
            this.b = r52;
            return r52;
        } else {
            throw new IllegalStateException("Can't create node for key: " + str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
        if (r6.equals("summary") == false) goto L26;
     */
    @Override // o.InterfaceC0943Io
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(java.lang.String r6, o.InterfaceC8322diG r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof o.IJ
            r1 = 1
            if (r0 == 0) goto L9
            r5.e = r1
            goto L72
        L9:
            r0 = 0
            r5.e = r0
            r6.hashCode()
            int r2 = r6.hashCode()
            r3 = -1857640538(0xffffffff9146a7a6, float:-1.5671107E-28)
            r4 = 2
            if (r2 == r3) goto L3a
            r0 = 3242771(0x317b13, float:4.54409E-39)
            if (r2 == r0) goto L2f
            r0 = 407115928(0x18441898, float:2.5344823E-24)
            if (r2 == r0) goto L24
            goto L42
        L24:
            java.lang.String r0 = "preQueryItem"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L2d
            goto L42
        L2d:
            r0 = r4
            goto L43
        L2f:
            java.lang.String r0 = "item"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L38
            goto L42
        L38:
            r0 = r1
            goto L43
        L3a:
            java.lang.String r2 = "summary"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L43
        L42:
            r0 = -1
        L43:
            if (r0 == 0) goto L6e
            if (r0 == r1) goto L67
            if (r0 == r4) goto L60
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Don't know how to set key: "
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = "SearchByReferenceMap"
            java.lang.String r7 = r7.toString()
            o.C1044Mm.e(r6, r7)
            goto L72
        L60:
            o.IF r6 = o.IF.b(r7)
            r5.b = r6
            goto L72
        L67:
            o.IF r6 = o.IF.b(r7)
            r5.d = r6
            goto L72
        L6e:
            com.netflix.model.leafs.SearchCollectionEntityImpl r7 = (com.netflix.model.leafs.SearchCollectionEntityImpl) r7
            r5.c = r7
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8334diS.d(java.lang.String, o.diG):void");
    }

    @Override // o.InterfaceC0943Io
    public void a(String str) {
        d(str, null);
    }
}
