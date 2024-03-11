package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.netflix.mediaclient.util.AccessibilityUtils;
import com.netflix.model.leafs.advisory.ContentAdvisory;
import java.util.List;
import o.C1332Xp;
import o.InterfaceC1610aHr;
import o.cBQ;
import o.cIE;

/* renamed from: o.cGn  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5738cGn extends AbstractC5765cHn implements cFJ {
    public static final e a = new e(null);
    private final DecelerateInterpolator b;
    private List<String> c;
    private final InterfaceC8554dpx d;
    private final ViewGroup e;
    private final AccelerateInterpolator f;
    private String g;
    private final ViewGroup h;
    private final View j;
    private final View k;
    private final int m;

    @Override // o.AbstractC9944zY
    public View e() {
        return this.k;
    }

    @Override // o.cFJ
    public long h() {
        return 660L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5738cGn(ViewGroup viewGroup) {
        super(viewGroup);
        InterfaceC8554dpx b;
        C8632dsu.c((Object) viewGroup, "");
        this.h = viewGroup;
        this.k = C9703vR.e(viewGroup, cIE.c.c, 0, 2, null);
        View findViewById = e().findViewById(cIE.b.cs);
        C8632dsu.a(findViewById, "");
        this.j = findViewById;
        View findViewById2 = e().findViewById(cIE.b.a);
        C8632dsu.a(findViewById2, "");
        this.e = (ViewGroup) findViewById2;
        b = dpB.b(new drO<InterfaceC1610aHr>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.PlayerContentAdvisoryUIView$advisoryProvider$2
            @Override // o.drO
            /* renamed from: e */
            public final InterfaceC1610aHr invoke() {
                C1332Xp c1332Xp = C1332Xp.b;
                return (InterfaceC1610aHr) C1332Xp.b(InterfaceC1610aHr.class);
            }
        });
        this.d = b;
        this.m = viewGroup.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.i);
        this.b = new DecelerateInterpolator();
        this.f = new AccelerateInterpolator();
    }

    private final InterfaceC1610aHr f() {
        return (InterfaceC1610aHr) this.d.getValue();
    }

    /* renamed from: o.cGn$e */
    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("PlayerContentAdvisoryUIView");
        }
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void c() {
        AbstractC5765cHn.a(this, false, 0L, 0L, false, 14, null);
        String str = this.g;
        if (str != null) {
            a.getLogTag();
            b((C5738cGn) new cBQ.h(str, 2));
            this.g = null;
        }
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void a() {
        AbstractC5765cHn.a(this, true, 0L, 0L, false, 14, null);
        List<String> list = this.c;
        if (list != null) {
            e(list);
        }
    }

    private final void g() {
        View view = this.j;
        view.setTranslationY(view.getMeasuredHeight());
        this.e.setTranslationY(this.m);
    }

    @Override // o.cFJ
    public void d(final boolean z, final String str) {
        C8632dsu.c((Object) str, "");
        this.g = null;
        if (this.e.getChildCount() == 0) {
            return;
        }
        final Runnable runnable = new Runnable() { // from class: o.cGr
            @Override // java.lang.Runnable
            public final void run() {
                C5738cGn.b(z, this, str);
            }
        };
        if (C()) {
            a();
            this.j.setAlpha(1.0f);
            this.e.setAlpha(1.0f);
            C8187dfe.a(runnable, 660L);
            return;
        }
        C8187dfe.c(new Runnable() { // from class: o.cGo
            @Override // java.lang.Runnable
            public final void run() {
                C5738cGn.d(C5738cGn.this, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C5738cGn c5738cGn, Runnable runnable) {
        C8632dsu.c((Object) c5738cGn, "");
        C8632dsu.c((Object) runnable, "");
        c5738cGn.a();
        c5738cGn.g();
        c5738cGn.j.setAlpha(1.0f);
        c5738cGn.j.animate().translationYBy(-c5738cGn.j.getMeasuredHeight()).setInterpolator(c5738cGn.b).setDuration(660L);
        c5738cGn.e.animate().alpha(1.0f).translationYBy(-c5738cGn.m).setInterpolator(c5738cGn.b).setDuration(660L);
        c5738cGn.e().animate().setInterpolator(c5738cGn.b).setDuration(660L).withEndAction(runnable);
        c5738cGn.b((C5738cGn) cBQ.g.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final C5738cGn c5738cGn) {
        C8632dsu.c((Object) c5738cGn, "");
        c5738cGn.c();
        c5738cGn.j.animate().translationYBy(-c5738cGn.j.getMeasuredHeight()).setInterpolator(c5738cGn.f).setDuration(400L);
        c5738cGn.e.animate().alpha(0.0f).translationYBy(-c5738cGn.m).setInterpolator(c5738cGn.f).setDuration(500L);
        c5738cGn.e().animate().setInterpolator(c5738cGn.f).setDuration(833L).withEndAction(new Runnable() { // from class: o.cGp
            @Override // java.lang.Runnable
            public final void run() {
                C5738cGn.e(C5738cGn.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C5738cGn c5738cGn) {
        C8632dsu.c((Object) c5738cGn, "");
        c5738cGn.i();
    }

    private final void i() {
        c();
        this.j.setAlpha(0.0f);
        this.j.setTranslationY(0.0f);
        this.e.setTranslationY(0.0f);
        if (e().getVisibility() != 0) {
            b((C5738cGn) cBQ.a.d);
        }
    }

    @Override // o.cFJ
    public void j() {
        this.j.animate().cancel();
        this.e.animate().cancel();
        A();
        e().animate().cancel();
    }

    private final void a(View view) {
        this.e.removeAllViews();
        if (view != null) {
            this.e.addView(view);
        }
    }

    private final void b(String... strArr) {
        List<String> p;
        p = C8564dqg.p(strArr);
        this.c = p;
    }

    @Override // o.cFJ
    public void a(String str, String str2) {
        C8632dsu.c((Object) str, "");
        InterfaceC1610aHr f = f();
        Context context = e().getContext();
        C8632dsu.a(context, "");
        a(f.b(context, str, str2));
        b(str, str2);
    }

    @Override // o.cFJ
    public void e(ContentAdvisory contentAdvisory) {
        if (contentAdvisory == null) {
            this.e.removeAllViews();
            b(null);
            return;
        }
        InterfaceC1610aHr f = f();
        Context context = e().getContext();
        C8632dsu.a(context, "");
        View b = f.b(context, contentAdvisory, false);
        if (b != null) {
            a(b);
            b(contentAdvisory.getI18nRating(), contentAdvisory.getI18nAdvisories());
        }
    }

    @Override // o.cFJ
    public void c(boolean z, String str) {
        C8632dsu.c((Object) str, "");
        this.g = null;
        if (z) {
            a.getLogTag();
            b((C5738cGn) new cBQ.h(str, 1));
        }
        if (C()) {
            c();
        } else {
            C8187dfe.c(new Runnable() { // from class: o.cGq
                @Override // java.lang.Runnable
                public final void run() {
                    C5738cGn.d(C5738cGn.this);
                }
            });
        }
    }

    private final void e(List<String> list) {
        for (String str : list) {
            if (str != null) {
                C1332Xp c1332Xp = C1332Xp.b;
                AccessibilityUtils.b((Context) C1332Xp.b(Context.class), str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(boolean z, C5738cGn c5738cGn, String str) {
        C8632dsu.c((Object) c5738cGn, "");
        C8632dsu.c((Object) str, "");
        if (z) {
            a.getLogTag();
            c5738cGn.b((C5738cGn) new cBQ.h(str, 0));
            c5738cGn.g = str;
        }
    }
}
