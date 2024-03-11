package o;

import android.content.Context;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultDataSource;

/* renamed from: o.bmg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4798bmg implements InterfaceC4793bmb {
    public static final b d = new b(null);
    private final Context b;

    public C4798bmg(Context context) {
        C8632dsu.c((Object) context, "");
        this.b = context;
    }

    @Override // o.InterfaceC4793bmb
    public InterfaceC4800bmi c(InterfaceC4834bnP interfaceC4834bnP, InterfaceC4795bmd interfaceC4795bmd, C4653bia c4653bia) {
        C8632dsu.c((Object) c4653bia, "");
        DataSource createDataSource = new C4802bmk(this.b, interfaceC4834bnP, interfaceC4795bmd, c4653bia).createDataSource();
        C8632dsu.d(createDataSource);
        return (InterfaceC4800bmi) createDataSource;
    }

    @Override // o.InterfaceC4793bmb
    public InterfaceC4796bme d() {
        return new C4802bmk(this.b, null, null, null, 14, null).e();
    }

    @Override // o.InterfaceC4793bmb
    public DataSource e(DataSource dataSource) {
        C8632dsu.c((Object) dataSource, "");
        return new DefaultDataSource(this.b, dataSource);
    }

    /* renamed from: o.bmg$b */
    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("NetworkStackFactory");
        }
    }
}
