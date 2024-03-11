package o;

import android.os.SystemClock;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.net.probe.ProbeConfigResponse;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bac  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4231bac {
    private transient long a;
    @SerializedName("probe_end_ts")
    private long b;
    public final transient InterfaceC4229baa c;
    @SerializedName("name")
    private String d;
    private transient boolean e;
    @SerializedName(NotificationFactory.DATA)
    private List<C4235bag> f;
    @SerializedName("probe_start_ts")
    private long i;
    @SerializedName(SignupConstants.Field.URL)
    private String j;

    public void a() {
        this.e = false;
    }

    public boolean b() {
        return this.e;
    }

    protected C4231bac() {
        this.f = new ArrayList();
        this.i = System.currentTimeMillis();
        this.a = SystemClock.elapsedRealtime();
        this.c = null;
    }

    public C4231bac(ProbeConfigResponse.b bVar, InterfaceC4229baa interfaceC4229baa) {
        this.f = new ArrayList();
        this.i = System.currentTimeMillis();
        this.a = SystemClock.elapsedRealtime();
        this.d = bVar.c();
        this.j = bVar.a();
        this.c = interfaceC4229baa;
    }

    public void a(String str, C4235bag c4235bag) {
        if (this.e) {
            return;
        }
        c4235bag.d(str);
        this.f.add(c4235bag);
        this.e = true;
        this.b = (this.i + SystemClock.elapsedRealtime()) - this.a;
    }

    public void e() {
        if (d() == 0) {
            this.i = System.currentTimeMillis();
            this.a = SystemClock.elapsedRealtime();
        }
    }

    public int d() {
        return this.f.size();
    }
}
