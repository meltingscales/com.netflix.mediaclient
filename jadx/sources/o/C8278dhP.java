package o;

import android.content.Context;
import com.netflix.cl.Logger;
import com.netflix.cl.model.event.session.accessibility.ScreenReaderSession;
import com.netflix.mediaclient.util.AccessibilityUtils;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import o.C8278dhP;
import o.C8632dsu;
import o.dpR;

/* renamed from: o.dhP  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8278dhP implements InterfaceC8277dhO {
    private Disposable a;
    private Long b;
    private boolean d;
    public static final a e = new a(null);
    public static final int c = 8;

    /* renamed from: o.dhP$a */
    /* loaded from: classes5.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("ScreenReader");
        }
    }

    @Override // o.InterfaceC8277dhO
    public void b(Context context) {
        synchronized (this) {
            C8632dsu.c((Object) context, "");
            if (this.d) {
                return;
            }
            this.d = true;
            e.getLogTag();
            Observable<Boolean> distinctUntilChanged = AccessibilityUtils.c(context).distinctUntilChanged();
            final drM<Boolean, dpR> drm = new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.util.log.clv2.accessibility.ScreenReaderModule$checkAndStart$2
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Boolean bool) {
                    d(bool);
                    return dpR.c;
                }

                public final void d(Boolean bool) {
                    Long l;
                    C8278dhP.e.getLogTag();
                    Logger logger = Logger.INSTANCE;
                    l = C8278dhP.this.b;
                    logger.endSession(l);
                    C8278dhP c8278dhP = C8278dhP.this;
                    C8632dsu.d(bool);
                    c8278dhP.b = bool.booleanValue() ? logger.startSession(new ScreenReaderSession()) : null;
                }
            };
            this.a = distinctUntilChanged.subscribe(new Consumer() { // from class: o.dhT
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C8278dhP.a(drM.this, obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    @Override // o.InterfaceC8277dhO
    public void e(Context context) {
        synchronized (this) {
            C8632dsu.c((Object) context, "");
            this.d = false;
            Logger.INSTANCE.endSession(this.b);
            this.b = null;
            Disposable disposable = this.a;
            if (disposable != null) {
                disposable.dispose();
            }
            this.a = null;
        }
    }
}
