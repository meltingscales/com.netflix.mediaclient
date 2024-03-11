package androidx.compose.ui.platform;

import androidx.compose.ui.node.RootForTest;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public interface ViewRootForTest extends RootForTest {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static drM<? super ViewRootForTest, dpR> onViewCreatedCallback;

        public final drM<ViewRootForTest, dpR> getOnViewCreatedCallback() {
            return onViewCreatedCallback;
        }

        private Companion() {
        }
    }
}
