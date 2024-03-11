package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.netflix.android.imageloader.api.BlurProcessor;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.Map;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.uQ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9649uQ implements BlurProcessor {
    public static final d d = new d(null);
    private final Context e;

    /* renamed from: o.uQ$c */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[BlurProcessor.Intensity.values().length];
            try {
                iArr[BlurProcessor.Intensity.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlurProcessor.Intensity.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* renamed from: o.uQ$d */
    /* loaded from: classes2.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("BlurProcessorImpl");
        }
    }

    @Inject
    public C9649uQ(@ApplicationContext Context context) {
        C8632dsu.c((Object) context, "");
        this.e = context;
    }

    @Override // com.netflix.android.imageloader.api.BlurProcessor
    public Bitmap c(Bitmap bitmap, BlurProcessor.Intensity intensity) {
        Map d2;
        Map k;
        Throwable th;
        C8632dsu.c((Object) bitmap, "");
        C8632dsu.c((Object) intensity, "");
        if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd("SPY-19305 - blur called on a non ARGB_8888 bitmap", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
        return a(bitmap, intensity);
    }

    private final Bitmap a(Bitmap bitmap, BlurProcessor.Intensity intensity) {
        float f;
        C8166dfJ.b(null, false, 3, null);
        d dVar = d;
        dVar.getLogTag();
        SystemClock.elapsedRealtime();
        int i = c.a[intensity.ordinal()];
        if (i == 1) {
            f = 0.15f;
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            f = 0.09f;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * f), (int) (bitmap.getHeight() * f), true);
        C8632dsu.a(createScaledBitmap, "");
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        if (config != config2) {
            Bitmap copy = createScaledBitmap.copy(config2, true);
            createScaledBitmap.recycle();
            C8632dsu.d(copy);
            dVar.getLogTag();
            createScaledBitmap = copy;
        }
        RenderScript a = a();
        try {
            Allocation createFromBitmap = Allocation.createFromBitmap(a, createScaledBitmap, Allocation.MipmapControl.MIPMAP_NONE, 129);
            Allocation createTyped = Allocation.createTyped(a, createFromBitmap.getType());
            ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(a, Element.U8_4(a));
            create.setRadius(5.0f);
            create.setInput(createFromBitmap);
            create.forEach(createTyped);
            createTyped.copyTo(createScaledBitmap);
            create.destroy();
            createTyped.destroy();
            createFromBitmap.destroy();
            a.destroy();
            SystemClock.elapsedRealtime();
            dVar.getLogTag();
            return createScaledBitmap;
        } catch (Throwable th) {
            a.destroy();
            SystemClock.elapsedRealtime();
            d.getLogTag();
            throw th;
        }
    }

    private final RenderScript a() {
        RenderScript create = RenderScript.create(this.e);
        C8632dsu.a(create, "");
        return create;
    }
}
