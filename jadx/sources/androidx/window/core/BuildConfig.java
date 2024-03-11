package androidx.window.core;

import androidx.window.core.SpecificationComputer;

/* loaded from: classes2.dex */
public final class BuildConfig {
    public static final BuildConfig INSTANCE = new BuildConfig();
    private static final SpecificationComputer.VerificationMode verificationMode = SpecificationComputer.VerificationMode.QUIET;

    public final SpecificationComputer.VerificationMode getVerificationMode() {
        return verificationMode;
    }

    private BuildConfig() {
    }
}
