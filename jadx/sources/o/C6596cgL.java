package o;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballData;
import com.netflix.mediaclient.ui.memberrejoin.impl.MemberRejoinFlagsImpl;
import com.netflix.mediaclient.ui.memberrejoin.impl.MemberRejoinImpl;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.Map;
import o.C6596cgL;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.dpR;

/* renamed from: o.cgL */
/* loaded from: classes4.dex */
public final class C6596cgL extends ViewModel {
    public static final b c = new b(null);
    private final CompositeDisposable d = new CompositeDisposable();

    /* renamed from: o.cgL$b */
    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("MemberRejoinViewModel");
        }
    }

    public static /* synthetic */ void e(C6596cgL c6596cgL, MemberRejoinImpl memberRejoinImpl, String str, String str2, InterfaceC6629cgs interfaceC6629cgs, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            interfaceC6629cgs = null;
        }
        c6596cgL.a(memberRejoinImpl, str, str2, interfaceC6629cgs);
    }

    public final void e(MoneyballData moneyballData, MemberRejoinImpl memberRejoinImpl, InterfaceC6629cgs interfaceC6629cgs) {
        C8632dsu.c((Object) moneyballData, "");
        C8632dsu.c((Object) memberRejoinImpl, "");
        if (!C8632dsu.c((Object) moneyballData.getFlowMode().getMode(), (Object) "planSelectionAndConfirm")) {
            memberRejoinImpl.e();
            if (interfaceC6629cgs != null) {
                interfaceC6629cgs.openTrayOnNextWelcome(true);
                return;
            }
        }
        String mode = moneyballData.getMode();
        C8632dsu.a(mode, "");
        if (e(mode)) {
            b(moneyballData, memberRejoinImpl);
            return;
        }
        String flow = moneyballData.getFlow();
        C8632dsu.a(flow, "");
        if (b(flow)) {
            d(moneyballData, memberRejoinImpl);
            return;
        }
        String flow2 = moneyballData.getFlow();
        C8632dsu.a(flow2, "");
        String mode2 = moneyballData.getMode();
        C8632dsu.a(mode2, "");
        memberRejoinImpl.e(flow2, mode2, MP.c);
    }

    private final boolean b(String str) {
        return C8632dsu.c((Object) str, (Object) SignupConstants.Flow.MOBILE_SIGNUP);
    }

    private final boolean e(String str) {
        return C8632dsu.c((Object) str, (Object) SignupConstants.Mode.SWITCH_FLOW);
    }

    private final void d(MoneyballData moneyballData, MemberRejoinImpl memberRejoinImpl) {
        if (C8632dsu.c((Object) moneyballData.getMode(), (Object) "planSelectionAndConfirm")) {
            memberRejoinImpl.k();
            return;
        }
        String mode = moneyballData.getMode();
        C8632dsu.a(mode, "");
        memberRejoinImpl.e(SignupConstants.Flow.MOBILE_SIGNUP, mode, MP.c);
    }

    public final void b(MoneyballData moneyballData, MemberRejoinImpl memberRejoinImpl) {
        Map d;
        Map k;
        Throwable th;
        Map d2;
        Map k2;
        Throwable th2;
        C8632dsu.c((Object) moneyballData, "");
        C8632dsu.c((Object) memberRejoinImpl, "");
        FlowMode flowMode = moneyballData.getFlowMode();
        C8632dsu.a(flowMode, "");
        Field field = flowMode.getField(SignupConstants.Field.TARGET_FLOW);
        String str = null;
        String value = field != null ? field.getValue() : null;
        if (value == null || !(value instanceof String)) {
            value = null;
        }
        String str2 = value;
        FlowMode flowMode2 = moneyballData.getFlowMode();
        C8632dsu.a(flowMode2, "");
        Field field2 = flowMode2.getField(SignupConstants.Field.TARGET_MODE);
        Object value2 = field2 != null ? field2.getValue() : null;
        if (value2 != null && (value2 instanceof String)) {
            str = value2;
        }
        String str3 = str;
        if (str2 == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k2 = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd("Member Rejoin: Switch flow did not provide a targetFlow", null, null, true, k2, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    c1596aHd.a(errorType.c() + " " + b2);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th2 = new Throwable(c1596aHd.b());
            } else {
                Throwable th3 = c1596aHd.i;
                if (th3 == null) {
                    th2 = new Throwable("Handled exception with no message");
                } else if (th3 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                } else {
                    th2 = th3;
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th2);
            } else {
                dVar.e().b(c1596aHd, th2);
            }
        } else if (str3 == null) {
            InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd2 = new C1596aHd("Member Rejoin: Switch flow did not provide a targetMode", null, null, true, k, false, false, 96, null);
            ErrorType errorType2 = c1596aHd2.a;
            if (errorType2 != null) {
                c1596aHd2.e.put("errorType", errorType2.c());
                String b3 = c1596aHd2.b();
                if (b3 != null) {
                    c1596aHd2.a(errorType2.c() + " " + b3);
                }
            }
            if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                th = new Throwable(c1596aHd2.b(), c1596aHd2.i);
            } else if (c1596aHd2.b() != null) {
                th = new Throwable(c1596aHd2.b());
            } else {
                Throwable th4 = c1596aHd2.i;
                if (th4 == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th4 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                } else {
                    th = th4;
                }
            }
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar2.a();
            if (a2 != null) {
                a2.e(c1596aHd2, th);
            } else {
                dVar2.e().b(c1596aHd2, th);
            }
        } else {
            memberRejoinImpl.e(str2, str3, MP.c);
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.d.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(C6596cgL c6596cgL, Context context, boolean z, drM drm, drM drm2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            drm = new drM<MoneyballData, dpR>() { // from class: com.netflix.mediaclient.ui.memberrejoin.impl.MemberRejoinViewModel$loadMoneyballData$1
                public final void a(MoneyballData moneyballData) {
                    C8632dsu.c((Object) moneyballData, "");
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(MoneyballData moneyballData) {
                    a(moneyballData);
                    return dpR.c;
                }
            };
        }
        if ((i & 8) != 0) {
            drm2 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.memberrejoin.impl.MemberRejoinViewModel$loadMoneyballData$2
                public final void c(Throwable th) {
                    C8632dsu.c((Object) th, "");
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    c(th);
                    return dpR.c;
                }
            };
        }
        c6596cgL.e(context, z, drm, drm2);
    }

    public final void e(Context context, boolean z, drM<? super MoneyballData, dpR> drm, drM<? super Throwable, dpR> drm2) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) drm2, "");
        DisposableKt.plusAssign(this.d, c(context).b(z, drm, drm2));
    }

    public final boolean b(Context context) {
        C8632dsu.c((Object) context, "");
        return c(context).a();
    }

    public final C6635cgy c(Context context) {
        C8632dsu.c((Object) context, "");
        InterfaceC6636cgz a = InterfaceC6636cgz.b.a(context);
        C8632dsu.d(a);
        return ((MemberRejoinFlagsImpl) a).a();
    }

    public final void a(final MemberRejoinImpl memberRejoinImpl, String str, String str2, final InterfaceC6629cgs interfaceC6629cgs) {
        C8632dsu.c((Object) memberRejoinImpl, "");
        c.getLogTag();
        if (str != null && str2 != null) {
            memberRejoinImpl.d().e(str, str2);
        }
        CompositeDisposable compositeDisposable = this.d;
        InterfaceC6636cgz d = memberRejoinImpl.d();
        C8632dsu.d(d);
        DisposableKt.plusAssign(compositeDisposable, C6635cgy.d(((MemberRejoinFlagsImpl) d).a(), false, new drM<MoneyballData, dpR>() { // from class: com.netflix.mediaclient.ui.memberrejoin.impl.MemberRejoinViewModel$show$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(MoneyballData moneyballData) {
                e(moneyballData);
                return dpR.c;
            }

            public final void e(MoneyballData moneyballData) {
                C8632dsu.c((Object) moneyballData, "");
                C6596cgL.this.e(moneyballData, memberRejoinImpl, interfaceC6629cgs);
            }
        }, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.memberrejoin.impl.MemberRejoinViewModel$show$3
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                d(th);
                return dpR.c;
            }

            public final void d(Throwable th) {
                C8632dsu.c((Object) th, "");
                MemberRejoinImpl.this.l();
            }
        }, 1, null));
    }
}
