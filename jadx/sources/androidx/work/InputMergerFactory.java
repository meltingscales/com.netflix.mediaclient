package androidx.work;

/* loaded from: classes.dex */
public abstract class InputMergerFactory {
    public abstract InputMerger createInputMerger(String str);

    public final InputMerger createInputMergerWithDefaultFallback(String str) {
        InputMerger createInputMerger = createInputMerger(str);
        return createInputMerger == null ? InputMerger.fromClassName(str) : createInputMerger;
    }

    public static InputMergerFactory getDefaultInputMergerFactory() {
        return new InputMergerFactory() { // from class: androidx.work.InputMergerFactory.1
            @Override // androidx.work.InputMergerFactory
            public InputMerger createInputMerger(String str) {
                return null;
            }
        };
    }
}
