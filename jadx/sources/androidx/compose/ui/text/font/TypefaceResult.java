package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import o.C8627dsp;

/* loaded from: classes.dex */
public interface TypefaceResult extends State<Object> {
    boolean getCacheable();

    /* loaded from: classes.dex */
    public static final class Immutable implements TypefaceResult {
        private final boolean cacheable;
        private final Object value;

        @Override // androidx.compose.ui.text.font.TypefaceResult
        public boolean getCacheable() {
            return this.cacheable;
        }

        @Override // androidx.compose.runtime.State
        public Object getValue() {
            return this.value;
        }

        public Immutable(Object obj, boolean z) {
            this.value = obj;
            this.cacheable = z;
        }

        public /* synthetic */ Immutable(Object obj, boolean z, int i, C8627dsp c8627dsp) {
            this(obj, (i & 2) != 0 ? true : z);
        }
    }

    /* loaded from: classes.dex */
    public static final class Async implements TypefaceResult {
        private final AsyncFontListLoader current;

        @Override // androidx.compose.runtime.State
        public Object getValue() {
            return this.current.getValue();
        }

        public Async(AsyncFontListLoader asyncFontListLoader) {
            this.current = asyncFontListLoader;
        }

        @Override // androidx.compose.ui.text.font.TypefaceResult
        public boolean getCacheable() {
            return this.current.getCacheable$ui_text_release();
        }
    }
}
