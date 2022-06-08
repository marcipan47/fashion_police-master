package com.example.fashion_police;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class FashionPoliceApplication {
    static final String WHITE = "white";
    static final String BLACK = "black";
    final String ORANGE = "orange";
    final String YELLOW = "yellow";
    final String PURPLE = "purple";
    final String GREEN = "green";
    final String SILVER = "silver";
    final String MARRON = "marron";
    final String BEIGE = "beige";
    final String FUCHSIA = "fuchsia";
    final String OLIVE = "olive";
    final String BROWN = "orown";

    static final public Map<String, ArrayList<Integer>> outfitcolors = new HashMap<>();
    static final public Map<String, ArrayList<String>> colorstab = new HashMap<>();

    public static void main(String[] args) {
        outfitcolors.put("aqua", new ArrayList<>(Arrays.asList(0,255,255)));
        outfitcolors.put(BLACK, new ArrayList<>(Arrays.asList(0,0,0)));
        outfitcolors.put("blue", new ArrayList<>(Arrays.asList(0,0,255)));
        outfitcolors.put("fuchsia", new ArrayList<>(Arrays.asList(255,0,255)));
        outfitcolors.put("green", new ArrayList<>(Arrays.asList(0,128,0)));
        outfitcolors.put("grey", new ArrayList<>(Arrays.asList(128,128,128)));
        outfitcolors.put("lime", new ArrayList<>(Arrays.asList(0,255,0)));
        outfitcolors.put("maroon", new ArrayList<>(Arrays.asList(128,0,0)));
        outfitcolors.put("navy", new ArrayList<>(Arrays.asList(0,0,128)));
        outfitcolors.put("olive", new ArrayList<>(Arrays.asList(128,128,0)));
        outfitcolors.put("purple", new ArrayList<>(Arrays.asList(128,0,128)));
        outfitcolors.put("red", new ArrayList<>(Arrays.asList(255,0,0)));
        outfitcolors.put("silver", new ArrayList<>(Arrays.asList(192,192,192)));
        outfitcolors.put("teal", new ArrayList<>(Arrays.asList(0,128,128)));
        outfitcolors.put(WHITE, new ArrayList<>(Arrays.asList(255,255,255)));
        outfitcolors.put("yellow", new ArrayList<>(Arrays.asList(255,255,0)));
        outfitcolors.put("orange", new ArrayList<>(Arrays.asList(255,165,0)));
        outfitcolors.put("pink", new ArrayList<>(Arrays.asList(255,192,203)));
        outfitcolors.put("beige", new ArrayList<>(Arrays.asList(209, 188, 138)));
        outfitcolors.put("brown", new ArrayList<>(Arrays.asList(153, 51, 0)));
        colorstab.put("aqua", new ArrayList<>(Arrays.asList("aqua","blue","red","maroon","beige","pink","navy","orange","purple", WHITE,"silver", BLACK)));
        colorstab.put(BLACK, new ArrayList<>(Arrays.asList(BLACK, WHITE,"aqua","blue","fuchsia", "pink","green","grey","beige","lime","maroon","navy", "olive", "purple", "red", "silver", "teal", "yellow", "orange")));
        colorstab.put("blue", new ArrayList<>(Arrays.asList("blue","aqua","red","maroon","beige","navy","orange","pink","purple", WHITE,"silver", BLACK)));
        colorstab.put("fuchsia", new ArrayList<>(Arrays.asList("fuchsia","lime","green","pink", "purple","aqua","blue","yellow","orange","navy","silver",WHITE, BLACK)));
        colorstab.put("green", new ArrayList<>(Arrays.asList("green","yellow","lime","fuchsia", "pink","purple","navy","red","orange","maroon", WHITE, BLACK)));
        colorstab.put("grey", new ArrayList<>(Arrays.asList("grey", BLACK,"green","red","navy","fuchsia", "pink","yellow","blue","teal", WHITE,"silver")));
        colorstab.put("lime", new ArrayList<>(Arrays.asList("lime","green","fuchsia","purple", "pink","yellow","silver","grey","orange","navy", WHITE, BLACK)));
        colorstab.put("maroon", new ArrayList<>(Arrays.asList("maroon","teal","red","grey","silver","yellow","orange", WHITE, BLACK)));
        colorstab.put("navy", new ArrayList<>(Arrays.asList("navy","red","grey","olive","maroon", "beige","silver", WHITE, BLACK)));
        colorstab.put("olive", new ArrayList<>(Arrays.asList("olive","fuchsia","purple","orange","beige","yellow","lime","teal","maroon", WHITE, BLACK)));
        colorstab.put("purple", new ArrayList<>(Arrays.asList("purple", "olive", "yellow","orange", "green", "pink", "teal", "silver", WHITE, BLACK)));
        colorstab.put("red", new ArrayList<>(Arrays.asList("red","green","blue","navy","yellow","grey","silver","teal","purple", WHITE, BLACK)));
        colorstab.put("silver", new ArrayList<>(Arrays.asList("silver", BLACK,"green","red","navy","pink", "fuchsia","yellow","blue","teal", WHITE,"grey")));
        colorstab.put("teal", new ArrayList<>(Arrays.asList("teal","pink","fuchsia","beige","purple","red","orange","maroon", WHITE, BLACK)));
        colorstab.put(WHITE, new ArrayList<>(Arrays.asList(WHITE, BLACK,"aqua","beige","blue","fuchsia", "pink","green","grey","lime","maroon","navy", "olive", "purple", "red", "silver", "teal", "yellow", "orange")));
        colorstab.put("yellow", new ArrayList<>(Arrays.asList("yellow","green","maroon","purple","fuchsia","navy","orange", WHITE, BLACK)));
        colorstab.put("orange", new ArrayList<>(Arrays.asList("orange","blue","green","purple","maroon",WHITE,"navy","red","teal",BLACK)));
        colorstab.put("beige", new ArrayList<>(Arrays.asList("beige", "teal", "blue", WHITE, "brown", "navy", "pink", "yellow", "aqua", "orange", BLACK)));
        colorstab.put("pink", new ArrayList<>(Arrays.asList("pink", "teal", "lime", "aqua", "purple", "blue", "green", WHITE, BLACK)));
        colorstab.put("brown", new ArrayList<>(Arrays.asList("brown", "teal", "blue", WHITE, "beige", "navy", "pink", "yellow", "aqua", "orange", BLACK)));

        SpringApplication.run(FashionPoliceApplication.class, args);
    }
}
