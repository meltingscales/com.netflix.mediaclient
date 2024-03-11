package o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.netflix.mediaclient.service.mdx.MdxErrorSubCode;
import com.netflix.mediaclient.service.mdx.MdxLoginPolicyEnum;
import com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget;
import com.netflix.mediaclient.service.mdx.protocol.target.TargetSessionMessageType;
import com.netflix.mediaclient.service.mdx.protocol.target.TargetState;
import com.netflix.mediaclient.service.mdx.protocol.target.TargetStateEvent;
import com.netflix.mediaclient.service.mdx.protocol.target.TargetStateId;
import java.util.EnumSet;
import java.util.Set;
import o.C1605aHm;
import o.C2069aYs;
import o.C2073aYw;
import o.aYE;

/* loaded from: classes3.dex */
public class aYE {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int a$s75$2910 = 1998870156;
    private static char b$s76$2910 = 24260;
    private static long d$s74$2910 = -6422965311034337652L;
    private static int h = 0;
    private static int i = 1;
    private SessionMdxTarget a;
    private TargetState b;
    private final Set<MdxLoginPolicyEnum> c;
    private TargetState d;
    private long e;
    private final Set<MdxLoginPolicyEnum> f;
    private Handler j;

    static /* synthetic */ SessionMdxTarget a(aYE aye) {
        int i2 = 2 % 2;
        int i3 = i + 63;
        h = i3 % 128;
        if (i3 % 2 == 0) {
            return aye.a;
        }
        SessionMdxTarget sessionMdxTarget = aye.a;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ boolean a(aYE aye, Message message) {
        int i2 = 2 % 2;
        int i3 = i + 101;
        h = i3 % 128;
        int i4 = i3 % 2;
        boolean c = aye.c(message);
        if (i4 != 0) {
            int i5 = 17 / 0;
        }
        return c;
    }

    static /* bridge */ /* synthetic */ TargetState b(aYE aye) {
        int i2 = 2 % 2;
        int i3 = h;
        int i4 = i3 + 107;
        i = i4 % 128;
        int i5 = i4 % 2;
        TargetState targetState = aye.b;
        int i6 = i3 + 69;
        i = i6 % 128;
        int i7 = i6 % 2;
        return targetState;
    }

    static /* bridge */ /* synthetic */ Set c(aYE aye) {
        int i2 = 2 % 2;
        int i3 = i + 19;
        h = i3 % 128;
        if (i3 % 2 == 0) {
            return aye.f;
        }
        Set<MdxLoginPolicyEnum> set = aye.f;
        throw null;
    }

    static /* synthetic */ boolean c(aYE aye, String str) {
        int i2 = 2 % 2;
        int i3 = i + 49;
        h = i3 % 128;
        if (i3 % 2 == 0) {
            return aye.a(str);
        }
        aye.a(str);
        throw null;
    }

    static /* synthetic */ void d(aYE aye, TargetState targetState) {
        int i2 = 2 % 2;
        int i3 = i + 99;
        h = i3 % 128;
        int i4 = i3 % 2;
        aye.c(targetState);
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ boolean d(aYE aye) {
        int i2 = 2 % 2;
        int i3 = h + 51;
        i = i3 % 128;
        int i4 = i3 % 2;
        boolean e = aye.e();
        if (i4 == 0) {
            int i5 = 64 / 0;
        }
        int i6 = i + 55;
        h = i6 % 128;
        int i7 = i6 % 2;
        return e;
    }

    static /* bridge */ /* synthetic */ Set e(aYE aye) {
        int i2 = 2 % 2;
        int i3 = h + 19;
        i = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 35 / 0;
            return aye.c;
        }
        return aye.c;
    }

    static /* synthetic */ void e(aYE aye, TargetState targetState, Object obj) {
        int i2 = 2 % 2;
        int i3 = i + 61;
        h = i3 % 128;
        int i4 = i3 % 2;
        aye.c(targetState, obj);
        int i5 = i + 67;
        h = i5 % 128;
        int i6 = i5 % 2;
    }

    static /* synthetic */ boolean g(aYE aye) {
        int i2 = 2 % 2;
        int i3 = i + 81;
        h = i3 % 128;
        int i4 = i3 % 2;
        boolean f = aye.f();
        int i5 = i + 13;
        h = i5 % 128;
        if (i5 % 2 == 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ boolean h(aYE aye) {
        int i2 = 2 % 2;
        int i3 = i + 43;
        h = i3 % 128;
        if (i3 % 2 == 0) {
            return aye.g();
        }
        aye.g();
        throw null;
    }

    static /* bridge */ /* synthetic */ void j(aYE aye) {
        int i2 = 2 % 2;
        int i3 = h + 37;
        i = i3 % 128;
        if (i3 % 2 != 0) {
            aye.j();
            return;
        }
        aye.j();
        int i4 = 33 / 0;
    }

    public Handler a() {
        int i2 = 2 % 2;
        int i3 = i;
        int i4 = i3 + 25;
        h = i4 % 128;
        int i5 = i4 % 2;
        Handler handler = this.j;
        int i6 = i3 + 29;
        h = i6 % 128;
        int i7 = i6 % 2;
        return handler;
    }

    public aYE(SessionMdxTarget sessionMdxTarget, Looper looper) {
        MdxLoginPolicyEnum mdxLoginPolicyEnum = MdxLoginPolicyEnum.LoginOnlyRequestedByTarget;
        this.f = EnumSet.of(mdxLoginPolicyEnum, MdxLoginPolicyEnum.LoginAndPairRequestedByTarget);
        this.c = EnumSet.of(MdxLoginPolicyEnum.LoginOnly, mdxLoginPolicyEnum);
        this.e = 0L;
        this.d = null;
        this.b = TargetState.StateInit;
        this.a = sessionMdxTarget;
        this.j = new AnonymousClass1(looper);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.aYE$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 extends Handler {
        AnonymousClass1(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Type inference failed for: r10v123, types: [o.aWW] */
        /* JADX WARN: Type inference failed for: r10v186, types: [o.aWW] */
        /* JADX WARN: Type inference failed for: r10v217, types: [o.aWW] */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            aVX e;
            MdxErrorSubCode mdxErrorSubCode;
            MdxErrorSubCode mdxErrorSubCode2;
            int i = message.what;
            TargetStateEvent targetStateEvent = TargetStateEvent.Timeout;
            if (targetStateEvent.a(i) && aYE.d(aYE.this)) {
                return;
            }
            C1044Mm.c("MdxTargetStateV2", "(%d) stateId %s, eventId %d", Integer.valueOf(aYE.this.hashCode()), aYE.b(aYE.this).d(), Integer.valueOf(i));
            boolean z = false;
            switch (AnonymousClass3.d[aYE.b(aYE.this).d().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    if (TargetStateEvent.Start.a(i)) {
                        if (aYE.a(aYE.this).E() && !aYE.a(aYE.this).N()) {
                            aYE.d(aYE.this, TargetState.StateStartSession);
                            return;
                        } else if (aYE.a(aYE.this).N() && aYE.a(aYE.this).d(aYE.e(aYE.this))) {
                            aYE.a(aYE.this).q();
                            aYE.d(aYE.this, TargetState.StateMdxPing);
                            return;
                        } else {
                            aYE.d(aYE.this, TargetState.StateAcquirePair);
                            return;
                        }
                    }
                    return;
                case 4:
                    if (TargetStateEvent.SendMessageRequested.a(i)) {
                        aYE.d(aYE.this, TargetState.StateSendingMessage);
                        return;
                    } else if (TargetStateEvent.PeriodicStateCheck.a(i)) {
                        if (aYE.h(aYE.this)) {
                            aYE.d(aYE.this, TargetState.StateSendingMessage);
                        }
                        aYE.j(aYE.this);
                        return;
                    } else if (aYE.a(aYE.this, message)) {
                        return;
                    } else {
                        C1044Mm.c("MdxTargetStateV2", "event %d, %d not handled @%s", Integer.valueOf(i), Integer.valueOf(message.arg1), aYE.b(aYE.this).a());
                        return;
                    }
                case 5:
                    if (TargetStateEvent.PingSucceed.a(i)) {
                        C2069aYs.e eVar = (C2069aYs.e) message.obj;
                        if (aYE.a(aYE.this).N() && eVar.e()) {
                            aYE.a(aYE.this).l().a(aYE.a(aYE.this).t(), aYE.a(aYE.this).x().b());
                            aYE.d(aYE.this, TargetState.StateNoPair);
                            return;
                        } else if (aYE.a(aYE.this).a()) {
                            if (aYE.a(aYE.this).H()) {
                                aYE.d(aYE.this, TargetState.StateSendingMessage);
                                return;
                            } else {
                                aYE.d(aYE.this, TargetState.StateSessionReady);
                                return;
                            }
                        } else {
                            aYE.d(aYE.this, TargetState.StateNoPair);
                            return;
                        }
                    }
                    TargetStateEvent targetStateEvent2 = TargetStateEvent.SendMessageFail;
                    if (targetStateEvent2.a(i) || targetStateEvent.a(i)) {
                        if (aYE.g(aYE.this)) {
                            return;
                        }
                        if (aYE.a(aYE.this).N()) {
                            e = aYE.a(aYE.this).e("mdxping failed", MdxErrorSubCode.RemoteLoginOnlyFailed);
                            aYE.a(aYE.this).l().c(aYE.a(aYE.this).t(), aYE.a(aYE.this).x().b(), e.a());
                        } else if (targetStateEvent2.a(i)) {
                            e = aYE.a(aYE.this).a("mdxping failed", MdxErrorSubCode.PingFail, message.obj.toString());
                        } else {
                            e = aYE.a(aYE.this).e("mdxping failed", MdxErrorSubCode.PingTimeout);
                        }
                        aYE.a(aYE.this).e(e);
                        if (aYE.a(aYE.this).F()) {
                            aYE.a(aYE.this).b(e);
                        }
                        aYE.d(aYE.this, TargetState.StateNoPair);
                        return;
                    } else if (aYE.a(aYE.this, message)) {
                        return;
                    } else {
                        C1044Mm.c("MdxTargetStateV2", "event %d not handled @%s", Integer.valueOf(i), aYE.b(aYE.this).a());
                        return;
                    }
                case 6:
                    if (TargetStateEvent.PairSucceed.a(i)) {
                        if (aYE.a(aYE.this).N() || aYE.a(aYE.this).d(aYE.e(aYE.this))) {
                            aYE.a(aYE.this).l().f(aYE.a(aYE.this).t(), aYE.a(aYE.this).m().f().getString(C1605aHm.c.a, aYE.a(aYE.this).k()));
                            aYE.a(aYE.this).l().a(aYE.a(aYE.this).t(), aYE.a(aYE.this).x().b());
                        }
                        if (aYE.a(aYE.this).d(aYE.e(aYE.this))) {
                            aYE.d(aYE.this, TargetState.StateNoPair);
                            return;
                        } else {
                            aYE.d(aYE.this, TargetState.StateStartSession);
                            return;
                        }
                    } else if (TargetStateEvent.PairFail.a(i)) {
                        C2073aYw.b bVar = (C2073aYw.b) message.obj;
                        String d = bVar.d();
                        String a = bVar.a();
                        boolean equals = "33".equals(d);
                        if (aYE.a(aYE.this).G()) {
                            if (equals || "30".equals(d)) {
                                z = true;
                            }
                        } else {
                            boolean n = bVar.n();
                            boolean z2 = equals && aYE.a(aYE.this).F() && !aYE.a(aYE.this).N();
                            if (z2) {
                                z = !aYE.a(aYE.this).d(aYE.e(aYE.this));
                            } else {
                                boolean z3 = aYE.a(aYE.this).P() && aYE.a(aYE.this).F() && (aYE.a(aYE.this).L() && bVar.h()) && "30".equals(d);
                                boolean z4 = aYE.a(aYE.this).P() && aYE.a(aYE.this).F() && aYE.a(aYE.this).I() && (aYE.a(aYE.this).c(MdxLoginPolicyEnum.LoginAndPair) || !z3);
                                if (z3 || z4) {
                                    if (n || (z4 && aYE.a(aYE.this).d(aYE.c(aYE.this)))) {
                                        z = true;
                                    }
                                    if (z4 && !aYE.a(aYE.this).d(aYE.c(aYE.this))) {
                                        aYE.a(aYE.this).l().c(aYE.a(aYE.this).t(), MdxLoginPolicyEnum.LoginAndPairRequestedByTarget, aYE.a(aYE.this).k(), aYE.a(aYE.this).g("X-MDX-Remote-Login-Witcher-Session-Uuid"));
                                        aYE.d(aYE.this, TargetState.StateNoPair);
                                        return;
                                    } else if (z) {
                                        aYE.d(aYE.this, TargetState.StateVerifyRemoteLoginPin);
                                        return;
                                    } else if (aYE.a(aYE.this).x().a()) {
                                        aYE.d(aYE.this, TargetState.StateAcquireRemoteLoginConsent);
                                        return;
                                    } else {
                                        aYE.d(aYE.this, TargetState.StateRemoteLogin);
                                        return;
                                    }
                                }
                                z = z2;
                            }
                        }
                        if (aYE.a(aYE.this).P() && z) {
                            aYE.d(aYE.this, TargetState.StateRegPair);
                            return;
                        } else if (aYE.c(aYE.this, d)) {
                            return;
                        } else {
                            if (aYE.a(aYE.this).N()) {
                                if (aYE.a(aYE.this).d(aYE.e(aYE.this))) {
                                    mdxErrorSubCode = MdxErrorSubCode.RemoteLoginOnlyFailed;
                                } else {
                                    mdxErrorSubCode = MdxErrorSubCode.RemoteLoginAndPairFailed;
                                }
                            } else if (aYE.a(aYE.this).d(aYE.e(aYE.this))) {
                                mdxErrorSubCode = MdxErrorSubCode.RemoteLoginOnlyFailed;
                            } else {
                                mdxErrorSubCode = MdxErrorSubCode.PairFailed;
                            }
                            aVX a2 = aYE.a(aYE.this).a(a, mdxErrorSubCode, d);
                            C1999aWc x = aYE.a(aYE.this).x();
                            if (x != null) {
                                aYE.a(aYE.this).l().c(aYE.a(aYE.this).t(), x.b(), a2.a());
                            }
                            aYE.a(aYE.this).e(a2);
                            if (aYE.a(aYE.this).F()) {
                                aYE.a(aYE.this).b(a2);
                            }
                            aYE.d(aYE.this, TargetState.StateNoPair);
                            return;
                        }
                    } else if (aYE.a(aYE.this, message)) {
                        return;
                    } else {
                        C1044Mm.c("MdxTargetStateV2", "event %d not handled @%s", Integer.valueOf(i), aYE.b(aYE.this).a());
                        return;
                    }
                case 7:
                    if (TargetStateEvent.RemoteLoginApproved.a(i)) {
                        aYE.d(aYE.this, TargetState.StateRemoteLogin);
                        return;
                    } else if (TargetStateEvent.RemoteLoginRejected.a(i)) {
                        aYE.a(aYE.this).e(aYE.a(aYE.this).a("remote login cancelled", MdxErrorSubCode.RemoteLoginCancelled, null));
                        aYE.d(aYE.this, TargetState.StateNoPair);
                        return;
                    } else if (aYE.a(aYE.this, message)) {
                        return;
                    } else {
                        C1044Mm.c("MdxTargetStateV2", "event %d not handled @%s", Integer.valueOf(i), aYE.b(aYE.this).a());
                        return;
                    }
                case 8:
                case 9:
                    if (TargetStateEvent.RegPairPinSubmitted.a(i)) {
                        aYE.e(aYE.this, TargetState.StateVerifyRemoteLoginPin.c(aYE.b(aYE.this)) ? TargetState.StateRemoteLogin : TargetState.StateRegPair, message.obj);
                        return;
                    } else if (TargetStateEvent.RegPairPinConfirmationCancelled.a(i)) {
                        aYE.a(aYE.this).e(aYE.a(aYE.this).a("regpair pin confirmation cancelled", MdxErrorSubCode.RegPairPinConfirmationCancelled, null));
                        aYE.d(aYE.this, TargetState.StateNoPair);
                        return;
                    } else if (aYE.a(aYE.this, message)) {
                        return;
                    } else {
                        C1044Mm.c("MdxTargetStateV2", "event %d not handled @%s", Integer.valueOf(i), aYE.b(aYE.this).a());
                        return;
                    }
                case 10:
                    if (TargetStateEvent.PairSucceed.a(i)) {
                        aYE.d(aYE.this, TargetState.StateStartSession);
                        return;
                    } else if (TargetStateEvent.PairFail.a(i)) {
                        C2073aYw.b bVar2 = (C2073aYw.b) message.obj;
                        String d2 = bVar2.d();
                        if (aYE.c(aYE.this, d2)) {
                            return;
                        }
                        aVX a3 = aYE.a(aYE.this).a(bVar2.a(), MdxErrorSubCode.RegPairFailed, d2);
                        aYE.a(aYE.this).l().c(aYE.a(aYE.this).t());
                        aYE.a(aYE.this).e(a3);
                        if (aYE.a(aYE.this).F()) {
                            aYE.a(aYE.this).b(a3);
                        }
                        aYE.d(aYE.this, TargetState.StateNoPair);
                        return;
                    } else if (TargetStateEvent.RegPairPinConfirmationCancelled.a(i)) {
                        aYE.a(aYE.this).e(aYE.a(aYE.this).a("regpair pin confirmation cancelled", MdxErrorSubCode.RegPairPinConfirmationCancelled, null));
                        aYE.d(aYE.this, TargetState.StateNoPair);
                        return;
                    } else if (aYE.a(aYE.this, message)) {
                        return;
                    } else {
                        C1044Mm.c("MdxTargetStateV2", "event %d not handled @%s", Integer.valueOf(i), aYE.b(aYE.this).a());
                        return;
                    }
                case 11:
                    if (TargetStateEvent.RemoteLoginInProgress.a(i)) {
                        aYE.a(aYE.this).l().c(aYE.a(aYE.this).t(), aYE.a(aYE.this).x().b());
                        aYE.a(aYE.this).l().f(aYE.a(aYE.this).t(), aYE.a(aYE.this).m().f().getString(C1605aHm.c.d, aYE.a(aYE.this).k()));
                        C2038aXo c2038aXo = (C2038aXo) aYE.a(aYE.this).m();
                        aYE.a(aYE.this).Q();
                        c2038aXo.d();
                        c2038aXo.c(false, C8454dme.d);
                        return;
                    } else if (TargetStateEvent.RemoteLoginFail.a(i)) {
                        C2073aYw.b bVar3 = (C2073aYw.b) message.obj;
                        String d3 = bVar3.d();
                        if (aYE.c(aYE.this, d3)) {
                            return;
                        }
                        MdxErrorSubCode mdxErrorSubCode3 = MdxErrorSubCode.RemoteLoginAndPairFailed;
                        C1999aWc c = bVar3.c();
                        if (c == null) {
                            c = aYE.a(aYE.this).x();
                        }
                        if (c != null && c.c()) {
                            mdxErrorSubCode2 = c.e(aYE.e(aYE.this)) ? MdxErrorSubCode.RemoteLoginOnlyFailed : mdxErrorSubCode3;
                        } else {
                            mdxErrorSubCode2 = MdxErrorSubCode.RemoteLoginDisabled;
                        }
                        aVX a4 = aYE.a(aYE.this).a(bVar3.a(), mdxErrorSubCode2, d3);
                        aYE.a(aYE.this).l().c(aYE.a(aYE.this).t(), aYE.a(aYE.this).x().b(), a4.a());
                        if (aYE.a(aYE.this).I() && "43".equals(d3)) {
                            aYE.d(aYE.this, TargetState.StateVerifyRemoteLoginPin);
                            return;
                        }
                        if (mdxErrorSubCode2 == mdxErrorSubCode3) {
                            aYE.a(aYE.this).e(a4);
                            if (aYE.a(aYE.this).c(MdxLoginPolicyEnum.LoginAndPair)) {
                                aYE.a(aYE.this).l().c(aYE.a(aYE.this).t());
                                if (aYE.a(aYE.this).F()) {
                                    aYE.a(aYE.this).b(a4);
                                }
                            }
                        }
                        aYE.d(aYE.this, TargetState.StateNoPair);
                        return;
                    } else if (TargetStateEvent.RegPairPinConfirmationCancelled.a(i)) {
                        aYE.a(aYE.this).e(aYE.a(aYE.this).a("remote login pin confirmation cancelled", MdxErrorSubCode.RegPairPinConfirmationCancelled, null));
                        aYE.d(aYE.this, TargetState.StateNoPair);
                        return;
                    } else if (aYE.a(aYE.this, message)) {
                        return;
                    } else {
                        C1044Mm.c("MdxTargetStateV2", "event %d, %d not handled @%s", Integer.valueOf(i), Integer.valueOf(message.arg1), aYE.b(aYE.this).a());
                        return;
                    }
                case 12:
                    if (TargetStateEvent.StartSessionSucceed.a(i)) {
                        aYE.d(aYE.this, TargetState.StateHandShake);
                        aYE.j(aYE.this);
                        return;
                    } else if (aYE.a(aYE.this, message)) {
                        return;
                    } else {
                        C1044Mm.c("MdxTargetStateV2", "event %d not handled @%s", Integer.valueOf(i), aYE.b(aYE.this).a());
                        return;
                    }
                case 13:
                    if (TargetStateEvent.HandShakeSucceed.a(i)) {
                        aYE.a(aYE.this).M();
                        if (aYE.a(aYE.this).d(aYE.c(aYE.this))) {
                            aYE.a(aYE.this).m().n().post(new Runnable() { // from class: o.aYF
                                @Override // java.lang.Runnable
                                public final void run() {
                                    aYE.AnonymousClass1.this.a();
                                }
                            });
                        }
                        if (aYE.a(aYE.this).H()) {
                            aYE.d(aYE.this, TargetState.StateSendingMessage);
                            return;
                        } else {
                            aYE.d(aYE.this, TargetState.StateSessionReady);
                            return;
                        }
                    } else if (aYE.a(aYE.this, message)) {
                        return;
                    } else {
                        C1044Mm.c("MdxTargetStateV2", "event %d not handled @%s", Integer.valueOf(i), aYE.b(aYE.this).a());
                        return;
                    }
                case 14:
                    if (TargetStateEvent.MessageReceived.a(i) && message.arg1 == TargetSessionMessageType.MESSAGE_TYPE_CAPABILITY.p) {
                        if (aYE.a(aYE.this).H()) {
                            aYE.d(aYE.this, TargetState.StateSendingMessage);
                            return;
                        } else {
                            aYE.d(aYE.this, TargetState.StateSessionReady);
                            return;
                        }
                    } else if (aYE.a(aYE.this, message)) {
                        return;
                    } else {
                        C1044Mm.c("MdxTargetStateV2", "event %d, %d not handled @%s", Integer.valueOf(i), Integer.valueOf(message.arg1), aYE.b(aYE.this).a());
                        return;
                    }
                case 15:
                    if (TargetStateEvent.MessageReceived.a(i) && message.arg1 == TargetSessionMessageType.MESSAGE_TYPE_CURRENT_STATE.p) {
                        if (aYE.a(aYE.this).H()) {
                            aYE.d(aYE.this, TargetState.StateSendingMessage);
                            return;
                        } else {
                            aYE.d(aYE.this, TargetState.StateSessionReady);
                            return;
                        }
                    } else if (aYE.a(aYE.this, message)) {
                        return;
                    } else {
                        C1044Mm.c("MdxTargetStateV2", "event %d, %d not handled @%s", Integer.valueOf(i), Integer.valueOf(message.arg1), aYE.b(aYE.this).a());
                        return;
                    }
                case 16:
                    if (TargetStateEvent.SendMessageSucceed.a(i)) {
                        aYE.a(aYE.this).K();
                        if (aYE.a(aYE.this).H()) {
                            aYE.d(aYE.this, TargetState.StateSendingMessage);
                            return;
                        } else {
                            aYE.d(aYE.this, TargetState.StateSessionReady);
                            return;
                        }
                    } else if (aYE.a(aYE.this, message)) {
                        return;
                    } else {
                        C1044Mm.c("MdxTargetStateV2", "event %d, %d not handled @%s", Integer.valueOf(i), Integer.valueOf(message.arg1), aYE.b(aYE.this).a());
                        return;
                    }
                default:
                    return;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            String t = aYE.a(aYE.this).t();
            if (C8168dfL.h(t)) {
                aMH.c().b(t);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.aYE$3  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[TargetStateId.values().length];
            d = iArr;
            try {
                iArr[TargetStateId.STATE_INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[TargetStateId.STATE_NOPAIR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[TargetStateId.STATE_HASPAIR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[TargetStateId.STATE_SESSION_READY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[TargetStateId.STATE_MDXPING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                d[TargetStateId.STATE_ACQUIRE_PAIR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                d[TargetStateId.STATE_ACQUIRE_REMOTE_LOGIN_CONSENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                d[TargetStateId.STATE_VERIFY_REGPAIR_PIN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                d[TargetStateId.STATE_VERIFY_REMOTE_LOGIN_PIN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                d[TargetStateId.STATE_REGPAIR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                d[TargetStateId.STATE_REMOTE_LOGIN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                d[TargetStateId.STATE_START_SESSION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                d[TargetStateId.STATE_HAND_SHAKE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                d[TargetStateId.STATE_GET_CAPABILITIES.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                d[TargetStateId.STATE_GET_STATE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                d[TargetStateId.STATE_SENDING_MESSAGE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public void d() {
        int i2 = 2 % 2;
        int i3 = i + 41;
        h = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.d = null;
            this.b = TargetState.StateInit;
            int i4 = i + 105;
            h = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.d = null;
        this.b = TargetState.StateInit;
        obj.hashCode();
        throw null;
    }

    public void c() {
        int i2 = 2 % 2;
        int i3 = h + 27;
        i = i3 % 128;
        int i4 = i3 % 2;
        this.j.obtainMessage(TargetStateEvent.Start.b()).sendToTarget();
        int i5 = h + 121;
        i = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 87 / 0;
        }
    }

    public void e(TargetStateEvent targetStateEvent) {
        int i2 = 2 % 2;
        int i3 = h + 115;
        i = i3 % 128;
        int i4 = i3 % 2;
        this.j.obtainMessage(targetStateEvent.b()).sendToTarget();
        int i5 = h + 13;
        i = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void c(TargetStateEvent targetStateEvent, Object obj) {
        int i2 = 2 % 2;
        int i3 = i + 85;
        h = i3 % 128;
        if (i3 % 2 != 0) {
            this.j.obtainMessage(targetStateEvent.b(), obj).sendToTarget();
            throw null;
        }
        this.j.obtainMessage(targetStateEvent.b(), obj).sendToTarget();
        int i4 = i + 53;
        h = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 87 / 0;
        }
    }

    public void e(TargetSessionMessageType targetSessionMessageType) {
        int i2 = 2 % 2;
        int i3 = i + 117;
        h = i3 % 128;
        int i4 = i3 % 2;
        this.j.obtainMessage(TargetStateEvent.MessageReceived.b(), targetSessionMessageType.p, 0).sendToTarget();
        int i5 = i + 103;
        h = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void j() {
        int i2 = 2 % 2;
        int i3 = h + 17;
        i = i3 % 128;
        int i4 = i3 % 2;
        this.j.sendEmptyMessageDelayed(TargetStateEvent.PeriodicStateCheck.b(), 25000L);
        int i5 = h + 71;
        i = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (com.netflix.mediaclient.service.mdx.protocol.target.TargetState.StateRegPair.equals(r6.b) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (com.netflix.mediaclient.service.mdx.protocol.target.TargetState.StateRegPair.equals(r6.b) != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            com.netflix.mediaclient.service.mdx.protocol.target.TargetState r1 = com.netflix.mediaclient.service.mdx.protocol.target.TargetState.StateAcquirePair
            com.netflix.mediaclient.service.mdx.protocol.target.TargetState r2 = r6.b
            boolean r1 = r1.equals(r2)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L35
            int r1 = o.aYE.h
            int r1 = r1 + 53
            int r4 = r1 % 128
            o.aYE.i = r4
            int r1 = r1 % r0
            if (r1 != 0) goto L28
            com.netflix.mediaclient.service.mdx.protocol.target.TargetState r1 = com.netflix.mediaclient.service.mdx.protocol.target.TargetState.StateRegPair
            com.netflix.mediaclient.service.mdx.protocol.target.TargetState r4 = r6.b
            boolean r1 = r1.equals(r4)
            r4 = 28
            int r4 = r4 / r3
            if (r1 == 0) goto L33
            goto L35
        L28:
            com.netflix.mediaclient.service.mdx.protocol.target.TargetState r1 = com.netflix.mediaclient.service.mdx.protocol.target.TargetState.StateRegPair
            com.netflix.mediaclient.service.mdx.protocol.target.TargetState r4 = r6.b
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L33
            goto L35
        L33:
            r1 = r3
            goto L36
        L35:
            r1 = r2
        L36:
            com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget r4 = r6.a
            boolean r4 = r4.G()
            if (r4 != 0) goto L86
            com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget r4 = r6.a
            java.util.Set<com.netflix.mediaclient.service.mdx.MdxLoginPolicyEnum> r5 = r6.f
            boolean r4 = r4.d(r5)
            if (r4 == 0) goto L86
            int r4 = o.aYE.h
            int r4 = r4 + 77
            int r5 = r4 % 128
            o.aYE.i = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L84
            if (r1 != 0) goto L87
            com.netflix.mediaclient.service.mdx.protocol.target.TargetState r1 = com.netflix.mediaclient.service.mdx.protocol.target.TargetState.StateRemoteLogin
            com.netflix.mediaclient.service.mdx.protocol.target.TargetState r4 = r6.b
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L60
            goto L87
        L60:
            com.netflix.mediaclient.service.mdx.protocol.target.TargetState r1 = com.netflix.mediaclient.service.mdx.protocol.target.TargetState.StateAcquireRemoteLoginConsent
            com.netflix.mediaclient.service.mdx.protocol.target.TargetState r4 = r6.b
            boolean r1 = r1.equals(r4)
            if (r1 == r2) goto L75
            int r1 = o.aYE.i
            int r1 = r1 + 93
            int r2 = r1 % 128
            o.aYE.h = r2
            int r1 = r1 % r0
            r2 = r3
            goto L87
        L75:
            int r1 = o.aYE.h
            int r1 = r1 + 85
            int r4 = r1 % 128
            o.aYE.i = r4
            int r1 = r1 % r0
            if (r1 != 0) goto L87
            r0 = 94
            int r0 = r0 / r3
            goto L87
        L84:
            r0 = 0
            throw r0
        L86:
            r2 = r1
        L87:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aYE.b():boolean");
    }

    private void c(TargetState targetState) {
        int i2 = 2 % 2;
        int i3 = h + 9;
        i = i3 % 128;
        int i4 = i3 % 2;
        c(targetState, (Object) null);
        int i5 = i + 87;
        h = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Type inference failed for: r6v38, types: [o.aWW] */
    /* JADX WARN: Type inference failed for: r6v42, types: [o.aWW] */
    /* JADX WARN: Type inference failed for: r6v52, types: [o.aWW] */
    /* JADX WARN: Type inference failed for: r6v64, types: [o.aWW] */
    private void c(TargetState targetState, Object obj) {
        int i2 = 2 % 2;
        C1044Mm.c("MdxTargetStateV2", "(%d) state %s => %s", Integer.valueOf(hashCode()), this.b.a(), targetState.a());
        if (!this.b.c(targetState)) {
            this.b.i();
            this.d = this.b;
            this.b = targetState;
        }
        Handler handler = this.j;
        TargetStateEvent targetStateEvent = TargetStateEvent.Timeout;
        handler.removeMessages(targetStateEvent.b());
        switch (AnonymousClass3.d[this.b.d().ordinal()]) {
            case 1:
            case 3:
                return;
            case 2:
                this.a.r();
                this.a.Q();
                if (this.d.c(TargetState.StateVerifyRegPairPin)) {
                    int i3 = h + 15;
                    i = i3 % 128;
                    if (i3 % 2 == 0) {
                        TargetState.StateRegPair.i();
                        r2.hashCode();
                        throw null;
                    }
                    TargetState.StateRegPair.i();
                }
                if (this.d.c(TargetState.StateVerifyRemoteLoginPin)) {
                    int i4 = i + 45;
                    h = i4 % 128;
                    int i5 = i4 % 2;
                    TargetState.StateRemoteLogin.i();
                    return;
                }
                return;
            case 4:
                this.a.r();
                return;
            case 5:
                if (!this.a.N()) {
                    if (this.b.c(this.d)) {
                        return;
                    }
                    this.b = this.d;
                    return;
                }
                int i6 = h + 37;
                i = i6 % 128;
                int i7 = i6 % 2;
                this.b.i();
                this.a.R();
                break;
            case 6:
                if (this.a.N()) {
                    this.b.i();
                }
                this.a.s();
                break;
            case 7:
                this.a.l().h(this.a.t(), this.a.k());
                break;
            case 8:
                this.a.l().j(this.a.t(), this.a.m().f().getString(C1605aHm.c.c, this.a.k()));
                break;
            case 9:
                this.a.l().d(this.a.t(), this.a.m().f().getString(C1605aHm.c.b, this.a.k()), obj instanceof MdxLoginPolicyEnum ? (MdxLoginPolicyEnum) obj : this.a.x().b());
                break;
            case 10:
                r2 = obj instanceof String ? obj.toString() : null;
                boolean c = this.d.c(TargetState.StateVerifyRegPairPin);
                if (r2 == null) {
                    int i8 = i;
                    int i9 = i8 + 5;
                    h = i9 % 128;
                    int i10 = i9 % 2;
                    if (c) {
                        int i11 = i8 + 75;
                        h = i11 % 128;
                        int i12 = i11 % 2;
                        TargetState targetState2 = this.d;
                        this.d = this.b;
                        this.b = targetState2;
                        this.a.l().j(this.a.t(), this.a.m().f().getString(C1605aHm.c.c, this.a.k()));
                        break;
                    }
                }
                this.a.e(r2);
                break;
            case 11:
                r2 = obj instanceof String ? obj.toString() : null;
                boolean c2 = this.d.c(TargetState.StateVerifyRemoteLoginPin);
                if (r2 != null || !c2) {
                    this.a.d(r2);
                    break;
                } else {
                    int i13 = h + 125;
                    i = i13 % 128;
                    int i14 = i13 % 2;
                    TargetState targetState3 = this.d;
                    this.d = this.b;
                    this.b = targetState3;
                    this.a.l().d(this.a.t(), this.a.m().f().getString(C1605aHm.c.b, this.a.k()), this.a.x().b());
                    break;
                }
            case 12:
                this.a.O();
                break;
            case 13:
                this.a.p();
                break;
            case 14:
                this.a.u();
                break;
            case 15:
                this.a.y();
                break;
            case 16:
                if (!this.a.J()) {
                    this.d = this.b;
                    this.b = TargetState.StateSessionReady;
                    return;
                }
                break;
        }
        this.j.sendEmptyMessageDelayed(targetStateEvent.b(), this.b.e());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean e() {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aYE.e():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
        if (r20.equals("40") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0137, code lost:
        if (r19.a.G() != false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0130 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aYE.a(java.lang.String):boolean");
    }

    private boolean f() {
        int i2 = 2 % 2;
        int i3 = i + 111;
        h = i3 % 128;
        int i4 = i3 % 2;
        boolean a = a("");
        int i5 = h + 89;
        i = i5 % 128;
        int i6 = i5 % 2;
        return a;
    }

    private boolean c(Message message) {
        String str;
        MdxErrorSubCode mdxErrorSubCode;
        aVX a;
        int i2 = 2 % 2;
        int i3 = message.what;
        if (!TargetStateEvent.SendMessageFail.a(i3) || this.b.h()) {
            if (!TargetStateEvent.MessageFailRetry.a(i3)) {
                int i4 = h + 57;
                i = i4 % 128;
                Object obj = null;
                if (i4 % 2 == 0) {
                    TargetStateEvent.Timeout.a(i3);
                    obj.hashCode();
                    throw null;
                } else if (!TargetStateEvent.Timeout.a(i3)) {
                    if (TargetStateEvent.SendMessageFailedBadPair.a(i3)) {
                        this.a.Q();
                        c(TargetState.StateAcquirePair);
                    } else if (TargetStateEvent.SendMessageFailedNeedNewSession.a(i3)) {
                        c(TargetState.StateStartSession);
                    } else {
                        if (TargetStateEvent.StartSessionFail.a(i3)) {
                            C1044Mm.c("MdxTargetStateV2", "start session failure @%s", this.b.a());
                            a = this.a.a(((C2059aYi) message.obj).c(), MdxErrorSubCode.SessionStartFailed, null);
                            int i5 = i + 117;
                            h = i5 % 128;
                            if (i5 % 2 != 0) {
                                int i6 = 4 / 3;
                            }
                        } else if (!TargetStateEvent.HandShakeFailed.a(i3)) {
                            C1044Mm.c("MdxTargetStateV2", "event %d not handled @%s", Integer.valueOf(i3), this.b.a());
                            return false;
                        } else {
                            int i7 = i + 111;
                            h = i7 % 128;
                            if (i7 % 2 != 0) {
                                Object[] objArr = new Object[0];
                                objArr[0] = this.b.a();
                                C1044Mm.c("MdxTargetStateV2", "session handshake failure @%s", objArr);
                            } else {
                                C1044Mm.c("MdxTargetStateV2", "session handshake failure @%s", this.b.a());
                            }
                            a = this.a.a("session handshake was rejected", MdxErrorSubCode.SessionHandshakeFailed, null);
                        }
                        if (this.a.F()) {
                            this.a.b(a);
                        }
                        this.a.e(a);
                        c(TargetState.StateNoPair);
                    }
                }
            }
            if (!f()) {
                if (!(!TargetStateEvent.Timeout.a(i3))) {
                    mdxErrorSubCode = b() ? MdxErrorSubCode.PairTimeout : MdxErrorSubCode.SessionTimeout;
                    str = "";
                } else {
                    String str2 = (String) message.obj;
                    if (b()) {
                        MdxErrorSubCode mdxErrorSubCode2 = MdxErrorSubCode.PairFailed;
                        int i8 = i + 91;
                        h = i8 % 128;
                        int i9 = i8 % 2;
                        str = str2;
                        mdxErrorSubCode = mdxErrorSubCode2;
                    } else {
                        str = str2;
                        mdxErrorSubCode = MdxErrorSubCode.SessionFailed;
                    }
                }
                aVX a2 = this.a.a("", mdxErrorSubCode, str);
                this.a.e(a2);
                if (this.a.F()) {
                    this.a.b(a2);
                }
                c(TargetState.StateNoPair);
            } else {
                C1044Mm.c("MdxTargetStateV2", "handle event %d, remaining @%s", Integer.valueOf(i3), this.b.a());
            }
        } else {
            long c = this.b.c();
            C1044Mm.c("MdxTargetStateV2", "SendMessageFailed @%s, retry after %d", this.b.a(), Long.valueOf(c));
            Handler handler = this.j;
            TargetStateEvent targetStateEvent = TargetStateEvent.MessageFailRetry;
            handler.removeMessages(targetStateEvent.b());
            this.j.removeMessages(TargetStateEvent.Timeout.b());
            this.j.sendMessageDelayed(this.j.obtainMessage(targetStateEvent.b(), message.obj), c);
        }
        return true;
    }

    private boolean g() {
        int i2 = 2 % 2;
        int i3 = i + 67;
        h = i3 % 128;
        if (i3 % 2 == 0 ? System.currentTimeMillis() <= this.e + 25000 : System.currentTimeMillis() <= (this.e | 25000)) {
            int i4 = i + 5;
            h = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        this.e = System.currentTimeMillis();
        this.a.y();
        return true;
    }

    private static void k(char[] cArr, char[] cArr2, int i2, char c, char[] cArr3, Object[] objArr) {
        int i3 = 2 % 2;
        C9585sR c9585sR = new C9585sR();
        int length = cArr.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i2));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        c9585sR.d = 0;
        while (c9585sR.d < length3) {
            int i4 = $11 + 71;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = (c9585sR.d + 2) % 4;
            int i7 = (c9585sR.d + 3) % 4;
            c9585sR.a = (char) (((cArr4[c9585sR.d % 4] * 32718) + cArr5[i6]) % 65535);
            cArr5[i7] = (char) (((cArr4[i7] * 32718) + cArr5[i6]) / 65535);
            cArr4[i7] = c9585sR.a;
            cArr6[c9585sR.d] = (char) ((((cArr4[i7] ^ cArr3[c9585sR.d]) ^ (d$s74$2910 ^ (-6422965311034337652L))) ^ ((int) (a$s75$2910 ^ (-6422965311034337652L)))) ^ ((char) (b$s76$2910 ^ (-6422965311034337652L))));
            c9585sR.d++;
            int i8 = $10 + 123;
            $11 = i8 % 128;
            int i9 = i8 % 2;
        }
        objArr[0] = new String(cArr6);
    }
}
