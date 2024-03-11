package o;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.res.ResourcesCompat;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab55851_MobileNav;
import kotlin.NoWhenBranchMatchedException;
import o.C4022bTi;
import o.C9834xU;

/* renamed from: o.bXq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4138bXq {
    public static final a b = new a(null);

    /* renamed from: o.bXq$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: o.bXq$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public final /* synthetic */ class C0105a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[Config_Ab55851_MobileNav.LolomoTabIcon.values().length];
                try {
                    iArr[Config_Ab55851_MobileNav.LolomoTabIcon.e.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Config_Ab55851_MobileNav.LolomoTabIcon.b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Config_Ab55851_MobileNav.LolomoTabIcon.d.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                a = iArr;
            }
        }

        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final Boolean c(View view, Activity activity, drO<dpR> dro) {
            int e;
            C8632dsu.c((Object) activity, "");
            C8632dsu.c((Object) dro, "");
            if (view == null) {
                return null;
            }
            C9851xl c2 = new C9851xl(activity, view).h(true).e(C9834xU.c.b).c(C9834xU.a.m, C9834xU.a.v, C9834xU.a.ae, C9834xU.a.am);
            int i = C9834xU.a.m;
            int i2 = C8153dex.Q() ? C9834xU.a.am : C9834xU.a.ae;
            int i3 = C9834xU.a.ae;
            C9851xl b = c2.b(i, i2, i3, i3);
            int i4 = C9834xU.c.y;
            C9851xl b2 = b.a(i4, Integer.valueOf(i4), false).e(false).d(false).d(new d(dro)).c(new c(view)).b(false);
            Resources resources = activity.getResources();
            int i5 = C0105a.a[Config_Ab55851_MobileNav.a.d().a().ordinal()];
            if (i5 == 1) {
                e = HawkinsIcon.eJ.c.e();
            } else if (i5 == 2) {
                e = HawkinsIcon.fE.b.e();
            } else if (i5 != 3) {
                throw new NoWhenBranchMatchedException();
            } else {
                e = HawkinsIcon.C0250eo.b.e();
            }
            Drawable drawable = ResourcesCompat.getDrawable(resources, e, activity.getTheme());
            C8632dsu.d(drawable);
            C9851xl d2 = b2.d(drawable);
            if (C8153dex.Q()) {
                d2.c(C4022bTi.g.f);
                C9851xl.d(d2, C4022bTi.g.j, null, null, 6, null);
            } else {
                d2.c(C4022bTi.g.f13545o);
                C9851xl.d(d2, C4022bTi.g.h, null, null, 6, null);
            }
            FrameLayout frameLayout = (FrameLayout) activity.findViewById(16908290);
            if (frameLayout != null) {
                d2.a().e((ViewGroup) frameLayout);
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }

        /* renamed from: o.bXq$a$d */
        /* loaded from: classes4.dex */
        public static final class d implements InterfaceC9757wS {
            final /* synthetic */ drO<dpR> d;

            @Override // o.InterfaceC9757wS
            public boolean c() {
                return true;
            }

            @Override // o.InterfaceC9762wX
            public void d(C9843xd c9843xd) {
                C8632dsu.c((Object) c9843xd, "");
            }

            d(drO<dpR> dro) {
                this.d = dro;
            }

            @Override // o.InterfaceC9762wX
            public void e(C9843xd c9843xd) {
                C8632dsu.c((Object) c9843xd, "");
                this.d.invoke();
            }
        }

        /* renamed from: o.bXq$a$c */
        /* loaded from: classes4.dex */
        public static final class c implements InterfaceC9841xb {
            final /* synthetic */ View e;

            @Override // o.InterfaceC9841xb
            public void c(C9843xd c9843xd) {
                C8632dsu.c((Object) c9843xd, "");
            }

            @Override // o.InterfaceC9841xb
            public void e(C9843xd c9843xd) {
                C8632dsu.c((Object) c9843xd, "");
            }

            c(View view) {
                this.e = view;
            }

            @Override // o.InterfaceC9841xb
            public void a(C9843xd c9843xd) {
                C8632dsu.c((Object) c9843xd, "");
                this.e.performClick();
            }
        }
    }
}
