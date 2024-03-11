package o;

/* loaded from: classes3.dex */
public final class XL {
    public static final d d = new d(null);
    private Long a;
    private XI b;

    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("BrowseConfigLogger");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
        if ((r1 != null ? r1.d() : null) != (r5 != null ? r5.d() : null)) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(o.XI r5) {
        /*
            r4 = this;
            o.XL$d r0 = o.XL.d
            r0.getLogTag()
            o.XI r1 = r4.b
            r2 = 0
            if (r1 == 0) goto L13
            boolean r1 = r1.a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L14
        L13:
            r1 = r2
        L14:
            if (r5 == 0) goto L1f
            boolean r3 = r5.a()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L20
        L1f:
            r3 = r2
        L20:
            boolean r1 = o.C8632dsu.c(r1, r3)
            if (r1 == 0) goto L38
            o.XI r1 = r4.b
            if (r1 == 0) goto L2f
            com.netflix.mediaclient.features.api.FeatureExperience r1 = r1.d()
            goto L30
        L2f:
            r1 = r2
        L30:
            if (r5 == 0) goto L36
            com.netflix.mediaclient.features.api.FeatureExperience r2 = r5.d()
        L36:
            if (r1 == r2) goto L72
        L38:
            java.lang.Long r1 = r4.a
            if (r1 == 0) goto L4c
            long r1 = r1.longValue()
            r0.getLogTag()
            com.netflix.cl.Logger r3 = com.netflix.cl.Logger.INSTANCE
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r3.removeContext(r1)
        L4c:
            if (r5 == 0) goto L72
            r0.getLogTag()
            com.netflix.cl.Logger r0 = com.netflix.cl.Logger.INSTANCE
            com.netflix.cl.model.context.BrowsingExperience r1 = new com.netflix.cl.model.context.BrowsingExperience
            boolean r2 = r5.a()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            com.netflix.mediaclient.features.api.FeatureExperience r3 = r5.d()
            java.lang.String r3 = r3.name()
            r1.<init>(r2, r3)
            long r0 = r0.addContext(r1)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.a = r0
        L72:
            r4.b = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.XL.e(o.XI):void");
    }
}
