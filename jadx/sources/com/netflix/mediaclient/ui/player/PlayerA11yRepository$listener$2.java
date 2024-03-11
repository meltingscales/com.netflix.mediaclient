package com.netflix.mediaclient.ui.player;

import android.view.accessibility.AccessibilityManager;
import com.netflix.mediaclient.ui.player.PlayerA11yRepository;
import com.netflix.mediaclient.ui.player.PlayerA11yRepository$listener$2;
import io.reactivex.subjects.BehaviorSubject;
import kotlin.jvm.internal.Lambda;
import o.C7485cxB;
import o.C8632dsu;
import o.drO;

/* loaded from: classes4.dex */
public final class PlayerA11yRepository$listener$2 extends Lambda implements drO<AccessibilityManager.AccessibilityServicesStateChangeListener> {
    final /* synthetic */ PlayerA11yRepository a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerA11yRepository$listener$2(PlayerA11yRepository playerA11yRepository) {
        super(0);
        this.a = playerA11yRepository;
    }

    @Override // o.drO
    /* renamed from: d */
    public final AccessibilityManager.AccessibilityServicesStateChangeListener invoke() {
        final PlayerA11yRepository playerA11yRepository = this.a;
        return new AccessibilityManager.AccessibilityServicesStateChangeListener() { // from class: o.cxE
            public final void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
                PlayerA11yRepository$listener$2.e(PlayerA11yRepository.this, accessibilityManager);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(PlayerA11yRepository playerA11yRepository, AccessibilityManager accessibilityManager) {
        BehaviorSubject behaviorSubject;
        int c;
        C8632dsu.c((Object) playerA11yRepository, "");
        C8632dsu.c((Object) accessibilityManager, "");
        behaviorSubject = playerA11yRepository.a;
        c = C7485cxB.c(accessibilityManager);
        behaviorSubject.onNext(Integer.valueOf(c));
    }
}
