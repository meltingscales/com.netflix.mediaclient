package com.netflix.mediaclient.ui.offline;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.ui.offline.OfflineVideoImageUtil;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.Single;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.SubscribersKt;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.NoWhenBranchMatchedException;
import o.C1045Mp;
import o.C1596aHd;
import o.C8106deC;
import o.C8166dfJ;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.C8691duz;
import o.C9684uz;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC8598drn;
import o.InterfaceC9638uF;
import o.dpR;
import o.dqE;
import o.drM;
import o.drO;

@Singleton
/* loaded from: classes4.dex */
public final class OfflineVideoImageUtil {
    public static final e a = new e(null);
    public static final int e = 8;
    private final InterfaceC9638uF b;
    private final Set<b> c;
    private final Context d;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes4.dex */
    public interface a {
        OfflineVideoImageUtil ap();
    }

    /* loaded from: classes4.dex */
    public interface c {
        void c();

        void d();
    }

    /* loaded from: classes4.dex */
    public final /* synthetic */ class d {
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ImageType.values().length];
            try {
                iArr[ImageType.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageType.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageType.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImageType.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            b = iArr;
        }
    }

    public static final OfflineVideoImageUtil c(Context context) {
        return a.e(context);
    }

    @Inject
    public OfflineVideoImageUtil(@ApplicationContext Context context, InterfaceC9638uF interfaceC9638uF) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) interfaceC9638uF, "");
        this.d = context;
        this.b = interfaceC9638uF;
        this.c = Collections.newSetFromMap(new ConcurrentHashMap());
    }

    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("OfflineVideoImageUtil");
        }

        public final OfflineVideoImageUtil e(Context context) {
            C8632dsu.c((Object) context, "");
            return ((a) EntryPointAccessors.fromApplication(context, a.class)).ap();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class ImageType {
        private static final /* synthetic */ InterfaceC8598drn e;
        private static final /* synthetic */ ImageType[] f;
        public static final ImageType a = new ImageType("VIDEO", 0);
        public static final ImageType c = new ImageType("STORY", 1);
        public static final ImageType b = new ImageType("TITLE", 2);
        public static final ImageType d = new ImageType("BILLBOARD", 3);

        private static final /* synthetic */ ImageType[] a() {
            return new ImageType[]{a, c, b, d};
        }

        public static ImageType valueOf(String str) {
            return (ImageType) Enum.valueOf(ImageType.class, str);
        }

        public static ImageType[] values() {
            return (ImageType[]) f.clone();
        }

        private ImageType(String str, int i) {
        }

        static {
            ImageType[] a2 = a();
            f = a2;
            e = C8600drp.e(a2);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private final String c;
        private final ImageType d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.c, (Object) bVar.c) && this.d == bVar.d;
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.c;
            ImageType imageType = this.d;
            return "DownloadKey(videoId=" + str + ", imageType=" + imageType + ")";
        }

        public b(String str, ImageType imageType) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) imageType, "");
            this.c = str;
            this.d = imageType;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File a() {
        return new File(this.d.getFilesDir(), "img/of/videos/");
    }

    private final File e(String str, ImageType imageType) {
        String str2;
        int i = d.b[imageType.ordinal()];
        if (i == 1) {
            str2 = "";
        } else if (i == 2) {
            str2 = "_storyUrl";
        } else if (i == 3) {
            str2 = "_titleImgUrl";
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        } else {
            str2 = "_billboardArtImgUrl";
        }
        File a2 = a();
        return new File(a2, str + str2 + ".img");
    }

    @SuppressLint({"CheckResult"})
    public final void c(final String str, String str2, ImageType imageType, final c cVar) {
        boolean g;
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) imageType, "");
        if (str != null) {
            g = C8691duz.g(str);
            if (g) {
                return;
            }
            final b bVar = new b(str2, imageType);
            if (this.c.contains(bVar)) {
                return;
            }
            if (cVar != null) {
                cVar.d();
            }
            this.c.add(bVar);
            final File e2 = e(str2, imageType);
            Single<Boolean> b2 = C8106deC.b(e2);
            final OfflineVideoImageUtil$cacheVideoImage$2 offlineVideoImageUtil$cacheVideoImage$2 = new drM<Boolean, Boolean>() { // from class: com.netflix.mediaclient.ui.offline.OfflineVideoImageUtil$cacheVideoImage$2
                @Override // o.drM
                /* renamed from: b */
                public final Boolean invoke(Boolean bool) {
                    C8632dsu.c((Object) bool, "");
                    return Boolean.valueOf(!bool.booleanValue());
                }
            };
            Maybe<Boolean> filter = b2.filter(new Predicate() { // from class: o.cul
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    boolean c2;
                    c2 = OfflineVideoImageUtil.c(drM.this, obj);
                    return c2;
                }
            });
            final drM<Boolean, MaybeSource<? extends Boolean>> drm = new drM<Boolean, MaybeSource<? extends Boolean>>() { // from class: com.netflix.mediaclient.ui.offline.OfflineVideoImageUtil$cacheVideoImage$3
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: d */
                public final MaybeSource<? extends Boolean> invoke(Boolean bool) {
                    File a2;
                    C8632dsu.c((Object) bool, "");
                    a2 = OfflineVideoImageUtil.this.a();
                    return C8106deC.d(a2).toMaybe();
                }
            };
            Maybe<R> flatMap = filter.flatMap(new Function() { // from class: o.cup
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    MaybeSource h;
                    h = OfflineVideoImageUtil.h(drM.this, obj);
                    return h;
                }
            });
            final drM<Boolean, MaybeSource<? extends C9684uz.d>> drm2 = new drM<Boolean, MaybeSource<? extends C9684uz.d>>() { // from class: com.netflix.mediaclient.ui.offline.OfflineVideoImageUtil$cacheVideoImage$4
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: b */
                public final MaybeSource<? extends C9684uz.d> invoke(Boolean bool) {
                    InterfaceC9638uF interfaceC9638uF;
                    C8632dsu.c((Object) bool, "");
                    C9684uz.a e3 = new C9684uz().e(str).e();
                    interfaceC9638uF = this.b;
                    return interfaceC9638uF.e(e3).toMaybe();
                }
            };
            Maybe flatMap2 = flatMap.flatMap(new Function() { // from class: o.cum
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    MaybeSource i;
                    i = OfflineVideoImageUtil.i(drM.this, obj);
                    return i;
                }
            });
            final drM<C9684uz.d, MaybeSource<? extends Object>> drm3 = new drM<C9684uz.d, MaybeSource<? extends Object>>() { // from class: com.netflix.mediaclient.ui.offline.OfflineVideoImageUtil$cacheVideoImage$5
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: c */
                public final MaybeSource<? extends Object> invoke(C9684uz.d dVar) {
                    InterfaceC9638uF interfaceC9638uF;
                    C8632dsu.c((Object) dVar, "");
                    interfaceC9638uF = OfflineVideoImageUtil.this.b;
                    if (interfaceC9638uF.d()) {
                        return C8106deC.c(dVar.c(), e2).toMaybe();
                    }
                    return C8106deC.b(dVar.c(), e2).toMaybe();
                }
            };
            Maybe doFinally = flatMap2.flatMap(new Function() { // from class: o.cuq
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    MaybeSource g2;
                    g2 = OfflineVideoImageUtil.g(drM.this, obj);
                    return g2;
                }
            }).doFinally(new Action() { // from class: o.cun
                @Override // io.reactivex.functions.Action
                public final void run() {
                    OfflineVideoImageUtil.c(OfflineVideoImageUtil.this, bVar, cVar);
                }
            });
            C8632dsu.a(doFinally, "");
            SubscribersKt.subscribeBy$default(doFinally, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.offline.OfflineVideoImageUtil$cacheVideoImage$7
                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    d(th);
                    return dpR.c;
                }

                public final void d(Throwable th) {
                    Map d2;
                    Map k;
                    Throwable th2;
                    C8632dsu.c((Object) th, "");
                    InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
                    d2 = dqE.d();
                    k = dqE.k(d2);
                    C1596aHd c1596aHd = new C1596aHd("Downloading video image failed", th, null, true, k, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b3 = c1596aHd.b();
                        if (b3 != null) {
                            String c2 = errorType.c();
                            c1596aHd.a(c2 + " " + b3);
                        }
                    }
                    if (c1596aHd.b() != null && c1596aHd.i != null) {
                        th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
                    } else if (c1596aHd.b() != null) {
                        th2 = new Throwable(c1596aHd.b());
                    } else {
                        th2 = c1596aHd.i;
                        if (th2 == null) {
                            th2 = new Throwable("Handled exception with no message");
                        } else if (th2 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a2 = dVar.a();
                    if (a2 != null) {
                        a2.e(c1596aHd, th2);
                    } else {
                        dVar.e().b(c1596aHd, th2);
                    }
                }
            }, (drO) null, (drM) null, 6, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaybeSource h(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (MaybeSource) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaybeSource i(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (MaybeSource) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaybeSource g(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (MaybeSource) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(OfflineVideoImageUtil offlineVideoImageUtil, b bVar, c cVar) {
        C8632dsu.c((Object) offlineVideoImageUtil, "");
        C8632dsu.c((Object) bVar, "");
        offlineVideoImageUtil.c.remove(bVar);
        if (cVar != null) {
            cVar.c();
        }
    }

    public final void a(String str) {
        C8632dsu.c((Object) str, "");
        C8166dfJ.b(null, false, 3, null);
        ImageType[] imageTypeArr = {ImageType.a, ImageType.c, ImageType.b, ImageType.d};
        for (int i = 0; i < 4; i++) {
            e(str, imageTypeArr[i]).delete();
        }
    }

    public final boolean c(String str, ImageType imageType) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) imageType, "");
        return this.c.contains(new b(str, imageType));
    }

    public final String b(String str, ImageType imageType) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) imageType, "");
        String uri = Uri.fromFile(e(str, imageType)).toString();
        C8632dsu.a(uri, "");
        return uri;
    }

    public final boolean a(String str, ImageType imageType) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) imageType, "");
        C8166dfJ.b(null, false, 3, null);
        return e(str, imageType).exists();
    }
}
