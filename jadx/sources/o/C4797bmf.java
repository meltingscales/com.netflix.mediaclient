package o;

import android.content.Context;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.cache.CacheDataSource;
import com.netflix.ale.AleCryptoBouncyCastle;

/* renamed from: o.bmf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4797bmf implements DataSource.Factory {
    private final InterfaceC4665bim a;
    private final InterfaceC4662bij b;
    private final C4653bia c;
    private final Context d;
    private final InterfaceC4793bmb e;
    private final C4761blb f;
    private final InterfaceC4834bnP j;

    public C4797bmf(Context context, InterfaceC4662bij interfaceC4662bij, InterfaceC4834bnP interfaceC4834bnP, InterfaceC4793bmb interfaceC4793bmb, C4653bia c4653bia, InterfaceC4665bim interfaceC4665bim, C4761blb c4761blb) {
        this.d = context;
        this.b = interfaceC4662bij;
        this.j = interfaceC4834bnP;
        this.e = interfaceC4793bmb;
        this.c = c4653bia;
        this.a = interfaceC4665bim;
        this.f = c4761blb;
    }

    @Override // androidx.media3.datasource.DataSource.Factory
    public DataSource createDataSource() {
        InterfaceC4800bmi c = this.e.c(this.j, this.b, this.c);
        C4677biy d = C4628biB.d(this.d);
        CacheDataSource cacheDataSource = new CacheDataSource(d, c, new FileDataSource(), new C4633biG(d, AleCryptoBouncyCastle.MAX_RANDOM_BYTES), 7, null);
        for (C4677biy c4677biy : this.a.c()) {
            cacheDataSource = new CacheDataSource(c4677biy, cacheDataSource, new FileDataSource(), new C4633biG(c4677biy, c4677biy.b()), 6, null);
        }
        return new C4792bma(this.b, new DefaultDataSource(this.d, cacheDataSource), this.f);
    }
}
