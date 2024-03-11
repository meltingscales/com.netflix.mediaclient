package o;

import com.netflix.android.volley.Request;
import com.netflix.mediaclient.api.res.AssetType;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import io.reactivex.Completable;
import io.reactivex.Single;

/* renamed from: o.bpR  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC4942bpR extends InterfaceC4938bpN {
    Completable a(String str, AssetType assetType);

    boolean a(String str);

    Single<byte[]> b(String str, AssetType assetType);

    void b(String str, AssetType assetType, InterfaceC4943bpS interfaceC4943bpS);

    void c(String str, AssetType assetType, Request.Priority priority, InterfaceC4943bpS interfaceC4943bpS);

    ImageLoader e();
}
