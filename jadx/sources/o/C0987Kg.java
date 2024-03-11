package o;

import android.content.Context;
import com.netflix.falkor.task.GraphQLListActions$addGameToMyList$1;
import com.netflix.falkor.task.GraphQLListActions$addVideoToMyList$1;
import com.netflix.falkor.task.GraphQLListActions$addVideoToRemindMe$1;
import com.netflix.falkor.task.GraphQLListActions$getExceptionHandler$1$1;
import com.netflix.falkor.task.GraphQLListActions$onListStatusChanged$1;
import com.netflix.falkor.task.GraphQLListActions$removeGameFromMyList$1;
import com.netflix.falkor.task.GraphQLListActions$removeVideoFromMyList$1;
import com.netflix.falkor.task.GraphQLListActions$removeVideoFromRemindMe$1;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.graphqlrepo.api.kotlinx.NetflixGraphQLException;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Pair;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.Kg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0987Kg {
    public static final d e = new d(null);
    private final dwU a;
    private final Context b;
    private final aCG c;
    private final dwQ d;
    private final dwQ f;

    @EntryPoint
    @InstallIn({aFU.class})
    /* renamed from: o.Kg$c */
    /* loaded from: classes3.dex */
    public interface c {
        C0987Kg b();
    }

    /* renamed from: o.Kg$b */
    /* loaded from: classes3.dex */
    public static final class b extends dqT implements CoroutineExceptionHandler {
        final /* synthetic */ drM b;
        final /* synthetic */ String c;
        final /* synthetic */ C0987Kg d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CoroutineExceptionHandler.c cVar, String str, C0987Kg c0987Kg, drM drm) {
            super(cVar);
            this.c = str;
            this.d = c0987Kg;
            this.b = drm;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(dqZ dqz, Throwable th) {
            Map<String, String> d;
            Map k;
            Throwable th2;
            if (!aCP.c(th) && !aCP.a(th)) {
                if (th instanceof NetflixGraphQLException) {
                    d = ((NetflixGraphQLException) th).a();
                    if (d == null) {
                        d = dqE.d();
                    }
                } else {
                    d = dqE.d();
                }
                k = dqE.k(d);
                k.put("gql.listactions.entityId", this.c);
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                C1596aHd c1596aHd = new C1596aHd("Error in GraphQLListActions", th, ErrorType.l, false, k, false, false, 96, null);
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
            C8737dwr.c(this.d.a, this.d.f, null, new GraphQLListActions$getExceptionHandler$1$1(this.b, th, null), 2, null);
        }
    }

    @Inject
    public C0987Kg(@ApplicationContext Context context, dwU dwu, dwQ dwq, dwQ dwq2, aCG acg) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) dwu, "");
        C8632dsu.c((Object) dwq, "");
        C8632dsu.c((Object) dwq2, "");
        C8632dsu.c((Object) acg, "");
        this.b = context;
        this.a = dwu;
        this.f = dwq;
        this.d = dwq2;
        this.c = acg;
    }

    public final void a(String str, Integer num, String str2, drM<? super aLO<? extends Pair<Boolean, ? extends Status>>, dpR> drm) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) drm, "");
        C8737dwr.c(this.a, c(str, drm), null, new GraphQLListActions$addVideoToMyList$1(str, num, str2, this, drm, null), 2, null);
    }

    public final void a(String str, String str2, drM<? super aLO<? extends Pair<Boolean, ? extends Status>>, dpR> drm) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) drm, "");
        C8737dwr.c(this.a, c(str, drm), null, new GraphQLListActions$removeVideoFromMyList$1(str, str2, this, drm, null), 2, null);
    }

    public final void a(String str, drM<? super aLO<? extends Pair<Boolean, ? extends Status>>, dpR> drm) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) drm, "");
        C8737dwr.c(this.a, c(str, drm), null, new GraphQLListActions$addGameToMyList$1(str, this, drm, null), 2, null);
    }

    public final void b(String str, drM<? super aLO<? extends Pair<Boolean, ? extends Status>>, dpR> drm) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) drm, "");
        C8737dwr.c(this.a, c(str, drm), null, new GraphQLListActions$removeGameFromMyList$1(str, this, drm, null), 2, null);
    }

    public final void b(String str, Integer num, String str2, drM<? super aLO<? extends Pair<Boolean, ? extends Status>>, dpR> drm) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) drm, "");
        C8737dwr.c(this.a, c(str, drm), null, new GraphQLListActions$addVideoToRemindMe$1(str, num, str2, this, drm, null), 2, null);
    }

    public final void e(String str, String str2, drM<? super aLO<? extends Pair<Boolean, ? extends Status>>, dpR> drm) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) drm, "");
        C8737dwr.c(this.a, c(str, drm), null, new GraphQLListActions$removeVideoFromRemindMe$1(str, str2, this, drm, null), 2, null);
    }

    public final void d(String str, VideoType videoType) {
        Map d2;
        Map k;
        Throwable th;
        List e2;
        InterfaceC8999hM zh;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoType, "");
        try {
            e2 = C8566dqi.e(Integer.valueOf(Integer.parseInt(str)));
            if (videoType == VideoType.GAMES) {
                zh = new YA(e2);
            } else {
                zh = new ZH(e2);
            }
            C8738dws.e(this.d, new GraphQLListActions$onListStatusChanged$1(this, zh, null));
        } catch (Exception e3) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            ErrorType errorType = ErrorType.l;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd("Error in ListActionsGraphQLInterop", e3, errorType, false, k, false, false, 96, null);
            ErrorType errorType2 = c1596aHd.a;
            if (errorType2 != null) {
                c1596aHd.e.put("errorType", errorType2.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c2 = errorType2.c();
                    c1596aHd.a(c2 + " " + b2);
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
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
    }

    /* renamed from: o.Kg$d */
    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("GraphQLListActions");
        }

        public final C0987Kg d() {
            C1332Xp c1332Xp = C1332Xp.b;
            return a((Context) C1332Xp.b(Context.class));
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
            if (r1 != false) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final o.C0987Kg a(android.content.Context r13) {
            /*
                r12 = this;
                java.lang.String r0 = ""
                o.C8632dsu.c(r13, r0)
                o.Mh r0 = o.AbstractApplicationC1040Mh.getInstance()
                o.Mw r0 = r0.i()
                com.netflix.mediaclient.service.user.UserAgent r0 = r0.k()
                if (r0 == 0) goto L18
                o.bvo r0 = r0.j()
                goto L19
            L18:
                r0 = 0
            L19:
                if (r0 == 0) goto Le2
                java.lang.String r1 = r0.getProfileGuid()
                if (r1 == 0) goto L27
                boolean r1 = o.C8684dus.a(r1)
                if (r1 == 0) goto Lc5
            L27:
                o.aHe$d r1 = o.InterfaceC1597aHe.b
                java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                r1.<init>()
                java.util.Map r7 = o.dqF.d(r1)
                o.aHd r1 = new o.aHd
                java.lang.String r3 = "SPY-35060 - User profile has a null or blank profile GUID"
                r4 = 0
                r5 = 0
                r6 = 1
                r8 = 0
                r9 = 0
                r10 = 96
                r11 = 0
                r2 = r1
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                com.netflix.mediaclient.api.logging.error.ErrorType r2 = r1.a
                if (r2 == 0) goto L72
                java.util.Map<java.lang.String, java.lang.String> r3 = r1.e
                java.lang.String r4 = "errorType"
                java.lang.String r5 = r2.c()
                r3.put(r4, r5)
                java.lang.String r3 = r1.b()
                if (r3 == 0) goto L72
                java.lang.String r2 = r2.c()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r2)
                java.lang.String r2 = " "
                r4.append(r2)
                r4.append(r3)
                java.lang.String r2 = r4.toString()
                r1.a(r2)
            L72:
                java.lang.String r2 = r1.b()
                if (r2 == 0) goto L88
                java.lang.Throwable r2 = r1.i
                if (r2 == 0) goto L88
                java.lang.Throwable r2 = new java.lang.Throwable
                java.lang.String r3 = r1.b()
                java.lang.Throwable r4 = r1.i
                r2.<init>(r3, r4)
                goto Lb2
            L88:
                java.lang.String r2 = r1.b()
                if (r2 == 0) goto L98
                java.lang.Throwable r2 = new java.lang.Throwable
                java.lang.String r3 = r1.b()
                r2.<init>(r3)
                goto Lb2
            L98:
                java.lang.Throwable r2 = r1.i
                if (r2 == 0) goto Lab
                if (r2 == 0) goto L9f
                goto Lb2
            L9f:
                java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Required value was null."
                java.lang.String r0 = r0.toString()
                r13.<init>(r0)
                throw r13
            Lab:
                java.lang.Throwable r2 = new java.lang.Throwable
                java.lang.String r3 = "Handled exception with no message"
                r2.<init>(r3)
            Lb2:
                o.aHi$d r3 = o.InterfaceC1601aHi.c
                o.aHe r4 = r3.c()
                if (r4 == 0) goto Lbe
                r4.d(r1, r2)
                goto Lc5
            Lbe:
                o.aHb r3 = r3.e()
                r3.b(r1, r2)
            Lc5:
                o.aGb$e r1 = o.C1567aGb.a
                o.aGb r0 = r1.e(r0)
                o.aFY$b r1 = o.aFY.b
                o.aFY r13 = r1.e(r13)
                o.aFU r13 = r13.e(r0)
                java.lang.Class<o.Kg$c> r0 = o.C0987Kg.c.class
                java.lang.Object r13 = dagger.hilt.EntryPoints.get(r13, r0)
                o.Kg$c r13 = (o.C0987Kg.c) r13
                o.Kg r13 = r13.b()
                return r13
            Le2:
                o.Kg$d r13 = o.C0987Kg.e
                java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
                o.dpR r0 = o.dpR.c
                java.lang.String r0 = r0.toString()
                r13.<init>(r0)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C0987Kg.d.a(android.content.Context):o.Kg");
        }
    }

    private final CoroutineExceptionHandler c(String str, drM<? super aLO<? extends Pair<Boolean, ? extends Status>>, dpR> drm) {
        return new b(CoroutineExceptionHandler.Key, str, this, drm);
    }
}
