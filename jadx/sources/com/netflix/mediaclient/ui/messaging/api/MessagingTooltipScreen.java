package com.netflix.mediaclient.ui.messaging.api;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.fragment.app.Fragment;
import java.util.Map;
import o.AbstractC6677chn;
import o.C1619aI;
import o.C8600drp;
import o.C8632dsu;
import o.C9834xU;
import o.InterfaceC8598drn;
import o.dpR;
import o.drO;

/* loaded from: classes4.dex */
public abstract class MessagingTooltipScreen extends AbstractC6677chn {
    private final boolean b;
    private final a c;
    private final Integer e;
    private final boolean g;
    private final drO<dpR> k;
    private final ScreenType m = ScreenType.a;
    private final e i = e.C0071e.e;
    private final boolean n = true;
    private final int l = C9834xU.a.ad;
    private final Tooltip_Location h = Tooltip_Location.b;

    /* renamed from: o  reason: collision with root package name */
    private final int f13288o = C9834xU.a.y;
    private final C1619aI f = new C1619aI();
    private final int a = C9834xU.c.y;

    public a a() {
        return this.c;
    }

    public int b() {
        return this.a;
    }

    public Integer d() {
        return this.e;
    }

    public void d(Fragment fragment) {
        C8632dsu.c((Object) fragment, "");
    }

    public View e(View view, LayoutInflater layoutInflater, ViewGroup viewGroup, View view2) {
        C8632dsu.c((Object) layoutInflater, "");
        return view;
    }

    public boolean j() {
        return this.b;
    }

    public e k() {
        return this.i;
    }

    public Tooltip_Location l() {
        return this.h;
    }

    public C1619aI m() {
        return this.f;
    }

    public boolean n() {
        return this.g;
    }

    public drO<dpR> p() {
        return this.k;
    }

    public boolean q() {
        return this.n;
    }

    public ScreenType r() {
        return this.m;
    }

    public int s() {
        return this.f13288o;
    }

    public int t() {
        return this.l;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class ScreenType {
        private static final /* synthetic */ InterfaceC8598drn c;
        private static final /* synthetic */ ScreenType[] d;
        public static final ScreenType b = new ScreenType("TOOLTIP", 0);
        public static final ScreenType a = new ScreenType("CAROUSEL", 1);
        public static final ScreenType e = new ScreenType("TOOLTIP_CENTERED_HORIZONTAL", 2);

        private static final /* synthetic */ ScreenType[] d() {
            return new ScreenType[]{b, a, e};
        }

        public static ScreenType valueOf(String str) {
            return (ScreenType) Enum.valueOf(ScreenType.class, str);
        }

        public static ScreenType[] values() {
            return (ScreenType[]) d.clone();
        }

        private ScreenType(String str, int i) {
        }

        static {
            ScreenType[] d2 = d();
            d = d2;
            c = C8600drp.e(d2);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Tooltip_Location {
        private static final /* synthetic */ Tooltip_Location[] c;
        private static final /* synthetic */ InterfaceC8598drn d;
        public static final Tooltip_Location b = new Tooltip_Location("ABOVE_TARGET", 0);
        public static final Tooltip_Location e = new Tooltip_Location("BELOW_TARGET", 1);
        public static final Tooltip_Location a = new Tooltip_Location("NONE", 2);

        private static final /* synthetic */ Tooltip_Location[] c() {
            return new Tooltip_Location[]{b, e, a};
        }

        public static Tooltip_Location valueOf(String str) {
            return (Tooltip_Location) Enum.valueOf(Tooltip_Location.class, str);
        }

        public static Tooltip_Location[] values() {
            return (Tooltip_Location[]) c.clone();
        }

        private Tooltip_Location(String str, int i) {
        }

        static {
            Tooltip_Location[] c2 = c();
            c = c2;
            d = C8600drp.e(c2);
        }
    }

    /* loaded from: classes4.dex */
    public interface a {
        public static final e b = e.b;

        Drawable a(Drawable drawable, Context context);

        void a(ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3, Map<String, ? extends Object> map, drO<dpR> dro);

        ViewPropertyAnimator d(ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3, Map<String, ? extends Object> map, drO<dpR> dro);

        ViewPropertyAnimator e(ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3, Map<String, ? extends Object> map, drO<dpR> dro);

        /* loaded from: classes4.dex */
        public static final class e {
            static final /* synthetic */ e b = new e();

            private e() {
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface e {

        /* renamed from: com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen$e$e  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0071e implements e {
            public static final C0071e e = new C0071e();

            private C0071e() {
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements e {
            public static final b e = new b();

            private b() {
            }
        }
    }
}
