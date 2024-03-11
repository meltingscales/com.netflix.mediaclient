package o;

import android.content.Context;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.pservice.PDiskData;
import java.util.List;

/* loaded from: classes7.dex */
public final class dlQ {
    public static final c c = new c(null);
    @SerializedName("latestListType")
    private String d;
    @SerializedName("bbList")
    private final dlO b = new dlO();
    @SerializedName("cwList")
    private final dlO a = new dlO();
    @SerializedName("s1List")
    private final dlO i = new dlO();
    @SerializedName("s2List")
    private final dlO f = new dlO();
    @SerializedName("nmList")
    private final dlO e = new dlO();

    /* loaded from: classes7.dex */
    public final /* synthetic */ class d {
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[PDiskData.ListType.values().length];
            try {
                iArr[PDiskData.ListType.BILLBOARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PDiskData.ListType.CW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PDiskData.ListType.STANDARD_FIRST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PDiskData.ListType.STANDARD_SECOND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PDiskData.ListType.NON_MEMBER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            d = iArr;
        }
    }

    public static final dlQ e(Context context) {
        return c.c(context);
    }

    public final String c() {
        return this.d;
    }

    public final void c(String str) {
        this.d = str;
    }

    public final String b() {
        String json = C8118deO.a().toJson(this);
        C8632dsu.a(json, "");
        return json;
    }

    public final dlO d(PDiskData.ListType listType) {
        C8632dsu.c((Object) listType, "");
        int i = d.d[listType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        return this.e;
                    }
                    return this.f;
                }
                return this.i;
            }
            return this.a;
        }
        return this.b;
    }

    public final void e(Context context, List<? extends PDiskData.ListType> list) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) list, "");
        for (PDiskData.ListType listType : list) {
            dlO d2 = d(listType);
            if (d2 != null) {
                d2.b();
            }
        }
        this.d = null;
        a(context);
    }

    private final void d(Context context, String str) {
        C8157dfA.a(context, "partner_card_algo_data", str);
    }

    public final void a(Context context) {
        C8632dsu.c((Object) context, "");
        d(context, b());
    }

    public String toString() {
        dlO dlo = this.b;
        dlO dlo2 = this.a;
        dlO dlo3 = this.i;
        dlO dlo4 = this.f;
        dlO dlo5 = this.e;
        String str = this.d;
        return "CardAlgoData(bbListData=" + dlo + ", cwListData=" + dlo2 + ", s1ListData=" + dlo3 + ", s2ListData=" + dlo4 + ", nmListData=" + dlo5 + ", latestListType=" + str + ")";
    }

    /* loaded from: classes7.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final o.dlQ e(java.lang.String r11) {
            /*
                r10 = this;
                com.google.gson.Gson r0 = o.C8118deO.a()
                boolean r1 = o.C8168dfL.g(r11)
                if (r1 != 0) goto Lb1
                java.lang.Class<o.dlQ> r1 = o.dlQ.class
                java.lang.Object r11 = r0.fromJson(r11, r1)     // Catch: java.lang.Exception -> L14
                o.dlQ r11 = (o.dlQ) r11     // Catch: java.lang.Exception -> L14
                goto Lb2
            L14:
                r11 = move-exception
                r2 = r11
                o.aHf$c r11 = o.InterfaceC1598aHf.a
                java.util.Map r11 = o.dqF.c()
                java.util.Map r5 = o.dqF.d(r11)
                o.aHd r11 = new o.aHd
                r1 = 0
                r3 = 0
                r4 = 1
                r6 = 0
                r7 = 0
                r8 = 96
                r9 = 0
                r0 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                com.netflix.mediaclient.api.logging.error.ErrorType r0 = r11.a
                if (r0 == 0) goto L5e
                java.util.Map<java.lang.String, java.lang.String> r1 = r11.e
                java.lang.String r2 = "errorType"
                java.lang.String r3 = r0.c()
                r1.put(r2, r3)
                java.lang.String r1 = r11.b()
                if (r1 == 0) goto L5e
                java.lang.String r0 = r0.c()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                java.lang.String r0 = " "
                r2.append(r0)
                r2.append(r1)
                java.lang.String r0 = r2.toString()
                r11.a(r0)
            L5e:
                java.lang.String r0 = r11.b()
                if (r0 == 0) goto L74
                java.lang.Throwable r0 = r11.i
                if (r0 == 0) goto L74
                java.lang.Throwable r0 = new java.lang.Throwable
                java.lang.String r1 = r11.b()
                java.lang.Throwable r2 = r11.i
                r0.<init>(r1, r2)
                goto L9e
            L74:
                java.lang.String r0 = r11.b()
                if (r0 == 0) goto L84
                java.lang.Throwable r0 = new java.lang.Throwable
                java.lang.String r1 = r11.b()
                r0.<init>(r1)
                goto L9e
            L84:
                java.lang.Throwable r0 = r11.i
                if (r0 == 0) goto L97
                if (r0 == 0) goto L8b
                goto L9e
            L8b:
                java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Required value was null."
                java.lang.String r0 = r0.toString()
                r11.<init>(r0)
                throw r11
            L97:
                java.lang.Throwable r0 = new java.lang.Throwable
                java.lang.String r1 = "Handled exception with no message"
                r0.<init>(r1)
            L9e:
                o.aHi$d r1 = o.InterfaceC1601aHi.c
                o.aHf r2 = r1.a()
                if (r2 == 0) goto Laa
                r2.e(r11, r0)
                goto Lb1
            Laa:
                o.aHb r1 = r1.e()
                r1.b(r11, r0)
            Lb1:
                r11 = 0
            Lb2:
                if (r11 != 0) goto Lb9
                o.dlQ r11 = new o.dlQ
                r11.<init>()
            Lb9:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: o.dlQ.c.e(java.lang.String):o.dlQ");
        }

        public final String e(Context context) {
            return C8157dfA.e(context, "partner_card_algo_data", (String) null);
        }

        public final dlQ c(Context context) {
            return e(e(context));
        }
    }
}
