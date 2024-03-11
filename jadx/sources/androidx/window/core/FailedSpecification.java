package androidx.window.core;

import androidx.window.core.SpecificationComputer;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import o.C8563dqf;
import o.C8632dsu;
import o.drM;

/* loaded from: classes2.dex */
final class FailedSpecification<T> extends SpecificationComputer<T> {
    private final WindowStrictModeException exception;
    private final Logger logger;
    private final String message;
    private final String tag;
    private final T value;
    private final SpecificationComputer.VerificationMode verificationMode;

    /* loaded from: classes2.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SpecificationComputer.VerificationMode.values().length];
            iArr[SpecificationComputer.VerificationMode.STRICT.ordinal()] = 1;
            iArr[SpecificationComputer.VerificationMode.LOG.ordinal()] = 2;
            iArr[SpecificationComputer.VerificationMode.QUIET.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // androidx.window.core.SpecificationComputer
    public SpecificationComputer<T> require(String str, drM<? super T, Boolean> drm) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) drm, "");
        return this;
    }

    public FailedSpecification(T t, String str, String str2, Logger logger, SpecificationComputer.VerificationMode verificationMode) {
        List e;
        C8632dsu.c((Object) t, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) logger, "");
        C8632dsu.c((Object) verificationMode, "");
        this.value = t;
        this.tag = str;
        this.message = str2;
        this.logger = logger;
        this.verificationMode = verificationMode;
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(createMessage(t, str2));
        StackTraceElement[] stackTrace = windowStrictModeException.getStackTrace();
        C8632dsu.a(stackTrace, "");
        e = C8563dqf.e(stackTrace, 2);
        Object[] array = e.toArray(new StackTraceElement[0]);
        if (array != null) {
            windowStrictModeException.setStackTrace((StackTraceElement[]) array);
            this.exception = windowStrictModeException;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Override // androidx.window.core.SpecificationComputer
    public T compute() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.verificationMode.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.logger.debug(this.tag, createMessage(this.value, this.message));
                return null;
            } else if (i == 3) {
                return null;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        throw this.exception;
    }
}
