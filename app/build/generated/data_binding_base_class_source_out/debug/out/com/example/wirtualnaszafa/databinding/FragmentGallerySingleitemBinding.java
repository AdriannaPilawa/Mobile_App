// Generated by view binder compiler. Do not edit!
package com.example.wirtualnaszafa.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.wirtualnaszafa.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentGallerySingleitemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView displaySavedImg;

  @NonNull
  public final TextView displayTag;

  private FragmentGallerySingleitemBinding(@NonNull LinearLayout rootView,
      @NonNull ImageView displaySavedImg, @NonNull TextView displayTag) {
    this.rootView = rootView;
    this.displaySavedImg = displaySavedImg;
    this.displayTag = displayTag;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentGallerySingleitemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentGallerySingleitemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_gallery_singleitem, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentGallerySingleitemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.display_saved_img;
      ImageView displaySavedImg = ViewBindings.findChildViewById(rootView, id);
      if (displaySavedImg == null) {
        break missingId;
      }

      id = R.id.display_tag;
      TextView displayTag = ViewBindings.findChildViewById(rootView, id);
      if (displayTag == null) {
        break missingId;
      }

      return new FragmentGallerySingleitemBinding((LinearLayout) rootView, displaySavedImg,
          displayTag);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
