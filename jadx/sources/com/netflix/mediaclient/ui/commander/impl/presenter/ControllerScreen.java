package com.netflix.mediaclient.ui.commander.impl.presenter;

import android.os.Parcel;
import android.os.Parcelable;
import com.netflix.mediaclient.commanderinfra.api.util.ConnectionState;
import com.netflix.mediaclient.commanderinfra.api.util.TargetDeviceUiState;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.commander.impl.ui.menu.MenuAction;
import com.netflix.mediaclient.ui.commander.impl.ui.menu.NavigationMenuAction;
import com.netflix.mediaclient.ui.commander.impl.ui.menu.PadKey;
import com.netflix.mediaclient.ui.commander.impl.ui.menu.PlaybackControlMenuAction;
import com.slack.circuit.runtime.screen.Screen;
import o.C1294Wd;
import o.C8632dsu;
import o.InterfaceC5160btX;
import o.InterfaceC8491dno;
import o.InterfaceC8812dzl;
import o.VM;
import o.VR;
import o.VX;
import o.dpR;
import o.drM;

/* loaded from: classes4.dex */
public final class ControllerScreen implements Screen {
    public static final ControllerScreen c = new ControllerScreen();
    public static final Parcelable.Creator<ControllerScreen> CREATOR = new Creator();

    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<ControllerScreen> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final ControllerScreen[] newArray(int i) {
            return new ControllerScreen[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: e */
        public final ControllerScreen createFromParcel(Parcel parcel) {
            C8632dsu.c((Object) parcel, "");
            parcel.readInt();
            return ControllerScreen.c;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8632dsu.c((Object) parcel, "");
        parcel.writeInt(1);
    }

    private ControllerScreen() {
    }

    /* loaded from: classes4.dex */
    public interface c extends InterfaceC8491dno {
        ConnectionState a();

        C1294Wd b();

        drM<e, dpR> d();

        /* renamed from: com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen$c$c  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0057c implements c {
            private final C1294Wd b;
            private final drM<e, dpR> c;
            private final ConnectionState d;

            @Override // com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen.c
            public ConnectionState a() {
                return this.d;
            }

            @Override // com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen.c
            public C1294Wd b() {
                return this.b;
            }

            @Override // com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen.c
            public drM<e, dpR> d() {
                return this.c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C0057c) {
                    C0057c c0057c = (C0057c) obj;
                    return this.d == c0057c.d && C8632dsu.c(this.b, c0057c.b) && C8632dsu.c(this.c, c0057c.c);
                }
                return false;
            }

            public int hashCode() {
                return (((this.d.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
            }

            public String toString() {
                ConnectionState connectionState = this.d;
                C1294Wd c1294Wd = this.b;
                drM<e, dpR> drm = this.c;
                return "Loading(connectionState=" + connectionState + ", uiInfraData=" + c1294Wd + ", eventSink=" + drm + ")";
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0057c(ConnectionState connectionState, C1294Wd c1294Wd, drM<? super e, dpR> drm) {
                C8632dsu.c((Object) connectionState, "");
                C8632dsu.c((Object) c1294Wd, "");
                C8632dsu.c((Object) drm, "");
                this.d = connectionState;
                this.b = c1294Wd;
                this.c = drm;
            }
        }

        /* loaded from: classes4.dex */
        public static final class d implements c {
            private final C1294Wd c;
            private final ConnectionState d;
            private final drM<e, dpR> e;

            @Override // com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen.c
            public ConnectionState a() {
                return this.d;
            }

            @Override // com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen.c
            public C1294Wd b() {
                return this.c;
            }

            @Override // com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen.c
            public drM<e, dpR> d() {
                return this.e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof d) {
                    d dVar = (d) obj;
                    return this.d == dVar.d && C8632dsu.c(this.c, dVar.c) && C8632dsu.c(this.e, dVar.e);
                }
                return false;
            }

            public int hashCode() {
                return (((this.d.hashCode() * 31) + this.c.hashCode()) * 31) + this.e.hashCode();
            }

            public String toString() {
                ConnectionState connectionState = this.d;
                C1294Wd c1294Wd = this.c;
                drM<e, dpR> drm = this.e;
                return "Error(connectionState=" + connectionState + ", uiInfraData=" + c1294Wd + ", eventSink=" + drm + ")";
            }

            /* JADX WARN: Multi-variable type inference failed */
            public d(ConnectionState connectionState, C1294Wd c1294Wd, drM<? super e, dpR> drm) {
                C8632dsu.c((Object) connectionState, "");
                C8632dsu.c((Object) c1294Wd, "");
                C8632dsu.c((Object) drm, "");
                this.d = connectionState;
                this.c = c1294Wd;
                this.e = drm;
            }
        }

        /* loaded from: classes4.dex */
        public static final class e implements c {
            private final drM<e, dpR> a;
            private final VM b;
            private final C1294Wd c;
            private final ConnectionState d;
            private final VX e;

            @Override // com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen.c
            public ConnectionState a() {
                return this.d;
            }

            @Override // com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen.c
            public C1294Wd b() {
                return this.c;
            }

            public final VX c() {
                return this.e;
            }

            @Override // com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen.c
            public drM<e, dpR> d() {
                return this.a;
            }

            public final VM e() {
                return this.b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof e) {
                    e eVar = (e) obj;
                    return this.d == eVar.d && C8632dsu.c(this.e, eVar.e) && C8632dsu.c(this.c, eVar.c) && C8632dsu.c(this.b, eVar.b) && C8632dsu.c(this.a, eVar.a);
                }
                return false;
            }

            public int hashCode() {
                return (((((((this.d.hashCode() * 31) + this.e.hashCode()) * 31) + this.c.hashCode()) * 31) + this.b.hashCode()) * 31) + this.a.hashCode();
            }

            public String toString() {
                ConnectionState connectionState = this.d;
                VX vx = this.e;
                C1294Wd c1294Wd = this.c;
                VM vm = this.b;
                drM<e, dpR> drm = this.a;
                return "Success(connectionState=" + connectionState + ", targetDevice=" + vx + ", uiInfraData=" + c1294Wd + ", bifInfraData=" + vm + ", eventSink=" + drm + ")";
            }

            /* JADX WARN: Multi-variable type inference failed */
            public e(ConnectionState connectionState, VX vx, C1294Wd c1294Wd, VM vm, drM<? super e, dpR> drm) {
                C8632dsu.c((Object) connectionState, "");
                C8632dsu.c((Object) vx, "");
                C8632dsu.c((Object) c1294Wd, "");
                C8632dsu.c((Object) vm, "");
                C8632dsu.c((Object) drm, "");
                this.d = connectionState;
                this.e = vx;
                this.c = c1294Wd;
                this.b = vm;
                this.a = drm;
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface e {

        /* loaded from: classes4.dex */
        public static final class h implements e {
            public static final h a = new h();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof h) {
                    h hVar = (h) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 562349320;
            }

            public String toString() {
                return "Expand";
            }

            private h() {
            }
        }

        /* renamed from: com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen$e$a  reason: case insensitive filesystem */
        /* loaded from: classes4.dex */
        public static final class C0715a implements e {
            public static final C0715a a = new C0715a();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C0715a) {
                    C0715a c0715a = (C0715a) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 558835355;
            }

            public String toString() {
                return "Collapse";
            }

            private C0715a() {
            }
        }

        /* renamed from: com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen$e$e  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0058e implements e {
            public static final C0058e e = new C0058e();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C0058e) {
                    C0058e c0058e = (C0058e) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 608822731;
            }

            public String toString() {
                return "Condense";
            }

            private C0058e() {
            }
        }

        /* loaded from: classes4.dex */
        public static final class u implements e {
            public static final u b = new u();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof u) {
                    u uVar = (u) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1086761577;
            }

            public String toString() {
                return "ShowDisconnectOverlay";
            }

            private u() {
            }
        }

        /* loaded from: classes4.dex */
        public static final class f implements e {
            public static final f b = new f();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof f) {
                    f fVar = (f) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -180233532;
            }

            public String toString() {
                return "HideDisconnectOverlay";
            }

            private f() {
            }
        }

        /* loaded from: classes4.dex */
        public static final class z implements e {
            public static final z d = new z();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof z) {
                    z zVar = (z) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1710049939;
            }

            public String toString() {
                return "ShowLanguageOverlay";
            }

            private z() {
            }
        }

        /* loaded from: classes4.dex */
        public static final class k implements e {
            public static final k b = new k();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof k) {
                    k kVar = (k) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 885276808;
            }

            public String toString() {
                return "HideLanguageOverlay";
            }

            private k() {
            }
        }

        /* loaded from: classes4.dex */
        public static final class D implements e {
            private final VR e;

            public final VR c() {
                return this.e;
            }

            public D(VR vr) {
                C8632dsu.c((Object) vr, "");
                this.e = vr;
            }
        }

        /* loaded from: classes4.dex */
        public static final class C implements e {
            private final VR d;

            public final VR c() {
                return this.d;
            }

            public C(VR vr) {
                C8632dsu.c((Object) vr, "");
                this.d = vr;
            }
        }

        /* loaded from: classes4.dex */
        public static final class v implements e {
            public static final v c = new v();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof v) {
                    v vVar = (v) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -98699539;
            }

            public String toString() {
                return "ShowEpisodesOverlay";
            }

            private v() {
            }
        }

        /* loaded from: classes4.dex */
        public static final class j implements e {
            public static final j e = new j();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof j) {
                    j jVar = (j) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1798340088;
            }

            public String toString() {
                return "HideEpisodesOverlay";
            }

            private j() {
            }
        }

        /* loaded from: classes4.dex */
        public static final class A implements e {
            public static final A d = new A();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof A) {
                    A a = (A) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -347390782;
            }

            public String toString() {
                return "ShowSeasonOverlay";
            }

            private A() {
            }
        }

        /* loaded from: classes4.dex */
        public static final class n implements e {
            public static final n e = new n();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof n) {
                    n nVar = (n) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1752509795;
            }

            public String toString() {
                return "HideSeasonOverlay";
            }

            private n() {
            }
        }

        /* loaded from: classes4.dex */
        public static final class l implements e {
            public static final l d = new l();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof l) {
                    l lVar = (l) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1035430579;
            }

            public String toString() {
                return "HideTooltip";
            }

            private l() {
            }
        }

        /* loaded from: classes4.dex */
        public static final class x implements e {
            private final int e;

            public final int a() {
                return this.e;
            }

            public x(int i) {
                this.e = i;
            }
        }

        /* loaded from: classes4.dex */
        public static final class t implements e {
            private final InterfaceC5160btX b;
            private final VideoType d;

            public final InterfaceC5160btX a() {
                return this.b;
            }

            public final VideoType e() {
                return this.d;
            }

            public t(InterfaceC5160btX interfaceC5160btX, VideoType videoType) {
                C8632dsu.c((Object) interfaceC5160btX, "");
                C8632dsu.c((Object) videoType, "");
                this.b = interfaceC5160btX;
                this.d = videoType;
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements e {
            public static final b c = new b();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1072597036;
            }

            public String toString() {
                return "DisconnectTv";
            }

            private b() {
            }
        }

        /* loaded from: classes4.dex */
        public static final class m implements e {
            private final MenuAction e;

            public final MenuAction c() {
                return this.e;
            }

            public m(MenuAction menuAction) {
                C8632dsu.c((Object) menuAction, "");
                this.e = menuAction;
            }
        }

        /* loaded from: classes4.dex */
        public static final class p implements e {
            private final PadKey d;

            public final PadKey d() {
                return this.d;
            }

            public p(PadKey padKey) {
                C8632dsu.c((Object) padKey, "");
                this.d = padKey;
            }
        }

        /* loaded from: classes4.dex */
        public static final class r implements e {
            private final NavigationMenuAction c;

            public final NavigationMenuAction b() {
                return this.c;
            }

            public r(NavigationMenuAction navigationMenuAction) {
                C8632dsu.c((Object) navigationMenuAction, "");
                this.c = navigationMenuAction;
            }
        }

        /* loaded from: classes4.dex */
        public static final class g implements e {
            public static final g a = new g();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof g) {
                    g gVar = (g) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 39776951;
            }

            public String toString() {
                return "DpadToggleClick";
            }

            private g() {
            }
        }

        /* loaded from: classes4.dex */
        public static final class s implements e {
            private final PlaybackControlMenuAction c;

            public final PlaybackControlMenuAction b() {
                return this.c;
            }

            public s(PlaybackControlMenuAction playbackControlMenuAction) {
                C8632dsu.c((Object) playbackControlMenuAction, "");
                this.c = playbackControlMenuAction;
            }
        }

        /* loaded from: classes4.dex */
        public static final class w implements e {
            private final InterfaceC8812dzl<Long> c;

            public final InterfaceC8812dzl<Long> b() {
                return this.c;
            }

            public w(InterfaceC8812dzl<Long> interfaceC8812dzl) {
                C8632dsu.c((Object) interfaceC8812dzl, "");
                this.c = interfaceC8812dzl;
            }
        }

        /* loaded from: classes4.dex */
        public static final class y implements e {
            private final long d;

            public final long c() {
                return this.d;
            }

            public y(long j) {
                this.d = j;
            }
        }

        /* loaded from: classes4.dex */
        public static final class q implements e {
            private final String a;

            public final String c() {
                return this.a;
            }

            public q(String str) {
                C8632dsu.c((Object) str, "");
                this.a = str;
            }
        }

        /* renamed from: com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen$e$c  reason: case insensitive filesystem */
        /* loaded from: classes4.dex */
        public static final class C0716c implements e {
            private final boolean a;
            private final boolean c;
            private final TargetDeviceUiState e;

            public final TargetDeviceUiState a() {
                return this.e;
            }

            public final boolean c() {
                return this.a;
            }

            public final boolean e() {
                return this.c;
            }

            public C0716c(boolean z, TargetDeviceUiState targetDeviceUiState, boolean z2) {
                C8632dsu.c((Object) targetDeviceUiState, "");
                this.c = z;
                this.e = targetDeviceUiState;
                this.a = z2;
            }
        }

        /* renamed from: com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen$e$d  reason: case insensitive filesystem */
        /* loaded from: classes4.dex */
        public static final class C0717d implements e {
            public static final C0717d b = new C0717d();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C0717d) {
                    C0717d c0717d = (C0717d) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1370870617;
            }

            public String toString() {
                return "DisconnectionSheetPresented";
            }

            private C0717d() {
            }
        }

        /* loaded from: classes4.dex */
        public static final class o implements e {
            public static final o c = new o();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof o) {
                    o oVar = (o) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -506949663;
            }

            public String toString() {
                return "LanguageSheetPresented";
            }

            private o() {
            }
        }

        /* loaded from: classes4.dex */
        public static final class i implements e {
            public static final i d = new i();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1940349343;
            }

            public String toString() {
                return "EpisodesSheetPresented";
            }

            private i() {
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private final C1294Wd a;
        private final VM c;
        private final ConnectionState d;
        private final VX e;

        public final C1294Wd a() {
            return this.a;
        }

        public final ConnectionState c() {
            return this.d;
        }

        public final VX d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c(this.e, bVar.e) && this.d == bVar.d && C8632dsu.c(this.a, bVar.a) && C8632dsu.c(this.c, bVar.c);
            }
            return false;
        }

        public int hashCode() {
            VX vx = this.e;
            return ((((((vx == null ? 0 : vx.hashCode()) * 31) + this.d.hashCode()) * 31) + this.a.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            VX vx = this.e;
            ConnectionState connectionState = this.d;
            C1294Wd c1294Wd = this.a;
            VM vm = this.c;
            return "TargetStates(targetDevice=" + vx + ", connectionState=" + connectionState + ", uiInfraData=" + c1294Wd + ", bifInfraData=" + vm + ")";
        }

        public b(VX vx, ConnectionState connectionState, C1294Wd c1294Wd, VM vm) {
            C8632dsu.c((Object) connectionState, "");
            C8632dsu.c((Object) c1294Wd, "");
            C8632dsu.c((Object) vm, "");
            this.e = vx;
            this.d = connectionState;
            this.a = c1294Wd;
            this.c = vm;
        }
    }
}
