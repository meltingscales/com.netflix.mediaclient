package com.netflix.mediaclient.service.api.diagnostics;

import java.util.List;
import o.aMJ;

/* loaded from: classes.dex */
public interface IDiagnosis {

    /* loaded from: classes3.dex */
    public enum UrlStatus {
        NOT_TESTED,
        TEST_ONGOING,
        COMPLETED
    }

    /* loaded from: classes3.dex */
    public interface a {
        void a();

        void c();
    }

    void b();

    void c();

    void c(a aVar);

    void d();

    List<aMJ> e();
}
