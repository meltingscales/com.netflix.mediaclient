package o;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import io.reactivex.subjects.PublishSubject;
import java.util.WeakHashMap;

/* renamed from: o.cKf  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5838cKf {
    public static final boolean b = false;
    public static final int d;
    private static final PublishSubject<AbstractC5833cKa> e;
    public static final C5838cKf a = new C5838cKf();
    private static final int[] c = new int[2];

    /* renamed from: o.cKf$d */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class d {
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[LoMoType.values().length];
            try {
                iArr[LoMoType.KIDS_FAVORITES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoMoType.CONTENT_PREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoMoType.STANDARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LoMoType.INSTANT_QUEUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LoMoType.FLAT_GENRE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LoMoType.GALLERY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LoMoType.CONTINUE_WATCHING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[LoMoType.POPULAR_GAMES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[LoMoType.CHARACTERS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[LoMoType.BILLBOARD.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[LoMoType.ROAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[LoMoType.TOP_TEN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            e = iArr;
        }
    }

    private C5838cKf() {
    }

    static {
        PublishSubject<AbstractC5833cKa> create = PublishSubject.create();
        C8632dsu.a(create, "");
        e = create;
        d = 8;
    }

    public static final RecyclerView.OnScrollListener d() {
        return e.b.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.content.Context r28, o.AbstractC5833cKa r29, o.InterfaceC5177bto r30, org.json.JSONObject r31, com.netflix.cl.model.context.CLContext r32, int r33, com.netflix.cl.model.AppView r34) {
        /*
            Method dump skipped, instructions count: 1354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5838cKf.d(android.content.Context, o.cKa, o.bto, org.json.JSONObject, com.netflix.cl.model.context.CLContext, int, com.netflix.cl.model.AppView):void");
    }

    public static final void d(TrackingInfoHolder trackingInfoHolder, AppView appView) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) appView, "");
        CLv2Utils.b(false, appView, trackingInfoHolder.c(), null);
    }

    public static final void c(AbstractC5833cKa abstractC5833cKa) {
        Integer b2;
        C8632dsu.c((Object) abstractC5833cKa, "");
        InterfaceC5177bto j = abstractC5833cKa.j();
        if (j == null || abstractC5833cKa.a() == null || (b2 = abstractC5833cKa.b()) == null) {
            return;
        }
        a aVar = new a(j, abstractC5833cKa, b2.intValue());
        abstractC5833cKa.e(aVar);
        C8187dfe.a(aVar, 500L);
    }

    /* renamed from: o.cKf$a */
    /* loaded from: classes4.dex */
    public static final class a extends b {
        final /* synthetic */ AbstractC5833cKa a;
        final /* synthetic */ InterfaceC5177bto c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC5177bto interfaceC5177bto, AbstractC5833cKa abstractC5833cKa, int i) {
            super(interfaceC5177bto);
            this.c = interfaceC5177bto;
            this.a = abstractC5833cKa;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = false;
            try {
                if (d() == this.a.j() && this.a.a() != null) {
                    View i = this.a.i();
                    if (i.isAttachedToWindow() && i.isShown()) {
                        DisplayMetrics displayMetrics = i.getResources().getDisplayMetrics();
                        float measuredHeight = i.getMeasuredHeight() * 0.5f;
                        i.getLocationInWindow(C5838cKf.c);
                        if (C5838cKf.c[1] >= (-measuredHeight) && C5838cKf.c[1] <= displayMetrics.heightPixels - measuredHeight) {
                            float measuredWidth = i.getMeasuredWidth() * 0.5f;
                            if (i.isAttachedToWindow() && C5838cKf.c[0] > (-measuredWidth)) {
                                if (C5838cKf.c[0] < displayMetrics.widthPixels - measuredWidth) {
                                    try {
                                        if (!this.a.l()) {
                                            C5838cKf c5838cKf = C5838cKf.a;
                                            Context context = i.getContext();
                                            C8632dsu.a(context, "");
                                            AbstractC5833cKa abstractC5833cKa = this.a;
                                            c5838cKf.d(context, abstractC5833cKa, this.c, abstractC5833cKa.g(), this.a.f(), this.d, this.a.h());
                                            if (C5838cKf.b) {
                                                this.a.e(-1);
                                            }
                                        }
                                        z = true;
                                    } catch (Throwable th) {
                                        th = th;
                                        z = true;
                                        this.a.a(z);
                                        this.a.e((b) null);
                                        throw th;
                                    }
                                }
                            }
                        }
                    }
                }
                this.a.a(z);
                this.a.e((b) null);
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public static final void d(AbstractC5833cKa abstractC5833cKa) {
        C8632dsu.c((Object) abstractC5833cKa, "");
        abstractC5833cKa.o();
    }

    /* renamed from: o.cKf$b */
    /* loaded from: classes4.dex */
    public static abstract class b implements Runnable {
        private final Object a;

        public final Object d() {
            return this.a;
        }

        public b(Object obj) {
            C8632dsu.c(obj, "");
            this.a = obj;
        }
    }

    /* renamed from: o.cKf$e */
    /* loaded from: classes4.dex */
    static final class e {
        public static final e b = new e();
        private static final float e = NetflixApplication.getInstance().getResources().getDisplayMetrics().densityDpi;
        private static final RecyclerView.OnScrollListener a = new d();
        private static final WeakHashMap<RecyclerView, PointF> d = new WeakHashMap<>();

        public final RecyclerView.OnScrollListener c() {
            return a;
        }

        private e() {
        }

        /* renamed from: o.cKf$e$d */
        /* loaded from: classes4.dex */
        public static final class d extends RecyclerView.OnScrollListener {
            d() {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                C8632dsu.c((Object) recyclerView, "");
                if (i == 0) {
                    e.b.a(recyclerView);
                } else if (i != 1) {
                } else {
                    e.b.c(recyclerView);
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                C8632dsu.c((Object) recyclerView, "");
                e.b.b(recyclerView, i, i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c(RecyclerView recyclerView) {
            WeakHashMap<RecyclerView, PointF> weakHashMap = d;
            if (weakHashMap.get(recyclerView) == null) {
                weakHashMap.put(recyclerView, new PointF());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a(RecyclerView recyclerView) {
            PointF remove = d.remove(recyclerView);
            if (remove == null) {
                return;
            }
            NetflixActivity netflixActivity = (NetflixActivity) C9737vz.b(recyclerView.getContext(), NetflixActivity.class);
            remove.x = 0.0f;
            remove.y = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(RecyclerView recyclerView, int i, int i2) {
            PointF pointF = d.get(recyclerView);
            if (pointF == null) {
                return;
            }
            float f = pointF.x;
            float f2 = e;
            pointF.x = f + (Math.abs(i) / f2);
            pointF.y += Math.abs(i2) / f2;
        }
    }
}
