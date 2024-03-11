package com.netflix.mediaclient.servicemgr;

import com.netflix.android.volley.VolleyError;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import java.util.List;
import o.C5165btc;
import o.C8259dgx;
import o.C8261dgz;

/* loaded from: classes.dex */
public interface InteractiveTrackerInterface {

    /* loaded from: classes4.dex */
    public enum Reason {
        success,
        canceled,
        failed
    }

    /* loaded from: classes.dex */
    public interface c {
        void c(Reason reason, String str, List<C5165btc> list);
    }

    String a();

    void a(c cVar);

    void b(C8261dgz c8261dgz, ImageLoader.a aVar, boolean z);

    void c(String str);

    void e();

    void e(C8261dgz c8261dgz, C8259dgx c8259dgx, ImageLoader.AssetLocationType assetLocationType, VolleyError volleyError);
}
