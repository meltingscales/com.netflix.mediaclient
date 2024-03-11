package com.netflix.mediaclient.servicemgr;

/* loaded from: classes.dex */
public interface IVoip {

    /* loaded from: classes4.dex */
    public enum CallState {
        CONNECTING,
        CONNECTED,
        ENDED
    }

    /* loaded from: classes4.dex */
    public enum ConnectivityState {
        NO_CONNECTION,
        RED,
        YELLOW,
        GREEN
    }

    /* loaded from: classes4.dex */
    public interface b {
    }

    /* loaded from: classes4.dex */
    public interface d {
        void a(b bVar);

        void b(b bVar);

        void c(b bVar);

        void c(boolean z);

        void d(b bVar);

        void e(b bVar);
    }

    boolean A();

    void B();

    void D();

    void a(boolean z);

    boolean b(d dVar);

    long c();

    void d(double d2);

    void e(char c);

    void e(d dVar);

    void e(boolean z);

    boolean f();

    boolean g();

    boolean j();

    boolean u();

    boolean v();

    boolean w();

    boolean y();
}
