package o;

import java.util.List;

/* loaded from: classes3.dex */
public final class VP {
    public static final VP c = new VP();
    private static final List<String> e;

    public final List<String> b() {
        return e;
    }

    private VP() {
    }

    static {
        List<String> j;
        j = C8569dql.j("https://assets.nflxext.com/us/android/51670/assets/dpad_border.webp", "https://assets.nflxext.com/us/android/51670/assets/grid_background.webp", "https://assets.nflxext.com/us/android/51670/assets/binoculars.webp", "https://assets.nflxext.com/us/android/51670/assets/inner_background_circle.webp", "https://assets.nflxext.com/us/android/51670/assets/outer_background_circle.webp");
        e = j;
    }
}
