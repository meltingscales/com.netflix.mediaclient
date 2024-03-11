package com.netflix.mediaclient.ui.offline;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.res.ResourcesCompat;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import com.netflix.mediaclient.ui.R;
import dagger.Binds;
import dagger.Lazy;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.C7341cuQ;
import o.C7342cuR;
import o.C7344cuT;
import o.C8126deW;
import o.C8153dex;
import o.C8627dsp;
import o.C8632dsu;
import o.C9760wV;
import o.C9764wZ;
import o.C9834xU;
import o.C9843xd;
import o.C9851xl;
import o.InterfaceC5283bvo;
import o.InterfaceC7303ctf;
import o.InterfaceC7343cuS;
import o.InterfaceC7345cuU;

@Singleton
/* loaded from: classes4.dex */
public final class TutorialHelperFactoryImpl implements InterfaceC7345cuU {
    public static final e b = new e(null);
    public static final int d = 8;
    private boolean a;
    private final Lazy<InterfaceC7303ctf> c;
    private final Context e;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface TutorialHelperFactoryModule {
        @Binds
        InterfaceC7345cuU d(TutorialHelperFactoryImpl tutorialHelperFactoryImpl);
    }

    @Inject
    public TutorialHelperFactoryImpl(@ApplicationContext Context context, Lazy<InterfaceC7303ctf> lazy) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) lazy, "");
        this.e = context;
        this.c = lazy;
    }

    /* loaded from: classes4.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }

    @Override // o.InterfaceC7345cuU
    public InterfaceC7343cuS e() {
        return new C7342cuR();
    }

    @Override // o.InterfaceC7345cuU
    public InterfaceC7343cuS d(Context context, InterfaceC5283bvo interfaceC5283bvo) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) interfaceC5283bvo, "");
        return new C7341cuQ(context, interfaceC5283bvo, new C7344cuT(context, interfaceC5283bvo));
    }

    @Override // o.InterfaceC7345cuU
    public C9843xd d(View view, Activity activity, InterfaceC5283bvo interfaceC5283bvo) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) interfaceC5283bvo, "");
        if (view == null) {
            return null;
        }
        C7344cuT.b bVar = C7344cuT.c;
        String profileGuid = interfaceC5283bvo.getProfileGuid();
        C8632dsu.a(profileGuid, "");
        String a = bVar.a("USER_TUTORIAL_MY_PROFILE_DOWNLOADS_BUTTON", profileGuid);
        if (C8153dex.B()) {
            C9851xl h = new C9851xl(activity, view).h(true);
            Drawable drawable = ResourcesCompat.getDrawable(this.e.getResources(), HawkinsIcon.cQ.e.e(), this.e.getTheme());
            C8632dsu.d(drawable);
            C9851xl b2 = C9851xl.d(h.d(drawable).c(R.o.jn).e(false).d(false).e(C9834xU.c.b).c(C9834xU.a.m, C9834xU.a.v, C9834xU.a.ae, C9834xU.a.am), R.o.jk, null, null, 6, null).b(false);
            int i = C9834xU.a.m;
            int i2 = C9834xU.a.am;
            int i3 = C9834xU.a.ae;
            C9851xl b3 = b2.b(i, i2, i3, i3);
            int i4 = C9834xU.c.y;
            return b3.a(i4, Integer.valueOf(i4), false).d(C9834xU.c.z).d(new C9764wZ(activity, a, false, 4, null)).a();
        } else if (this.c.get().a().d(C8126deW.b()) > 0) {
            C9851xl d2 = C9851xl.d(new C9851xl(activity, view), R.o.jk, null, null, 6, null);
            String profileGuid2 = interfaceC5283bvo.getProfileGuid();
            C8632dsu.a(profileGuid2, "");
            return d2.d(new C9764wZ(activity, bVar.a("USER_TUTORIAL_MY_DOWNLOADS_BUTTON", profileGuid2), false, 4, null)).a();
        } else {
            return null;
        }
    }

    @Override // o.InterfaceC7345cuU
    public C9843xd c(View view, Activity activity) {
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) activity, "");
        if (this.a) {
            return null;
        }
        this.a = true;
        C9851xl c = new C9851xl(activity, view).e((Drawable) null).c(R.o.fu);
        int i = C9834xU.a.f13911o;
        C9851xl b2 = c.b(i, C9834xU.a.am, i, i);
        int i2 = C9834xU.a.f13911o;
        C9851xl a = b2.c(i2, i2, i2, C9834xU.a.am).d(R.o.fv, Integer.valueOf(C9834xU.c.b), Integer.valueOf(R.b.U)).a(Integer.valueOf(C9834xU.a.V)).d(false).e(false).c(true).e(C9834xU.c.b).a(true);
        int i3 = C9834xU.c.y;
        return a.a(i3, Integer.valueOf(i3), false).d(new C9760wV(activity, "USER_TUTORIAL_PARTIAL_DOWNLOADS", 2, true)).a();
    }
}
