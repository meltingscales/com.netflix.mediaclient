package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.context.iko.UserState;
import com.netflix.cl.model.event.discrete.DebugEvent;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.UiLocked;
import com.netflix.cl.model.event.session.command.ChangeValueCommand;
import com.netflix.cl.model.event.session.command.CloseCommand;
import com.netflix.cl.model.event.session.command.FillVideoCommand;
import com.netflix.cl.model.event.session.command.FitVideoCommand;
import com.netflix.cl.model.event.session.command.LockUiCommand;
import com.netflix.cl.model.event.session.command.PauseCommand;
import com.netflix.cl.model.event.session.command.PlayNextCommand;
import com.netflix.cl.model.event.session.command.SeekCommand;
import com.netflix.cl.model.event.session.command.SelectCommand;
import com.netflix.cl.model.event.session.command.SkipAheadCommand;
import com.netflix.cl.model.event.session.command.UnlockUiCommand;
import com.netflix.cl.model.event.session.command.UnpauseCommand;
import com.netflix.cl.model.event.session.command.ViewEpisodesSelectorCommand;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.LegacyBranchingBookmark;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import com.netflix.mediaclient.ui.player.PlayerExtras;
import com.netflix.mediaclient.ui.player.v2.interactive.MomentState;
import com.netflix.model.leafs.TimeCodesData;
import com.netflix.model.leafs.VideoInfo;
import com.netflix.model.leafs.advisory.ContentAction;
import com.netflix.model.leafs.blades.CreditMarks;
import com.netflix.model.leafs.originals.interactive.Action;
import com.netflix.model.leafs.originals.interactive.Choice;
import com.netflix.model.leafs.originals.interactive.ImpressionData;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.TransitionType;
import com.netflix.model.leafs.originals.interactive.condition.StateHistory;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.C1877aRo;
import o.C5209buT;
import o.C6004cQk;
import o.C6498ceT;
import o.C7460cwd;
import o.C7535cxz;
import o.C8632dsu;
import o.C9737vz;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC5160btX;
import o.InterfaceC5198buI;
import o.InterfaceC7303ctf;
import o.InterfaceC7451cwU;
import o.aJY;
import o.cBA;
import o.cBD;
import o.cBO;
import o.cBQ;
import o.cBR;
import o.dpR;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class cBD {
    public static final b d = new b(null);
    private final InterfaceC7451cwU a;
    private final Observable<dpR> b;
    private final AbstractC5590cBa c;
    private Long e;
    private Long f;
    private final Observable<AbstractC5594cBe> g;
    private final View h;
    private final Observable<cBA> i;
    private final cBK j;

    public cBD(InterfaceC7451cwU interfaceC7451cwU, Observable<cBA> observable, Observable<AbstractC5594cBe> observable2, Observable<dpR> observable3, View view, boolean z, cBK cbk) {
        Map d2;
        Map k;
        Throwable th;
        C8632dsu.c((Object) interfaceC7451cwU, "");
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) observable2, "");
        C8632dsu.c((Object) observable3, "");
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) cbk, "");
        this.a = interfaceC7451cwU;
        this.i = observable;
        this.g = observable2;
        this.b = observable3;
        this.h = view;
        this.j = cbk;
        AbstractC5590cBa e = e();
        this.c = e;
        if (view instanceof ViewGroup) {
            interfaceC7451cwU.e(e.d());
            Observable merge = Observable.merge(e.b());
            final drM<cBO, Boolean> drm = new drM<cBO, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.PlayerUI$playerUIEventsObservable$1
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: a */
                public final Boolean invoke(cBO cbo) {
                    InterfaceC7451cwU interfaceC7451cwU2;
                    C8632dsu.c((Object) cbo, "");
                    interfaceC7451cwU2 = cBD.this.a;
                    return Boolean.valueOf(interfaceC7451cwU2.A() != null);
                }
            };
            Observable<cBO> filter = merge.filter(new Predicate() { // from class: o.cBG
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    boolean f;
                    f = cBD.f(drM.this, obj);
                    return f;
                }
            });
            e(z);
            C8632dsu.d(filter);
            c(filter);
            b(filter);
            return;
        }
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        d2 = dqE.d();
        k = dqE.k(d2);
        C1596aHd c1596aHd = new C1596aHd("Player main container is not a View Group!", null, null, true, k, false, false, 96, null);
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

    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("PlayerUI");
        }
    }

    private final AbstractC5590cBa e() {
        if (this.a.E()) {
            return new cBJ(this.j, this.i, this.b);
        }
        return new cBI(this.j, this.b, this.i, this.g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    @SuppressLint({"CheckResult"})
    private final void e(final boolean z) {
        this.a.e(new cBA.C5549k(z, z));
        Observable<Integer> distinctUntilChanged = C9618tM.e(this.h).takeUntil(this.b).distinctUntilChanged();
        final drM<Integer, dpR> drm = new drM<Integer, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.PlayerUI$initializeWindowAndOrientationObservables$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Integer num) {
                b(num);
                return dpR.c;
            }

            public final void b(Integer num) {
                InterfaceC7451cwU interfaceC7451cwU;
                interfaceC7451cwU = cBD.this.a;
                C8632dsu.d(num);
                interfaceC7451cwU.e(new cBA.aB(num.intValue()));
            }
        };
        distinctUntilChanged.subscribe(new Consumer() { // from class: o.cBL
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                cBD.j(drM.this, obj);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(this.h, new OnApplyWindowInsetsListener() { // from class: o.cBH
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat d2;
                d2 = cBD.d(cBD.this, z, view, windowInsetsCompat);
                return d2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat d(cBD cbd, boolean z, View view, WindowInsetsCompat windowInsetsCompat) {
        C8632dsu.c((Object) cbd, "");
        C8632dsu.c((Object) windowInsetsCompat, "");
        cbd.a.e(new cBA.aF(z, windowInsetsCompat));
        return windowInsetsCompat;
    }

    @SuppressLint({"CheckResult"})
    private final void c(Observable<cBO> observable) {
        Observable<cBO> takeUntil = observable.takeUntil(this.b);
        final drM<cBO, Boolean> drm = new drM<cBO, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.PlayerUI$initializePlayerUiTimeoutObservable$1
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final Boolean invoke(cBO cbo) {
                boolean z;
                boolean d2;
                C8632dsu.c((Object) cbo, "");
                if (cbo instanceof cBQ) {
                    d2 = cBD.this.d(cbo);
                    if (!d2) {
                        z = false;
                        return Boolean.valueOf(z);
                    }
                }
                z = true;
                return Boolean.valueOf(z);
            }
        };
        Observable<cBO> filter = takeUntil.filter(new Predicate() { // from class: o.cBC
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean i;
                i = cBD.i(drM.this, obj);
                return i;
            }
        });
        final drM<cBO, dpR> drm2 = new drM<cBO, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.PlayerUI$initializePlayerUiTimeoutObservable$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cBO cbo) {
                d(cbo);
                return dpR.c;
            }

            public final void d(cBO cbo) {
                InterfaceC7451cwU interfaceC7451cwU;
                interfaceC7451cwU = cBD.this.a;
                interfaceC7451cwU.t();
            }
        };
        filter.subscribe(new Consumer() { // from class: o.cBE
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                cBD.h(drM.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d(cBO cbo) {
        return (!(cbo instanceof cBR) || C8632dsu.c(cbo, cBR.e.c.c) || C8632dsu.c(cbo, cBR.e.a.e) || C8632dsu.c(cbo, cBR.e.d.a) || C8632dsu.c(cbo, cBR.d.a.c)) ? false : true;
    }

    @SuppressLint({"CheckResult"})
    private final void b(Observable<cBO> observable) {
        Observable<cBO> takeUntil = observable.takeUntil(this.b);
        final drM<cBO, dpR> drm = new drM<cBO, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.PlayerUI$initializeUserEventsObservable$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cBO cbo) {
                e(cbo);
                return dpR.c;
            }

            public final void e(cBO cbo) {
                InterfaceC7451cwU interfaceC7451cwU;
                InterfaceC7451cwU interfaceC7451cwU2;
                InterfaceC7451cwU interfaceC7451cwU3;
                InterfaceC7451cwU interfaceC7451cwU4;
                InterfaceC7451cwU interfaceC7451cwU5;
                InterfaceC7451cwU interfaceC7451cwU6;
                InterfaceC7451cwU interfaceC7451cwU7;
                InterfaceC7451cwU interfaceC7451cwU8;
                InterfaceC7451cwU interfaceC7451cwU9;
                InterfaceC7451cwU interfaceC7451cwU10;
                InterfaceC7451cwU interfaceC7451cwU11;
                InterfaceC7451cwU interfaceC7451cwU12;
                InterfaceC7451cwU interfaceC7451cwU13;
                InterfaceC7451cwU interfaceC7451cwU14;
                InterfaceC7451cwU interfaceC7451cwU15;
                Long l;
                InterfaceC7451cwU interfaceC7451cwU16;
                InterfaceC7451cwU interfaceC7451cwU17;
                InterfaceC7451cwU interfaceC7451cwU18;
                Long l2;
                InterfaceC7451cwU interfaceC7451cwU19;
                InterfaceC7451cwU interfaceC7451cwU20;
                InterfaceC7451cwU interfaceC7451cwU21;
                InterfaceC7451cwU interfaceC7451cwU22;
                InterfaceC7451cwU interfaceC7451cwU23;
                InterfaceC7451cwU interfaceC7451cwU24;
                InterfaceC7451cwU interfaceC7451cwU25;
                InterfaceC7451cwU interfaceC7451cwU26;
                InterfaceC7451cwU interfaceC7451cwU27;
                InterfaceC7451cwU interfaceC7451cwU28;
                InterfaceC7451cwU interfaceC7451cwU29;
                InterfaceC7451cwU interfaceC7451cwU30;
                List<Choice> choices;
                InterfaceC7451cwU interfaceC7451cwU31;
                InterfaceC7451cwU interfaceC7451cwU32;
                View view;
                InterfaceC7451cwU interfaceC7451cwU33;
                InterfaceC7451cwU interfaceC7451cwU34;
                Choice.ChoiceAction action;
                String type;
                InterfaceC7451cwU interfaceC7451cwU35;
                InterfaceC7451cwU interfaceC7451cwU36;
                InterfaceC7451cwU interfaceC7451cwU37;
                InterfaceC7451cwU interfaceC7451cwU38;
                InteractiveMoments e;
                StateHistory stateHistory;
                InterfaceC7451cwU interfaceC7451cwU39;
                InterfaceC7451cwU interfaceC7451cwU40;
                long e2;
                InterfaceC7451cwU interfaceC7451cwU41;
                InterfaceC7451cwU interfaceC7451cwU42;
                InterfaceC7451cwU interfaceC7451cwU43;
                InterfaceC7451cwU interfaceC7451cwU44;
                InterfaceC7451cwU interfaceC7451cwU45;
                String m;
                InterfaceC7451cwU interfaceC7451cwU46;
                InterfaceC7451cwU interfaceC7451cwU47;
                String e3;
                PlaylistTimestamp l3;
                InterfaceC7451cwU interfaceC7451cwU48;
                InterfaceC7451cwU interfaceC7451cwU49;
                InterfaceC7451cwU interfaceC7451cwU50;
                InterfaceC7451cwU interfaceC7451cwU51;
                InterfaceC7451cwU interfaceC7451cwU52;
                InterfaceC7451cwU interfaceC7451cwU53;
                InterfaceC7451cwU interfaceC7451cwU54;
                InterfaceC7451cwU interfaceC7451cwU55;
                InterfaceC7451cwU interfaceC7451cwU56;
                InterfaceC7451cwU interfaceC7451cwU57;
                InterfaceC7451cwU interfaceC7451cwU58;
                InterfaceC7451cwU interfaceC7451cwU59;
                InterfaceC7451cwU interfaceC7451cwU60;
                InterfaceC7451cwU interfaceC7451cwU61;
                InterfaceC7451cwU interfaceC7451cwU62;
                InterfaceC7451cwU interfaceC7451cwU63;
                InterfaceC7451cwU interfaceC7451cwU64;
                InterfaceC7451cwU interfaceC7451cwU65;
                InterfaceC7451cwU interfaceC7451cwU66;
                InterfaceC7451cwU interfaceC7451cwU67;
                InterfaceC7451cwU interfaceC7451cwU68;
                InterfaceC7451cwU interfaceC7451cwU69;
                InterfaceC7451cwU interfaceC7451cwU70;
                InterfaceC7451cwU interfaceC7451cwU71;
                InterfaceC7451cwU interfaceC7451cwU72;
                InterfaceC7451cwU interfaceC7451cwU73;
                InterfaceC7451cwU interfaceC7451cwU74;
                InterfaceC7451cwU interfaceC7451cwU75;
                InterfaceC7451cwU interfaceC7451cwU76;
                InterfaceC7451cwU interfaceC7451cwU77;
                InterfaceC7451cwU interfaceC7451cwU78;
                InterfaceC7451cwU interfaceC7451cwU79;
                InterfaceC7451cwU interfaceC7451cwU80;
                InterfaceC7451cwU interfaceC7451cwU81;
                InterfaceC7451cwU interfaceC7451cwU82;
                InterfaceC7451cwU interfaceC7451cwU83;
                InterfaceC7451cwU interfaceC7451cwU84;
                InterfaceC7451cwU interfaceC7451cwU85;
                InterfaceC7451cwU interfaceC7451cwU86;
                InterfaceC7451cwU interfaceC7451cwU87;
                InterfaceC7451cwU interfaceC7451cwU88;
                InterfaceC7451cwU interfaceC7451cwU89;
                InterfaceC7451cwU interfaceC7451cwU90;
                InterfaceC7451cwU interfaceC7451cwU91;
                InterfaceC7451cwU interfaceC7451cwU92;
                InterfaceC7451cwU interfaceC7451cwU93;
                InterfaceC7451cwU interfaceC7451cwU94;
                InterfaceC7451cwU interfaceC7451cwU95;
                InterfaceC7451cwU interfaceC7451cwU96;
                InterfaceC7451cwU interfaceC7451cwU97;
                InterfaceC7451cwU interfaceC7451cwU98;
                InterfaceC7451cwU interfaceC7451cwU99;
                InterfaceC7451cwU interfaceC7451cwU100;
                InterfaceC7451cwU interfaceC7451cwU101;
                InterfaceC7451cwU interfaceC7451cwU102;
                String aH_;
                View view2;
                InterfaceC7451cwU interfaceC7451cwU103;
                InterfaceC7451cwU interfaceC7451cwU104;
                InterfaceC7451cwU interfaceC7451cwU105;
                InterfaceC7451cwU interfaceC7451cwU106;
                VideoInfo.TimeCodes B;
                TimeCodesData timeCodesData;
                CreditMarks creditMarks;
                VideoInfo.TimeCodes B2;
                TimeCodesData timeCodesData2;
                CreditMarks creditMarks2;
                InterfaceC7451cwU interfaceC7451cwU107;
                InterfaceC7451cwU interfaceC7451cwU108;
                InterfaceC7451cwU interfaceC7451cwU109;
                String aH_2;
                View view3;
                InterfaceC7451cwU interfaceC7451cwU110;
                InterfaceC7451cwU interfaceC7451cwU111;
                InterfaceC7451cwU interfaceC7451cwU112;
                InterfaceC7451cwU interfaceC7451cwU113;
                VideoInfo.TimeCodes B3;
                TimeCodesData timeCodesData3;
                CreditMarks creditMarks3;
                VideoInfo.TimeCodes B4;
                TimeCodesData timeCodesData4;
                CreditMarks creditMarks4;
                InterfaceC7451cwU interfaceC7451cwU114;
                InterfaceC7451cwU interfaceC7451cwU115;
                InterfaceC7451cwU interfaceC7451cwU116;
                InterfaceC7451cwU interfaceC7451cwU117;
                InterfaceC7451cwU interfaceC7451cwU118;
                InterfaceC7451cwU interfaceC7451cwU119;
                InterfaceC7451cwU interfaceC7451cwU120;
                InterfaceC7451cwU interfaceC7451cwU121;
                InterfaceC7451cwU interfaceC7451cwU122;
                InterfaceC7451cwU interfaceC7451cwU123;
                InterfaceC7451cwU interfaceC7451cwU124;
                InterfaceC7451cwU interfaceC7451cwU125;
                InterfaceC7451cwU interfaceC7451cwU126;
                InterfaceC7451cwU interfaceC7451cwU127;
                InterfaceC7451cwU interfaceC7451cwU128;
                InterfaceC7451cwU interfaceC7451cwU129;
                InterfaceC7451cwU interfaceC7451cwU130;
                InterfaceC7451cwU interfaceC7451cwU131;
                InterfaceC7451cwU interfaceC7451cwU132;
                InterfaceC7451cwU interfaceC7451cwU133;
                InterfaceC7451cwU interfaceC7451cwU134;
                InterfaceC7451cwU interfaceC7451cwU135;
                InterfaceC7451cwU interfaceC7451cwU136;
                InterfaceC7451cwU interfaceC7451cwU137;
                InterfaceC7451cwU interfaceC7451cwU138;
                InterfaceC7451cwU interfaceC7451cwU139;
                InterfaceC7451cwU interfaceC7451cwU140;
                InterfaceC7451cwU interfaceC7451cwU141;
                InterfaceC7451cwU interfaceC7451cwU142;
                InterfaceC7451cwU interfaceC7451cwU143;
                InterfaceC7451cwU interfaceC7451cwU144;
                InterfaceC7451cwU interfaceC7451cwU145;
                InterfaceC7451cwU interfaceC7451cwU146;
                InterfaceC7451cwU interfaceC7451cwU147;
                InterfaceC7451cwU interfaceC7451cwU148;
                InterfaceC7451cwU interfaceC7451cwU149;
                View view4;
                InterfaceC7451cwU interfaceC7451cwU150;
                InteractiveSceneConfig config;
                InterfaceC7451cwU interfaceC7451cwU151;
                InterfaceC7451cwU interfaceC7451cwU152;
                InterfaceC7451cwU interfaceC7451cwU153;
                InterfaceC7451cwU interfaceC7451cwU154;
                InterfaceC7451cwU interfaceC7451cwU155;
                InterfaceC7451cwU interfaceC7451cwU156;
                InterfaceC7451cwU interfaceC7451cwU157;
                Observable observable2;
                InterfaceC7451cwU interfaceC7451cwU158;
                InterfaceC7451cwU interfaceC7451cwU159;
                InterfaceC7451cwU interfaceC7451cwU160;
                InterfaceC7451cwU interfaceC7451cwU161;
                InterfaceC7451cwU interfaceC7451cwU162;
                InterfaceC7451cwU interfaceC7451cwU163;
                InterfaceC7451cwU interfaceC7451cwU164;
                if (cbo instanceof cBQ.f) {
                    interfaceC7451cwU160 = cBD.this.a;
                    interfaceC7451cwU160.Z();
                    interfaceC7451cwU161 = cBD.this.a;
                    interfaceC7451cwU161.z();
                    interfaceC7451cwU162 = cBD.this.a;
                    interfaceC7451cwU162.e(cBA.M.e);
                    interfaceC7451cwU163 = cBD.this.a;
                    interfaceC7451cwU163.e(true);
                    interfaceC7451cwU164 = cBD.this.a;
                    interfaceC7451cwU164.T();
                    return;
                }
                Object obj = null;
                r4 = null;
                ContentAction contentAction = null;
                CreditMarks ap_ = null;
                CreditMarks ap_2 = null;
                PlaylistTimestamp a = null;
                if (cbo instanceof cBQ.h) {
                    cBQ.h hVar = (cBQ.h) cbo;
                    int e4 = hVar.e();
                    if (e4 == 0) {
                        contentAction = ContentAction.LOG_WHEN_SHOWN;
                        interfaceC7451cwU157 = cBD.this.a;
                        interfaceC7451cwU157.e(hVar.c());
                    } else if (e4 == 1) {
                        contentAction = ContentAction.NEVER_SHOW_AGAIN;
                        interfaceC7451cwU158 = cBD.this.a;
                        interfaceC7451cwU158.J();
                    } else if (e4 == 2) {
                        interfaceC7451cwU159 = cBD.this.a;
                        interfaceC7451cwU159.J();
                    }
                    if (contentAction != null) {
                        cBD cbd = cBD.this;
                        Completable a2 = new C6004cQk().a(hVar.c(), contentAction);
                        observable2 = cbd.b;
                        a2.takeUntil(observable2.ignoreElements()).subscribe();
                    }
                } else if (cbo instanceof cBQ.t) {
                    interfaceC7451cwU155 = cBD.this.a;
                    cBQ.t tVar = (cBQ.t) cbo;
                    interfaceC7451cwU155.d(tVar.c());
                    interfaceC7451cwU156 = cBD.this.a;
                    interfaceC7451cwU156.e(new cBA.au(tVar.c()));
                } else if (cbo instanceof cBQ.q) {
                    interfaceC7451cwU154 = cBD.this.a;
                    cBQ.q qVar = (cBQ.q) cbo;
                    interfaceC7451cwU154.e(new cBA.ar(qVar.c(), qVar.d(), qVar.b(), qVar.a()));
                } else if (cbo instanceof cBQ.p) {
                    cBQ.p pVar = (cBQ.p) cbo;
                    MomentState c = pVar.c();
                    Moment d2 = pVar.d();
                    if (c != MomentState.b) {
                        interfaceC7451cwU152 = cBD.this.a;
                        interfaceC7451cwU152.e(cBA.C5541c.c);
                        interfaceC7451cwU153 = cBD.this.a;
                        interfaceC7451cwU153.h(true);
                    }
                    interfaceC7451cwU150 = cBD.this.a;
                    interfaceC7451cwU150.e(new cBA.C5547i(c, d2));
                    if (c == MomentState.c && (config = d2.config()) != null && config.pausePlaybackOnEnter()) {
                        interfaceC7451cwU151 = cBD.this.a;
                        interfaceC7451cwU151.z();
                    }
                } else if (cbo instanceof cBO.C5567c) {
                    CLv2Utils cLv2Utils = CLv2Utils.INSTANCE;
                    AppView appView = AppView.closeButton;
                    cLv2Utils.d(appView, CommandValue.CloseCommand, null, new Focus(appView, null), new CloseCommand(), false, null);
                    interfaceC7451cwU149 = cBD.this.a;
                    interfaceC7451cwU149.a(true);
                    view4 = cBD.this.h;
                    Context context = view4.getContext();
                    C8632dsu.a(context, "");
                    ((NetflixActivity) C9737vz.e(context, NetflixActivity.class)).exit();
                } else if (cbo instanceof cBO.C5565a) {
                    if (C1877aRo.b.b()) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("ab55877Action", "exitPlayback");
                            Logger.INSTANCE.logEvent(new DebugEvent(jSONObject));
                        } catch (JSONException unused) {
                        }
                    }
                } else if (cbo instanceof cBO.F) {
                    C6498ceT.c();
                    interfaceC7451cwU148 = cBD.this.a;
                    interfaceC7451cwU148.n();
                } else if (cbo instanceof cBO.D) {
                    interfaceC7451cwU147 = cBD.this.a;
                    interfaceC7451cwU147.l();
                } else if (cbo instanceof cBO.A) {
                    interfaceC7451cwU143 = cBD.this.a;
                    interfaceC7451cwU143.z();
                    interfaceC7451cwU144 = cBD.this.a;
                    interfaceC7451cwU144.c(((cBO.A) cbo).e());
                    interfaceC7451cwU145 = cBD.this.a;
                    interfaceC7451cwU146 = cBD.this.a;
                    C7535cxz u = interfaceC7451cwU146.u();
                    interfaceC7451cwU145.e(new cBA.ay(u != null ? u.m() : null));
                } else if (cbo instanceof cBO.C5589z) {
                    interfaceC7451cwU141 = cBD.this.a;
                    interfaceC7451cwU141.z();
                    interfaceC7451cwU142 = cBD.this.a;
                    interfaceC7451cwU142.d(((cBO.C5589z) cbo).d());
                } else if (cbo instanceof cBO.C5581q) {
                    interfaceC7451cwU138 = cBD.this.a;
                    aJY B5 = interfaceC7451cwU138.B();
                    if (B5 != null && B5.ab()) {
                        CLv2Utils.INSTANCE.e(new Focus(AppView.pauseButton, null), new PauseCommand());
                        interfaceC7451cwU140 = cBD.this.a;
                        interfaceC7451cwU140.r();
                        return;
                    }
                    CLv2Utils.INSTANCE.e(new Focus(AppView.playButton, null), new UnpauseCommand());
                    interfaceC7451cwU139 = cBD.this.a;
                    interfaceC7451cwU139.q();
                } else if (cbo instanceof cBO.U) {
                    interfaceC7451cwU135 = cBD.this.a;
                    interfaceC7451cwU135.z();
                    interfaceC7451cwU136 = cBD.this.a;
                    interfaceC7451cwU136.F();
                    interfaceC7451cwU137 = cBD.this.a;
                    interfaceC7451cwU137.g(false);
                } else if (cbo instanceof cBO.C5582r) {
                    cBO.C5582r c5582r = (cBO.C5582r) cbo;
                    boolean e5 = c5582r.e();
                    int b2 = c5582r.b();
                    if (e5) {
                        CLv2Utils.INSTANCE.e(new Focus(AppView.trickplayScrubberThumb, null), new SeekCommand());
                        interfaceC7451cwU132 = cBD.this.a;
                        interfaceC7451cwU132.c(false);
                        interfaceC7451cwU133 = cBD.this.a;
                        interfaceC7451cwU133.e(cBA.ap.a);
                        interfaceC7451cwU134 = cBD.this.a;
                        interfaceC7451cwU134.d(b2, false);
                    } else if (c5582r.d()) {
                        interfaceC7451cwU131 = cBD.this.a;
                        interfaceC7451cwU131.d(-b2, true);
                    } else {
                        interfaceC7451cwU130 = cBD.this.a;
                        interfaceC7451cwU130.d(b2, true);
                    }
                } else if (cbo instanceof cBO.C5577m) {
                    interfaceC7451cwU124 = cBD.this.a;
                    interfaceC7451cwU124.ac();
                    interfaceC7451cwU125 = cBD.this.a;
                    interfaceC7451cwU125.c(true);
                    cBO.C5577m c5577m = (cBO.C5577m) cbo;
                    int d3 = c5577m.d();
                    interfaceC7451cwU126 = cBD.this.a;
                    int c2 = c5577m.c();
                    interfaceC7451cwU127 = cBD.this.a;
                    interfaceC7451cwU126.e(new cBA.an(d3, c2, interfaceC7451cwU127.a(d3), false, 8, null));
                    interfaceC7451cwU128 = cBD.this.a;
                    interfaceC7451cwU128.z();
                    interfaceC7451cwU129 = cBD.this.a;
                    interfaceC7451cwU129.F();
                } else if (cbo instanceof cBO.C5579o) {
                    interfaceC7451cwU121 = cBD.this.a;
                    interfaceC7451cwU121.z();
                    cBO.C5579o c5579o = (cBO.C5579o) cbo;
                    int d4 = c5579o.d();
                    interfaceC7451cwU122 = cBD.this.a;
                    int b3 = c5579o.b();
                    boolean c3 = c5579o.c();
                    interfaceC7451cwU123 = cBD.this.a;
                    interfaceC7451cwU122.e(new cBA.aq(d4, b3, c3, interfaceC7451cwU123.a(d4)));
                } else if (cbo instanceof cBO.C5584t) {
                    boolean c4 = ((cBO.C5584t) cbo).c();
                    CLv2Utils.INSTANCE.b(new Focus(c4 ? AppView.skipBackButton : AppView.skipAheadButton, null), c4, false);
                } else if (cbo instanceof cBO.G) {
                    CLv2Utils.INSTANCE.e(new Focus(AppView.episodesSelector, null), new ViewEpisodesSelectorCommand());
                    interfaceC7451cwU119 = cBD.this.a;
                    interfaceC7451cwU119.ac();
                    interfaceC7451cwU120 = cBD.this.a;
                    interfaceC7451cwU120.W();
                } else if (cbo instanceof cBO.C) {
                    interfaceC7451cwU117 = cBD.this.a;
                    interfaceC7451cwU117.ac();
                    interfaceC7451cwU118 = cBD.this.a;
                    interfaceC7451cwU118.U();
                } else if (cbo instanceof cBO.C5583s) {
                    interfaceC7451cwU115 = cBD.this.a;
                    InterfaceC5198buI v = interfaceC7451cwU115.v();
                    if (v != null) {
                        cBD cbd2 = cBD.this;
                        CLv2Utils.INSTANCE.e(new Focus(AppView.nextEpisodeButton, CLv2Utils.a(Collections.singletonMap("trackId", Integer.valueOf(PlayContextImp.i)))), new PlayNextCommand());
                        interfaceC7451cwU116 = cbd2.a;
                        interfaceC7451cwU116.a(new C7535cxz(v, PlayContextImp.f, v.aE_().aF_(), null));
                        dpR dpr = dpR.c;
                    }
                } else if (cbo instanceof cBO.J) {
                    CLv2Utils.INSTANCE.e(new Focus(AppView.skipIntroButton, null), new SkipAheadCommand());
                    interfaceC7451cwU109 = cBD.this.a;
                    InterfaceC5160btX A = interfaceC7451cwU109.A();
                    if (A == null || (aH_2 = A.aH_()) == null) {
                        return;
                    }
                    cBD cbd3 = cBD.this;
                    InterfaceC7303ctf.a aVar = InterfaceC7303ctf.c;
                    view3 = cbd3.h;
                    Context context2 = view3.getContext();
                    C8632dsu.a(context2, "");
                    C7460cwd e6 = aVar.a(context2).e(aH_2);
                    interfaceC7451cwU110 = cbd3.a;
                    if (interfaceC7451cwU110.c(e6)) {
                        if (e6 == null || (B4 = e6.B()) == null || (timeCodesData4 = B4.getTimeCodesData()) == null || (creditMarks4 = timeCodesData4.creditMarks()) == null) {
                            return;
                        }
                        interfaceC7451cwU114 = cbd3.a;
                        interfaceC7451cwU114.d(creditMarks4.endCredit(), false);
                        dpR dpr2 = dpR.c;
                        return;
                    }
                    interfaceC7451cwU111 = cbd3.a;
                    InterfaceC5160btX A2 = interfaceC7451cwU111.A();
                    if (A2 == null || (B3 = A2.B()) == null || (timeCodesData3 = B3.getTimeCodesData()) == null || (creditMarks3 = timeCodesData3.creditMarks()) == null) {
                        interfaceC7451cwU112 = cbd3.a;
                        InterfaceC5160btX A3 = interfaceC7451cwU112.A();
                        if (A3 != null) {
                            ap_ = A3.ap_();
                        }
                    } else {
                        ap_ = creditMarks3;
                    }
                    if (ap_ != null) {
                        interfaceC7451cwU113 = cbd3.a;
                        interfaceC7451cwU113.d(ap_.endCredit(), false);
                        dpR dpr3 = dpR.c;
                    }
                } else if (cbo instanceof cBO.L) {
                    CLv2Utils.INSTANCE.e(new Focus(AppView.skipRecapButton, null), new SkipAheadCommand());
                    interfaceC7451cwU101 = cBD.this.a;
                    if (interfaceC7451cwU101.H()) {
                        interfaceC7451cwU108 = cBD.this.a;
                        interfaceC7451cwU108.N();
                        return;
                    }
                    interfaceC7451cwU102 = cBD.this.a;
                    InterfaceC5160btX A4 = interfaceC7451cwU102.A();
                    if (A4 == null || (aH_ = A4.aH_()) == null) {
                        return;
                    }
                    cBD cbd4 = cBD.this;
                    InterfaceC7303ctf.a aVar2 = InterfaceC7303ctf.c;
                    view2 = cbd4.h;
                    Context context3 = view2.getContext();
                    C8632dsu.a(context3, "");
                    C7460cwd e7 = aVar2.a(context3).e(aH_);
                    interfaceC7451cwU103 = cbd4.a;
                    if (interfaceC7451cwU103.c(e7)) {
                        if (e7 == null || (B2 = e7.B()) == null || (timeCodesData2 = B2.getTimeCodesData()) == null || (creditMarks2 = timeCodesData2.creditMarks()) == null) {
                            return;
                        }
                        interfaceC7451cwU107 = cbd4.a;
                        interfaceC7451cwU107.d(creditMarks2.endRecap(), false);
                        dpR dpr4 = dpR.c;
                        return;
                    }
                    interfaceC7451cwU104 = cbd4.a;
                    InterfaceC5160btX A5 = interfaceC7451cwU104.A();
                    if (A5 == null || (B = A5.B()) == null || (timeCodesData = B.getTimeCodesData()) == null || (creditMarks = timeCodesData.creditMarks()) == null) {
                        interfaceC7451cwU105 = cbd4.a;
                        InterfaceC5160btX A6 = interfaceC7451cwU105.A();
                        if (A6 != null) {
                            ap_2 = A6.ap_();
                        }
                    } else {
                        ap_2 = creditMarks;
                    }
                    if (ap_2 != null) {
                        interfaceC7451cwU106 = cbd4.a;
                        interfaceC7451cwU106.d(ap_2.endRecap(), false);
                        dpR dpr5 = dpR.c;
                    }
                } else if (cbo instanceof cBO.K) {
                    interfaceC7451cwU98 = cBD.this.a;
                    if (interfaceC7451cwU98.H()) {
                        interfaceC7451cwU100 = cBD.this.a;
                        interfaceC7451cwU100.N();
                        return;
                    }
                    interfaceC7451cwU99 = cBD.this.a;
                    interfaceC7451cwU99.d(((cBO.K) cbo).d(), false);
                } else if (cbo instanceof cBQ.j) {
                    interfaceC7451cwU96 = cBD.this.a;
                    interfaceC7451cwU96.V();
                    interfaceC7451cwU97 = cBD.this.a;
                    interfaceC7451cwU97.a(((cBQ.j) cbo).b());
                } else if (cbo instanceof cBQ.i) {
                    interfaceC7451cwU95 = cBD.this.a;
                    interfaceC7451cwU95.p();
                } else if ((cbo instanceof cBO.M) || (cbo instanceof cBO.O) || (cbo instanceof cBO.P)) {
                } else {
                    if (cbo instanceof cBO.C5586v) {
                        interfaceC7451cwU88 = cBD.this.a;
                        if (interfaceC7451cwU88.I()) {
                            return;
                        }
                        interfaceC7451cwU89 = cBD.this.a;
                        if (interfaceC7451cwU89.x() == null) {
                            interfaceC7451cwU90 = cBD.this.a;
                            if (interfaceC7451cwU90.E()) {
                                return;
                            }
                            cBO.C5586v c5586v = (cBO.C5586v) cbo;
                            boolean e8 = c5586v.e();
                            boolean d5 = c5586v.d();
                            interfaceC7451cwU91 = cBD.this.a;
                            interfaceC7451cwU91.h(!d5);
                            interfaceC7451cwU92 = cBD.this.a;
                            interfaceC7451cwU92.e(new cBA.C5545g(e8));
                            if (e8) {
                                CLv2Utils.INSTANCE.b(new Focus(AppView.skipBackButton, null), true, true);
                                interfaceC7451cwU94 = cBD.this.a;
                                interfaceC7451cwU94.d(-10000, true);
                                return;
                            }
                            CLv2Utils.INSTANCE.b(new Focus(AppView.skipAheadButton, null), false, true);
                            interfaceC7451cwU93 = cBD.this.a;
                            interfaceC7451cwU93.d(10000, true);
                        }
                    } else if (cbo instanceof cBO.C5568d) {
                        interfaceC7451cwU80 = cBD.this.a;
                        if (interfaceC7451cwU80.I()) {
                            interfaceC7451cwU82 = cBD.this.a;
                            if (!interfaceC7451cwU82.E()) {
                                interfaceC7451cwU83 = cBD.this.a;
                                interfaceC7451cwU83.b(false);
                                interfaceC7451cwU84 = cBD.this.a;
                                interfaceC7451cwU84.d(true);
                                interfaceC7451cwU85 = cBD.this.a;
                                if (interfaceC7451cwU85.B() != null) {
                                    interfaceC7451cwU86 = cBD.this.a;
                                    aJY B6 = interfaceC7451cwU86.B();
                                    if (B6 != null) {
                                        interfaceC7451cwU87 = cBD.this.a;
                                        B6.setPlayerBackgroundable(interfaceC7451cwU87.C());
                                        dpR dpr6 = dpR.c;
                                    }
                                }
                            }
                        }
                        interfaceC7451cwU81 = cBD.this.a;
                        interfaceC7451cwU81.e(cBA.C5541c.c);
                    } else if (cbo instanceof cBO.I) {
                        interfaceC7451cwU79 = cBD.this.a;
                        interfaceC7451cwU79.e(cBA.C5548j.d);
                    } else if (cbo instanceof cBO.C5580p) {
                        CLv2Utils.d(new FitVideoCommand());
                        interfaceC7451cwU78 = cBD.this.a;
                        interfaceC7451cwU78.j(false);
                    } else if (cbo instanceof cBO.C5576l) {
                        CLv2Utils.d(new FillVideoCommand());
                        interfaceC7451cwU77 = cBD.this.a;
                        interfaceC7451cwU77.j(true);
                    } else if (cbo instanceof cBO.X) {
                    } else {
                        if (cbo instanceof cBO.y) {
                            interfaceC7451cwU69 = cBD.this.a;
                            if (interfaceC7451cwU69.I()) {
                                interfaceC7451cwU71 = cBD.this.a;
                                if (!interfaceC7451cwU71.E()) {
                                    interfaceC7451cwU72 = cBD.this.a;
                                    interfaceC7451cwU72.b(false);
                                    interfaceC7451cwU73 = cBD.this.a;
                                    interfaceC7451cwU73.d(true);
                                    interfaceC7451cwU74 = cBD.this.a;
                                    aJY B7 = interfaceC7451cwU74.B();
                                    if (B7 != null) {
                                        interfaceC7451cwU76 = cBD.this.a;
                                        B7.setPlayerBackgroundable(interfaceC7451cwU76.C());
                                        dpR dpr7 = dpR.c;
                                    }
                                    if (C1877aRo.b.e()) {
                                        interfaceC7451cwU75 = cBD.this.a;
                                        if (!interfaceC7451cwU75.G()) {
                                            JSONObject jSONObject2 = new JSONObject();
                                            try {
                                                jSONObject2.put("ab55877Action", "watchCredits");
                                                Logger.INSTANCE.logEvent(new DebugEvent(jSONObject2));
                                            } catch (JSONException unused2) {
                                            }
                                        }
                                    }
                                }
                            }
                            interfaceC7451cwU70 = cBD.this.a;
                            interfaceC7451cwU70.e(cBA.C5541c.c);
                        } else if (cbo instanceof cBO.C5588x) {
                            interfaceC7451cwU64 = cBD.this.a;
                            if (interfaceC7451cwU64.I()) {
                                interfaceC7451cwU67 = cBD.this.a;
                                interfaceC7451cwU67.b(false);
                                interfaceC7451cwU68 = cBD.this.a;
                                interfaceC7451cwU68.d(true);
                            }
                            interfaceC7451cwU65 = cBD.this.a;
                            interfaceC7451cwU65.e(cBA.C5541c.c);
                            interfaceC7451cwU66 = cBD.this.a;
                            interfaceC7451cwU66.N();
                        } else if (cbo instanceof cBO.C5571g) {
                            interfaceC7451cwU61 = cBD.this.a;
                            interfaceC7451cwU61.R();
                            interfaceC7451cwU62 = cBD.this.a;
                            interfaceC7451cwU62.e(false);
                            interfaceC7451cwU63 = cBD.this.a;
                            interfaceC7451cwU63.q();
                        } else if (cbo instanceof cBO.C5570f) {
                            interfaceC7451cwU58 = cBD.this.a;
                            interfaceC7451cwU58.R();
                            interfaceC7451cwU59 = cBD.this.a;
                            interfaceC7451cwU59.e(false);
                            interfaceC7451cwU60 = cBD.this.a;
                            interfaceC7451cwU60.d(0, false);
                        } else if (cbo instanceof cBO.C5574j) {
                            interfaceC7451cwU55 = cBD.this.a;
                            interfaceC7451cwU55.R();
                            interfaceC7451cwU56 = cBD.this.a;
                            interfaceC7451cwU56.e(false);
                            interfaceC7451cwU57 = cBD.this.a;
                            interfaceC7451cwU57.m();
                        } else if (cbo instanceof cBO.R) {
                            interfaceC7451cwU54 = cBD.this.a;
                            interfaceC7451cwU54.a(((cBO.R) cbo).c());
                        } else if (cbo instanceof cBO.E) {
                        } else {
                            if (cbo instanceof cBO.B) {
                                interfaceC7451cwU51 = cBD.this.a;
                                if (interfaceC7451cwU51.x() != null) {
                                    interfaceC7451cwU53 = cBD.this.a;
                                    interfaceC7451cwU53.c(6, true);
                                    return;
                                }
                                interfaceC7451cwU52 = cBD.this.a;
                                cBO.B b4 = (cBO.B) cbo;
                                interfaceC7451cwU52.c(b4.d(), b4.a());
                            } else if (cbo instanceof cBQ.d) {
                                interfaceC7451cwU50 = cBD.this.a;
                                cBQ.d dVar = (cBQ.d) cbo;
                                InterfaceC7451cwU.a.d(interfaceC7451cwU50, dVar.a(), dVar.e(), dVar.d(), dVar.b(), null, null, dVar.c(), 48, null);
                            } else {
                                long j = 0;
                                if (cbo instanceof cBQ.b) {
                                    cBQ.b bVar = (cBQ.b) cbo;
                                    ImpressionData c5 = bVar.c();
                                    if (c5 != null) {
                                        interfaceC7451cwU49 = cBD.this.a;
                                        interfaceC7451cwU49.b(c5);
                                        dpR dpr8 = dpR.c;
                                    }
                                    if (bVar.h()) {
                                        interfaceC7451cwU48 = cBD.this.a;
                                        interfaceC7451cwU48.M();
                                    }
                                    interfaceC7451cwU46 = cBD.this.a;
                                    interfaceC7451cwU46.e(new cBA.G(bVar.d(), bVar.e(), bVar.b(), bVar.h(), false, bVar.a()));
                                    interfaceC7451cwU47 = cBD.this.a;
                                    aJY B8 = interfaceC7451cwU47.B();
                                    aJY ajy = B8 instanceof aJY ? B8 : null;
                                    if (ajy == null || (e3 = bVar.e()) == null || (l3 = ajy.l()) == null) {
                                        return;
                                    }
                                    if (bVar.f() != TransitionType.IMMEDIATE) {
                                        String str = l3.a;
                                        C8632dsu.a(str, "");
                                        ajy.d(str, e3);
                                        return;
                                    }
                                    ajy.d(new PlaylistTimestamp(l3.c, e3, 0L));
                                    dpR dpr9 = dpR.c;
                                } else if (cbo instanceof cBQ.e) {
                                    interfaceC7451cwU39 = cBD.this.a;
                                    aJY B9 = interfaceC7451cwU39.B();
                                    if (B9 != null) {
                                        cBD cbd5 = cBD.this;
                                        PlaylistMap H = B9.H();
                                        if (H != null) {
                                            cBQ.e eVar = (cBQ.e) cbo;
                                            Moment d6 = eVar.d();
                                            String b5 = eVar.b();
                                            interfaceC7451cwU40 = cbd5.a;
                                            C7535cxz u2 = interfaceC7451cwU40.u();
                                            if (u2 == null || (m = u2.m()) == null) {
                                                e2 = H.e(b5);
                                            } else {
                                                C8632dsu.d((Object) m);
                                                e2 = Long.parseLong(m);
                                            }
                                            ImpressionData c6 = eVar.c();
                                            if (c6 != null) {
                                                interfaceC7451cwU45 = cbd5.a;
                                                interfaceC7451cwU45.b(c6);
                                                dpR dpr10 = dpR.c;
                                            }
                                            if (b5 != null) {
                                                C5209buT c5209buT = (C5209buT) H.h().get(b5);
                                                if (c5209buT != null) {
                                                    if (eVar.i() >= c5209buT.c - 1 && eVar.i() < c5209buT.b) {
                                                        j = eVar.i() - c5209buT.c;
                                                    } else if ((c5209buT.b - c5209buT.c) - eVar.i() > 0) {
                                                        j = eVar.i();
                                                    }
                                                    a = new PlaylistTimestamp(String.valueOf(e2), b5, j);
                                                }
                                            } else {
                                                a = new LegacyBranchingBookmark(e2, eVar.i()).a(H);
                                            }
                                            if (a != null) {
                                                if (eVar.f()) {
                                                    interfaceC7451cwU44 = cbd5.a;
                                                    interfaceC7451cwU44.M();
                                                }
                                                interfaceC7451cwU41 = cbd5.a;
                                                interfaceC7451cwU41.e(new cBA.G(eVar.a(), a.a, d6, eVar.f(), eVar.e(), null, 32, null));
                                                B9.d(a);
                                                interfaceC7451cwU42 = cbd5.a;
                                                interfaceC7451cwU42.q();
                                                interfaceC7451cwU43 = cbd5.a;
                                                interfaceC7451cwU43.h(!eVar.e() && eVar.f());
                                            }
                                            dpR dpr11 = dpR.c;
                                        }
                                    }
                                } else if (cbo instanceof cBQ.r) {
                                    interfaceC7451cwU37 = cBD.this.a;
                                    interfaceC7451cwU37.b(((cBQ.r) cbo).a());
                                    interfaceC7451cwU38 = cBD.this.a;
                                    C7535cxz u3 = interfaceC7451cwU38.u();
                                    if (u3 == null || (e = u3.e()) == null || (stateHistory = e.stateHistory()) == null) {
                                        return;
                                    }
                                    if (stateHistory.isNotEmpty()) {
                                        Logger.INSTANCE.addContext(new UserState(new JSONObject(stateHistory.toJson().toString())));
                                    }
                                    dpR dpr12 = dpR.c;
                                } else if (cbo instanceof cBQ.c) {
                                    cBQ.c cVar = (cBQ.c) cbo;
                                    String e9 = cVar.e();
                                    Integer h = cVar.h();
                                    PlayContextImp playContextImp = new PlayContextImp(e9, h != null ? h.intValue() : -1, 0, 0);
                                    interfaceC7451cwU29 = cBD.this.a;
                                    interfaceC7451cwU29.e(new cBA.G(cVar.d(), null, cVar.b(), cVar.j(), false, null, 32, null));
                                    if (cVar.j()) {
                                        interfaceC7451cwU36 = cBD.this.a;
                                        interfaceC7451cwU36.M();
                                    } else {
                                        interfaceC7451cwU30 = cBD.this.a;
                                        interfaceC7451cwU30.D();
                                    }
                                    Moment b6 = cVar.b();
                                    if (b6 == null || (choices = b6.choices()) == null) {
                                        return;
                                    }
                                    Iterator<T> it = choices.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (C8632dsu.c((Object) ((Choice) next).id(), (Object) cVar.d())) {
                                            obj = next;
                                            break;
                                        }
                                    }
                                    Choice choice = (Choice) obj;
                                    if (choice != null) {
                                        cBD cbd6 = cBD.this;
                                        interfaceC7451cwU31 = cbd6.a;
                                        InterfaceC5198buI v2 = interfaceC7451cwU31.v();
                                        if (v2 == null || (action = choice.action()) == null || (type = action.type()) == null || !type.equals(Action.ActionType.NEXT_EPISODE)) {
                                            interfaceC7451cwU32 = cbd6.a;
                                            interfaceC7451cwU32.m();
                                            view = cbd6.h;
                                            Context context4 = view.getContext();
                                            C8632dsu.a(context4, "");
                                            NetflixActivity netflixActivity = (NetflixActivity) C9737vz.e(context4, NetflixActivity.class);
                                            interfaceC7451cwU33 = cbd6.a;
                                            String g = cVar.g();
                                            VideoType videoType = C8632dsu.c((Object) cVar.a(), (Object) cVar.g()) ? VideoType.MOVIE : VideoType.EPISODE;
                                            long c7 = cVar.c();
                                            interfaceC7451cwU34 = cbd6.a;
                                            interfaceC7451cwU33.a(g, videoType, playContextImp, new PlayerExtras(c7, 0L, interfaceC7451cwU34.w(), false, false, null, false, null, 0L, 0.0f, null, null, null, null, null, 32762, null));
                                        } else {
                                            interfaceC7451cwU35 = cbd6.a;
                                            interfaceC7451cwU35.a(new C7535cxz(v2, playContextImp, cVar.c(), null));
                                        }
                                        dpR dpr13 = dpR.c;
                                    }
                                } else if (C8632dsu.c(cbo, cBQ.l.d)) {
                                    interfaceC7451cwU28 = cBD.this.a;
                                    interfaceC7451cwU28.L();
                                } else if (cbo instanceof cBO.T) {
                                    interfaceC7451cwU27 = cBD.this.a;
                                    interfaceC7451cwU27.e(new cBA.ac(((cBO.T) cbo).d()));
                                } else if (cbo instanceof cBO.V) {
                                    interfaceC7451cwU26 = cBD.this.a;
                                    cBO.V v3 = (cBO.V) cbo;
                                    interfaceC7451cwU26.e(new cBA.C5538ab(v3.b(), v3.a()));
                                } else if (cbo instanceof cBO.ab) {
                                    interfaceC7451cwU25 = cBD.this.a;
                                    cBO.ab abVar = (cBO.ab) cbo;
                                    interfaceC7451cwU25.e(new cBA.C5539af(abVar.a(), abVar.b()));
                                } else if (cbo instanceof cBO.ac) {
                                    interfaceC7451cwU24 = cBD.this.a;
                                    interfaceC7451cwU24.e(cBA.Y.a);
                                } else if (cbo instanceof cBO.aa) {
                                    interfaceC7451cwU23 = cBD.this.a;
                                    interfaceC7451cwU23.e(cBA.C5537aa.b);
                                } else if (cbo instanceof cBO.H) {
                                    CLv2Utils.INSTANCE.e(new Focus(AppView.playbackSpeedButton, null), new SelectCommand());
                                    interfaceC7451cwU22 = cBD.this.a;
                                    interfaceC7451cwU22.k();
                                } else if (!(cbo instanceof cBO.W)) {
                                    if (!(cbo instanceof cBO.Q)) {
                                        if (!(cbo instanceof cBO.C5566b)) {
                                            if (cbo instanceof cBO.C5572h) {
                                                if (((cBO.C5572h) cbo).c()) {
                                                    Logger logger = Logger.INSTANCE;
                                                    Long startSession = logger.startSession(new LockUiCommand());
                                                    interfaceC7451cwU16 = cBD.this.a;
                                                    interfaceC7451cwU16.e(new cBA.ag(true));
                                                    interfaceC7451cwU17 = cBD.this.a;
                                                    interfaceC7451cwU17.e(cBA.F.a);
                                                    cBD.this.e = logger.startSession(new UiLocked());
                                                    logger.endSession(startSession);
                                                    return;
                                                }
                                                Logger logger2 = Logger.INSTANCE;
                                                logger2.endSession(logger2.startSession(new UnlockUiCommand()));
                                                interfaceC7451cwU15 = cBD.this.a;
                                                interfaceC7451cwU15.e(new cBA.ag(false));
                                                l = cBD.this.e;
                                                logger2.endSession(l);
                                                return;
                                            } else if (cbo instanceof cBO.Z) {
                                                interfaceC7451cwU14 = cBD.this.a;
                                                interfaceC7451cwU14.O();
                                                return;
                                            } else if (cbo instanceof cBO.C5569e) {
                                                interfaceC7451cwU13 = cBD.this.a;
                                                interfaceC7451cwU13.s();
                                                return;
                                            } else if (cbo instanceof cBO.C5587w) {
                                                interfaceC7451cwU12 = cBD.this.a;
                                                interfaceC7451cwU12.X();
                                                return;
                                            } else if (cbo instanceof cBO.C5578n) {
                                                interfaceC7451cwU11 = cBD.this.a;
                                                interfaceC7451cwU11.z();
                                                return;
                                            } else if (C8632dsu.c(cbo, cBO.S.d) || (cbo instanceof cBO.C5575k)) {
                                                interfaceC7451cwU = cBD.this.a;
                                                interfaceC7451cwU.q();
                                                return;
                                            } else if (cbo instanceof cBQ.k) {
                                                interfaceC7451cwU10 = cBD.this.a;
                                                interfaceC7451cwU10.e(cBA.C5560v.b);
                                                return;
                                            } else if (cbo instanceof cBQ.n) {
                                                interfaceC7451cwU9 = cBD.this.a;
                                                interfaceC7451cwU9.e(cBA.C5557s.c);
                                                return;
                                            } else if (cbo instanceof cBQ.m) {
                                                interfaceC7451cwU8 = cBD.this.a;
                                                interfaceC7451cwU8.z();
                                                return;
                                            } else if (cbo instanceof cBQ.s) {
                                                cBQ.s sVar = (cBQ.s) cbo;
                                                if (sVar.c()) {
                                                    interfaceC7451cwU7 = cBD.this.a;
                                                    interfaceC7451cwU7.e(new cBA.A(sVar.d()));
                                                    return;
                                                }
                                                interfaceC7451cwU6 = cBD.this.a;
                                                interfaceC7451cwU6.e(new cBA.A(0));
                                                return;
                                            } else if (cbo instanceof cBO.C5585u) {
                                                interfaceC7451cwU5 = cBD.this.a;
                                                interfaceC7451cwU5.Q();
                                                return;
                                            } else if (cbo instanceof cBO.C5573i) {
                                                interfaceC7451cwU4 = cBD.this.a;
                                                interfaceC7451cwU4.K();
                                                return;
                                            } else if (cbo instanceof cBO.N) {
                                                interfaceC7451cwU3 = cBD.this.a;
                                                interfaceC7451cwU3.c(((cBO.N) cbo).e());
                                                return;
                                            } else if (cbo instanceof cBR) {
                                                interfaceC7451cwU2 = cBD.this.a;
                                                C8632dsu.d(cbo);
                                                interfaceC7451cwU2.e((cBR) cbo);
                                                return;
                                            } else {
                                                return;
                                            }
                                        }
                                        cBD.d.getLogTag();
                                        interfaceC7451cwU18 = cBD.this.a;
                                        interfaceC7451cwU18.P();
                                        Logger logger3 = Logger.INSTANCE;
                                        logger3.endSession(logger3.startSession(new ChangeValueCommand(Float.valueOf(((cBO.C5566b) cbo).e()))));
                                        l2 = cBD.this.f;
                                        logger3.endSession(l2);
                                        return;
                                    }
                                    cBD.d.getLogTag();
                                    cBD.this.f = Logger.INSTANCE.startSession(new Focus(AppView.brightnessControl, null));
                                    interfaceC7451cwU19 = cBD.this.a;
                                    interfaceC7451cwU19.S();
                                } else {
                                    cBD.d.getLogTag();
                                    interfaceC7451cwU20 = cBD.this.a;
                                    interfaceC7451cwU20.d(((cBO.W) cbo).e());
                                    interfaceC7451cwU21 = cBD.this.a;
                                    interfaceC7451cwU21.e(cBA.C5555q.a);
                                }
                            }
                        }
                    }
                }
            }
        };
        takeUntil.subscribe(new Consumer() { // from class: o.cBF
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                cBD.g(drM.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }
}
