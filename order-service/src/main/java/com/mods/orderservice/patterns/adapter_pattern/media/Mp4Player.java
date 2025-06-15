package com.mods.orderservice.patterns.adapter_pattern.media;

public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        // do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Play mp4 file. Name: " + fileName);
    }
}
