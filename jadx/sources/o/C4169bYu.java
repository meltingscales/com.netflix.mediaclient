package o;

import android.annotation.SuppressLint;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.CLListTrackingInfoBase;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.service.pushnotification.Payload;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.Map;
import o.C1596aHd;
import o.C4169bYu;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.dpR;
import o.dqE;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.bYu  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4169bYu {
    private C5839cKg e = new C5839cKg();

    /* renamed from: o.bYu$e */
    /* loaded from: classes4.dex */
    public static abstract class e extends C9941zV {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        /* renamed from: o.bYu$e$e  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0106e extends e {
            private final InterfaceC5230buo a;
            private final InterfaceC5223buh c;

            public final InterfaceC5223buh a() {
                return this.c;
            }

            public final InterfaceC5230buo e() {
                return this.a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0106e(InterfaceC5230buo interfaceC5230buo, InterfaceC5223buh interfaceC5223buh) {
                super(null);
                C8632dsu.c((Object) interfaceC5230buo, "");
                C8632dsu.c((Object) interfaceC5223buh, "");
                this.a = interfaceC5230buo;
                this.c = interfaceC5223buh;
            }
        }

        private e() {
        }

        /* renamed from: o.bYu$e$c */
        /* loaded from: classes4.dex */
        public static final class c extends e {
            private final InterfaceC5230buo b;
            private final int d;
            private final InterfaceC5223buh e;

            public final int a() {
                return this.d;
            }

            public final InterfaceC5223buh b() {
                return this.e;
            }

            public final InterfaceC5230buo c() {
                return this.b;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(InterfaceC5230buo interfaceC5230buo, InterfaceC5223buh interfaceC5223buh, int i) {
                super(null);
                C8632dsu.c((Object) interfaceC5230buo, "");
                C8632dsu.c((Object) interfaceC5223buh, "");
                this.b = interfaceC5230buo;
                this.e = interfaceC5223buh;
                this.d = i;
            }
        }

        /* renamed from: o.bYu$e$a */
        /* loaded from: classes4.dex */
        public static final class a extends e {
            private final InterfaceC5223buh b;
            private final int c;
            private final InterfaceC5230buo e;

            public final int b() {
                return this.c;
            }

            public final InterfaceC5223buh c() {
                return this.b;
            }

            public final InterfaceC5230buo d() {
                return this.e;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC5230buo interfaceC5230buo, InterfaceC5223buh interfaceC5223buh, int i) {
                super(null);
                C8632dsu.c((Object) interfaceC5230buo, "");
                C8632dsu.c((Object) interfaceC5223buh, "");
                this.e = interfaceC5230buo;
                this.b = interfaceC5223buh;
                this.c = i;
            }
        }
    }

    @SuppressLint({"CheckResult"})
    public final void d(C9935zP c9935zP, final TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        this.e = new C5839cKg();
        SubscribersKt.subscribeBy$default(c9935zP.d(e.class), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.kids.character_details.KidsCharacterPresentation$registerForEvents$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                b(th);
                return dpR.c;
            }

            public final void b(Throwable th) {
                Map d;
                Map k;
                Throwable th2;
                C8632dsu.c((Object) th, "");
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd = new C1596aHd(null, th, null, true, k, false, false, 96, null);
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
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a = dVar.a();
                if (a != null) {
                    a.e(c1596aHd, th2);
                } else {
                    dVar.e().b(c1596aHd, th2);
                }
            }
        }, (drO) null, new drM<e, dpR>() { // from class: com.netflix.mediaclient.ui.kids.character_details.KidsCharacterPresentation$registerForEvents$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4169bYu.e eVar) {
                b(eVar);
                return dpR.c;
            }

            public final void b(C4169bYu.e eVar) {
                C8632dsu.c((Object) eVar, "");
                C4169bYu.this.d(eVar, trackingInfoHolder);
            }
        }, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(e eVar, TrackingInfoHolder trackingInfoHolder) {
        Map d;
        Map k;
        Throwable th;
        Map d2;
        Map k2;
        Throwable th2;
        if (eVar instanceof e.C0106e) {
            e.C0106e c0106e = (e.C0106e) eVar;
            TrackingInfoHolder b = b(c0106e.e());
            String id = c0106e.a().getId();
            C8632dsu.a(id, "");
            JSONObject jSONObject = new JSONObject();
            try {
                CLListTrackingInfoBase e2 = trackingInfoHolder.e();
                jSONObject.put(Payload.PARAM_RENO_REQUEST_ID, e2 != null ? e2.b() : null);
                jSONObject.put("trackId", trackingInfoHolder.a());
                jSONObject.put("row", 0);
                jSONObject.put("rank", 0);
                jSONObject.put(SignupConstants.Field.VIDEO_ID, Integer.parseInt(id, 10));
            } catch (NumberFormatException e3) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d2 = dqE.d();
                k2 = dqE.k(d2);
                C1596aHd c1596aHd = new C1596aHd("KidsCharacterPresentation: Invalid videoId " + id, e3, null, true, k2, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b2 = c1596aHd.b();
                    if (b2 != null) {
                        c1596aHd.a(errorType.c() + " " + b2);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th2 = new Throwable(c1596aHd.b());
                } else {
                    Throwable th3 = c1596aHd.i;
                    if (th3 == null) {
                        th2 = new Throwable("Handled exception with no message");
                    } else if (th3 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    } else {
                        th2 = th3;
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a = dVar.a();
                if (a != null) {
                    a.e(c1596aHd, th2);
                } else {
                    dVar.e().b(c1596aHd, th2);
                }
            } catch (JSONException e4) {
                InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd2 = new C1596aHd("KidsCharacterPresentation: Couldn't add tagTrackingInfo for videoId " + id + ".", e4, null, true, k, false, false, 96, null);
                ErrorType errorType2 = c1596aHd2.a;
                if (errorType2 != null) {
                    c1596aHd2.e.put("errorType", errorType2.c());
                    String b3 = c1596aHd2.b();
                    if (b3 != null) {
                        c1596aHd2.a(errorType2.c() + " " + b3);
                    }
                }
                if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                    th = new Throwable(c1596aHd2.b(), c1596aHd2.i);
                } else if (c1596aHd2.b() != null) {
                    th = new Throwable(c1596aHd2.b());
                } else {
                    Throwable th4 = c1596aHd2.i;
                    if (th4 == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th4 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    } else {
                        th = th4;
                    }
                }
                InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                InterfaceC1598aHf a2 = dVar2.a();
                if (a2 != null) {
                    a2.e(c1596aHd2, th);
                } else {
                    dVar2.e().b(c1596aHd2, th);
                }
            }
            CLv2Utils.b(false, AppView.characterDetails, b.c(jSONObject), null);
        } else if (eVar instanceof e.c) {
            C5839cKg c5839cKg = this.e;
            e.c cVar3 = (e.c) eVar;
            String id2 = cVar3.b().getId();
            C8632dsu.a(id2, "");
            c5839cKg.d(id2, AppView.boxArt, b(cVar3.c()).e(cVar3.b(), cVar3.a()));
        } else if (eVar instanceof e.a) {
            C5839cKg c5839cKg2 = this.e;
            e.a aVar = (e.a) eVar;
            String id3 = aVar.c().getId();
            C8632dsu.a(id3, "");
            c5839cKg2.d(id3, AppView.boxArt, b(aVar.d()).e(aVar.c(), aVar.b()));
        }
    }

    private final TrackingInfoHolder b(InterfaceC5230buo interfaceC5230buo) {
        TrackingInfoHolder trackingInfoHolder = new TrackingInfoHolder(PlayLocationType.CHARACTER_DP);
        InterfaceC5281bvm y = interfaceC5230buo.y();
        return y != null ? trackingInfoHolder.a(y) : trackingInfoHolder;
    }
}
