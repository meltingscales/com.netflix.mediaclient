package o;

import com.netflix.mediaclient.servicemgr.interface_.ContextualText;
import com.netflix.mediaclient.servicemgr.interface_.GameDetails;
import com.netflix.mediaclient.ui.epoxymodels.api.controller.ControllerVideoDataOverrides;
import com.netflix.model.leafs.UpNextFeedListItem;
import com.netflix.model.leafs.UpNextFeedVideoEvidence;
import o.AbstractC7907daP;
import o.C7909daR;
import o.C8632dsu;
import o.InterfaceC8366diy;

/* renamed from: o.daR  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7909daR {
    public static final e d = new e(null);
    private final UpNextFeedListItem a;
    private final boolean b;
    private final UpNextFeedVideoEvidence c;
    private final ContextualText e;
    private final String f;
    private final boolean g;
    private final InterfaceC8366diy h;
    private final AbstractC7907daP j;

    public final boolean a() {
        return this.b;
    }

    public final boolean b() {
        return this.g;
    }

    public final UpNextFeedListItem c() {
        return this.a;
    }

    public final UpNextFeedVideoEvidence d() {
        return this.c;
    }

    public final ContextualText e() {
        return this.e;
    }

    public final InterfaceC8366diy g() {
        return this.h;
    }

    public final String i() {
        return this.f;
    }

    public final AbstractC7907daP j() {
        return this.j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
        if (r3 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008d, code lost:
        if (r2 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a5, code lost:
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00be, code lost:
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C7909daR(com.netflix.model.leafs.UpNextFeedListItem r2, com.netflix.model.leafs.UpNextFeedVideoEvidence r3, o.InterfaceC8366diy r4, o.AbstractC7907daP r5, com.netflix.mediaclient.ui.epoxymodels.api.controller.ControllerVideoDataOverrides r6) {
        /*
            r1 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r2, r0)
            o.C8632dsu.c(r3, r0)
            o.C8632dsu.c(r4, r0)
            o.C8632dsu.c(r5, r0)
            r1.<init>()
            r1.a = r2
            r1.c = r3
            r1.h = r4
            r1.j = r5
            if (r6 == 0) goto L2c
            java.lang.String r2 = r5.c()
            com.netflix.mediaclient.ui.epoxymodels.api.controller.ControllerVideoDataOverrides$VideoOverrideName r0 = com.netflix.mediaclient.ui.epoxymodels.api.controller.ControllerVideoDataOverrides.VideoOverrideName.c
            java.lang.Boolean r2 = r6.c(r2, r0)
            if (r2 == 0) goto L2c
            boolean r2 = r2.booleanValue()
            goto L30
        L2c:
            boolean r2 = r5.f()
        L30:
            r1.g = r2
            if (r6 == 0) goto L45
            java.lang.String r2 = r5.c()
            com.netflix.mediaclient.ui.epoxymodels.api.controller.ControllerVideoDataOverrides$VideoOverrideName r0 = com.netflix.mediaclient.ui.epoxymodels.api.controller.ControllerVideoDataOverrides.VideoOverrideName.d
            java.lang.Boolean r2 = r6.c(r2, r0)
            if (r2 == 0) goto L45
            boolean r2 = r2.booleanValue()
            goto L49
        L45:
            boolean r2 = r5.g()
        L49:
            r1.b = r2
            java.lang.String r2 = r3.getTitleTreatmentUrl()
            r6 = 0
            if (r2 == 0) goto L5a
            java.lang.String r2 = r3.getTitleTreatmentUrl()
            o.C8632dsu.d(r2)
            goto L74
        L5a:
            java.lang.String r2 = r4.af()
            if (r2 == 0) goto L68
            java.lang.String r2 = r4.af()
            o.C8632dsu.d(r2)
            goto L74
        L68:
            java.lang.String r2 = r5.d()
            if (r2 == 0) goto L73
            java.lang.String r2 = r5.d()
            goto L74
        L73:
            r2 = r6
        L74:
            r1.f = r2
            boolean r2 = r5 instanceof o.AbstractC7907daP.a
            if (r2 == 0) goto Laa
            com.netflix.mediaclient.servicemgr.interface_.ContextualText r2 = r3.contextualSynopsis()
            if (r2 == 0) goto L8f
            java.lang.String r3 = r2.text()
            if (r3 == 0) goto L8c
            boolean r3 = o.C8684dus.a(r3)
            if (r3 == 0) goto L8d
        L8c:
            r2 = r6
        L8d:
            if (r2 != 0) goto La8
        L8f:
            o.daP$a r5 = (o.AbstractC7907daP.a) r5
            o.diy r2 = r5.i()
            com.netflix.mediaclient.servicemgr.interface_.ContextualText$TextContext r3 = com.netflix.mediaclient.servicemgr.interface_.ContextualText.TextContext.g
            com.netflix.mediaclient.servicemgr.interface_.ContextualText r2 = r2.e(r3)
            java.lang.String r3 = r2.text()
            if (r3 == 0) goto Lc0
            boolean r3 = o.C8684dus.a(r3)
            if (r3 == 0) goto La8
            goto Lc0
        La8:
            r6 = r2
            goto Lc0
        Laa:
            boolean r2 = r5 instanceof o.AbstractC7907daP.d
            if (r2 == 0) goto Lc3
            com.netflix.mediaclient.servicemgr.interface_.ContextualText r2 = r3.contextualSynopsis()
            if (r2 == 0) goto Lc0
            java.lang.String r3 = r2.text()
            if (r3 == 0) goto Lc0
            boolean r3 = o.C8684dus.a(r3)
            if (r3 == 0) goto La8
        Lc0:
            r1.e = r6
            return
        Lc3:
            kotlin.NoWhenBranchMatchedException r2 = new kotlin.NoWhenBranchMatchedException
            r2.<init>()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7909daR.<init>(com.netflix.model.leafs.UpNextFeedListItem, com.netflix.model.leafs.UpNextFeedVideoEvidence, o.diy, o.daP, com.netflix.mediaclient.ui.epoxymodels.api.controller.ControllerVideoDataOverrides):void");
    }

    /* renamed from: o.daR$e */
    /* loaded from: classes5.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("ValidatedItem");
        }

        public static /* synthetic */ C7909daR a(e eVar, UpNextFeedListItem upNextFeedListItem, ControllerVideoDataOverrides controllerVideoDataOverrides, int i, Object obj) {
            if ((i & 2) != 0) {
                controllerVideoDataOverrides = null;
            }
            return eVar.e(upNextFeedListItem, controllerVideoDataOverrides);
        }

        public final C7909daR e(final UpNextFeedListItem upNextFeedListItem, final ControllerVideoDataOverrides controllerVideoDataOverrides) {
            C8632dsu.c((Object) upNextFeedListItem, "");
            return (C7909daR) C9726vo.d(upNextFeedListItem.getItemEvidence(), upNextFeedListItem.getVideo(), new drX<UpNextFeedVideoEvidence, InterfaceC8366diy, C7909daR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.ValidatedItem$Companion$getValidatedItem$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                /* renamed from: e */
                public final C7909daR invoke(UpNextFeedVideoEvidence upNextFeedVideoEvidence, InterfaceC8366diy interfaceC8366diy) {
                    C8632dsu.c((Object) upNextFeedVideoEvidence, "");
                    C8632dsu.c((Object) interfaceC8366diy, "");
                    if (upNextFeedVideoEvidence.getImages().isEmpty()) {
                        C7909daR.e eVar = C7909daR.d;
                        return null;
                    }
                    InterfaceC8366diy aH = interfaceC8366diy.aH();
                    if ((aH != null ? aH.getTitle() : null) != null) {
                        UpNextFeedListItem upNextFeedListItem2 = UpNextFeedListItem.this;
                        InterfaceC8366diy aH2 = interfaceC8366diy.aH();
                        C8632dsu.d(aH2);
                        return new C7909daR(upNextFeedListItem2, upNextFeedVideoEvidence, interfaceC8366diy, new AbstractC7907daP.a(aH2), controllerVideoDataOverrides);
                    } else if (interfaceC8366diy.aJ() != null) {
                        UpNextFeedListItem upNextFeedListItem3 = UpNextFeedListItem.this;
                        GameDetails aJ = interfaceC8366diy.aJ();
                        C8632dsu.d(aJ);
                        return new C7909daR(upNextFeedListItem3, upNextFeedVideoEvidence, interfaceC8366diy, new AbstractC7907daP.d(aJ), controllerVideoDataOverrides);
                    } else {
                        return null;
                    }
                }
            });
        }
    }
}
