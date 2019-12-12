package test;

import java.util.HashMap;


public class CropRatio {
    private int totalWeight;
    public HashMap<String, Integer> crops = new HashMap<String, Integer>();

    public void add(String name, int cropWeight) {
        crops.put(name, cropWeight + crops.getOrDefault(name, 0));
        totalWeight += cropWeight;
    }

    public double proportion(String name) {
        if (crops.get(name) == null) {
            return 0;
        }
        return (double) crops.get(name) / totalWeight;
    }

    public static void main(String[] args) {
        CropRatio cropRatio = new CropRatio();

        cropRatio.add("Wheat", 4);
        cropRatio.add("Wheat", 5);
        cropRatio.add("Rice", 0);
        System.out.println(cropRatio.crops);
        System.out.println(cropRatio.totalWeight);

        System.out.println("Fraction of wheat: " + cropRatio.proportion("Rice"));
    }
}
