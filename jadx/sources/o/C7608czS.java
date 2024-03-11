package o;

import com.netflix.model.leafs.PostPlayExperience;
import o.AbstractC5531cAw;

/* renamed from: o.czS  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7608czS implements InterfaceC7609czT {
    public static final a c = new a(null);

    /* renamed from: o.czS$a */
    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("PlayerPostPlayDataProviderImpl");
        }
    }

    @Override // o.InterfaceC7609czT
    public AbstractC5531cAw b(PostPlayExperience postPlayExperience) {
        C8632dsu.c((Object) postPlayExperience, "");
        String type = postPlayExperience.getType();
        if (C8632dsu.c((Object) type, (Object) "nextEpisodeSeamless")) {
            return c(postPlayExperience);
        }
        if (C8632dsu.c((Object) type, (Object) "liveEventEnd")) {
            return d(postPlayExperience);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0050, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final o.C5529cAu c(com.netflix.model.leafs.PostPlayExperience r23) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7608czS.c(com.netflix.model.leafs.PostPlayExperience):o.cAu");
    }

    private final AbstractC5531cAw.b d(PostPlayExperience postPlayExperience) {
        return new AbstractC5531cAw.b(postPlayExperience.getAutoplaySeconds(), postPlayExperience.getRequestId(), postPlayExperience.getUuid());
    }
}
