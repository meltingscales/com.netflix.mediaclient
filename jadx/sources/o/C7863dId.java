package o;

/* renamed from: o.dId  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7863dId {
    public static final c d = new c(null);
    public final boolean a;
    public final Integer b;
    public final boolean c;
    public final Integer e;
    public final boolean g;
    public final boolean h;

    public C7863dId() {
        this(false, null, false, null, false, false, 63, null);
    }

    public final boolean c(boolean z) {
        return z ? this.c : this.h;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7863dId) {
                C7863dId c7863dId = (C7863dId) obj;
                return this.a == c7863dId.a && C8632dsu.c(this.b, c7863dId.b) && this.c == c7863dId.c && C8632dsu.c(this.e, c7863dId.e) && this.h == c7863dId.h && this.g == c7863dId.g;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r4v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean] */
    public int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        Integer num = this.b;
        int hashCode = num != null ? num.hashCode() : 0;
        ?? r4 = this.c;
        int i = r4;
        if (r4 != 0) {
            i = 1;
        }
        Integer num2 = this.e;
        int hashCode2 = num2 != null ? num2.hashCode() : 0;
        ?? r5 = this.h;
        int i2 = r5;
        if (r5 != 0) {
            i2 = 1;
        }
        boolean z2 = this.g;
        return (((((((((r0 * 31) + hashCode) * 31) + i) * 31) + hashCode2) * 31) + i2) * 31) + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.a + ", clientMaxWindowBits=" + this.b + ", clientNoContextTakeover=" + this.c + ", serverMaxWindowBits=" + this.e + ", serverNoContextTakeover=" + this.h + ", unknownValues=" + this.g + ")";
    }

    public C7863dId(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4) {
        this.a = z;
        this.b = num;
        this.c = z2;
        this.e = num2;
        this.h = z3;
        this.g = z4;
    }

    public /* synthetic */ C7863dId(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? false : z2, (i & 8) == 0 ? num2 : null, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4);
    }

    /* renamed from: o.dId$c */
    /* loaded from: classes5.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        public final C7863dId d(C7819dGn c7819dGn) {
            boolean a;
            boolean a2;
            boolean a3;
            boolean a4;
            boolean a5;
            boolean a6;
            Integer n;
            Integer n2;
            C8632dsu.d(c7819dGn, "");
            int c = c7819dGn.c();
            boolean z = false;
            Integer num = null;
            boolean z2 = false;
            Integer num2 = null;
            boolean z3 = false;
            boolean z4 = false;
            for (int i = 0; i < c; i++) {
                a = C8691duz.a(c7819dGn.c(i), "Sec-WebSocket-Extensions", true);
                if (a) {
                    String a7 = c7819dGn.a(i);
                    int i2 = 0;
                    while (i2 < a7.length()) {
                        int c2 = dGB.c(a7, ',', i2, 0, 4, null);
                        int b = dGB.b(a7, ';', i2, c2);
                        String c3 = dGB.c(a7, i2, b);
                        int i3 = b + 1;
                        a2 = C8691duz.a(c3, "permessage-deflate", true);
                        if (a2) {
                            i2 = i3;
                            if (z) {
                                z4 = true;
                            }
                            while (i2 < c2) {
                                int b2 = dGB.b(a7, ';', i2, c2);
                                int b3 = dGB.b(a7, '=', i2, b2);
                                String c4 = dGB.c(a7, i2, b3);
                                String j = b3 < b2 ? duD.j(dGB.c(a7, b3 + 1, b2), "\"") : null;
                                a3 = C8691duz.a(c4, "client_max_window_bits", true);
                                if (a3) {
                                    if (num != null) {
                                        z4 = true;
                                    }
                                    if (j != null) {
                                        n2 = C8689dux.n(j);
                                        num = n2;
                                    } else {
                                        num = null;
                                    }
                                    if (num != null) {
                                        i2 = b2 + 1;
                                    }
                                    z4 = true;
                                    i2 = b2 + 1;
                                } else {
                                    a4 = C8691duz.a(c4, "client_no_context_takeover", true);
                                    if (a4) {
                                        if (z2) {
                                            z4 = true;
                                        }
                                        if (j != null) {
                                            z4 = true;
                                        }
                                        z2 = true;
                                    } else {
                                        a5 = C8691duz.a(c4, "server_max_window_bits", true);
                                        if (a5) {
                                            if (num2 != null) {
                                                z4 = true;
                                            }
                                            if (j != null) {
                                                n = C8689dux.n(j);
                                                num2 = n;
                                            } else {
                                                num2 = null;
                                            }
                                            if (num2 != null) {
                                            }
                                            z4 = true;
                                        } else {
                                            a6 = C8691duz.a(c4, "server_no_context_takeover", true);
                                            if (a6) {
                                                if (z3) {
                                                    z4 = true;
                                                }
                                                if (j != null) {
                                                    z4 = true;
                                                }
                                                z3 = true;
                                            }
                                            z4 = true;
                                        }
                                    }
                                    i2 = b2 + 1;
                                }
                            }
                            z = true;
                        } else {
                            i2 = i3;
                            z4 = true;
                        }
                    }
                }
            }
            return new C7863dId(z, num, z2, num2, z3, z4);
        }
    }
}
