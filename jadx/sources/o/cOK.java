package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.profiles.languages.api.LanguageSelectorType;
import com.netflix.mediaclient.ui.profiles.languages.impl.LanguagesState;
import com.netflix.mediaclient.ui.profiles.languages.impl.LanguagesViewModel$fetchContentLanguages$2;
import com.netflix.mediaclient.ui.profiles.languages.impl.LanguagesViewModel$fetchDisplayLanguages$2;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.AbstractApplicationC1040Mh;
import o.C1332Xp;
import o.C8632dsu;
import o.C8927fu;
import o.C8932fz;
import o.InterfaceC5283bvo;
import o.InterfaceC8906fZ;
import o.aCG;

/* loaded from: classes4.dex */
public final class cOK extends C9943zX<LanguagesState> {
    public static final e d = new e(null);
    private final InterfaceC8554dpx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cOK(LanguagesState languagesState) {
        super(languagesState);
        InterfaceC8554dpx b;
        C8632dsu.c((Object) languagesState, "");
        b = dpB.b(new drO<aCG>() { // from class: com.netflix.mediaclient.ui.profiles.languages.impl.LanguagesViewModel$graphqlRepository$2
            @Override // o.drO
            /* renamed from: a */
            public final aCG invoke() {
                C1332Xp c1332Xp = C1332Xp.b;
                Context context = (Context) C1332Xp.b(Context.class);
                UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
                InterfaceC5283bvo m = k != null ? k.m() : null;
                if (m == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                C8632dsu.a(m, "");
                return aCG.b.e(context, m);
            }
        });
        this.b = b;
    }

    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC8906fZ<cOK, LanguagesState> {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public cOK create(AbstractC8979gt abstractC8979gt, LanguagesState languagesState) {
            return (cOK) InterfaceC8906fZ.b.d(this, abstractC8979gt, languagesState);
        }

        /* renamed from: initialState */
        public LanguagesState m3172initialState(AbstractC8979gt abstractC8979gt) {
            C8632dsu.c((Object) abstractC8979gt, "");
            Object b = abstractC8979gt.b();
            C8632dsu.d(b);
            Bundle bundle = (Bundle) b;
            String string = bundle.getString("extra_selector_type");
            if (string == null) {
                throw new IllegalArgumentException("EXTRA_SELECTOR_TYPE must be specified".toString());
            }
            C8632dsu.a(string, "");
            String string2 = bundle.getString("extra_profile_locale");
            if (string2 == null) {
                throw new IllegalArgumentException("EXTRA_PROFILE_LANGUAGE must be specified".toString());
            }
            C8632dsu.a(string2, "");
            String string3 = bundle.getString("extra_initial_locales");
            if (string3 == null) {
                throw new IllegalArgumentException("EXTRA_INITIAL_LANGUAGES must be specified".toString());
            }
            C8632dsu.a(string3, "");
            return new LanguagesState(LanguageSelectorType.valueOf(string), string2, string3, null, null, 24, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class a extends dqT implements CoroutineExceptionHandler {
        final /* synthetic */ cOK a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineExceptionHandler.c cVar, cOK cok) {
            super(cVar);
            this.a = cok;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(dqZ dqz, final Throwable th) {
            this.a.b(new drM<LanguagesState, LanguagesState>() { // from class: com.netflix.mediaclient.ui.profiles.languages.impl.LanguagesViewModel$fetchContentLanguages$handler$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: a */
                public final LanguagesState invoke(LanguagesState languagesState) {
                    C8632dsu.c((Object) languagesState, "");
                    return LanguagesState.copy$default(languagesState, null, null, null, null, new C8927fu(th, null, 2, null), 15, null);
                }
            });
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends dqT implements CoroutineExceptionHandler {
        final /* synthetic */ cOK e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(CoroutineExceptionHandler.c cVar, cOK cok) {
            super(cVar);
            this.e = cok;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(dqZ dqz, final Throwable th) {
            this.e.b(new drM<LanguagesState, LanguagesState>() { // from class: com.netflix.mediaclient.ui.profiles.languages.impl.LanguagesViewModel$fetchDisplayLanguages$handler$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: d */
                public final LanguagesState invoke(LanguagesState languagesState) {
                    C8632dsu.c((Object) languagesState, "");
                    return LanguagesState.copy$default(languagesState, null, null, null, null, new C8927fu(th, null, 2, null), 15, null);
                }
            });
        }
    }

    public final aCG i() {
        return (aCG) this.b.getValue();
    }

    public final void e(final List<C8313dhy> list) {
        C8632dsu.c((Object) list, "");
        b(new drM<LanguagesState, LanguagesState>() { // from class: com.netflix.mediaclient.ui.profiles.languages.impl.LanguagesViewModel$updateUserSelection$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final LanguagesState invoke(LanguagesState languagesState) {
                C8632dsu.c((Object) languagesState, "");
                return LanguagesState.copy$default(languagesState, null, null, null, list, null, 23, null);
            }
        });
    }

    @SuppressLint({"CheckResult"})
    public final void c(boolean z) {
        if (z) {
            b(new drM<LanguagesState, LanguagesState>() { // from class: com.netflix.mediaclient.ui.profiles.languages.impl.LanguagesViewModel$fetchDisplayLanguages$1
                @Override // o.drM
                /* renamed from: b */
                public final LanguagesState invoke(LanguagesState languagesState) {
                    C8632dsu.c((Object) languagesState, "");
                    return LanguagesState.copy$default(languagesState, null, null, null, null, new C8932fz(null), 15, null);
                }
            });
        }
        C8737dwr.c(e(), new d(CoroutineExceptionHandler.Key, this), null, new LanguagesViewModel$fetchDisplayLanguages$2(this, z, null), 2, null);
    }

    @SuppressLint({"CheckResult"})
    public final void b(boolean z) {
        if (z) {
            b(new drM<LanguagesState, LanguagesState>() { // from class: com.netflix.mediaclient.ui.profiles.languages.impl.LanguagesViewModel$fetchContentLanguages$1
                @Override // o.drM
                /* renamed from: e */
                public final LanguagesState invoke(LanguagesState languagesState) {
                    C8632dsu.c((Object) languagesState, "");
                    return LanguagesState.copy$default(languagesState, null, null, null, null, new C8932fz(null), 15, null);
                }
            });
        }
        C8737dwr.c(e(), new a(CoroutineExceptionHandler.Key, this), null, new LanguagesViewModel$fetchContentLanguages$2(this, z, null), 2, null);
    }

    public final void e(ServiceManager serviceManager, InterfaceC5283bvo interfaceC5283bvo, String str, InterfaceC5094bsK interfaceC5094bsK) {
        C8632dsu.c((Object) serviceManager, "");
        C8632dsu.c((Object) interfaceC5283bvo, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) interfaceC5094bsK, "");
        b(new drM<LanguagesState, LanguagesState>() { // from class: com.netflix.mediaclient.ui.profiles.languages.impl.LanguagesViewModel$saveDisplayLanguage$1
            @Override // o.drM
            /* renamed from: b */
            public final LanguagesState invoke(LanguagesState languagesState) {
                C8632dsu.c((Object) languagesState, "");
                return LanguagesState.copy$default(languagesState, null, null, null, null, new C8932fz(null), 15, null);
            }
        });
        serviceManager.a(interfaceC5283bvo.getProfileGuid(), interfaceC5283bvo.getProfileName(), null, null, null, str, null, null, null, interfaceC5094bsK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b(C2545aiB c2545aiB) {
        return ((c2545aiB != null ? c2545aiB.c() : null) == null || c2545aiB.a() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0022, code lost:
        r12 = o.duD.d((java.lang.CharSequence) r4, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.C8313dhy d(o.C2545aiB r12) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cOK.d(o.aiB):o.dhy");
    }
}
