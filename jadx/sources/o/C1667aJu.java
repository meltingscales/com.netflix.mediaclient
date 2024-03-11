package o;

import com.netflix.cl.model.SummaryStatistics;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* renamed from: o.aJu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1667aJu {
    public static final e a = new e(null);
    private static final DecimalFormat c;
    private static final DecimalFormatSymbols e;
    private long b;
    private double d;
    private final String f;
    private final boolean g;
    private double h;
    private double i;
    private double j;

    public void c() {
        this.i = 0.0d;
        this.b = 0L;
        this.h = Double.MAX_VALUE;
        this.d = Double.MIN_VALUE;
    }

    public boolean d() {
        return this.b > 0;
    }

    public void e(double d) {
        if (d >= 0.0d) {
            this.b++;
            this.i += d;
            if (this.g) {
                this.j += d * d;
            }
            if (d < this.h) {
                this.h = d;
            }
            if (d > this.d) {
                this.d = d;
            }
        }
    }

    public C1667aJu(String str, boolean z) {
        C8632dsu.c((Object) str, "");
        this.f = str;
        this.g = z;
        this.h = Double.MAX_VALUE;
        this.d = Double.MIN_VALUE;
    }

    public /* synthetic */ C1667aJu(String str, boolean z, int i, C8627dsp c8627dsp) {
        this(str, (i & 2) != 0 ? false : z);
    }

    /* renamed from: o.aJu$e */
    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("PerformanceCaptureData");
        }
    }

    static {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        e = decimalFormatSymbols;
        c = new DecimalFormat("#.##", decimalFormatSymbols);
    }

    public final SummaryStatistics a() {
        if (d()) {
            double d = this.h;
            double d2 = this.d;
            return new SummaryStatistics(Double.valueOf(d), Double.valueOf(d2), this.g ? Long.valueOf((long) this.j) : null, Long.valueOf(this.b), Double.valueOf(this.i));
        }
        return null;
    }
}
