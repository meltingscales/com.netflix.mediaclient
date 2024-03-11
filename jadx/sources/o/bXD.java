package o;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.FragmentManager;
import com.netflix.clcs.ui.InterstitialCoordinator;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import java.util.Map;

/* loaded from: classes.dex */
public interface bXD {
    void a(Activity activity, InterfaceC5283bvo interfaceC5283bvo, FragmentManager fragmentManager);

    void a(Context context, InterfaceC5283bvo interfaceC5283bvo, drM<? super b, dpR> drm);

    void a(String str, Map<String, ? extends Object> map, Activity activity, InterfaceC5283bvo interfaceC5283bvo, FragmentManager fragmentManager);

    boolean a();

    void b(String str, Activity activity, InterfaceC5283bvo interfaceC5283bvo, FragmentManager fragmentManager, drM<? super b, dpR> drm, drO<dpR> dro);

    InterfaceC8822dzv<drX<Composer, Integer, dpR>> d();

    InterstitialCoordinator e();

    boolean h();

    /* loaded from: classes4.dex */
    public static abstract class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        /* renamed from: o.bXD$b$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0104b extends b {
            public static final C0104b a = new C0104b();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C0104b) {
                    C0104b c0104b = (C0104b) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1312983881;
            }

            public String toString() {
                return "None";
            }

            private C0104b() {
                super(null);
            }
        }

        private b() {
        }

        /* loaded from: classes4.dex */
        public static final class a extends b {
            private final UmaAlert a;

            public final UmaAlert c() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && C8632dsu.c(this.a, ((a) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                UmaAlert umaAlert = this.a;
                return "Legacy(umaAlert=" + umaAlert + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(UmaAlert umaAlert) {
                super(null);
                C8632dsu.c((Object) umaAlert, "");
                this.a = umaAlert;
            }
        }

        /* loaded from: classes4.dex */
        public static final class d extends b {
            public static final d a = new d();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof d) {
                    d dVar = (d) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 738828861;
            }

            public String toString() {
                return "Interstitial";
            }

            private d() {
                super(null);
            }
        }
    }
}
