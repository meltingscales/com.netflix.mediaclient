package o;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import android.widget.FrameLayout;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.util.AccessibilityUtils;
import com.netflix.model.leafs.originals.interactive.Image;
import com.netflix.model.leafs.originals.interactive.ImageAssetId;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.Notification;
import com.netflix.model.leafs.originals.interactive.Style;
import com.netflix.model.leafs.originals.interactive.template.ImageElement;
import com.netflix.model.leafs.originals.interactive.template.SimpleElement;
import com.netflix.model.leafs.originals.interactive.template.TriviaThemeContainer;
import io.reactivex.Observable;
import java.util.HashMap;
import java.util.Map;
import o.cIE;

/* loaded from: classes4.dex */
public final class cCI extends AbstractC5649cDf {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cCI(Observable<C5651cDh> observable, InteractiveMoments interactiveMoments, View view, Moment moment, Notification notification, Map<String, ? extends Style> map, HashMap<String, Image> hashMap, float f, InterfaceC9638uF interfaceC9638uF) {
        super(observable, interactiveMoments, moment, map, hashMap, f, interfaceC9638uF, false, 128, null);
        Notification.NotificationChildren children;
        TriviaThemeContainer themeContainer;
        ImageElement backgroundImage;
        C1204Sr c1204Sr;
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) interactiveMoments, "");
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) moment, "");
        C8632dsu.c((Object) notification, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) hashMap, "");
        C8632dsu.c((Object) interfaceC9638uF, "");
        view.setTag(notification.id());
        AbstractC5649cDf.a(this, view, notification, null, null, 12, null);
        view.setContentDescription(moment.accessibilityDescription(interactiveMoments));
        Context context = view.getContext();
        C8632dsu.a(context, "");
        AccessibilityUtils.b(context, view.getContentDescription());
        FrameLayout frameLayout = (FrameLayout) view.findViewById(cIE.b.ch);
        if (frameLayout == null || (children = notification.children()) == null || (themeContainer = children.themeContainer()) == null) {
            return;
        }
        C8632dsu.d(themeContainer);
        AbstractC5649cDf.a(this, frameLayout, themeContainer, null, null, 12, null);
        TriviaThemeContainer.TriviaThemeContainerChildren children2 = themeContainer.children();
        if (children2 == null || (backgroundImage = children2.backgroundImage()) == null) {
            return;
        }
        SimpleElement label = children2.label();
        if (label != null && (c1204Sr = (C1204Sr) frameLayout.findViewById(cIE.b.bM)) != null) {
            C8632dsu.d(c1204Sr);
            Spanned c = c(themeContainer.id());
            c1204Sr.setText(c == null ? c(label.id()) : c);
            C8632dsu.d(label);
            AbstractC5649cDf.a(this, c1204Sr, label, null, null, 12, null);
        }
        NetflixImageView netflixImageView = (NetflixImageView) frameLayout.findViewById(cIE.b.bN);
        if (netflixImageView != null) {
            C8632dsu.d(backgroundImage);
            AbstractC5649cDf.a(this, netflixImageView, backgroundImage, null, null, 12, null);
            C5794cIp c5794cIp = C5794cIp.a;
            ImageAssetId image = moment.image();
            c5794cIp.a(interfaceC9638uF, netflixImageView, hashMap.get(image != null ? image.assetId() : null), (r18 & 8) != 0 ? null : null, (r18 & 16) != 0 ? 1.0f : f, (r18 & 32) != 0 ? null : new d(frameLayout), (r18 & 64) != 0 ? null : moment);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements cIA {
        final /* synthetic */ FrameLayout c;

        d(FrameLayout frameLayout) {
            this.c = frameLayout;
        }

        @Override // o.cIA
        public void b(String str) {
            C1204Sr c1204Sr = (C1204Sr) this.c.findViewById(cIE.b.bM);
            if (c1204Sr == null) {
                return;
            }
            c1204Sr.setVisibility(0);
        }

        @Override // o.cIA
        public void e(View view) {
            C8632dsu.c((Object) view, "");
            C1204Sr c1204Sr = (C1204Sr) this.c.findViewById(cIE.b.bM);
            if (c1204Sr == null) {
                return;
            }
            c1204Sr.setVisibility(0);
        }
    }
}
