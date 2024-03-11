package o;

import android.content.Context;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import java.util.Map;

/* loaded from: classes4.dex */
public interface bRZ extends InterfaceC1077Nv {
    void G();

    void a(int i, int i2, String str);

    void a(Context context, Map<String, String> map);

    void a(boolean z);

    void aa_();

    InterfaceC6373ccA ab_();

    boolean ac_();

    void ad_();

    boolean ae_();

    InterfaceC5155btS ag_();

    boolean o();

    void onManagerReady(ServiceManager serviceManager, Status status);

    void onManagerUnavailable(ServiceManager serviceManager, Status status);
}
