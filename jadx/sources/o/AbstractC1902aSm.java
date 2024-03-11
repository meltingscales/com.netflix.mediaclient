package o;

import android.content.Context;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.net.NetworkRequestType;
import com.netflix.mediaclient.servicemgr.NetflixDataRequest;
import java.util.List;
import java.util.Map;

/* renamed from: o.aSm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1902aSm<T> {
    protected NetflixDataRequest b;
    protected final Context c;
    protected NetflixDataRequest.Transport e;

    public NetflixDataRequest a() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b(T t);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract List<String> c();

    protected abstract NetflixDataRequest d();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract T e(String str, String str2);

    /* JADX INFO: Access modifiers changed from: protected */
    public String e() {
        return "get";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void e(Status status);

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean f() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean h() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean j() {
        return false;
    }

    public AbstractC1902aSm(Context context, NetflixDataRequest.Transport transport) {
        if (transport == null) {
            throw new IllegalArgumentException("Transport can not be null");
        }
        this.c = context;
        this.e = transport;
        this.b = d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object i() {
        return NetworkRequestType.FALKOR_REQUEST;
    }

    public Map<String, String> b() {
        return new C8190dfh();
    }
}
