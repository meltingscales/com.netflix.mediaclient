package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.netflix.android.imageloader.api.GetImageRequest;
import com.netflix.model.leafs.originals.interactive.Image;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.SourceRect;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.SubscribersKt;
import java.io.File;
import o.C5639cCw;
import o.C5794cIp;
import o.C8632dsu;
import o.C9684uz;
import o.cIA;
import o.dpR;

/* renamed from: o.cIp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5794cIp extends C1045Mp {
    public static final C5794cIp a = new C5794cIp();

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(ImageDecoder.DecodeException decodeException) {
        C8632dsu.c((Object) decodeException, "");
        return true;
    }

    private C5794cIp() {
        super("InteractiveSpriteImageLoader");
    }

    public final Single<GetImageRequest.a> a(InterfaceC9638uF interfaceC9638uF, View view, final Image image, SourceRect sourceRect, float f, final Moment moment) {
        boolean g;
        C8632dsu.c((Object) interfaceC9638uF, "");
        C8632dsu.c((Object) view, "");
        if (image == null) {
            Single<GetImageRequest.a> just = Single.just(null);
            C8632dsu.a(just, "");
            return just;
        }
        String url = image.url();
        if (url != null) {
            g = C8691duz.g(url);
            if (!g) {
                final SourceRect sourceRect2 = image.sourceRect();
                GetImageRequest a2 = GetImageRequest.c.c(view).a(url);
                if (sourceRect2 == null && sourceRect != null) {
                    a2.d((int) (sourceRect.width().intValue() * f));
                    a2.c((int) (sourceRect.height().intValue() * f));
                }
                Single<GetImageRequest.a> b = interfaceC9638uF.b(a2.a());
                final drM<Throwable, dpR> drm = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.interactive.SpriteImageLoader$getImage$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Throwable th) {
                        b(th);
                        return dpR.c;
                    }

                    public final void b(Throwable th) {
                        C5639cCw.e.b(true, Image.this, moment);
                    }
                };
                Single<GetImageRequest.a> doOnError = b.doOnError(new Consumer() { // from class: o.cIB
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C5794cIp.b(drM.this, obj);
                    }
                });
                final drM<GetImageRequest.a, GetImageRequest.a> drm2 = new drM<GetImageRequest.a, GetImageRequest.a>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.interactive.SpriteImageLoader$getImage$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    /* renamed from: c */
                    public final GetImageRequest.a invoke(GetImageRequest.a aVar) {
                        C8632dsu.c((Object) aVar, "");
                        C5639cCw.e.b(false, Image.this, moment);
                        return new GetImageRequest.a(sourceRect2 == null ? aVar.b() : C5794cIp.a.e(aVar.b(), sourceRect2), aVar.d(), aVar.e());
                    }
                };
                Single map = doOnError.map(new Function() { // from class: o.cIu
                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        GetImageRequest.a c;
                        c = C5794cIp.c(drM.this, obj);
                        return c;
                    }
                });
                C8632dsu.a(map, "");
                return map;
            }
        }
        Single<GetImageRequest.a> just2 = Single.just(null);
        C8632dsu.a(just2, "");
        return just2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetImageRequest.a c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (GetImageRequest.a) drm.invoke(obj);
    }

    @SuppressLint({"CheckResult"})
    public final void a(InterfaceC9638uF interfaceC9638uF, final ImageView imageView, final Image image, final SourceRect sourceRect, final float f, final cIA cia, final Moment moment) {
        int i;
        byte[] d;
        ImageDecoder.Source createSource;
        C8632dsu.c((Object) interfaceC9638uF, "");
        C8632dsu.c((Object) imageView, "");
        final String url = image != null ? image.url() : null;
        if (url != null) {
            if (!image.animated() || (i = Build.VERSION.SDK_INT) < 28) {
                GetImageRequest a2 = GetImageRequest.c.c(imageView).a(url);
                if (image.sourceRect() == null && sourceRect != null) {
                    a2.d((int) (sourceRect.width().intValue() * f));
                    a2.c((int) (sourceRect.height().intValue() * f));
                }
                SubscribersKt.subscribeBy(interfaceC9638uF.b(a2.a()), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.interactive.SpriteImageLoader$loadImage$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Throwable th) {
                        b(th);
                        return dpR.c;
                    }

                    public final void b(Throwable th) {
                        C8632dsu.c((Object) th, "");
                        C5639cCw.e.b(true, Image.this, moment);
                        C5794cIp c5794cIp = C5794cIp.a;
                        cIA cia2 = cia;
                        if (cia2 != null) {
                            cia2.b(th.toString());
                        }
                    }
                }, new drM<GetImageRequest.a, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.interactive.SpriteImageLoader$loadImage$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(GetImageRequest.a aVar) {
                        c(aVar);
                        return dpR.c;
                    }

                    public final void c(GetImageRequest.a aVar) {
                        C8632dsu.c((Object) aVar, "");
                        C5639cCw.e.b(false, Image.this, moment);
                        SourceRect sourceRect2 = Image.this.sourceRect();
                        Bitmap b = sourceRect2 == null ? aVar.b() : C5794cIp.a.e(aVar.b(), sourceRect2);
                        SourceRect sourceRect3 = sourceRect;
                        if (sourceRect3 != null) {
                            C5794cIp.a.e(imageView, sourceRect3, f);
                        }
                        imageView.setImageBitmap(b);
                        cIA cia2 = cia;
                        if (cia2 != null) {
                            cia2.e(imageView);
                        }
                    }
                });
            } else if (i >= 31) {
                C5639cCw c5639cCw = C5639cCw.e;
                C5618cCb a3 = c5639cCw.a(url);
                if (a3 != null) {
                    c5639cCw.b(false, image, moment);
                    d = drC.d(new File(a3.e()));
                    createSource = ImageDecoder.createSource(d, (int) a3.c(), (int) a3.b());
                    C8632dsu.a(createSource, "");
                    c(createSource, image, imageView);
                }
            } else {
                SubscribersKt.subscribeBy(interfaceC9638uF.e(new C9684uz().e(url).e()), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.interactive.SpriteImageLoader$loadImage$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Throwable th) {
                        e(th);
                        return dpR.c;
                    }

                    public final void e(Throwable th) {
                        C8632dsu.c((Object) th, "");
                        C5639cCw.e.b(true, Image.this, moment);
                        C5794cIp c5794cIp = C5794cIp.a;
                        cIA cia2 = cia;
                        if (cia2 != null) {
                            cia2.b(th.toString());
                        }
                    }
                }, new drM<C9684uz.d, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.interactive.SpriteImageLoader$loadImage$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(C9684uz.d dVar) {
                        d(dVar);
                        return dpR.c;
                    }

                    public final void d(C9684uz.d dVar) {
                        ImageDecoder.Source createSource2;
                        C8632dsu.c((Object) dVar, "");
                        C5639cCw.e.b(false, Image.this, moment);
                        C5794cIp c5794cIp = C5794cIp.a;
                        createSource2 = ImageDecoder.createSource(dVar.c());
                        C8632dsu.a(createSource2, "");
                        c5794cIp.c(createSource2, Image.this, imageView);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(ImageDecoder.Source source, final Image image, ImageView imageView) {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, new ImageDecoder$OnHeaderDecodedListener() { // from class: o.cIz
            public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source2) {
                C5794cIp.d(Image.this, imageDecoder, imageInfo, source2);
            }
        });
        C8632dsu.a(decodeDrawable, "");
        imageView.setImageDrawable(decodeDrawable);
        if (C5800cIv.e(decodeDrawable)) {
            C5802cIx.b(decodeDrawable).setRepeatCount(0);
            C5802cIx.b(decodeDrawable).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Image image, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        C8632dsu.c((Object) image, "");
        C8632dsu.c((Object) imageDecoder, "");
        C8632dsu.c((Object) imageInfo, "");
        C8632dsu.c((Object) source, "");
        SourceRect sourceRect = image.sourceRect();
        if (sourceRect != null) {
            Integer x = sourceRect.x();
            C8632dsu.a(x, "");
            int intValue = x.intValue();
            Integer y = sourceRect.y();
            C8632dsu.a(y, "");
            int intValue2 = y.intValue();
            int intValue3 = sourceRect.x().intValue();
            Integer width = sourceRect.width();
            C8632dsu.a(width, "");
            int intValue4 = width.intValue();
            int intValue5 = sourceRect.y().intValue();
            Integer height = sourceRect.height();
            C8632dsu.a(height, "");
            imageDecoder.setCrop(new Rect(intValue, intValue2, intValue3 + intValue4, intValue5 + height.intValue()));
        }
        imageDecoder.setOnPartialImageListener(new ImageDecoder.OnPartialImageListener() { // from class: o.cIC
            @Override // android.graphics.ImageDecoder.OnPartialImageListener
            public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                boolean a2;
                a2 = C5794cIp.a(decodeException);
                return a2;
            }
        });
    }

    @SuppressLint({"CheckResult"})
    public final void e(InterfaceC9638uF interfaceC9638uF, final TextView textView, final Image image, final cIA cia, final Moment moment) {
        boolean g;
        C8632dsu.c((Object) interfaceC9638uF, "");
        C8632dsu.c((Object) textView, "");
        C8632dsu.c((Object) moment, "");
        if (image == null) {
            if (cia != null) {
                cia.b("loadImageInTextView called with a null image");
                return;
            }
            return;
        }
        String url = image.url();
        if (url != null) {
            g = C8691duz.g(url);
            if (!g) {
                SubscribersKt.subscribeBy(interfaceC9638uF.b(GetImageRequest.c.c(textView).a(url).a()), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.interactive.SpriteImageLoader$loadImageInTextView$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Throwable th) {
                        d(th);
                        return dpR.c;
                    }

                    public final void d(Throwable th) {
                        C8632dsu.c((Object) th, "");
                        C5639cCw.e.b(true, Image.this, moment);
                        String str = "unable to load image " + th;
                        C5794cIp c5794cIp = C5794cIp.a;
                        cIA cia2 = cia;
                        if (cia2 != null) {
                            cia2.b(str);
                        }
                    }
                }, new drM<GetImageRequest.a, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.interactive.SpriteImageLoader$loadImageInTextView$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(GetImageRequest.a aVar) {
                        c(aVar);
                        return dpR.c;
                    }

                    public final void c(GetImageRequest.a aVar) {
                        C8632dsu.c((Object) aVar, "");
                        C5639cCw.e.b(false, Image.this, moment);
                        SourceRect sourceRect = Image.this.sourceRect();
                        textView.setBackground(new BitmapDrawable(textView.getContext().getResources(), sourceRect == null ? aVar.b() : C5794cIp.a.e(aVar.b(), sourceRect)));
                        cIA cia2 = cia;
                        if (cia2 != null) {
                            cia2.e(textView);
                        }
                    }
                });
                return;
            }
        }
        if (cia != null) {
            cia.b("loadImageInTextView called with an empty url");
        }
    }

    public final Bitmap e(Bitmap bitmap, SourceRect sourceRect) {
        C8632dsu.c((Object) bitmap, "");
        C8632dsu.c((Object) sourceRect, "");
        Integer x = sourceRect.x();
        C8632dsu.a(x, "");
        int intValue = x.intValue();
        Integer y = sourceRect.y();
        C8632dsu.a(y, "");
        int intValue2 = y.intValue();
        Integer width = sourceRect.width();
        C8632dsu.a(width, "");
        int intValue3 = width.intValue();
        Integer height = sourceRect.height();
        C8632dsu.a(height, "");
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, intValue, intValue2, intValue3, height.intValue());
        C8632dsu.a(createBitmap, "");
        return createBitmap;
    }

    public final float c(Context context) {
        C8632dsu.c((Object) context, "");
        return (context.getResources().getDisplayMetrics().ydpi / 160) / (C8150deu.h() ? 1.33f : 2.66f);
    }

    public final float b(Context context) {
        C8632dsu.c((Object) context, "");
        return (context.getResources().getDisplayMetrics().xdpi / 160) / (C8150deu.h() ? 1.33f : 2.66f);
    }

    public final void d(View view, int i, int i2, int i3, int i4, float f) {
        C8632dsu.c((Object) view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C8632dsu.d(layoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (i >= 0) {
            i = (int) ((i * f) + 0.5d);
        }
        marginLayoutParams.width = i;
        if (i2 >= 0) {
            i2 = (int) ((i2 * f) + 0.5d);
        }
        marginLayoutParams.height = i2;
        marginLayoutParams.setMarginStart((int) ((i3 * f) + 0.5d));
        marginLayoutParams.topMargin = (int) ((i4 * f) + 0.5d);
        view.setLayoutParams(marginLayoutParams);
    }

    public final void e(View view, SourceRect sourceRect, float f) {
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) sourceRect, "");
        Integer width = sourceRect.width();
        C8632dsu.a(width, "");
        int intValue = width.intValue();
        Integer height = sourceRect.height();
        C8632dsu.a(height, "");
        int intValue2 = height.intValue();
        Integer x = sourceRect.x();
        C8632dsu.a(x, "");
        int intValue3 = x.intValue();
        Integer y = sourceRect.y();
        C8632dsu.a(y, "");
        d(view, intValue, intValue2, intValue3, y.intValue(), f);
    }
}
