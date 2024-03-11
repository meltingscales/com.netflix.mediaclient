package o;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import o.AbstractC6747cjD;
import o.AbstractC6756cjM;
import o.C3796bKz;
import o.C6763cjT;
import o.C9935zP;
import o.dpR;

/* renamed from: o.cjD  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6747cjD extends AbstractC6745cjB {
    private final int a;
    private final String c;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String n;

    @Override // o.AbstractC6677chn
    public String c() {
        return this.e;
    }

    @Override // o.AbstractC6677chn
    public boolean e() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6747cjD(C9935zP c9935zP, C6754cjK c6754cjK, String str, int i, String str2, String str3, String str4, String str5, String str6, String str7) {
        super(c9935zP, c6754cjK, null);
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) c6754cjK, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) str4, "");
        C8632dsu.c((Object) str5, "");
        C8632dsu.c((Object) str6, "");
        C8632dsu.c((Object) str7, "");
        this.e = str;
        this.a = i;
        this.h = str2;
        this.n = str3;
        this.f = str4;
        this.g = str5;
        this.i = str6;
        this.c = str7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(AbstractC6747cjD abstractC6747cjD, View view) {
        C8632dsu.c((Object) abstractC6747cjD, "");
        abstractC6747cjD.b().b(AbstractC6756cjM.class, AbstractC6756cjM.c.d);
    }

    @Override // o.bJF
    public void d(InterfaceC2023aX interfaceC2023aX, Context context, dpR dpr) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) dpr, "");
        bJX bjx = new bJX();
        bjx.b((CharSequence) "logo");
        bjx.d(C6763cjT.a.d);
        bjx.a(Integer.valueOf(this.a));
        interfaceC2023aX.add(bjx);
        bKU bku = new bKU();
        bku.d((CharSequence) "0spacer-1-1");
        float f = 24;
        C1332Xp c1332Xp = C1332Xp.b;
        bku.a(Integer.valueOf((int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
        interfaceC2023aX.add(bku);
        C3814bLq c3814bLq = new C3814bLq();
        c3814bLq.b((CharSequence) SignupConstants.Field.VIDEO_TITLE);
        c3814bLq.d((CharSequence) this.n);
        c3814bLq.d(C6763cjT.a.e);
        interfaceC2023aX.add(c3814bLq);
        bKU bku2 = new bKU();
        bku2.d((CharSequence) "0spacer-1");
        bku2.a(Integer.valueOf((int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
        interfaceC2023aX.add(bku2);
        C1781aO c1781aO = new C1781aO();
        c1781aO.b((CharSequence) "prop-1");
        c1781aO.e(C6763cjT.a.f);
        bJX bjx2 = new bJX();
        bjx2.b((CharSequence) "logo-1");
        bjx2.d(C6763cjT.a.b);
        bjx2.a(Integer.valueOf(C6763cjT.b.e));
        c1781aO.add(bjx2);
        C3814bLq c3814bLq2 = new C3814bLq();
        c3814bLq2.b((CharSequence) "prop-profiles");
        c3814bLq2.d((CharSequence) this.f);
        c3814bLq2.d(C6763cjT.a.i);
        c1781aO.add(c3814bLq2);
        interfaceC2023aX.add(c1781aO);
        bKU bku3 = new bKU();
        bku3.d((CharSequence) "prop-spacer-1");
        float f2 = 20;
        bku3.a(Integer.valueOf((int) TypedValue.applyDimension(1, f2, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
        interfaceC2023aX.add(bku3);
        C1781aO c1781aO2 = new C1781aO();
        c1781aO2.b((CharSequence) "prop-2");
        c1781aO2.e(C6763cjT.a.f);
        bJX bjx3 = new bJX();
        bjx3.b((CharSequence) "logo-2");
        bjx3.d(C6763cjT.a.b);
        bjx3.a(Integer.valueOf(C6763cjT.b.e));
        c1781aO2.add(bjx3);
        C3814bLq c3814bLq3 = new C3814bLq();
        c3814bLq3.b((CharSequence) "prop-watch");
        c3814bLq3.d((CharSequence) this.g);
        c3814bLq3.d(C6763cjT.a.i);
        c1781aO2.add(c3814bLq3);
        interfaceC2023aX.add(c1781aO2);
        bKU bku4 = new bKU();
        bku4.d((CharSequence) "prop-spacer-2");
        bku4.a(Integer.valueOf((int) TypedValue.applyDimension(1, f2, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
        interfaceC2023aX.add(bku4);
        C1781aO c1781aO3 = new C1781aO();
        c1781aO3.b((CharSequence) "prop-3");
        c1781aO3.e(C6763cjT.a.f);
        bJX bjx4 = new bJX();
        bjx4.b((CharSequence) "logo-3");
        bjx4.d(C6763cjT.a.b);
        bjx4.a(Integer.valueOf(C6763cjT.b.e));
        c1781aO3.add(bjx4);
        C3814bLq c3814bLq4 = new C3814bLq();
        c3814bLq4.b((CharSequence) "prop-password");
        c3814bLq4.d((CharSequence) this.i);
        c3814bLq4.d(C6763cjT.a.i);
        c1781aO3.add(c3814bLq4);
        interfaceC2023aX.add(c1781aO3);
        bKU bku5 = new bKU();
        bku5.d((CharSequence) "0spacer-3");
        bku5.a(Integer.valueOf((int) TypedValue.applyDimension(1, 48, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
        interfaceC2023aX.add(bku5);
        C3814bLq c3814bLq5 = new C3814bLq();
        c3814bLq5.b((CharSequence) "createAccount");
        c3814bLq5.d((CharSequence) this.c);
        c3814bLq5.d(C6763cjT.a.a);
        interfaceC2023aX.add(c3814bLq5);
        bKU bku6 = new bKU();
        bku6.d((CharSequence) "0spacer-4");
        bku6.a(Integer.valueOf((int) TypedValue.applyDimension(1, 8, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
        interfaceC2023aX.add(bku6);
        C3764bJu c3764bJu = new C3764bJu();
        c3764bJu.c((CharSequence) "copy-link");
        c3764bJu.e(C3796bKz.g.h);
        c3764bJu.b((CharSequence) "Netflix.com/Create");
        c3764bJu.d((CharSequence) this.h);
        c3764bJu.e((CharSequence) C8168dfL.d(C6763cjT.d.j));
        c3764bJu.b((drX<? super View, ? super CharSequence, dpR>) new drX<View, CharSequence, dpR>() { // from class: com.netflix.mediaclient.ui.multihousehold.impl.MultihouseholdBorrowerNudgeModal$models$13$1
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(View view, CharSequence charSequence) {
                b(view, charSequence);
                return dpR.c;
            }

            public final void b(View view, CharSequence charSequence) {
                String str;
                C9935zP b = AbstractC6747cjD.this.b();
                str = AbstractC6747cjD.this.h;
                b.b(AbstractC6756cjM.class, new AbstractC6756cjM.a(str));
            }
        });
        interfaceC2023aX.add(c3764bJu);
        bKU bku7 = new bKU();
        bku7.d((CharSequence) "0spacer-4");
        bku7.a(Integer.valueOf((int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
        interfaceC2023aX.add(bku7);
        C3805bLh c3805bLh = new C3805bLh();
        c3805bLh.e((CharSequence) "button-back");
        c3805bLh.c(C6763cjT.a.c);
        c3805bLh.b((CharSequence) C8168dfL.d(C6763cjT.d.a));
        c3805bLh.b(new View.OnClickListener() { // from class: o.cjF
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC6747cjD.e(AbstractC6747cjD.this, view);
            }
        });
        interfaceC2023aX.add(c3805bLh);
        bKU bku8 = new bKU();
        bku8.d((CharSequence) "0spacer-5");
        bku8.a(Integer.valueOf((int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
        interfaceC2023aX.add(bku8);
    }
}
