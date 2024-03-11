package o;

import android.app.Activity;
import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.ui.profiles.ProfileCreator;
import com.netflix.mediaclient.ui.profiles.ProfileCreatorImpl$showDialog$observable$1;
import com.netflix.mediaclient.ui.profiles.ProfileCreatorImpl$showDialog$observable$2;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import o.AbstractC7431cwA;
import o.C8632dsu;
import o.cMQ;
import o.dpR;

/* loaded from: classes4.dex */
public final class cMQ extends C1045Mp implements ProfileCreator {
    public cMQ() {
        super("ProfileCreatorImpl");
    }

    @Override // com.netflix.mediaclient.ui.profiles.ProfileCreator
    public void b(Activity activity) {
        C8632dsu.c((Object) activity, "");
        c(this, activity, ProfileCreator.AgeSetting.d, null, 4, null);
    }

    public void d(Activity activity, ProfileCreator.AgeSetting ageSetting) {
        C8632dsu.c((Object) activity, "");
        if (ageSetting == null) {
            ageSetting = ProfileCreator.AgeSetting.d;
        }
        c(this, activity, ageSetting, null, 4, null);
    }

    @Override // com.netflix.mediaclient.ui.profiles.ProfileCreator
    public void b(Activity activity, ProfileCreator.AgeSetting ageSetting, int i) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) ageSetting, "");
        a(activity, ageSetting, Integer.valueOf(i));
    }

    static /* synthetic */ void c(cMQ cmq, Activity activity, ProfileCreator.AgeSetting ageSetting, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            ageSetting = ProfileCreator.AgeSetting.d;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        cmq.a(activity, ageSetting, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean i(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (Boolean) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(NetflixActivity netflixActivity, ProfileCreator.AgeSetting ageSetting, Integer num) {
        if (netflixActivity.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            Intent a = cMX.c.a(netflixActivity, ageSetting);
            if (num == null) {
                netflixActivity.startActivity(a);
            } else {
                netflixActivity.startActivityForResult(a, num.intValue());
            }
        }
    }

    private final void a(Activity activity, final ProfileCreator.AgeSetting ageSetting, final Integer num) {
        InterfaceC5283bvo m;
        final NetflixActivity netflixActivity = (NetflixActivity) C9737vz.e(activity, NetflixActivity.class);
        UserAgent c = C8126deW.c(netflixActivity);
        if (c == null || (m = c.m()) == null) {
            return;
        }
        if (m.isProfileCreationLocked()) {
            Observable<Boolean> d = d(netflixActivity, m);
            final drM<Boolean, dpR> drm = new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.ProfileCreatorImpl$createProfileInternal$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Boolean bool) {
                    e(bool);
                    return dpR.c;
                }

                public final void e(Boolean bool) {
                    C8632dsu.d(bool);
                    if (bool.booleanValue()) {
                        cMQ.this.d(netflixActivity, ageSetting, num);
                    }
                }
            };
            Consumer<? super Boolean> consumer = new Consumer() { // from class: o.cMU
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    cMQ.e(drM.this, obj);
                }
            };
            final drM<Throwable, dpR> drm2 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.ProfileCreatorImpl$createProfileInternal$1$2
                {
                    super(1);
                }

                public final void e(Throwable th) {
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    e(th);
                    return dpR.c;
                }
            };
            d.subscribe(consumer, new Consumer() { // from class: o.cMW
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    cMQ.f(drM.this, obj);
                }
            });
            return;
        }
        d(netflixActivity, ageSetting, num);
    }

    private final Observable<Boolean> d(NetflixActivity netflixActivity, InterfaceC5283bvo interfaceC5283bvo) {
        getLogTag();
        if (netflixActivity.getSupportFragmentManager().isStateSaved()) {
            Observable<Boolean> just = Observable.just(Boolean.FALSE);
            C8632dsu.a(just, "");
            return just;
        }
        C7432cwB e = C7432cwB.a.e(netflixActivity, interfaceC5283bvo);
        Observable<AbstractC7431cwA> e2 = e.e();
        final ProfileCreatorImpl$showDialog$observable$1 profileCreatorImpl$showDialog$observable$1 = new drM<AbstractC7431cwA, Boolean>() { // from class: com.netflix.mediaclient.ui.profiles.ProfileCreatorImpl$showDialog$observable$1
            @Override // o.drM
            /* renamed from: d */
            public final Boolean invoke(AbstractC7431cwA abstractC7431cwA) {
                C8632dsu.c((Object) abstractC7431cwA, "");
                return Boolean.valueOf(((abstractC7431cwA instanceof AbstractC7431cwA.a) && ((AbstractC7431cwA.a) abstractC7431cwA).b()) ? false : true);
            }
        };
        Observable<AbstractC7431cwA> filter = e2.filter(new Predicate() { // from class: o.cMS
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean j;
                j = cMQ.j(drM.this, obj);
                return j;
            }
        });
        final ProfileCreatorImpl$showDialog$observable$2 profileCreatorImpl$showDialog$observable$2 = new drM<AbstractC7431cwA, Boolean>() { // from class: com.netflix.mediaclient.ui.profiles.ProfileCreatorImpl$showDialog$observable$2
            @Override // o.drM
            /* renamed from: c */
            public final Boolean invoke(AbstractC7431cwA abstractC7431cwA) {
                C8632dsu.c((Object) abstractC7431cwA, "");
                return Boolean.valueOf(C8632dsu.c(abstractC7431cwA, AbstractC7431cwA.c.a));
            }
        };
        Observable map = filter.map(new Function() { // from class: o.cMT
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Boolean i;
                i = cMQ.i(drM.this, obj);
                return i;
            }
        });
        e.show(netflixActivity.getSupportFragmentManager(), NetflixActivity.FRAG_DIALOG_TAG);
        C8632dsu.d(map);
        return map;
    }
}
