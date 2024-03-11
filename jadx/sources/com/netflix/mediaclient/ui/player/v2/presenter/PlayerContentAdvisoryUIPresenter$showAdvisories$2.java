package com.netflix.mediaclient.ui.player.v2.presenter;

import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.player.v2.presenter.PlayerContentAdvisoryUIPresenter$showAdvisories$2;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.advisory.ContentAdvisory;
import com.netflix.model.leafs.advisory.ExpiringContentAdvisory;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Lambda;
import o.C1044Mm;
import o.C8168dfL;
import o.C8632dsu;
import o.cDL;
import o.cFJ;
import o.dpR;
import o.drM;

/* loaded from: classes4.dex */
public final class PlayerContentAdvisoryUIPresenter$showAdvisories$2 extends Lambda implements drM<Map.Entry<? extends Advisory, ? extends Boolean>, ObservableSource<? extends Map.Entry<? extends Advisory, ? extends Boolean>>> {
    final /* synthetic */ cDL e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerContentAdvisoryUIPresenter$showAdvisories$2(cDL cdl) {
        super(1);
        this.e = cdl;
    }

    @Override // o.drM
    /* renamed from: c */
    public final ObservableSource<? extends Map.Entry<Advisory, Boolean>> invoke(Map.Entry<? extends Advisory, Boolean> entry) {
        float f;
        cFJ cfj;
        cFJ cfj2;
        C8632dsu.c((Object) entry, "");
        long delay = entry.getKey().getDelay() * 1000;
        final LinkedHashMap<Advisory, Boolean> a = this.e.a();
        Observable just = Observable.just(entry);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Observable delay2 = just.delay(delay, timeUnit, AndroidSchedulers.mainThread());
        final cDL cdl = this.e;
        final drM<Map.Entry<? extends Advisory, ? extends Boolean>, Boolean> drm = new drM<Map.Entry<? extends Advisory, ? extends Boolean>, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerContentAdvisoryUIPresenter$showAdvisories$2.1
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final Boolean invoke(Map.Entry<? extends Advisory, Boolean> entry2) {
                C8632dsu.c((Object) entry2, "");
                return Boolean.valueOf(!cDL.this.j());
            }
        };
        Observable filter = delay2.filter(new Predicate() { // from class: o.cDV
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean e;
                e = PlayerContentAdvisoryUIPresenter$showAdvisories$2.e(drM.this, obj);
                return e;
            }
        });
        final cDL cdl2 = this.e;
        final drM<Map.Entry<? extends Advisory, ? extends Boolean>, dpR> drm2 = new drM<Map.Entry<? extends Advisory, ? extends Boolean>, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerContentAdvisoryUIPresenter$showAdvisories$2.2

            /* renamed from: com.netflix.mediaclient.ui.player.v2.presenter.PlayerContentAdvisoryUIPresenter$showAdvisories$2$2$a */
            /* loaded from: classes4.dex */
            public final /* synthetic */ class a {
                public static final /* synthetic */ int[] b;

                static {
                    int[] iArr = new int[ExpiringContentAdvisory.ContentType.values().length];
                    try {
                        iArr[ExpiringContentAdvisory.ContentType.SERIES.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ExpiringContentAdvisory.ContentType.SHOW.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ExpiringContentAdvisory.ContentType.SEASON.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    b = iArr;
                }
            }

            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Map.Entry<? extends Advisory, ? extends Boolean> entry2) {
                c(entry2);
                return dpR.c;
            }

            public final void c(Map.Entry<? extends Advisory, Boolean> entry2) {
                cFJ cfj3;
                cFJ cfj4;
                cFJ cfj5;
                cFJ cfj6;
                String a2;
                cFJ cfj7;
                cFJ cfj8;
                C1044Mm.e("AdvisoryUIPresenter", "Showing Advisory...");
                Advisory key = entry2.getKey();
                if (key instanceof ExpiringContentAdvisory) {
                    ExpiringContentAdvisory expiringContentAdvisory = (ExpiringContentAdvisory) key;
                    ExpiringContentAdvisory.ContentType contentType = expiringContentAdvisory.contentType;
                    int i = contentType == null ? -1 : a.b[contentType.ordinal()];
                    int i2 = i != 1 ? i != 2 ? i != 3 ? R.o.bN : R.o.bP : R.o.bQ : R.o.bS;
                    String message = key.getMessage();
                    if (message == null || message.length() == 0) {
                        a2 = C8168dfL.a(i2, expiringContentAdvisory.localizedDate);
                    } else {
                        a2 = key.getMessage();
                    }
                    cfj7 = cDL.this.j;
                    C8632dsu.d((Object) a2);
                    cfj7.a(a2, expiringContentAdvisory.getSecondaryMessage());
                    cfj8 = cDL.this.j;
                    cfj8.d(true, cDL.this.c());
                } else if (key instanceof ContentAdvisory) {
                    cfj5 = cDL.this.j;
                    cfj5.e((ContentAdvisory) key);
                    cfj6 = cDL.this.j;
                    cfj6.d(false, cDL.this.c());
                } else if (key.getMessage() != null) {
                    cfj3 = cDL.this.j;
                    String message2 = key.getMessage();
                    C8632dsu.a(message2, "");
                    cfj3.a(message2, key.getSecondaryMessage());
                    cfj4 = cDL.this.j;
                    cfj4.d(false, cDL.this.c());
                }
            }
        };
        Observable doOnNext = filter.doOnNext(new Consumer() { // from class: o.cDU
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PlayerContentAdvisoryUIPresenter$showAdvisories$2.d(drM.this, obj);
            }
        });
        cfj = this.e.j;
        Observable delay3 = doOnNext.delay((entry.getKey().getDuration() * f) + cfj.h(), timeUnit, AndroidSchedulers.mainThread());
        final cDL cdl3 = this.e;
        final drM<Map.Entry<? extends Advisory, ? extends Boolean>, dpR> drm3 = new drM<Map.Entry<? extends Advisory, ? extends Boolean>, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerContentAdvisoryUIPresenter$showAdvisories$2.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Map.Entry<? extends Advisory, ? extends Boolean> entry2) {
                d(entry2);
                return dpR.c;
            }

            public final void d(Map.Entry<? extends Advisory, Boolean> entry2) {
                cFJ cfj3;
                cfj3 = cDL.this.j;
                cfj3.c((entry2.getKey() instanceof ExpiringContentAdvisory) || entry2.getKey().getType() == Advisory.Type.EXPIRY_NOTICE, cDL.this.c());
                a.put(entry2.getKey(), Boolean.TRUE);
            }
        };
        Observable doOnNext2 = delay3.doOnNext(new Consumer() { // from class: o.cDT
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PlayerContentAdvisoryUIPresenter$showAdvisories$2.j(drM.this, obj);
            }
        });
        cfj2 = this.e.j;
        return doOnNext2.delay(cfj2.h(), timeUnit, AndroidSchedulers.mainThread());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }
}
