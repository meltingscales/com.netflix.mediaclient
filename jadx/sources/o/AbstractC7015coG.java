package o;

import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import o.AbstractC7015coG;
import o.C1758aNd;
import o.C6921cmS;
import o.C7011coC;
import o.C7058coz;
import o.C8572dqo;
import o.C8576dqs;
import o.C8632dsu;
import o.C8974go;
import o.InterfaceC6972cnQ;
import o.dpR;
import o.drM;

/* renamed from: o.coG  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7015coG extends AbstractC8899fS<C7011coC> {
    private final dwQ b;
    public static final d d = new d(null);
    public static final int a = 8;

    public abstract void b(boolean z, int i);

    public abstract void h();

    public final dwQ i() {
        return this.b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7015coG(C7011coC c7011coC, dwQ dwq) {
        super(c7011coC, null, 2, null);
        C8632dsu.c((Object) c7011coC, "");
        C8632dsu.c((Object) dwq, "");
        this.b = dwq;
    }

    /* renamed from: o.coG$d */
    /* loaded from: classes4.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }

    public static /* synthetic */ void a(AbstractC7015coG abstractC7015coG, boolean z, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetch");
        }
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            i = 25;
        }
        abstractC7015coG.b(z, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void c(AbstractC7015coG abstractC7015coG, C1758aNd c1758aNd, String str, drM drm, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: remove");
        }
        if ((i & 4) != 0) {
            drm = null;
        }
        abstractC7015coG.a(c1758aNd, str, drm);
    }

    public final void a(final C1758aNd c1758aNd, final String str, final drM<? super Boolean, dpR> drm) {
        C8632dsu.c((Object) c1758aNd, "");
        C8632dsu.c((Object) str, "");
        e(new drM<C7011coC, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.viewmodel.MyListViewModel$remove$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C7011coC c7011coC) {
                b(c7011coC);
                return dpR.c;
            }

            public final void b(C7011coC c7011coC) {
                int d2;
                C8632dsu.c((Object) c7011coC, "");
                List<C7058coz> b = c7011coC.b();
                String str2 = str;
                d2 = C8572dqo.d(b, 10);
                final ArrayList arrayList = new ArrayList(d2);
                for (C7058coz c7058coz : b) {
                    if (C8632dsu.c((Object) c7058coz.c(), (Object) str2)) {
                        c7058coz = C7058coz.a(c7058coz, null, null, false, null, true, false, 47, null);
                    }
                    arrayList.add(c7058coz);
                }
                AbstractC7015coG.this.b(new drM<C7011coC, C7011coC>() { // from class: com.netflix.mediaclient.ui.mylist.impl.viewmodel.MyListViewModel$remove$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    /* renamed from: e */
                    public final C7011coC invoke(C7011coC c7011coC2) {
                        C7011coC b2;
                        C8632dsu.c((Object) c7011coC2, "");
                        b2 = c7011coC2.b((r26 & 1) != 0 ? c7011coC2.m : null, (r26 & 2) != 0 ? c7011coC2.h : null, (r26 & 4) != 0 ? c7011coC2.a : false, (r26 & 8) != 0 ? c7011coC2.i : null, (r26 & 16) != 0 ? c7011coC2.j : null, (r26 & 32) != 0 ? c7011coC2.d : null, (r26 & 64) != 0 ? c7011coC2.l : null, (r26 & 128) != 0 ? c7011coC2.f : 0, (r26 & JSONzip.end) != 0 ? c7011coC2.g : null, (r26 & 512) != 0 ? c7011coC2.e : arrayList, (r26 & 1024) != 0 ? c7011coC2.c : false, (r26 & 2048) != 0 ? c7011coC2.b : null);
                        return b2;
                    }
                });
                List<C7058coz> b2 = c7011coC.b();
                String str3 = str;
                for (C7058coz c7058coz2 : b2) {
                    if (C8632dsu.c((Object) c7058coz2.c(), (Object) str3)) {
                        final Long d3 = C6921cmS.e.d(c7058coz2.i(), c7058coz2.d());
                        C1758aNd c1758aNd2 = c1758aNd;
                        String str4 = str;
                        VideoType b3 = c7058coz2.b();
                        TrackingInfoHolder d4 = c7058coz2.d();
                        final drM<Boolean, dpR> drm2 = drm;
                        final AbstractC7015coG abstractC7015coG = AbstractC7015coG.this;
                        final String str5 = str;
                        c1758aNd2.b(str4, b3, false, null, d4, (r20 & 32) != 0 ? null : null, (r20 & 64) != 0 ? null : null, new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.viewmodel.MyListViewModel$remove$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // o.drM
                            public /* synthetic */ dpR invoke(Boolean bool) {
                                d(bool.booleanValue());
                                return dpR.c;
                            }

                            public final void d(boolean z) {
                                drM<Boolean, dpR> drm3 = drm2;
                                if (drm3 != null) {
                                    drm3.invoke(Boolean.valueOf(z));
                                }
                                C6921cmS.e.a(d3);
                                if (z) {
                                    abstractC7015coG.e(str5);
                                } else {
                                    abstractC7015coG.b(str5);
                                }
                            }
                        });
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(final String str) {
        e(new drM<C7011coC, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.viewmodel.MyListViewModel$onItemRemovedFail$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C7011coC c7011coC) {
                b(c7011coC);
                return dpR.c;
            }

            public final void b(C7011coC c7011coC) {
                final List c;
                C8632dsu.c((Object) c7011coC, "");
                List<C7058coz> b = c7011coC.b();
                String str2 = str;
                for (C7058coz c7058coz : b) {
                    if (C8632dsu.c((Object) c7058coz.c(), (Object) str2)) {
                        c = C8576dqs.c(c7011coC.b(), c7058coz);
                        AbstractC7015coG.this.b(new drM<C7011coC, C7011coC>() { // from class: com.netflix.mediaclient.ui.mylist.impl.viewmodel.MyListViewModel$onItemRemovedFail$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // o.drM
                            /* renamed from: b */
                            public final C7011coC invoke(C7011coC c7011coC2) {
                                C7011coC b2;
                                C8632dsu.c((Object) c7011coC2, "");
                                b2 = c7011coC2.b((r26 & 1) != 0 ? c7011coC2.m : null, (r26 & 2) != 0 ? c7011coC2.h : null, (r26 & 4) != 0 ? c7011coC2.a : false, (r26 & 8) != 0 ? c7011coC2.i : null, (r26 & 16) != 0 ? c7011coC2.j : null, (r26 & 32) != 0 ? c7011coC2.d : null, (r26 & 64) != 0 ? c7011coC2.l : null, (r26 & 128) != 0 ? c7011coC2.f : 0, (r26 & JSONzip.end) != 0 ? c7011coC2.g : null, (r26 & 512) != 0 ? c7011coC2.e : c, (r26 & 1024) != 0 ? c7011coC2.c : false, (r26 & 2048) != 0 ? c7011coC2.b : null);
                                return b2;
                            }
                        });
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(final String str) {
        e(new drM<C7011coC, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.viewmodel.MyListViewModel$onItemRemovedSuccess$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C7011coC c7011coC) {
                b(c7011coC);
                return dpR.c;
            }

            public final void b(C7011coC c7011coC) {
                int d2;
                C8632dsu.c((Object) c7011coC, "");
                List<C7058coz> b = c7011coC.b();
                String str2 = str;
                d2 = C8572dqo.d(b, 10);
                final ArrayList arrayList = new ArrayList(d2);
                for (C7058coz c7058coz : b) {
                    if (C8632dsu.c((Object) c7058coz.c(), (Object) str2)) {
                        c7058coz = C7058coz.a(c7058coz, null, null, false, null, false, true, 31, null);
                    }
                    arrayList.add(c7058coz);
                }
                AbstractC7015coG.this.b(new drM<C7011coC, C7011coC>() { // from class: com.netflix.mediaclient.ui.mylist.impl.viewmodel.MyListViewModel$onItemRemovedSuccess$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    /* renamed from: e */
                    public final C7011coC invoke(C7011coC c7011coC2) {
                        C7011coC b2;
                        C8632dsu.c((Object) c7011coC2, "");
                        b2 = c7011coC2.b((r26 & 1) != 0 ? c7011coC2.m : null, (r26 & 2) != 0 ? c7011coC2.h : null, (r26 & 4) != 0 ? c7011coC2.a : false, (r26 & 8) != 0 ? c7011coC2.i : null, (r26 & 16) != 0 ? c7011coC2.j : null, (r26 & 32) != 0 ? c7011coC2.d : null, (r26 & 64) != 0 ? c7011coC2.l : null, (r26 & 128) != 0 ? c7011coC2.f : 0, (r26 & JSONzip.end) != 0 ? c7011coC2.g : null, (r26 & 512) != 0 ? c7011coC2.e : arrayList, (r26 & 1024) != 0 ? c7011coC2.c : false, (r26 & 2048) != 0 ? c7011coC2.b : null);
                        return b2;
                    }
                });
            }
        });
    }

    public final void a(final C1758aNd c1758aNd) {
        C8632dsu.c((Object) c1758aNd, "");
        e(new drM<C7011coC, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.viewmodel.MyListViewModel$executeAllScheduledRemovals$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C7011coC c7011coC) {
                a(c7011coC);
                return dpR.c;
            }

            public final void a(C7011coC c7011coC) {
                C8632dsu.c((Object) c7011coC, "");
                List<C7058coz> b = c7011coC.b();
                C1758aNd c1758aNd2 = C1758aNd.this;
                for (C7058coz c7058coz : b) {
                    if (!c7058coz.e() && !c7058coz.a()) {
                        c1758aNd2.b(c7058coz.c(), c7058coz.b(), false, null, c7058coz.d(), (r20 & 32) != 0 ? null : null, (r20 & 64) != 0 ? null : null, new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.viewmodel.MyListViewModel$executeAllScheduledRemovals$1$1$1
                            public final void b(boolean z) {
                            }

                            @Override // o.drM
                            public /* synthetic */ dpR invoke(Boolean bool) {
                                b(bool.booleanValue());
                                return dpR.c;
                            }
                        });
                    }
                }
            }
        });
    }

    public final void a(final int i) {
        e(new drM<C7011coC, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.viewmodel.MyListViewModel$updateSortOrder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C7011coC c7011coC) {
                d(c7011coC);
                return dpR.c;
            }

            public final void d(C7011coC c7011coC) {
                C8632dsu.c((Object) c7011coC, "");
                AbstractC7015coG abstractC7015coG = AbstractC7015coG.this;
                final int i2 = i;
                abstractC7015coG.b(new drM<C7011coC, C7011coC>() { // from class: com.netflix.mediaclient.ui.mylist.impl.viewmodel.MyListViewModel$updateSortOrder$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    /* renamed from: c */
                    public final C7011coC invoke(C7011coC c7011coC2) {
                        C7011coC b;
                        C8632dsu.c((Object) c7011coC2, "");
                        C8974go c8974go = C8974go.e;
                        b = c7011coC2.b((r26 & 1) != 0 ? c7011coC2.m : null, (r26 & 2) != 0 ? c7011coC2.h : null, (r26 & 4) != 0 ? c7011coC2.a : false, (r26 & 8) != 0 ? c7011coC2.i : c8974go, (r26 & 16) != 0 ? c7011coC2.j : c8974go, (r26 & 32) != 0 ? c7011coC2.d : null, (r26 & 64) != 0 ? c7011coC2.l : null, (r26 & 128) != 0 ? c7011coC2.f : i2, (r26 & JSONzip.end) != 0 ? c7011coC2.g : null, (r26 & 512) != 0 ? c7011coC2.e : null, (r26 & 1024) != 0 ? c7011coC2.c : false, (r26 & 2048) != 0 ? c7011coC2.b : null);
                        return b;
                    }
                });
            }
        });
        a(this, false, 0, 3, null);
    }

    public final void b(final int i, final int i2) {
        e(new drM<C7011coC, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.viewmodel.MyListViewModel$updateFilter$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C7011coC c7011coC) {
                c(c7011coC);
                return dpR.c;
            }

            public final void c(final C7011coC c7011coC) {
                C8632dsu.c((Object) c7011coC, "");
                c7011coC.a().get(i).d(i2);
                this.b(new drM<C7011coC, C7011coC>() { // from class: com.netflix.mediaclient.ui.mylist.impl.viewmodel.MyListViewModel$updateFilter$1.1
                    {
                        super(1);
                    }

                    @Override // o.drM
                    /* renamed from: e */
                    public final C7011coC invoke(C7011coC c7011coC2) {
                        C7011coC b;
                        C8632dsu.c((Object) c7011coC2, "");
                        b = c7011coC2.b((r26 & 1) != 0 ? c7011coC2.m : null, (r26 & 2) != 0 ? c7011coC2.h : null, (r26 & 4) != 0 ? c7011coC2.a : false, (r26 & 8) != 0 ? c7011coC2.i : null, (r26 & 16) != 0 ? c7011coC2.j : null, (r26 & 32) != 0 ? c7011coC2.d : C7011coC.this.a(), (r26 & 64) != 0 ? c7011coC2.l : null, (r26 & 128) != 0 ? c7011coC2.f : 0, (r26 & JSONzip.end) != 0 ? c7011coC2.g : null, (r26 & 512) != 0 ? c7011coC2.e : null, (r26 & 1024) != 0 ? c7011coC2.c : false, (r26 & 2048) != 0 ? c7011coC2.b : null);
                        return b;
                    }
                });
            }
        });
        a(this, false, 0, 3, null);
    }

    public final void g() {
        e(new drM<C7011coC, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.viewmodel.MyListViewModel$clearAllFilters$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C7011coC c7011coC) {
                c(c7011coC);
                return dpR.c;
            }

            public final void c(final C7011coC c7011coC) {
                C8632dsu.c((Object) c7011coC, "");
                Iterator<T> it = c7011coC.a().iterator();
                while (it.hasNext()) {
                    ((InterfaceC6972cnQ) it.next()).d(-1);
                }
                AbstractC7015coG.this.b(new drM<C7011coC, C7011coC>() { // from class: com.netflix.mediaclient.ui.mylist.impl.viewmodel.MyListViewModel$clearAllFilters$1.2
                    {
                        super(1);
                    }

                    @Override // o.drM
                    /* renamed from: c */
                    public final C7011coC invoke(C7011coC c7011coC2) {
                        C7011coC b;
                        C8632dsu.c((Object) c7011coC2, "");
                        b = c7011coC2.b((r26 & 1) != 0 ? c7011coC2.m : null, (r26 & 2) != 0 ? c7011coC2.h : null, (r26 & 4) != 0 ? c7011coC2.a : false, (r26 & 8) != 0 ? c7011coC2.i : null, (r26 & 16) != 0 ? c7011coC2.j : null, (r26 & 32) != 0 ? c7011coC2.d : C7011coC.this.a(), (r26 & 64) != 0 ? c7011coC2.l : null, (r26 & 128) != 0 ? c7011coC2.f : 0, (r26 & JSONzip.end) != 0 ? c7011coC2.g : null, (r26 & 512) != 0 ? c7011coC2.e : null, (r26 & 1024) != 0 ? c7011coC2.c : false, (r26 & 2048) != 0 ? c7011coC2.b : null);
                        return b;
                    }
                });
            }
        });
        a(this, false, 0, 3, null);
    }

    public final void e(final boolean z) {
        b(new drM<C7011coC, C7011coC>() { // from class: com.netflix.mediaclient.ui.mylist.impl.viewmodel.MyListViewModel$setEditMode$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: e */
            public final C7011coC invoke(C7011coC c7011coC) {
                C7011coC b;
                C8632dsu.c((Object) c7011coC, "");
                b = c7011coC.b((r26 & 1) != 0 ? c7011coC.m : null, (r26 & 2) != 0 ? c7011coC.h : null, (r26 & 4) != 0 ? c7011coC.a : false, (r26 & 8) != 0 ? c7011coC.i : null, (r26 & 16) != 0 ? c7011coC.j : null, (r26 & 32) != 0 ? c7011coC.d : null, (r26 & 64) != 0 ? c7011coC.l : null, (r26 & 128) != 0 ? c7011coC.f : 0, (r26 & JSONzip.end) != 0 ? c7011coC.g : null, (r26 & 512) != 0 ? c7011coC.e : null, (r26 & 1024) != 0 ? c7011coC.c : z, (r26 & 2048) != 0 ? c7011coC.b : null);
                return b;
            }
        });
    }

    public final void b(final C7058coz c7058coz) {
        C8632dsu.c((Object) c7058coz, "");
        C6921cmS.e.b(c7058coz.i(), c7058coz.d());
        e(new drM<C7011coC, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.viewmodel.MyListViewModel$scheduleForVideoRemoval$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C7011coC c7011coC) {
                c(c7011coC);
                return dpR.c;
            }

            public final void c(C7011coC c7011coC) {
                final List b;
                C8632dsu.c((Object) c7011coC, "");
                b = C8576dqs.b((Collection<? extends C7058coz>) ((Collection<? extends Object>) c7011coC.b()), C7058coz.this);
                this.b(new drM<C7011coC, C7011coC>() { // from class: com.netflix.mediaclient.ui.mylist.impl.viewmodel.MyListViewModel$scheduleForVideoRemoval$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    /* renamed from: b */
                    public final C7011coC invoke(C7011coC c7011coC2) {
                        C7011coC b2;
                        C8632dsu.c((Object) c7011coC2, "");
                        b2 = c7011coC2.b((r26 & 1) != 0 ? c7011coC2.m : null, (r26 & 2) != 0 ? c7011coC2.h : null, (r26 & 4) != 0 ? c7011coC2.a : false, (r26 & 8) != 0 ? c7011coC2.i : null, (r26 & 16) != 0 ? c7011coC2.j : null, (r26 & 32) != 0 ? c7011coC2.d : null, (r26 & 64) != 0 ? c7011coC2.l : null, (r26 & 128) != 0 ? c7011coC2.f : 0, (r26 & JSONzip.end) != 0 ? c7011coC2.g : null, (r26 & 512) != 0 ? c7011coC2.e : b, (r26 & 1024) != 0 ? c7011coC2.c : false, (r26 & 2048) != 0 ? c7011coC2.b : null);
                        return b2;
                    }
                });
            }
        });
    }

    public final void c(final String str) {
        C8632dsu.c((Object) str, "");
        e(new drM<C7011coC, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.viewmodel.MyListViewModel$cancelVideoRemoval$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C7011coC c7011coC) {
                e(c7011coC);
                return dpR.c;
            }

            public final void e(C7011coC c7011coC) {
                final List c;
                C8632dsu.c((Object) c7011coC, "");
                List<C7058coz> b = c7011coC.b();
                String str2 = str;
                for (C7058coz c7058coz : b) {
                    if (C8632dsu.c((Object) c7058coz.c(), (Object) str2)) {
                        c = C8576dqs.c(c7011coC.b(), c7058coz);
                        AbstractC7015coG.this.b(new drM<C7011coC, C7011coC>() { // from class: com.netflix.mediaclient.ui.mylist.impl.viewmodel.MyListViewModel$cancelVideoRemoval$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // o.drM
                            /* renamed from: d */
                            public final C7011coC invoke(C7011coC c7011coC2) {
                                C7011coC b2;
                                C8632dsu.c((Object) c7011coC2, "");
                                b2 = c7011coC2.b((r26 & 1) != 0 ? c7011coC2.m : null, (r26 & 2) != 0 ? c7011coC2.h : null, (r26 & 4) != 0 ? c7011coC2.a : false, (r26 & 8) != 0 ? c7011coC2.i : null, (r26 & 16) != 0 ? c7011coC2.j : null, (r26 & 32) != 0 ? c7011coC2.d : null, (r26 & 64) != 0 ? c7011coC2.l : null, (r26 & 128) != 0 ? c7011coC2.f : 0, (r26 & JSONzip.end) != 0 ? c7011coC2.g : null, (r26 & 512) != 0 ? c7011coC2.e : c, (r26 & 1024) != 0 ? c7011coC2.c : false, (r26 & 2048) != 0 ? c7011coC2.b : null);
                                return b2;
                            }
                        });
                        C6921cmS.e.a(c7058coz.i(), c7058coz.d());
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        });
    }
}
