package o;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.lang.ref.WeakReference;
import java.util.Map;
import o.AbstractC6184cWz;
import o.C8632dsu;
import o.C9737vz;
import o.C9935zP;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.cVS;
import o.cVT;
import o.cVV;
import o.dpR;

/* loaded from: classes6.dex */
public final class cVV implements cVS.c {
    public static final c a = new c(null);
    private final WeakReference<NetflixActivity> b;
    public cVS.d c;
    private cVT d;
    private boolean e;
    private WeakReference<cVT> f;

    public final void a(cVS.d dVar) {
        C8632dsu.c((Object) dVar, "");
        this.c = dVar;
    }

    public cVV(NetflixActivity netflixActivity, cVT cvt) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) cvt, "");
        this.d = cvt;
        this.b = new WeakReference<>(netflixActivity);
    }

    /* loaded from: classes6.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("TvDiscoveryClientImpl");
        }
    }

    @Override // o.cVS.c
    public boolean c(final String str, final int i) {
        C8632dsu.c((Object) str, "");
        C8166dfJ.e("TvDiscovery.Client must be called from main thread", true);
        return e(new drX<cVT, NetflixActivity, dpR>() { // from class: com.netflix.mediaclient.ui.tvconnect.impl.discovery.TvDiscoveryClientImpl$requestSetDeviceStatus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(cVT cvt, NetflixActivity netflixActivity) {
                b(cvt, netflixActivity);
                return dpR.c;
            }

            public final void b(cVT cvt, NetflixActivity netflixActivity) {
                C8632dsu.c((Object) cvt, "");
                C8632dsu.c((Object) netflixActivity, "");
                C9935zP.b bVar = C9935zP.b;
                LifecycleOwner viewLifecycleOwner = cvt.getViewLifecycleOwner();
                C8632dsu.a(viewLifecycleOwner, "");
                bVar.d(viewLifecycleOwner).b(AbstractC6184cWz.class, new AbstractC6184cWz.c(str, i));
            }
        });
    }

    @Override // o.cVS.c
    public boolean b() {
        C8166dfJ.e("TvDiscovery.Client must be called from main thread", true);
        return e(new drX<cVT, NetflixActivity, dpR>() { // from class: com.netflix.mediaclient.ui.tvconnect.impl.discovery.TvDiscoveryClientImpl$requestComplete$1
            @Override // o.drX
            public /* synthetic */ dpR invoke(cVT cvt, NetflixActivity netflixActivity) {
                c(cvt, netflixActivity);
                return dpR.c;
            }

            public final void c(cVT cvt, NetflixActivity netflixActivity) {
                C8632dsu.c((Object) cvt, "");
                C8632dsu.c((Object) netflixActivity, "");
                C9935zP.b bVar = C9935zP.b;
                LifecycleOwner viewLifecycleOwner = cvt.getViewLifecycleOwner();
                C8632dsu.a(viewLifecycleOwner, "");
                bVar.d(viewLifecycleOwner).b(AbstractC6184cWz.class, AbstractC6184cWz.b.d);
            }
        });
    }

    private final boolean e(final drX<? super cVT, ? super NetflixActivity, dpR> drx) {
        if (this.d == null) {
            WeakReference<cVT> weakReference = this.f;
            if (weakReference != null) {
                cVT cvt = weakReference.get();
                WeakReference<cVT> weakReference2 = this.f;
                if (weakReference2 != null) {
                    cVT cvt2 = weakReference2.get();
                    Boolean bool = (Boolean) C9726vo.d(cvt, cvt2 != null ? cvt2.getNetflixActivity() : null, new drX<cVT, NetflixActivity, Boolean>() { // from class: com.netflix.mediaclient.ui.tvconnect.impl.discovery.TvDiscoveryClientImpl$runIfFragmentIsAlive$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // o.drX
                        /* renamed from: c */
                        public final Boolean invoke(cVT cvt3, NetflixActivity netflixActivity) {
                            boolean z;
                            C8632dsu.c((Object) cvt3, "");
                            C8632dsu.c((Object) netflixActivity, "");
                            if (cvt3.isAdded() && !C9737vz.a(netflixActivity)) {
                                drx.invoke(cvt3, netflixActivity);
                                z = true;
                            } else {
                                cVV.a.getLogTag();
                                this.c(netflixActivity);
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        }
                    });
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    a.getLogTag();
                    WeakReference<cVT> weakReference3 = this.f;
                    if (weakReference3 != null) {
                        cVT cvt3 = weakReference3.get();
                        c(cvt3 != null ? cvt3.getNetflixActivity() : null);
                        return false;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalStateException("At this poment fragmentCandidate should have been set to null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(Context context) {
        Map d;
        Map k;
        Throwable th;
        if (this.e) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("TvDiscoveryClient should have been discarded", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b);
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
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
        this.e = true;
    }
}
