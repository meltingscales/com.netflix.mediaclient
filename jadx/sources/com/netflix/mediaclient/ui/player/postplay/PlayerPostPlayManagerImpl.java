package com.netflix.mediaclient.ui.player.postplay;

import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.servicemgr.LiveEventState;
import com.netflix.model.leafs.PostPlayExperience;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import o.AbstractC5531cAw;
import o.AbstractC7612czW;
import o.C1045Mp;
import o.C5086bsC;
import o.C5529cAu;
import o.C7496cxM;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC5527cAs;
import o.InterfaceC7282ctK;
import o.InterfaceC7607czR;
import o.InterfaceC7609czT;
import o.InterfaceC8598drn;
import o.cBR;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes4.dex */
public final class PlayerPostPlayManagerImpl implements InterfaceC7607czR {
    public static final d a = new d(null);
    private final InterfaceC7282ctK b;
    private final String c;
    private final boolean d;
    private final boolean e;
    private final InterfaceC5527cAs f;
    private final IPlayer.PlaybackType g;
    private final AbstractC5531cAw h;
    private PostPlayDisplayState j;

    /* loaded from: classes4.dex */
    public final /* synthetic */ class c {
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[LiveEventState.values().length];
            try {
                iArr[LiveEventState.EVENT_DVR_MODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LiveEventState.EVENT_THANK_YOU.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            b = iArr;
        }
    }

    @AssistedInject
    public PlayerPostPlayManagerImpl(InterfaceC7282ctK interfaceC7282ctK, InterfaceC7609czT interfaceC7609czT, InterfaceC5527cAs interfaceC5527cAs, @Assisted IPlayer.PlaybackType playbackType, @Assisted("deeplink") boolean z, @Assisted String str, @Assisted("supplemental") boolean z2, @Assisted PostPlayExperience postPlayExperience) {
        C8632dsu.c((Object) interfaceC7282ctK, "");
        C8632dsu.c((Object) interfaceC7609czT, "");
        C8632dsu.c((Object) interfaceC5527cAs, "");
        C8632dsu.c((Object) playbackType, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) postPlayExperience, "");
        this.b = interfaceC7282ctK;
        this.f = interfaceC5527cAs;
        this.g = playbackType;
        this.d = z;
        this.c = str;
        this.e = z2;
        this.j = PostPlayDisplayState.c;
        this.h = interfaceC7609czT.b(postPlayExperience);
    }

    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("PlayerPostPlayManager");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class PostPlayDisplayState {
        private static final /* synthetic */ PostPlayDisplayState[] b;
        private static final /* synthetic */ InterfaceC8598drn e;
        public static final PostPlayDisplayState c = new PostPlayDisplayState("NOT_INITIALIZED", 0);
        public static final PostPlayDisplayState d = new PostPlayDisplayState("INITIALIZED", 1);
        public static final PostPlayDisplayState a = new PostPlayDisplayState("DISMISSED", 2);

        private static final /* synthetic */ PostPlayDisplayState[] b() {
            return new PostPlayDisplayState[]{c, d, a};
        }

        public static PostPlayDisplayState valueOf(String str) {
            return (PostPlayDisplayState) Enum.valueOf(PostPlayDisplayState.class, str);
        }

        public static PostPlayDisplayState[] values() {
            return (PostPlayDisplayState[]) b.clone();
        }

        private PostPlayDisplayState(String str, int i) {
        }

        static {
            PostPlayDisplayState[] b2 = b();
            b = b2;
            e = C8600drp.e(b2);
        }
    }

    @Override // o.InterfaceC7607czR
    public void b(long j, C5086bsC c5086bsC, long j2, long j3, long j4, drM<? super AbstractC5531cAw, dpR> drm) {
        PostPlayDisplayState postPlayDisplayState;
        C8632dsu.c((Object) drm, "");
        AbstractC5531cAw abstractC5531cAw = this.h;
        if (abstractC5531cAw == null || (postPlayDisplayState = this.j) == PostPlayDisplayState.a || postPlayDisplayState == PostPlayDisplayState.d) {
            return;
        }
        IPlayer.PlaybackType playbackType = this.g;
        if (playbackType == IPlayer.PlaybackType.OfflinePlayback) {
            if (!this.b.e(this.c)) {
                return;
            }
        } else if (playbackType == IPlayer.PlaybackType.LivePlayback) {
            if ((c5086bsC != null ? c5086bsC.a() : null) != LiveEventState.EVENT_THANK_YOU) {
                return;
            }
        } else if (this.d && this.e) {
            return;
        }
        if (b(abstractC5531cAw, j, this.g, c5086bsC, j2, j3, j4)) {
            c(abstractC5531cAw);
            drm.invoke(abstractC5531cAw);
            if (abstractC5531cAw instanceof C5529cAu) {
                C7496cxM.e.e("regularPostPlayShown");
            }
        }
    }

    @Override // o.InterfaceC7607czR
    public void e(drM<? super AbstractC5531cAw, dpR> drm) {
        C8632dsu.c((Object) drm, "");
        AbstractC5531cAw abstractC5531cAw = this.h;
        if (abstractC5531cAw != null) {
            boolean z = this.g == IPlayer.PlaybackType.LivePlayback;
            boolean z2 = abstractC5531cAw instanceof C5529cAu;
            if (z2 || z) {
                c(abstractC5531cAw);
                drm.invoke(abstractC5531cAw);
                if (z2) {
                    C7496cxM.e.e("endOfPlayPostPlayShown");
                }
            }
        }
    }

    @Override // o.InterfaceC7607czR
    public void d(drO<dpR> dro) {
        C8632dsu.c((Object) dro, "");
        if (this.j == PostPlayDisplayState.d) {
            c();
            dro.invoke();
        }
    }

    @Override // o.InterfaceC7607czR
    public boolean b() {
        return this.j == PostPlayDisplayState.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean b(o.AbstractC5531cAw r10, long r11, com.netflix.mediaclient.servicemgr.IPlayer.PlaybackType r13, o.C5086bsC r14, long r15, long r17, long r19) {
        /*
            r9 = this;
            r0 = r10
            com.netflix.mediaclient.servicemgr.IPlayer$PlaybackType r1 = com.netflix.mediaclient.servicemgr.IPlayer.PlaybackType.LivePlayback
            r2 = 2
            r3 = 0
            r5 = 1
            r6 = 0
            r7 = r13
            if (r7 != r1) goto L32
            if (r14 == 0) goto L12
            com.netflix.mediaclient.servicemgr.LiveEventState r1 = r14.a()
            goto L13
        L12:
            r1 = 0
        L13:
            if (r1 != 0) goto L17
            r1 = -1
            goto L1f
        L17:
            int[] r7 = com.netflix.mediaclient.ui.player.postplay.PlayerPostPlayManagerImpl.c.b
            int r1 = r1.ordinal()
            r1 = r7[r1]
        L1f:
            if (r1 == r5) goto L27
            if (r1 == r2) goto L24
            goto L30
        L24:
            boolean r5 = r0 instanceof o.AbstractC5531cAw.b
            goto L31
        L27:
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 <= 0) goto L30
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 < 0) goto L30
            goto L31
        L30:
            r5 = r6
        L31:
            return r5
        L32:
            boolean r1 = r0 instanceof o.C5529cAu
            if (r1 == 0) goto L4a
            o.cAu r0 = (o.C5529cAu) r0
            int r1 = r0.o()
            if (r1 <= 0) goto L4a
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            int r0 = r0.o()
            long r7 = (long) r0
            long r0 = r1.toMillis(r7)
            goto L4c
        L4a:
            r0 = r17
        L4c:
            int r7 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r7 != 0) goto L52
            long r7 = (long) r2
            long r0 = r0 - r7
        L52:
            int r2 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r2 <= 0) goto L5b
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 < 0) goto L5b
            goto L5c
        L5b:
            r5 = r6
        L5c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.player.postplay.PlayerPostPlayManagerImpl.b(o.cAw, long, com.netflix.mediaclient.servicemgr.IPlayer$PlaybackType, o.bsC, long, long, long):boolean");
    }

    @Override // o.InterfaceC7607czR
    public void d() {
        C7496cxM.e.c();
        C7496cxM.d();
    }

    @Override // o.InterfaceC7607czR
    public void a(cBR cbr, drM<? super AbstractC7612czW, dpR> drm) {
        C8632dsu.c((Object) cbr, "");
        C8632dsu.c((Object) drm, "");
        AbstractC5531cAw abstractC5531cAw = this.h;
        if (abstractC5531cAw != null) {
            AbstractC7612czW a2 = this.f.a(cbr, abstractC5531cAw);
            e(a2);
            drm.invoke(a2);
        }
    }

    private final void e(AbstractC7612czW abstractC7612czW) {
        if (C8632dsu.c(abstractC7612czW, AbstractC7612czW.b.d)) {
            c();
        } else if (abstractC7612czW instanceof AbstractC7612czW.e) {
            c();
        } else if (abstractC7612czW instanceof AbstractC7612czW.d) {
        } else {
            C8632dsu.c(abstractC7612czW, AbstractC7612czW.a.b);
        }
    }

    private final void c(AbstractC5531cAw abstractC5531cAw) {
        this.j = PostPlayDisplayState.d;
        C7496cxM c7496cxM = C7496cxM.e;
        c7496cxM.e(abstractC5531cAw);
        c7496cxM.a(abstractC5531cAw);
    }

    private final void c() {
        C7496cxM.d();
        this.j = PostPlayDisplayState.a;
    }
}
