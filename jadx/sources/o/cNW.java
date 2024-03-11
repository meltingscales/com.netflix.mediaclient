package o;

import android.app.Activity;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.app.Status;
import io.reactivex.Observable;

/* loaded from: classes.dex */
public interface cNW {
    boolean b();

    void c(boolean z);

    Observable<b> e(Activity activity, InterfaceC5283bvo interfaceC5283bvo, AppView appView);

    /* loaded from: classes4.dex */
    public static final class b {
        public static final C0110b b = new C0110b(null);
        private final Status a;
        private final boolean c;
        private final int d;

        public final int a() {
            return this.d;
        }

        public final Status c() {
            return this.a;
        }

        public final boolean e() {
            return this.c;
        }

        public b(int i, Status status, boolean z) {
            this.d = i;
            this.a = status;
            this.c = z;
        }

        public /* synthetic */ b(int i, Status status, boolean z, int i2, C8627dsp c8627dsp) {
            this(i, (i2 & 2) != 0 ? null : status, (i2 & 4) != 0 ? false : z);
        }

        /* renamed from: o.cNW$b$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0110b {
            public /* synthetic */ C0110b(C8627dsp c8627dsp) {
                this();
            }

            private C0110b() {
            }
        }
    }
}
