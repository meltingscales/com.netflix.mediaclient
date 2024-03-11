package o;

import android.content.Context;
import android.view.View;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.AbstractC6756cjM;
import o.AbstractC6764cjU;
import o.C1208Sv;
import o.C6763cjT;

/* renamed from: o.cjN  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6757cjN extends AbstractC6764cjU {
    private final int a;
    private final List<AbstractC6764cjU.e> b;
    private final String c;
    private final boolean f;
    private final boolean g;
    private final String h;
    private final CharSequence i;
    private final String n;

    /* renamed from: o  reason: collision with root package name */
    private final String f13739o;

    @Override // o.AbstractC6677chn
    public String c() {
        return this.c;
    }

    @Override // o.AbstractC6677chn
    public boolean e() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6757cjN(C9935zP c9935zP, C6754cjK c6754cjK, String str, int i, String str2, CharSequence charSequence, String str3, boolean z, String str4, List<AbstractC6764cjU.e> list, boolean z2) {
        super(c9935zP, c6754cjK, null);
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) c6754cjK, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) str4, "");
        C8632dsu.c((Object) list, "");
        this.c = str;
        this.a = i;
        this.f13739o = str2;
        this.i = charSequence;
        this.n = str3;
        this.f = z;
        this.h = str4;
        this.b = list;
        this.g = z2;
    }

    /* renamed from: o.cjN$b */
    /* loaded from: classes4.dex */
    public static final class b implements C1208Sv.d {
        @Override // o.C1208Sv.d
        public void e() {
        }

        b() {
        }

        @Override // o.C1208Sv.d
        public void b(String str) {
            C8632dsu.c((Object) str, "");
            AbstractC6757cjN.this.d().b(AbstractC6756cjM.class, new AbstractC6756cjM.g(str, AbstractC6757cjN.this.g));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(AbstractC6757cjN abstractC6757cjN, AbstractC6764cjU.e eVar, View view) {
        C8632dsu.c((Object) abstractC6757cjN, "");
        C8632dsu.c((Object) eVar, "");
        abstractC6757cjN.d().b(AbstractC6756cjM.class, eVar.e());
    }

    @Override // o.bJF
    /* renamed from: b */
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
        bku.d((CharSequence) "0spacer-1");
        bku.a(Integer.valueOf((int) context.getResources().getDimension(C6763cjT.e.b)));
        interfaceC2023aX.add(bku);
        C3814bLq c3814bLq = new C3814bLq();
        c3814bLq.b((CharSequence) SignupConstants.Field.VIDEO_TITLE);
        c3814bLq.d((CharSequence) this.f13739o);
        c3814bLq.d(C6763cjT.a.e);
        interfaceC2023aX.add(c3814bLq);
        bKU bku2 = new bKU();
        bku2.d((CharSequence) "0spacer-2");
        bku2.a(Integer.valueOf((int) context.getResources().getDimension(C6763cjT.e.b)));
        interfaceC2023aX.add(bku2);
        C3814bLq c3814bLq2 = new C3814bLq();
        c3814bLq2.b((CharSequence) "subtitle");
        c3814bLq2.d(this.i);
        c3814bLq2.d(C6763cjT.a.i);
        interfaceC2023aX.add(c3814bLq2);
        bKU bku3 = new bKU();
        bku3.d((CharSequence) "0spacer-3");
        bku3.a(Integer.valueOf((int) context.getResources().getDimension(C6763cjT.e.b)));
        interfaceC2023aX.add(bku3);
        C3814bLq c3814bLq3 = new C3814bLq();
        c3814bLq3.b((CharSequence) "subtitle-expiry");
        c3814bLq3.d((CharSequence) this.n);
        c3814bLq3.d(C6763cjT.a.i);
        interfaceC2023aX.add(c3814bLq3);
        bKU bku4 = new bKU();
        bku4.d((CharSequence) "0spacer-4");
        bku4.a(Integer.valueOf((int) context.getResources().getDimension(C6763cjT.e.e)));
        interfaceC2023aX.add(bku4);
        if (this.f) {
            C3791bKu c3791bKu = new C3791bKu();
            c3791bKu.d((CharSequence) this.h);
            c3791bKu.e(C6763cjT.a.g);
            c3791bKu.c((C1208Sv.d) new b());
            interfaceC2023aX.add(c3791bKu);
        }
        bKU bku5 = new bKU();
        bku5.d((CharSequence) "0spacer-5");
        bku5.a(Integer.valueOf((int) context.getResources().getDimension(C6763cjT.e.c)));
        interfaceC2023aX.add(bku5);
        for (final AbstractC6764cjU.e eVar : this.b) {
            C3805bLh c3805bLh = new C3805bLh();
            c3805bLh.e((CharSequence) eVar.c());
            c3805bLh.c(eVar.a());
            c3805bLh.b((CharSequence) eVar.d());
            c3805bLh.b(new View.OnClickListener() { // from class: o.cjP
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC6757cjN.c(AbstractC6757cjN.this, eVar, view);
                }
            });
            interfaceC2023aX.add(c3805bLh);
            bKU bku6 = new bKU();
            bku6.d((CharSequence) "0spacer-6");
            bku6.a(Integer.valueOf((int) context.getResources().getDimension(C6763cjT.e.d)));
            interfaceC2023aX.add(bku6);
        }
        bKU bku7 = new bKU();
        bku7.d((CharSequence) "0spacer-7");
        bku7.a(Integer.valueOf((int) context.getResources().getDimension(C6763cjT.e.d)));
        interfaceC2023aX.add(bku7);
        C3814bLq c3814bLq4 = new C3814bLq();
        c3814bLq4.b((CharSequence) "sharing-link");
        c3814bLq4.d((CharSequence) C8168dfL.c(C1333Xq.d(C8168dfL.d(C6763cjT.d.t)).c()));
        c3814bLq4.d(C6763cjT.a.a);
        c3814bLq4.b(true);
        interfaceC2023aX.add(c3814bLq4);
        bKU bku8 = new bKU();
        bku8.d((CharSequence) "0spacer-8");
        bku8.a(Integer.valueOf((int) context.getResources().getDimension(C6763cjT.e.a)));
        interfaceC2023aX.add(bku8);
    }
}
