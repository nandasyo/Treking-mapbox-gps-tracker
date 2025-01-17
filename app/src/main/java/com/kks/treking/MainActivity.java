package com.kks.treking;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;
import com.mapbox.mapboxsdk.maps.Style;

public class MainActivity extends AppCompatActivity {

   private MapView mapView;

   @Override
   protected void onCreate(@Nullable Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      Mapbox.getInstance(this, "pk.eyJ1IjoibmFuZGFzeW8iLCJhIjoiY2s3MWhoZ2dsMDNrNDNpcDFka3hzY20wbiJ9.D6YOuX3yYuaTFpMNN2fIWg");
      setContentView(R.layout.activity_main);
      mapView = findViewById(R.id.mapView);
      mapView.onCreate(savedInstanceState);
      mapView.getMapAsync(new OnMapReadyCallback() {
         @Override
         public void onMapReady(@NonNull MapboxMap mapboxMap) {
            mapboxMap.setStyle(Style.MAPBOX_STREETS, new Style.OnStyleLoaded() {
               @Override
               public void onStyleLoaded(@NonNull Style style) {

                  // Map is set up and the style has loaded. Now you can add data or make other map adjustments.


               }
            });
         }
      });

   }
   @Override
   public void onStart() {
      super.onStart();
      mapView.onStart();
   }

   @Override
   public void onResume() {
      super.onResume();
      mapView.onResume();
   }

   @Override
   public void onPause() {
      super.onPause();
      mapView.onPause();
   }

   @Override
   public void onStop() {
      super.onStop();
      mapView.onStop();
   }

   @Override
   public void onLowMemory() {
      super.onLowMemory();
      mapView.onLowMemory();
   }

   @Override
   protected void onDestroy() {
      super.onDestroy();
      mapView.onDestroy();
   }

   @Override
   protected void onSaveInstanceState(Bundle outState) {
      super.onSaveInstanceState(outState);
      mapView.onSaveInstanceState(outState);
   }

}
