package o;

import android.content.Context;
import android.view.View;
import com.netflix.cl.model.CommandValue;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import o.AbstractC7097cpl;
import o.C1026Lt;
import o.C7104cps;
import o.C9834xU;

/* renamed from: o.cpm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7098cpm extends AbstractC6677chn {
    public static final a b = new a(null);
    public static final int e = 8;
    private final C9935zP a;
    private final InterfaceC5283bvo c;
    private final String h;

    @Override // o.AbstractC6677chn
    public String c() {
        return this.h;
    }

    /* renamed from: o.cpm$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }

    public C7098cpm(C9935zP c9935zP, InterfaceC5283bvo interfaceC5283bvo) {
        C8632dsu.c((Object) c9935zP, "");
        this.a = c9935zP;
        this.c = interfaceC5283bvo;
        this.h = "Notification.Permission.Modal";
    }

    @Override // o.bJF
    /* renamed from: b */
    public void d(InterfaceC2023aX interfaceC2023aX, Context context, dpR dpr) {
        String profileName;
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) dpr, "");
        InterfaceC5283bvo interfaceC5283bvo = this.c;
        String c = (interfaceC5283bvo == null || (profileName = interfaceC5283bvo.getProfileName()) == null) ? null : C1333Xq.d(C7104cps.a.t).d(SignupConstants.Field.PROFILE_NAME, profileName).c();
        if (c == null) {
            c = C8168dfL.d(C7104cps.a.s);
            C8632dsu.a(c, "");
        }
        C1781aO c1781aO = new C1781aO();
        c1781aO.b((CharSequence) "header-group");
        c1781aO.e(C7104cps.b.j);
        C3771bKa c3771bKa = new C3771bKa();
        c3771bKa.e((CharSequence) "close-button");
        c3771bKa.d(C7104cps.b.e);
        c3771bKa.c(Integer.valueOf(C1026Lt.a.RB));
        c3771bKa.b(new View.OnClickListener() { // from class: o.cpn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7098cpm.j(C7098cpm.this, view);
            }
        });
        c1781aO.add(c3771bKa);
        C7111cpz c7111cpz = new C7111cpz();
        c7111cpz.c((CharSequence) "header-notification-sample");
        c7111cpz.e((CharSequence) c);
        c7111cpz.a(C8168dfL.d(C7104cps.a.c));
        c1781aO.add(c7111cpz);
        interfaceC2023aX.add(c1781aO);
        C1781aO c1781aO2 = new C1781aO();
        c1781aO2.b("rationale");
        c1781aO2.e(C7104cps.b.g);
        C3814bLq c3814bLq = new C3814bLq();
        c3814bLq.b((CharSequence) SignupConstants.Field.VIDEO_TITLE);
        c3814bLq.d((CharSequence) C8168dfL.d(C7104cps.a.q));
        c3814bLq.d(C7104cps.b.f13763o);
        c1781aO2.add(c3814bLq);
        C1781aO c1781aO3 = new C1781aO();
        c1781aO3.b((CharSequence) "content-group-1");
        c1781aO3.e(C7104cps.b.i);
        bJX bjx = new bJX();
        bjx.b((CharSequence) "thumb-icon");
        bjx.d(C7104cps.b.f);
        bjx.a(Integer.valueOf(C1026Lt.a.Na));
        c1781aO3.add(bjx);
        bKU bku = new bKU();
        bku.d((CharSequence) "content-group-inside-space-1");
        bku.d(Integer.valueOf(context.getResources().getDimensionPixelSize(C9834xU.a.f13911o)));
        c1781aO3.add(bku);
        C3814bLq c3814bLq2 = new C3814bLq();
        c3814bLq2.b((CharSequence) "content-1");
        c3814bLq2.d((CharSequence) C8168dfL.d(C7104cps.a.f13762o));
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
        c3814bLq3.d((CharSequence) C8168dfL.d(C7104cps.a.k));
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
        c3805bLh.b(new View.OnClickListener() { // from class: o.cpp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7098cpm.e(C7098cpm.this, view);
            }
        });
        c1781aO2.add(c3805bLh);
        C3805bLh c3805bLh2 = new C3805bLh();
        c3805bLh2.e((CharSequence) "button-negative");
        c3805bLh2.c(C7104cps.b.b);
        c3805bLh2.b((CharSequence) C8168dfL.d(C7104cps.a.f));
        c3805bLh2.b(new View.OnClickListener() { // from class: o.cpq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7098cpm.f(C7098cpm.this, view);
            }
        });
        c1781aO2.add(c3805bLh2);
        C3805bLh c3805bLh3 = new C3805bLh();
        c3805bLh3.e((CharSequence) "button-neutral");
        c3805bLh3.c(C7104cps.b.a);
        c3805bLh3.b((CharSequence) C8168dfL.d(C7104cps.a.m));
        c3805bLh3.b(new View.OnClickListener() { // from class: o.cpo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7098cpm.h(C7098cpm.this, view);
            }
        });
        c1781aO2.add(c3805bLh3);
        C3814bLq c3814bLq4 = new C3814bLq();
        c3814bLq4.b((CharSequence) "legal");
        c3814bLq4.d((CharSequence) C8168dfL.d(C7104cps.a.l));
        c3814bLq4.d(C7104cps.b.m);
        c1781aO2.add(c3814bLq4);
        interfaceC2023aX.add(c1781aO2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(C7098cpm c7098cpm, View view) {
        C8632dsu.c((Object) c7098cpm, "");
        C7095cpj.d.c(CommandValue.DismissInterstitialCommand);
        c7098cpm.a.b(AbstractC7097cpl.class, new AbstractC7097cpl.a(c7098cpm.g()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C7098cpm c7098cpm, View view) {
        C8632dsu.c((Object) c7098cpm, "");
        C7095cpj.d.c(CommandValue.AllowNotificationsCommand);
        c7098cpm.a.b(AbstractC7097cpl.class, new AbstractC7097cpl.d(c7098cpm.g()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C7098cpm c7098cpm, View view) {
        C8632dsu.c((Object) c7098cpm, "");
        C7095cpj.d.c(CommandValue.DontAllowNotificationsCommand);
        c7098cpm.a.b(AbstractC7097cpl.class, new AbstractC7097cpl.b(c7098cpm.g()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(C7098cpm c7098cpm, View view) {
        C8632dsu.c((Object) c7098cpm, "");
        C7095cpj.d.c(CommandValue.SkipNotificationsPermissionsCommand);
        c7098cpm.a.b(AbstractC7097cpl.class, new AbstractC7097cpl.a(c7098cpm.g()));
    }
}
