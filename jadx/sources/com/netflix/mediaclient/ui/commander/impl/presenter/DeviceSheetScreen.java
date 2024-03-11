package com.netflix.mediaclient.ui.commander.impl.presenter;

import android.os.Parcel;
import android.os.Parcelable;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.commanderinfra.api.util.ConnectionState;
import com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen;
import com.slack.circuit.runtime.screen.Screen;
import java.util.List;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8491dno;
import o.VN;
import o.VT;
import o.VX;
import o.VY;
import o.VZ;
import o.bMT;
import o.dpR;
import o.drM;

/* loaded from: classes4.dex */
public final class DeviceSheetScreen implements Screen {
    public static final DeviceSheetScreen e = new DeviceSheetScreen();
    public static final Parcelable.Creator<DeviceSheetScreen> CREATOR = new Creator();

    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<DeviceSheetScreen> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final DeviceSheetScreen[] newArray(int i) {
            return new DeviceSheetScreen[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public final DeviceSheetScreen createFromParcel(Parcel parcel) {
            C8632dsu.c((Object) parcel, "");
            parcel.readInt();
            return DeviceSheetScreen.e;
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

    private DeviceSheetScreen() {
    }

    /* loaded from: classes4.dex */
    public interface a extends InterfaceC8491dno {

        /* loaded from: classes4.dex */
        public static final class b implements a {
            private final VZ a;
            private final drM<e, dpR> b;
            private final boolean c;
            private final ConnectionState d;
            private final String e;
            private final bMT f;
            private final boolean g;
            private final boolean i;
            private final Long j;

            @Override // com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen.a
            public ConnectionState a() {
                return this.d;
            }

            @Override // com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen.a
            public VZ b() {
                return this.a;
            }

            @Override // com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen.a
            public boolean c() {
                return this.c;
            }

            @Override // com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen.a
            public String d() {
                return this.e;
            }

            @Override // com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen.a
            public drM<e, dpR> e() {
                return this.b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    return this.d == bVar.d && this.g == bVar.g && this.c == bVar.c && C8632dsu.c(this.a, bVar.a) && this.i == bVar.i && C8632dsu.c(this.f, bVar.f) && C8632dsu.c(this.j, bVar.j) && C8632dsu.c((Object) this.e, (Object) bVar.e) && C8632dsu.c(this.b, bVar.b);
                }
                return false;
            }

            @Override // com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen.a
            public Long h() {
                return this.j;
            }

            public int hashCode() {
                int hashCode = this.d.hashCode();
                int hashCode2 = Boolean.hashCode(this.g);
                int hashCode3 = Boolean.hashCode(this.c);
                VZ vz = this.a;
                int hashCode4 = vz == null ? 0 : vz.hashCode();
                int hashCode5 = Boolean.hashCode(this.i);
                bMT bmt = this.f;
                int hashCode6 = bmt == null ? 0 : bmt.hashCode();
                Long l = this.j;
                int hashCode7 = l == null ? 0 : l.hashCode();
                String str = this.e;
                return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.b.hashCode();
            }

            @Override // com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen.a
            public boolean i() {
                return this.i;
            }

            @Override // com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen.a
            public bMT j() {
                return this.f;
            }

            public String toString() {
                ConnectionState connectionState = this.d;
                boolean z = this.g;
                boolean z2 = this.c;
                VZ vz = this.a;
                boolean z3 = this.i;
                bMT bmt = this.f;
                Long l = this.j;
                String str = this.e;
                drM<e, dpR> drm = this.b;
                return "Error(connectionState=" + connectionState + ", shouldShowMdxEntryPoint=" + z + ", deviceSheetState=" + z2 + ", connectedDevice=" + vz + ", shouldShowFeatureSpecificCopy=" + z3 + ", featureEducationVideoExperience=" + bmt + ", featureEducationPlayableId=" + l + ", featureEducationImageUrl=" + str + ", eventSink=" + drm + ")";
            }
        }

        ConnectionState a();

        VZ b();

        boolean c();

        String d();

        drM<e, dpR> e();

        Long h();

        boolean i();

        bMT j();

        /* loaded from: classes4.dex */
        public static final class c implements a {
            private final drM<e, dpR> a;
            private final ConnectionState b;
            private final boolean c;
            private final String d;
            private final VZ e;
            private final Long g;
            private final boolean h;
            private final boolean i;
            private final bMT j;

            @Override // com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen.a
            public ConnectionState a() {
                return this.b;
            }

            @Override // com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen.a
            public VZ b() {
                return this.e;
            }

            @Override // com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen.a
            public boolean c() {
                return this.c;
            }

            @Override // com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen.a
            public String d() {
                return this.d;
            }

            @Override // com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen.a
            public drM<e, dpR> e() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    return this.b == cVar.b && this.i == cVar.i && this.c == cVar.c && C8632dsu.c(this.e, cVar.e) && this.h == cVar.h && C8632dsu.c(this.j, cVar.j) && C8632dsu.c(this.g, cVar.g) && C8632dsu.c((Object) this.d, (Object) cVar.d) && C8632dsu.c(this.a, cVar.a);
                }
                return false;
            }

            @Override // com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen.a
            public Long h() {
                return this.g;
            }

            public int hashCode() {
                int hashCode = this.b.hashCode();
                int hashCode2 = Boolean.hashCode(this.i);
                int hashCode3 = Boolean.hashCode(this.c);
                VZ vz = this.e;
                int hashCode4 = vz == null ? 0 : vz.hashCode();
                int hashCode5 = Boolean.hashCode(this.h);
                bMT bmt = this.j;
                int hashCode6 = bmt == null ? 0 : bmt.hashCode();
                Long l = this.g;
                int hashCode7 = l == null ? 0 : l.hashCode();
                String str = this.d;
                return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.a.hashCode();
            }

            @Override // com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen.a
            public boolean i() {
                return this.h;
            }

            @Override // com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen.a
            public bMT j() {
                return this.j;
            }

            public String toString() {
                ConnectionState connectionState = this.b;
                boolean z = this.i;
                boolean z2 = this.c;
                VZ vz = this.e;
                boolean z3 = this.h;
                bMT bmt = this.j;
                Long l = this.g;
                String str = this.d;
                drM<e, dpR> drm = this.a;
                return "Loading(connectionState=" + connectionState + ", shouldShowMdxEntryPoint=" + z + ", deviceSheetState=" + z2 + ", connectedDevice=" + vz + ", shouldShowFeatureSpecificCopy=" + z3 + ", featureEducationVideoExperience=" + bmt + ", featureEducationPlayableId=" + l + ", featureEducationImageUrl=" + str + ", eventSink=" + drm + ")";
            }

            /* JADX WARN: Multi-variable type inference failed */
            public c(ConnectionState connectionState, boolean z, boolean z2, VZ vz, boolean z3, bMT bmt, Long l, String str, drM<? super e, dpR> drm) {
                C8632dsu.c((Object) connectionState, "");
                C8632dsu.c((Object) drm, "");
                this.b = connectionState;
                this.i = z;
                this.c = z2;
                this.e = vz;
                this.h = z3;
                this.j = bmt;
                this.g = l;
                this.d = str;
                this.a = drm;
            }

            public /* synthetic */ c(ConnectionState connectionState, boolean z, boolean z2, VZ vz, boolean z3, bMT bmt, Long l, String str, drM drm, int i, C8627dsp c8627dsp) {
                this((i & 1) != 0 ? ConnectionState.i : connectionState, (i & 2) != 0 ? false : z, z2, (i & 8) != 0 ? null : vz, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? null : bmt, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : str, (i & JSONzip.end) != 0 ? new drM<e, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen$State$Loading$1
                    public final void d(DeviceSheetScreen.e eVar) {
                        C8632dsu.c((Object) eVar, "");
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(DeviceSheetScreen.e eVar) {
                        d(eVar);
                        return dpR.c;
                    }
                } : drm);
            }
        }

        /* renamed from: com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0059a implements a {
            private final boolean a;
            private final String b;
            private final ConnectionState c;
            private final VZ d;
            private final drM<e, dpR> e;
            private final bMT f;
            private final Long g;
            private final List<VY> h;
            private final boolean i;
            private final VT j;
            private final boolean k;
            private final boolean l;

            /* renamed from: o  reason: collision with root package name */
            private final List<VZ> f13256o;

            @Override // com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen.a
            public ConnectionState a() {
                return this.c;
            }

            @Override // com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen.a
            public VZ b() {
                return this.d;
            }

            @Override // com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen.a
            public boolean c() {
                return this.a;
            }

            @Override // com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen.a
            public String d() {
                return this.b;
            }

            @Override // com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen.a
            public drM<e, dpR> e() {
                return this.e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C0059a) {
                    C0059a c0059a = (C0059a) obj;
                    return this.c == c0059a.c && C8632dsu.c(this.f13256o, c0059a.f13256o) && C8632dsu.c(this.j, c0059a.j) && C8632dsu.c(this.h, c0059a.h) && this.l == c0059a.l && this.i == c0059a.i && this.a == c0059a.a && this.k == c0059a.k && C8632dsu.c(this.d, c0059a.d) && C8632dsu.c(this.f, c0059a.f) && C8632dsu.c(this.g, c0059a.g) && C8632dsu.c((Object) this.b, (Object) c0059a.b) && C8632dsu.c(this.e, c0059a.e);
                }
                return false;
            }

            public final List<VY> f() {
                return this.h;
            }

            public final VT g() {
                return this.j;
            }

            @Override // com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen.a
            public Long h() {
                return this.g;
            }

            public int hashCode() {
                int hashCode = this.c.hashCode();
                int hashCode2 = this.f13256o.hashCode();
                VT vt = this.j;
                int hashCode3 = vt == null ? 0 : vt.hashCode();
                List<VY> list = this.h;
                int hashCode4 = list == null ? 0 : list.hashCode();
                int hashCode5 = Boolean.hashCode(this.l);
                int hashCode6 = Boolean.hashCode(this.i);
                int hashCode7 = Boolean.hashCode(this.a);
                int hashCode8 = Boolean.hashCode(this.k);
                VZ vz = this.d;
                int hashCode9 = vz == null ? 0 : vz.hashCode();
                bMT bmt = this.f;
                int hashCode10 = bmt == null ? 0 : bmt.hashCode();
                Long l = this.g;
                int hashCode11 = l == null ? 0 : l.hashCode();
                String str = this.b;
                return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.e.hashCode();
            }

            @Override // com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen.a
            public boolean i() {
                return this.i;
            }

            @Override // com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen.a
            public bMT j() {
                return this.f;
            }

            public boolean n() {
                return this.l;
            }

            public final List<VZ> o() {
                return this.f13256o;
            }

            public String toString() {
                ConnectionState connectionState = this.c;
                List<VZ> list = this.f13256o;
                VT vt = this.j;
                List<VY> list2 = this.h;
                boolean z = this.l;
                boolean z2 = this.i;
                boolean z3 = this.a;
                boolean z4 = this.k;
                VZ vz = this.d;
                bMT bmt = this.f;
                Long l = this.g;
                String str = this.b;
                drM<e, dpR> drm = this.e;
                return "Success(connectionState=" + connectionState + ", targetDeviceDataList=" + list + ", profileMismatchData=" + vt + ", promptedDeviceDataList=" + list2 + ", shouldShowMdxEntryPoint=" + z + ", shouldShowFeatureSpecificCopy=" + z2 + ", deviceSheetState=" + z3 + ", showOverlay=" + z4 + ", connectedDevice=" + vz + ", featureEducationVideoExperience=" + bmt + ", featureEducationPlayableId=" + l + ", featureEducationImageUrl=" + str + ", eventSink=" + drm + ")";
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0059a(ConnectionState connectionState, List<VZ> list, VT vt, List<VY> list2, boolean z, boolean z2, boolean z3, boolean z4, VZ vz, bMT bmt, Long l, String str, drM<? super e, dpR> drm) {
                C8632dsu.c((Object) connectionState, "");
                C8632dsu.c((Object) list, "");
                C8632dsu.c((Object) drm, "");
                this.c = connectionState;
                this.f13256o = list;
                this.j = vt;
                this.h = list2;
                this.l = z;
                this.i = z2;
                this.a = z3;
                this.k = z4;
                this.d = vz;
                this.f = bmt;
                this.g = l;
                this.b = str;
                this.e = drm;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public /* synthetic */ C0059a(com.netflix.mediaclient.commanderinfra.api.util.ConnectionState r17, java.util.List r18, o.VT r19, java.util.List r20, boolean r21, boolean r22, boolean r23, boolean r24, o.VZ r25, o.bMT r26, java.lang.Long r27, java.lang.String r28, o.drM r29, int r30, o.C8627dsp r31) {
                /*
                    r16 = this;
                    r0 = r30
                    r1 = r0 & 1
                    if (r1 == 0) goto La
                    com.netflix.mediaclient.commanderinfra.api.util.ConnectionState r1 = com.netflix.mediaclient.commanderinfra.api.util.ConnectionState.i
                    r3 = r1
                    goto Lc
                La:
                    r3 = r17
                Lc:
                    r1 = r0 & 2
                    if (r1 == 0) goto L16
                    java.util.List r1 = o.C8570dqm.c()
                    r4 = r1
                    goto L18
                L16:
                    r4 = r18
                L18:
                    r1 = r0 & 4
                    r2 = 0
                    if (r1 == 0) goto L1f
                    r5 = r2
                    goto L21
                L1f:
                    r5 = r19
                L21:
                    r1 = r0 & 8
                    if (r1 == 0) goto L27
                    r6 = r2
                    goto L29
                L27:
                    r6 = r20
                L29:
                    r1 = r0 & 16
                    r7 = 0
                    if (r1 == 0) goto L30
                    r1 = r7
                    goto L32
                L30:
                    r1 = r21
                L32:
                    r8 = r0 & 32
                    if (r8 == 0) goto L38
                    r8 = r7
                    goto L3a
                L38:
                    r8 = r22
                L3a:
                    r9 = r0 & 128(0x80, float:1.794E-43)
                    if (r9 == 0) goto L40
                    r10 = r7
                    goto L42
                L40:
                    r10 = r24
                L42:
                    r7 = r0 & 256(0x100, float:3.59E-43)
                    if (r7 == 0) goto L48
                    r11 = r2
                    goto L4a
                L48:
                    r11 = r25
                L4a:
                    r7 = r0 & 512(0x200, float:7.175E-43)
                    if (r7 == 0) goto L50
                    r12 = r2
                    goto L52
                L50:
                    r12 = r26
                L52:
                    r7 = r0 & 1024(0x400, float:1.435E-42)
                    if (r7 == 0) goto L58
                    r13 = r2
                    goto L5a
                L58:
                    r13 = r27
                L5a:
                    r7 = r0 & 2048(0x800, float:2.87E-42)
                    if (r7 == 0) goto L60
                    r14 = r2
                    goto L62
                L60:
                    r14 = r28
                L62:
                    r0 = r0 & 4096(0x1000, float:5.74E-42)
                    if (r0 == 0) goto L6a
                    com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen$State$Success$1 r0 = new o.drM<com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen.e, o.dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen$State$Success$1
                        static {
                            /*
                                com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen$State$Success$1 r0 = new com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen$State$Success$1
                                r0.<init>()
                                
                                // error: 0x0005: SPUT  (r0 I:com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen$State$Success$1) com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen$State$Success$1.e com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen$State$Success$1
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen$State$Success$1.<clinit>():void");
                        }

                        {
                            /*
                                r1 = this;
                                r0 = 1
                                r1.<init>(r0)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen$State$Success$1.<init>():void");
                        }

                        public final void c(com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen.e r2) {
                            /*
                                r1 = this;
                                java.lang.String r0 = ""
                                o.C8632dsu.c(r2, r0)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen$State$Success$1.c(com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen$e):void");
                        }

                        @Override // o.drM
                        public /* synthetic */ o.dpR invoke(com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen.e r1) {
                            /*
                                r0 = this;
                                com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen$e r1 = (com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen.e) r1
                                r0.c(r1)
                                o.dpR r1 = o.dpR.c
                                return r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen$State$Success$1.invoke(java.lang.Object):java.lang.Object");
                        }
                    }
                    r15 = r0
                    goto L6c
                L6a:
                    r15 = r29
                L6c:
                    r2 = r16
                    r7 = r1
                    r9 = r23
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen.a.C0059a.<init>(com.netflix.mediaclient.commanderinfra.api.util.ConnectionState, java.util.List, o.VT, java.util.List, boolean, boolean, boolean, boolean, o.VZ, o.bMT, java.lang.Long, java.lang.String, o.drM, int, o.dsp):void");
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface e {

        /* loaded from: classes4.dex */
        public static final class n implements e {
            public static final n c = new n();

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
                return 1810900922;
            }

            public String toString() {
                return "OpenPairingSheet";
            }

            private n() {
            }
        }

        /* loaded from: classes4.dex */
        public static final class c implements e {
            public static final c d = new c();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1111426006;
            }

            public String toString() {
                return "ClosePairingSheet";
            }

            private c() {
            }
        }

        /* loaded from: classes4.dex */
        public static final class h implements e {
            public static final h d = new h();

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
                return 966809903;
            }

            public String toString() {
                return "CloseUnpairingSheet";
            }

            private h() {
            }
        }

        /* renamed from: com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen$e$e  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0060e implements e {
            public static final C0060e d = new C0060e();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C0060e) {
                    C0060e c0060e = (C0060e) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 430341915;
            }

            public String toString() {
                return "CloseProfileMismatchResolutionSheet";
            }

            private C0060e() {
            }
        }

        /* loaded from: classes4.dex */
        public static final class k implements e {
            public static final k e = new k();

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
                return -1479456122;
            }

            public String toString() {
                return "OpenMdxPanel";
            }

            private k() {
            }
        }

        /* loaded from: classes4.dex */
        public static final class l implements e {
            public static final l a = new l();

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
                return -1676592686;
            }

            public String toString() {
                return "OpenHelpArticle";
            }

            private l() {
            }
        }

        /* loaded from: classes4.dex */
        public static final class j implements e {
            private final VZ c;

            public final VZ b() {
                return this.c;
            }

            public j(VZ vz) {
                C8632dsu.c((Object) vz, "");
                this.c = vz;
            }
        }

        /* loaded from: classes4.dex */
        public static final class s implements e {
            private final VZ b;
            private final VN c;

            public final VZ b() {
                return this.b;
            }

            public final VN d() {
                return this.c;
            }

            public s(VZ vz, VN vn) {
                C8632dsu.c((Object) vz, "");
                C8632dsu.c((Object) vn, "");
                this.b = vz;
                this.c = vn;
            }
        }

        /* loaded from: classes4.dex */
        public static final class i implements e {
            public static final i e = new i();

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
                return -893566426;
            }

            public String toString() {
                return "DisconnectTarget";
            }

            private i() {
            }
        }

        /* loaded from: classes4.dex */
        public static final class q implements e {
            public static final q b = new q();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof q) {
                    q qVar = (q) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 896754836;
            }

            public String toString() {
                return "TargetNotFoundSheetPresented";
            }

            private q() {
            }
        }

        /* loaded from: classes4.dex */
        public static final class f implements e {
            public static final f c = new f();

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
                return -93055406;
            }

            public String toString() {
                return "ConnectionSheetPresented";
            }

            private f() {
            }
        }

        /* loaded from: classes4.dex */
        public static final class g implements e {
            public static final g c = new g();

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
                return -311654770;
            }

            public String toString() {
                return "DisconnectionSheetPresented";
            }

            private g() {
            }
        }

        /* loaded from: classes4.dex */
        public static final class p implements e {
            private final VT a;

            public final VT b() {
                return this.a;
            }

            public p(VT vt) {
                this.a = vt;
            }
        }

        /* loaded from: classes4.dex */
        public static final class o implements e {
            public static final o e = new o();

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
                return -1221708026;
            }

            public String toString() {
                return "FeatureEducationSheetPresented";
            }

            private o() {
            }
        }

        /* loaded from: classes4.dex */
        public static final class t implements e {
            private final VY d;

            public final VY d() {
                return this.d;
            }

            public t(VY vy) {
                C8632dsu.c((Object) vy, "");
                this.d = vy;
            }
        }

        /* loaded from: classes4.dex */
        public static final class m implements e {
            public static final m d = new m();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof m) {
                    m mVar = (m) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 497758333;
            }

            public String toString() {
                return "GenericPromptSheetPresented";
            }

            private m() {
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements e {
            public static final b d = new b();

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
                return 1402454446;
            }

            public String toString() {
                return "CloseFeatureEducationSheet";
            }

            private b() {
            }
        }

        /* loaded from: classes4.dex */
        public static final class d implements e {
            public static final d e = new d();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof d) {
                    d dVar = (d) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1019774220;
            }

            public String toString() {
                return "CloseTargetedPromptSheet";
            }

            private d() {
            }
        }

        /* loaded from: classes4.dex */
        public static final class a implements e {
            public static final a d = new a();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1775884579;
            }

            public String toString() {
                return "CloseGenericPromptSheet";
            }

            private a() {
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private final ConnectionState a;
        private final VX b;
        private final boolean c;
        private final List<VY> d;
        private final List<VZ> e;

        public final ConnectionState a() {
            return this.a;
        }

        public final List<VZ> b() {
            return this.e;
        }

        public final VX c() {
            return this.b;
        }

        public final boolean d() {
            return this.c;
        }

        public final List<VY> e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.c == bVar.c && C8632dsu.c(this.e, bVar.e) && C8632dsu.c(this.b, bVar.b) && this.a == bVar.a && C8632dsu.c(this.d, bVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = Boolean.hashCode(this.c);
            int hashCode2 = this.e.hashCode();
            VX vx = this.b;
            int hashCode3 = vx == null ? 0 : vx.hashCode();
            int hashCode4 = this.a.hashCode();
            List<VY> list = this.d;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            boolean z = this.c;
            List<VZ> list = this.e;
            VX vx = this.b;
            ConnectionState connectionState = this.a;
            List<VY> list2 = this.d;
            return "DeviceSheetData(isSheetVisible=" + z + ", targetDeviceDataList=" + list + ", targetDevice=" + vx + ", connectionState=" + connectionState + ", promptedDeviceDataList=" + list2 + ")";
        }

        public b(boolean z, List<VZ> list, VX vx, ConnectionState connectionState, List<VY> list2) {
            C8632dsu.c((Object) list, "");
            C8632dsu.c((Object) connectionState, "");
            this.c = z;
            this.e = list;
            this.b = vx;
            this.a = connectionState;
            this.d = list2;
        }
    }
}
