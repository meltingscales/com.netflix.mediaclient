package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState;
import com.netflix.mediaclient.servicemgr.interface_.offline.StopReason;
import com.netflix.mediaclient.storage.db.entity.DownloadablePersistentData;
import java.util.List;
import o.InterfaceC4525bgE;

/* renamed from: o.bbr  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4299bbr extends InterfaceC4297bbp {
    long A();

    long B();

    long C();

    boolean D();

    AbstractC4561bgo E();

    boolean F();

    boolean G();

    StopReason H();

    boolean I();

    List<DownloadablePersistentData> J();

    List<DownloadablePersistentData> K();

    List<DownloadablePersistentData> L();

    long M();

    long N();

    boolean O();

    boolean P();

    void Q();

    C4284bbc R();

    boolean S();

    void T();

    void U();

    void V();

    void W();

    void X();

    void a(long j);

    void a(Status status);

    void a(String str);

    void a(boolean z);

    void ab();

    void ac();

    void b(long j);

    void b(String str);

    void b(boolean z);

    void c(long j);

    void c(Status status);

    void c(String str);

    void c(boolean z);

    void d(long j);

    void d(StopReason stopReason);

    void d(String str);

    void d(boolean z);

    void e(long j);

    void e(String str);

    void e(InterfaceC4525bgE.c cVar);

    void e(boolean z);

    void f(String str);

    void i(boolean z);

    void j(boolean z);

    AbstractC4561bgo k();

    List<DownloadablePersistentData> l();

    void o();

    AbstractC4561bgo p();

    DownloadState q();

    String r();

    AbstractC4561bgo s();

    DownloadState t();

    String u();

    long v();

    int w();

    String x();

    Status y();

    long z();
}
