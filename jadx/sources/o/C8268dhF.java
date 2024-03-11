package o;

import com.netflix.cl.NetflixAppPlatform$NetflixAppPlatformImpl;
import com.netflix.cl.Platform;
import com.netflix.cl.model.LoggingSchema;
import com.netflix.cl.model.LoggingSource;
import com.netflix.mediaclient.NetflixApplication;

/* renamed from: o.dhF  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8268dhF implements NetflixAppPlatform$NetflixAppPlatformImpl {
    private NetflixApplication e;
    private Platform.LocalLogger c = new Platform.LocalLogger() { // from class: o.dhF.5
        @Override // com.netflix.cl.Platform.LocalLogger
        public boolean isDebug() {
            return false;
        }

        @Override // com.netflix.cl.Platform.LocalLogger
        public void debug(String str) {
            C1044Mm.e("nf_log_clv2", str);
        }

        @Override // com.netflix.cl.Platform.LocalLogger
        public void debug(String str, Object... objArr) {
            C1044Mm.a("nf_log_clv2", str, objArr);
        }

        @Override // com.netflix.cl.Platform.LocalLogger
        public void error(String str) {
            C1044Mm.d("nf_log_clv2", str);
        }

        @Override // com.netflix.cl.Platform.LocalLogger
        public void error(String str, Object... objArr) {
            C1044Mm.e("nf_log_clv2", str, objArr);
        }
    };
    private Platform.ErrorReporter a = new Platform.ErrorReporter() { // from class: o.dhF.1
        @Override // com.netflix.cl.Platform.ErrorReporter
        public void logHandledException(String str) {
            InterfaceC1598aHf.a(str);
        }

        @Override // com.netflix.cl.Platform.ErrorReporter
        public void logHandledException(String str, Throwable th) {
            InterfaceC1598aHf.e(str, th);
        }
    };

    @Override // com.netflix.cl.Platform.PlatformImpl
    public Platform.ErrorReporter getErrorReporter() {
        return this.a;
    }

    @Override // com.netflix.cl.Platform.PlatformImpl
    public Platform.LocalLogger getLocalLogger() {
        return this.c;
    }

    @Override // com.netflix.cl.Platform.PlatformImpl
    public String getSchemaVersion() {
        return "4.0.4-1.540.0";
    }

    public C8268dhF(NetflixApplication netflixApplication) {
        if (netflixApplication == null) {
            throw new IllegalArgumentException("App can not be null!");
        }
        this.e = netflixApplication;
    }

    @Override // com.netflix.cl.Platform.PlatformImpl
    public long getCurrentTimeInMs() {
        return C8150deu.b();
    }

    @Override // com.netflix.cl.Platform.PlatformImpl
    public LoggingSource getLoggingSource() {
        return LoggingSource.android;
    }

    @Override // com.netflix.cl.Platform.PlatformImpl
    public LoggingSchema getLoggingSchema() {
        return LoggingSchema.netflixApp;
    }

    @Override // com.netflix.cl.Platform.PlatformImpl
    public void reInit() {
        this.e.H();
    }
}
