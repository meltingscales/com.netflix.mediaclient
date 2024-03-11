package o;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.util.AccessibilityUtils;
import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import o.C3796bKz;
import o.C8632dsu;
import o.dpR;

/* renamed from: o.css */
/* loaded from: classes4.dex */
public class C7263css {
    private String a;
    private final PublishSubject<dpR> b;
    private final NetflixActivity d;
    private View e;

    public final View a() {
        return this.e;
    }

    public final NetflixActivity c() {
        return this.d;
    }

    public void c(boolean z) {
    }

    public final String d() {
        return this.a;
    }

    public final PublishSubject<dpR> e() {
        return this.b;
    }

    public final void e(View view) {
        this.e = view;
    }

    public C7263css(NetflixActivity netflixActivity) {
        C8632dsu.c((Object) netflixActivity, "");
        this.d = netflixActivity;
        PublishSubject<dpR> create = PublishSubject.create();
        C8632dsu.a(create, "");
        this.b = create;
    }

    public static /* synthetic */ void e(C7263css c7263css, boolean z, List list, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateGlobalNavActionBar");
        }
        if ((i & 4) != 0) {
            str = null;
        }
        c7263css.d(z, list, str);
    }

    public final void d(final boolean z, final List<? extends AbstractC7258csn<?>> list, String str) {
        if (str == null) {
            str = C8168dfL.d(com.netflix.mediaclient.ui.R.o.cb);
        }
        this.a = str;
        C9726vo.d(this.d.getNetflixActionBar(), this.d.getActionBarStateBuilder(), new drX<NetflixActionBar, NetflixActionBar.b.C0051b, dpR>() { // from class: com.netflix.mediaclient.ui.offline.DownloadsActionBarManager$updateGlobalNavActionBar$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(NetflixActionBar netflixActionBar, NetflixActionBar.b.C0051b c0051b) {
                e(netflixActionBar, c0051b);
                return dpR.c;
            }

            public final void e(NetflixActionBar netflixActionBar, NetflixActionBar.b.C0051b c0051b) {
                C8632dsu.c((Object) netflixActionBar, "");
                C8632dsu.c((Object) c0051b, "");
                boolean z2 = z;
                if (z2) {
                    this.c(netflixActionBar, c0051b, z2, list);
                    c0051b.k(true).b(this.c().getDrawable(C3796bKz.e.d)).b(this.c().getString(R.o.cL)).a(new ColorDrawable(this.c().getResources().getColor(R.c.e))).i(false).f(false).h(false);
                    View a = this.a();
                    if (a != null) {
                        a.setAlpha(0.3f);
                    }
                } else {
                    this.c(netflixActionBar, c0051b, z2, list);
                    c0051b.f(true).h(true);
                    View a2 = this.a();
                    if (a2 != null) {
                        a2.setAlpha(1.0f);
                    }
                }
                c0051b.g(true);
                netflixActionBar.c(c0051b.c());
            }
        });
    }

    public final Observable<dpR> b() {
        Observable<dpR> hide = this.b.hide();
        C8632dsu.a(hide, "");
        return hide;
    }

    public void a(NetflixActionBar.b.C0051b c0051b) {
        C8632dsu.c((Object) c0051b, "");
        c0051b.d(1);
        c0051b.e((CharSequence) d());
    }

    public final void c(NetflixActionBar netflixActionBar, NetflixActionBar.b.C0051b c0051b, boolean z, List<? extends AbstractC7258csn<?>> list) {
        String string;
        int d;
        long R;
        String d2 = d();
        if (z) {
            c0051b.d(0);
            if (list != null && !list.isEmpty()) {
                dsE dse = dsE.b;
                Locale locale = Locale.getDefault();
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(list.size());
                d = C8572dqo.d(list, 10);
                ArrayList arrayList = new ArrayList(d);
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((AbstractC7258csn) it.next()).m()));
                }
                R = C8576dqs.R(arrayList);
                objArr[1] = d(R);
                string = String.format(locale, "%d (%s)", Arrays.copyOf(objArr, 2));
                C8632dsu.a(string, "");
                b(c0051b, string, -1);
                c0051b.b(NetflixActionBar.LogoType.a);
            } else {
                string = this.d.getResources().getString(com.netflix.mediaclient.ui.R.o.ff);
                c(c0051b, string, -1);
            }
            d2 = string;
        } else {
            a(c0051b);
        }
        if (d2 != null) {
            AccessibilityUtils.b(this.d, d2);
        }
        netflixActionBar.c(c0051b.c());
        i();
    }

    private final void b(NetflixActionBar.b.C0051b c0051b, String str, int i) {
        c0051b.b(false).l(true).e((CharSequence) str).c(i);
    }

    private final void c(NetflixActionBar.b.C0051b c0051b, String str, int i) {
        c0051b.b(false).l(false).b((CharSequence) str).e(i);
    }

    private final String d(long j) {
        String d = C8176dfT.d(this.d, j);
        C8632dsu.a(d, "");
        return d;
    }

    private final void i() {
        if (C8054ddD.l(this.d)) {
            return;
        }
        this.d.invalidateOptionsMenu();
    }
}
