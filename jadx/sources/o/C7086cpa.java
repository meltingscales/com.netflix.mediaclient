package o;

import android.app.Activity;
import com.netflix.mediaclient.service.webclient.model.leafs.AccountData;
import com.netflix.mediaclient.ui.nonmember.impl.NonMemberHomeActivity;
import com.netflix.mediaclient.ui.nonmember.impl.NonMemberImpl$isCurrentMember$1;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import javax.inject.Inject;
import javax.inject.Provider;
import o.C8632dsu;
import o.InterfaceC5282bvn;
import o.cQQ;

/* renamed from: o.cpa  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7086cpa implements InterfaceC7020coL {
    private final Provider<Boolean> a;
    private final cQQ e;

    @Inject
    public C7086cpa(Provider<Boolean> provider) {
        C8632dsu.c((Object) provider, "");
        this.a = provider;
        this.e = new cQQ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean a(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (Boolean) drm.invoke(obj);
    }

    @Override // o.InterfaceC7020coL
    public Observable<Boolean> e() {
        Observable<cQQ.e> o2 = this.e.o();
        final NonMemberImpl$isCurrentMember$1 nonMemberImpl$isCurrentMember$1 = new drM<cQQ.e, Boolean>() { // from class: com.netflix.mediaclient.ui.nonmember.impl.NonMemberImpl$isCurrentMember$1
            @Override // o.drM
            /* renamed from: c */
            public final Boolean invoke(cQQ.e eVar) {
                InterfaceC5282bvn userAccount;
                C8632dsu.c((Object) eVar, "");
                AccountData c = eVar.c();
                if (c == null || (userAccount = c.getUserAccount()) == null) {
                    return null;
                }
                return Boolean.valueOf(!userAccount.isNotActiveOrOnHold());
            }
        };
        Observable map = o2.map(new Function() { // from class: o.coX
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Boolean a;
                a = C7086cpa.a(drM.this, obj);
                return a;
            }
        });
        C8632dsu.a(map, "");
        return map;
    }

    @Override // o.InterfaceC7020coL
    public boolean a(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return activity instanceof NonMemberHomeActivity;
    }

    @Override // o.InterfaceC7020coL
    public boolean c(Activity activity) {
        C8632dsu.c((Object) activity, "");
        Boolean bool = this.a.get();
        C8632dsu.a(bool, "");
        return bool.booleanValue() && a(activity);
    }
}
