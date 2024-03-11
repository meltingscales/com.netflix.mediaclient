package androidx.window.core;

import androidx.window.core.SpecificationComputer;
import o.C8632dsu;
import o.drM;

/* loaded from: classes2.dex */
final class ValidSpecification<T> extends SpecificationComputer<T> {
    private final Logger logger;
    private final String tag;
    private final T value;
    private final SpecificationComputer.VerificationMode verificationMode;

    @Override // androidx.window.core.SpecificationComputer
    public T compute() {
        return this.value;
    }

    public ValidSpecification(T t, String str, SpecificationComputer.VerificationMode verificationMode, Logger logger) {
        C8632dsu.c((Object) t, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) verificationMode, "");
        C8632dsu.c((Object) logger, "");
        this.value = t;
        this.tag = str;
        this.verificationMode = verificationMode;
        this.logger = logger;
    }

    @Override // androidx.window.core.SpecificationComputer
    public SpecificationComputer<T> require(String str, drM<? super T, Boolean> drm) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) drm, "");
        return drm.invoke((T) this.value).booleanValue() ? this : new FailedSpecification(this.value, this.tag, str, this.logger, this.verificationMode);
    }
}
