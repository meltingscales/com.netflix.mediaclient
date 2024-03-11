package o;

import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.res.AssetType;
import com.netflix.mediaclient.service.job.NetflixJob;
import com.netflix.mediaclient.service.job.NetflixJobExecutor;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.IVoip;
import com.netflix.mediaclient.util.DeviceCategory;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.List;

/* renamed from: o.bsu  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5130bsu extends InterfaceC5098bsO, TQ {
    IVoip A();

    InterfaceC1898aSi B();

    boolean C();

    UmaAlert D();

    boolean E();

    boolean F();

    void G();

    void H();

    boolean I();

    Single<Status> J();

    Observable<Status> L();

    void N();

    void a(String str, int i, int i2);

    void a(String str, Long l);

    void b(int i, int i2, String str, String str2, String str3, String str4, Boolean bool);

    void b(String str, InterfaceC5284bvp interfaceC5284bvp, int i, int i2);

    void b(InterfaceC5133bsx interfaceC5133bsx);

    void b(boolean z);

    void c(int i, int i2);

    void c(int i, String str, String str2, Boolean bool, int i2, int i3);

    void c(String str, String str2, Boolean bool, String str3, Integer num, String str4, List<String> list, Boolean bool2, Boolean bool3, int i, int i2);

    NetflixJobExecutor d(NetflixJob.NetflixJobId netflixJobId);

    void d(int i, int i2);

    void d(String str);

    void d(String str, int i, int i2);

    void d(String str, boolean z, String str2, Integer num, int i, int i2);

    void d(boolean z, String str, String str2);

    void e(int i, int i2);

    void e(int i, int i2, String str);

    void e(Intent intent);

    void e(String str, AssetType assetType, int i, int i2);

    void e(String str, String str2);

    void e(InterfaceC5133bsx interfaceC5133bsx);

    List<? extends InterfaceC5283bvo> f();

    InterfaceC5127bsr g();

    Context getApplicationContext();

    void j();

    DeviceCategory k();

    InterfaceC1843aQh l();

    InterfaceC5128bss m();

    aOV n();

    IClientLogging o();

    aSE p();

    InterfaceC4208baF q();

    ImageLoader r();

    aMU s();

    InterfaceC5131bsv t();

    String u();

    UserAgent v();

    String w();

    InterfaceC5109bsZ y();
}
