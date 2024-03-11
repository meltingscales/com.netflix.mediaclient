package com.netflix.mediaclient.graphqlplatform.impl;

import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.user.UserAgentListener;
import dagger.Binds;
import dagger.Lazy;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.IntoSet;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import o.C1045Mp;
import o.C1567aGb;
import o.C1596aHd;
import o.C8572dqo;
import o.C8627dsp;
import o.C8632dsu;
import o.C8691duz;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC5283bvo;
import o.MF;
import o.aCN;
import o.dpR;
import o.dqE;
import o.drM;
import o.drO;

/* loaded from: classes3.dex */
public final class GraphQLCacheAccountEventsHandler implements UserAgentListener {
    public static final d a = new d(null);
    private final Lazy<aCN> d;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface CacheStartupModule {
        @Binds
        @IntoSet
        UserAgentListener d(GraphQLCacheAccountEventsHandler graphQLCacheAccountEventsHandler);
    }

    @Inject
    public GraphQLCacheAccountEventsHandler(Lazy<aCN> lazy) {
        C8632dsu.c((Object) lazy, "");
        this.d = lazy;
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onProfileSelectionResultStatus(StatusCode statusCode) {
        UserAgentListener.b.a(this, statusCode);
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onUserAccountActive() {
        UserAgentListener.b.a(this);
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onUserLogOut() {
        UserAgentListener.b.b(this);
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onUserProfileActive(InterfaceC5283bvo interfaceC5283bvo) {
        UserAgentListener.b.e(this, interfaceC5283bvo);
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onUserProfileDeactivated(InterfaceC5283bvo interfaceC5283bvo, List<? extends InterfaceC5283bvo> list) {
        UserAgentListener.b.c(this, interfaceC5283bvo, list);
    }

    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("GraphQLCacheAccountEventsHandler");
        }
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onProfileTypeChanged(String str) {
        boolean g;
        Map d2;
        Map k;
        Throwable th;
        C8632dsu.c((Object) str, "");
        g = C8691duz.g(str);
        if (g) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            ErrorType errorType = ErrorType.l;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd("Null or empty profiles guid received in profile type changed broadcast", null, errorType, true, k, false, false, 96, null);
            ErrorType errorType2 = c1596aHd.a;
            if (errorType2 != null) {
                c1596aHd.e.put("errorType", errorType2.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c = errorType2.c();
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
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(c1596aHd, th);
                return;
            } else {
                dVar.e().b(c1596aHd, th);
                return;
            }
        }
        SubscribersKt.subscribeBy(this.d.get().d(new C1567aGb(str)), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.graphqlplatform.impl.GraphQLCacheAccountEventsHandler$onProfileTypeChanged$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th2) {
                c(th2);
                return dpR.c;
            }

            public final void c(Throwable th2) {
                Map d3;
                Map k2;
                Throwable th3;
                C8632dsu.c((Object) th2, "");
                InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
                ErrorType errorType3 = ErrorType.l;
                d3 = dqE.d();
                k2 = dqE.k(d3);
                C1596aHd c1596aHd2 = new C1596aHd("Error clearing GraphQL cache for profile from the GraphQLCacheBroadcastHandler (profile type change)", th2, errorType3, true, k2, false, false, 96, null);
                ErrorType errorType4 = c1596aHd2.a;
                if (errorType4 != null) {
                    c1596aHd2.e.put("errorType", errorType4.c());
                    String b2 = c1596aHd2.b();
                    if (b2 != null) {
                        String c2 = errorType4.c();
                        c1596aHd2.a(c2 + " " + b2);
                    }
                }
                if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                    th3 = new Throwable(c1596aHd2.b(), c1596aHd2.i);
                } else if (c1596aHd2.b() != null) {
                    th3 = new Throwable(c1596aHd2.b());
                } else {
                    th3 = c1596aHd2.i;
                    if (th3 == null) {
                        th3 = new Throwable("Handled exception with no message");
                    } else if (th3 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                InterfaceC1598aHf a3 = dVar2.a();
                if (a3 != null) {
                    a3.e(c1596aHd2, th3);
                } else {
                    dVar2.e().b(c1596aHd2, th3);
                }
            }
        }, new drO<dpR>() { // from class: com.netflix.mediaclient.graphqlplatform.impl.GraphQLCacheAccountEventsHandler$onProfileTypeChanged$2
            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                c();
                return dpR.c;
            }

            public final void c() {
                GraphQLCacheAccountEventsHandler.a.getLogTag();
                InterfaceC1593aHa.c.a("Cleared GraphQL cache for profile from the GraphQLCacheBroadcastHandler (profile type change)");
            }
        });
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onUserAccountDeactivated(List<? extends InterfaceC5283bvo> list, String str) {
        ArrayList arrayList;
        Map d2;
        Map k;
        Throwable th;
        boolean g;
        int d3;
        a.getLogTag();
        if (list != null) {
            d3 = C8572dqo.d(list, 10);
            arrayList = new ArrayList(d3);
            for (InterfaceC5283bvo interfaceC5283bvo : list) {
                String profileGuid = interfaceC5283bvo.getProfileGuid();
                C8632dsu.a(profileGuid, "");
                arrayList.add(new C1567aGb(profileGuid));
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty() && str != null) {
            g = C8691duz.g(str);
            if (!g) {
                SubscribersKt.subscribeBy(this.d.get().d(arrayList, new MF(str)), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.graphqlplatform.impl.GraphQLCacheAccountEventsHandler$onUserAccountDeactivated$2
                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Throwable th2) {
                        a(th2);
                        return dpR.c;
                    }

                    public final void a(Throwable th2) {
                        Map d4;
                        Map k2;
                        Throwable th3;
                        C8632dsu.c((Object) th2, "");
                        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                        ErrorType errorType = ErrorType.l;
                        d4 = dqE.d();
                        k2 = dqE.k(d4);
                        C1596aHd c1596aHd = new C1596aHd("Error clearing GraphQL caches from the GraphQLCacheBroadcastHandler (user logged out)", th2, errorType, true, k2, false, false, 96, null);
                        ErrorType errorType2 = c1596aHd.a;
                        if (errorType2 != null) {
                            c1596aHd.e.put("errorType", errorType2.c());
                            String b = c1596aHd.b();
                            if (b != null) {
                                String c = errorType2.c();
                                c1596aHd.a(c + " " + b);
                            }
                        }
                        if (c1596aHd.b() != null && c1596aHd.i != null) {
                            th3 = new Throwable(c1596aHd.b(), c1596aHd.i);
                        } else if (c1596aHd.b() != null) {
                            th3 = new Throwable(c1596aHd.b());
                        } else {
                            th3 = c1596aHd.i;
                            if (th3 == null) {
                                th3 = new Throwable("Handled exception with no message");
                            } else if (th3 == null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                        }
                        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                        InterfaceC1598aHf a2 = dVar.a();
                        if (a2 != null) {
                            a2.e(c1596aHd, th3);
                        } else {
                            dVar.e().b(c1596aHd, th3);
                        }
                    }
                }, new drO<dpR>() { // from class: com.netflix.mediaclient.graphqlplatform.impl.GraphQLCacheAccountEventsHandler$onUserAccountDeactivated$3
                    @Override // o.drO
                    public /* synthetic */ dpR invoke() {
                        a();
                        return dpR.c;
                    }

                    public final void a() {
                        GraphQLCacheAccountEventsHandler.a.getLogTag();
                        InterfaceC1593aHa.c.a("Cleared GraphQL caches from the GraphQLCacheBroadcastHandler (user logged out)");
                    }
                });
                return;
            }
        }
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        ErrorType errorType = ErrorType.l;
        d2 = dqE.d();
        k = dqE.k(d2);
        C1596aHd c1596aHd = new C1596aHd("Null or empty profiles list or account guid received in logout broadcast", null, errorType, true, k, false, false, 96, null);
        ErrorType errorType2 = c1596aHd.a;
        if (errorType2 != null) {
            c1596aHd.e.put("errorType", errorType2.c());
            String b = c1596aHd.b();
            if (b != null) {
                String c = errorType2.c();
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
        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
        InterfaceC1598aHf a2 = dVar.a();
        if (a2 != null) {
            a2.e(c1596aHd, th);
        } else {
            dVar.e().b(c1596aHd, th);
        }
    }
}
