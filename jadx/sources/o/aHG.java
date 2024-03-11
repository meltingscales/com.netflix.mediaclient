package o;

import android.content.Context;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import o.C1620aIa;
import org.chromium.net.ExperimentalCronetEngine;

/* loaded from: classes3.dex */
public class aHG {
    private final ExperimentalCronetEngine.Builder d;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes3.dex */
    public interface d {
        XS ag();
    }

    public aHG(Context context) {
        aHE ahe = new aHE(context);
        if (((d) EntryPointAccessors.fromApplication(context, d.class)).ag().e()) {
            this.d = new C1620aIa.c(ahe);
        } else {
            this.d = new ExperimentalCronetEngine.Builder(ahe);
        }
        this.d.enableHttp2(true).enableQuic(false);
        if (TS.c.b(context).d()) {
            this.d.enableBrotli(true);
        }
    }

    public aHG e(boolean z) {
        this.d.enableHttp2(z);
        return this;
    }

    public aHG c(boolean z) {
        this.d.enableNetworkQualityEstimator(z);
        return this;
    }

    public aHG c(String str) {
        this.d.setStoragePath(str);
        return this;
    }

    public aHG c(int i, int i2) {
        this.d.enableHttpCache(i, i2);
        return this;
    }

    public ExperimentalCronetEngine e() {
        try {
            return this.d.build();
        } catch (UnsatisfiedLinkError e) {
            InterfaceC1597aHe.c("SPY-35111 - UnsatisfiedLinkError for play services cronet", e);
            throw e;
        } catch (Throwable th) {
            InterfaceC1597aHe.c("SPY-35111 - Other error for play services cronet", th);
            throw th;
        }
    }
}
