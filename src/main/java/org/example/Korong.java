package org.example;

import java.util.List;

public class Korong {
    private int méret;
    public Korong(int méret) {
        this.méret = méret;
    }

    public static void átrak(List<Korong> honnan, List<Korong> hova) {
        Korong korong = honnan.get(0);

        if (hova.isEmpty()) {
            hova.add(korong);
            honnan.remove(korong);
        } else {
            if (korong.getMéret() <= hova.get(0).getMéret()) {
                hova.add(0, korong);
                honnan.remove(korong);
            } else {
                System.out.println("nem rakható át");
            }
        }

    }

    @Override
    public String toString() {
        return "Korong{" +
                "méret=" + méret +
                '}';
    }

    private int getMéret() {
        return méret;
    }
}

