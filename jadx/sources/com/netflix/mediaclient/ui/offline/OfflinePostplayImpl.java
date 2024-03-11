package com.netflix.mediaclient.ui.offline;

import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.user.UserAgentListener;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.offline.OfflineAdapterData;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.IntoSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;
import o.C1596aHd;
import o.C5096bsM;
import o.C7353cuc;
import o.C7359cui;
import o.C7460cwd;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC4208baF;
import o.InterfaceC5283bvo;
import o.InterfaceC5298bwC;
import o.InterfaceC7281ctJ;
import o.InterfaceC7282ctK;
import o.InterfaceC7464cwh;
import o.dqE;

@Singleton
/* loaded from: classes4.dex */
public final class OfflinePostplayImpl implements InterfaceC7282ctK, UserAgentListener {
    private String e;
    private final Random c = new Random();
    private HashMap<String, C7460cwd> a = new HashMap<>();
    private HashMap<String, C7460cwd> i = new HashMap<>();
    private HashSet<String> b = new HashSet<>();

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface OfflinePostPlayModule {
        @Binds
        @IntoSet
        UserAgentListener d(OfflinePostplayImpl offlinePostplayImpl);

        @Binds
        InterfaceC7282ctK e(OfflinePostplayImpl offlinePostplayImpl);
    }

    /* loaded from: classes4.dex */
    public final /* synthetic */ class c {
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[VideoType.values().length];
            try {
                iArr[VideoType.MOVIE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoType.EPISODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            c = iArr;
        }
    }

    @Override // o.InterfaceC7282ctK
    public void a(String str) {
        this.e = str;
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onProfileSelectionResultStatus(StatusCode statusCode) {
        UserAgentListener.b.a(this, statusCode);
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onProfileTypeChanged(String str) {
        UserAgentListener.b.c(this, str);
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

    private final void e() {
        this.a.clear();
        this.b.clear();
        this.e = null;
    }

    @Override // o.InterfaceC7282ctK
    public boolean e(String str) {
        return (str == null || this.a.get(str) == null) ? false : true;
    }

    @Override // o.InterfaceC7282ctK
    public C7460cwd d(String str) {
        if (str != null) {
            return this.a.get(str);
        }
        return null;
    }

    @Override // o.InterfaceC7282ctK
    public C7460cwd b(String str) {
        InterfaceC7281ctJ d;
        Map d2;
        Map k;
        Throwable th;
        Map d3;
        Map k2;
        Throwable th2;
        C7460cwd c7460cwd = null;
        if (str == null || (d = b().d()) == null) {
            return null;
        }
        C7460cwd e = C7353cuc.e(str);
        if (e == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d3 = dqE.d();
            k2 = dqE.k(d3);
            C1596aHd c1596aHd = new C1596aHd("current offline video is null " + str, null, null, true, k2, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    c1596aHd.a(errorType.c() + " " + b);
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
            return null;
        }
        VideoType type = e.getType();
        int i = type == null ? -1 : c.c[type.ordinal()];
        if (i == 1) {
            c7460cwd = e(e, d);
        } else if (i == 2) {
            c7460cwd = e(e, d, true);
            if (c7460cwd == null) {
                c7460cwd = e(e, d);
            }
        } else {
            InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd2 = new C1596aHd("invalid video type", null, null, true, k, false, false, 96, null);
            ErrorType errorType2 = c1596aHd2.a;
            if (errorType2 != null) {
                c1596aHd2.e.put("errorType", errorType2.c());
                String b2 = c1596aHd2.b();
                if (b2 != null) {
                    c1596aHd2.a(errorType2.c() + " " + b2);
                }
            }
            if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                th = new Throwable(c1596aHd2.b(), c1596aHd2.i);
            } else if (c1596aHd2.b() != null) {
                th = new Throwable(c1596aHd2.b());
            } else {
                th = c1596aHd2.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
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
        if (c7460cwd != null) {
            this.a.put(str, c7460cwd);
        } else {
            this.a.remove(str);
        }
        return c7460cwd;
    }

    @Override // o.InterfaceC7282ctK
    public int c(String str) {
        Map d;
        Map k;
        Throwable th;
        Map d2;
        Map k2;
        Throwable th2;
        InterfaceC7281ctJ d3 = b().d();
        if (d3 == null) {
            return 0;
        }
        C7460cwd e = C7353cuc.e(str);
        if (e == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k2 = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd("current offline video is null " + str, null, null, true, k2, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    c1596aHd.a(errorType.c() + " " + b);
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
            return 0;
        }
        HashSet hashSet = new HashSet();
        if (e.getType() == VideoType.EPISODE) {
            int c2 = d3.c();
            for (int i = 0; i < c2; i++) {
                OfflineAdapterData c3 = d3.c(i);
                OfflineAdapterData.b a2 = c3.a();
                if (a2 == null) {
                    InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
                    d = dqE.d();
                    k = dqE.k(d);
                    C1596aHd c1596aHd2 = new C1596aHd("videoAndProfileData should not be null", null, null, true, k, false, false, 96, null);
                    ErrorType errorType2 = c1596aHd2.a;
                    if (errorType2 != null) {
                        c1596aHd2.e.put("errorType", errorType2.c());
                        String b2 = c1596aHd2.b();
                        if (b2 != null) {
                            c1596aHd2.a(errorType2.c() + " " + b2);
                        }
                    }
                    if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                        th = new Throwable(c1596aHd2.b(), c1596aHd2.i);
                    } else if (c1596aHd2.b() != null) {
                        th = new Throwable(c1596aHd2.b());
                    } else {
                        th = c1596aHd2.i;
                        if (th == null) {
                            th = new Throwable("Handled exception with no message");
                        } else if (th == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a3 = dVar2.a();
                    if (a3 != null) {
                        a3.e(c1596aHd2, th);
                    } else {
                        dVar2.e().b(c1596aHd2, th);
                    }
                } else if (C8632dsu.c((Object) a2.a.aO_(), (Object) e.aO_())) {
                    C7460cwd[] b3 = c3.b();
                    C8632dsu.a(b3, "");
                    for (C7460cwd c7460cwd : b3) {
                        if (C7353cuc.e(c7460cwd) && !hashSet.contains(c7460cwd.getId())) {
                            hashSet.add(c7460cwd.getId());
                        }
                    }
                }
            }
        }
        return hashSet.size();
    }

    private final C7460cwd e(C7460cwd c7460cwd, InterfaceC7281ctJ interfaceC7281ctJ) {
        Map d;
        Map k;
        Throwable th;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.i.clear();
        InterfaceC4208baF c2 = C7353cuc.c();
        if (this.e == null || c2 == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("User profile is null", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    c1596aHd.a(errorType.c() + " " + b);
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
            return null;
        }
        int c3 = interfaceC7281ctJ.c();
        for (int i = 0; i < c3; i++) {
            OfflineAdapterData c4 = interfaceC7281ctJ.c(i);
            if (c4.a().b == OfflineAdapterData.ViewType.MOVIE) {
                C7460cwd c7460cwd2 = c4.a().a;
                if (c7460cwd2 != null && C7353cuc.e(c7460cwd2) && !C8632dsu.c((Object) c7460cwd2.getId(), (Object) c7460cwd.getId())) {
                    HashMap<String, C7460cwd> hashMap = this.i;
                    String aO_ = c7460cwd2.aO_();
                    C8632dsu.a(aO_, "");
                    hashMap.put(aO_, c7460cwd2);
                    c(arrayList3, arrayList, arrayList2, c7460cwd2);
                }
            } else if (c4.a().b == OfflineAdapterData.ViewType.SHOW) {
                C7460cwd[] b2 = c4.b();
                C8632dsu.a(b2, "");
                int i2 = 0;
                for (C7460cwd c7460cwd3 : b2) {
                    if (c7460cwd3 != null && C7353cuc.e(c7460cwd3) && !C8632dsu.c((Object) c7460cwd3.aO_(), (Object) c7460cwd.aO_())) {
                        if (i2 == 0) {
                            HashMap<String, C7460cwd> hashMap2 = this.i;
                            String aO_2 = c7460cwd3.aO_();
                            C8632dsu.a(aO_2, "");
                            hashMap2.put(aO_2, c7460cwd3);
                        }
                        i2++;
                        c(arrayList3, arrayList, arrayList2, c7460cwd3);
                    }
                }
            }
        }
        if (arrayList3.size() > 0) {
            return c(arrayList3);
        }
        if (arrayList2.size() > 0) {
            return c(arrayList2);
        }
        if (arrayList.size() > 0) {
            return c(arrayList);
        }
        return null;
    }

    private final void c(List<C7460cwd> list, List<C7460cwd> list2, List<C7460cwd> list3, C7460cwd c7460cwd) {
        InterfaceC7464cwh b;
        if (!BrowseExperience.a() || ((b = b().b(c7460cwd.u())) != null && b.b())) {
            C5096bsM a = C7353cuc.a(this.e, c7460cwd.getId());
            if (a == null) {
                list.add(c7460cwd);
                return;
            }
            long seconds = TimeUnit.MILLISECONDS.toSeconds(a.c);
            if (seconds <= c7460cwd.aB_()) {
                list.add(c7460cwd);
            } else if (seconds >= c7460cwd.av_()) {
                list3.add(c7460cwd);
            } else {
                list2.add(c7460cwd);
            }
        }
    }

    private final C7460cwd c(List<? extends C7460cwd> list) {
        return this.i.get(list.get(this.c.nextInt(list.size())).aO_());
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0117, code lost:
        if (o.C8632dsu.c((java.lang.Object) r2.aO_(), (java.lang.Object) r20.aO_()) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0119, code lost:
        if (r0 != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0123, code lost:
        if (r2.x() != r20.x()) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x012e, code lost:
        if (r20.aw_() != (r2.aw_() + 1)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0130, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x013a, code lost:
        if (r2.x() != (r20.x() - 1)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0140, code lost:
        if (r20.aw_() != 1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0142, code lost:
        return true;
     */
    @Override // o.InterfaceC7282ctK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(java.lang.String r19, o.C7460cwd r20) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.offline.OfflinePostplayImpl.a(java.lang.String, o.cwd):boolean");
    }

    private final C7460cwd e(C7460cwd c7460cwd, InterfaceC7281ctJ interfaceC7281ctJ, boolean z) {
        Map d;
        Map k;
        Throwable th;
        int c2 = interfaceC7281ctJ.c();
        int i = -1;
        for (int i2 = 0; i2 < c2; i2++) {
            OfflineAdapterData c3 = interfaceC7281ctJ.c(i2);
            OfflineAdapterData.b a = c3.a();
            if (a == null) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd = new C1596aHd("videoAndProfileData should not be null", null, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        c1596aHd.a(errorType.c() + " " + b);
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
            } else if (C8632dsu.c((Object) a.a.aO_(), (Object) c7460cwd.aO_()) && a.e > 1) {
                C7460cwd[] b2 = c3.b();
                if (b2[0].G() && z) {
                    this.b.add(c7460cwd.getId());
                    C8632dsu.d(b2);
                    for (C7460cwd c7460cwd2 : b2) {
                        if (!this.b.contains(c7460cwd2.getId()) && C7353cuc.e(c7460cwd2)) {
                            return c7460cwd2;
                        }
                    }
                    this.b.clear();
                    return null;
                }
                C8632dsu.d(b2);
                for (C7460cwd c7460cwd3 : b2) {
                    i++;
                    if (c7460cwd3.aw_() == c7460cwd.aw_() && c7460cwd3.x() == c7460cwd.x()) {
                        break;
                    }
                }
                int length = b2.length;
                for (int i3 = i + 1; i3 < length; i3++) {
                    C7460cwd c7460cwd4 = b2[i3];
                    if (C7353cuc.e(c7460cwd4) && !C8632dsu.c((Object) c7460cwd4.getId(), (Object) c7460cwd.getId())) {
                        if (z) {
                            if ((c7460cwd4.x() == c7460cwd.x() && c7460cwd4.aw_() > c7460cwd.aw_()) || c7460cwd4.x() > c7460cwd.x()) {
                                return c7460cwd4;
                            }
                        } else if (c7460cwd4.aw_() == c7460cwd.aw_() + 1 && c7460cwd4.x() == c7460cwd.x()) {
                            return c7460cwd4;
                        } else {
                            if (c7460cwd.aw_() == a.a.e(c7460cwd.x()) && c7460cwd4.x() == c7460cwd.x() + 1 && c7460cwd4.aw_() == 1) {
                                return c7460cwd4;
                            }
                        }
                    }
                }
                continue;
            }
        }
        return null;
    }

    private final C7359cui b() {
        InterfaceC5298bwC u = NetflixApplication.getInstance().u();
        C8632dsu.d(u);
        return (C7359cui) u;
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onUserAccountDeactivated(List<? extends InterfaceC5283bvo> list, String str) {
        e();
    }

    @Override // com.netflix.mediaclient.service.user.UserAgentListener
    public void onUserProfileDeactivated(InterfaceC5283bvo interfaceC5283bvo, List<? extends InterfaceC5283bvo> list) {
        e();
    }
}
