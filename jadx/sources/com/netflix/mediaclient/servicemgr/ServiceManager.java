package com.netflix.mediaclient.servicemgr;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.res.AssetType;
import com.netflix.mediaclient.service.job.NetflixJob;
import com.netflix.mediaclient.service.job.NetflixJobExecutor;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import com.netflix.mediaclient.util.DeviceCategory;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.List;
import o.InterfaceC1843aQh;
import o.InterfaceC1898aSi;
import o.InterfaceC4208baF;
import o.InterfaceC4251baw;
import o.InterfaceC5091bsH;
import o.InterfaceC5094bsK;
import o.InterfaceC5107bsX;
import o.InterfaceC5109bsZ;
import o.InterfaceC5125bsp;
import o.InterfaceC5128bss;
import o.InterfaceC5131bsv;
import o.InterfaceC5283bvo;
import o.InterfaceC5284bvp;
import o.aMU;
import o.aOV;
import o.aSE;

/* loaded from: classes.dex */
public interface ServiceManager {

    /* loaded from: classes.dex */
    public enum InitializationState {
        NOT_INITIALIZED,
        INITIALIZED_SUCCESSFULLY,
        INITIALIZATION_FAILED,
        RELEASED,
        UNBOUND
    }

    /* loaded from: classes.dex */
    public interface b {
        InitializationState e();
    }

    boolean A();

    InterfaceC1898aSi B();

    boolean C();

    boolean D();

    boolean E();

    boolean F();

    void G();

    boolean H();

    void I();

    aOV J();

    Single<Status> K();

    UserAgent L();

    void M();

    void N();

    Observable<Status> Q();

    void S();

    NetflixJobExecutor a(NetflixJob.NetflixJobId netflixJobId);

    void a(Intent intent);

    void a(String str, Long l);

    void a(String str, String str2);

    void a(String str, String str2, Boolean bool, String str3, Integer num, String str4, List<String> list, Boolean bool2, Boolean bool3, InterfaceC5094bsK interfaceC5094bsK);

    void a(String str, String str2, String str3, String str4, Boolean bool, InterfaceC5094bsK interfaceC5094bsK);

    void a(String str, InterfaceC5284bvp interfaceC5284bvp, InterfaceC5094bsK interfaceC5094bsK);

    void a(String str, boolean z, String str2, Integer num, InterfaceC5094bsK interfaceC5094bsK);

    void a(InterfaceC5094bsK interfaceC5094bsK);

    void a(boolean z, String str, String str2);

    void b();

    void b(String str, InterfaceC5094bsK interfaceC5094bsK);

    void c(String str);

    void c(String str, InterfaceC5094bsK interfaceC5094bsK);

    void c(InterfaceC5091bsH interfaceC5091bsH);

    boolean c();

    boolean c(String str, AssetType assetType, InterfaceC5094bsK interfaceC5094bsK);

    void d(String str, InterfaceC5094bsK interfaceC5094bsK);

    void d(String str, boolean z);

    void d(InterfaceC5094bsK interfaceC5094bsK);

    void d(boolean z);

    List<? extends InterfaceC5283bvo> e();

    void e(int i, String str, String str2, Boolean bool, InterfaceC5094bsK interfaceC5094bsK);

    void e(String str);

    void e(boolean z);

    void e(boolean z, String str);

    boolean e(InterfaceC5094bsK interfaceC5094bsK);

    Context f();

    aOV g();

    IClientLogging h();

    DeviceCategory i();

    InterfaceC5125bsp j();

    InterfaceC1843aQh k();

    ImageLoader l();

    aSE m();

    InterfaceC5128bss n();

    List<InterfaceC5283bvo> o();

    InterfaceC4251baw p();

    InterfaceC5131bsv q();

    aMU r();

    InterfaceC5109bsZ s();

    InterfaceC4208baF t();

    UserAgent u();

    String v();

    String w();

    UmaAlert x();

    IVoip y();

    boolean z();

    static ServiceManager c(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return null;
        }
        if (!(activity instanceof InterfaceC5107bsX)) {
            throw new IllegalStateException();
        }
        ServiceManager serviceManager = ((InterfaceC5107bsX) activity).getServiceManager();
        if (serviceManager.c()) {
            return serviceManager;
        }
        return null;
    }
}
