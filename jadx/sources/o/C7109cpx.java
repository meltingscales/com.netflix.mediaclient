package o;

import android.content.Context;
import android.view.View;
import com.netflix.cl.model.CommandValue;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import o.AbstractC7097cpl;
import o.C1026Lt;
import o.C7104cps;
import o.C9834xU;

/* renamed from: o.cpx  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7109cpx extends AbstractC6677chn {
    private final String b;
    private final C9935zP e;
    private final String h;
    public static final e c = new e(null);
    public static final int a = 8;

    @Override // o.AbstractC6677chn
    public String c() {
        return this.h;
    }

    public C7109cpx(C9935zP c9935zP, String str) {
        C8632dsu.c((Object) c9935zP, "");
        this.e = c9935zP;
        this.b = str;
        this.h = "Notification.RemindMe.Permission.Modal";
    }

    /* renamed from: o.cpx$e */
    /* loaded from: classes4.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }

    @Override // o.bJF
    public void d(InterfaceC2023aX interfaceC2023aX, Context context, dpR dpr) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) dpr, "");
        String d = C8168dfL.d(C7104cps.a.s);
        C8632dsu.a(d, "");
        C1781aO c1781aO = new C1781aO();
        c1781aO.b((CharSequence) "header-group");
        c1781aO.e(C7104cps.b.j);
        C3771bKa c3771bKa = new C3771bKa();
        c3771bKa.e((CharSequence) "close-button");
        c3771bKa.d(C7104cps.b.e);
        c3771bKa.c(Integer.valueOf(C1026Lt.a.RB));
        c3771bKa.b(new View.OnClickListener() { // from class: o.cpy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7109cpx.j(C7109cpx.this, view);
            }
        });
        c1781aO.add(c3771bKa);
        C7111cpz c7111cpz = new C7111cpz();
        c7111cpz.c((CharSequence) "header-notification-sample");
        c7111cpz.e((CharSequence) d);
        c7111cpz.a(C8168dfL.d(C7104cps.a.c));
        c1781aO.add(c7111cpz);
        interfaceC2023aX.add(c1781aO);
        C1781aO c1781aO2 = new C1781aO();
        c1781aO2.b("rationale");
        c1781aO2.e(C7104cps.b.g);
        C3814bLq c3814bLq = new C3814bLq();
        c3814bLq.b((CharSequence) SignupConstants.Field.VIDEO_TITLE);
        c3814bLq.d((CharSequence) d());
        c3814bLq.d(C7104cps.b.d);
        c1781aO2.add(c3814bLq);
        C1781aO c1781aO3 = new C1781aO();
        c1781aO3.b((CharSequence) "content-group-1");
        c1781aO3.e(C7104cps.b.i);
        bJX bjx = new bJX();
        bjx.b((CharSequence) "thumb-icon");
        bjx.d(C7104cps.b.f);
        bjx.a(Integer.valueOf(C1026Lt.a.da));
        c1781aO3.add(bjx);
        bKU bku = new bKU();
        bku.d((CharSequence) "content-group-inside-space-1");
        bku.d(Integer.valueOf(context.getResources().getDimensionPixelSize(C9834xU.a.f13911o)));
        c1781aO3.add(bku);
        C3814bLq c3814bLq2 = new C3814bLq();
        c3814bLq2.b((CharSequence) "content-1");
        c3814bLq2.d((CharSequence) e(this.b));
        c3814bLq2.d(C7104cps.b.h);
        c1781aO3.add(c3814bLq2);
        c1781aO2.add(c1781aO3);
        bKU bku2 = new bKU();
        bku2.d((CharSequence) "content-groups-space-1");
        bku2.a(Integer.valueOf(context.getResources().getDimensionPixelSize(C9834xU.a.f13911o)));
        c1781aO2.add(bku2);
        C1781aO c1781aO4 = new C1781aO();
        c1781aO4.b((CharSequence) "content-group-2");
        c1781aO4.e(C7104cps.b.i);
        bJX bjx2 = new bJX();
        bjx2.b((CharSequence) "stack-icon");
        bjx2.d(C7104cps.b.f);
        bjx2.a(Integer.valueOf(C1026Lt.a.Qt));
        c1781aO4.add(bjx2);
        bKU bku3 = new bKU();
        bku3.d((CharSequence) "content-group-inside-space-2");
        bku3.d(Integer.valueOf(context.getResources().getDimensionPixelSize(C9834xU.a.f13911o)));
        c1781aO4.add(bku3);
        C3814bLq c3814bLq3 = new C3814bLq();
        c3814bLq3.b((CharSequence) "content-2");
        c3814bLq3.d((CharSequence) b());
        c3814bLq3.d(C7104cps.b.h);
        c1781aO4.add(c3814bLq3);
        c1781aO2.add(c1781aO4);
        bKU bku4 = new bKU();
        bku4.d((CharSequence) "content-groups-space-2");
        bku4.a(Integer.valueOf(context.getResources().getDimensionPixelSize(C9834xU.a.f13911o)));
        c1781aO2.add(bku4);
        C3805bLh c3805bLh = new C3805bLh();
        c3805bLh.e((CharSequence) "button-positive");
        c3805bLh.c(C7104cps.b.c);
        c3805bLh.b((CharSequence) C8168dfL.d(C7104cps.a.n));
        c3805bLh.b(new View.OnClickListener() { // from class: o.cpA
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7109cpx.e(C7109cpx.this, view);
            }
        });
        c1781aO2.add(c3805bLh);
        C3805bLh c3805bLh2 = new C3805bLh();
        c3805bLh2.e((CharSequence) "button-negative");
        c3805bLh2.c(C7104cps.b.b);
        c3805bLh2.b((CharSequence) C8168dfL.d(C7104cps.a.f));
        c3805bLh2.b(new View.OnClickListener() { // from class: o.cpD
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7109cpx.a(C7109cpx.this, view);
            }
        });
        c1781aO2.add(c3805bLh2);
        interfaceC2023aX.add(c1781aO2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(C7109cpx c7109cpx, View view) {
        C8632dsu.c((Object) c7109cpx, "");
        C7095cpj.d.c(CommandValue.DismissInterstitialCommand);
        c7109cpx.e.b(AbstractC7097cpl.class, new AbstractC7097cpl.a(c7109cpx.g()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C7109cpx c7109cpx, View view) {
        C8632dsu.c((Object) c7109cpx, "");
        C7095cpj.d.c(CommandValue.AllowNotificationsCommand);
        c7109cpx.e.b(AbstractC7097cpl.class, new AbstractC7097cpl.c(c7109cpx.g()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C7109cpx c7109cpx, View view) {
        C8632dsu.c((Object) c7109cpx, "");
        C7095cpj.d.c(CommandValue.DontAllowNotificationsCommand);
        c7109cpx.e.b(AbstractC7097cpl.class, new AbstractC7097cpl.b(c7109cpx.g()));
    }

    private final String d() {
        String d = C8168dfL.d(C7104cps.a.v);
        C8632dsu.a(d, "");
        return d;
    }

    private final String e(String str) {
        boolean g;
        if (str != null) {
            g = C8691duz.g(str);
            if (!g) {
                String c2 = C1333Xq.d(C7104cps.a.p).d(SignupConstants.Field.VIDEO_TITLE, str).c();
                C8632dsu.d((Object) c2);
                return c2;
            }
        }
        String d = C8168dfL.d(C7104cps.a.f13762o);
        C8632dsu.d((Object) d);
        return d;
    }

    private final String b() {
        String d = C8168dfL.d(C7104cps.a.r);
        C8632dsu.a(d, "");
        return d;
    }
}
