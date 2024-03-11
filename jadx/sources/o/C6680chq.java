package o;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen;
import java.util.Map;
import javax.inject.Inject;
import o.AbstractC6677chn;
import o.C6680chq;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.dpR;

/* renamed from: o.chq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6680chq implements InterfaceC6675chl {
    public static final e a = new e(null);
    public static final int b = 8;
    private final NetflixActivity e;

    public Void c() {
        return null;
    }

    public Void i() {
        return null;
    }

    @Inject
    public C6680chq(Activity activity) {
        C8632dsu.c((Object) activity, "");
        this.e = (NetflixActivity) C9726vo.d(activity, NetflixActivity.class);
        AbstractC6677chn.j.d("ExampleComposeUma", new AbstractC6677chn.a() { // from class: o.chq.5
            @Override // o.AbstractC6677chn.a
            public AbstractC6677chn d(Fragment fragment) {
                C8632dsu.c((Object) fragment, "");
                final C6680chq c6680chq = C6680chq.this;
                return new C6646chI(new drO<dpR>() { // from class: com.netflix.mediaclient.ui.messaging.impl.MessagingImpl$1$create$1
                    {
                        super(0);
                    }

                    @Override // o.drO
                    public /* synthetic */ dpR invoke() {
                        e();
                        return dpR.c;
                    }

                    public final void e() {
                        C6680chq.this.f();
                    }
                });
            }
        });
    }

    @Override // o.InterfaceC6675chl
    public /* synthetic */ AbstractC6677chn a() {
        return (AbstractC6677chn) c();
    }

    @Override // o.InterfaceC6675chl
    public /* synthetic */ AbstractC6677chn b() {
        return (AbstractC6677chn) i();
    }

    /* renamed from: o.chq$e */
    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("MessagingImpl");
        }
    }

    @Override // o.InterfaceC6675chl
    public LifecycleOwner e(AbstractC6677chn abstractC6677chn, Integer num, boolean z) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) abstractC6677chn, "");
        C6681chr g = g();
        if (z) {
            if ((g != null ? g.b() : null) != null) {
                if (C8632dsu.c((Object) g.b(), (Object) abstractC6677chn.g())) {
                    g.j().a(abstractC6677chn);
                    return g.getViewLifecycleOwner();
                }
                InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
                String b2 = g.b();
                aVar.a("displayed:" + b2);
                String g2 = abstractC6677chn.g();
                aVar.a("screen:" + g2);
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd = new C1596aHd("can't switch page, not the same screen's group", null, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b3 = c1596aHd.b();
                    if (b3 != null) {
                        String c = errorType.c();
                        c1596aHd.a(c + " " + b3);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th = new Throwable(c1596aHd.b());
                } else {
                    th = c1596aHd.i;
                    if (th == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a2 = dVar.a();
                if (a2 != null) {
                    a2.e(c1596aHd, th);
                    return null;
                }
                dVar.e().b(c1596aHd, th);
                return null;
            }
        }
        C6681chr c6681chr = new C6681chr();
        c6681chr.b(abstractC6677chn);
        if (num != null) {
            c6681chr.d(num.intValue());
        }
        c6681chr.showNow(this.e.getSupportFragmentManager(), "MessagingDialogFrag");
        return c6681chr.getViewLifecycleOwner();
    }

    @Override // o.InterfaceC6675chl
    public DialogFragment e() {
        Fragment findFragmentByTag = this.e.getSupportFragmentManager().findFragmentByTag("MessagingDialogFrag");
        if (findFragmentByTag instanceof DialogFragment) {
            return (DialogFragment) findFragmentByTag;
        }
        return null;
    }

    @Override // o.InterfaceC6675chl
    public boolean c(AbstractC6677chn abstractC6677chn, boolean z) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) abstractC6677chn, "");
        NetflixDialogFrag fullscreenDialogFragment = this.e.getFullscreenDialogFragment();
        C6686chw c6686chw = fullscreenDialogFragment instanceof C6686chw ? (C6686chw) fullscreenDialogFragment : null;
        if (z) {
            if ((c6686chw != null ? c6686chw.b() : null) != null) {
                if (C8632dsu.c((Object) c6686chw.b(), (Object) abstractC6677chn.g())) {
                    c6686chw.j().a(abstractC6677chn);
                    return true;
                }
                InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
                String b2 = c6686chw.b();
                aVar.a("displayed:" + b2);
                String g = abstractC6677chn.g();
                aVar.a("screen:" + g);
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd = new C1596aHd("can't switch page, not the same screen's group", null, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b3 = c1596aHd.b();
                    if (b3 != null) {
                        String c = errorType.c();
                        c1596aHd.a(c + " " + b3);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th = new Throwable(c1596aHd.b());
                } else {
                    th = c1596aHd.i;
                    if (th == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a2 = dVar.a();
                if (a2 != null) {
                    a2.e(c1596aHd, th);
                } else {
                    dVar.e().b(c1596aHd, th);
                }
                return false;
            }
        }
        NetflixActivity netflixActivity = this.e;
        C6686chw c6686chw2 = new C6686chw();
        c6686chw2.b(abstractC6677chn);
        return netflixActivity.showFullScreenDialog(c6686chw2);
    }

    @Override // o.InterfaceC6675chl
    public boolean b(String str) {
        C8632dsu.c((Object) str, "");
        NetflixDialogFrag fullscreenDialogFragment = this.e.getFullscreenDialogFragment();
        if (fullscreenDialogFragment instanceof C6686chw) {
            C6686chw c6686chw = (C6686chw) fullscreenDialogFragment;
            if (C8632dsu.c((Object) c6686chw.b(), (Object) str)) {
                c6686chw.m();
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC6675chl
    public boolean e(String str) {
        C8632dsu.c((Object) str, "");
        C6681chr g = g();
        if (g == null || !C8632dsu.c((Object) g.b(), (Object) str)) {
            return false;
        }
        g.n();
        return true;
    }

    @Override // o.InterfaceC6675chl
    public boolean e(MessagingTooltipScreen messagingTooltipScreen, Integer num, boolean z) {
        boolean z2;
        C8632dsu.c((Object) messagingTooltipScreen, "");
        if (this.e.isDialogFragmentVisible() && (this.e.getFullscreenDialogFragment() instanceof C6683cht)) {
            NetflixDialogFrag fullscreenDialogFragment = this.e.getFullscreenDialogFragment();
            C8632dsu.d(fullscreenDialogFragment);
            C6683cht c6683cht = (C6683cht) fullscreenDialogFragment;
            View findViewById = num != null ? this.e.findViewById(num.intValue()) : null;
            if (messagingTooltipScreen.r() == MessagingTooltipScreen.ScreenType.b) {
                c6683cht.j().a(messagingTooltipScreen);
                z2 = true;
            } else {
                z2 = false;
            }
            InterfaceC6682chs o2 = c6683cht.o();
            if (o2 != null) {
                o2.c(findViewById, z2, z);
                return true;
            }
            return true;
        }
        NetflixActivity netflixActivity = this.e;
        C6683cht c6683cht2 = new C6683cht();
        Bundle bundle = new Bundle();
        if (num != null) {
            bundle.putInt("messaging.api.screen.anchorViewId", num.intValue());
        }
        c6683cht2.setArguments(bundle);
        c6683cht2.b(messagingTooltipScreen);
        return netflixActivity.showFullScreenDialog(c6683cht2);
    }

    @Override // o.InterfaceC6675chl
    public boolean d(String str, drO<dpR> dro) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) dro, "");
        NetflixDialogFrag fullscreenDialogFragment = this.e.getFullscreenDialogFragment();
        if (fullscreenDialogFragment instanceof C6683cht) {
            C6683cht c6683cht = (C6683cht) fullscreenDialogFragment;
            if (C8632dsu.c((Object) c6683cht.b(), (Object) str)) {
                c6683cht.e(dro);
                return true;
            }
        }
        return false;
    }

    private final C6681chr g() {
        Fragment findFragmentByTag = this.e.getSupportFragmentManager().findFragmentByTag(C6681chr.i.getLogTag());
        if (findFragmentByTag instanceof C6681chr) {
            return (C6681chr) findFragmentByTag;
        }
        return null;
    }

    @Override // o.InterfaceC6675chl
    public boolean d() {
        AbstractC6677chn g;
        AbstractC6677chn g2;
        NetflixDialogFrag fullscreenDialogFragment = this.e.getFullscreenDialogFragment();
        C6686chw c6686chw = fullscreenDialogFragment instanceof C6686chw ? (C6686chw) fullscreenDialogFragment : null;
        if (c6686chw == null || (g2 = c6686chw.g()) == null) {
            C6681chr g3 = g();
            if (g3 == null || (g = g3.g()) == null) {
                return false;
            }
            return g.o();
        }
        return g2.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        e("ExampleComposeUma");
    }
}
