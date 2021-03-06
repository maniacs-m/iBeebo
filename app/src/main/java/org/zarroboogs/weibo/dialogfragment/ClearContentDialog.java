
package org.zarroboogs.weibo.dialogfragment;

import org.zarroboogs.weibo.R;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

public class ClearContentDialog extends DialogFragment {

    public interface IClear {
        void clear();
    }

    public ClearContentDialog() {

    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(getString(R.string.are_you_sure)).setMessage(getString(R.string.ask_clear))
                .setPositiveButton(getString(R.string.clear), new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ((IClear) getActivity()).clear();
                    }
                }).setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

        return builder.create();
    }
}
