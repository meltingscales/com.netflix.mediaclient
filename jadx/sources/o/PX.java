package o;

import android.graphics.drawable.BitmapDrawable;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;

/* loaded from: classes3.dex */
public abstract class PX {
    private final drO<dpR> a;
    private final String b;

    public /* synthetic */ PX(String str, drO dro, C8627dsp c8627dsp) {
        this(str, dro);
    }

    public final drO<dpR> b() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    private PX(String str, drO<dpR> dro) {
        this.b = str;
        this.a = dro;
    }

    /* loaded from: classes3.dex */
    public static final class b extends PX {
        private final BitmapDrawable c;

        public final BitmapDrawable e() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, drO<dpR> dro, BitmapDrawable bitmapDrawable) {
            super(str, dro, null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) dro, "");
            C8632dsu.c((Object) bitmapDrawable, "");
            this.c = bitmapDrawable;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends PX {
        private final HawkinsIcon e;

        public final HawkinsIcon e() {
            return this.e;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, drO<dpR> dro, HawkinsIcon hawkinsIcon) {
            super(str, dro, null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) dro, "");
            C8632dsu.c((Object) hawkinsIcon, "");
            this.e = hawkinsIcon;
        }
    }
}
