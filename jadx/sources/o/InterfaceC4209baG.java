package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.interface_.offline.StopReason;
import java.util.List;

/* renamed from: o.baG  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC4209baG {
    void a(InterfaceC5206buQ interfaceC5206buQ);

    void b(Status status);

    void b(String str);

    void b(String str, Status status);

    void b(String str, Status status, boolean z);

    void b(InterfaceC5206buQ interfaceC5206buQ);

    void c(List<String> list, Status status);

    void c(InterfaceC5206buQ interfaceC5206buQ, int i);

    boolean c();

    void d(Status status);

    void d(InterfaceC5206buQ interfaceC5206buQ, Status status);

    void d(InterfaceC5206buQ interfaceC5206buQ, StopReason stopReason);

    void e(InterfaceC5206buQ interfaceC5206buQ, Status status);

    void e(boolean z);
}
