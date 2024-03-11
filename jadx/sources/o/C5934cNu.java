package o;

import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.MaturityLevel;
import com.netflix.cl.model.ProfileSettings;
import com.netflix.cl.model.event.session.AddProfileEnded;
import com.netflix.cl.model.event.session.action.Action;
import com.netflix.cl.model.event.session.action.AddProfile;
import com.netflix.cl.model.event.session.action.DeleteProfile;
import com.netflix.cl.model.event.session.action.EditProfile;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.cNu */
/* loaded from: classes4.dex */
public final class C5934cNu extends C1045Mp {
    public static final C5934cNu b = new C5934cNu();

    private C5934cNu() {
        super("ProfileLogging");
    }

    public final void c(String str, ProfileSettings profileSettings, AppView appView) {
        Long startSession;
        C8632dsu.c((Object) profileSettings, "");
        if (str == null) {
            startSession = Logger.INSTANCE.startSession(new AddProfile(null, appView, profileSettings, null, null));
        } else {
            startSession = Logger.INSTANCE.startSession(new EditProfile(null, str, appView, profileSettings, null, null));
        }
        Logger.INSTANCE.cancelSession(startSession);
    }

    public final void b(String str, ProfileSettings profileSettings, AppView appView) {
        C8632dsu.c((Object) profileSettings, "");
        if (str == null) {
            d(this, new AddProfile(null, appView, profileSettings, null, null), InterfaceC1078Nw.ad, null, null, 12, null);
        } else {
            d(this, new EditProfile(null, str, appView, profileSettings, null, null), InterfaceC1078Nw.ad, null, null, 12, null);
        }
    }

    public final void b(String str, AppView appView, Status status) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) appView, "");
        C8632dsu.c((Object) status, "");
        DeleteProfile deleteProfile = new DeleteProfile(null, str, appView, null, null);
        if (!status.i()) {
            status = null;
        }
        d(this, deleteProfile, status, null, null, 12, null);
    }

    public static /* synthetic */ void d(C5934cNu c5934cNu, Action action, Status status, String str, ProfileSettings profileSettings, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            profileSettings = null;
        }
        c5934cNu.c(action, status, str, profileSettings);
    }

    public final void c(Action action, Status status, String str, ProfileSettings profileSettings) {
        C8632dsu.c((Object) action, "");
        Logger logger = Logger.INSTANCE;
        logger.startSession(action);
        if (status == null) {
            if ((action instanceof AddProfile) && profileSettings != null && str != null) {
                logger.endSession(new AddProfileEnded((AddProfile) action, str, profileSettings));
                return;
            } else {
                logger.endSession(Long.valueOf(action.getId()));
                return;
            }
        }
        ExtLogger.INSTANCE.failedAction(Long.valueOf(action.getId()), C8169dfM.b(status));
    }

    public final void b(Status status, boolean z, ProfileSettings profileSettings, String str, String str2, AppView appView) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) status, "");
        C8632dsu.c((Object) profileSettings, "");
        if (!status.j()) {
            if (str == null) {
                d(this, new AddProfile(null, appView, profileSettings, null, null), status, null, null, 12, null);
                return;
            } else if (z) {
                d(this, new DeleteProfile(null, str, appView, null, null), status, null, null, 12, null);
                return;
            } else {
                d(this, new EditProfile(null, str, appView, profileSettings, null, null), status, null, null, 12, null);
                return;
            }
        }
        getLogTag();
        if (!z) {
            if (str == null) {
                c(new AddProfile(null, appView, profileSettings, null, null), null, str2, profileSettings);
                return;
            } else {
                d(this, new EditProfile(appView, str, appView, profileSettings, null, null), null, null, null, 12, null);
                return;
            }
        }
        if (str != null) {
            d(this, new DeleteProfile(null, str, appView, null, null), null, null, null, 12, null);
        } else {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("Input profile was null on delete action. This should NOT happen!", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b2);
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

    public final void e(String str, AppView appView) {
        C8632dsu.c((Object) str, "");
        Logger logger = Logger.INSTANCE;
        logger.cancelSession(logger.startSession(new DeleteProfile(null, str, appView, null, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.netflix.cl.model.ProfileSettings b(com.netflix.mediaclient.servicemgr.ServiceManager r10, com.netflix.mediaclient.service.webclient.model.leafs.AvatarInfo r11, boolean r12, int r13, o.InterfaceC5283bvo r14) {
        /*
            r9 = this;
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            com.netflix.cl.model.MaturityLevel r5 = r9.c(r13)
            r13 = 0
            if (r14 == 0) goto L10
            java.lang.String r0 = r14.getLanguagesInCsv()
            goto L22
        L10:
            if (r10 == 0) goto L24
            com.netflix.mediaclient.service.user.UserAgent r0 = r10.u()
            if (r0 == 0) goto L24
            o.bvo r0 = r0.m()
            if (r0 == 0) goto L24
            java.lang.String r0 = r0.getLanguagesInCsv()
        L22:
            r6 = r0
            goto L25
        L24:
            r6 = r13
        L25:
            if (r14 == 0) goto L2c
            java.util.List r10 = r14.getSecondaryLanguages()
            goto L40
        L2c:
            if (r10 == 0) goto L3f
            com.netflix.mediaclient.service.user.UserAgent r10 = r10.u()
            if (r10 == 0) goto L3f
            o.bvo r10 = r10.m()
            if (r10 == 0) goto L3f
            java.util.List r10 = r10.getSecondaryLanguages()
            goto L40
        L3f:
            r10 = r13
        L40:
            r0 = 0
            if (r14 == 0) goto L48
            boolean r1 = r14.isAutoPlayEnabled()
            goto L49
        L48:
            r1 = r0
        L49:
            if (r14 == 0) goto L50
            boolean r14 = r14.disableVideoMerchAutoPlay()
            goto L51
        L50:
            r14 = r0
        L51:
            if (r11 == 0) goto L59
            java.lang.String r11 = r11.getName()
            r2 = r11
            goto L5a
        L59:
            r2 = r13
        L5a:
            if (r10 == 0) goto L66
            java.lang.String[] r11 = new java.lang.String[r0]
            java.lang.Object[] r10 = r10.toArray(r11)
            java.lang.String[] r10 = (java.lang.String[]) r10
            r4 = r10
            goto L67
        L66:
            r4 = r13
        L67:
            com.netflix.cl.model.ProfileSettings r10 = new com.netflix.cl.model.ProfileSettings
            r11 = r14 ^ 1
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r3 = 0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r12)
            r0 = r10
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5934cNu.b(com.netflix.mediaclient.servicemgr.ServiceManager, com.netflix.mediaclient.service.webclient.model.leafs.AvatarInfo, boolean, int, o.bvo):com.netflix.cl.model.ProfileSettings");
    }

    private final MaturityLevel c(Integer num) {
        if (num == null) {
            return MaturityLevel.adults;
        }
        return num.intValue() <= 40 ? MaturityLevel.littleKids : num.intValue() <= 70 ? MaturityLevel.olderKids : num.intValue() <= 96 ? MaturityLevel.teens : MaturityLevel.adults;
    }
}
