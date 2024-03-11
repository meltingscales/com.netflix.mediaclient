package com.netflix.mediaclient.util;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import o.C1045Mp;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8554dpx;
import o.InterfaceC8598drn;
import o.dpB;
import o.drO;

/* loaded from: classes.dex */
public final class EchoShowUtils {
    private static final InterfaceC8554dpx<String> c;
    public static final e d = new e(null);
    private static final Map<FakeEchoShow, Boolean> e = new HashMap();

    public static final void a(Context context) {
        d.b(context);
    }

    public static final boolean a() {
        return d.b();
    }

    public static final boolean b() {
        return d.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public static final class FakeEchoShow {
        private static final /* synthetic */ FakeEchoShow[] c;
        private static final /* synthetic */ InterfaceC8598drn e;
        public static final FakeEchoShow a = new FakeEchoShow("EchoShow5", 0);
        public static final FakeEchoShow b = new FakeEchoShow("EchoShow8", 1);
        public static final FakeEchoShow d = new FakeEchoShow("EchoShow10", 2);

        private static final /* synthetic */ FakeEchoShow[] a() {
            return new FakeEchoShow[]{a, b, d};
        }

        public static FakeEchoShow valueOf(String str) {
            return (FakeEchoShow) Enum.valueOf(FakeEchoShow.class, str);
        }

        public static FakeEchoShow[] values() {
            return (FakeEchoShow[]) c.clone();
        }

        private FakeEchoShow(String str, int i) {
        }

        static {
            FakeEchoShow[] a2 = a();
            c = a2;
            e = C8600drp.e(a2);
        }
    }

    /* loaded from: classes5.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private final boolean c(FakeEchoShow fakeEchoShow) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @SuppressLint({"PrivateApi"})
        public final String e() {
            return null;
        }

        public final void b(Context context) {
            C8632dsu.c((Object) context, "");
        }

        public final boolean c() {
            return false;
        }

        private e() {
            super("EchoShowUtils");
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x007c A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean b() {
            /*
                r2 = this;
                java.lang.String r0 = android.os.Build.MODEL
                if (r0 == 0) goto L7e
                if (r0 == 0) goto L7e
                int r1 = r0.hashCode()
                switch(r1) {
                    case 62162456: goto L73;
                    case 62162462: goto L6a;
                    case 62162489: goto L61;
                    case 62162512: goto L58;
                    case 62162518: goto L4f;
                    case 62162527: goto L46;
                    case 62162684: goto L3d;
                    case 62162766: goto L34;
                    case 62162977: goto L2b;
                    case 62163032: goto L22;
                    case 62163039: goto L19;
                    case 64389749: goto Lf;
                    default: goto Ld;
                }
            Ld:
                goto L7e
            Lf:
                java.lang.String r1 = "CRGVS"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L7c
                goto L7e
            L19:
                java.lang.String r1 = "AEOTH"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L7c
                goto L7e
            L22:
                java.lang.String r1 = "AEOTA"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L7c
                goto L7e
            L2b:
                java.lang.String r1 = "AEORH"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L7c
                goto L7e
            L34:
                java.lang.String r1 = "AEOKN"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L7c
                goto L7e
            L3d:
                java.lang.String r1 = "AEOHY"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L7c
                goto L7e
            L46:
                java.lang.String r1 = "AEOCW"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L7c
                goto L7e
            L4f:
                java.lang.String r1 = "AEOCN"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L7c
                goto L7e
            L58:
                java.lang.String r1 = "AEOCH"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L7c
                goto L7e
            L61:
                java.lang.String r1 = "AEOBP"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L7e
                goto L7c
            L6a:
                java.lang.String r1 = "AEOAT"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L7c
                goto L7e
            L73:
                java.lang.String r1 = "AEOAN"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L7c
                goto L7e
            L7c:
                r0 = 1
                goto L7f
            L7e:
                r0 = 0
            L7f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.util.EchoShowUtils.e.b():boolean");
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
            if (o.C8632dsu.c((java.lang.Object) r0, (java.lang.Object) "AEOCN") == false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
            if (r3.getResources().getDisplayMetrics().widthPixels != 960) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean c(android.content.Context r3) {
            /*
                r2 = this;
                java.lang.String r0 = ""
                o.C8632dsu.c(r3, r0)
                java.lang.String r0 = android.os.Build.MANUFACTURER
                java.lang.String r1 = "Amazon"
                boolean r0 = o.C8632dsu.c(r0, r1)
                if (r0 == 0) goto L2f
                java.lang.String r0 = android.os.Build.MODEL
                java.lang.String r1 = "AEOCH"
                boolean r1 = o.C8632dsu.c(r0, r1)
                if (r1 != 0) goto L21
                java.lang.String r1 = "AEOCN"
                boolean r0 = o.C8632dsu.c(r0, r1)
                if (r0 == 0) goto L2f
            L21:
                android.content.res.Resources r3 = r3.getResources()
                android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
                int r3 = r3.widthPixels
                r0 = 960(0x3c0, float:1.345E-42)
                if (r3 == r0) goto L35
            L2f:
                boolean r3 = r2.d()
                if (r3 == 0) goto L37
            L35:
                r3 = 1
                goto L38
            L37:
                r3 = 0
            L38:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.util.EchoShowUtils.e.c(android.content.Context):boolean");
        }

        public final boolean d() {
            return c(FakeEchoShow.a);
        }
    }

    static {
        InterfaceC8554dpx<String> b;
        b = dpB.b(new drO<String>() { // from class: com.netflix.mediaclient.util.EchoShowUtils$Companion$fakeProperty$2
            @Override // o.drO
            /* renamed from: c */
            public final String invoke() {
                String e2;
                e2 = EchoShowUtils.d.e();
                return e2;
            }
        });
        c = b;
    }
}
