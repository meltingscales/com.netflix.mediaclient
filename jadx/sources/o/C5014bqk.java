package o;

import android.content.Context;
import com.apollographql.apollo3.exception.ApolloNetworkException;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.graphqlrepo.api.errors.ErrorType;
import com.netflix.mediaclient.service.user.UserAccountRepositoryImpl$addUserProfile$1;
import com.netflix.mediaclient.service.user.UserAccountRepositoryImpl$deleteUserProfile$1;
import com.netflix.mediaclient.service.user.UserAccountRepositoryImpl$fetchAccountAndProfileDataUsingGraphQL$1;
import com.netflix.mediaclient.service.user.UserAccountRepositoryImpl$fetchAccountAndProfilesData$fetchCallback$1$onAccountDataFetched$2;
import com.netflix.mediaclient.service.user.UserAccountRepositoryImpl$fetchProfileData$1;
import com.netflix.mediaclient.service.user.UserAccountRepositoryImpl$fetchProfilesList$refreshCallback$1$onAccountDataFetched$2;
import com.netflix.mediaclient.service.user.UserAccountRepositoryImpl$fetchSingleProfileData$1;
import com.netflix.mediaclient.service.user.UserAccountRepositoryImpl$invokeOnUserProfilesUpdated$1;
import com.netflix.mediaclient.service.user.UserAccountRepositoryImpl$updateUserProfile$1;
import com.netflix.mediaclient.service.webclient.model.leafs.AccountData;
import com.netflix.mediaclient.service.webclient.model.leafs.UserAccount;
import com.netflix.mediaclient.servicemgr.NetflixDataRequest;
import dagger.Lazy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.InterfaceC1593aHa;
import o.XP;

/* renamed from: o.bqk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5014bqk implements InterfaceC5012bqi {
    public static final a b = new a(null);
    private final dwU a;
    private final drO<TQ> c;
    private final Context d;
    private List<? extends InterfaceC5283bvo> e;
    private final C5065bri f;
    private final dwQ g;
    private InterfaceC5282bvn h;
    private InterfaceC5284bvp i;
    private final Lazy<aCI> j;

    /* renamed from: o.bqk$b */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class b {
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[ErrorType.values().length];
            try {
                iArr[ErrorType.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ErrorType.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ErrorType.f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            d = iArr;
        }
    }

    @Override // o.InterfaceC5012bqi
    public InterfaceC5284bvp a() {
        return this.i;
    }

    @Override // o.InterfaceC5012bqi
    public List<InterfaceC5283bvo> c() {
        return this.e;
    }

    @Override // o.InterfaceC5012bqi
    public InterfaceC5282bvn e() {
        return this.h;
    }

    /* renamed from: o.bqk$c */
    /* loaded from: classes4.dex */
    public static final class c extends dqT implements CoroutineExceptionHandler {
        final /* synthetic */ InterfaceC4986bqI b;
        final /* synthetic */ C5014bqk c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CoroutineExceptionHandler.c cVar, C5014bqk c5014bqk, InterfaceC4986bqI interfaceC4986bqI) {
            super(cVar);
            this.c = c5014bqk;
            this.b = interfaceC4986bqI;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(dqZ dqz, Throwable th) {
            C5014bqk c5014bqk = this.c;
            NetflixImmutableStatus a = c5014bqk.a(th);
            C8632dsu.a(a, "");
            c5014bqk.c((AccountData) null, a, this.b);
        }
    }

    /* renamed from: o.bqk$d */
    /* loaded from: classes4.dex */
    public static final class d extends dqT implements CoroutineExceptionHandler {
        final /* synthetic */ C5014bqk a;
        final /* synthetic */ InterfaceC4986bqI e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(CoroutineExceptionHandler.c cVar, InterfaceC4986bqI interfaceC4986bqI, C5014bqk c5014bqk) {
            super(cVar);
            this.e = interfaceC4986bqI;
            this.a = c5014bqk;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(dqZ dqz, Throwable th) {
            this.e.c(null, this.a.a(th));
        }
    }

    /* renamed from: o.bqk$e */
    /* loaded from: classes4.dex */
    public static final class e extends dqT implements CoroutineExceptionHandler {
        final /* synthetic */ C5014bqk a;
        final /* synthetic */ InterfaceC4986bqI e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(CoroutineExceptionHandler.c cVar, C5014bqk c5014bqk, InterfaceC4986bqI interfaceC4986bqI) {
            super(cVar);
            this.a = c5014bqk;
            this.e = interfaceC4986bqI;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(dqZ dqz, Throwable th) {
            C5014bqk c5014bqk = this.a;
            NetflixImmutableStatus a = c5014bqk.a(th);
            C8632dsu.a(a, "");
            c5014bqk.c((AccountData) null, a, this.e);
        }
    }

    /* renamed from: o.bqk$g */
    /* loaded from: classes4.dex */
    public static final class g extends dqT implements CoroutineExceptionHandler {
        final /* synthetic */ InterfaceC4986bqI b;
        final /* synthetic */ C5014bqk c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(CoroutineExceptionHandler.c cVar, C5014bqk c5014bqk, InterfaceC4986bqI interfaceC4986bqI) {
            super(cVar);
            this.c = c5014bqk;
            this.b = interfaceC4986bqI;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(dqZ dqz, Throwable th) {
            C5014bqk c5014bqk = this.c;
            NetflixImmutableStatus a = c5014bqk.a(th);
            C8632dsu.a(a, "");
            c5014bqk.c((AccountData) null, a, this.b);
        }
    }

    /* renamed from: o.bqk$h */
    /* loaded from: classes4.dex */
    public static final class h extends dqT implements CoroutineExceptionHandler {
        final /* synthetic */ C5014bqk c;
        final /* synthetic */ InterfaceC4986bqI d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(CoroutineExceptionHandler.c cVar, InterfaceC4986bqI interfaceC4986bqI, C5014bqk c5014bqk) {
            super(cVar);
            this.d = interfaceC4986bqI;
            this.c = c5014bqk;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(dqZ dqz, Throwable th) {
            this.d.e((InterfaceC5283bvo) null, this.c.a(th));
        }
    }

    /* renamed from: o.bqk$j */
    /* loaded from: classes4.dex */
    public static final class j extends dqT implements CoroutineExceptionHandler {
        final /* synthetic */ InterfaceC4986bqI a;
        final /* synthetic */ C5014bqk b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(CoroutineExceptionHandler.c cVar, InterfaceC4986bqI interfaceC4986bqI, C5014bqk c5014bqk) {
            super(cVar);
            this.a = interfaceC4986bqI;
            this.b = c5014bqk;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(dqZ dqz, Throwable th) {
            InterfaceC4986bqI interfaceC4986bqI = this.a;
            if (interfaceC4986bqI != null) {
                interfaceC4986bqI.e((InterfaceC5283bvo) null, this.b.a(th));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5014bqk(Context context, aOV aov, drO<? extends TQ> dro, dwU dwu, dwQ dwq, Lazy<aCI> lazy) {
        boolean g2;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) aov, "");
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) dwu, "");
        C8632dsu.c((Object) dwq, "");
        C8632dsu.c((Object) lazy, "");
        this.d = context;
        this.c = dro;
        this.a = dwu;
        this.g = dwq;
        this.j = lazy;
        this.f = new C5065bri(context, aov);
        String e2 = C8157dfA.e(context, "useragent_userprofiles_data", (String) null);
        if (e2 != null) {
            g2 = C8691duz.g(e2);
            if (!g2) {
                this.e = C4991bqN.c(e2);
            }
        }
    }

    @Override // o.InterfaceC5012bqi
    public void d() {
        this.h = null;
        this.i = null;
        this.e = null;
        C8197dfo c8197dfo = new C8197dfo();
        c8197dfo.a("useragent_userprofiles_data");
        c8197dfo.a("useragent_user_data");
        c8197dfo.a();
    }

    @Override // o.InterfaceC5012bqi
    public boolean d(InterfaceC5283bvo interfaceC5283bvo) {
        int d2;
        List<? extends InterfaceC5283bvo> n;
        C8632dsu.c((Object) interfaceC5283bvo, "");
        List<InterfaceC5283bvo> list = this.e;
        if (list == null) {
            list = new ArrayList();
        }
        d2 = C8572dqo.d(list, 10);
        ArrayList arrayList = new ArrayList(d2);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC5283bvo interfaceC5283bvo2 = (InterfaceC5283bvo) it.next();
            if (C8632dsu.c((Object) (interfaceC5283bvo2 != null ? interfaceC5283bvo2.getProfileGuid() : null), (Object) interfaceC5283bvo.getProfileGuid())) {
                interfaceC5283bvo2 = interfaceC5283bvo;
            }
            arrayList.add(interfaceC5283bvo2);
        }
        n = C8576dqs.n(arrayList);
        if (!list.isEmpty()) {
            for (InterfaceC5283bvo interfaceC5283bvo3 : list) {
                if (C8632dsu.c((Object) (interfaceC5283bvo3 != null ? interfaceC5283bvo3.getProfileGuid() : null), (Object) interfaceC5283bvo.getProfileGuid())) {
                    break;
                }
            }
        }
        n.add(interfaceC5283bvo);
        this.e = n;
        C4991bqN.a(this.d, (List<InterfaceC5283bvo>) n, (List<InterfaceC5283bvo>) list);
        return true;
    }

    @Override // o.InterfaceC5012bqi
    public boolean b() {
        boolean z;
        String e2;
        String e3 = C8157dfA.e(this.d, "useragent_userprofiles_data", (String) null);
        a aVar = b;
        aVar.getLogTag();
        if (e3 != null && e3.length() != 0) {
            AbstractApplicationC1040Mh.getInstance().t();
            List<InterfaceC5283bvo> c2 = C4991bqN.c(e3);
            this.e = c2;
            if (c2 == null || c2.isEmpty()) {
                C8157dfA.e(this.d, "useragent_userprofiles_data");
            } else {
                z = true;
                e2 = C8157dfA.e(this.d, "useragent_user_data", (String) null);
                aVar.getLogTag();
                if (e2 != null && e2.length() != 0) {
                    UserAccount userAccount = new UserAccount(e2);
                    this.i = userAccount.getSubtitleDefaults();
                    this.h = userAccount;
                }
                return z;
            }
        }
        z = false;
        e2 = C8157dfA.e(this.d, "useragent_user_data", (String) null);
        aVar.getLogTag();
        if (e2 != null) {
            UserAccount userAccount2 = new UserAccount(e2);
            this.i = userAccount2.getSubtitleDefaults();
            this.h = userAccount2;
        }
        return z;
    }

    /* renamed from: o.bqk$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC5011bqh {
        final /* synthetic */ InterfaceC4986bqI c;

        f(InterfaceC4986bqI interfaceC4986bqI) {
            this.c = interfaceC4986bqI;
        }

        @Override // o.AbstractC5011bqh, o.InterfaceC4986bqI
        public void c(AccountData accountData, Status status) {
            C8632dsu.c((Object) status, "");
            if (status.j() && accountData != null) {
                C5014bqk.b.getLogTag();
                C5014bqk.this.e(accountData.getUserProfiles());
                C5014bqk.this.d(accountData.getUserAccount());
            }
            C8737dwr.c(C5014bqk.this.a, C5014bqk.this.g, null, new UserAccountRepositoryImpl$fetchAccountAndProfilesData$fetchCallback$1$onAccountDataFetched$2(this.c, accountData, status, null), 2, null);
        }
    }

    @Override // o.InterfaceC5012bqi
    public void d(InterfaceC4986bqI interfaceC4986bqI, boolean z) {
        e(new f(interfaceC4986bqI));
    }

    @Override // o.InterfaceC5012bqi
    public void c(String str, InterfaceC5283bvo interfaceC5283bvo, InterfaceC4986bqI interfaceC4986bqI) {
        boolean g2;
        if (str != null) {
            g2 = C8691duz.g(str);
            if (!g2) {
                C8737dwr.c(this.a, new j(CoroutineExceptionHandler.Key, interfaceC4986bqI, this), null, new UserAccountRepositoryImpl$fetchProfileData$1(this, str, interfaceC5283bvo, interfaceC4986bqI, null), 2, null);
                return;
            }
        }
        if (interfaceC4986bqI != null) {
            interfaceC4986bqI.e((InterfaceC5283bvo) null, InterfaceC1078Nw.aC);
        }
    }

    /* renamed from: o.bqk$i */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC5011bqh {
        final /* synthetic */ InterfaceC4986bqI c;

        i(InterfaceC4986bqI interfaceC4986bqI) {
            this.c = interfaceC4986bqI;
        }

        @Override // o.AbstractC5011bqh, o.InterfaceC4986bqI
        public void c(AccountData accountData, Status status) {
            C8632dsu.c((Object) status, "");
            if (status.j() && accountData != null) {
                C5014bqk.b.getLogTag();
                C5014bqk.this.e(accountData.getUserProfiles());
            }
            C8737dwr.c(C5014bqk.this.a, C5014bqk.this.g, null, new UserAccountRepositoryImpl$fetchProfilesList$refreshCallback$1$onAccountDataFetched$2(this.c, accountData, status, null), 2, null);
        }
    }

    @Override // o.InterfaceC5012bqi
    public void e(InterfaceC4986bqI interfaceC4986bqI, boolean z) {
        e(new i(interfaceC4986bqI));
    }

    /* renamed from: o.bqk$l */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC5011bqh {
        final /* synthetic */ InterfaceC4986bqI a;
        final /* synthetic */ C5014bqk b;

        l(InterfaceC4986bqI interfaceC4986bqI, C5014bqk c5014bqk) {
            this.a = interfaceC4986bqI;
            this.b = c5014bqk;
        }

        @Override // o.AbstractC5011bqh, o.InterfaceC4986bqI
        public void e(AccountData accountData, Status status) {
            List<InterfaceC5283bvo> userProfiles;
            C8632dsu.c((Object) status, "");
            if (status.j() && accountData != null && (userProfiles = accountData.getUserProfiles()) != null) {
                this.b.e(userProfiles);
            }
            InterfaceC4986bqI interfaceC4986bqI = this.a;
            if (interfaceC4986bqI != null) {
                interfaceC4986bqI.e(accountData, status);
            }
        }
    }

    @Override // o.InterfaceC5012bqi
    public void a(String str, InterfaceC5284bvp interfaceC5284bvp, InterfaceC4986bqI interfaceC4986bqI) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) interfaceC5284bvp, "");
        NetflixDataRequest b2 = this.f.b(str, interfaceC5284bvp, new l(interfaceC4986bqI, this));
        C8632dsu.a(b2, "");
        d(b2);
    }

    protected final void e(List<? extends InterfaceC5283bvo> list) {
        if (list == null) {
            return;
        }
        C4991bqN.a(this.d, (List<InterfaceC5283bvo>) list, (List<InterfaceC5283bvo>) this.e);
        this.e = list;
    }

    protected final void d(InterfaceC5282bvn interfaceC5282bvn) {
        if (interfaceC5282bvn == null) {
            return;
        }
        this.h = interfaceC5282bvn;
        UserAccount userAccount = interfaceC5282bvn instanceof UserAccount ? (UserAccount) interfaceC5282bvn : null;
        this.i = userAccount != null ? userAccount.getSubtitleDefaults() : null;
        C4991bqN.b(this.d, interfaceC5282bvn);
    }

    public final void a(InterfaceC5283bvo interfaceC5283bvo, InterfaceC5283bvo interfaceC5283bvo2) {
        boolean g2;
        boolean g3;
        String avatarUrl;
        boolean g4;
        List<? extends InterfaceC5283bvo> n;
        boolean g5;
        if (interfaceC5283bvo != null) {
            String profileGuid = interfaceC5283bvo.getProfileGuid();
            C8632dsu.a(profileGuid, "");
            g2 = C8691duz.g(profileGuid);
            if (g2) {
                return;
            }
            if (C8632dsu.c((Object) interfaceC5283bvo.getProfileGuid(), (Object) (interfaceC5283bvo2 != null ? interfaceC5283bvo2.getProfileGuid() : null))) {
                String profileName = interfaceC5283bvo.getProfileName();
                C8632dsu.a(profileName, "");
                g3 = C8691duz.g(profileName);
                if (g3 || (avatarUrl = interfaceC5283bvo.getAvatarUrl()) == null) {
                    return;
                }
                g4 = C8691duz.g(avatarUrl);
                if (g4) {
                    return;
                }
                if (this.e == null) {
                    String e2 = C8157dfA.e(this.d, "useragent_userprofiles_data", (String) null);
                    if (e2 != null) {
                        g5 = C8691duz.g(e2);
                        if (!g5) {
                            this.e = C4991bqN.c(e2);
                        }
                    }
                    if (this.e == null) {
                        this.e = new ArrayList();
                    }
                }
                List<? extends InterfaceC5283bvo> list = this.e;
                if (list != null) {
                    n = C8576dqs.n(list);
                    Iterator<? extends InterfaceC5283bvo> it = n.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                            break;
                        }
                        InterfaceC5283bvo next = it.next();
                        if (next != null && C8632dsu.c((Object) next.getProfileGuid(), (Object) interfaceC5283bvo.getProfileGuid())) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 >= 0) {
                        n.set(i2, interfaceC5283bvo);
                    } else {
                        n.add(interfaceC5283bvo);
                    }
                    C4991bqN.a(this.d, (List<InterfaceC5283bvo>) n, (List<InterfaceC5283bvo>) this.e);
                    this.e = n;
                    return;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
    }

    private final boolean d(NetflixDataRequest netflixDataRequest) {
        return this.c.invoke().c(netflixDataRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b(C8954gU<XP.e> c8954gU) {
        boolean z;
        ArrayList arrayList;
        int d2;
        XP.d c2;
        List<XP.h> i2;
        XP.e eVar = c8954gU.d;
        if (eVar == null || (c2 = eVar.c()) == null || (i2 = c2.i()) == null) {
            z = false;
            break;
        }
        if (!i2.isEmpty()) {
            for (XP.h hVar : i2) {
                if (hVar.a().e().length() == 0) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (!z) {
            return true;
        }
        List<C9035hw> list = c8954gU.e;
        if (list != null) {
            d2 = C8572dqo.d(list, 10);
            arrayList = new ArrayList(d2);
            for (C9035hw c9035hw : list) {
                arrayList.add(new aCS(c9035hw));
            }
        } else {
            arrayList = null;
        }
        return b(arrayList);
    }

    public final boolean b(List<aCS> list) {
        if (list != null && !list.isEmpty() && (!(list instanceof Collection) || !list.isEmpty())) {
            for (aCS acs : list) {
                if (acs.b().c() != ErrorType.b && (acs.b().c() != ErrorType.f || !d(acs))) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean d(aCS acs) {
        List<Object> e2 = acs.e();
        if (C8632dsu.c(e2 != null ? C8576dqs.B((List<? extends Object>) e2) : null, (Object) "subtitleSettings")) {
            return true;
        }
        List<Object> e3 = acs.e();
        return e3 != null && e3.contains("avatar");
    }

    public final StatusCode b(ErrorType errorType) {
        int i2 = errorType == null ? -1 : b.d[errorType.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return StatusCode.SERVICE_NOT_AVAILABLE;
                }
                return StatusCode.INTERNAL_ERROR;
            }
            return StatusCode.USER_NOT_AUTHORIZED;
        }
        return StatusCode.NO_PROFILES_FOUND;
    }

    public final NetflixImmutableStatus a(Throwable th) {
        C8632dsu.c((Object) th, "");
        if (th instanceof ApolloNetworkException) {
            InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
            String message = th.getMessage();
            aVar.a("UserAccountRepo apolloException: " + message);
            return aCP.a(th) ? InterfaceC1078Nw.aG : aCP.c(th) ? InterfaceC1078Nw.a : InterfaceC1078Nw.ad;
        }
        InterfaceC1593aHa.a aVar2 = InterfaceC1593aHa.c;
        String message2 = th.getMessage();
        aVar2.a("UserAccountRepo throwable: " + message2);
        return InterfaceC1078Nw.ad;
    }

    public final void c(AccountData accountData, Status status, InterfaceC4986bqI interfaceC4986bqI) {
        C8632dsu.c((Object) status, "");
        if (status.j() && accountData != null) {
            e(accountData.getUserProfiles());
            d(accountData.getUserAccount());
        }
        if (interfaceC4986bqI != null) {
            C8737dwr.c(this.a, this.g, null, new UserAccountRepositoryImpl$invokeOnUserProfilesUpdated$1(interfaceC4986bqI, accountData, status, null), 2, null);
        }
    }

    /* renamed from: o.bqk$a */
    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("nf_service_useraccountrepo");
        }
    }

    @Override // o.InterfaceC5012bqi
    public InterfaceC5283bvo a(String str) {
        List<? extends InterfaceC5283bvo> list;
        Object obj = null;
        if (str == null || (list = this.e) == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC5283bvo interfaceC5283bvo = (InterfaceC5283bvo) next;
            if (C8632dsu.c((Object) (interfaceC5283bvo != null ? interfaceC5283bvo.getProfileGuid() : null), (Object) str)) {
                obj = next;
                break;
            }
        }
        return (InterfaceC5283bvo) obj;
    }

    @Override // o.InterfaceC5012bqi
    public void b(String str, boolean z, String str2, Integer num, InterfaceC4986bqI interfaceC4986bqI) {
        C8632dsu.c((Object) str, "");
        C8737dwr.c(this.a, new e(CoroutineExceptionHandler.Key, this, interfaceC4986bqI), null, new UserAccountRepositoryImpl$addUserProfile$1(this, str, str2, z, interfaceC4986bqI, null), 2, null);
    }

    @Override // o.InterfaceC5012bqi
    public void e(String str, String str2, Boolean bool, String str3, Integer num, String str4, List<String> list, Boolean bool2, Boolean bool3, boolean z, InterfaceC4986bqI interfaceC4986bqI) {
        C8632dsu.c((Object) str, "");
        C8737dwr.c(this.a, new g(CoroutineExceptionHandler.Key, this, interfaceC4986bqI), null, new UserAccountRepositoryImpl$updateUserProfile$1(bool3, this, str2, str3, num, bool, bool2, str4, list, str, interfaceC4986bqI, null), 2, null);
    }

    @Override // o.InterfaceC5012bqi
    public void a(String str, InterfaceC4986bqI interfaceC4986bqI) {
        C8632dsu.c((Object) str, "");
        C8737dwr.c(this.a, new c(CoroutineExceptionHandler.Key, this, interfaceC4986bqI), null, new UserAccountRepositoryImpl$deleteUserProfile$1(this, interfaceC4986bqI, str, null), 2, null);
    }

    private final void e(InterfaceC4986bqI interfaceC4986bqI) {
        C8737dwr.c(this.a, new d(CoroutineExceptionHandler.Key, interfaceC4986bqI, this), null, new UserAccountRepositoryImpl$fetchAccountAndProfileDataUsingGraphQL$1(this, interfaceC4986bqI, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(String str, InterfaceC4986bqI interfaceC4986bqI) {
        C8737dwr.c(this.a, new h(CoroutineExceptionHandler.Key, interfaceC4986bqI, this), null, new UserAccountRepositoryImpl$fetchSingleProfileData$1(this, str, interfaceC4986bqI, null), 2, null);
    }
}
