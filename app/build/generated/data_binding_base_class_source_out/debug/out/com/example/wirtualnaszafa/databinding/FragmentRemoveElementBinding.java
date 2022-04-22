// Generated by view binder compiler. Do not edit!
package com.example.wirtualnaszafa.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.wirtualnaszafa.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentRemoveElementBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView removeElement;

  private FragmentRemoveElementBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView removeElement) {
    this.rootView = rootView;
    this.removeElement = removeElement;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentRemoveElementBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentRemoveElementBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_remove_element, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentRemoveElementBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.remove_element;
      TextView removeElement = ViewBindings.findChildViewById(rootView, id);
      if (removeElement == null) {
        break missingId;
      }

      return new FragmentRemoveElementBinding((ConstraintLayout) rootView, removeElement);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
