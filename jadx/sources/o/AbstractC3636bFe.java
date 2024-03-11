package o;

import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import com.netflix.mediaclient.ui.details.SupportedCapabilities;

/* renamed from: o.bFe  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3636bFe {
    private final SupportedCapabilities a;
    private final int c;

    public /* synthetic */ AbstractC3636bFe(int i, SupportedCapabilities supportedCapabilities, C8627dsp c8627dsp) {
        this(i, supportedCapabilities);
    }

    public final SupportedCapabilities c() {
        return this.a;
    }

    public final int d() {
        return this.c;
    }

    private AbstractC3636bFe(int i, SupportedCapabilities supportedCapabilities) {
        this.c = i;
        this.a = supportedCapabilities;
    }

    /* renamed from: o.bFe$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3636bFe {
        private final HawkinsIcon e;

        public final HawkinsIcon a() {
            return this.e;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HawkinsIcon hawkinsIcon, int i, SupportedCapabilities supportedCapabilities) {
            super(i, supportedCapabilities, null);
            C8632dsu.c((Object) hawkinsIcon, "");
            C8632dsu.c((Object) supportedCapabilities, "");
            this.e = hawkinsIcon;
        }
    }

    /* renamed from: o.bFe$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3636bFe {
        private final int e;

        public final int e() {
            return this.e;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2, SupportedCapabilities supportedCapabilities) {
            super(i2, supportedCapabilities, null);
            C8632dsu.c((Object) supportedCapabilities, "");
            this.e = i;
        }
    }
}
