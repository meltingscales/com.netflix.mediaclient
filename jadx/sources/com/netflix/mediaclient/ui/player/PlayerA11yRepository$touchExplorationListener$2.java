package com.netflix.mediaclient.ui.player;

import android.view.accessibility.AccessibilityManager;
import com.netflix.mediaclient.ui.player.PlayerA11yRepository;
import com.netflix.mediaclient.ui.player.PlayerA11yRepository$touchExplorationListener$2;
import io.reactivex.subjects.BehaviorSubject;
import kotlin.jvm.internal.Lambda;
import o.C7485cxB;
import o.C8632dsu;
import o.drO;

/* loaded from: classes4.dex */
public final class PlayerA11yRepository$touchExplorationListener$2 extends Lambda implements drO<AccessibilityManager.TouchExplorationStateChangeListener> {
    final /* synthetic */ PlayerA11yRepository c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerA11yRepository$touchExplorationListener$2(PlayerA11yRepository playerA11yRepository) {
        super(0);
        this.c = playerA11yRepository;
    }

    @Override // o.drO
    /* renamed from: c */
    public final AccessibilityManager.TouchExplorationStateChangeListener invoke() {
        final PlayerA11yRepository playerA11yRepository = this.c;
        return new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: o.cxC
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                PlayerA11yRepository$touchExplorationListener$2.a(PlayerA11yRepository.this, z);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(PlayerA11yRepository playerA11yRepository, boolean z) {
        BehaviorSubject behaviorSubject;
        AccessibilityManager a;
        int c;
        C8632dsu.c((Object) playerA11yRepository, "");
        behaviorSubject = playerA11yRepository.a;
        a = playerA11yRepository.a();
        c = C7485cxB.c(a);
        behaviorSubject.onNext(Integer.valueOf(c));
    }
}
