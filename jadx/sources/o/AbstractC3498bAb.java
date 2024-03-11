package o;

import android.content.Context;
import android.util.Base64;
import android.view.View;
import java.nio.charset.StandardCharsets;
import o.AbstractC5475bzU;
import o.C1208Sv;
import o.C3497bAa;
import o.C3502bAf;
import o.C5473bzS;
import o.C9834xU;

/* renamed from: o.bAb  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3498bAb {
    public /* synthetic */ AbstractC3498bAb(C8627dsp c8627dsp) {
        this();
    }

    private AbstractC3498bAb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C9935zP c9935zP, View view) {
        C8632dsu.c((Object) c9935zP, "");
        c9935zP.b(AbstractC5475bzU.class, AbstractC5475bzU.b.a);
    }

    /* renamed from: o.bAb$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3498bAb implements bJF<C3497bAa.e> {
        private static int a = 0;
        private static int b = 1;
        private static byte e$ss2$42 = 24;
        private final C9935zP e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C9935zP c9935zP) {
            super(null);
            C8632dsu.c((Object) c9935zP, "");
            this.e = c9935zP;
        }

        @Override // o.bJF
        /* renamed from: b */
        public void d(InterfaceC2023aX interfaceC2023aX, Context context, C3497bAa.e eVar) {
            int i = 2 % 2;
            int i2 = b + 39;
            a = i2 % 128;
            int i3 = i2 % 2;
            C8632dsu.c((Object) interfaceC2023aX, "");
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) eVar, "");
            if (eVar.g()) {
                bKU bku = new bKU();
                bku.d((CharSequence) "loading-spacer");
                bku.a(Integer.valueOf((int) context.getResources().getDimension(C9834xU.a.al)));
                interfaceC2023aX.add(bku);
                C3774bKd c3774bKd = new C3774bKd();
                c3774bKd.c((CharSequence) "loading");
                interfaceC2023aX.add(c3774bKd);
                return;
            }
            c(interfaceC2023aX, this.e);
            C3512bAp c3512bAp = new C3512bAp();
            c3512bAp.b((CharSequence) "header");
            String string = context.getString(C5473bzS.d.c);
            if (string.startsWith("'!#+")) {
                int i4 = a + 75;
                b = i4 % 128;
                if (i4 % 2 == 0) {
                    Object[] objArr = new Object[1];
                    f(string.substring(4), objArr);
                    ((String) objArr[0]).intern();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                String substring = string.substring(4);
                Object[] objArr2 = new Object[1];
                f(substring, objArr2);
                string = ((String) objArr2[0]).intern();
            }
            c3512bAp.e((CharSequence) string);
            interfaceC2023aX.add(c3512bAp);
            C3518bAv c3518bAv = new C3518bAv();
            c3518bAv.e((CharSequence) "phoneInput");
            c3518bAv.b(this.e);
            c3518bAv.a(eVar.e());
            c3518bAv.d(eVar.i());
            c3518bAv.a(eVar.a());
            interfaceC2023aX.add(c3518bAv);
            bAA baa = new bAA();
            baa.c((CharSequence) "submit");
            String string2 = context.getString(C5473bzS.d.a);
            if (string2.startsWith("'!#+")) {
                Object[] objArr3 = new Object[1];
                f(string2.substring(4), objArr3);
                string2 = ((String) objArr3[0]).intern();
            }
            baa.b(string2);
            baa.b(eVar.f());
            baa.d(this.e);
            interfaceC2023aX.add(baa);
            C3504bAh c3504bAh = new C3504bAh();
            c3504bAh.c((CharSequence) "dismiss");
            c3504bAh.c(this.e);
            interfaceC2023aX.add(c3504bAh);
        }

        private void f(String str, Object[] objArr) {
            byte[] decode = Base64.decode(str, 0);
            byte[] bArr = new byte[decode.length];
            for (int i = 0; i < decode.length; i++) {
                bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$42);
            }
            objArr[0] = new String(bArr, StandardCharsets.UTF_8);
        }
    }

    /* renamed from: o.bAb$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3498bAb implements bJF<C3502bAf.c> {
        private static int b = 1;
        private static int c = 0;
        private static byte e$ss2$52 = 24;
        private final C9935zP a;

        public final C9935zP c() {
            return this.a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C9935zP c9935zP) {
            super(null);
            C8632dsu.c((Object) c9935zP, "");
            this.a = c9935zP;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x015a, code lost:
            if (r12.startsWith("'!#+") != false) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0167, code lost:
            if (r12.startsWith("'!#+") != false) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0169, code lost:
            r13 = new java.lang.Object[1];
            f(r12.substring(4), r13);
            r12 = ((java.lang.String) r13[0]).intern();
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x017a, code lost:
            r13 = o.AbstractC3498bAb.c.b + 75;
            o.AbstractC3498bAb.c.c = r13 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0183, code lost:
            if ((r13 % 2) == 0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0185, code lost:
            r0 = 2 / 4;
         */
        @Override // o.bJF
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void d(o.InterfaceC2023aX r11, android.content.Context r12, o.C3502bAf.c r13) {
            /*
                Method dump skipped, instructions count: 427
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.AbstractC3498bAb.c.d(o.aX, android.content.Context, o.bAf$c):void");
        }

        /* renamed from: o.bAb$c$b */
        /* loaded from: classes4.dex */
        public static final class b implements C1208Sv.d {
            b() {
            }

            @Override // o.C1208Sv.d
            public void b(String str) {
                C8632dsu.c((Object) str, "");
                c.this.c().b(AbstractC5475bzU.class, new AbstractC5475bzU.l(str));
            }

            @Override // o.C1208Sv.d
            public void e() {
                c.this.c().b(AbstractC5475bzU.class, AbstractC5475bzU.g.d);
            }
        }

        private void f(String str, Object[] objArr) {
            byte[] decode = Base64.decode(str, 0);
            byte[] bArr = new byte[decode.length];
            for (int i = 0; i < decode.length; i++) {
                bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$52);
            }
            objArr[0] = new String(bArr, StandardCharsets.UTF_8);
        }
    }

    /* renamed from: o.bAb$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3498bAb implements bJF<dpR> {
        private static int a = 1;
        private static int c = 0;
        private static byte e$ss2$42 = 24;
        private final C9935zP b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C9935zP c9935zP) {
            super(null);
            C8632dsu.c((Object) c9935zP, "");
            this.b = c9935zP;
        }

        @Override // o.bJF
        /* renamed from: c */
        public void d(InterfaceC2023aX interfaceC2023aX, Context context, dpR dpr) {
            int i = 2 % 2;
            C8632dsu.c((Object) interfaceC2023aX, "");
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) dpr, "");
            c(interfaceC2023aX, this.b);
            C3508bAl c3508bAl = new C3508bAl();
            c3508bAl.d((CharSequence) "generic-error");
            interfaceC2023aX.add(c3508bAl);
            bAA baa = new bAA();
            baa.c((CharSequence) "submit");
            String string = context.getString(C5473bzS.d.d);
            if (string.startsWith("'!#+")) {
                int i2 = a + 49;
                c = i2 % 128;
                if (i2 % 2 != 0) {
                    String substring = string.substring(4);
                    Object[] objArr = new Object[1];
                    e(substring, objArr);
                    ((String) objArr[0]).intern();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Object[] objArr2 = new Object[1];
                e(string.substring(4), objArr2);
                string = ((String) objArr2[0]).intern();
            }
            baa.b(string);
            baa.d(this.b);
            interfaceC2023aX.add(baa);
            int i3 = c + 123;
            a = i3 % 128;
            int i4 = i3 % 2;
        }

        private void e(String str, Object[] objArr) {
            byte[] decode = Base64.decode(str, 0);
            byte[] bArr = new byte[decode.length];
            for (int i = 0; i < decode.length; i++) {
                bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$42);
            }
            objArr[0] = new String(bArr, StandardCharsets.UTF_8);
        }
    }

    protected final void c(InterfaceC2023aX interfaceC2023aX, final C9935zP c9935zP) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) c9935zP, "");
        bLD bld = new bLD();
        bld.d((CharSequence) "toolbar");
        bld.d(Integer.valueOf(com.netflix.mediaclient.ui.R.e.f13244o));
        bld.c(Integer.valueOf(com.netflix.mediaclient.ui.R.o.D));
        bld.a(new View.OnClickListener() { // from class: o.bzX
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC3498bAb.d(C9935zP.this, view);
            }
        });
        interfaceC2023aX.add(bld);
    }
}
