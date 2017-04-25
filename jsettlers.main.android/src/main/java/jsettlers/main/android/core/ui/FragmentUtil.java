package jsettlers.main.android.core.ui;

import jsettlers.main.android.R;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 * Created by tingl on 27/05/2016.
 */
public class FragmentUtil {
	public static void setActionBar(Fragment fragment, View view) {
		AppCompatActivity activity = (AppCompatActivity) fragment.getActivity();
		activity.setSupportActionBar((Toolbar) view.findViewById(R.id.toolbar));
	}

	public static void setDisplayHomeAsUpEnabled(Fragment fragment, boolean enabled) {
		AppCompatActivity activity = (AppCompatActivity) fragment.getActivity();
		activity.getSupportActionBar().setDisplayHomeAsUpEnabled(enabled);
	}
}
