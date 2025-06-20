package core.basesyntax;

import java.util.Random;

class ColorSupplier {
    private final Random random = new Random();

    public Color getRandomColor() {
        Color[] colors = Color.values();
        return colors[random.nextInt(colors.length)];
    }
}

