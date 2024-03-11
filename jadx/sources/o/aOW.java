package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ErrorLoggingSpecification;
import java.util.List;

/* loaded from: classes.dex */
public final class aOW {
    private final List<ErrorLoggingSpecification> d;

    /* JADX WARN: Multi-variable type inference failed */
    public aOW(List<? extends ErrorLoggingSpecification> list) {
        C8632dsu.c((Object) list, "");
        this.d = list;
    }

    public final ErrorLoggingSpecification c(String str) {
        C8632dsu.c((Object) str, "");
        for (ErrorLoggingSpecification errorLoggingSpecification : this.d) {
            if (C8632dsu.c((Object) str, (Object) errorLoggingSpecification.getImplementation())) {
                return errorLoggingSpecification;
            }
        }
        ErrorLoggingSpecification errorLoggingSpecification2 = ErrorLoggingSpecification.getDefault();
        C8632dsu.a(errorLoggingSpecification2, "");
        return errorLoggingSpecification2;
    }
}
