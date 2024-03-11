package o;

import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.model.leafs.originals.interactive.Image;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.Notification;
import com.netflix.model.leafs.originals.interactive.Style;
import com.netflix.model.leafs.originals.interactive.template.ImageElement;
import io.reactivex.Observable;
import java.util.HashMap;
import java.util.Map;
import o.AbstractC5649cDf;
import o.cIE;

/* renamed from: o.cDw  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5666cDw extends AbstractC5656cDm {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5666cDw(Observable<C5651cDh> observable, InteractiveMoments interactiveMoments, Moment moment, View view, Notification notification, String str, Map<String, ? extends Style> map, HashMap<String, Image> hashMap, float f, InterfaceC9638uF interfaceC9638uF) {
        super(observable, interactiveMoments, moment, map, hashMap, f, interfaceC9638uF, false, 128, null);
        AbstractC5649cDf.d dVar;
        HashMap<String, Image> hashMap2;
        Drawable drawable;
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) interactiveMoments, "");
        C8632dsu.c((Object) moment, "");
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) notification, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) hashMap, "");
        C8632dsu.c((Object) interfaceC9638uF, "");
        Notification.NotificationChildren children = notification.children();
        FrameLayout frameLayout = (FrameLayout) view.findViewById(cIE.b.T);
        frameLayout.setTag(notification.id());
        AbstractC5649cDf.d dVar2 = AbstractC5649cDf.d;
        C8632dsu.d(frameLayout);
        dVar2.b(frameLayout, map.get(notification.styleId()), f);
        ImageElement background = children.background();
        if (background != null) {
            NetflixImageView netflixImageView = (NetflixImageView) view.findViewById(cIE.b.X);
            netflixImageView.setTag(background.id());
            Style style = map.get(background.styleId());
            C8632dsu.d(netflixImageView);
            dVar2.b(netflixImageView, style, f);
            netflixImageView.setForeground(null);
            dVar = dVar2;
            C5794cIp.a.a(interfaceC9638uF, netflixImageView, hashMap.get(background.assetId()), (r18 & 8) != 0 ? null : style != null ? style.rect() : null, (r18 & 16) != 0 ? 1.0f : f, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : moment);
        } else {
            dVar = dVar2;
        }
        ImageElement label = children.label();
        if (label != null) {
            C1204Sr c1204Sr = (C1204Sr) view.findViewById(cIE.b.W);
            C8632dsu.d(c1204Sr);
            dVar.b(c1204Sr, map.get(label.styleId()), f);
            c1204Sr.setText(str);
            c1204Sr.setContentDescription(str);
            hashMap2 = hashMap;
            C5794cIp.a.e(interfaceC9638uF, c1204Sr, hashMap2.get(label.assetId()), new b(), moment);
        } else {
            hashMap2 = hashMap;
        }
        ImageElement leftCap = children.leftCap();
        if (leftCap != null) {
            NetflixImageView netflixImageView2 = (NetflixImageView) view.findViewById(cIE.b.V);
            C8632dsu.d(netflixImageView2);
            dVar.b(netflixImageView2, map.get(leftCap.styleId()), f);
            netflixImageView2.setForeground(null);
            drawable = null;
            C5794cIp.a.a(interfaceC9638uF, netflixImageView2, hashMap2.get(leftCap.assetId()), (r18 & 8) != 0 ? null : null, (r18 & 16) != 0 ? 1.0f : f, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : moment);
        } else {
            drawable = null;
        }
        ImageElement rightCap = children.rightCap();
        if (rightCap != null) {
            NetflixImageView netflixImageView3 = (NetflixImageView) view.findViewById(cIE.b.U);
            C8632dsu.d(netflixImageView3);
            dVar.b(netflixImageView3, map.get(rightCap.styleId()), f);
            netflixImageView3.setForeground(drawable);
            C5794cIp.a.a(interfaceC9638uF, netflixImageView3, hashMap.get(rightCap.assetId()), (r18 & 8) != 0 ? null : null, (r18 & 16) != 0 ? 1.0f : f, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : moment);
        }
    }

    /* renamed from: o.cDw$b */
    /* loaded from: classes4.dex */
    public static final class b implements cIA {
        @Override // o.cIA
        public void b(String str) {
        }

        b() {
        }

        @Override // o.cIA
        public void e(View view) {
            C8632dsu.c((Object) view, "");
            Drawable background = view.getBackground();
            BitmapDrawable bitmapDrawable = background instanceof BitmapDrawable ? (BitmapDrawable) background : null;
            if (bitmapDrawable != null) {
                bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
            }
        }
    }
}
