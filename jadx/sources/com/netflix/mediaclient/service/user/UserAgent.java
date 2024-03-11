package com.netflix.mediaclient.service.user;

import com.netflix.cl.model.SignOutReason;
import com.netflix.mediaclient.android.app.Status;
import java.util.List;
import o.C1569aGd;
import o.C5007bqd;
import o.InterfaceC5018bqo;
import o.InterfaceC5034brD;
import o.InterfaceC5093bsJ;
import o.InterfaceC5282bvn;
import o.InterfaceC5283bvo;
import o.InterfaceC5284bvp;

/* loaded from: classes.dex */
public interface UserAgent {

    /* loaded from: classes.dex */
    public enum PinType {
        MATURITY_PIN,
        PREVIEW_CONTENT_PIN
    }

    /* loaded from: classes.dex */
    public interface b {
        void d(boolean z);
    }

    /* loaded from: classes.dex */
    public interface c {
        void c(Status status);
    }

    void B();

    String a();

    void a(SignOutReason signOutReason);

    void a(b bVar);

    void a(String str);

    void a(String str, Integer num, Boolean bool, InterfaceC5018bqo interfaceC5018bqo);

    void a(InterfaceC5018bqo interfaceC5018bqo);

    List<? extends InterfaceC5283bvo> b();

    InterfaceC5283bvo b(String str);

    void b(String str, PinType pinType, String str2, InterfaceC5018bqo interfaceC5018bqo);

    void b(InterfaceC5018bqo interfaceC5018bqo);

    InterfaceC5034brD c(String str);

    void c(long j, InterfaceC5018bqo interfaceC5018bqo);

    void c(SignOutReason signOutReason, InterfaceC5018bqo interfaceC5018bqo);

    void c(List<String> list, InterfaceC5018bqo interfaceC5018bqo);

    void c(C5007bqd c5007bqd, InterfaceC5018bqo interfaceC5018bqo);

    void c(InterfaceC5018bqo interfaceC5018bqo);

    boolean c();

    boolean c(InterfaceC5283bvo interfaceC5283bvo);

    String d();

    void d(String str);

    void d(C1569aGd c1569aGd, InterfaceC5018bqo interfaceC5018bqo);

    void d(InterfaceC5018bqo interfaceC5018bqo);

    void d(boolean z, c cVar);

    String e();

    InterfaceC5093bsJ e(String str);

    void e(SignOutReason signOutReason, boolean z);

    void e(String str, InterfaceC5018bqo interfaceC5018bqo);

    void e(InterfaceC5018bqo interfaceC5018bqo);

    InterfaceC5093bsJ f();

    String g();

    String h();

    InterfaceC5282bvn i();

    InterfaceC5283bvo j();

    void j(String str);

    void j(InterfaceC5018bqo interfaceC5018bqo);

    InterfaceC5284bvp k();

    InterfaceC5034brD l();

    InterfaceC5283bvo m();

    String n();

    String o();

    boolean p();

    boolean q();

    boolean r();

    InterfaceC5284bvp s();

    Boolean t();

    boolean u();

    boolean v();

    boolean w();

    void x();

    void y();

    default void d(c cVar) {
        d(false, cVar);
    }
}
