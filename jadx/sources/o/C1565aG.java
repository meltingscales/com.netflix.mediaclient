package o;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.airbnb.epoxy.LifecycleAwareEpoxyViewBinder;
import o.C1565aG;
import o.C8632dsu;
import o.dpR;

/* renamed from: o.aG */
/* loaded from: classes2.dex */
public final class C1565aG {
    public static /* synthetic */ InterfaceC8554dpx c(Fragment fragment, int i, boolean z, boolean z2, drM drm, drX drx, int i2, Object obj) {
        boolean z3 = (i2 & 2) != 0 ? false : z;
        boolean z4 = (i2 & 4) != 0 ? false : z2;
        if ((i2 & 8) != 0) {
            drm = new drM<LifecycleAwareEpoxyViewBinder, dpR>() { // from class: com.airbnb.epoxy.EpoxyViewBinderExtensionsKt$epoxyView$3
                public final void a(LifecycleAwareEpoxyViewBinder lifecycleAwareEpoxyViewBinder) {
                    C8632dsu.c((Object) lifecycleAwareEpoxyViewBinder, "");
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(LifecycleAwareEpoxyViewBinder lifecycleAwareEpoxyViewBinder) {
                    a(lifecycleAwareEpoxyViewBinder);
                    return dpR.c;
                }
            };
        }
        return a(fragment, i, z3, z4, drm, drx);
    }

    public static final InterfaceC8554dpx<LifecycleAwareEpoxyViewBinder> a(final Fragment fragment, final int i, final boolean z, final boolean z2, final drM<? super LifecycleAwareEpoxyViewBinder, dpR> drm, final drX<? super InterfaceC2023aX, ? super Context, dpR> drx) {
        InterfaceC8554dpx<LifecycleAwareEpoxyViewBinder> b;
        C8632dsu.c((Object) fragment, "");
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) drx, "");
        b = dpB.b(new drO<LifecycleAwareEpoxyViewBinder>() { // from class: com.airbnb.epoxy.EpoxyViewBinderExtensionsKt$epoxyView$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final LifecycleAwareEpoxyViewBinder invoke() {
                LifecycleAwareEpoxyViewBinder e;
                e = C1565aG.e(Fragment.this, i, z, z2, drm, drx);
                return e;
            }
        });
        return b;
    }

    public static /* synthetic */ InterfaceC8554dpx a(Fragment fragment, int i, boolean z, boolean z2, drM drm, drX drx, int i2, Object obj) {
        boolean z3 = (i2 & 2) != 0 ? false : z;
        boolean z4 = (i2 & 4) != 0 ? false : z2;
        if ((i2 & 8) != 0) {
            drm = new drM<LifecycleAwareEpoxyViewBinder, dpR>() { // from class: com.airbnb.epoxy.EpoxyViewBinderExtensionsKt$optionalEpoxyView$3
                public final void a(LifecycleAwareEpoxyViewBinder lifecycleAwareEpoxyViewBinder) {
                    C8632dsu.c((Object) lifecycleAwareEpoxyViewBinder, "");
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(LifecycleAwareEpoxyViewBinder lifecycleAwareEpoxyViewBinder) {
                    a(lifecycleAwareEpoxyViewBinder);
                    return dpR.c;
                }
            };
        }
        return d(fragment, i, z3, z4, drm, drx);
    }

    public static final InterfaceC8554dpx<LifecycleAwareEpoxyViewBinder> d(final Fragment fragment, final int i, final boolean z, final boolean z2, final drM<? super LifecycleAwareEpoxyViewBinder, dpR> drm, final drX<? super InterfaceC2023aX, ? super Context, dpR> drx) {
        InterfaceC8554dpx<LifecycleAwareEpoxyViewBinder> b;
        C8632dsu.c((Object) fragment, "");
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) drx, "");
        b = dpB.b(new drO<LifecycleAwareEpoxyViewBinder>() { // from class: com.airbnb.epoxy.EpoxyViewBinderExtensionsKt$optionalEpoxyView$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
            /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v8 */
            /* JADX WARN: Type inference failed for: r2v9 */
            @Override // o.drO
            /* renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final com.airbnb.epoxy.LifecycleAwareEpoxyViewBinder invoke() {
                /*
                    r11 = this;
                    androidx.fragment.app.Fragment r0 = androidx.fragment.app.Fragment.this
                    android.view.View r0 = r0.getView()
                    if (r0 == 0) goto Lb2
                    int r1 = r2
                    boolean r2 = r3
                    android.view.View r3 = r0.findViewById(r1)
                    r4 = 0
                    if (r3 != 0) goto L9e
                    if (r2 == 0) goto L9d
                    r3 = -1
                    if (r1 != r3) goto L1a
                    goto L9d
                L1a:
                    android.content.res.Resources r3 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L25
                    if (r3 == 0) goto L58
                    java.lang.String r1 = r3.getResourceEntryName(r1)     // Catch: android.content.res.Resources.NotFoundException -> L25
                    goto L59
                L25:
                    r1 = move-exception
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r5 = "Id not found in "
                    r3.append(r5)
                    java.lang.Class r5 = r0.getClass()
                    o.dtv r5 = o.dsA.a(r5)
                    r3.append(r5)
                    java.lang.String r5 = ", fallbackToNameLookup: "
                    r3.append(r5)
                    r3.append(r2)
                    java.lang.String r2 = ", error message: "
                    r3.append(r2)
                    java.lang.String r1 = r1.getLocalizedMessage()
                    r3.append(r1)
                    java.lang.String r1 = r3.toString()
                    java.lang.String r2 = "ViewBinderViewExt"
                    android.util.Log.e(r2, r1)
                L58:
                    r1 = r4
                L59:
                    if (r1 == 0) goto L9d
                    java.lang.String r2 = o.C4757bl.d(r0)
                    boolean r2 = o.C8632dsu.c(r2, r1)
                    if (r2 == 0) goto L66
                    goto L9b
                L66:
                    boolean r2 = r0 instanceof android.view.ViewGroup
                    if (r2 == 0) goto L9a
                    android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                    o.dtQ r0 = o.C4757bl.d(r0)
                    com.airbnb.epoxy.EpoxyViewBinderExtensionsKt$optionalEpoxyView$4$invoke$$inlined$maybeFindViewByIdName$1 r2 = new o.drM<java.lang.Object, java.lang.Boolean>() { // from class: com.airbnb.epoxy.EpoxyViewBinderExtensionsKt$optionalEpoxyView$4$invoke$$inlined$maybeFindViewByIdName$1
                        static {
                            /*
                                com.airbnb.epoxy.EpoxyViewBinderExtensionsKt$optionalEpoxyView$4$invoke$$inlined$maybeFindViewByIdName$1 r0 = new com.airbnb.epoxy.EpoxyViewBinderExtensionsKt$optionalEpoxyView$4$invoke$$inlined$maybeFindViewByIdName$1
                                r0.<init>()
                                
                                // error: 0x0005: SPUT  (r0 I:com.airbnb.epoxy.EpoxyViewBinderExtensionsKt$optionalEpoxyView$4$invoke$$inlined$maybeFindViewByIdName$1) com.airbnb.epoxy.EpoxyViewBinderExtensionsKt$optionalEpoxyView$4$invoke$$inlined$maybeFindViewByIdName$1.c com.airbnb.epoxy.EpoxyViewBinderExtensionsKt$optionalEpoxyView$4$invoke$$inlined$maybeFindViewByIdName$1
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.EpoxyViewBinderExtensionsKt$optionalEpoxyView$4$invoke$$inlined$maybeFindViewByIdName$1.<clinit>():void");
                        }

                        {
                            /*
                                r1 = this;
                                r0 = 1
                                r1.<init>(r0)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.EpoxyViewBinderExtensionsKt$optionalEpoxyView$4$invoke$$inlined$maybeFindViewByIdName$1.<init>():void");
                        }

                        @Override // o.drM
                        /* renamed from: b */
                        public final java.lang.Boolean invoke(java.lang.Object r1) {
                            /*
                                r0 = this;
                                boolean r1 = r1 instanceof android.view.View
                                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                                return r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.EpoxyViewBinderExtensionsKt$optionalEpoxyView$4$invoke$$inlined$maybeFindViewByIdName$1.invoke(java.lang.Object):java.lang.Boolean");
                        }

                        @Override // o.drM
                        public /* synthetic */ java.lang.Boolean invoke(java.lang.Object r1) {
                            /*
                                r0 = this;
                                java.lang.Boolean r1 = r0.invoke(r1)
                                return r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.EpoxyViewBinderExtensionsKt$optionalEpoxyView$4$invoke$$inlined$maybeFindViewByIdName$1.invoke(java.lang.Object):java.lang.Object");
                        }
                    }
                    o.dtQ r0 = o.dtX.e(r0, r2)
                    o.C8632dsu.d(r0)
                    java.util.Iterator r0 = r0.iterator()
                L7d:
                    boolean r2 = r0.hasNext()
                    if (r2 == 0) goto L95
                    java.lang.Object r2 = r0.next()
                    r3 = r2
                    android.view.View r3 = (android.view.View) r3
                    java.lang.String r3 = o.C4757bl.d(r3)
                    boolean r3 = o.C8632dsu.c(r3, r1)
                    if (r3 == 0) goto L7d
                    goto L96
                L95:
                    r2 = r4
                L96:
                    r0 = r2
                    android.view.View r0 = (android.view.View) r0
                    goto L9b
                L9a:
                    r0 = r4
                L9b:
                    r3 = r0
                    goto L9e
                L9d:
                    r3 = r4
                L9e:
                    if (r3 != 0) goto La1
                    return r4
                La1:
                    androidx.fragment.app.Fragment r5 = androidx.fragment.app.Fragment.this
                    int r6 = r2
                    boolean r7 = r4
                    boolean r8 = r3
                    o.drM<com.airbnb.epoxy.LifecycleAwareEpoxyViewBinder, o.dpR> r9 = r5
                    o.drX<o.aX, android.content.Context, o.dpR> r10 = r6
                    com.airbnb.epoxy.LifecycleAwareEpoxyViewBinder r0 = o.C1565aG.c(r5, r6, r7, r8, r9, r10)
                    return r0
                Lb2:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "Fragment view has not been created"
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.EpoxyViewBinderExtensionsKt$optionalEpoxyView$4.invoke():com.airbnb.epoxy.LifecycleAwareEpoxyViewBinder");
            }
        });
        return b;
    }

    public static final LifecycleAwareEpoxyViewBinder e(final Fragment fragment, int i, boolean z, boolean z2, drM<? super LifecycleAwareEpoxyViewBinder, dpR> drm, drX<? super InterfaceC2023aX, ? super Context, dpR> drx) {
        LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
        C8632dsu.a(viewLifecycleOwner, "");
        LifecycleAwareEpoxyViewBinder lifecycleAwareEpoxyViewBinder = new LifecycleAwareEpoxyViewBinder(viewLifecycleOwner, new drO<View>() { // from class: com.airbnb.epoxy.EpoxyViewBinderExtensionsKt$epoxyViewInternal$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final View invoke() {
                return Fragment.this.getView();
            }
        }, i, z, z2, drx);
        drm.invoke(lifecycleAwareEpoxyViewBinder);
        return lifecycleAwareEpoxyViewBinder;
    }
}
