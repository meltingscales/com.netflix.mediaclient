package com.netflix.mediaclient.ui.offline.downloadedforyou;

import android.content.Context;
import android.content.Intent;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.ui.lolomo.LolomoRecyclerViewAdapter;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import java.util.Map;
import javax.inject.Inject;
import o.AbstractC9900yh;
import o.C1596aHd;
import o.C1729aMb;
import o.C7378cvA;
import o.C7397cvT;
import o.C8258dgw;
import o.C8632dsu;
import o.C9726vo;
import o.InterfaceC1597aHe;
import o.InterfaceC1601aHi;
import o.InterfaceC2023aX;
import o.InterfaceC6394ccV;
import o.InterfaceC7407cvd;
import o.InterfaceC8612dsa;
import o.cUH;
import o.dpD;
import o.dpR;
import o.dqE;

/* loaded from: classes4.dex */
public final class DownloadedForYouImpl implements InterfaceC7407cvd {
    private final C8258dgw b;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface DownloadedForYouModule {
        @Binds
        InterfaceC7407cvd e(DownloadedForYouImpl downloadedForYouImpl);
    }

    @Inject
    public DownloadedForYouImpl(C8258dgw c8258dgw) {
        C8632dsu.c((Object) c8258dgw, "");
        this.b = c8258dgw;
    }

    @Override // o.InterfaceC7407cvd
    public boolean b() {
        return this.b.j();
    }

    @Override // o.InterfaceC7407cvd
    public boolean a() {
        return C8258dgw.a.a();
    }

    @Override // o.InterfaceC7407cvd
    public Intent c(Context context) {
        C8632dsu.c((Object) context, "");
        return cUH.b.e(context);
    }

    @Override // o.InterfaceC7407cvd
    public AbstractC9900yh<?> e(Context context, C1729aMb c1729aMb, int i, LoMo loMo, RecyclerView.Adapter<?> adapter, Object obj, TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c1729aMb, "");
        C8632dsu.c((Object) loMo, "");
        C8632dsu.c((Object) adapter, "");
        C8632dsu.c(obj, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        if (!(adapter instanceof LolomoRecyclerViewAdapter)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        return new C7378cvA(context, loMo, (LolomoRecyclerViewAdapter) adapter, c1729aMb, i, (InterfaceC6394ccV) obj, trackingInfoHolder);
    }

    @Override // o.InterfaceC7407cvd
    public void b(final InterfaceC2023aX interfaceC2023aX, String str, Integer num, Integer num2, final String str2, final String str3) {
        Map i;
        Throwable th;
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        if (((dpR) C9726vo.d(str, num2, num, new InterfaceC8612dsa<String, Integer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.offline.downloadedforyou.DownloadedForYouImpl$addDownloadsForYouRowHeader$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ dpR invoke(String str4, Integer num3, Integer num4) {
                c(str4, num3.intValue(), num4.intValue());
                return dpR.c;
            }

            public final void c(String str4, int i2, int i3) {
                Map i4;
                Throwable th2;
                C8632dsu.c((Object) str4, "");
                if (str4.length() <= 0 || i2 <= 0 || i3 <= 0) {
                    InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
                    i4 = dqE.i(dpD.a("dfyRowListId", str2), dpD.a("dfyRowHeaderVideoId", str3), dpD.a("dfyRowHeaderAssetUrl", str4), dpD.a("dfyRowHeaderAssetWidth", String.valueOf(i2)), dpD.a("dfyRowHeaderAssetHeight", String.valueOf(i3)));
                    C1596aHd c1596aHd = new C1596aHd("Downloads For You row header billboard image asset data is invalid", null, null, false, i4, true, false, 78, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b = c1596aHd.b();
                        if (b != null) {
                            String c = errorType.c();
                            c1596aHd.a(c + " " + b);
                        }
                    }
                    if (c1596aHd.b() != null && c1596aHd.i != null) {
                        th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
                    } else if (c1596aHd.b() != null) {
                        th2 = new Throwable(c1596aHd.b());
                    } else {
                        th2 = c1596aHd.i;
                        if (th2 == null) {
                            th2 = new Throwable("Handled exception with no message");
                        } else if (th2 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                    InterfaceC1597aHe c2 = dVar2.c();
                    if (c2 != null) {
                        c2.d(c1596aHd, th2);
                        return;
                    } else {
                        dVar2.e().b(c1596aHd, th2);
                        return;
                    }
                }
                InterfaceC2023aX interfaceC2023aX2 = InterfaceC2023aX.this;
                C7397cvT c7397cvT = new C7397cvT();
                c7397cvT.d((CharSequence) "downloads-for-you-row-header");
                c7397cvT.d(new InterfaceC7407cvd.d(str4, i2, i3));
                interfaceC2023aX2.add(c7397cvT);
            }
        })) == null) {
            InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
            i = dqE.i(dpD.a("dfyRowListId", str2), dpD.a("dfyRowHeaderVideoId", str3), dpD.a("dfyRowHeaderAssetUrl", String.valueOf(str)), dpD.a("dfyRowHeaderAssetWidth", String.valueOf(num)), dpD.a("dfyRowHeaderAssetHeight", String.valueOf(num2)));
            C1596aHd c1596aHd = new C1596aHd("Downloads For You row header billboard image asset data is empty", null, null, false, i, true, false, 78, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1597aHe c2 = dVar2.c();
            if (c2 != null) {
                c2.d(c1596aHd, th);
            } else {
                dVar2.e().b(c1596aHd, th);
            }
        }
    }
}
