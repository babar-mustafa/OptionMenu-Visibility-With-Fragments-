package manager.local.com.optionmenu.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;

import manager.local.com.optionmenu.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class B extends Fragment {
    View view;

    public B() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_b, container, false);
        setHasOptionsMenu(true);
        return view;

    }

    @Override
    public void onPrepareOptionsMenu(Menu menu) {
        menu.findItem(R.id.addNotes).setVisible(false);
        super.onPrepareOptionsMenu(menu);
    }


}
