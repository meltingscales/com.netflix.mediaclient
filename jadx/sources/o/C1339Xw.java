package o;

import android.content.Context;
import android.provider.Settings;
import android.view.OrientationEventListener;
import dagger.hilt.android.qualifiers.ApplicationContext;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;

/* renamed from: o.Xw  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1339Xw extends OrientationEventListener {
    private final PublishSubject<Integer> b;
    private final Observable<Integer> e;
    public static final c d = new c(null);
    public static final int c = 8;

    public final Observable<Integer> b() {
        return this.e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public C1339Xw(@ApplicationContext Context context) {
        super(context);
        C8632dsu.c((Object) context, "");
        PublishSubject<Integer> create = PublishSubject.create();
        C8632dsu.a(create, "");
        this.b = create;
        Observable<Integer> observeOn = create.distinctUntilChanged().debounce(200L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread());
        C8632dsu.a(observeOn, "");
        this.e = observeOn;
    }

    /* renamed from: o.Xw$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final boolean a(Context context) {
            C8632dsu.c((Object) context, "");
            return !e(context) && Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) == 1;
        }

        private final boolean e(Context context) {
            return C8157dfA.b(context, "auto_rotate_disabled_for_testing", false);
        }
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i) {
        if (i != -1) {
            this.b.onNext(Integer.valueOf(((i < 320 || i >= 360) && (i < 0 || i > 40) && ((i >= 230 && i <= 310) || i < 140 || i > 220)) ? 2 : 1));
        }
    }
}
