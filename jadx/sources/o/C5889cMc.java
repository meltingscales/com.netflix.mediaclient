package o;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.ui.home.HomeActivity;
import dagger.Lazy;
import java.util.Map;
import javax.inject.Inject;
import o.AbstractC3073as;
import o.C5855cKw;
import o.C5889cMc;
import o.C5893cMg;
import o.InterfaceC6235cYw;
import o.cLP;
import o.dpR;
import o.drO;

/* renamed from: o.cMc  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5889cMc {
    private final Activity a;
    private final Lazy<InterfaceC6235cYw> b;
    private final Map<LoMoType, d> d;

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(int i, int i2, int i3) {
        return i;
    }

    @Inject
    public C5889cMc(Activity activity, Lazy<InterfaceC6235cYw> lazy) {
        Map<LoMoType, d> c;
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) lazy, "");
        this.a = activity;
        this.b = lazy;
        c = dqE.c(dpD.a(LoMoType.INSTANT_QUEUE, new d("empty-state-my-list", C5855cKw.e.h, C5855cKw.i.i, C5855cKw.i.j, C5855cKw.i.e, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixEmptyStateManager$emptyStateContainers$1
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                b();
                return dpR.c;
            }

            public final void b() {
                Activity activity2;
                Activity activity3;
                activity2 = C5889cMc.this.a;
                activity3 = C5889cMc.this.a;
                activity2.startActivity(HomeActivity.d((Context) activity3, AppView.accountMenu, false));
            }
        })), dpD.a(LoMoType.TRAILERS, new d("empty-state-trailers", C5855cKw.e.a, C5855cKw.i.f13679o, C5855cKw.i.m, C5855cKw.i.f, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixEmptyStateManager$emptyStateContainers$2
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                b();
                return dpR.c;
            }

            public final void b() {
                Activity activity2;
                Lazy lazy2;
                activity2 = C5889cMc.this.a;
                lazy2 = C5889cMc.this.b;
                activity2.startActivity(((InterfaceC6235cYw) lazy2.get()).c());
            }
        })));
        this.d = c;
    }

    public final void d(InterfaceC2023aX interfaceC2023aX, LoMoType loMoType) {
        Object e;
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) loMoType, "");
        if (this.d.containsKey(loMoType)) {
            e = dqE.e(this.d, loMoType);
            d(interfaceC2023aX, (d) e);
        } else if (loMoType == LoMoType.RECENTLY_WATCHED) {
            a(interfaceC2023aX);
        }
    }

    private final void a(InterfaceC2023aX interfaceC2023aX) {
        C2322ae c = C2437ag.c("empty-state-my-profile", new Object[0], ComposableLambdaKt.composableLambdaInstance(-1652193214, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixEmptyStateManager$addEmptyProfileState$1
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return dpR.c;
            }

            public final void a(Composer composer, int i) {
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1652193214, i, -1, "com.netflix.mediaclient.ui.profiles.MyNetflixEmptyStateManager.addEmptyProfileState.<anonymous> (MyNetflixEmptyStateManager.kt:84)");
                    }
                    final C5889cMc c5889cMc = C5889cMc.this;
                    cLP.d(new drO<dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixEmptyStateManager$addEmptyProfileState$1.1
                        {
                            super(0);
                        }

                        @Override // o.drO
                        public /* synthetic */ dpR invoke() {
                            e();
                            return dpR.c;
                        }

                        public final void e() {
                            Activity activity;
                            Lazy lazy;
                            activity = C5889cMc.this.a;
                            lazy = C5889cMc.this.b;
                            activity.startActivity(((InterfaceC6235cYw) lazy.get()).a());
                        }
                    }, composer, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }));
        c.a((CharSequence) "empty-state-my-profile");
        AbstractC3073as<?> a = c.a(new AbstractC3073as.b() { // from class: o.cMh
            @Override // o.AbstractC3073as.b
            public final int b(int i, int i2, int i3) {
                int a2;
                a2 = C5889cMc.a(i, i2, i3);
                return a2;
            }
        });
        C8632dsu.a(a, "");
        interfaceC2023aX.add(a);
    }

    private final void d(InterfaceC2023aX interfaceC2023aX, final d dVar) {
        String g = dVar.g();
        C2322ae c = C2437ag.c(g, new Object[]{dVar.g()}, ComposableLambdaKt.composableLambdaInstance(-441632870, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixEmptyStateManager$addEmptyStateUi$1
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer, Integer num) {
                e(composer, num.intValue());
                return dpR.c;
            }

            public final void e(Composer composer, int i) {
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-441632870, i, -1, "com.netflix.mediaclient.ui.profiles.MyNetflixEmptyStateManager.addEmptyStateUi.<anonymous> (MyNetflixEmptyStateManager.kt:106)");
                }
                C5893cMg.e(C5889cMc.d.this, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        c.a((CharSequence) g);
        AbstractC3073as<?> a = c.a(new AbstractC3073as.b() { // from class: o.cMj
            @Override // o.AbstractC3073as.b
            public final int b(int i, int i2, int i3) {
                int c2;
                c2 = C5889cMc.c(i, i2, i3);
                return c2;
            }
        });
        C8632dsu.a(a, "");
        interfaceC2023aX.add(a);
    }

    /* renamed from: o.cMc$d */
    /* loaded from: classes4.dex */
    public static final class d {
        private final drO<dpR> a;
        private final int b;
        private final int c;
        private final int d;
        private final int e;
        private final String f;

        public final drO<dpR> a() {
            return this.a;
        }

        public final int b() {
            return this.d;
        }

        public final int c() {
            return this.b;
        }

        public final int d() {
            return this.e;
        }

        public final int e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.f, (Object) dVar.f) && this.e == dVar.e && this.d == dVar.d && this.c == dVar.c && this.b == dVar.b && C8632dsu.c(this.a, dVar.a);
            }
            return false;
        }

        public final String g() {
            return this.f;
        }

        public int hashCode() {
            return (((((((((this.f.hashCode() * 31) + Integer.hashCode(this.e)) * 31) + Integer.hashCode(this.d)) * 31) + Integer.hashCode(this.c)) * 31) + Integer.hashCode(this.b)) * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.f;
            int i = this.e;
            int i2 = this.d;
            int i3 = this.c;
            int i4 = this.b;
            drO<dpR> dro = this.a;
            return "EmptyContainerState(uniqueName=" + str + ", icon=" + i + ", titleText=" + i2 + ", subTitleText=" + i3 + ", buttonText=" + i4 + ", onClick=" + dro + ")";
        }

        public d(String str, int i, int i2, int i3, int i4, drO<dpR> dro) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) dro, "");
            this.f = str;
            this.e = i;
            this.d = i2;
            this.c = i3;
            this.b = i4;
            this.a = dro;
        }
    }
}
