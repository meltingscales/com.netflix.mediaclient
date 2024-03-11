package o;

import com.netflix.mediaclient.service.webclient.model.leafs.BreadcrumbLoggingSpecification;
import java.util.List;

/* loaded from: classes.dex */
public final class aOP {
    private final List<BreadcrumbLoggingSpecification> d;

    /* JADX WARN: Multi-variable type inference failed */
    public aOP(List<? extends BreadcrumbLoggingSpecification> list) {
        C8632dsu.c((Object) list, "");
        this.d = list;
    }

    public final BreadcrumbLoggingSpecification b(String str) {
        C8632dsu.c((Object) str, "");
        for (BreadcrumbLoggingSpecification breadcrumbLoggingSpecification : this.d) {
            if (C8632dsu.c((Object) str, (Object) breadcrumbLoggingSpecification.getImplementation())) {
                return breadcrumbLoggingSpecification;
            }
        }
        BreadcrumbLoggingSpecification breadcrumbLoggingSpecification2 = BreadcrumbLoggingSpecification.getDefault();
        C8632dsu.a(breadcrumbLoggingSpecification2, "");
        return breadcrumbLoggingSpecification2;
    }
}
