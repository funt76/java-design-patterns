package com.iluwatar.observer.generic;

import com.iluwatar.observer.EWeatherType;

public class GHobbits implements IRace {
    @Override
    public void update(GWeather weather, EWeatherType weatherType) {
        switch (weatherType) {
            case COLD:
                System.out.println("The hobbits are shivering in the cold weather.");
                break;
            case RAINY:
                System.out.println("The hobbits look for cover from the rain.");
                break;
            case SUNNY:
                System.out.println("The happy hobbits bade in the warm sun.");
                break;
            case WINDY:
                System.out.println("The hobbits hold their hats tightly in the windy weather.");
                break;
            default:
                break;
        }
    }
}
