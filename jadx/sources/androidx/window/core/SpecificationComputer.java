package androidx.window.core;

import o.C8627dsp;
import o.C8632dsu;
import o.drM;

/* loaded from: classes2.dex */
public abstract class SpecificationComputer<T> {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes2.dex */
    public enum VerificationMode {
        STRICT,
        LOG,
        QUIET
    }

    public abstract T compute();

    public abstract SpecificationComputer<T> require(String str, drM<? super T, Boolean> drm);

    /* JADX INFO: Access modifiers changed from: protected */
    public final String createMessage(Object obj, String str) {
        C8632dsu.c(obj, "");
        C8632dsu.c((Object) str, "");
        return str + " value: " + obj;
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ SpecificationComputer startSpecification$default(Companion companion, Object obj, String str, VerificationMode verificationMode, Logger logger, int i, Object obj2) {
            if ((i & 2) != 0) {
                verificationMode = BuildConfig.INSTANCE.getVerificationMode();
            }
            if ((i & 4) != 0) {
                logger = AndroidLogger.INSTANCE;
            }
            return companion.startSpecification(obj, str, verificationMode, logger);
        }

        public final <T> SpecificationComputer<T> startSpecification(T t, String str, VerificationMode verificationMode, Logger logger) {
            C8632dsu.c((Object) t, "");
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) verificationMode, "");
            C8632dsu.c((Object) logger, "");
            return new ValidSpecification(t, str, verificationMode, logger);
        }
    }
}
