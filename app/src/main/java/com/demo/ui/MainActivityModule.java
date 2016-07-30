package com.demo.ui;

import com.demo.DemoappModule;

import dagger.Module;

@Module(
    addsTo = DemoappModule.class
)
public final class MainActivityModule {
  private final MainActivity mainActivity;

  MainActivityModule(MainActivity mainActivity) {
    this.mainActivity = mainActivity;
  }

}
