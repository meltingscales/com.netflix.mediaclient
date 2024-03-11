package o;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import com.netflix.android.imageloader.api.GetImageRequest;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.model.leafs.originals.interactive.Image;
import com.netflix.model.leafs.originals.interactive.SourceRect;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.SubscribersKt;
import o.C5640cCx;
import o.C5794cIp;
import o.C8632dsu;
import o.cIA;
import o.dpR;

/* renamed from: o.cCx  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5640cCx extends NetflixImageView implements cCN {
    private BitmapDrawable a;
    private BitmapDrawable b;
    private BitmapDrawable c;
    private Disposable d;
    private BitmapDrawable e;
    private BitmapDrawable f;
    private BitmapDrawable g;
    private BitmapDrawable h;
    private BitmapDrawable i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5640cCx(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5640cCx(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public final BitmapDrawable e() {
        return this.a;
    }

    public final void setCorrect(BitmapDrawable bitmapDrawable) {
        this.c = bitmapDrawable;
    }

    public final void setDefault(BitmapDrawable bitmapDrawable) {
        this.a = bitmapDrawable;
    }

    public final void setFocused(BitmapDrawable bitmapDrawable) {
        this.b = bitmapDrawable;
    }

    public final void setLast10Secs(BitmapDrawable bitmapDrawable) {
        this.e = bitmapDrawable;
    }

    public final void setResult(BitmapDrawable bitmapDrawable) {
        this.h = bitmapDrawable;
    }

    public final void setSelected(BitmapDrawable bitmapDrawable) {
        this.f = bitmapDrawable;
    }

    public final void setUpdate(BitmapDrawable bitmapDrawable) {
        this.g = bitmapDrawable;
    }

    public final void setWrong(BitmapDrawable bitmapDrawable) {
        this.i = bitmapDrawable;
    }

    public /* synthetic */ C5640cCx(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5640cCx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
    }

    @Override // o.cCN
    public void e(int i) {
        if (C8632dsu.c(getDrawable(), this.a)) {
            return;
        }
        setVisibility(0);
        BitmapDrawable bitmapDrawable = this.a;
        if (bitmapDrawable != null) {
            setImageDrawable(bitmapDrawable);
        }
    }

    @Override // o.cCN
    public void d(int i) {
        if (C8632dsu.c(getDrawable(), this.b)) {
            return;
        }
        setVisibility(0);
        BitmapDrawable bitmapDrawable = this.b;
        if (bitmapDrawable != null) {
            setImageDrawable(bitmapDrawable);
        }
    }

    @Override // o.cCN
    public void g(int i) {
        if (C8632dsu.c(getDrawable(), this.f)) {
            return;
        }
        setVisibility(0);
        BitmapDrawable bitmapDrawable = this.f;
        if (bitmapDrawable != null) {
            setImageDrawable(bitmapDrawable);
        }
    }

    @Override // o.cCN
    public void b(int i) {
        if (C8632dsu.c(getDrawable(), this.h)) {
            return;
        }
        setVisibility(0);
        BitmapDrawable bitmapDrawable = this.h;
        if (bitmapDrawable != null) {
            setImageDrawable(bitmapDrawable);
        }
    }

    @Override // o.cCN
    public void f(int i) {
        if (C8632dsu.c(getDrawable(), this.i)) {
            return;
        }
        setVisibility(0);
        BitmapDrawable bitmapDrawable = this.i;
        if (bitmapDrawable != null) {
            setImageDrawable(bitmapDrawable);
        }
    }

    @Override // o.cCN
    public void c(int i) {
        if (C8632dsu.c(getDrawable(), this.c)) {
            return;
        }
        setVisibility(0);
        BitmapDrawable bitmapDrawable = this.c;
        if (bitmapDrawable != null) {
            setImageDrawable(bitmapDrawable);
        }
    }

    @Override // o.cCN
    public void j(int i) {
        if (C8632dsu.c(getDrawable(), this.g)) {
            return;
        }
        setVisibility(0);
        BitmapDrawable bitmapDrawable = this.g;
        if (bitmapDrawable != null) {
            setImageDrawable(bitmapDrawable);
        }
    }

    @Override // o.cCN
    public void a() {
        if (C8632dsu.c(getDrawable(), this.e)) {
            return;
        }
        setVisibility(0);
        BitmapDrawable bitmapDrawable = this.e;
        if (bitmapDrawable != null) {
            setImageDrawable(bitmapDrawable);
        }
    }

    @Override // o.cCN
    public void a(int i) {
        setVisibility(8);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Disposable disposable = this.d;
        if (disposable != null) {
            disposable.dispose();
        }
        this.d = null;
    }

    public final void c(InterfaceC9638uF interfaceC9638uF, SourceRect sourceRect, float f, final Image image, final Image image2, final Image image3, final Image image4, final Image image5, final Image image6, final Image image7, final Image image8, final cIA cia) {
        C8632dsu.c((Object) interfaceC9638uF, "");
        String url = image != null ? image.url() : null;
        String url2 = image3 != null ? image3.url() : null;
        String url3 = image2 != null ? image2.url() : null;
        String url4 = image4 != null ? image4.url() : null;
        String url5 = image5 != null ? image5.url() : null;
        String url6 = image6 != null ? image6.url() : null;
        String url7 = image7 != null ? image7.url() : null;
        String url8 = image8 != null ? image8.url() : null;
        if (sourceRect != null) {
            C5794cIp.a.e(this, sourceRect, f);
        }
        if (url == null) {
            return;
        }
        String str = url7;
        String str2 = url6;
        String str3 = url5;
        String str4 = url4;
        String str5 = url3;
        if (e(url, url2, url3, url4, url5, str2, str, url8)) {
            this.d = SubscribersKt.subscribeBy(interfaceC9638uF.b(GetImageRequest.c.c(this).a(url).a()), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveVisualStateImageView$loadImages$2
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
                    String th2 = th.toString();
                    NetflixImageView.a aVar = NetflixImageView.Companion;
                    cIA cia2 = cIA.this;
                    if (cia2 != null) {
                        cia2.b(th2);
                    }
                }
            }, new drM<GetImageRequest.a, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveVisualStateImageView$loadImages$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(GetImageRequest.a aVar) {
                    e(aVar);
                    return dpR.c;
                }

                public final void e(GetImageRequest.a aVar) {
                    BitmapDrawable bitmapDrawable;
                    BitmapDrawable e;
                    BitmapDrawable e2;
                    BitmapDrawable e3;
                    BitmapDrawable e4;
                    BitmapDrawable e5;
                    BitmapDrawable e6;
                    BitmapDrawable e7;
                    C8632dsu.c((Object) aVar, "");
                    SourceRect sourceRect2 = Image.this.sourceRect();
                    C5640cCx c5640cCx = this;
                    if (sourceRect2 != null) {
                        bitmapDrawable = new BitmapDrawable(c5640cCx.getContext().getResources(), C5794cIp.a.e(aVar.b(), sourceRect2));
                    } else {
                        bitmapDrawable = new BitmapDrawable(this.getContext().getResources(), aVar.b());
                    }
                    c5640cCx.setDefault(bitmapDrawable);
                    C5640cCx c5640cCx2 = this;
                    c5640cCx2.setImageDrawable(c5640cCx2.e());
                    Image image9 = image2;
                    SourceRect sourceRect3 = image9 != null ? image9.sourceRect() : null;
                    C5640cCx c5640cCx3 = this;
                    if (sourceRect3 != null) {
                        e = new BitmapDrawable(c5640cCx3.getContext().getResources(), C5794cIp.a.e(aVar.b(), sourceRect3));
                    } else {
                        e = c5640cCx3.e();
                    }
                    c5640cCx3.setSelected(e);
                    Image image10 = image3;
                    SourceRect sourceRect4 = image10 != null ? image10.sourceRect() : null;
                    C5640cCx c5640cCx4 = this;
                    if (sourceRect4 != null) {
                        e2 = new BitmapDrawable(c5640cCx4.getContext().getResources(), C5794cIp.a.e(aVar.b(), sourceRect4));
                    } else {
                        e2 = c5640cCx4.e();
                    }
                    c5640cCx4.setFocused(e2);
                    Image image11 = image4;
                    SourceRect sourceRect5 = image11 != null ? image11.sourceRect() : null;
                    C5640cCx c5640cCx5 = this;
                    if (sourceRect5 != null) {
                        e3 = new BitmapDrawable(c5640cCx5.getContext().getResources(), C5794cIp.a.e(aVar.b(), sourceRect5));
                    } else {
                        e3 = c5640cCx5.e();
                    }
                    c5640cCx5.setResult(e3);
                    Image image12 = image5;
                    SourceRect sourceRect6 = image12 != null ? image12.sourceRect() : null;
                    C5640cCx c5640cCx6 = this;
                    if (sourceRect6 != null) {
                        e4 = new BitmapDrawable(c5640cCx6.getContext().getResources(), C5794cIp.a.e(aVar.b(), sourceRect6));
                    } else {
                        e4 = c5640cCx6.e();
                    }
                    c5640cCx6.setWrong(e4);
                    Image image13 = image6;
                    SourceRect sourceRect7 = image13 != null ? image13.sourceRect() : null;
                    C5640cCx c5640cCx7 = this;
                    if (sourceRect7 != null) {
                        e5 = new BitmapDrawable(c5640cCx7.getContext().getResources(), C5794cIp.a.e(aVar.b(), sourceRect7));
                    } else {
                        e5 = c5640cCx7.e();
                    }
                    c5640cCx7.setCorrect(e5);
                    Image image14 = image7;
                    SourceRect sourceRect8 = image14 != null ? image14.sourceRect() : null;
                    C5640cCx c5640cCx8 = this;
                    if (sourceRect8 != null) {
                        e6 = new BitmapDrawable(c5640cCx8.getContext().getResources(), C5794cIp.a.e(aVar.b(), sourceRect8));
                    } else {
                        e6 = c5640cCx8.e();
                    }
                    c5640cCx8.setUpdate(e6);
                    Image image15 = image8;
                    SourceRect sourceRect9 = image15 != null ? image15.sourceRect() : null;
                    C5640cCx c5640cCx9 = this;
                    if (sourceRect9 != null) {
                        e7 = new BitmapDrawable(c5640cCx9.getContext().getResources(), C5794cIp.a.e(aVar.b(), sourceRect9));
                    } else {
                        e7 = c5640cCx9.e();
                    }
                    c5640cCx9.setLast10Secs(e7);
                    cIA cia2 = cia;
                    if (cia2 != null) {
                        cia2.e(this);
                    }
                }
            });
            return;
        }
        final SourceRect sourceRect2 = image.sourceRect();
        GetImageRequest.d dVar = GetImageRequest.c;
        GetImageRequest a = dVar.c(this).a(url);
        if (sourceRect2 == null && sourceRect != null) {
            a.d((int) ((sourceRect.width().intValue() * f) + 0.5d));
            a.c((int) ((sourceRect.height().intValue() * f) + 0.5d));
        }
        SubscribersKt.subscribeBy(interfaceC9638uF.b(a.a()), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveVisualStateImageView$loadImages$4$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                a(th);
                return dpR.c;
            }

            public final void a(Throwable th) {
                C8632dsu.c((Object) th, "");
                String th2 = th.toString();
                NetflixImageView.a aVar = NetflixImageView.Companion;
                cIA cia2 = cIA.this;
                if (cia2 != null) {
                    cia2.b(th2);
                }
            }
        }, new drM<GetImageRequest.a, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveVisualStateImageView$loadImages$4$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(GetImageRequest.a aVar) {
                e(aVar);
                return dpR.c;
            }

            public final void e(GetImageRequest.a aVar) {
                C8632dsu.c((Object) aVar, "");
                this.setDefault(new BitmapDrawable(this.getContext().getResources(), SourceRect.this == null ? aVar.b() : C5794cIp.a.e(aVar.b(), SourceRect.this)));
                C5640cCx c5640cCx = this;
                c5640cCx.setImageDrawable(c5640cCx.e());
                cIA cia2 = cia;
                if (cia2 != null) {
                    cia2.e(this);
                }
            }
        });
        if (url2 != null) {
            final SourceRect sourceRect3 = image3.sourceRect();
            GetImageRequest a2 = dVar.c(this).a(url2);
            if (sourceRect3 == null && sourceRect != null) {
                a2.d((int) (sourceRect.width().intValue() * f));
                a2.c((int) (sourceRect.height().intValue() * f));
            }
            SubscribersKt.subscribeBy(interfaceC9638uF.b(a2.a()), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveVisualStateImageView$loadImages$5$1
                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    b(th);
                    return dpR.c;
                }

                public final void b(Throwable th) {
                    C8632dsu.c((Object) th, "");
                    NetflixImageView.a aVar = NetflixImageView.Companion;
                }
            }, new drM<GetImageRequest.a, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveVisualStateImageView$loadImages$5$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(GetImageRequest.a aVar) {
                    b(aVar);
                    return dpR.c;
                }

                public final void b(GetImageRequest.a aVar) {
                    C8632dsu.c((Object) aVar, "");
                    this.setFocused(new BitmapDrawable(this.getContext().getResources(), SourceRect.this == null ? aVar.b() : C5794cIp.a.e(aVar.b(), SourceRect.this)));
                }
            });
        }
        if (str5 != null) {
            final SourceRect sourceRect4 = image2.sourceRect();
            GetImageRequest a3 = dVar.c(this).a(str5);
            if (sourceRect4 == null && sourceRect != null) {
                a3.d((int) (sourceRect.width().intValue() * f));
                a3.c((int) (sourceRect.height().intValue() * f));
            }
            SubscribersKt.subscribeBy(interfaceC9638uF.b(dVar.c(this).a(str5).a()), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveVisualStateImageView$loadImages$6$1
                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    e(th);
                    return dpR.c;
                }

                public final void e(Throwable th) {
                    C8632dsu.c((Object) th, "");
                    NetflixImageView.a aVar = NetflixImageView.Companion;
                }
            }, new drM<GetImageRequest.a, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveVisualStateImageView$loadImages$6$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(GetImageRequest.a aVar) {
                    b(aVar);
                    return dpR.c;
                }

                public final void b(GetImageRequest.a aVar) {
                    C8632dsu.c((Object) aVar, "");
                    this.setSelected(new BitmapDrawable(this.getContext().getResources(), SourceRect.this == null ? aVar.b() : C5794cIp.a.e(aVar.b(), SourceRect.this)));
                }
            });
        }
        if (str4 != null) {
            final SourceRect sourceRect5 = image4.sourceRect();
            GetImageRequest a4 = dVar.c(this).a(str4);
            if (sourceRect5 == null && sourceRect != null) {
                a4.d((int) (sourceRect.width().intValue() * f));
                a4.c((int) (sourceRect.height().intValue() * f));
            }
            SubscribersKt.subscribeBy(interfaceC9638uF.b(dVar.c(this).a(str4).a()), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveVisualStateImageView$loadImages$7$1
                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    e(th);
                    return dpR.c;
                }

                public final void e(Throwable th) {
                    C8632dsu.c((Object) th, "");
                    NetflixImageView.a aVar = NetflixImageView.Companion;
                }
            }, new drM<GetImageRequest.a, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveVisualStateImageView$loadImages$7$2
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
                    this.setResult(new BitmapDrawable(this.getContext().getResources(), SourceRect.this == null ? aVar.b() : C5794cIp.a.e(aVar.b(), SourceRect.this)));
                }
            });
        }
        if (str3 != null) {
            final SourceRect sourceRect6 = image5.sourceRect();
            GetImageRequest a5 = dVar.c(this).a(str3);
            if (sourceRect6 == null && sourceRect != null) {
                a5.d((int) (sourceRect.width().intValue() * f));
                a5.c((int) (sourceRect.height().intValue() * f));
            }
            SubscribersKt.subscribeBy(interfaceC9638uF.b(dVar.c(this).a(str3).a()), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveVisualStateImageView$loadImages$8$1
                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    d(th);
                    return dpR.c;
                }

                public final void d(Throwable th) {
                    C8632dsu.c((Object) th, "");
                    NetflixImageView.a aVar = NetflixImageView.Companion;
                }
            }, new drM<GetImageRequest.a, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveVisualStateImageView$loadImages$8$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(GetImageRequest.a aVar) {
                    b(aVar);
                    return dpR.c;
                }

                public final void b(GetImageRequest.a aVar) {
                    C8632dsu.c((Object) aVar, "");
                    this.setWrong(new BitmapDrawable(this.getContext().getResources(), SourceRect.this == null ? aVar.b() : C5794cIp.a.e(aVar.b(), SourceRect.this)));
                }
            });
        }
        if (str2 != null) {
            final SourceRect sourceRect7 = image6.sourceRect();
            GetImageRequest a6 = dVar.c(this).a(str2);
            if (sourceRect7 == null && sourceRect != null) {
                a6.d((int) (sourceRect.width().intValue() * f));
                a6.c((int) (sourceRect.height().intValue() * f));
            }
            SubscribersKt.subscribeBy(interfaceC9638uF.b(dVar.c(this).a(str2).a()), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveVisualStateImageView$loadImages$9$1
                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    c(th);
                    return dpR.c;
                }

                public final void c(Throwable th) {
                    C8632dsu.c((Object) th, "");
                    NetflixImageView.a aVar = NetflixImageView.Companion;
                }
            }, new drM<GetImageRequest.a, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveVisualStateImageView$loadImages$9$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(GetImageRequest.a aVar) {
                    d(aVar);
                    return dpR.c;
                }

                public final void d(GetImageRequest.a aVar) {
                    C8632dsu.c((Object) aVar, "");
                    this.setCorrect(new BitmapDrawable(this.getContext().getResources(), SourceRect.this == null ? aVar.b() : C5794cIp.a.e(aVar.b(), SourceRect.this)));
                }
            });
        }
        if (str != null) {
            final SourceRect sourceRect8 = image7.sourceRect();
            GetImageRequest a7 = dVar.c(this).a(str);
            if (sourceRect8 == null && sourceRect != null) {
                a7.d((int) (sourceRect.width().intValue() * f));
                a7.c((int) (sourceRect.height().intValue() * f));
            }
            SubscribersKt.subscribeBy(interfaceC9638uF.b(dVar.c(this).a(str).a()), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveVisualStateImageView$loadImages$10$1
                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    c(th);
                    return dpR.c;
                }

                public final void c(Throwable th) {
                    C8632dsu.c((Object) th, "");
                    NetflixImageView.a aVar = NetflixImageView.Companion;
                }
            }, new drM<GetImageRequest.a, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveVisualStateImageView$loadImages$10$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(GetImageRequest.a aVar) {
                    d(aVar);
                    return dpR.c;
                }

                public final void d(GetImageRequest.a aVar) {
                    C8632dsu.c((Object) aVar, "");
                    this.setUpdate(new BitmapDrawable(this.getContext().getResources(), SourceRect.this == null ? aVar.b() : C5794cIp.a.e(aVar.b(), SourceRect.this)));
                }
            });
        }
        if (url8 != null) {
            final SourceRect sourceRect9 = image8.sourceRect();
            GetImageRequest a8 = dVar.c(this).a(url8);
            if (sourceRect9 == null && sourceRect != null) {
                a8.d((int) (sourceRect.width().intValue() * f));
                a8.c((int) (sourceRect.height().intValue() * f));
            }
            SubscribersKt.subscribeBy(interfaceC9638uF.b(dVar.c(this).a(url8).a()), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveVisualStateImageView$loadImages$11$1
                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    e(th);
                    return dpR.c;
                }

                public final void e(Throwable th) {
                    C8632dsu.c((Object) th, "");
                    NetflixImageView.a aVar = NetflixImageView.Companion;
                }
            }, new drM<GetImageRequest.a, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveVisualStateImageView$loadImages$11$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(GetImageRequest.a aVar) {
                    d(aVar);
                    return dpR.c;
                }

                public final void d(GetImageRequest.a aVar) {
                    C8632dsu.c((Object) aVar, "");
                    this.setLast10Secs(new BitmapDrawable(this.getContext().getResources(), SourceRect.this == null ? aVar.b() : C5794cIp.a.e(aVar.b(), SourceRect.this)));
                }
            });
        }
    }

    private final boolean e(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (str2 == null || C8632dsu.c((Object) str2, (Object) str)) {
            if (str3 == null || C8632dsu.c((Object) str3, (Object) str)) {
                if (str4 == null || C8632dsu.c((Object) str4, (Object) str)) {
                    if (str5 == null || C8632dsu.c((Object) str5, (Object) str)) {
                        if (str6 == null || C8632dsu.c((Object) str6, (Object) str)) {
                            if (str7 == null || C8632dsu.c((Object) str7, (Object) str)) {
                                return str8 == null || C8632dsu.c((Object) str8, (Object) str);
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
