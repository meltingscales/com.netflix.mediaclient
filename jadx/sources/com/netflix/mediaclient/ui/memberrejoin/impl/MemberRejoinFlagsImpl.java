package com.netflix.mediaclient.ui.memberrejoin.impl;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.startup.ApplicationStartupListener;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.IntoSet;
import io.reactivex.Observable;
import io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.subjects.PublishSubject;
import java.util.Map;
import javax.inject.Inject;
import kotlin.jvm.internal.Ref;
import o.AbstractC6677chn;
import o.C1045Mp;
import o.C1332Xp;
import o.C1596aHd;
import o.C6635cgy;
import o.C8157dfA;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC6634cgx;
import o.InterfaceC6636cgz;
import o.XH;
import o.cQQ;
import o.dpR;
import o.dqE;
import o.drM;
import o.drO;

/* loaded from: classes4.dex */
public final class MemberRejoinFlagsImpl implements InterfaceC6636cgz, ApplicationStartupListener {
    public static final a c = new a(null);
    private final PublishSubject<dpR> a;
    private final C6635cgy d;
    private final Observable<dpR> e;
    private final cQQ f;
    private boolean h;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface ApplicationStartupModule {
        @Binds
        @IntoSet
        ApplicationStartupListener a(MemberRejoinFlagsImpl memberRejoinFlagsImpl);
    }

    public final C6635cgy a() {
        return this.d;
    }

    public void a(boolean z) {
        this.h = z;
    }

    @Override // o.InterfaceC6636cgz
    public boolean e() {
        return this.h;
    }

    @Inject
    public MemberRejoinFlagsImpl() {
        PublishSubject<dpR> create = PublishSubject.create();
        C8632dsu.a(create, "");
        this.a = create;
        this.e = create;
        this.d = new C6635cgy();
        this.f = new cQQ();
        C1332Xp c1332Xp = C1332Xp.b;
        a(C8157dfA.b((Context) C1332Xp.b(Context.class), "wwoab_not_active_onhold", false));
    }

    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("MemberRejoinFlagsImpl");
        }
    }

    @Override // o.InterfaceC6636cgz
    public boolean d() {
        c();
        return e();
    }

    @SuppressLint({"CheckResult"})
    private final void c() {
        Map d2;
        Map k;
        Throwable th;
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Observable<Boolean> take = this.f.g().take(1L);
        C8632dsu.a(take, "");
        SubscribersKt.subscribeBy$default(take, (drM) null, (drO) null, new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.memberrejoin.impl.MemberRejoinFlagsImpl$updateIsNotActiveOrOnHold$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Boolean bool) {
                a(bool);
                return dpR.c;
            }

            public final void a(Boolean bool) {
                Ref.BooleanRef.this.a = true;
                if (C8632dsu.c(bool, Boolean.valueOf(this.e()))) {
                    return;
                }
                MemberRejoinFlagsImpl memberRejoinFlagsImpl = this;
                C8632dsu.d(bool);
                memberRejoinFlagsImpl.a(bool.booleanValue());
                C1332Xp c1332Xp = C1332Xp.b;
                C8157dfA.d((Context) C1332Xp.b(Context.class), "wwoab_not_active_onhold", bool.booleanValue());
            }
        }, 3, (Object) null);
        if (booleanRef.a) {
            return;
        }
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        d2 = dqE.d();
        k = dqE.k(d2);
        C1596aHd c1596aHd = new C1596aHd("Call to `userAgentRepository` to read status was async", null, null, false, k, false, false, 96, null);
        ErrorType errorType = c1596aHd.a;
        if (errorType != null) {
            c1596aHd.e.put("errorType", errorType.c());
            String b2 = c1596aHd.b();
            if (b2 != null) {
                String c2 = errorType.c();
                c1596aHd.a(c2 + " " + b2);
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
    }

    @Override // o.InterfaceC6636cgz
    public boolean e(Context context) {
        C8632dsu.c((Object) context, "");
        return XH.c.d(context).d().a();
    }

    @Override // o.InterfaceC6636cgz
    public void b() {
        this.a.onNext(dpR.c);
    }

    @Override // o.InterfaceC6636cgz
    public void e(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.d.c(str, str2);
    }

    @Override // com.netflix.mediaclient.startup.ApplicationStartupListener
    public void onApplicationCreated(Application application) {
        C8632dsu.c((Object) application, "");
        AbstractC6677chn.d dVar = AbstractC6677chn.j;
        dVar.d("UpSellTrayLoading", new b());
        dVar.d("UpSellTrayPage1", new d());
        dVar.d("UpSellTrayPage2", new c());
    }

    /* loaded from: classes4.dex */
    public static final class b implements AbstractC6677chn.a {
        b() {
        }

        @Override // o.AbstractC6677chn.a
        public AbstractC6677chn d(Fragment fragment) {
            C8632dsu.c((Object) fragment, "");
            InterfaceC6634cgx.a aVar = InterfaceC6634cgx.a;
            FragmentActivity requireActivity = fragment.requireActivity();
            C8632dsu.a(requireActivity, "");
            InterfaceC6634cgx c = aVar.c(requireActivity);
            C8632dsu.d(c);
            return ((MemberRejoinImpl) c).c();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements AbstractC6677chn.a {
        d() {
        }

        @Override // o.AbstractC6677chn.a
        public AbstractC6677chn d(Fragment fragment) {
            C8632dsu.c((Object) fragment, "");
            InterfaceC6634cgx.a aVar = InterfaceC6634cgx.a;
            FragmentActivity requireActivity = fragment.requireActivity();
            C8632dsu.a(requireActivity, "");
            InterfaceC6634cgx c = aVar.c(requireActivity);
            C8632dsu.d(c);
            return ((MemberRejoinImpl) c).b();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements AbstractC6677chn.a {
        c() {
        }

        @Override // o.AbstractC6677chn.a
        public AbstractC6677chn d(Fragment fragment) {
            C8632dsu.c((Object) fragment, "");
            InterfaceC6634cgx.a aVar = InterfaceC6634cgx.a;
            FragmentActivity requireActivity = fragment.requireActivity();
            C8632dsu.a(requireActivity, "");
            InterfaceC6634cgx c = aVar.c(requireActivity);
            C8632dsu.d(c);
            return ((MemberRejoinImpl) c).a();
        }
    }
}
