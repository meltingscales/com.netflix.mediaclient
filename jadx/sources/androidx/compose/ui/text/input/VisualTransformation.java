package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.VisualTransformation;

/* loaded from: classes.dex */
public interface VisualTransformation {
    public static final Companion Companion = Companion.$$INSTANCE;

    TransformedText filter(AnnotatedString annotatedString);

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final VisualTransformation None = new VisualTransformation() { // from class: androidx.compose.ui.text.input.VisualTransformation$Companion$$ExternalSyntheticLambda0
            @Override // androidx.compose.ui.text.input.VisualTransformation
            public final TransformedText filter(AnnotatedString annotatedString) {
                TransformedText None$lambda$0;
                None$lambda$0 = VisualTransformation.Companion.None$lambda$0(annotatedString);
                return None$lambda$0;
            }
        };

        public final VisualTransformation getNone() {
            return None;
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TransformedText None$lambda$0(AnnotatedString annotatedString) {
            return new TransformedText(annotatedString, OffsetMapping.Companion.getIdentity());
        }
    }
}
