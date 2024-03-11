package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.ServiceManager;

/* renamed from: o.bsH  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5091bsH {
    void onManagerReady(ServiceManager serviceManager, Status status);

    default void onManagerUnavailable(ServiceManager serviceManager, Status status) {
    }
}
