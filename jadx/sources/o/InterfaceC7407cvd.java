package o;

import android.content.Context;
import android.content.Intent;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;

/* renamed from: o.cvd  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC7407cvd {
    public static final b d = b.d;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.cvd$c */
    /* loaded from: classes4.dex */
    public interface c {
        InterfaceC7407cvd G();
    }

    static InterfaceC7407cvd a(Context context) {
        return d.d(context);
    }

    boolean a();

    void b(InterfaceC2023aX interfaceC2023aX, String str, Integer num, Integer num2, String str2, String str3);

    boolean b();

    Intent c(Context context);

    AbstractC9900yh<?> e(Context context, C1729aMb c1729aMb, int i, LoMo loMo, RecyclerView.Adapter<?> adapter, Object obj, TrackingInfoHolder trackingInfoHolder);

    /* renamed from: o.cvd$b */
    /* loaded from: classes4.dex */
    public static final class b {
        static final /* synthetic */ b d = new b();

        private b() {
        }

        public final InterfaceC7407cvd d(Context context) {
            C8632dsu.c((Object) context, "");
            return ((c) EntryPointAccessors.fromApplication(context, c.class)).G();
        }
    }

    /* renamed from: o.cvd$d */
    /* loaded from: classes4.dex */
    public static final class d {
        private final int a;
        private final int c;
        private final String e;

        public final String c() {
            return this.e;
        }

        public final int d() {
            return this.a;
        }

        public final int e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.e, (Object) dVar.e) && this.c == dVar.c && this.a == dVar.a;
            }
            return false;
        }

        public int hashCode() {
            return (((this.e.hashCode() * 31) + Integer.hashCode(this.c)) * 31) + Integer.hashCode(this.a);
        }

        public String toString() {
            String str = this.e;
            int i = this.c;
            int i2 = this.a;
            return "Asset(url=" + str + ", width=" + i + ", height=" + i2 + ")";
        }

        public d(String str, int i, int i2) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.c = i;
            this.a = i2;
        }
    }
}
