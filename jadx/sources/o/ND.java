package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Cancellable;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import o.C1044Mm;
import o.C8632dsu;
import o.ND;
import o.dpR;

/* loaded from: classes3.dex */
public final class ND {
    public static final ND a = new ND();
    private static final AtomicLong b;
    private static Disposable c;
    private static ObservableEmitter<dpR> d;
    private static final BroadcastReceiver e;
    private static final Observable<dpR> i;

    public final Observable<dpR> a() {
        return i;
    }

    private ND() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ObservableEmitter observableEmitter) {
        C8632dsu.c((Object) observableEmitter, "");
        d = observableEmitter;
        observableEmitter.setCancellable(new Cancellable() { // from class: o.NH
            @Override // io.reactivex.functions.Cancellable
            public final void cancel() {
                ND.j();
            }
        });
        a.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j() {
        a.i();
    }

    static {
        Observable<dpR> share = Observable.create(new ObservableOnSubscribe() { // from class: o.NG
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                ND.c(observableEmitter);
            }
        }).share();
        C8632dsu.a(share, "");
        i = share;
        b = new AtomicLong(SystemClock.elapsedRealtime());
        e = new b();
    }

    /* loaded from: classes3.dex */
    public static final class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) intent, "");
            String action = intent.getAction();
            if (C8632dsu.c((Object) "com.netflix.mediaclient.intent.action.PLAYER_LOCAL_PLAYBACK_STARTED", (Object) action)) {
                ND.b.set(0L);
            } else if (C8632dsu.c((Object) "com.netflix.mediaclient.intent.action.PLAYER_LOCAL_PLAYBACK_ENDED", (Object) action)) {
                ND.b.set(SystemClock.elapsedRealtime());
            }
        }
    }

    private final long d() {
        AtomicLong atomicLong = b;
        if (atomicLong.get() <= 0) {
            return 0L;
        }
        return SystemClock.elapsedRealtime() - atomicLong.get();
    }

    private final void c() {
        C8116deM.c(AbstractApplicationC1040Mh.d(), e, "com.netflix.mediaclient.intent.category.PLAYER", (String[]) Arrays.copyOf(new String[]{"com.netflix.mediaclient.intent.action.PLAYER_LOCAL_PLAYBACK_STARTED", "com.netflix.mediaclient.intent.action.PLAYER_LOCAL_PLAYBACK_ENDED"}, 2));
        c = SubscribersKt.subscribeBy$default(C1081Nz.d.d(), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.android.app.UserSessionStateManager$startListening$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                a(th);
                return dpR.c;
            }

            public final void a(Throwable th) {
                C8632dsu.c((Object) th, "");
                C1044Mm.d("UserSessionStateManager", th.getMessage());
            }
        }, (drO) null, new drM<Long, dpR>() { // from class: com.netflix.mediaclient.android.app.UserSessionStateManager$startListening$2
            @Override // o.drM
            public /* synthetic */ dpR invoke(Long l) {
                a(l.longValue());
                return dpR.c;
            }

            public final void a(long j) {
                ND.a.e(j);
            }
        }, 2, (Object) null);
    }

    private final void i() {
        C8116deM.a(AbstractApplicationC1040Mh.d(), e);
        Disposable disposable = c;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(long j) {
        ObservableEmitter<dpR> observableEmitter;
        if (d() < 1800000 || j < 1800000 || (observableEmitter = d) == null) {
            return;
        }
        observableEmitter.onNext(dpR.c);
    }
}
