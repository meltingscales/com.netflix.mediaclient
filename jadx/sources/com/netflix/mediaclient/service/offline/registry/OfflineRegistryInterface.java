package com.netflix.mediaclient.service.offline.registry;

import com.netflix.mediaclient.service.offline.agent.CreateRequest;
import java.util.List;
import o.C4278bbW;
import o.C4281bbZ;
import o.InterfaceC4290bbi;
import o.InterfaceC4299bbr;
import o.InterfaceC5204buO;

/* loaded from: classes3.dex */
public interface OfflineRegistryInterface {

    /* loaded from: classes3.dex */
    public enum RegistryState {
        NOT_READY,
        SUCCESS,
        STORAGE_ERROR,
        SQL_DB_ERROR
    }

    int a();

    void a(List<InterfaceC4290bbi> list);

    boolean a(int i);

    int b();

    InterfaceC4299bbr b(CreateRequest createRequest, String str, String str2, String str3);

    void b(String str);

    void b(InterfaceC4299bbr interfaceC4299bbr);

    List<InterfaceC4299bbr> c();

    void c(List<InterfaceC4299bbr> list, boolean z);

    void c(InterfaceC4299bbr interfaceC4299bbr);

    String d();

    void d(InterfaceC4299bbr interfaceC4299bbr);

    void d(InterfaceC4299bbr interfaceC4299bbr, boolean z);

    RegistryState e(C4278bbW c4278bbW);

    void e(String str);

    void e(boolean z);

    boolean e();

    String f();

    int g();

    String h();

    List<InterfaceC4299bbr> i();

    List<C4281bbZ> j();

    boolean k();

    InterfaceC5204buO l();

    void m();

    RegistryState n();

    boolean o();

    void t();
}
