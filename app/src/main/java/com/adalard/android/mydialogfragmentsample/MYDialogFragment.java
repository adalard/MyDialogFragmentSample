package com.adalard.android.mydialogfragmentsample;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Administrator on 2015/3/9.
 */
public class MYDialogFragment extends DialogFragment {


//    @Override
//    public void show(FragmentManager manager, String tag) {
//
//        AlertDialog.Builder theDialog = new AlertDialog.Builder(getActivity());
//        theDialog.setTitle("Sample Dialog 2");
//        theDialog.setMessage(" i am dialog no 2");
//        theDialog.setPositiveButton("OK",new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                Toast.makeText(getActivity(),"Clicked OK",Toast.LENGTH_SHORT).show();
//            }
//        });
//        super.show(manager, tag);
//    }
//
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder theDialog = new AlertDialog.Builder(getActivity());

        theDialog.setTitle("Sample Dialog");
        theDialog.setMessage("Hello I am a dialog");

        theDialog.setPositiveButton("OK",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(),"Clicked OK", Toast.LENGTH_SHORT).show();
            }
        });

        theDialog.setNegativeButton("Cancel",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(),"Clicked Cancel",Toast.LENGTH_SHORT).show();
            }
        });

        return super.onCreateDialog(savedInstanceState);
    }
}
