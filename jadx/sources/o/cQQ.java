package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.service.webclient.model.leafs.AccountData;
import com.netflix.mediaclient.ui.repository.UserAgentRepository$createAutoLoginToken$1;
import com.netflix.mediaclient.ui.repository.UserAgentRepository$createScopedAutoLoginToken$1;
import com.netflix.mediaclient.ui.repository.UserAgentRepository$getCurrentProfile$1;
import com.netflix.mediaclient.ui.repository.UserAgentRepository$getCurrentUserAccount$1;
import com.netflix.mediaclient.ui.repository.UserAgentRepository$getMslUserCredentialRegistry$1;
import com.netflix.mediaclient.ui.repository.UserAgentRepository$isNotActiveOrOnHold$1;
import com.netflix.mediaclient.ui.repository.UserAgentRepository$isUserLoggedIn$1;
import com.netflix.mediaclient.ui.repository.UserAgentRepository$sendAgeVerifyRequest$1;
import com.netflix.mediaclient.ui.repository.UserAgentRepository$sendFetchAccountDataRequest$1;
import com.netflix.mediaclient.ui.repository.UserAgentRepository$sendLoginRequest$1;
import com.netflix.mediaclient.ui.repository.UserAgentRepository$sendLoginUserByTokens$1;
import com.netflix.mediaclient.ui.repository.UserAgentRepository$sendLoginUsingAutoLoginTokens$1;
import com.netflix.mediaclient.ui.repository.UserAgentRepository$sendLoginUsingExistingTokens$1;
import com.netflix.mediaclient.ui.repository.UserAgentRepository$sendLogoutRequest$1;
import com.netflix.mediaclient.ui.repository.UserAgentRepository$sendPinVerifyRequest$1;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.List;
import o.C8632dsu;
import o.InterfaceC5093bsJ;
import o.InterfaceC5282bvn;
import o.InterfaceC5283bvo;

/* loaded from: classes.dex */
public final class cQQ extends AbstractC5999cQf<UserAgent> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC5999cQf
    /* renamed from: j */
    public UserAgent a() {
        UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
        if (k != null) {
            return k;
        }
        throw new IllegalStateException("userAgent is null");
    }

    /* loaded from: classes4.dex */
    public static final class e {
        private final Status c;
        private AccountData d;

        public final AccountData c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c(this.d, eVar.d) && C8632dsu.c(this.c, eVar.c);
            }
            return false;
        }

        public int hashCode() {
            AccountData accountData = this.d;
            return ((accountData == null ? 0 : accountData.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            AccountData accountData = this.d;
            Status status = this.c;
            return "UserAccountData(accountData=" + accountData + ", status=" + status + ")";
        }

        public e(AccountData accountData, Status status) {
            C8632dsu.c((Object) status, "");
            this.d = accountData;
            this.c = status;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private final boolean a;
        private final Status b;

        public final Status b() {
            return this.b;
        }

        public final boolean c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.a == bVar.a && C8632dsu.c(this.b, bVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.a) * 31) + this.b.hashCode();
        }

        public String toString() {
            boolean z = this.a;
            Status status = this.b;
            return "PinOrAgeVerifyResponse(isVerified=" + z + ", status=" + status + ")";
        }

        public b(boolean z, Status status) {
            C8632dsu.c((Object) status, "");
            this.a = z;
            this.b = status;
        }
    }

    /* loaded from: classes4.dex */
    public static final class d {
        private String b;
        private final Status e;

        public final String b() {
            return this.b;
        }

        public final Status e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.b, (Object) dVar.b) && C8632dsu.c(this.e, dVar.e);
            }
            return false;
        }

        public int hashCode() {
            String str = this.b;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.b;
            Status status = this.e;
            return "AutoLoginTokenResponse(token=" + str + ", status=" + status + ")";
        }

        public d(String str, Status status) {
            C8632dsu.c((Object) status, "");
            this.b = str;
            this.e = status;
        }
    }

    public final Single<Status> e(C5007bqd c5007bqd) {
        C8632dsu.c((Object) c5007bqd, "");
        Single<UserAgent> h = h();
        final UserAgentRepository$sendLoginRequest$1 userAgentRepository$sendLoginRequest$1 = new UserAgentRepository$sendLoginRequest$1(c5007bqd);
        Single flatMap = h.flatMap(new Function() { // from class: o.cQS
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource x;
                x = cQQ.x(drM.this, obj);
                return x;
            }
        });
        C8632dsu.a(flatMap, "");
        return flatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource x(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    public final Observable<Status> k() {
        Single<UserAgent> h = h();
        final UserAgentRepository$sendLogoutRequest$1 userAgentRepository$sendLogoutRequest$1 = UserAgentRepository$sendLogoutRequest$1.e;
        Observable<Status> observable = h.flatMap(new Function() { // from class: o.cQY
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource B;
                B = cQQ.B(drM.this, obj);
                return B;
            }
        }).toObservable();
        C8632dsu.a(observable, "");
        return observable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource B(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    public final Observable<e> o() {
        Single<UserAgent> h = h();
        final UserAgentRepository$sendFetchAccountDataRequest$1 userAgentRepository$sendFetchAccountDataRequest$1 = UserAgentRepository$sendFetchAccountDataRequest$1.e;
        Observable<e> observable = h.flatMap(new Function() { // from class: o.cQT
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource y;
                y = cQQ.y(drM.this, obj);
                return y;
            }
        }).toObservable();
        C8632dsu.a(observable, "");
        return observable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource y(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    public final Single<InterfaceC5093bsJ> c() {
        Single<UserAgent> h = h();
        final UserAgentRepository$getMslUserCredentialRegistry$1 userAgentRepository$getMslUserCredentialRegistry$1 = new drM<UserAgent, InterfaceC5093bsJ>() { // from class: com.netflix.mediaclient.ui.repository.UserAgentRepository$getMslUserCredentialRegistry$1
            @Override // o.drM
            /* renamed from: c */
            public final InterfaceC5093bsJ invoke(UserAgent userAgent) {
                C8632dsu.c((Object) userAgent, "");
                return userAgent.f();
            }
        };
        Single map = h.map(new Function() { // from class: o.cQZ
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                InterfaceC5093bsJ t;
                t = cQQ.t(drM.this, obj);
                return t;
            }
        });
        C8632dsu.a(map, "");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC5093bsJ t(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (InterfaceC5093bsJ) drm.invoke(obj);
    }

    public final Observable<Status> b(C1569aGd c1569aGd) {
        C8632dsu.c((Object) c1569aGd, "");
        Single<UserAgent> h = h();
        final UserAgentRepository$sendLoginUserByTokens$1 userAgentRepository$sendLoginUserByTokens$1 = new UserAgentRepository$sendLoginUserByTokens$1(c1569aGd);
        Observable<Status> observable = h.flatMap(new Function() { // from class: o.cRh
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource D;
                D = cQQ.D(drM.this, obj);
                return D;
            }
        }).toObservable();
        C8632dsu.a(observable, "");
        return observable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource D(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    public final Observable<Status> l() {
        Single<UserAgent> h = h();
        final UserAgentRepository$sendLoginUsingExistingTokens$1 userAgentRepository$sendLoginUsingExistingTokens$1 = UserAgentRepository$sendLoginUsingExistingTokens$1.d;
        Observable<Status> observable = h.flatMap(new Function() { // from class: o.cRa
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource z;
                z = cQQ.z(drM.this, obj);
                return z;
            }
        }).toObservable();
        C8632dsu.a(observable, "");
        return observable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource z(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    public final Observable<Status> e(String str) {
        C8632dsu.c((Object) str, "");
        Single<UserAgent> h = h();
        final UserAgentRepository$sendLoginUsingAutoLoginTokens$1 userAgentRepository$sendLoginUsingAutoLoginTokens$1 = new UserAgentRepository$sendLoginUsingAutoLoginTokens$1(str);
        Observable<Status> observable = h.flatMap(new Function() { // from class: o.cQX
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource C;
                C = cQQ.C(drM.this, obj);
                return C;
            }
        }).toObservable();
        C8632dsu.a(observable, "");
        return observable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource C(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    public final Observable<d> c(long j) {
        Single<UserAgent> h = h();
        final UserAgentRepository$createAutoLoginToken$1 userAgentRepository$createAutoLoginToken$1 = new UserAgentRepository$createAutoLoginToken$1(j);
        Observable<d> observable = h.flatMap(new Function() { // from class: o.cRg
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource s;
                s = cQQ.s(drM.this, obj);
                return s;
            }
        }).toObservable();
        C8632dsu.a(observable, "");
        return observable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource s(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    public final Observable<b> b(String str, UserAgent.PinType pinType, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) pinType, "");
        Single<UserAgent> h = h();
        final UserAgentRepository$sendPinVerifyRequest$1 userAgentRepository$sendPinVerifyRequest$1 = new UserAgentRepository$sendPinVerifyRequest$1(str, pinType, str2);
        Observable<b> observable = h.flatMap(new Function() { // from class: o.cRc
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource A;
                A = cQQ.A(drM.this, obj);
                return A;
            }
        }).toObservable();
        C8632dsu.a(observable, "");
        return observable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource A(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    public final Observable<b> m() {
        Single<UserAgent> h = h();
        final UserAgentRepository$sendAgeVerifyRequest$1 userAgentRepository$sendAgeVerifyRequest$1 = UserAgentRepository$sendAgeVerifyRequest$1.a;
        Observable<b> observable = h.flatMap(new Function() { // from class: o.cRb
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource v;
                v = cQQ.v(drM.this, obj);
                return v;
            }
        }).toObservable();
        C8632dsu.a(observable, "");
        return observable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource v(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    public final Observable<Boolean> i() {
        Single<UserAgent> h = h();
        final UserAgentRepository$isUserLoggedIn$1 userAgentRepository$isUserLoggedIn$1 = new drM<UserAgent, ObservableSource<? extends Boolean>>() { // from class: com.netflix.mediaclient.ui.repository.UserAgentRepository$isUserLoggedIn$1
            @Override // o.drM
            /* renamed from: a */
            public final ObservableSource<? extends Boolean> invoke(UserAgent userAgent) {
                C8632dsu.c((Object) userAgent, "");
                return Observable.just(Boolean.valueOf(userAgent.v()));
            }
        };
        Observable flatMapObservable = h.flatMapObservable(new Function() { // from class: o.cQP
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource w;
                w = cQQ.w(drM.this, obj);
                return w;
            }
        });
        C8632dsu.a(flatMapObservable, "");
        return flatMapObservable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource w(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (ObservableSource) drm.invoke(obj);
    }

    public final Observable<Boolean> g() {
        Single<UserAgent> h = h();
        final UserAgentRepository$isNotActiveOrOnHold$1 userAgentRepository$isNotActiveOrOnHold$1 = new drM<UserAgent, ObservableSource<? extends Boolean>>() { // from class: com.netflix.mediaclient.ui.repository.UserAgentRepository$isNotActiveOrOnHold$1
            @Override // o.drM
            /* renamed from: d */
            public final ObservableSource<? extends Boolean> invoke(UserAgent userAgent) {
                C8632dsu.c((Object) userAgent, "");
                return Observable.just(Boolean.valueOf(userAgent.u()));
            }
        };
        Observable flatMapObservable = h.flatMapObservable(new Function() { // from class: o.cQW
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource u;
                u = cQQ.u(drM.this, obj);
                return u;
            }
        });
        C8632dsu.a(flatMapObservable, "");
        return flatMapObservable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource u(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (ObservableSource) drm.invoke(obj);
    }

    public final Single<d> a(List<String> list) {
        C8632dsu.c((Object) list, "");
        Single<UserAgent> h = h();
        final UserAgentRepository$createScopedAutoLoginToken$1 userAgentRepository$createScopedAutoLoginToken$1 = new UserAgentRepository$createScopedAutoLoginToken$1(list);
        Single flatMap = h.flatMap(new Function() { // from class: o.cQU
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource q;
                q = cQQ.q(drM.this, obj);
                return q;
            }
        });
        C8632dsu.a(flatMap, "");
        return flatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource q(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    public final Single<InterfaceC5282bvn> b() {
        Single<UserAgent> h = h();
        final UserAgentRepository$getCurrentUserAccount$1 userAgentRepository$getCurrentUserAccount$1 = new drM<UserAgent, SingleSource<? extends InterfaceC5282bvn>>() { // from class: com.netflix.mediaclient.ui.repository.UserAgentRepository$getCurrentUserAccount$1
            @Override // o.drM
            /* renamed from: b */
            public final SingleSource<? extends InterfaceC5282bvn> invoke(UserAgent userAgent) {
                C8632dsu.c((Object) userAgent, "");
                InterfaceC5282bvn i = userAgent.i();
                if (i != null) {
                    return Single.just(i);
                }
                return Single.error(new IllegalStateException("User was null in UserAgentRepository.getCurrentUser()"));
            }
        };
        Single flatMap = h.flatMap(new Function() { // from class: o.cQV
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource p;
                p = cQQ.p(drM.this, obj);
                return p;
            }
        });
        C8632dsu.a(flatMap, "");
        return flatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource p(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    public final Single<InterfaceC5283bvo> e() {
        Single<UserAgent> h = h();
        final UserAgentRepository$getCurrentProfile$1 userAgentRepository$getCurrentProfile$1 = new drM<UserAgent, SingleSource<? extends InterfaceC5283bvo>>() { // from class: com.netflix.mediaclient.ui.repository.UserAgentRepository$getCurrentProfile$1
            @Override // o.drM
            /* renamed from: d */
            public final SingleSource<? extends InterfaceC5283bvo> invoke(UserAgent userAgent) {
                C8632dsu.c((Object) userAgent, "");
                InterfaceC5283bvo j = userAgent.j();
                if (j != null) {
                    return Single.just(j);
                }
                return Single.error(new IllegalStateException("UserProfile was null in UserAgentRepository.getCurrentProfile()"));
            }
        };
        Single flatMap = h.flatMap(new Function() { // from class: o.cRe
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource r;
                r = cQQ.r(drM.this, obj);
                return r;
            }
        });
        C8632dsu.a(flatMap, "");
        return flatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource r(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    public final String d() {
        UserAgent n = n();
        if (n != null) {
            return n.h();
        }
        return null;
    }

    private final UserAgent n() {
        if (AbstractApplicationC1040Mh.getInstance().i().r()) {
            return a();
        }
        return null;
    }
}
